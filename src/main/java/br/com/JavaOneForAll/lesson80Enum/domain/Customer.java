package br.com.JavaOneForAll.lesson80Enum.domain;

public class Customer {



    private String name;
    private CustomerTypes customerTypes;

    private PaymentType paymentType;

    public Customer(String name, CustomerTypes customerTypes, PaymentType paymentType) {
        this.name = name;
        this.customerTypes = customerTypes;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", customerTypesDatabaseValues=" + customerTypes.getDB_VALUE() +
                ", customerTypesReportValues=" + customerTypes.getReportValue() +
                ", paymentType=" + paymentType +
                '}';
    }
}
