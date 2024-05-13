package com.example.restservice.greeting;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViaCEPController {
    @GetMapping("/viacep")
    @Cacheable("ceps")
    public ViaCEPInfo info(@RequestParam(value = "cep") String cep) {
        return ViaCEPInfo.getInfo(cep);
    }
}
