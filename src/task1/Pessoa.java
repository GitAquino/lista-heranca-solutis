package task1;

public class Pessoa {
    private String name;
    private String address;
    private String cellphone;

    public Pessoa(String name, String phone) {
        this.name = name;
        this.cellphone = phone;
    }

    public Pessoa(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.cellphone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return cellphone;
    }

    public void setPhone(String phone) {
        this.cellphone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Nome: " + name + "\n" +
                "Endereço: " + address + "\n" +
                "Telefone: " + cellphone;
    }
}
