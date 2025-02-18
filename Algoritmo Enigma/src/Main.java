import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        String conjuntoCaracteres = sc.nextLine();
        if (conjuntoCaracteres.length() != N) {
            System.out.println("O numero de caracteres nao corresponde a N");
            return;
        }

        String palavra = sc.nextLine();

        Map<Character, Integer> mapaDoConjunto = new HashMap<>();
        for (char c : conjuntoCaracteres.toCharArray()) {
            mapaDoConjunto.put(c, mapaDoConjunto.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> mapaDaPalavra = new HashMap<>();
        for (char c : palavra.toCharArray()) {
            mapaDaPalavra.put(c, mapaDaPalavra.getOrDefault(c, 0) + 1);
        }

        boolean encontrada = true;
        for (Map.Entry<Character, Integer> entry : mapaDaPalavra.entrySet()) {
            char letra = entry.getKey();
            int qtdNecessaria = entry.getValue();
            if (mapaDoConjunto.getOrDefault(letra, 0) < qtdNecessaria) {
                encontrada = false;
                break;
            }
        }

        if (encontrada) {
            System.out.println("Palavra chave encontrada");
        } else {
            System.out.println("Nenhuma informacao util");
        }
    }
}
