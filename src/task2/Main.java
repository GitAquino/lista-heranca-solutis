package task2;

public class Main {
    public static void main(String[] args) {
        Fornecedor provider = new Fornecedor("Empresa Fornecedora", "Rua da esquerda, 37", "9876-5432", 75000.0, 25000.0);

        System.out.println("\n=== Dados Iniciais ===\n");
        System.out.println(provider);

        provider.setDebtAmount(30000.0);
        provider.setCreditAmount(85000.0);

        System.out.println("\n=== Dados Atualizados ===\n");
        System.out.println(provider);
    }
}