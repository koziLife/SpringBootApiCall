package com.travix.medusa.busyflights.controller;

import com.travix.medusa.busyflights.domain.crazyair.CrazyAirRequest;
import com.travix.medusa.busyflights.domain.crazyair.CrazyAirResponse;
import com.travix.medusa.busyflights.service.CrazyAirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CrazyAirApiController {

    @Autowired
    CrazyAirService crazyAirService;

    @RequestMapping(value = "/crazyair/flights", method = RequestMethod.POST)
    public @ResponseBody List<CrazyAirResponse> getFlights(@RequestBody CrazyAirRequest request){
        return crazyAirService.getFlights(request);
    }
}
