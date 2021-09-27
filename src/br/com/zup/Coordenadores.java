package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends Funcionarios {
    private List<Professores> professoresSupervisionados = new ArrayList<>();

    public Coordenadores(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario, List<Professores> professoresSupervisionados) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.professoresSupervisionados = professoresSupervisionados;
    }

    public void adicionarProfessor(Professores prof) {
        professoresSupervisionados.add(prof);
    }

    public void exibirProfessoresSupervisionados() {
        for (Professores referencia : professoresSupervisionados) {
            System.out.println("O nome do professor é: " + referencia.getNome());
        }
    }

    public void removerProfessor(Professores prof) {
        professoresSupervisionados.remove(prof);
    }
}
