import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person implements Serializable {

    private int studentID;
    private List<Grade> grades;

    public Student(String firstName, String lastName, String emailAddress, String socialSecurityNumber, int studentID) {
        super(firstName, lastName, emailAddress, socialSecurityNumber);
        this.studentID = studentID;
        this.grades = new ArrayList<>();
    }

    public static Student createStudent(String firstName, String lastName, String emailAddress,
                                        String socialSecurityNumber, int studentID) {
        return new Student(firstName, lastName, emailAddress, socialSecurityNumber, studentID);
    }

    public static void createManyStudents(ArrayList<Student> studentList) {
        studentList.add(createStudent("Melvin", "Davis", "melvin.davis@skola.se", "20010315-4821", 4357));
        studentList.add(createStudent("Anna", "Larsson", "anna.larsson@skola.se", "20000922-7394", 58214));
        studentList.add(createStudent("Erik", "Johansson", "erik.johansson@skola.se", "20020108-1659", 73920));
        studentList.add(createStudent("Sara", "Nilsson", "sara.nilsson@skola.se", "20030430-8427", 46195));
        studentList.add(createStudent("Lucas", "Berg", "lucas.berg@skola.se", "20011219-3906", 80431));
        studentList.add(createStudent("Maja", "Andersson", "maja.andersson@skola.se", "20000605-2718", 29574));
        studentList.add(createStudent("Oliver", "Karlsson", "oliver.karlsson@skola.se", "20021014-6843", 67382));
        studentList.add(createStudent("Elin", "Svensson", "elin.svensson@skola.se", "20040227-9185", 91846));
        studentList.add(createStudent("Noah", "Pettersson", "noah.pettersson@skola.se", "20010903-4507", 34759));
        studentList.add(createStudent("Emma", "Lind", "emma.lind@skola.se", "20030518-7362", 56028));
        studentList.add(createStudent("William", "Holm", "william.holm@skola.se", "20001211-5928", 78214));
        studentList.add(createStudent("Ida", "Nyström", "ida.nystrom@skola.se", "20020406-1847", 42680));
        studentList.add(createStudent("Leo", "Axelsson", "leo.axelsson@skola.se", "20040129-8634", 63971));
        studentList.add(createStudent("Alva", "Ekström", "alva.ekstrom@skola.se", "20000721-4096", 85062));
        studentList.add(createStudent("Elias", "Hansen", "elias.hansen@skola.se", "20031002-7518", 19475));
        studentList.add(createStudent("Frida", "Björk", "frida.bjork@skola.se", "20010217-6284", 70593));
        studentList.add(createStudent("Anton", "Wallin", "anton.wallin@skola.se", "20021209-9471", 36841));
        studentList.add(createStudent("Nora", "Forsberg", "nora.forsberg@skola.se", "20040425-3158", 92457));
        studentList.add(createStudent("Isak", "Lund", "isak.lund@skola.se", "20001107-8620", 58734));
        studentList.add(createStudent("Tilda", "Sandberg", "tilda.sandberg@skola.se", "20030814-5409", 24186));
        studentList.add(createStudent("Hugo", "Engström", "hugo.engstrom@skola.se", "20020331-7746", 66902));
    }

    public void addGrade(Course course, String grade) {
        for (Grade g : grades) {
            if (g.getCourse().equals(course)) {
                g.setGrade(grade);
                return;
            }
        }
        Grade newGrade = new Grade(course, grade);
        grades.add(newGrade);
    }

    public String getGrade(Course course) {
        for (Grade grade : grades) {
            if (grade.getCourse().equals(course)) {
                return "(" + grade.getGrade() + ")";
            }
        }
        return "(-)";
    }

    public int getStudentID() {
        return studentID;
    }

}
