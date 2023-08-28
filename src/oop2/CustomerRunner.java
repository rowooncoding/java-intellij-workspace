package oop2;

public class CustomerRunner {
    public static void main(String[] args) {
        Address homeAddress = new Address("line1", "seoul", "12345");
        Customer customer = new Customer("rowoon", homeAddress);

        Address workAddress = new Address("line1 for work", "seoul", "12356");
        customer.setWorkAddress(workAddress);

        System.out.println(customer);
    }
}
