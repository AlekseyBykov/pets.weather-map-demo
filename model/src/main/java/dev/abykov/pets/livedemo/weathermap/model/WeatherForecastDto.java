package dev.abykov.pets.livedemo.weathermap.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * DTO for Open-Meteo API response.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherForecastDto {

    private Hourly hourly;

    public Hourly getHourly() {
        return hourly;
    }

    public void setHourly(Hourly hourly) {
        this.hourly = hourly;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Hourly {
        private List<String> time;

        @JsonProperty("temperature_2m")
        private List<Double> temperature2m;

        public List<String> getTime() {
            return time;
        }

        public void setTime(List<String> time) {
            this.time = time;
        }

        public List<Double> getTemperature2m() {
            return temperature2m;
        }

        public void setTemperature2m(List<Double> temperature2m) {
            this.temperature2m = temperature2m;
        }
    }
}
