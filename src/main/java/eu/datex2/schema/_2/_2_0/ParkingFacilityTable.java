//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.05 at 02:48:15 PM CET 
//


package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A collection of parking areas oder single facilities or both
 * 
 * <p>Java class for ParkingFacilityTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingFacilityTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parkingFacilityTableVersionTime" type="{http://datex2.eu/schema/2/2_0}DateTime"/>
 *         &lt;element name="parkingArea" type="{http://datex2.eu/schema/2/2_0}ParkingArea" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="parkingFacility" type="{http://datex2.eu/schema/2/2_0}ParkingFacility" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="parkingFacilityTableExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingFacilityTable", propOrder = {
    "parkingFacilityTableVersionTime",
    "parkingArea",
    "parkingFacility",
    "parkingFacilityTableExtension"
})
public class ParkingFacilityTable {

    @XmlElement(required = true)
    protected XMLGregorianCalendar parkingFacilityTableVersionTime;
    protected List<ParkingArea> parkingArea;
    protected List<ParkingFacility> parkingFacility;
    protected ExtensionType parkingFacilityTableExtension;

    /**
     * Gets the value of the parkingFacilityTableVersionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getParkingFacilityTableVersionTime() {
        return parkingFacilityTableVersionTime;
    }

    /**
     * Sets the value of the parkingFacilityTableVersionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setParkingFacilityTableVersionTime(XMLGregorianCalendar value) {
        this.parkingFacilityTableVersionTime = value;
    }

    /**
     * Gets the value of the parkingArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parkingArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingArea }
     * 
     * 
     */
    public List<ParkingArea> getParkingArea() {
        if (parkingArea == null) {
            parkingArea = new ArrayList<ParkingArea>();
        }
        return this.parkingArea;
    }

    /**
     * Gets the value of the parkingFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parkingFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingFacility }
     * 
     * 
     */
    public List<ParkingFacility> getParkingFacility() {
        if (parkingFacility == null) {
            parkingFacility = new ArrayList<ParkingFacility>();
        }
        return this.parkingFacility;
    }

    /**
     * Gets the value of the parkingFacilityTableExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getParkingFacilityTableExtension() {
        return parkingFacilityTableExtension;
    }

    /**
     * Sets the value of the parkingFacilityTableExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setParkingFacilityTableExtension(ExtensionType value) {
        this.parkingFacilityTableExtension = value;
    }

}
