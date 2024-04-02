using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Hosting;
using Microsoft.AspNetCore.Http;
using Microsoft.Extensions.DependencyInjection;
using WSDL.operaciones;
using WSDL.mensajes;
using SoapCore;
using Microsoft.Extensions.DependencyInjection.Extensions;

namespace soap_test
{
    public class Startup
    {
        public void ConfigureServices(IServiceCollection services)
        {
            services.TryAddSingleton<Mensajes, Operaciones>();
            services.AddMvc();
        }
        public void Configure(IApplicationBuilder app, Microsoft.Extensions.Hosting.IHostEnvironment env)
        {
            if (env.IsDevelopment())
            {
                app.UseDeveloperExceptionPage();
                app.UseSoapEndpoint<Mensajes>("/soap.asmx", new SoapEncoderOptions(), 
                    SoapSerializer.XmlSerializer);
            }

            app.Run(async (context) =>
            {
                await context.Response.WriteAsync("<a href='/soap.asmx'>Para consumir, da click aqui</a>");
            });
        }
    }
}