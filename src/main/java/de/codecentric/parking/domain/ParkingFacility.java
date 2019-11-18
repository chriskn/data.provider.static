package de.codecentric.parking.domain;

import java.math.BigInteger;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Builder(builderClassName = "ParkingFacilityBuilder", toBuilder = true)
@Data
public class ParkingFacility {

    @NonNull
    private String id;
    private String name;
    private String description;
    private BigInteger parkingCapacity;
    private BigInteger parkingCapacityShortTerm;
    private BigInteger parkingCapacityLongTerm;
    private float longitude;
    private float latitude; 

    @JsonPOJOBuilder(withPrefix = "")
    public static class ParkingFacilityBuilder {
    }

}