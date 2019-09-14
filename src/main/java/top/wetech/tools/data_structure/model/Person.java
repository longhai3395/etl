package top.wetech.tools.data_structure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void displayPerson() {
        System.out.print("First name: " + firstName);
        System.out.print(", last name: " + lastName);
        System.out.println(", age: " + age);
    }

}