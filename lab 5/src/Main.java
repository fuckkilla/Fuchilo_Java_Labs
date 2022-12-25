import People.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person basicPerson = new Person("Bohdan","Fuchilo","18");
        Person studentPerson = new Student("Bohdan","Fuchilo","18","K19.1","0512");
        Person lecturePerson = new Lecturer("Bohdan","Fuchilo","18", "OOP","5000");
        ArrayList<Person> myArrayForTest = new ArrayList<Person>();

        myArrayForTest.add(basicPerson);
        myArrayForTest.add(studentPerson);
        myArrayForTest.add(lecturePerson);

        for(Person p:myArrayForTest) {
            if(p != null) {
                p.printInfo();
            } else if (p instanceof Student) {
                Student s = (Student) p;
                s.printInfo();
            } else if (p instanceof Lecturer) {
                Lecturer l = (Lecturer) p;
                l.printInfo();
            }
        }
    }
}