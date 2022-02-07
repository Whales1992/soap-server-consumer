package com.example.mysoapconsumer;

import com.soap.consumer.country.service.GetCountryByCurrencyRequest;
import com.soap.consumer.country.service.GetCountryByCurrencyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class SoapWcClient {

    public final Jaxb2Marshaller jaxb2Marshaller;

    private WebServiceTemplate webServiceTemplate;

    @Autowired
    public SoapWcClient(Jaxb2Marshaller jaxb2Marshaller) {
        this.jaxb2Marshaller = jaxb2Marshaller;
    }

    public GetCountryByCurrencyResponse getCountriesByCurrency(GetCountryByCurrencyRequest getCountryByCurrencyRequest){
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        return (GetCountryByCurrencyResponse) webServiceTemplate.marshalSendAndReceive("http://localhost:8080/ws", getCountryByCurrencyRequest);
    }

}