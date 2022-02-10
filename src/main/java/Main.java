import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many names do you want to enter?");
        int namesNumber = 0;
        try{
            namesNumber = sc.nextInt();
        }catch(InputMismatchException ime){
            System.out.println("Look what you did: " + ime + " Please type a positive int!");
        }
        if(namesNumber < 1){
            throw new RuntimeException("You must have done something wrong since this came up. Try again.");
        }
        List<String> names = new ArrayList<>();
        for (int i = 0; i < namesNumber; i++) {
            int aux = i+1;
            System.out.println("Type in the " + (aux) + " name: ");
            names.add(sc.next());
        }
        Collections.shuffle(names);
        for(String n:names){
            System.out.println(n);
        }
    }
}