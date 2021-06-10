package espm.invest.currency.common.controller;

import espm.invest.currency.common.datatype.Currency;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@FeignClient("currency-service")
public interface CurrencyController {
    @GetMapping("/currency")
    List<Currency> currency();

    @GetMapping("/currency/{id}")
    Currency currency(String id);

    @DeleteMapping("/currency/{id}")
    Currency deleteById(String id);

    @PostMapping("/currency")
    Currency save(Currency currency);
}
