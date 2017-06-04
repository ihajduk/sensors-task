package eu.iwha.service;

import eu.iwha.model.SensorsDTO;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class SensorMappingTest {

    private static final String url = "https://raw.githubusercontent.com/ihajduk/sensors-task/master/src/main/resources/application.yml";
    private RestTemplate restTemplate = new RestTemplate();

    @Test
    public void shouldGetSensorsMap(){
        SensorsDTO sensors = restTemplate.getForObject(url, SensorsDTO.class);
        sensors.getSensors().forEach(System.out::println);

//        ResponseEntity<Object> sensors = restTemplate.getForEntity(url, Object.class);
//        System.out.println(sensors.getBody());

    }
}
