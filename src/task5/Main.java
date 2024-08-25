package task5;

public class Main {
    public static void main(String[] args) {

        Operario worker = new Operario("Lucas Martins", "Avenida das Américas, 789", "9123-4567", 404, 4500.0, 10.0, 20000.0, 7.0);

        System.out.println("\n=== Dados Iniciais ===\n");
        System.out.println(worker);

        worker.setBaseSalary(4800.0);
        worker.setTax(9.0);
        worker.setOutputValue(22000.0);
        worker.setBonus(8.0);

        System.out.println("\n=== Dados Atualizados ===\n");
        System.out.println(worker);
    }
}
