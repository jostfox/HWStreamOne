import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApp {

    public static void main(String[] args) {

        List<String> listOne = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
        List<String> listTwo = Arrays.asList("a1", "b5", "a2", "b4");

        //Stream one. Straight list
        printTask(1);
        System.out.println("Straight order: " + listOne.stream().collect(Collectors.toSet()));

        //Stream two. Reversed list
        System.out.println("Reversed order: " + listOne.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList());

        printTask(2);
        System.out.println("The smallest element: " + listTwo.stream()
                .min(Comparator.naturalOrder())
                .stream().toList());

    }

    public static void printTask(int number) {
        System.out.printf("\nTask %d", number);
        System.out.println("\n===================");
    }
}
