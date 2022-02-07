package com.example.mysoapconsumer;

import com.soap.consumer.country.service.Currency;
import lombok.Data;

@Data
public class RequestBody {
    private Currency currency;
}
