package TMSlesson15_h;

import java.util.*;

public class StudentThirdTask {

    public static void main(String[] args) {

        int [] mas1 = {5,5,8,4};
        int [] mas2 = {5,2,8,4};
        int [] mas3 = {5,3,2,1};
        int [] mas4 = {5,7,10,4};

        StudentThirdTask s1 = new StudentThirdTask("Антон",473601,2,mas1);
        StudentThirdTask s2 = new StudentThirdTask("Даша",473602,1,mas2);
        StudentThirdTask s3 = new StudentThirdTask("Влад",473603,4,mas3);
        StudentThirdTask s4 = new StudentThirdTask("Petr",473603,3,mas4);

        List<StudentThirdTask> studentsList = new ArrayList<>();
        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(s3);
        studentsList.add(s4);

        deleteStudents(studentsList);
        printStudents(studentsList);


    }

    String name;
    int group;
    int course;
    int [] marks;

    public StudentThirdTask(String name,int group,int course,int [] marks) {

        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;

    }

    @Override
    public String toString() {
        return "StudentThirdTask{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }

    public static double AverageMark(StudentThirdTask s) {

        if (s.marks == null || s.marks.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int mark : s.marks) {
            sum += mark;
        }
        return (double) sum / s.marks.length;

    }

    public static void deleteStudents(List<StudentThirdTask> students) {
        List<StudentThirdTask> toRemove = new ArrayList<>();

        if(students.isEmpty()) {
            System.out.println("Нету студентов в списке");
            return;
        }

        for (StudentThirdTask student: students) {
            if (student.marks.length == 0) {
                System.out.println("Студент " + student.name + " без оценок");
                continue;
            }

            if (AverageMark(student) < 3) {
                toRemove.add(student);
            } else {
                student.course++;
            }
        }

        students.removeAll(toRemove);
    }

    public static void printStudents(List<StudentThirdTask> students) {

        for (StudentThirdTask s:students) {

            System.out.println(s.toString());

        }

    }

}
