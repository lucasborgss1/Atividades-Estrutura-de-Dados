import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int soma = 0;

        while (true) {
            N = sc.nextInt();
            if (N == 0) {
                break;
            }
            if (N <= 500) {
                soma += N;
            }
        }
        System.out.println(soma);
    }
}