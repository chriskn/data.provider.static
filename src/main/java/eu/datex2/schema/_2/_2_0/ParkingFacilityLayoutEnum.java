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
 * <p>Java class for ParkingFacilityLayoutEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkingFacilityLayoutEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="multiStorey"/>
 *     &lt;enumeration value="singleLevel"/>
 *     &lt;enumeration value="underground"/>
 *     &lt;enumeration value="undergroundAndMultistorey"/>
 *     &lt;enumeration value="automatedParkingGarage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParkingFacilityLayoutEnum")
@XmlEnum
public enum ParkingFacilityLayoutEnum {


    /**
     * Parking is on multiple levels within a parking building.
     * 
     */
    @XmlEnumValue("multiStorey")
    MULTI_STOREY("multiStorey"),

    /**
     * Parking is on a single ground floor level.
     * 
     */
    @XmlEnumValue("singleLevel")
    SINGLE_LEVEL("singleLevel"),

    /**
     * Parking is on one or more floors below ground level.
     * 
     */
    @XmlEnumValue("underground")
    UNDERGROUND("underground"),

    /**
     * Parking is on multiple floors levels including both below and above ground level. 
     * 
     */
    @XmlEnumValue("undergroundAndMultistorey")
    UNDERGROUND_AND_MULTISTOREY("undergroundAndMultistorey"),

    /**
     * Parking is completely automated from the point of leaving the vehicle in an arrival bay to its delivery back to the driver in a pickup bay.
     * 
     */
    @XmlEnumValue("automatedParkingGarage")
    AUTOMATED_PARKING_GARAGE("automatedParkingGarage");
    private final String value;

    ParkingFacilityLayoutEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingFacilityLayoutEnum fromValue(String v) {
        for (ParkingFacilityLayoutEnum c: ParkingFacilityLayoutEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}