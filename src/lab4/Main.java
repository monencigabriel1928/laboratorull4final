package lab4;

//Creati o clasa Person cu proprietatile name si email + gettere si settere.
       // Creati o clasa Student care mosteneste clasa Person si are ca proprietate 'grades' un array de numere intregi.
       // Creati o clasa Profesor care mosteneste clasa Person si are ca proprietate 'courses' un array de string.
        //Instatati toate cele 3 clasa in clasa main si studiati punctele comune si diferentele de pe obiecte

class Person {
    private String name;
    private String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class Student extends Person {
    private int[] grades;

    public Student(String name, String email, int[] grades) {
        super(name, email);
        this.grades = grades;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }
}

class Professor extends Person {
    private String[] courses;

    public Professor(String name, String email, String[] courses) {
        super(name, email);
        this.courses = courses;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
}

public class Main {
    public static void main(String[] args) {
        // Instantierea unui obiect Person
        Person person = new Person("John Doe", "john.doe@example.com");
        System.out.println("Person: " + person.getName() + ", " + person.getEmail());

        // Instantierea unui obiect Student
        int[] studentGrades = {85, 90, 75};
        Student student = new Student("Alice Smith", "alice.smith@example.com", studentGrades);
        System.out.println("Student: " + student.getName() + ", " + student.getEmail() +
                ", Grades: " + java.util.Arrays.toString(student.getGrades()));

        // Instantierea unui obiect Professor
        String[] professorCourses = {"Computer Science", "Mathematics"};
        Professor professor = new Professor("Dr. Brown", "dr.brown@example.com", professorCourses);
        System.out.println("Professor: " + professor.getName() + ", " + professor.getEmail() +
                ", Courses: " + java.util.Arrays.toString(professor.getCourses()));
    }
}
