package de.codecentric.parking;

import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;

import de.codecentric.parking.domain.ParkingFacility;
import eu.datex2.schema._2._2_0.Point;
import eu.datex2.schema._2._2_0.PointCoordinates;

@ApplicationScoped
public class ParkingFacilityConverter {

    public List<ParkingFacility> convert(List<eu.datex2.schema._2._2_0.ParkingFacility> inputFacilities) {
        return inputFacilities.stream().map(it -> convert(it)).collect(Collectors.toList());
    }

    private ParkingFacility convert(eu.datex2.schema._2._2_0.ParkingFacility inputFacility) {
        String name = inputFacility.getParkingFacilityName().getValues().getValue().get(0).getValue();
        PointCoordinates facilityLocation = ((Point) inputFacility.getFacilityLocation()).getPointByCoordinates()
                .getPointCoordinates();
        float latitude = facilityLocation.getLatitude();
        float longitude = facilityLocation.getLongitude();
        return ParkingFacility.builder().id(inputFacility.getId()).name(name)
                .description(inputFacility.getParkingFacilityDescription())
                .parkingCapacity(inputFacility.getTotalParkingCapacity())
                .parkingCapacityShortTerm(inputFacility.getTotalParkingCapacityShortTerm())
                .parkingCapacityLongTerm(inputFacility.getTotalParkingCapacityLongTerm()).longitude(longitude)
                .latitude(latitude).build();
    }

}