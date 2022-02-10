import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class NameListCreator {

    public static List<String> createNamesList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many names do you want to enter?");
        int namesNumber = 0;
        try {
            namesNumber = sc.nextInt();
        } catch (InputMismatchException ime) {
            throw new InputMismatchException("Look what you did. Please type a positive int!");
        }
        if (namesNumber < 1) {
            throw new RuntimeException("You must have done something wrong since this came up. Try entering a positive int this time.");
        }
        List<String> names = new ArrayList<>();
        for (int i = 0; i < namesNumber; i++) {
            int aux = i + 1;
            System.out.println("Type in the " + (aux) + " name: ");
            names.add(sc.next());
        }
        return names;
    }
}