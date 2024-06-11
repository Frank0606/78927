package uv.mx.dependencias;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import xx.mx.uv.consumo.wsdl.CancelarCompraRequest;
import xx.mx.uv.consumo.wsdl.CancelarCompraResponse;
import xx.mx.uv.consumo.wsdl.EstadoCompraRequest;
import xx.mx.uv.consumo.wsdl.EstadoCompraResponse;
import xx.mx.uv.consumo.wsdl.RecibirCompraRequest;
import xx.mx.uv.consumo.wsdl.RecibirCompraResponse;

public class ClaseCliente extends WebServiceGatewaySupport {

    public RecibirCompraResponse hacerCompra(String nombre_cliente, String email_cliente, String direccion_cliente, String rfc_cliente, String nombre_producto, int cantidad_producto, double precio_producto) {
        RecibirCompraRequest solicitarCompra = new RecibirCompraRequest();

        solicitarCompra.setNombreCliente(nombre_cliente);
        solicitarCompra.setEmail(email_cliente);
        solicitarCompra.setDireccion(direccion_cliente);
        solicitarCompra.setRfc(rfc_cliente);
        solicitarCompra.setNombreProducto(nombre_producto);
        solicitarCompra.setCantidadProducto(cantidad_producto);
        solicitarCompra.setPrecioProducto(precio_producto);

        RecibirCompraResponse respuesta = (RecibirCompraResponse)

        getWebServiceTemplate().marshalSendAndReceive(
                "https://compras-production-e1a8.up.railway.app/ws/compras", 
                solicitarCompra,
                new SoapActionCallback("https://compras-production-e1a8.up.railway.app/ws/compras")
        );
                
        return respuesta;
    }

    public EstadoCompraResponse estadoCompra(String folio_seguimiento){
        EstadoCompraRequest verEstado = new EstadoCompraRequest();

        verEstado.setFolio(folio_seguimiento);

        EstadoCompraResponse respuesta = (EstadoCompraResponse)
        getWebServiceTemplate().marshalSendAndReceive(
                "https://compras-production-e1a8.up.railway.app/ws/compras", 
                verEstado,
                new SoapActionCallback("https://compras-production-e1a8.up.railway.app/ws/compras")
        );

        return respuesta;
    }

    public CancelarCompraResponse cancelarCompra(String folio_seguimiento){
        CancelarCompraRequest cancelar = new CancelarCompraRequest();

        cancelar.setFolio(folio_seguimiento);

        CancelarCompraResponse respuesta = (CancelarCompraResponse)
        getWebServiceTemplate().marshalSendAndReceive(
                "https://compras-production-e1a8.up.railway.app/ws/compras", 
                cancelar,
                new SoapActionCallback("https://compras-production-e1a8.up.railway.app/ws/compras")
        );

        return respuesta;
    }
}
