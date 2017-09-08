package com.travix.medusa.busyflights.service;

import com.travix.medusa.busyflights.domain.crazyair.CrazyAirRequest;
import com.travix.medusa.busyflights.domain.crazyair.CrazyAirResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("crazyAirService")
public class CrazyAirServiceImpl implements CrazyAirService {

    @Override
    public List<CrazyAirResponse> getFlights(CrazyAirRequest request) {
        List<CrazyAirResponse> response = new ArrayList<>();
        response.add(generateCrazyAirResponse());
        return response;
    }

    private CrazyAirResponse generateCrazyAirResponse(){
        CrazyAirResponse crazyAirResponse = new CrazyAirResponse();
        crazyAirResponse.setAirline("Crazy AirLine");
        crazyAirResponse.setPrice(56.68);
        crazyAirResponse.setDepartureAirportCode("LHS");
        crazyAirResponse.setDestinationAirportCode("AKL");
        crazyAirResponse.setDepartureDate("12/08/2017");
        crazyAirResponse.setArrivalDate("21/08/2017");

        return crazyAirResponse;
    }
}
