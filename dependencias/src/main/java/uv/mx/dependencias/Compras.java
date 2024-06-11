package uv.mx.dependencias;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

@Entity
@IdClass(ComprasId.class)
public class Compras {
    @Id
    String folio_seguimiento;
    @Id
    String id_cliente;

    public String getFolio_seguimiento(){
        return folio_seguimiento;
    }

    public void setFolio_seguimiento(String folio){
        this.folio_seguimiento = folio;
    }

    public String getId_cliente(){
        return id_cliente;
    }

    public void setId_cliente(String idCliente){
        this.id_cliente = idCliente;
    }
}
