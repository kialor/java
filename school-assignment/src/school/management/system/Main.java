package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Teacher bob = new Teacher(1, "Bob", 500);
        Teacher bill = new Teacher(2, "Bill", 700);
        Teacher becky = new Teacher(3, "Becky", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(bob);
        teacherList.add(bill);
        teacherList.add(becky);


        Student joe = new Student(1, "Joe", 4 );
        Student jill = new Student(2, "Jill", 6);
        Student judy = new Student(3, "Judy", 3);

        List<Student> studentList = new ArrayList<>();
        studentList.add(joe);
        studentList.add(jill);
        studentList.add(judy);


        School nhs = new School(teacherList,studentList);

        Teacher moe = new Teacher(6, "Megan", 900);
        nhs.addTeacher(moe);


        joe.payFees(5000);
        jill.payFees(6000);
        System.out.println("NHS has earned $" +nhs.getTotalMoneyEarned());


        System.out.println("--MAKING SCHOOL PAY SALARY--");
        bob.receiveSalary(bob.getSalary());
        System.out.println("NHS has spent for salary to " +bob.getName()+ " and now has $" +nhs.getTotalMoneyEarned());

        bill.receiveSalary(bill.getSalary());
        System.out.println("NHS has spent for salary to " +bill.getName()+ " and now has $" +nhs.getTotalMoneyEarned());

        System.out.println(jill);

        bob.receiveSalary(bob.getSalary());
        System.out.println(bob);
    }
}
