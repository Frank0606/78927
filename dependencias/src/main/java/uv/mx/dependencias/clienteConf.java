package uv.mx.dependencias;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class clienteConf {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("xx.mx.uv.consumo.wsdl");
        return marshaller;
    }

    @Bean
    public ClaseCliente cliente(Jaxb2Marshaller marshaller) throws Exception {
        ClaseCliente c = new ClaseCliente();
        c.setDefaultUri("https://compras-production-e1a8.up.railway.app/ws/compras");
        c.setMarshaller(marshaller);
        c.setUnmarshaller(marshaller);
        return c;
    }
}