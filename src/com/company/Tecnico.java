package com.company;

public class Tecnico extends Aluno {
    private int registroProfissional;

    public void praticar() {
        System.out.println("O aluno tecnico com registro numero " + this.registroProfissional + " pratica na empresa X");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
