package br.com.zup;

/*
Nome, CPF, número de
registro, órgão de lotação e salário.
 */
public class Funcionarios {
    private String nome;
    private String cpf;
    private String numeroRegistro;
    private String orgaoLotacao;
    private double salario;

    public Funcionarios(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroRegistro = numeroRegistro;
        this.orgaoLotacao = orgaoLotacao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getOrgaoLotacao() {
        return orgaoLotacao;
    }

    public void setOrgaoLotacao(String orgaoLotacao) {
        this.orgaoLotacao = orgaoLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double aumentaSalario(){
        return salario * 0.1;
    }
    public void mostrarDados(){
        System.out.println("Nome: " +getNome());
        System.out.println("CPF: " +getCpf());
        System.out.println("Número de Registro: "+getNumeroRegistro());
        System.out.println("Órgão de Lotação: "+getOrgaoLotacao());
        System.out.println("Salário: R$ "+getSalario());
        System.out.println("===========================================");
    }
}
