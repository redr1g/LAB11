package ua.edu.ucu.apps.Task1;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

@ToString
@SuperBuilder
public class User {
    private String name;
    private int age;
    private String gender;
    private float weight;
    private float height;
}
