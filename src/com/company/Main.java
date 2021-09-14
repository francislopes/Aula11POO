package com.company;

public class Main {

    public static void main(String[] args) {
	Aluno a1 = new Aluno();
	a1.setNome("Claudio");
	a1.setIdade(16);
	a1.setSexo("M");
	a1.setCurso("Informatica");
	a1.setMatricula(1111);
	a1.pagarMensalidade();

	Bolsista b1 = new Bolsista();
	b1.setNome("Jubileu");
	b1.setIdade(19);
	b1.setSexo("M");
	b1.setMatricula(1112);
	b1.setBolsa(12.5f);
	b1.pagarMensalidade();

	Professor p1 = new Professor();
	p1.setSalario(1000f);
	p1.receberAumento(100f);
	System.out.println(p1.getSalario());

	Tecnico t1 = new Tecnico();
	t1.setRegistroProfissional(102282);
	t1.praticar();
    }
}
