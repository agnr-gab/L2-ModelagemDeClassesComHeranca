package br.com.zup;

public class Main {

    public static void main(String[] args) {
        Professores prof1 = new Professores("Maria M da Silva", "566.792.920-18", "000001", "201", 13000, "Pós Doutorado", "Economia", 289, 15);
        Professores prof2 = new Professores("Pedro Paulo da Silva", "001.792.002-18", "000002", "202", 9000, "Mestrado", "Matematica", 200, 10);

        Coordenadores coord1 = new Coordenadores("Joana M Gonçalves", "003.666.777-25", "1-0000", "156", 15500);
        coord1.mostrarDados();
        prof1.mostrarDados();
        prof2.mostrarDados();
        coord1.adicionarProfessor(prof1);
        coord1.adicionarProfessor(prof2);
        System.out.println("___Lista de professores supervisionados___ " );
        coord1.exibirProfessoresSupervisionados();
    }
}
