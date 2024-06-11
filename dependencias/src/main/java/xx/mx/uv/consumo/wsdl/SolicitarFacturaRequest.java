
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
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="forma_pago" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="subtotal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="regimen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="domicilio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="valor_unitario" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
    "fecha",
    "formaPago",
    "subtotal",
    "nombre",
    "cantidad",
    "precio",
    "regimen",
    "domicilio",
    "descripcion",
    "valorUnitario"
})
@XmlRootElement(name = "SolicitarFacturaRequest")
public class SolicitarFacturaRequest {

    @XmlElement(required = true)
    protected String fecha;
    @XmlElement(name = "forma_pago", required = true)
    protected String formaPago;
    protected double subtotal;
    @XmlElement(required = true)
    protected String nombre;
    protected int cantidad;
    protected double precio;
    @XmlElement(required = true)
    protected String regimen;
    @XmlElement(required = true)
    protected String domicilio;
    @XmlElement(required = true)
    protected String descripcion;
    @XmlElement(name = "valor_unitario")
    protected double valorUnitario;

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad formaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaPago() {
        return formaPago;
    }

    /**
     * Define el valor de la propiedad formaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaPago(String value) {
        this.formaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad subtotal.
     * 
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * Define el valor de la propiedad subtotal.
     * 
     */
    public void setSubtotal(double value) {
        this.subtotal = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     */
    public void setPrecio(double value) {
        this.precio = value;
    }

    /**
     * Obtiene el valor de la propiedad regimen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegimen() {
        return regimen;
    }

    /**
     * Define el valor de la propiedad regimen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegimen(String value) {
        this.regimen = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * Define el valor de la propiedad domicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomicilio(String value) {
        this.domicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad valorUnitario.
     * 
     */
    public double getValorUnitario() {
        return valorUnitario;
    }

    /**
     * Define el valor de la propiedad valorUnitario.
     * 
     */
    public void setValorUnitario(double value) {
        this.valorUnitario = value;
    }

}
