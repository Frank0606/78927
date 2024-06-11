package uv.mx.dependencias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import xx.mx.uv.consumo.wsdl.CancelarCompraResponse;
import xx.mx.uv.consumo.wsdl.EstadoCompraResponse;
import xx.mx.uv.consumo.wsdl.RecibirCompraResponse;

@SpringBootApplication
public class dependenciaApplication {

    @Autowired
    private ICompras icompras;

    public static void main(String[] args) {
        SpringApplication.run(dependenciaApplication.class, args);
    }

    @Bean
    public CommandLineRunner ejecutar(ClaseCliente cliente) {
        return hacerCompra -> {

            String nombre_cliente = "Francisco";
            String email_cliente = "Correo1@correo.com";
            String direccion_cliente = "Calle clavijero";
            String rfc_cliente = "SANF020725";
            String nombre_producto = "Toalla";
            int cantidad_producto = 2;
            double precio_producto = 55.60;

            if (hacerCompra.length > 0) {
                nombre_cliente = hacerCompra[0];
                email_cliente = hacerCompra[1];
                direccion_cliente = hacerCompra[2];
                rfc_cliente = hacerCompra[3];
                nombre_producto = hacerCompra[4];
                cantidad_producto = Integer.parseInt(hacerCompra[5]);
                precio_producto = Double.parseDouble(hacerCompra[6]);
            }

            RecibirCompraResponse sr = cliente.hacerCompra(nombre_cliente, email_cliente, direccion_cliente, rfc_cliente, nombre_producto, cantidad_producto, precio_producto);
            
            Compras compra = new Compras();
            compra.setFolio_seguimiento(sr.getFolioSeguimiento());
            compra.setId_cliente(nombre_cliente);
            icompras.save(compra);

            System.err.println("Su folio de compra es: " + sr.getFolioSeguimiento());
        };

        // return estadoCompra -> {

        // 	String folio_seguimiento = "24102K";

        // 	if(estadoCompra.length > 0){
        // 		folio_seguimiento = estadoCompra[0];
        // 	}

        // 	EstadoCompraResponse ec = cliente.estadoCompra(folio_seguimiento);

        // 	System.err.println(ec.getRespuesta());
        // };

        // return cancelarCompra -> {

        // 	String folio_seguimiento = "24102K";

        // 	if(cancelarCompra.length > 0){
        // 		folio_seguimiento = cancelarCompra[0];
        // 	}

        // 	CancelarCompraResponse cc = cliente.cancelarCompra(folio_seguimiento);

        // 	System.err.println(cc.getRespuesta());
        // };
    }
}
