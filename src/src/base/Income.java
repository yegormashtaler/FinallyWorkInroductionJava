package base;

public interface Income {

    abstract int calculationMethod(int price, int amount);

    double calculationMethod(double price, double amount);

    abstract double calculationMethod(double price, double amount, double ratingStake);
}
