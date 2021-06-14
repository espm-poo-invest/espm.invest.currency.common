package espm.invest.currency.common.controller;

import espm.invest.currency.common.datatype.Currency;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@FeignClient("currency-service")
public interface CurrencyController {


    @GetMapping("/currencies")
    List<Currency> currency();

    @GetMapping("/currency/{name}")
    Currency currency(@PathVariable String name);

    @GetMapping("/currency/id/{id}")
    Currency currencyById(@PathVariable String id);

    @GetMapping("/currency/{name}/{date}")
    Currency currency(
            @PathVariable String name,
            @PathVariable String date
    );

    @GetMapping("/currency") // cotações da mesma moeda
    List<Currency> cotacoes(
            @RequestParam String name,
            @RequestParam String ini,
            @RequestParam String fim
    );
}
