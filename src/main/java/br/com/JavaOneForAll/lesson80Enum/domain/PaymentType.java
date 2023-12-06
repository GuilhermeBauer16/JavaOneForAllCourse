package br.com.JavaOneForAll.lesson80Enum.domain;

public enum PaymentType {
    DEBIT {
        @Override
        public double calculationDiscount(double value) {
            return value * 0.1;
        }
    },
    CREDIT {
        @Override
        public double calculationDiscount(double value) {
            return value * 0.05;
        }
    };

    public abstract double calculationDiscount(double value);
}