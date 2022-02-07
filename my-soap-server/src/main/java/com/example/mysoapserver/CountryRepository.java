package com.example.mysoapserver;

import guide.com.soap.server.Country;
import guide.com.soap.server.Currency;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CountryRepository {
    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        Country spain = new Country();
        spain.setName("Spain");
        spain.setCapital("Madrid");
        spain.setCurrency(Currency.EUR);
        spain.setPopulation(46704314);

        countries.put(spain.getName(), spain);

        Country poland = new Country();
        poland.setName("Poland");
        poland.setCapital("Warsaw");
        poland.setCurrency(Currency.PLN);
        poland.setPopulation(38186860);

        countries.put(poland.getName(), poland);

        Country uk = new Country();
        uk.setName("United Kingdom");
        uk.setCapital("London");
        uk.setCurrency(Currency.GBP);
        uk.setPopulation(63705000);

        countries.put(uk.getName(), uk);

        Country nigeria = new Country();
        nigeria.setName("Nigeria");
        nigeria.setCapital("Lagos");
        nigeria.setCurrency(Currency.AFR);
        nigeria.setPopulation(211400708);

        countries.put(nigeria.getName(), nigeria);

        Country germany = new Country();
        germany.setName("Germany");
        germany.setCapital("Berlin");
        germany.setCurrency(Currency.EUR);
        germany.setPopulation(48400708);

        countries.put(germany.getName(), germany);
    }

    public Country findCountry(String name) {
        Assert.notNull(name, "The country's name must not be null");
        return countries.get(name);
    }

    public List<Country> findAllCountry(){
        return new ArrayList<>(countries.values());
    }

    public List<Country> findCountryByCurrency(Currency currency){
        ArrayList<Country> countries = new ArrayList<>();

        for(Country country : findAllCountry()){
            if(country.getCurrency().equals(currency)){
               countries.add(country);
            }
        }

        return countries;
    }

}