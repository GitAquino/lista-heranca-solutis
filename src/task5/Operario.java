package task5;

import task3.Empregado;

public class Operario extends Empregado {
    private double outputValue;
    private double bonus;

    public Operario(String name, String address, String phone, int departmentCode, double baseSalary, double tax, double outputValue, double bonus) {
        super(name, address, phone, departmentCode, baseSalary, tax);
        this.outputValue = outputValue;
        this.bonus = bonus;
    }

    public double getOutputValue() {
        return outputValue;
    }

    public void setOutputValue(double outputValue) {
        this.outputValue = outputValue;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double computeSalary() {
        return super.computeSalary() + (outputValue * bonus / 100);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Output Value: $" + outputValue + "\n" +
                "Bonus: " + bonus + "%\n" +
                "Total Salary (including bonus): $" + computeSalary();
    }
}