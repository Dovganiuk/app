package com.swapi.test;

import org.example.http.HttpClient;
import org.example.http.HttpResponse;
import org.junit.jupiter.api.Test;
import org.example.model.GetPersonResponse;
import org.example.model.GetPlanetResponse;

import static org.assertj.core.api.Assertions.assertThat;


public class TestPerson {
    //Написали адресу АПІ
    private final String BASE_URL = "https://swapi.dev/api";
    //Створили новий екземпляр класу HttpClient
    private final HttpClient httpClient = new HttpClient();

    @Test
    void testGetPerson() {
//Відправляємо запит в АПІ
        HttpResponse response = httpClient.get("/people/1", BASE_URL);
//Отриману відповідь перетворюємо в об'єкт GetPersonResponse
        GetPersonResponse getPersonResponse = response.json(GetPersonResponse.class);
//Звіряю отриману відповідь getPersonResponse.getName() з "Luke Skywalker"
        assertThat(getPersonResponse.getName()).isEqualTo("Luke Skywalker");
    }


    @Test
    void testGetPlanet() {
        HttpResponse httpResponse = httpClient.get("/planets/3", BASE_URL);
        GetPlanetResponse getPlanetResponse = httpResponse.json(GetPlanetResponse.class);
        assertThat(getPlanetResponse.getName()).isEqualTo("Yavin IV");
    }
}


