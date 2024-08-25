package task3;

public class Main {
    public static void main(String[] args) {
        Empregado employee = new Empregado("Maria Oliveira", "Rua das Flores, 123", "9123-4567", 202, 4500.0, 12.0);

        System.out.println("\n=== Dados Iniciais ===\n");
        System.out.println(employee);

        employee.setBaseSalary(5000.0);
        employee.setTax(14.0);

        System.out.println("\n=== Dados Atualizados ===\n");
        System.out.println(employee);
    }
}
