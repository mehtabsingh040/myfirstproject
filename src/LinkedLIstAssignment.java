import java.awt.*;
import java.sql.Struct;
import java.util.LinkedList;
import java.util.Map;

public class LinkedLIstAssignment {
    public static void main(String[] args) {
        LinkedList <Integer> numbers = new LinkedList<>();
        numbers.add(5);
        numbers.add(8);
        numbers.add(7);
        numbers.add(8);
        numbers.add(65);
        numbers.add(79);
        System.out.println(numbers);
        System.out.println("The following will add 9 at third position.");
        numbers.add(2,9);
        System.out.println(numbers);

    }
}
