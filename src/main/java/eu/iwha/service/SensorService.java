package eu.iwha.service;

import eu.iwha.model.Sensors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SensorService {

    private Sensors sensors;

    @Autowired
    public SensorService(Sensors sensors) {
        this.sensors = sensors;
    }

    public void printSensors(){
        sensors.getSensorList().forEach(System.out::println);
    }
}
