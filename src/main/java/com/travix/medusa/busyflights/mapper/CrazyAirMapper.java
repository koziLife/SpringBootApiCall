package com.travix.medusa.busyflights.mapper;

import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;
import com.travix.medusa.busyflights.domain.crazyair.CrazyAirRequest;
import com.travix.medusa.busyflights.domain.crazyair.CrazyAirResponse;

public class CrazyAirMapper {

    private static final String SUPPLIER = "Crazy Air";

    public static CrazyAirRequest convertCrazyRequest(BusyFlightsRequest request){
        CrazyAirRequest crazyAirRequest = new CrazyAirRequest();
        crazyAirRequest.setOrigin(request.getOrigin());
        crazyAirRequest.setDestination(request.getDestination());
        crazyAirRequest.setDepartureDate(request.getDepartureDate());
        crazyAirRequest.setReturnDate(request.getReturnDate());
        crazyAirRequest.setPassengerCount(request.getNumberOfPassengers());
        return crazyAirRequest;
    }

    public static BusyFlightsResponse convertCrazyResponse(CrazyAirResponse response){
        BusyFlightsResponse busyFlightsResponse = new BusyFlightsResponse();
        busyFlightsResponse.setAirline(response.getAirline());
        busyFlightsResponse.setSupplier(SUPPLIER);
        busyFlightsResponse.setFare(response.getPrice());
        busyFlightsResponse.setDepartureAirportCode(response.getDepartureAirportCode());
        busyFlightsResponse.setDestinationAirportCode(response.getDestinationAirportCode());
        busyFlightsResponse.setDepartureDate(response.getDepartureDate());
        busyFlightsResponse.setArrivalDate(response.getArrivalDate());
        return busyFlightsResponse;
    }
}
