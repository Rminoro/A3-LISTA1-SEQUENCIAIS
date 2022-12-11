import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float numero = 0;

        Scanner S = new Scanner(System.in);
        System.out.println("Digite o numero");
        numero = S.nextFloat();
        System.out.println("O numero digitado foi " + numero);
    }
}
