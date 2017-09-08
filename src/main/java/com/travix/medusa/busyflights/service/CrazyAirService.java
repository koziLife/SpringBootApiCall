package com.travix.medusa.busyflights.service;

import com.travix.medusa.busyflights.domain.crazyair.CrazyAirRequest;
import com.travix.medusa.busyflights.domain.crazyair.CrazyAirResponse;

import java.util.List;

public interface CrazyAirService {

    List<CrazyAirResponse> getFlights(CrazyAirRequest request);

}
