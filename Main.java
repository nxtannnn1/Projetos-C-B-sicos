import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option = Funcoes.setOption(input);

    if (option == 1){
        input.nextLine();
        String nome = Funcoes.setNome(input);
        String cpf = Funcoes.setCPF(input);

        Pessoa pessoa1 = new Pessoa(nome, cpf);

        pessoa1.showInfos();
    }

    else if (option == 2){
        input.nextLine();
        String nome = Funcoes.setNome(input);
        String cpf = Funcoes.setCPF(input);
        String id = Funcoes.setID(input);
        double saldo = Funcoes.setSoldo(input);

        Funcionarios funcionario1 = new Funcionarios(nome, cpf, id, saldo);

        funcionario1.showInfos();
    }

        /*String nome = Funcoes.setNome(input);
        String cpf = Funcoes.setCPF(input);

        Pessoa pessoa1 = new Pessoa(nome, cpf);

        pessoa1.showInfos();*/

        
    }
}