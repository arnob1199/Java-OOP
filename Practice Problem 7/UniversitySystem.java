import java.util.*;

class Student {

    long id;
    String name;
    String program;

    public Student(long id, String name, String program) {

        this.id = id;
        this.name = name;
        this.program = program;
    }

    public String toString() {

        return "Student[ID: " + id + ", Name: " + name + ", Program: " + program + "]";
    }
}

class Instructor {

    long id;
    String name;
    String department;
    String title;

    public Instructor(long id, String name, String department, String title) {

        this.id = id;
        this.name = name;
        this.department = department;
        this.title = title;
    }

    public String toString() {

        return "Instructor[ID: " + id + ", Name: " + name + ", Department: " + department + ", Title: " + title + "]";
    }
}

class Course {

    long id;
    String syllabus;
    String title;
    String credits;
    String prerequisite;

    public Course(long id, String syllabus, String title, String credits, String prerequisite) {

        this.id = id;
        this.syllabus = syllabus;
        this.title = title;
        this.credits = credits;
        this.prerequisite = prerequisite;
    }

    public String toString() {
        
        return "Course[ID: " + id + ", Title: " + title + ", Credits: " + credits + "]";
    }
}

class CourseOffering {

    long studentID;
    long instructorID;
    long courseID;
    Date time;
    int sectionNo;
    long roomID;
    int year;
    String semester;

    public CourseOffering(long studentID, long instructorID, long courseID, Date time,
                          int sectionNo, long roomID, int year, String semester) {

        this.studentID = studentID;
        this.instructorID = instructorID;
        this.courseID = courseID;
        this.time = time;
        this.sectionNo = sectionNo;
        this.roomID = roomID;
        this.year = year;
        this.semester = semester;
    }

    public String toString() {

        return "CourseOffering[StudentID: " + studentID + ", InstructorID: " + instructorID +
                ", CourseID: " + courseID + ", Section: " + sectionNo + ", RoomID: " + roomID +
                ", Year: " + year + ", Semester: " + semester + ", Time: " + time + "]";
    }
}

public class UniversitySystem {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Alice Johnson", "Computer Science");
        Student s2 = new Student(102, "Bob Smith", "Information Systems");

        Instructor i1 = new Instructor(201, "Dr. Alan Turing", "CS", "Professor");
        Instructor i2 = new Instructor(202, "Dr. Ada Lovelace", "Math", "Lecturer");

        Course c1 = new Course(301, "Data Structures", "DS", "3", "Intro to CS");
        Course c2 = new Course(302, "Database Systems", "DB", "3", "Data Structures");

        CourseOffering co1 = new CourseOffering(s1.id, i1.id, c1.id, new Date(), 1, 1010, 2025, "FA");
        CourseOffering co2 = new CourseOffering(s2.id, i2.id, c2.id, new Date(), 2, 1020, 2025, "FA");

        System.out.println(s1);
        System.out.println(i1);
        System.out.println(c1);
        System.out.println(co1);
        System.out.println();

        System.out.println(s2);
        System.out.println(i2);
        System.out.println(c2);
        System.out.println(co2);
    }
}