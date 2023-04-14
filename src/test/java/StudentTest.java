import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    Student anthony;

    @Before
    public void init() {
    anthony = new Student(1, "Anthony Chhor");

    anthony.addGrade(95);
    anthony.addGrade(90);
    anthony.addGrade(85);
    anthony.addGrade(98);
    }

    @Test
    public void ifStudentCanBeCreated(){
       assertEquals("Anthony Chhor", anthony.getName());
       assertEquals(1, anthony.getId());
    }

    @Test
    public void ifTestGradeCanBeInputted(){
        assertSame(95, anthony.getGrades().get(0));
    }

    @Test
    public void ifTestScoresGetAveraged(){
        assertEquals(92, anthony.getGradeAverage(), 0);
    }


}

