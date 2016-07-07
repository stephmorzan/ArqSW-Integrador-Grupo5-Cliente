
package com.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para loguearVendedor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="loguearVendedor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuarioAdm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loguearVendedor", propOrder = {
    "usuarioAdm",
    "clave"
})
public class LoguearVendedor {

    protected String usuarioAdm;
    protected String clave;

    /**
     * Obtiene el valor de la propiedad usuarioAdm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioAdm() {
        return usuarioAdm;
    }

    /**
     * Define el valor de la propiedad usuarioAdm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioAdm(String value) {
        this.usuarioAdm = value;
    }

    /**
     * Obtiene el valor de la propiedad clave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClave() {
        return clave;
    }

    /**
     * Define el valor de la propiedad clave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClave(String value) {
        this.clave = value;
    }

}
