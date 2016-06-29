
package com.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LoguearClienteResponse_QNAME = new QName("http://webservices.com/", "loguearClienteResponse");
    private final static QName _CargarALaCola_QNAME = new QName("http://webservices.com/", "cargarALaCola");
    private final static QName _CargarALaColaResponse_QNAME = new QName("http://webservices.com/", "cargarALaColaResponse");
    private final static QName _ConseguirProdsResponse_QNAME = new QName("http://webservices.com/", "conseguirProdsResponse");
    private final static QName _ConseguirProds_QNAME = new QName("http://webservices.com/", "conseguirProds");
    private final static QName _LoguearCliente_QNAME = new QName("http://webservices.com/", "loguearCliente");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConseguirProds }
     * 
     */
    public ConseguirProds createConseguirProds() {
        return new ConseguirProds();
    }

    /**
     * Create an instance of {@link LoguearCliente }
     * 
     */
    public LoguearCliente createLoguearCliente() {
        return new LoguearCliente();
    }

    /**
     * Create an instance of {@link ConseguirProdsResponse }
     * 
     */
    public ConseguirProdsResponse createConseguirProdsResponse() {
        return new ConseguirProdsResponse();
    }

    /**
     * Create an instance of {@link CargarALaColaResponse }
     * 
     */
    public CargarALaColaResponse createCargarALaColaResponse() {
        return new CargarALaColaResponse();
    }

    /**
     * Create an instance of {@link CargarALaCola }
     * 
     */
    public CargarALaCola createCargarALaCola() {
        return new CargarALaCola();
    }

    /**
     * Create an instance of {@link LoguearClienteResponse }
     * 
     */
    public LoguearClienteResponse createLoguearClienteResponse() {
        return new LoguearClienteResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoguearClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "loguearClienteResponse")
    public JAXBElement<LoguearClienteResponse> createLoguearClienteResponse(LoguearClienteResponse value) {
        return new JAXBElement<LoguearClienteResponse>(_LoguearClienteResponse_QNAME, LoguearClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargarALaCola }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "cargarALaCola")
    public JAXBElement<CargarALaCola> createCargarALaCola(CargarALaCola value) {
        return new JAXBElement<CargarALaCola>(_CargarALaCola_QNAME, CargarALaCola.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargarALaColaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "cargarALaColaResponse")
    public JAXBElement<CargarALaColaResponse> createCargarALaColaResponse(CargarALaColaResponse value) {
        return new JAXBElement<CargarALaColaResponse>(_CargarALaColaResponse_QNAME, CargarALaColaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConseguirProdsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "conseguirProdsResponse")
    public JAXBElement<ConseguirProdsResponse> createConseguirProdsResponse(ConseguirProdsResponse value) {
        return new JAXBElement<ConseguirProdsResponse>(_ConseguirProdsResponse_QNAME, ConseguirProdsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConseguirProds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "conseguirProds")
    public JAXBElement<ConseguirProds> createConseguirProds(ConseguirProds value) {
        return new JAXBElement<ConseguirProds>(_ConseguirProds_QNAME, ConseguirProds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoguearCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "loguearCliente")
    public JAXBElement<LoguearCliente> createLoguearCliente(LoguearCliente value) {
        return new JAXBElement<LoguearCliente>(_LoguearCliente_QNAME, LoguearCliente.class, null, value);
    }

}
