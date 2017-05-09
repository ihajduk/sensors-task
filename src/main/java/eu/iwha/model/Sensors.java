package eu.iwha.model;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "sensors")
public class Sensors {
    @Getter
    private List<Sensor> sensorList;
}
