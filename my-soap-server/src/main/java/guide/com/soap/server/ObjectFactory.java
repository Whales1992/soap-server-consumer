//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.03 at 01:44:26 AM WAT 
//


package guide.com.soap.server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the guide.com.soap.server package. 
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

    private final static QName _GetAllCountryRequest_QNAME = new QName("http://com.guide/soap/server", "getAllCountryRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: guide.com.soap.server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link VendResponse }
     * 
     */
    public VendResponse createVendResponse() {
        return new VendResponse();
    }

    /**
     * Create an instance of {@link GetCountryRequest }
     * 
     */
    public GetCountryRequest createGetCountryRequest() {
        return new GetCountryRequest();
    }

    /**
     * Create an instance of {@link GetCountryByCurrencyRequest }
     * 
     */
    public GetCountryByCurrencyRequest createGetCountryByCurrencyRequest() {
        return new GetCountryByCurrencyRequest();
    }

    /**
     * Create an instance of {@link GetAllCountryResponse }
     * 
     */
    public GetAllCountryResponse createGetAllCountryResponse() {
        return new GetAllCountryResponse();
    }

    /**
     * Create an instance of {@link Vend }
     * 
     */
    public Vend createVend() {
        return new Vend();
    }

    /**
     * Create an instance of {@link GetCountryByCurrencyResponse }
     * 
     */
    public GetCountryByCurrencyResponse createGetCountryByCurrencyResponse() {
        return new GetCountryByCurrencyResponse();
    }

    /**
     * Create an instance of {@link GetCountryResponse }
     * 
     */
    public GetCountryResponse createGetCountryResponse() {
        return new GetCountryResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.guide/soap/server", name = "getAllCountryRequest")
    public JAXBElement<Object> createGetAllCountryRequest(Object value) {
        return new JAXBElement<Object>(_GetAllCountryRequest_QNAME, Object.class, null, value);
    }

}
