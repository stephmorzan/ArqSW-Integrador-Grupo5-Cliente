
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
    private final static QName _ConseguirPedidosResponse_QNAME = new QName("http://webservices.com/", "conseguirPedidosResponse");
    private final static QName _CargarABaseDeDatosResponse_QNAME = new QName("http://webservices.com/", "cargarABaseDeDatosResponse");
    private final static QName _ConseguirPedidos_QNAME = new QName("http://webservices.com/", "conseguirPedidos");
    private final static QName _ConseguirProdsResponse_QNAME = new QName("http://webservices.com/", "conseguirProdsResponse");
    private final static QName _ConseguirProds_QNAME = new QName("http://webservices.com/", "conseguirProds");
    private final static QName _MostrarPorCliente_QNAME = new QName("http://webservices.com/", "mostrarPorCliente");
    private final static QName _ConseguirVentasResponse_QNAME = new QName("http://webservices.com/", "conseguirVentasResponse");
    private final static QName _ConseguirVentas_QNAME = new QName("http://webservices.com/", "conseguirVentas");
    private final static QName _CargarABaseDeDatos_QNAME = new QName("http://webservices.com/", "cargarABaseDeDatos");
    private final static QName _LoguearVendedor_QNAME = new QName("http://webservices.com/", "loguearVendedor");
    private final static QName _LoguearVendedorResponse_QNAME = new QName("http://webservices.com/", "loguearVendedorResponse");
    private final static QName _MostrarPorClienteResponse_QNAME = new QName("http://webservices.com/", "mostrarPorClienteResponse");
    private final static QName _CargarALaColaResponse_QNAME = new QName("http://webservices.com/", "cargarALaColaResponse");
    private final static QName _LoguearCliente_QNAME = new QName("http://webservices.com/", "loguearCliente");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CargarABaseDeDatos }
     * 
     */
    public CargarABaseDeDatos createCargarABaseDeDatos() {
        return new CargarABaseDeDatos();
    }

    /**
     * Create an instance of {@link ConseguirVentas }
     * 
     */
    public ConseguirVentas createConseguirVentas() {
        return new ConseguirVentas();
    }

    /**
     * Create an instance of {@link LoguearCliente }
     * 
     */
    public LoguearCliente createLoguearCliente() {
        return new LoguearCliente();
    }

    /**
     * Create an instance of {@link CargarALaColaResponse }
     * 
     */
    public CargarALaColaResponse createCargarALaColaResponse() {
        return new CargarALaColaResponse();
    }

    /**
     * Create an instance of {@link LoguearVendedor }
     * 
     */
    public LoguearVendedor createLoguearVendedor() {
        return new LoguearVendedor();
    }

    /**
     * Create an instance of {@link LoguearVendedorResponse }
     * 
     */
    public LoguearVendedorResponse createLoguearVendedorResponse() {
        return new LoguearVendedorResponse();
    }

    /**
     * Create an instance of {@link MostrarPorClienteResponse }
     * 
     */
    public MostrarPorClienteResponse createMostrarPorClienteResponse() {
        return new MostrarPorClienteResponse();
    }

    /**
     * Create an instance of {@link ConseguirVentasResponse }
     * 
     */
    public ConseguirVentasResponse createConseguirVentasResponse() {
        return new ConseguirVentasResponse();
    }

    /**
     * Create an instance of {@link MostrarPorCliente }
     * 
     */
    public MostrarPorCliente createMostrarPorCliente() {
        return new MostrarPorCliente();
    }

    /**
     * Create an instance of {@link CargarABaseDeDatosResponse }
     * 
     */
    public CargarABaseDeDatosResponse createCargarABaseDeDatosResponse() {
        return new CargarABaseDeDatosResponse();
    }

    /**
     * Create an instance of {@link ConseguirPedidosResponse }
     * 
     */
    public ConseguirPedidosResponse createConseguirPedidosResponse() {
        return new ConseguirPedidosResponse();
    }

    /**
     * Create an instance of {@link ConseguirProds }
     * 
     */
    public ConseguirProds createConseguirProds() {
        return new ConseguirProds();
    }

    /**
     * Create an instance of {@link ConseguirProdsResponse }
     * 
     */
    public ConseguirProdsResponse createConseguirProdsResponse() {
        return new ConseguirProdsResponse();
    }

    /**
     * Create an instance of {@link ConseguirPedidos }
     * 
     */
    public ConseguirPedidos createConseguirPedidos() {
        return new ConseguirPedidos();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ConseguirPedidosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "conseguirPedidosResponse")
    public JAXBElement<ConseguirPedidosResponse> createConseguirPedidosResponse(ConseguirPedidosResponse value) {
        return new JAXBElement<ConseguirPedidosResponse>(_ConseguirPedidosResponse_QNAME, ConseguirPedidosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargarABaseDeDatosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "cargarABaseDeDatosResponse")
    public JAXBElement<CargarABaseDeDatosResponse> createCargarABaseDeDatosResponse(CargarABaseDeDatosResponse value) {
        return new JAXBElement<CargarABaseDeDatosResponse>(_CargarABaseDeDatosResponse_QNAME, CargarABaseDeDatosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConseguirPedidos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "conseguirPedidos")
    public JAXBElement<ConseguirPedidos> createConseguirPedidos(ConseguirPedidos value) {
        return new JAXBElement<ConseguirPedidos>(_ConseguirPedidos_QNAME, ConseguirPedidos.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarPorCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "mostrarPorCliente")
    public JAXBElement<MostrarPorCliente> createMostrarPorCliente(MostrarPorCliente value) {
        return new JAXBElement<MostrarPorCliente>(_MostrarPorCliente_QNAME, MostrarPorCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConseguirVentasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "conseguirVentasResponse")
    public JAXBElement<ConseguirVentasResponse> createConseguirVentasResponse(ConseguirVentasResponse value) {
        return new JAXBElement<ConseguirVentasResponse>(_ConseguirVentasResponse_QNAME, ConseguirVentasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConseguirVentas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "conseguirVentas")
    public JAXBElement<ConseguirVentas> createConseguirVentas(ConseguirVentas value) {
        return new JAXBElement<ConseguirVentas>(_ConseguirVentas_QNAME, ConseguirVentas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargarABaseDeDatos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "cargarABaseDeDatos")
    public JAXBElement<CargarABaseDeDatos> createCargarABaseDeDatos(CargarABaseDeDatos value) {
        return new JAXBElement<CargarABaseDeDatos>(_CargarABaseDeDatos_QNAME, CargarABaseDeDatos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoguearVendedor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "loguearVendedor")
    public JAXBElement<LoguearVendedor> createLoguearVendedor(LoguearVendedor value) {
        return new JAXBElement<LoguearVendedor>(_LoguearVendedor_QNAME, LoguearVendedor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoguearVendedorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "loguearVendedorResponse")
    public JAXBElement<LoguearVendedorResponse> createLoguearVendedorResponse(LoguearVendedorResponse value) {
        return new JAXBElement<LoguearVendedorResponse>(_LoguearVendedorResponse_QNAME, LoguearVendedorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarPorClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "mostrarPorClienteResponse")
    public JAXBElement<MostrarPorClienteResponse> createMostrarPorClienteResponse(MostrarPorClienteResponse value) {
        return new JAXBElement<MostrarPorClienteResponse>(_MostrarPorClienteResponse_QNAME, MostrarPorClienteResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LoguearCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "loguearCliente")
    public JAXBElement<LoguearCliente> createLoguearCliente(LoguearCliente value) {
        return new JAXBElement<LoguearCliente>(_LoguearCliente_QNAME, LoguearCliente.class, null, value);
    }

}
