package eu.iwha.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
public class SensorServiceTest {

    @Autowired
    private SensorService sensorService;

    @Test
    public void printSensorsTest() {
        //given

        //when

        //then
        sensorService.printSensors();
    }

}