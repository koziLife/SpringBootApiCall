package com.travix.medusa.busyflights.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class CrazyAirServiceTest {

    private CrazyAirService crazyAirService;
    private ToughJetApiService toughJetApiService;

    @Before
    public void setUp() {
        crazyAirService = Mockito.mock(CrazyAirService.class);
        toughJetApiService = Mockito.mock(ToughJetApiService.class);
    }
    @Test
    public void crazyAirServiceTest() throws Exception {
    }
}
