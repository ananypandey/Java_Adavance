package StreamsAverage;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class AvergeofalistusingStreams
{
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        System.out.println("Doubling the list using the stream");
        System.out.println(arrayList.stream().map(i->i*2).collect(Collectors.toList()));
        System.out.println("Averaging the list using the stream");
        System.out.println(arrayList.stream().mapToDouble(Integer::doubleValue).average().isPresent());
    }
}
