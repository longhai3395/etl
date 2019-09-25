package top.wetech.tools.data_structure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Comparable<Student>{
    private long studentId;
    private String name;
    private boolean gender;
    private int grade;

    @Override
    public int compareTo(@NotNull Student o) {
        return Integer.compare(grade, o.grade);
    }
}
