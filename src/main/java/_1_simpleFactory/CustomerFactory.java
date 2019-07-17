package _1_simpleFactory;

import sampleClass.customer.Customer;
import sampleClass.person.Person;

/** DesignPattern SimpleFactory  */
class CustomerFactory {
    public static Customer getCustomer(Person person) {
        Customer customer = new Customer();
        customer.setAddress(person.getAddress());
        customer.setAge(person.getAge());
        customer.setBirthday(person.getBirthday());
        customer.setEmail(person.getEmail());
        customer.setGender(person.getGender());
        customer.setName(person.getName());
        customer.setTelephoneNumber(person.getTelephoneNumber());
        return customer;
    }
}
