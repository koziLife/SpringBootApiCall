package com.travix.medusa.busyflights.service;

import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;
import com.travix.medusa.busyflights.facade.FlightFacade;
import org.springframework.stereotype.Service;

import java.net.URISyntaxException;
import java.util.List;

@Service("busyFlightsService")
public class BusyFlightsServiceImpl implements BusyFlightsService {

    @Override
    public List<BusyFlightsResponse> getFlights(BusyFlightsRequest request) throws URISyntaxException {
        FlightFacade facade = new FlightFacade();
        return facade.getFlights(request);
    }
}
