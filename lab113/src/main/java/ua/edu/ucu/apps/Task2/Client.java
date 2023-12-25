package ua.edu.ucu.apps.Task2;

import lombok.Getter;

@Getter
public class Client {
    private static int counter = 0;
    private int id;
    private String name;
    private int age;
    private Gender gender;
    private String email;

    public Client(String name, int age, Gender gender, String email) {
        this.id = counter++;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }
}
