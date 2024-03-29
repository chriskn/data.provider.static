//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.05 at 02:48:15 PM CET 
//


package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A referent on a linear object that has a known location such as a node, a reference marker (e.g. a markerpost), an intersection etc.
 * 
 * <p>Java class for Referent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Referent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referentIdentifier" type="{http://datex2.eu/schema/2/2_0}String"/>
 *         &lt;element name="referentType" type="{http://datex2.eu/schema/2/2_0}ReferentTypeEnum"/>
 *         &lt;element name="pointCoordinates" type="{http://datex2.eu/schema/2/2_0}PointCoordinates" minOccurs="0"/>
 *         &lt;element name="referentExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Referent", propOrder = {
    "referentIdentifier",
    "referentType",
    "pointCoordinates",
    "referentExtension"
})
public class Referent {

    @XmlElement(required = true)
    protected String referentIdentifier;
    @XmlElement(required = true)
    protected ReferentTypeEnum referentType;
    protected PointCoordinates pointCoordinates;
    protected ExtensionType referentExtension;

    /**
     * Gets the value of the referentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferentIdentifier() {
        return referentIdentifier;
    }

    /**
     * Sets the value of the referentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferentIdentifier(String value) {
        this.referentIdentifier = value;
    }

    /**
     * Gets the value of the referentType property.
     * 
     * @return
     *     possible object is
     *     {@link ReferentTypeEnum }
     *     
     */
    public ReferentTypeEnum getReferentType() {
        return referentType;
    }

    /**
     * Sets the value of the referentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferentTypeEnum }
     *     
     */
    public void setReferentType(ReferentTypeEnum value) {
        this.referentType = value;
    }

    /**
     * Gets the value of the pointCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link PointCoordinates }
     *     
     */
    public PointCoordinates getPointCoordinates() {
        return pointCoordinates;
    }

    /**
     * Sets the value of the pointCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointCoordinates }
     *     
     */
    public void setPointCoordinates(PointCoordinates value) {
        this.pointCoordinates = value;
    }

    /**
     * Gets the value of the referentExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getReferentExtension() {
        return referentExtension;
    }

    /**
     * Sets the value of the referentExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setReferentExtension(ExtensionType value) {
        this.referentExtension = value;
    }

}
