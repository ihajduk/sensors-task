package eu.iwha.model;

import lombok.Data;

@Data
public class Sensor {
    private String id;
    private String masterSensorId;
    private String engine;
    private String location;
    private String type;
    private String name;
    private int value;
    private int min_value;
    private int max_value;
}
