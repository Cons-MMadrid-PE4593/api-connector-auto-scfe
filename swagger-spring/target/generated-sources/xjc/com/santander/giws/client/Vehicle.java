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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Vehicle complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Vehicle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VehicleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdManufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdDerivative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Derivative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumDoors" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EngineSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FuelTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransmissionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntroducedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscontinuedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehicle", propOrder = {
    "vehicleType",
    "idManufacturer",
    "manufacturer",
    "idModel",
    "model",
    "idDerivative",
    "derivative",
    "value",
    "numDoors",
    "engineSize",
    "fuelTypeId",
    "vehicleTypeId",
    "transmissionId",
    "introducedDate",
    "discontinuedDate"
})
public class Vehicle {

    @XmlElement(name = "VehicleType")
    protected String vehicleType;
    @XmlElement(name = "IdManufacturer")
    protected String idManufacturer;
    @XmlElement(name = "Manufacturer")
    protected String manufacturer;
    @XmlElement(name = "IdModel")
    protected String idModel;
    @XmlElement(name = "Model")
    protected String model;
    @XmlElement(name = "IdDerivative")
    protected String idDerivative;
    @XmlElement(name = "Derivative")
    protected String derivative;
    @XmlElement(name = "Value")
    protected String value;
    @XmlElement(name = "NumDoors")
    protected String numDoors;
    @XmlElement(name = "EngineSize")
    protected String engineSize;
    @XmlElement(name = "FuelTypeId")
    protected String fuelTypeId;
    @XmlElement(name = "VehicleTypeId")
    protected String vehicleTypeId;
    @XmlElement(name = "TransmissionId")
    protected String transmissionId;
    @XmlElement(name = "IntroducedDate")
    protected String introducedDate;
    @XmlElement(name = "DiscontinuedDate")
    protected String discontinuedDate;

    /**
     * Obtiene el valor de la propiedad vehicleType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * Define el valor de la propiedad vehicleType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleType(String value) {
        this.vehicleType = value;
    }

    /**
     * Obtiene el valor de la propiedad idManufacturer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdManufacturer() {
        return idManufacturer;
    }

    /**
     * Define el valor de la propiedad idManufacturer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdManufacturer(String value) {
        this.idManufacturer = value;
    }

    /**
     * Obtiene el valor de la propiedad manufacturer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Define el valor de la propiedad manufacturer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Obtiene el valor de la propiedad idModel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdModel() {
        return idModel;
    }

    /**
     * Define el valor de la propiedad idModel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdModel(String value) {
        this.idModel = value;
    }

    /**
     * Obtiene el valor de la propiedad model.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Define el valor de la propiedad model.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Obtiene el valor de la propiedad idDerivative.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDerivative() {
        return idDerivative;
    }

    /**
     * Define el valor de la propiedad idDerivative.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDerivative(String value) {
        this.idDerivative = value;
    }

    /**
     * Obtiene el valor de la propiedad derivative.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDerivative() {
        return derivative;
    }

    /**
     * Define el valor de la propiedad derivative.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDerivative(String value) {
        this.derivative = value;
    }

    /**
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad numDoors.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumDoors() {
        return numDoors;
    }

    /**
     * Define el valor de la propiedad numDoors.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDoors(String value) {
        this.numDoors = value;
    }

    /**
     * Obtiene el valor de la propiedad engineSize.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineSize() {
        return engineSize;
    }

    /**
     * Define el valor de la propiedad engineSize.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineSize(String value) {
        this.engineSize = value;
    }

    /**
     * Obtiene el valor de la propiedad fuelTypeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelTypeId() {
        return fuelTypeId;
    }

    /**
     * Define el valor de la propiedad fuelTypeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuelTypeId(String value) {
        this.fuelTypeId = value;
    }

    /**
     * Obtiene el valor de la propiedad vehicleTypeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleTypeId() {
        return vehicleTypeId;
    }

    /**
     * Define el valor de la propiedad vehicleTypeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleTypeId(String value) {
        this.vehicleTypeId = value;
    }

    /**
     * Obtiene el valor de la propiedad transmissionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransmissionId() {
        return transmissionId;
    }

    /**
     * Define el valor de la propiedad transmissionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransmissionId(String value) {
        this.transmissionId = value;
    }

    /**
     * Obtiene el valor de la propiedad introducedDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntroducedDate() {
        return introducedDate;
    }

    /**
     * Define el valor de la propiedad introducedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntroducedDate(String value) {
        this.introducedDate = value;
    }

    /**
     * Obtiene el valor de la propiedad discontinuedDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscontinuedDate() {
        return discontinuedDate;
    }

    /**
     * Define el valor de la propiedad discontinuedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscontinuedDate(String value) {
        this.discontinuedDate = value;
    }

}
