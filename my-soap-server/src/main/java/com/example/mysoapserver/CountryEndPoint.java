package com.example.mysoapserver;

import guide.com.soap.server.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CountryEndPoint {

    private static final String NAMESAPCE = "http://com.guide/soap/server";

    private final CountryRepository repository;

    @Autowired
    public CountryEndPoint(CountryRepository repository) {
        this.repository = repository;
    }

    @PayloadRoot(namespace = NAMESAPCE, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest getCountryRequest){
        GetCountryResponse response = new GetCountryResponse();
        response.setCountry(repository.findCountry(getCountryRequest.getName()));
        return response;
    }

    @PayloadRoot(namespace = NAMESAPCE, localPart = "getAllCountryRequest")
    @ResponsePayload
    public GetAllCountryResponse getCountry(){
        GetAllCountryResponse response = new GetAllCountryResponse();
        response.getCountry().addAll(repository.findAllCountry());
        return response;
    }

    @PayloadRoot(namespace = NAMESAPCE, localPart = "getCountryByCurrencyRequest")
    @ResponsePayload
    public GetCountryByCurrencyResponse getCountryByCurrency(@RequestPayload GetCountryByCurrencyRequest getCountryByCurrencyRequest){
        GetCountryByCurrencyResponse response = new GetCountryByCurrencyResponse();
        response.getCountry().addAll(repository.findCountryByCurrency(getCountryByCurrencyRequest.getCurrency()));
        return response;
    }
}