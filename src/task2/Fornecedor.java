package task2;

import task1.Pessoa;

public class Fornecedor extends Pessoa {
    private double creditAmount;
    private double debitAmount;

    public Fornecedor(String name, String phone, double creditAmount, double debtAmount) {
        super(name, phone);
        this.creditAmount = creditAmount;
        this.debitAmount = debtAmount;
    }

    public Fornecedor(String name, String address, String phone, double creditAmount, double debtAmount) {
        super(name, address, phone);
        this.creditAmount = creditAmount;
        this.debitAmount = debtAmount;
    }

    public double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public double getDebtAmount() {
        return debitAmount;
    }

    public void setDebtAmount(double debtAmount) {
        this.debitAmount = debtAmount;
    }

    public double getBalance(){
        return creditAmount - debitAmount;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Valor Crédito: R$ " + creditAmount + "\n" +
                "Valor Dívida: R$ " + debitAmount + "\n" +
                "Saldo: R$ " + getBalance();
    }
}
