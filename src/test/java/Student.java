import java.util.ArrayList;
public class Student {
    private final String name;
    private final long id;
    private final ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();


    }
    // returns the student's id
    public long getId(){
        return this.id;
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        this.grades.add(grade);
    }

    // returns the list of grades
    public double getGradeAverage(){
        double result = 0;
        for (int grade : this.getGrades()) {
            result += grade;
        }
        return result / this.getGrades().size();
    }

    public ArrayList<Integer> getGrades(){
        return this.grades;
    }
}
