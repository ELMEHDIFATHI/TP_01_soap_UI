
package mypackage;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mypackage package. 
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

    private final static QName _DivisionTwoNumber_QNAME = new QName("http://webservice/", "divisionTwoNumber");
    private final static QName _DivisionTwoNumberResponse_QNAME = new QName("http://webservice/", "divisionTwoNumberResponse");
    private final static QName _MultiplicationTwoNumber_QNAME = new QName("http://webservice/", "multiplicationTwoNumber");
    private final static QName _MultiplicationTwoNumberResponse_QNAME = new QName("http://webservice/", "multiplicationTwoNumberResponse");
    private final static QName _SommeTwoNumber_QNAME = new QName("http://webservice/", "sommeTwoNumber");
    private final static QName _SommeTwoNumberResponse_QNAME = new QName("http://webservice/", "sommeTwoNumberResponse");
    private final static QName _SoustractionTwoNumber_QNAME = new QName("http://webservice/", "soustractionTwoNumber");
    private final static QName _SoustractionTwoNumberResponse_QNAME = new QName("http://webservice/", "soustractionTwoNumberResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DivisionTwoNumber }
     * 
     * @return
     *     the new instance of {@link DivisionTwoNumber }
     */
    public DivisionTwoNumber createDivisionTwoNumber() {
        return new DivisionTwoNumber();
    }

    /**
     * Create an instance of {@link DivisionTwoNumberResponse }
     * 
     * @return
     *     the new instance of {@link DivisionTwoNumberResponse }
     */
    public DivisionTwoNumberResponse createDivisionTwoNumberResponse() {
        return new DivisionTwoNumberResponse();
    }

    /**
     * Create an instance of {@link MultiplicationTwoNumber }
     * 
     * @return
     *     the new instance of {@link MultiplicationTwoNumber }
     */
    public MultiplicationTwoNumber createMultiplicationTwoNumber() {
        return new MultiplicationTwoNumber();
    }

    /**
     * Create an instance of {@link MultiplicationTwoNumberResponse }
     * 
     * @return
     *     the new instance of {@link MultiplicationTwoNumberResponse }
     */
    public MultiplicationTwoNumberResponse createMultiplicationTwoNumberResponse() {
        return new MultiplicationTwoNumberResponse();
    }

    /**
     * Create an instance of {@link SommeTwoNumber }
     * 
     * @return
     *     the new instance of {@link SommeTwoNumber }
     */
    public SommeTwoNumber createSommeTwoNumber() {
        return new SommeTwoNumber();
    }

    /**
     * Create an instance of {@link SommeTwoNumberResponse }
     * 
     * @return
     *     the new instance of {@link SommeTwoNumberResponse }
     */
    public SommeTwoNumberResponse createSommeTwoNumberResponse() {
        return new SommeTwoNumberResponse();
    }

    /**
     * Create an instance of {@link SoustractionTwoNumber }
     * 
     * @return
     *     the new instance of {@link SoustractionTwoNumber }
     */
    public SoustractionTwoNumber createSoustractionTwoNumber() {
        return new SoustractionTwoNumber();
    }

    /**
     * Create an instance of {@link SoustractionTwoNumberResponse }
     * 
     * @return
     *     the new instance of {@link SoustractionTwoNumberResponse }
     */
    public SoustractionTwoNumberResponse createSoustractionTwoNumberResponse() {
        return new SoustractionTwoNumberResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionTwoNumber }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DivisionTwoNumber }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "divisionTwoNumber")
    public JAXBElement<DivisionTwoNumber> createDivisionTwoNumber(DivisionTwoNumber value) {
        return new JAXBElement<>(_DivisionTwoNumber_QNAME, DivisionTwoNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionTwoNumberResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DivisionTwoNumberResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "divisionTwoNumberResponse")
    public JAXBElement<DivisionTwoNumberResponse> createDivisionTwoNumberResponse(DivisionTwoNumberResponse value) {
        return new JAXBElement<>(_DivisionTwoNumberResponse_QNAME, DivisionTwoNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicationTwoNumber }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MultiplicationTwoNumber }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "multiplicationTwoNumber")
    public JAXBElement<MultiplicationTwoNumber> createMultiplicationTwoNumber(MultiplicationTwoNumber value) {
        return new JAXBElement<>(_MultiplicationTwoNumber_QNAME, MultiplicationTwoNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicationTwoNumberResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MultiplicationTwoNumberResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "multiplicationTwoNumberResponse")
    public JAXBElement<MultiplicationTwoNumberResponse> createMultiplicationTwoNumberResponse(MultiplicationTwoNumberResponse value) {
        return new JAXBElement<>(_MultiplicationTwoNumberResponse_QNAME, MultiplicationTwoNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SommeTwoNumber }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SommeTwoNumber }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "sommeTwoNumber")
    public JAXBElement<SommeTwoNumber> createSommeTwoNumber(SommeTwoNumber value) {
        return new JAXBElement<>(_SommeTwoNumber_QNAME, SommeTwoNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SommeTwoNumberResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SommeTwoNumberResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "sommeTwoNumberResponse")
    public JAXBElement<SommeTwoNumberResponse> createSommeTwoNumberResponse(SommeTwoNumberResponse value) {
        return new JAXBElement<>(_SommeTwoNumberResponse_QNAME, SommeTwoNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoustractionTwoNumber }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoustractionTwoNumber }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "soustractionTwoNumber")
    public JAXBElement<SoustractionTwoNumber> createSoustractionTwoNumber(SoustractionTwoNumber value) {
        return new JAXBElement<>(_SoustractionTwoNumber_QNAME, SoustractionTwoNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoustractionTwoNumberResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoustractionTwoNumberResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "soustractionTwoNumberResponse")
    public JAXBElement<SoustractionTwoNumberResponse> createSoustractionTwoNumberResponse(SoustractionTwoNumberResponse value) {
        return new JAXBElement<>(_SoustractionTwoNumberResponse_QNAME, SoustractionTwoNumberResponse.class, null, value);
    }

}
