package mx.uv.practica05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import mx.uv.t4is.saludos.BuscarSaludosResponse;
import mx.uv.t4is.saludos.SaludarRequest;
import mx.uv.t4is.saludos.SaludarResponse;
import mx.uv.t4is.saludos.BuscarSaludosResponse.Saludos;

@Endpoint
public class SaludosEndpoint {

    private final List<Saludos> listSaludos = new ArrayList<>();

    private final Random random = new Random();

    @PayloadRoot(localPart = "SaludarRequest", namespace = "t4is.uv.mx/saludos")
    @ResponsePayload
    public SaludarResponse Saludar(@RequestPayload SaludarRequest peticion) {
        SaludarResponse saludo = new SaludarResponse();
        saludo.setRespuesta("Hola " + peticion.getNombre());

        Saludos saludoElem = new Saludos();
        saludoElem.setId(random.nextInt());
        saludoElem.setNombre(peticion.getNombre());
        listSaludos.add(saludoElem);

        return saludo;
    }

    @PayloadRoot(localPart = "BuscarSaludosRequest", namespace = "t4is.uv.mx/saludos")
    @ResponsePayload
    public BuscarSaludosResponse BuscarSaludos() {
        BuscarSaludosResponse respuesta = new BuscarSaludosResponse();
        respuesta.getSaludos().addAll(listSaludos);
        return respuesta;
    }
}