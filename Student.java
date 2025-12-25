import java.util.ArrayList;
import java.util.HashMap;

public class Student extends Person {
    private String id;
    private String department;
    private double gpa;
    private int level;
    private int age;
    private ArrayList<String> courses;
    private HashMap<String, Integer> grades;
    HashMap<String, Student> students ;
    HashMap<String, ArrayList<Student>> courseStudents ;

    public Student() {
        super();

    }
    public Student(String name, String email, String address, String city, double gpa, int level , String id, String department, int age) {
        super(name, email, address, city);
        this.gpa = gpa;
        this.level = level;
        this.id = id;
        this.age=age;
        this.department = department;
        courses = new ArrayList<>();
        grades = new HashMap<>();
        students = new HashMap<>();
        courseStudents = new HashMap<>();
    }


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public void addCourse(String courseName) {
        courses.add(courseName);
    }

    public void viewCourses() {
        System.out.println("Courses of " + getName() + ":");
        for (String course : courses) {
            System.out.println("- " + course);
        }
    }

    public void addGrade(String courseName, int grade) {
        grades.put(courseName, grade);
    }

    public void viewGrades() {
        System.out.println("Grades of " + getName() + ":");
        for (String course : grades.keySet()) {
            System.out.println(course + " : " + grades.get(course));
        }
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public HashMap<String, Integer> getGrades() {
        return grades;
    }

}
