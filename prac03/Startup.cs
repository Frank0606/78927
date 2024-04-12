using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Hosting;
using Microsoft.AspNetCore.Http;
using Microsoft.Extensions.DependencyInjection;
using SoapCore;
using Microsoft.Extensions.DependencyInjection.Extensions;
using icalculadora;
using calculadora;

namespace soap_test
{
    public class Startup
    {
        public void ConfigureServices(IServiceCollection services)
        {
            services.AddSoapCore();
            services.TryAddSingleton<Mensajes, Operaciones>();
            services addMvc();
        }

        public void Configure(IApplicationBuilder app, Microsoft.Extensions.Hosting.IHostEnvironment env)
        {
            if (env.IsDevelopment())
            {
                app.UseDeveloperExceptionPage();
            }

            app.UseRooting();

            //app.UseEndpoints(endpoints => {
            //    endpoints.UseSoapEndpoints()
            //})

            app.UseEndpoints(endpoints => {
                endpoints.UseSoapEndpoints<ICalculadora>("/Service.svc", new SoapEnconder(Options[]))
            })

            app.Run();
        }
    }
}