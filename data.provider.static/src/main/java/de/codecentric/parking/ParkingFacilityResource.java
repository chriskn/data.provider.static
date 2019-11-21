package de.codecentric.parking;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.codecentric.parking.domain.ParkingFacility;


@Path("/facilities")
@Produces(MediaType.APPLICATION_JSON)
public class ParkingFacilityResource {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Inject
    ParkingFacilityClient client;
    @Inject
    ParkingFacilityParser parser;
    @Inject
    ParkingFacilityConverter converter;

    @GET
    public List<ParkingFacility> facilities() throws IOException, JAXBException {
        logger.debug("delivering static facilities");
        String staticXmlData = client.update();
        List<eu.datex2.schema._2._2_0.ParkingFacility> datexParkingFacilities = parser.parse(staticXmlData);
        List<ParkingFacility> facilities = converter.convert(datexParkingFacilities);
        return facilities; 
    }
}