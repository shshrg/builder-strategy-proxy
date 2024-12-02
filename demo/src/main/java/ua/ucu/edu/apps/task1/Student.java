package ua.ucu.edu.apps.task1;

import java.time.LocalDate;
import java.util.List;

import lombok.Getter;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter @ToString @SuperBuilder
public class Student extends Human {
    private LocalDate dob;
    @Singular("mark")
    private List<Integer> grades;
    @Singular("mouse")
    private List<String> mice;
    private int height;    
}
