package task4;

public class Main {
    public static void main(String[] args) {
        Administrador administrador = new Administrador("Carlos Pereira", "Rua do Comércio, 456", "4891-9562", 201, 7000.0, 8.0, 1200.0);

        System.out.println("\n=== Dados Iniciais ===\n");
        System.out.println(administrador);

        administrador.setBaseSalary(7500.0);
        administrador.setTax(7.0);
        administrador.setAllowance(1500.0);

        System.out.println("\n=== Dados Atualizados ===\n");
        System.out.println(administrador);
    }
}
