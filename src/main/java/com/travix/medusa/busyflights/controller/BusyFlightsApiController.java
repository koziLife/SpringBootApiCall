package com.travix.medusa.busyflights.controller;

import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;
import com.travix.medusa.busyflights.service.BusyFlightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BusyFlightsApiController {

    @Autowired
    BusyFlightsService busyFlightsService;

    @RequestMapping(value = "/busy/flights", method = RequestMethod.POST)
    public @ResponseBody
    List<BusyFlightsResponse> getFlights(@RequestBody BusyFlightsRequest request) throws URISyntaxException {
        return busyFlightsService.getFlights(request);
    }
}
