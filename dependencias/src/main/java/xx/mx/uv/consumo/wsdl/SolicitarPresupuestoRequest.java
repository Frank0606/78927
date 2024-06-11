
package xx.mx.uv.consumo.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cantidad_necesaria" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cantidadNecesaria"
})
@XmlRootElement(name = "SolicitarPresupuestoRequest")
public class SolicitarPresupuestoRequest {

    @XmlElement(name = "cantidad_necesaria")
    protected double cantidadNecesaria;

    /**
     * Obtiene el valor de la propiedad cantidadNecesaria.
     * 
     */
    public double getCantidadNecesaria() {
        return cantidadNecesaria;
    }

    /**
     * Define el valor de la propiedad cantidadNecesaria.
     * 
     */
    public void setCantidadNecesaria(double value) {
        this.cantidadNecesaria = value;
    }

}
