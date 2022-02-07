package models;

import base.Fiscal;
import base.Income;

// Model.
// Примените интерфейсы Income, Fiscal, переопределите их методы.

public abstract class Product implements Fiscal, Income {
    // Объявление полей модели
    private String name;
    private double price;
    private double amount;

    // Налоговую ставку объявите в виде константы
    // здесь ...
    final double ratingStake = 18;

    // Обеспечьте доступ к полям модели через getters и setters
    // здесь ...
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getRatingStake() {
        return ratingStake;
    }

    Product product = new Product() {
        @Override
        public int calculationMethod(int price, int amount) {
            return price * amount;
        }
    };

    // Переопределите методы реализуемых интерфейсов.
    @Override
    public double calculateIncomeTax(double income, double ratingStake) {
        return income - ratingStake;
    }

    @Override
    public double calculationMethod(double price, double amount) {
        return price * amount;
    }

    @Override
    public double calculationMethod(double price, double amount, double ratingStake) {
        return price * amount - ratingStake;
    }

        // Расчёт дохода от продаж, до уплаты налога.
        // здесь ...
    public static void calculationOfSalesRevenueBeforeTax(double price, double amount) {
        double income = price * amount;
        }

        // Расчёт суммы налога с продаж.
        // здесь ...
    public static void saleTaxCalculation(double price, double ratingStake) {
        double taxAmount = price * ratingStake;
    }

        // Расчёт чистого дохода, после уплаты налога.
        // здесь ...
    public static void calculationOfNetIncomeAfterTax(double income, double taxAmount) {
        double netIncome = income - taxAmount;
    }

}