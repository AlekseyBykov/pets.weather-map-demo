package dev.abykov.pets.livedemo.weathermap.api;

import dev.abykov.pets.livedemo.weathermap.model.WeatherForecastDto;
import dev.abykov.pets.livedemo.weathermap.service.WeatherService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/")
    public String index() {
        return "index"; // templates/index.html
    }

    @GetMapping("/forecast")
    @ResponseBody
    public WeatherForecastDto getForecast(
            @RequestParam("lat") double latitude,
            @RequestParam("lon") double longitude) {
        return weatherService.getForecast(latitude, longitude);
    }
}
