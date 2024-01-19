package org.nikita;

public class StudentMain {
    public static void main(String [] args){
        Student student = new Student(1, "Nikita", "Nikitov", 1, 29, 'M',
                "qqq@mail.ru", true);
        student.printInfo();
        Student student1 = new Student();
        student1.printInfo();
        Student student2 = new Student(1,"Dima", "Petrov", 3);
        student2.printInfo();
    }
}
class Student{

    int id;
    String name;
    String surname;
    int course;
    int age;
    char sex;
    String email;
    boolean haveScholarship;

    Student(int id, String name, String surname, int course, int age,
    char sex, String email, boolean haveScholarship){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.haveScholarship = haveScholarship;
    }

    Student(int id, String name, String surname, int course){
        this(id, name, surname, course, 0, '0', null, false );
    }

    Student(){}

    public void printInfo(){
        System.out.println("Номер студента: " + id);
        System.out.println("Имя студента: " + name);
        System.out.println("Фамилия студента: " + surname);
        System.out.println("Курс: " + course);
        System.out.println("Возраст студента: " + age);
        System.out.println("Электронная почта: " + email);
        System.out.println("Имеет ли студент стипендию: " + haveScholarship);
        System.out.println();
    }

}
