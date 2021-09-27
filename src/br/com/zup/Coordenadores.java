package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends Funcionarios {
    private List<Professores> professoresSupervisionados = new ArrayList<>();

    public Coordenadores(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
    }

    public void adicionarProfessor(Professores prof) {
        professoresSupervisionados.add(prof);
    }

    public void exibirProfessoresSupervisionados() {
        for (Professores referencia : professoresSupervisionados) {
            System.out.println("Professor: " + referencia.getNome());
        }
    }

    public void removerProfessor(Professores prof) {
        professoresSupervisionados.remove(prof);
    }
    @Override
    public double aumentaSalario(){
        double salarioAumento = (getSalario() * 0.05) + getSalario();
        return salarioAumento;
    }
}
