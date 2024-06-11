package uv.mx.dependencias;

import java.io.Serializable;
import java.util.Objects;

public class ComprasId implements Serializable {
    private String folio_seguimiento;
    private String id_cliente;

    public ComprasId() {
    }

    public ComprasId(String folio_seguimiento, String id_cliente) {
        this.folio_seguimiento = folio_seguimiento;
        this.id_cliente = id_cliente;
    }

    // Getters, setters, equals, and hashCode methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComprasId that = (ComprasId) o;
        return Objects.equals(folio_seguimiento, that.folio_seguimiento) && Objects.equals(id_cliente, that.id_cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(folio_seguimiento, id_cliente);
    }
}
