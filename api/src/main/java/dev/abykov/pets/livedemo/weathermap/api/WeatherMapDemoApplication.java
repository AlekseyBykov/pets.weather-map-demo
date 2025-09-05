package dev.abykov.pets.livedemo.weathermap.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "dev.abykov.pets.livedemo.weathermap")
public class WeatherMapDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherMapDemoApplication.class, args);
    }
}
