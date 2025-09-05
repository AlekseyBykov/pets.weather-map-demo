package dev.abykov.pets.livedemo.weathermap.service;

import dev.abykov.pets.livedemo.weathermap.model.WeatherForecastDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class WeatherService {

    private final RestTemplate restTemplate;

    public WeatherService() {
        this.restTemplate = new RestTemplate();
    }

    public WeatherForecastDto getForecast(double latitude, double longitude) {
        String url = UriComponentsBuilder.fromHttpUrl("https://api.open-meteo.com/v1/forecast")
                .queryParam("latitude", latitude)
                .queryParam("longitude", longitude)
                .queryParam("hourly", "temperature_2m")
                .toUriString();

        try {
            return restTemplate.getForObject(url, WeatherForecastDto.class);
        } catch (RestClientException ex) {
            throw new WeatherServiceException("Failed to fetch forecast from Open-Meteo", ex);
        }
    }
}
