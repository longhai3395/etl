package top.wetech.tools.data_structure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    private int age;

    public void displayPerson() {
        System.out.print("First name: " + firstName);
        System.out.print(", last name: " + lastName);
        System.out.println(", age: " + age);
    }


    @Override
    public int compareTo(@NotNull Person person) {
        return Integer.compare(age, person.age);
    }
}