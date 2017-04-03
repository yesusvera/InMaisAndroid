package itspay.br.com.model;

/**
 * Created by juniorbraga on 02/04/17.
 */

public class ContaBancaria {
    private String banco;
    private String agencia;
    private String conta;

    public ContaBancaria(){}

    public ContaBancaria(String banco, String agencia, String conta) {
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }
}
