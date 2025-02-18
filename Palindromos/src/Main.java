import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        sc.close();

        String palavraInvertida = new StringBuilder(palavra).reverse().toString();

        if (palavra.equals(palavraInvertida)){
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }
    }
}