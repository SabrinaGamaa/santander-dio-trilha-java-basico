import entities.Conta;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println(" ==== Agencia Bancaria ==== ");
            System.out.print("Conta: ");
            int numero = sc.nextInt();
            sc.nextLine();
            System.out.print("Agencia: ");
            String agencia = sc.nextLine();
            System.out.print("Nome Cliente: ");
            String nomeCliente = sc.nextLine();
            System.out.print("Digite o valor do seu deposito: ");
            double saldo = sc.nextDouble();
            Conta conta = new Conta(numero, agencia, nomeCliente, saldo);

            System.out.println(conta.toString());

        } catch (InputMismatchException e) {
            System.out.println("ERRO: Digitou dados inválidos");
            System.out.println("Reinicie.");
        } catch (Exception e) {
            System.out.println("Erro inesperado. Tente novamente!");
        }

        sc.close();
    }
}