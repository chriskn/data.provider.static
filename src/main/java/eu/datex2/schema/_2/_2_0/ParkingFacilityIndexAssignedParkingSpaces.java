//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.05 at 02:48:15 PM CET 
//


package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _ParkingFacilityIndexAssignedParkingSpaces complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_ParkingFacilityIndexAssignedParkingSpaces">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assignedParkingSpaces" type="{http://datex2.eu/schema/2/2_0}AssignedParkingSpaces"/>
 *       &lt;/sequence>
 *       &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_ParkingFacilityIndexAssignedParkingSpaces", propOrder = {
    "assignedParkingSpaces"
})
public class ParkingFacilityIndexAssignedParkingSpaces {

    @XmlElement(required = true)
    protected AssignedParkingSpaces assignedParkingSpaces;
    @XmlAttribute(name = "index", required = true)
    protected int index;

    /**
     * Gets the value of the assignedParkingSpaces property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedParkingSpaces }
     *     
     */
    public AssignedParkingSpaces getAssignedParkingSpaces() {
        return assignedParkingSpaces;
    }

    /**
     * Sets the value of the assignedParkingSpaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedParkingSpaces }
     *     
     */
    public void setAssignedParkingSpaces(AssignedParkingSpaces value) {
        this.assignedParkingSpaces = value;
    }

    /**
     * Gets the value of the index property.
     * 
     */
    public int getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setIndex(int value) {
        this.index = value;
    }

}
