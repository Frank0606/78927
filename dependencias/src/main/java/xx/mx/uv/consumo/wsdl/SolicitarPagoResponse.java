
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
 *         &lt;element name="pago_status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "pagoStatus",
    "status"
})
@XmlRootElement(name = "SolicitarPagoResponse")
public class SolicitarPagoResponse {

    @XmlElement(name = "pago_status", required = true)
    protected String pagoStatus;
    protected boolean status;

    /**
     * Obtiene el valor de la propiedad pagoStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagoStatus() {
        return pagoStatus;
    }

    /**
     * Define el valor de la propiedad pagoStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagoStatus(String value) {
        this.pagoStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     */
    public void setStatus(boolean value) {
        this.status = value;
    }

}
