package task6;

public class Main {
    public static void main(String[] args) {
        Vendedor vendor = new Vendedor("Lucas Almeida", "Avenida das Flores, 615", "1516-8946", 303, 5500.0, 8.0, 25000.0, 6.0);

        System.out.println("\n=== Dados Iniciais ===\n");
        System.out.println(vendor);

        vendor.setBaseSalary(5800.0);
        vendor.setTax(7.0);
        vendor.setSalesValue(27000.0);
        vendor.setCommission(7.0);

        System.out.println("\n=== Dados Atualizados ===\n");
        System.out.println(vendor);
    }
}
