//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.01.26 a las 06:56:51 PM CET 
//


package io.swagger.model.giws.submitthirdparties;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.swagger.model.giws.submitthirdparties package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.swagger.model.giws.submitthirdparties
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Envelope }
     * 
     */
    public Envelope createEnvelope() {
        return new Envelope();
    }

    /**
     * Create an instance of {@link Envelope.Body }
     * 
     */
    public Envelope.Body createEnvelopeBody() {
        return new Envelope.Body();
    }

    /**
     * Create an instance of {@link Envelope.Header }
     * 
     */
    public Envelope.Header createEnvelopeHeader() {
        return new Envelope.Header();
    }

    /**
     * Create an instance of {@link WSCorIDSOAPHeader }
     * 
     */
    public WSCorIDSOAPHeader createWSCorIDSOAPHeader() {
        return new WSCorIDSOAPHeader();
    }

    /**
     * Create an instance of {@link Envelope.Body.SubmitThirdPartiesResponse }
     * 
     */
    public Envelope.Body.SubmitThirdPartiesResponse createEnvelopeBodySubmitThirdPartiesResponse() {
        return new Envelope.Body.SubmitThirdPartiesResponse();
    }

}
