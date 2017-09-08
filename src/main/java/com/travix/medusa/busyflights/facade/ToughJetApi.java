package com.travix.medusa.busyflights.facade;

import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;
import com.travix.medusa.busyflights.domain.toughjet.ToughJetRequest;
import com.travix.medusa.busyflights.domain.toughjet.ToughJetResponse;
import com.travix.medusa.busyflights.mapper.ToughJetMapper;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToughJetApi {

    private static final String toughJetUrl = "http://localhost:8080/api/toughjet/flights";

    public List<BusyFlightsResponse> getFlights(ToughJetRequest request) {
        List<BusyFlightsResponse> listOfBusyFlight = new ArrayList<>();
        RestTemplate restTemplate = new RestTemplate();

        ToughJetResponse[] response = restTemplate.
                postForEntity(toughJetUrl, request, ToughJetResponse[].class).
                getBody();

        Arrays.stream(response).forEach(item -> listOfBusyFlight.add(ToughJetMapper.convertToughResponse(item)));

        return listOfBusyFlight;
    }
}
