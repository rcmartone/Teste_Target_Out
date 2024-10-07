import java.util.Scanner;

public class fiveInvertString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String original = scanner.nextLine();
        String invertida = stringInvertida(original);
        System.out.println("String invertida: " + invertida);
        scanner.close();
    }

    public static String stringInvertida(String str) {
        String invertida = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            invertida += str.charAt(i);
        }
        return invertida;
    }
}
