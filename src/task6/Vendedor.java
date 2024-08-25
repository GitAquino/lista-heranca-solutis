package task6;

import task3.Empregado;

public class Vendedor extends Empregado {
    private double salesValue;
    private double commission;

    public Vendedor(String name, String address, String phone, int departmentCode, double baseSalary, double tax, double salesValue, double commission) {
        super(name, address, phone, departmentCode, baseSalary, tax);
        this.salesValue = salesValue;
        this.commission = commission;
    }

    public double getSalesValue() {
        return salesValue;
    }

    public void setSalesValue(double salesValue) {
        this.salesValue = salesValue;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public double computeSalary() {
        return super.computeSalary() + (salesValue * commission / 100);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "ValorVendas: R$ " + salesValue + "\n" +
                "Comissão: " + commission + "%\n" +
                "Salário Total com comissão: R$ " + computeSalary();
    }
}

