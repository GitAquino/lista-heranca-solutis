package task3;

import task1.Pessoa;

public class Empregado extends Pessoa {
    private int dptCode;
    private double baseSalary;
    private double tax;

    public Empregado(String name, String address, String phone, int dptCode, double baseSalary, double tax) {
        super(name, address, phone);
        this.dptCode = dptCode;
        this.baseSalary = baseSalary;
        this.tax = tax;
    }

    public int getDepartmentCode() {
        return dptCode;
    }

    public void setDepartmentCode(int departmentCode) {
        this.dptCode = departmentCode;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double computeSalary() {
        return baseSalary - (baseSalary * tax / 100);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Código do Setor: " + dptCode + "\n" +
                "Salário Base: R$ " + baseSalary + "\n" +
                "Imposto: " + tax + "%\n" +
                "Salário Líquido: R$ " + computeSalary();
    }
}
