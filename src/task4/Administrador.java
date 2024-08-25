package task4;

import task3.Empregado;

public class Administrador extends Empregado {

    private double allowance;

    public Administrador(String name, String address, String phone, int departmentCode, double baseSalary, double tax, double allowance) {
        super(name, address, phone, departmentCode, baseSalary, tax);
        this.allowance = allowance;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    @Override
    public double computeSalary() {
        return super.computeSalary() + allowance;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Ajuda de Custo: R$ " + allowance + "\n" +
                "Salário Total (incluindo ajuda de custo): R$ " + computeSalary();
    }
}
