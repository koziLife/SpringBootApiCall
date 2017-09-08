package com.travix.medusa.busyflights.service;

import com.travix.medusa.busyflights.domain.toughjet.ToughJetRequest;
import com.travix.medusa.busyflights.domain.toughjet.ToughJetResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("toughJetService")
public class ToughJetApiServiceImpl implements ToughJetApiService {
    @Override
    public List<ToughJetResponse> getFlights(ToughJetRequest request) {
        List<ToughJetResponse> response = new ArrayList<>();
        response.add(generateToughJetResponse());
        return response;
    }

    private ToughJetResponse generateToughJetResponse(){
        ToughJetResponse toughJetResponse = new ToughJetResponse();
        toughJetResponse.setCarrier("Tough Jet");
        toughJetResponse.setArrivalAirportName("THY");
        toughJetResponse.setDepartureAirportName("KLM");
        toughJetResponse.setBasePrice(34.00);
        toughJetResponse.setTax(20.00);
        toughJetResponse.setDiscount(10.00);
        toughJetResponse.setInboundDateTime("21/08/2017");
        toughJetResponse.setOutboundDateTime("12/08/2017");
        return toughJetResponse;
    }
}
