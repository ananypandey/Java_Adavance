package LambdaXComparator;

import Mothod_Refrence.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Developer
{
    String name;
    int emIp;
    String workPlace;

    public Developer(String name, int emIp, String workPlace) {
        this.name = name;
        this.emIp = emIp;
        this.workPlace = workPlace;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", emIp=" + emIp +
                ", workPlace='" + workPlace + '\'' +
                '}';
    }
}
class SortByDeveloperId implements Comparator<Developer>
{
    @Override
    public int compare(Developer o1, Developer o2) {
        if(o1.emIp>o2.emIp)
            return 1;
        else
            return -1;
    }
}
public class LambdaAndComparator
{
    public static void main(String[] args) {
        System.out.println("Inside Main");
        Developer dev1 = new Developer("Anay",1,"Bangalore");
        Developer dev2 = new Developer("Amey",24,"Kharghar");
        Developer dev3 = new Developer("Disha",3,"Kharghar");
        Developer dev4 = new Developer("Mukund",4,"Bangalore");
        ArrayList<Developer> arrayList = new ArrayList<>();
        arrayList.add(dev1);
        arrayList.add(dev2);
        arrayList.add(dev3);
        arrayList.add(dev4);
        System.out.println("-------------------Normal Using Of Comparator--------------------");
        Comparator<Developer> comparator = new SortByDeveloperId();
        Collections.sort(arrayList,new SortByDeveloperId());
        System.out.println(arrayList);
        System.out.println("----------------Sorting using Comparator--------------");
        arrayList.add(new Developer("Aghni",2,"Heaven"));
        Collections.sort(arrayList, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                if(o1.emIp>o2.emIp)
                    return 1;
                return -1;
            }
        });
        System.out.println(arrayList);
        System.out.println("----------------Sorting using lambda Comparator----------------");
        arrayList.add(new Developer("Vayu",10,"Heaven"));
        Comparator<Developer> comparator1 = (Developer o1,Developer o2)->
        {
            if(o1.emIp> o2.emIp)
                return 1;
            return -1;
        };
        Collections.sort(arrayList,comparator1);
        System.out.println(arrayList);

    }
}
