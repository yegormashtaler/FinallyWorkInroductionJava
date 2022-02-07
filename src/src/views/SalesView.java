package views;
import models.Product;
import utils.Validator;
import java.util.Scanner;
// View
public class SalesView {
    Product model;
    String title;
    String name;
    double amount;
    double price;
    Scanner scanner;
    // Здесь, создайте конструктор данного класса,
    // который в параметре содержит переменную типа модели.
    public SalesView(Product model) {
        this.model = model;
    }
    public void getInputs() {

        SalesView salesView = new SalesView(model);
        title = "Введите наименование товара: ";
        // Здесь, реализуйте вывод сообщения о необходимости
        // ввода соответствующего значения, валидацию значения
        // через валидатор, установку валидного значения через модель.
        name = Validator.validateName(scanner);
        model.setName(name);
        amount = Validator.validateQuantityInput(scanner);
        model.setAmount(amount);
        price = Validator.validatePriceInput(scanner);
        model.setPrice((int) price);

        title = "Введите количество: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        name = Validator.validateName(scanner);
        model.setName(name);
        amount = Validator.validateQuantityInput(scanner);
        model.setAmount(amount);
        price = Validator.validatePriceInput(scanner);
        model.setPrice(price);

        title = "Введите цену: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        name = Validator.validateName(scanner);
        model.setName(name);
        amount = Validator.validateQuantityInput(scanner);
        model.setAmount(amount);
        price = Validator.validatePriceInput(scanner);
        model.setPrice(price);
    }
    public void getOutput(String output) {
        System.out.println(output);
    }
}
