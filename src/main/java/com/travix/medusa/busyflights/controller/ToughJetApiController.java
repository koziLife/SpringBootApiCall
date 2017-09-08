package com.travix.medusa.busyflights.controller;

import com.travix.medusa.busyflights.domain.toughjet.ToughJetRequest;
import com.travix.medusa.busyflights.domain.toughjet.ToughJetResponse;
import com.travix.medusa.busyflights.service.ToughJetApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ToughJetApiController {

    @Autowired
    ToughJetApiService toughJetApiService;

    @RequestMapping(value = "/toughjet/flights", method = RequestMethod.POST)
    public @ResponseBody
    List<ToughJetResponse> getFlights(@RequestBody ToughJetRequest request){
        return toughJetApiService.getFlights(request);
    }
}
