package rh;

public class Funcionario extends Pessoa {
    private double salario;
    public Funcionario(int id, String nome, short idade, char sexo, double salario) {
        super(id, nome, idade, sexo);
        this.salario = salario;
    }
    public Funcionario(int id, String nome) {
        this(id, nome, (short)0, '?', 0.0);
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.printf("salário = $%,.2f%n", salario);
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double value) {
        salario = value;
    }
    public void reajustarSalario(double percentual) {
        salario *= percentual / 100.0 + 1.0;
    }
}