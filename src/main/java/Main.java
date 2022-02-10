import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> names = NameListCreator.createNamesList();
        NameRandomizer.randomizeNameList(names);
    }
}