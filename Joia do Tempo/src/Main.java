import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean houveVitoria = false;

        while (true) {
            String entrada = sc.nextLine().trim();

            if (entrada.equals("FIM FIM FIM")) {
                break;
            }

            String[] respostas = entrada.split(" ");
            if (respostas.length != 3) {
                System.out.println("Entrada inválida. Tente novamente.");
                continue;
            }

            String HF = respostas[0];
            String HDF = respostas[1];
            String HA = respostas[2];

            if (HF.equals("NAO") && HDF.equals("SIM") && HA.equals("NAO")) {
                houveVitoria = true;
            }
        }

        System.out.println(houveVitoria ? "VITORIA" : "DERROTA");

        sc.close();
    }
}
