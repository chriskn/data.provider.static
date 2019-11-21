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
 * Line attributes are part of a location reference point and consists of functional road class (FRC), form of way (FOW) and bearing (BEAR) data.
 * 
 * <p>Java class for OpenlrLineAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrLineAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="openlrFunctionalRoadClass" type="{http://datex2.eu/schema/2/2_0}OpenlrFunctionalRoadClassEnum"/>
 *         &lt;element name="openlrFormOfWay" type="{http://datex2.eu/schema/2/2_0}OpenlrFormOfWayEnum"/>
 *         &lt;element name="openlrBearing" type="{http://datex2.eu/schema/2/2_0}AngleInDegreesRestrictedRange"/>
 *         &lt;element name="openlrLineAttributesExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrLineAttributes", propOrder = {
    "openlrFunctionalRoadClass",
    "openlrFormOfWay",
    "openlrBearing",
    "openlrLineAttributesExtension"
})
public class OpenlrLineAttributes {

    @XmlElement(required = true)
    protected OpenlrFunctionalRoadClassEnum openlrFunctionalRoadClass;
    @XmlElement(required = true)
    protected OpenlrFormOfWayEnum openlrFormOfWay;
    protected int openlrBearing;
    protected ExtensionType openlrLineAttributesExtension;

    /**
     * Gets the value of the openlrFunctionalRoadClass property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrFunctionalRoadClassEnum }
     *     
     */
    public OpenlrFunctionalRoadClassEnum getOpenlrFunctionalRoadClass() {
        return openlrFunctionalRoadClass;
    }

    /**
     * Sets the value of the openlrFunctionalRoadClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrFunctionalRoadClassEnum }
     *     
     */
    public void setOpenlrFunctionalRoadClass(OpenlrFunctionalRoadClassEnum value) {
        this.openlrFunctionalRoadClass = value;
    }

    /**
     * Gets the value of the openlrFormOfWay property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrFormOfWayEnum }
     *     
     */
    public OpenlrFormOfWayEnum getOpenlrFormOfWay() {
        return openlrFormOfWay;
    }

    /**
     * Sets the value of the openlrFormOfWay property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrFormOfWayEnum }
     *     
     */
    public void setOpenlrFormOfWay(OpenlrFormOfWayEnum value) {
        this.openlrFormOfWay = value;
    }

    /**
     * Gets the value of the openlrBearing property.
     * 
     */
    public int getOpenlrBearing() {
        return openlrBearing;
    }

    /**
     * Sets the value of the openlrBearing property.
     * 
     */
    public void setOpenlrBearing(int value) {
        this.openlrBearing = value;
    }

    /**
     * Gets the value of the openlrLineAttributesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOpenlrLineAttributesExtension() {
        return openlrLineAttributesExtension;
    }

    /**
     * Sets the value of the openlrLineAttributesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOpenlrLineAttributesExtension(ExtensionType value) {
        this.openlrLineAttributesExtension = value;
    }

}
