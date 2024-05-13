package com.example.restservice.greeting;

import org.springframework.web.client.RestClient;

public class ViaCEPInfo {
    private String logradouro;
    private String cep;
    private String bairro;
    private String localidade;

    ViaCEPInfo(String logradouro, String cep, String bairro, String localidade) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.localidade = localidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getCep() {
        return cep;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public static ViaCEPInfo getInfo(String cep) {
        String uri = String.format("https://viacep.com.br/ws/%s/json/", cep);
        ViaCEPInfo result = RestClient.create().get().uri(uri).retrieve().body(ViaCEPInfo.class);
        return new ViaCEPInfo(result.logradouro, result.cep, result.bairro, result.localidade);
    }
}
