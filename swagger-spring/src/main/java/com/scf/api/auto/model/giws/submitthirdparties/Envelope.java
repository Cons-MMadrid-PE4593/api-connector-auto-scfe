//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.01.26 a las 06:56:51 PM CET 
//


package com.scf.api.auto.model.giws.submitthirdparties;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.w3.org/1999/xhtml}WSCorIDSOAPHeader"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Body">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="submitThirdPartiesResponse">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="submitThirdPartiesResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="encodingStyle" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "body"
})
@XmlRootElement(name = "Envelope", namespace = "")
public class Envelope {

    @XmlElement(name = "Header", required = true)
    protected Envelope.Header header;
    @XmlElement(name = "Body", required = true)
    protected Envelope.Body body;

    /**
     * Obtiene el valor de la propiedad header.
     * 
     * @return
     *     possible object is
     *     {@link Envelope.Header }
     *     
     */
    public Envelope.Header getHeader() {
        return header;
    }

    /**
     * Define el valor de la propiedad header.
     * 
     * @param value
     *     allowed object is
     *     {@link Envelope.Header }
     *     
     */
    public void setHeader(Envelope.Header value) {
        this.header = value;
    }

    /**
     * Obtiene el valor de la propiedad body.
     * 
     * @return
     *     possible object is
     *     {@link Envelope.Body }
     *     
     */
    public Envelope.Body getBody() {
        return body;
    }

    /**
     * Define el valor de la propiedad body.
     * 
     * @param value
     *     allowed object is
     *     {@link Envelope.Body }
     *     
     */
    public void setBody(Envelope.Body value) {
        this.body = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="submitThirdPartiesResponse">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="submitThirdPartiesResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="encodingStyle" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "submitThirdPartiesResponse"
    })
    public static class Body {

        @XmlElement(required = true)
        protected Envelope.Body.SubmitThirdPartiesResponse submitThirdPartiesResponse;
        @XmlAttribute(name = "encodingStyle", required = true)
        protected String encodingStyle;

        /**
         * Obtiene el valor de la propiedad submitThirdPartiesResponse.
         * 
         * @return
         *     possible object is
         *     {@link Envelope.Body.SubmitThirdPartiesResponse }
         *     
         */
        public Envelope.Body.SubmitThirdPartiesResponse getSubmitThirdPartiesResponse() {
            return submitThirdPartiesResponse;
        }

        /**
         * Define el valor de la propiedad submitThirdPartiesResponse.
         * 
         * @param value
         *     allowed object is
         *     {@link Envelope.Body.SubmitThirdPartiesResponse }
         *     
         */
        public void setSubmitThirdPartiesResponse(Envelope.Body.SubmitThirdPartiesResponse value) {
            this.submitThirdPartiesResponse = value;
        }

        /**
         * Obtiene el valor de la propiedad encodingStyle.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEncodingStyle() {
            return encodingStyle;
        }

        /**
         * Define el valor de la propiedad encodingStyle.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEncodingStyle(String value) {
            this.encodingStyle = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="submitThirdPartiesResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "submitThirdPartiesResult"
        })
        public static class SubmitThirdPartiesResponse {

            @XmlElement(required = true)
            protected String submitThirdPartiesResult;

            /**
             * Obtiene el valor de la propiedad submitThirdPartiesResult.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubmitThirdPartiesResult() {
                return submitThirdPartiesResult;
            }

            /**
             * Define el valor de la propiedad submitThirdPartiesResult.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubmitThirdPartiesResult(String value) {
                this.submitThirdPartiesResult = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.w3.org/1999/xhtml}WSCorIDSOAPHeader"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "wsCorIDSOAPHeader"
    })
    public static class Header {

        @XmlElement(name = "WSCorIDSOAPHeader", namespace = "http://www.w3.org/1999/xhtml", required = true)
        protected WSCorIDSOAPHeader wsCorIDSOAPHeader;

        /**
         * Obtiene el valor de la propiedad wsCorIDSOAPHeader.
         * 
         * @return
         *     possible object is
         *     {@link WSCorIDSOAPHeader }
         *     
         */
        public WSCorIDSOAPHeader getWSCorIDSOAPHeader() {
            return wsCorIDSOAPHeader;
        }

        /**
         * Define el valor de la propiedad wsCorIDSOAPHeader.
         * 
         * @param value
         *     allowed object is
         *     {@link WSCorIDSOAPHeader }
         *     
         */
        public void setWSCorIDSOAPHeader(WSCorIDSOAPHeader value) {
            this.wsCorIDSOAPHeader = value;
        }

    }

}
