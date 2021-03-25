import java.util.ArrayList;

public class Student {
    private String name;
    private long id;
    private ArrayList<Integer> grade;

    public Student(String name, long id) {
        this.name = name;
        this.id = id;
        grade = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public ArrayList<Integer> getGrade() {
        return grade;
    }

    public void addGrade(int grade) {

    }

    public double getGradeAverage() {
        double sum = 0;
        for(double studentGrade : grade)
            sum =+ studentGrade;
        return sum / grade.size();
    }
}
