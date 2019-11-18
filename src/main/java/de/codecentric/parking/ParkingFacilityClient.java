package de.codecentric.parking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class ParkingFacilityClient {

    @ConfigProperty(name = "source.url")
    String sourceUrl;

    public String update() throws IOException {
        URL url = new URL(sourceUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/xml");
        if (connection.getResponseCode() != 200) {
            throw new IOException("Failed : HTTP error code : " + connection.getResponseCode());
        }
        BufferedReader buffer = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
        String output = buffer.lines().collect(Collectors.joining());
        connection.disconnect();
        return output;
    }

}