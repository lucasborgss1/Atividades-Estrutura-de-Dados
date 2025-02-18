import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pokedex = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            pokedex.add(scanner.nextInt());
        }

        for (int i = 0; i < 3; i++) {
            pokedex.set(i, pokedex.get(i) + scanner.nextInt());
        }

        System.out.println(pokedex.get(0) + " " + pokedex.get(1) + " " + pokedex.get(2));

        scanner.close();
    }
}
