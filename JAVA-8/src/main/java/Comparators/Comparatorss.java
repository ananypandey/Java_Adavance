package Comparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Student
{
    int rollNo;
    String name;
    String address;

    public Student(int rollNo, String name, String address)
    {
        this.rollNo= rollNo;
        this.name=name;
        this.address=address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
class SortByrRoll implements Comparator<Student>
{

    @Override
    public int compare(Student o1, Student o2) {
        System.out.println("Hi");
        if(o1.rollNo>o2.rollNo)
            return 1;
        else
            return -1;
    }
}
public class Comparatorss
{
    public static void main(String[] args) {
        System.out.println("Inside Main");
        Student student = new Student(5,"Anany","A-1203,Navi Mumbai");
        Student obj1 = new Student(1,"Anay","Kharghar");
        Student obj2 = new Student(22,"Amey","Kharghar");
        Student obj3 = new Student(3,"AAA","Kharghar");
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(student);
        arrayList.add(obj1);
        arrayList.add(obj2);
        arrayList.add(obj3);
        Comparator<Student> comparator = new SortByrRoll();
        Collections.sort(arrayList,comparator);
        System.out.println(arrayList);
    }
}
