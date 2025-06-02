package com.energiainteligente.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ClimaClient {

    private String apiKey;

    public String consultarPrevisao(String cidade) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + cidade +
                     "&appid=" + apiKey + "&lang=pt_br&units=metric";
        return restTemplate.getForObject(url, String.class);
    }
}
