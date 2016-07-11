
package com.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para mostrarPorCliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="mostrarPorCliente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idcliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mostrarPorCliente", propOrder = {
    "idcliente"
})
public class MostrarPorCliente {

    protected String idcliente;

    /**
     * Obtiene el valor de la propiedad idcliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcliente() {
        return idcliente;
    }

    /**
     * Define el valor de la propiedad idcliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcliente(String value) {
        this.idcliente = value;
    }

}
