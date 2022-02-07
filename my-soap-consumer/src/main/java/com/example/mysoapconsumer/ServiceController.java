package com.example.mysoapconsumer;

import com.soap.consumer.country.service.GetCountryByCurrencyRequest;
import com.soap.consumer.country.service.GetCountryByCurrencyResponse;
import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.Constants;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.impl.httpclient4.HttpTransportPropertiesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.transport.*;

import java.util.HashMap;

@RestController
@RequestMapping("api/country/")
public class ServiceController {

    public final SoapWcClient soapWcClient;

    @Autowired
    public ServiceController(SoapWcClient soapWcClient) {
        this.soapWcClient = soapWcClient;
    }

    @PostMapping("")
    public ResponseEntity<ResponseBody> retrieveCountriesByCurrency(@org.springframework.web.bind.annotation.RequestBody  RequestBody requestBody){
        GetCountryByCurrencyRequest request = new GetCountryByCurrencyRequest();
        request.setCurrency(requestBody.getCurrency());

        GetCountryByCurrencyResponse response = new GetCountryByCurrencyResponse();
        response.getCountry().addAll(soapWcClient.getCountriesByCurrency(request).getCountry());

        ResponseBody responseBody = new ResponseBody();
        responseBody.setStatus(true);
        responseBody.setData(response);

        return new ResponseEntity<>(responseBody, HttpStatus.OK);
    }

    @PostMapping("axis")
    public ResponseEntity<ResponseBody> retrieveCountriesByCurrencyViaAXIOM(@org.springframework.web.bind.annotation.RequestBody  RequestBody requestBody){
        try {
            OMFactory fac = OMAbstractFactory.getOMFactory();
            OMNamespace omNs = fac.createOMNamespace("http://axiom.service.quickstart.samples/xsd", "xs");
            String seq="-1";
            String orig="27833430001";
            String dest ="27833430002";
            String amount ="750";
            String tariffId ="1";
            String spId ="1";
            OMElement vend = fac.createOMElement("vend", omNs);
            OMElement value = fac.createOMElement("sequence", omNs);
            value.addChild(fac.createOMText(value, seq));
            vend.addChild(value);
            value = fac.createOMElement("origMsisdn", omNs);
            value.addChild(fac.createOMText(value, orig));
            vend.addChild(value);

            value = fac.createOMElement("destMsisdn", omNs);
            value.addChild(fac.createOMText(value, dest));
            vend.addChild(value);
            value = fac.createOMElement("amount", omNs);
            value.addChild(fac.createOMText(value, amount));
            vend.addChild(value);
            value = fac.createOMElement("tariffTypeId", omNs);
            value.addChild(fac.createOMText(value, tariffId));
            vend.addChild(value);
            value = fac.createOMElement("serviceproviderId", omNs);
            value.addChild(fac.createOMText(value, spId));
            vend.addChild(value);

            System.out.println("OME=>1 "+vend);
            System.out.println("OME=>2 "+vend.toStringWithConsume());

            String url = "http://localhost:8080/ws";
            EndpointReference targetEPR = new EndpointReference(url);
//set options
            Options options = new Options();
            options.setTo(targetEPR);
            options.setTransportInProtocol(Constants.TRANSPORT_HTTP);
            String user="wsuser";
            String password ="wspwd";

            //enable BASIC authentication
            HttpTransportPropertiesImpl.Authenticator auth = new HttpTransportPropertiesImpl.Authenticator();
            auth.setUsername(user);
            auth.setPassword(password);
            options.setProperty(HTTPConstants.AUTHENTICATE, auth);
            options.setTimeOutInMilliSeconds(1000*60*2);
//create client
            ServiceClient sender = new ServiceClient();
            sender.setOptions(options);
            OMElement result = sender.sendReceive(vend);
            HashMap<String, String> map = new HashMap<>();

            OMElement el;
            StringBuffer sb = new StringBuffer();
//get pointer to first element
            el = result.getFirstElement();

            System.out.println("EL=>A "+ el);

            if(el!=null){
                System.out.println("EL=>B "+ el);
                System.out.println("EL=>C "+ el.toStringWithConsume());
            }

            do {
                String name = el.getLocalName();
                String val = el.getText();
                sb.append(name+"="+val+"; ");
                map.put(name, val);
            }
            while ((el = (OMElement)el.getNextOMSibling()) != null);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}