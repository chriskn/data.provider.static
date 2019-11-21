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
 * A point on a linear element where the linear element is either a part of or the whole of a linear object (i.e. a road), consistent with ISO 19148 definitions. 
 * 
 * <p>Java class for PointAlongLinearElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointAlongLinearElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="directionBoundAtPoint" type="{http://datex2.eu/schema/2/2_0}DirectionEnum" minOccurs="0"/>
 *         &lt;element name="linearElement" type="{http://datex2.eu/schema/2/2_0}LinearElement"/>
 *         &lt;element name="distanceAlongLinearElement" type="{http://datex2.eu/schema/2/2_0}DistanceAlongLinearElement"/>
 *         &lt;element name="pointAlongLinearElementExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointAlongLinearElement", propOrder = {
    "directionBoundAtPoint",
    "linearElement",
    "distanceAlongLinearElement",
    "pointAlongLinearElementExtension"
})
public class PointAlongLinearElement {

    protected DirectionEnum directionBoundAtPoint;
    @XmlElement(required = true)
    protected LinearElement linearElement;
    @XmlElement(required = true)
    protected DistanceAlongLinearElement distanceAlongLinearElement;
    protected ExtensionType pointAlongLinearElementExtension;

    /**
     * Gets the value of the directionBoundAtPoint property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionEnum }
     *     
     */
    public DirectionEnum getDirectionBoundAtPoint() {
        return directionBoundAtPoint;
    }

    /**
     * Sets the value of the directionBoundAtPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionEnum }
     *     
     */
    public void setDirectionBoundAtPoint(DirectionEnum value) {
        this.directionBoundAtPoint = value;
    }

    /**
     * Gets the value of the linearElement property.
     * 
     * @return
     *     possible object is
     *     {@link LinearElement }
     *     
     */
    public LinearElement getLinearElement() {
        return linearElement;
    }

    /**
     * Sets the value of the linearElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearElement }
     *     
     */
    public void setLinearElement(LinearElement value) {
        this.linearElement = value;
    }

    /**
     * Gets the value of the distanceAlongLinearElement property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceAlongLinearElement }
     *     
     */
    public DistanceAlongLinearElement getDistanceAlongLinearElement() {
        return distanceAlongLinearElement;
    }

    /**
     * Sets the value of the distanceAlongLinearElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceAlongLinearElement }
     *     
     */
    public void setDistanceAlongLinearElement(DistanceAlongLinearElement value) {
        this.distanceAlongLinearElement = value;
    }

    /**
     * Gets the value of the pointAlongLinearElementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPointAlongLinearElementExtension() {
        return pointAlongLinearElementExtension;
    }

    /**
     * Sets the value of the pointAlongLinearElementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPointAlongLinearElementExtension(ExtensionType value) {
        this.pointAlongLinearElementExtension = value;
    }

}
