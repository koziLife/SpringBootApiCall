package com.travix.medusa.busyflights.facade;

import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;
import com.travix.medusa.busyflights.domain.crazyair.CrazyAirRequest;
import com.travix.medusa.busyflights.domain.crazyair.CrazyAirResponse;
import com.travix.medusa.busyflights.mapper.CrazyAirMapper;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CrazyAirApi {

    private static final String crazyAirUrl = "http://localhost:8080/api/crazyair/flights";

    public List<BusyFlightsResponse> getFlights(CrazyAirRequest request) {
        List<BusyFlightsResponse> listOfBusyFlight = new ArrayList<>();
        RestTemplate restTemplate = new RestTemplate();

        CrazyAirResponse[] response = restTemplate.
                postForEntity(crazyAirUrl, request, CrazyAirResponse[].class).
                getBody();

        Arrays.stream(response).forEach(item -> listOfBusyFlight.add(CrazyAirMapper.convertCrazyResponse(item)));

        return listOfBusyFlight;
    }
}
