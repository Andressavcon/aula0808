package com.alfamidia.aula0808;

public class ContaPJ extends Conta {
    private final double LIMITE_EMPRESTIMO = 5000;
    protected final double JUROS = 5;

    public ContaPJ(String titular, double valor) {
        super(titular, valor);
    }

    public void sacar(double valor){
        if(this.saldo - valor >= 0){
            this.saldo -= valor;
        }  if ((this.saldo + valor) <= this.LIMITE_EMPRESTIMO){
            this.saldo -= valor + ((valor/100) * this.JUROS);
        }
    }

    @Override
    public String toString() {
        return "ContaPJ [" +
                "titular='" + super.titular + '\'' +
                ", saldo=" + super.saldo +
                ", limiteEmprestimo=" + this.LIMITE_EMPRESTIMO +
                ']';
    }
}

