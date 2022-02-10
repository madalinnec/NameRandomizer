import java.util.Collections;
import java.util.List;

public class NameRandomizer {

    public static void randomizeNameList(List<String> names) {
        Collections.shuffle(names);
        System.out.println("This is the list randomized:");
        for (String n : names) {
            System.out.println(n);
        }
    }
}