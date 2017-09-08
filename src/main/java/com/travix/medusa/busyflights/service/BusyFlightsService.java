package com.travix.medusa.busyflights.service;

import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;

import java.net.URISyntaxException;
import java.util.List;

public interface BusyFlightsService {

    List<BusyFlightsResponse> getFlights(BusyFlightsRequest request) throws URISyntaxException;
}
