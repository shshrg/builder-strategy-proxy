import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ua.ucu.edu.apps.task1.Student;
import java.time.LocalDate;
import java.util.List;

public class Task1Tests {

    @Test
    public void testStudentBuilder() {
        Student student = Student.builder()
                                 .firstName("Oleksandra")
                                 .lastName("Shergina")
                                 .dob(LocalDate.of(2006, 6, 9))
                                 .mark(90)
                                 .mark(100)
                                 .mouse("MickeyMouse")
                                 .mouse("Jerry")
                                 .height(170)
                                 .build();

        assertEquals("Oleksandra", student.getFirstName());
        assertEquals("Shergina", student.getLastName());
        assertEquals(LocalDate.of(2006, 6, 9), student.getDob());
        assertEquals(List.of(90, 100), student.getGrades());
        assertEquals(List.of("MickeyMouse", "Jerry"), student.getMice());
        assertEquals(170, student.getHeight());
    }
}