package com.travix.medusa.busyflights.service;

import com.travix.medusa.busyflights.domain.toughjet.ToughJetRequest;
import com.travix.medusa.busyflights.domain.toughjet.ToughJetResponse;

import java.util.List;

public interface ToughJetApiService {

    List<ToughJetResponse> getFlights(ToughJetRequest request);
}
