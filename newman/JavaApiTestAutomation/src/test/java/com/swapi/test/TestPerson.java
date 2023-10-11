package com.swapi.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.example.http.HttpClient;
import org.example.http.HttpResponse;
import org.junit.jupiter.api.Test;
import org_example_model.GetPersonResponse;
import org_example_model.GetPlanetResponse;

import static org.assertj.core.api.Assertions.assertThat;


public class TestPerson {
    private final String BASE_URL = "https://swapi.dev/api";

    private final HttpClient httpClient = new HttpClient(BASE_URL);

    @Test
    void testGetPerson() {
        HttpResponse response = httpClient.get("/people/1", BASE_URL);
        GetPersonResponse getPersonResponse = response.json(GetPersonResponse.class);
        assertThat(getPersonResponse.getName()).isEqualTo("Luke Skywalker");
    }


     @Test
     void testGetPlanet() {
         HttpResponse httpResponse = httpClient.get("/planets/3", BASE_URL);
         GetPlanetResponse getPlanetResponse = httpResponse.json(GetPlanetResponse.class);
         assertThat(getPlanetResponse.getName()).isEqualTo("Yavin IV");
      }
}


