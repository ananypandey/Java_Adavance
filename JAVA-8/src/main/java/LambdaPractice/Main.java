package LambdaPractice;

public class Main
{
    public static void main(String[] args) {
        System.out.println("Inside Main");

        Student student = (str) -> {
            System.out.println(str);
            return "Operation Performed";
        };
        System.out.println(student.name("Anay"));
    }
}
