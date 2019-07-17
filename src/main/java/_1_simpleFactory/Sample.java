package _1_simpleFactory;

import sampleClass.customer.Customer;
import sampleClass.person.Person;

public class Sample {
    public static void main(String[] args) {
        Person person = Person.getInstance();
        Customer customer = CustomerFactory.getCustomer(person);
        System.out.println(customer.getName());
    }
}
