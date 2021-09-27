package br.com.zup;

public class FuncionariosAdministrativos extends Funcionarios{
    private String funcaoAdm;
    private String senioridade;

    public FuncionariosAdministrativos(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario, String funcaoAdm, String senioridade) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.funcaoAdm = funcaoAdm;
        this.senioridade = senioridade;
    }

    public String getFuncaoAdm() {
        return funcaoAdm;
    }

    public void setFuncaoAdm(String funcaoAdm) {
        this.funcaoAdm = funcaoAdm;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }
}
