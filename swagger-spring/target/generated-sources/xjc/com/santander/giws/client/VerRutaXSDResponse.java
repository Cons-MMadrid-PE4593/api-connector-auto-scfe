//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.01.20 a las 09:27:43 PM CET 
//


package com.santander.giws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VerRutaXSDResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "verRutaXSDResult"
})
@XmlRootElement(name = "VerRutaXSDResponse")
public class VerRutaXSDResponse {

    @XmlElement(name = "VerRutaXSDResult")
    protected String verRutaXSDResult;

    /**
     * Obtiene el valor de la propiedad verRutaXSDResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerRutaXSDResult() {
        return verRutaXSDResult;
    }

    /**
     * Define el valor de la propiedad verRutaXSDResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerRutaXSDResult(String value) {
        this.verRutaXSDResult = value;
    }

}
