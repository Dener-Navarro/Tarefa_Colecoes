import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class NomesPorGenero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();

        System.out.print("Digite os nomes no formato 'Nome-Gênero' separados por vírgula: ");
        String input = scanner.nextLine();

        String[] nomesGeneros = input.split(",");

        for (String nomeGenero : nomesGeneros) {
            String[] partes = nomeGenero.trim().split("-");

            if (partes.length != 2) {
                System.out.println("Formato inválido. Use o formato 'Nome-Gênero'.");
                continue;
            }

            String nome = partes[0].trim();
            String genero = partes[1].trim().toUpperCase();

            if (genero.equals("M")) {
                nomesMasculinos.add(nome);
            } else if (genero.equals("F")) {
                nomesFemininos.add(nome);
            } else {
                System.out.println("Gênero inválido. Use 'M' para Masculino ou 'F' para Feminino.");
            }
        }

        System.out.println("\nNomes Masculinos:");
        for (String nome : nomesMasculinos) {
            System.out.println(nome);
        }

        System.out.println("\nNomes Femininos:");
        for (String nome : nomesFemininos) {
            System.out.println(nome);
        }
    }
}
