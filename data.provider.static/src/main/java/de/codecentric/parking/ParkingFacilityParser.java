package de.codecentric.parking;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBContextFactory;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;


import eu.datex2.schema._2._2_0.D2LogicalModel;
import eu.datex2.schema._2._2_0.GenericPublication;
import eu.datex2.schema._2._2_0.ObjectFactory;
import eu.datex2.schema._2._2_0.ParkingArea;
import eu.datex2.schema._2._2_0.ParkingFacility;
import eu.datex2.schema._2._2_0.ParkingFacilityTable;
import eu.datex2.schema._2._2_0.ParkingFacilityTablePublication;
@RequestScoped
public class ParkingFacilityParser {
  

    public List<ParkingFacility> parse(String data) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(new Class[]{D2LogicalModel.class, ObjectFactory.class}, null);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        JAXBElement<D2LogicalModel> root = unmarshaller.unmarshal(new StreamSource(new StringReader(data)),
                D2LogicalModel.class);
        D2LogicalModel model = root.getValue();
        ParkingFacilityTablePublication parkingFacilityTablePublication = ((GenericPublication) model
                .getPayloadPublication()).getGenericPublicationExtension().getParkingFacilityTablePublication();
        return extractFacilities(parkingFacilityTablePublication);
    }

    private List<ParkingFacility> extractFacilities(ParkingFacilityTablePublication parkingFacilityTablePublication) {
        List<ParkingFacility> facilities = new ArrayList<>();
        for (ParkingFacilityTable table : parkingFacilityTablePublication.getParkingFacilityTable()) {
            for (ParkingArea area : table.getParkingArea()) {
                facilities.addAll(area.getParkingFacility());
            }
        }
        return facilities;
    }

}