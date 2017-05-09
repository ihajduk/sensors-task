package eu.iwha.model;

import lombok.Data;

@Data
public class Sensor {
    int id;
    String type;
    String name;
    int value;
    int min_value;
    int max_value;
}
