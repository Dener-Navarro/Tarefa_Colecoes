import java.util.Scanner;

public class NomesOrdenados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os nomes separados por vírgula: ");
        String input = scanner.nextLine();

        String[] nomes = input.split(",");

        // Chamando a função de ordenação Bubble Sort
        bubbleSort(nomes);

        System.out.println("Nomes organizados: ");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print(nomes[i]);
            if (i < nomes.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        String aux;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
    }
}
