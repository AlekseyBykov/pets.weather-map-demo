package dev.abykov.pets.livedemo.weathermap.service;

/**
 * Custom exception for errors during weather forecast fetching.
 */
public class WeatherServiceException extends RuntimeException {

    public WeatherServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
