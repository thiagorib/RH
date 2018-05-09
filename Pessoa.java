package rh;

public class Pessoa {
    private int id;
    private String nome;
    private short idade;
    private char sexo;
    public Pessoa(int id, String nome, short idade, char sexo) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    public Pessoa(int id, String nome) {
        this(id, nome, (short)0, '?');
    }
    public void imprimir() {
        System.out.printf("id = %d%nnome = %s%nidade = %d%nsexo = %c%n",
            id, nome, idade, sexo);
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public short getIdade() {
        return idade;
    }
    public char getSexo() {
        return sexo;
    }
    public void setIdade(short value) {
        idade = value;
    }
}
    

