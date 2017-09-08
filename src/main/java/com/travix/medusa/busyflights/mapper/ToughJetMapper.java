package com.travix.medusa.busyflights.mapper;

import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;
import com.travix.medusa.busyflights.domain.toughjet.ToughJetRequest;
import com.travix.medusa.busyflights.domain.toughjet.ToughJetResponse;

public class ToughJetMapper {

    private static final String SUPPLIER = "Tough Jet";

    public static ToughJetRequest convertToughRequest(BusyFlightsRequest request){
        ToughJetRequest toughJetRequest = new ToughJetRequest();
        toughJetRequest.setFrom(request.getOrigin());
        toughJetRequest.setTo(request.getDestination());
        toughJetRequest.setOutboundDate(request.getDepartureDate());
        toughJetRequest.setInboundDate(request.getReturnDate());
        toughJetRequest.setNumberOfAdults(request.getNumberOfPassengers());
        return toughJetRequest;
    }

    public static BusyFlightsResponse convertToughResponse(ToughJetResponse response){
        BusyFlightsResponse busyFlightsResponse = new BusyFlightsResponse();
        busyFlightsResponse.setAirline(response.getCarrier());
        busyFlightsResponse.setSupplier(SUPPLIER);
        busyFlightsResponse.setFare(calculatePrice(response));
        busyFlightsResponse.setDepartureAirportCode(response.getDepartureAirportName());
        busyFlightsResponse.setDestinationAirportCode(response.getArrivalAirportName());
        busyFlightsResponse.setDepartureDate(response.getOutboundDateTime());
        busyFlightsResponse.setArrivalDate(response.getInboundDateTime());
        return busyFlightsResponse;
    }

    private static double calculatePrice(ToughJetResponse response){
        return response.getBasePrice() + response.getTax() - response.getDiscount();
    }
}
