package maventeste;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Data @AllArgsConstructor @NoArgsConstructor @Entity

public class Person {

    @Id
    private int code;
    private String name;
    private String city;
    private int age;
    private double salary;
}

