package br.com.JavaOneForAll.lesson80Enum.test;

import br.com.JavaOneForAll.lesson80Enum.domain.Customer;
import br.com.JavaOneForAll.lesson80Enum.domain.CustomerTypes;
import br.com.JavaOneForAll.lesson80Enum.domain.PaymentType;

import static br.com.JavaOneForAll.lesson80Enum.domain.Customer.*;

public class CustomerTest01 {
    public static void main(String[] args) {
        Customer customer = new Customer("John" , CustomerTypes.INDIVIDUAL, PaymentType.CREDIT);
        Customer customer2 = new Customer("Ana" ,CustomerTypes.START_UP , PaymentType.DEBIT);
        Customer customer3 = new Customer("Petter" ,CustomerTypes.COMPANY , PaymentType.CREDIT);

        System.out.println(customer.toString());
        System.out.println(customer2.toString());
        System.out.println(customer3.toString());
        System.out.println(PaymentType.DEBIT.calculationDiscount(100));
        System.out.println(PaymentType.CREDIT.calculationDiscount(100));

        CustomerTypes customerTypes = CustomerTypes.valueOf("COMPANY");
        CustomerTypes customerTypes2 = CustomerTypes.getByReportValue("company");
        System.out.println(customerTypes.getDB_VALUE());
        System.out.println(customerTypes.getReportValue());
        System.out.println(customerTypes2.getReportValue());
        System.out.println(customerTypes2.getDB_VALUE());
    }
}
