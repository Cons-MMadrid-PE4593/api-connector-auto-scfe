//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.01.26 a las 06:56:51 PM CET 
//


package io.swagger.model.giws.submitthirdparties;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="CorID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "WSCorIDSOAPHeader")
public class WSCorIDSOAPHeader {

    @XmlAttribute(name = "CorID", required = true)
    protected String corID;

    /**
     * Obtiene el valor de la propiedad corID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorID() {
        return corID;
    }

    /**
     * Define el valor de la propiedad corID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorID(String value) {
        this.corID = value;
    }

}
