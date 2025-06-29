import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Seja Bem-vindo ao Contador!");

        System.out.print("Digite o primeiro parâmetro: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int n2 = sc.nextInt();

        try {
            contador(n1, n2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    static void contador(int n1, int n2) throws ParametrosInvalidosException {
        if (n1 < n2) {
            int contagem = n2 - n1;
            for (int i = 1; i <= contagem; i ++) {
                System.out.println("Imprimindo o número " + i);
            }
        } else if (n1 == n2){
            throw new ParametrosInvalidosException("Os parâmetro não podem ser iguais!");
        } else {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
        }

    }

}