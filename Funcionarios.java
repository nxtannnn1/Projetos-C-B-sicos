public class Funcionarios extends Pessoa {

    protected String id;
    protected double salario;

    public Funcionarios(String nome, String cpf, String id, double salario) {
        super(nome, cpf);
        this.id = id;
        this.salario = salario;
    }

    @Override

    public void showInfos() {
        System.out.println("Nome: " + nome + "\nCPF: " + cpf + "\nID: " + id + "\nSalario: R$ " + salario);
    }
}
