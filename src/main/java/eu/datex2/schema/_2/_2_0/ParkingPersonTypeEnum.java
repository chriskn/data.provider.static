//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.05 at 02:48:15 PM CET 
//


package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingPersonTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkingPersonTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="women"/>
 *     &lt;enumeration value="families"/>
 *     &lt;enumeration value="disabled"/>
 *     &lt;enumeration value="reservationHolders"/>
 *     &lt;enumeration value="residentsWithPermits"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParkingPersonTypeEnum")
@XmlEnum
public enum ParkingPersonTypeEnum {


    /**
     * women.
     * 
     */
    @XmlEnumValue("women")
    WOMEN("women"),

    /**
     * Families.
     * 
     */
    @XmlEnumValue("families")
    FAMILIES("families"),

    /**
     * Disabled persons.
     * 
     */
    @XmlEnumValue("disabled")
    DISABLED("disabled"),

    /**
     * Those who have a valid reservation for the duration of parking.
     * 
     */
    @XmlEnumValue("reservationHolders")
    RESERVATION_HOLDERS("reservationHolders"),

    /**
     * Local residents who hold a valid permit for use of the parking facility.
     * 
     */
    @XmlEnumValue("residentsWithPermits")
    RESIDENTS_WITH_PERMITS("residentsWithPermits");
    private final String value;

    ParkingPersonTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingPersonTypeEnum fromValue(String v) {
        for (ParkingPersonTypeEnum c: ParkingPersonTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
