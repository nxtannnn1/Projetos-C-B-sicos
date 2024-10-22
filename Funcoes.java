import java.util.Scanner;

public class Funcoes {

    public static int setOption(Scanner input) {
        System.out.println("(1)-Campo do Cliente\n(2)-Campo do Funcionario");
        return input.nextInt();
    }

    public static String setNome(Scanner input) {
        System.out.println("Informe seu nome: ");
        return input.nextLine();
    }

    public static String setCPF(Scanner input) {
        System.out.println("Informe seu cpf: ");
        return input.nextLine();
    }

    public static String setID(Scanner input) {
        System.out.println("Informe seu ID: ");
        return input.nextLine();
    }

    public static double setSoldo(Scanner input) {
        System.out.println("Informe seu salario: ");
        return input.nextDouble();
    }

}
