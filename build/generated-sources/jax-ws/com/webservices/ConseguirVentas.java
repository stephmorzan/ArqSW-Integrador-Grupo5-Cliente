
package com.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para conseguirVentas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="conseguirVentas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idpedido" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conseguirVentas", propOrder = {
    "idpedido"
})
public class ConseguirVentas {

    protected int idpedido;

    /**
     * Obtiene el valor de la propiedad idpedido.
     * 
     */
    public int getIdpedido() {
        return idpedido;
    }

    /**
     * Define el valor de la propiedad idpedido.
     * 
     */
    public void setIdpedido(int value) {
        this.idpedido = value;
    }

}
