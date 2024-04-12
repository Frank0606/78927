using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Hosting;
using Microsoft.AspNetCore.Http;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Hosting;

using icalculadora;
using calculadora;
using SoapCore;
using Microsoft.Extensions.DependencyInjection.Extensions;

using imensajes;
using mensajes;

namespace practica03
{
    public class Startup
    {
        public void ConfigureServices(IServiceCollection services)
        {
            services.AddSoapCore();
            services.TryAddSingleton<iCalculadora, Calculadora>();
            services.TryAddSingleton<iMensajes, Mensajes>();
            services.AddMvc();
        }
        public void Configure(IApplicationBuilder app, IWebHostEnvironment env)
        {
            if (env.IsDevelopment())
            {
                app.UseDeveloperExceptionPage();
            }

            app.UseRouting();

            app.UseEndpoints(endpoints => {
				endpoints.UseSoapEndpoint<iCalculadora>("/calculadora.svc", new SoapEncoderOptions(), SoapSerializer.DataContractSerializer);
				endpoints.UseSoapEndpoint<iMensajes>("/mensajes.svc", new SoapEncoderOptions(), SoapSerializer.XmlSerializer);
			});
        }
    }
}