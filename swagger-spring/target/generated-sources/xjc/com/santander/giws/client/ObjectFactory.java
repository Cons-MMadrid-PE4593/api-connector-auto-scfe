//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
<<<<<<< HEAD
// Generado el: 2022.01.21 a las 03:06:24 PM CET 
=======
// Generado el: 2022.01.21 a las 10:13:17 AM CET 
>>>>>>> 222ac66503026f6f083cacf033572e032beb8412
//


package com.santander.giws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.santander.giws.client package. 
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

    private final static QName _String_QNAME = new QName("https://ficressp.santanderconsumer.com", "string");
    private final static QName _RespuestaINE_QNAME = new QName("https://ficressp.santanderconsumer.com", "RespuestaINE");
    private final static QName _ArrayOfDataType_QNAME = new QName("https://ficressp.santanderconsumer.com", "ArrayOfDataType");
    private final static QName _ArrayOfVehicle_QNAME = new QName("https://ficressp.santanderconsumer.com", "ArrayOfVehicle");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.santander.giws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VerRutaXSD }
     * 
     */
    public VerRutaXSD createVerRutaXSD() {
        return new VerRutaXSD();
    }

    /**
     * Create an instance of {@link VerRutaXSDResponse }
     * 
     */
    public VerRutaXSDResponse createVerRutaXSDResponse() {
        return new VerRutaXSDResponse();
    }

    /**
     * Create an instance of {@link GetINE }
     * 
     */
    public GetINE createGetINE() {
        return new GetINE();
    }

    /**
     * Create an instance of {@link GetINEResponse }
     * 
     */
    public GetINEResponse createGetINEResponse() {
        return new GetINEResponse();
    }

    /**
     * Create an instance of {@link RespuestaINE }
     * 
     */
    public RespuestaINE createRespuestaINE() {
        return new RespuestaINE();
    }

    /**
     * Create an instance of {@link MappingDataTypes }
     * 
     */
    public MappingDataTypes createMappingDataTypes() {
        return new MappingDataTypes();
    }

    /**
     * Create an instance of {@link MappingDataTypesResponse }
     * 
     */
    public MappingDataTypesResponse createMappingDataTypesResponse() {
        return new MappingDataTypesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDataType }
     * 
     */
    public ArrayOfDataType createArrayOfDataType() {
        return new ArrayOfDataType();
    }

    /**
     * Create an instance of {@link GetVehicles }
     * 
     */
    public GetVehicles createGetVehicles() {
        return new GetVehicles();
    }

    /**
     * Create an instance of {@link GetVehiclesResponse }
     * 
     */
    public GetVehiclesResponse createGetVehiclesResponse() {
        return new GetVehiclesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfVehicle }
     * 
     */
    public ArrayOfVehicle createArrayOfVehicle() {
        return new ArrayOfVehicle();
    }

    /**
     * Create an instance of {@link DataType }
     * 
     */
    public DataType createDataType() {
        return new DataType();
    }

    /**
     * Create an instance of {@link Vehicle }
     * 
     */
    public Vehicle createVehicle() {
        return new Vehicle();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://ficressp.santanderconsumer.com", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaINE }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RespuestaINE }{@code >}
     */
    @XmlElementDecl(namespace = "https://ficressp.santanderconsumer.com", name = "RespuestaINE")
    public JAXBElement<RespuestaINE> createRespuestaINE(RespuestaINE value) {
        return new JAXBElement<RespuestaINE>(_RespuestaINE_QNAME, RespuestaINE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDataType }{@code >}
     */
    @XmlElementDecl(namespace = "https://ficressp.santanderconsumer.com", name = "ArrayOfDataType")
    public JAXBElement<ArrayOfDataType> createArrayOfDataType(ArrayOfDataType value) {
        return new JAXBElement<ArrayOfDataType>(_ArrayOfDataType_QNAME, ArrayOfDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVehicle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfVehicle }{@code >}
     */
    @XmlElementDecl(namespace = "https://ficressp.santanderconsumer.com", name = "ArrayOfVehicle")
    public JAXBElement<ArrayOfVehicle> createArrayOfVehicle(ArrayOfVehicle value) {
        return new JAXBElement<ArrayOfVehicle>(_ArrayOfVehicle_QNAME, ArrayOfVehicle.class, null, value);
    }

}
