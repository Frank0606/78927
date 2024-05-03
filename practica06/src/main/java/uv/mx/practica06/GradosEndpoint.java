package uv.mx.practica06;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import mx.uv.t4is.grados.CelsiusToFahrenheitRequest;
import mx.uv.t4is.grados.CelsiusToFahrenheitResponse;
import mx.uv.t4is.grados.FahrenheitToCelsiusRequest;
import mx.uv.t4is.grados.FahrenheitToCelsiusResponse;

@Endpoint
public class GradosEndpoint {
    
    @PayloadRoot(localPart = "CelsiusToFahrenheitRequest", namespace = "t4is.uv.mx/grados")
    @ResponsePayload
    public CelsiusToFahrenheitResponse CelsiusFahreheit(@RequestPayload CelsiusToFahrenheitRequest celsius) {
        CelsiusToFahrenheitResponse fahrenheit = new CelsiusToFahrenheitResponse();
        fahrenheit.setFahrenheit((celsius.getCelsius() * 1.8) + 32);
        return fahrenheit;
    }

    @PayloadRoot(localPart = "FahrenheitToCelsiusRequest", namespace = "t4is.uv.mx/grados")
    @ResponsePayload
    public FahrenheitToCelsiusResponse BuscarSaludos(@RequestPayload FahrenheitToCelsiusRequest fahrenheit) {
        FahrenheitToCelsiusResponse celsius = new FahrenheitToCelsiusResponse();
        celsius.setCelsius((fahrenheit.getFahrenheit() - 32) * 0.5555556);
        return celsius;
    }
}
