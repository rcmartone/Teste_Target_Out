import java.util.Scanner;
public class twoFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int num = scanner.nextInt();
        if (fibonacci(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }
        scanner.close();
    }
    public static boolean fibonacci(int num) {
        int a = 0, b = 1;
        if (num == a || num == b) {
            return true;
        }
        int proximoNum = a + b;
        while (proximoNum <= num) {
            if (proximoNum == num) {
                return true;
            }
            a = b;
            b = proximoNum;
            proximoNum = a + b;
        }
        return false;
    }
}
