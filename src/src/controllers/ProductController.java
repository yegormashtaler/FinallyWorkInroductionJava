package controllers;

import models.Product;
import utils.Rounder;
import views.SalesView;

// Controller
public class ProductController {

    Product model;
    SalesView view;

    // Конструктор
    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        // Здесь, реализуйте:
        // 1) получение имени товара через модель;
        model.getName();
        model.getAmount();
        model.getPrice();
        model.getRatingStake();

        // 2) вызов методов расчетов доходов и налога;
        model.calculationMethod(model.getPrice(), model.getAmount(), model.getRatingStake());
        model.calculationMethod(model.getPrice(), model.getAmount());
        ProductController productController = new ProductController(model, view);

        // 3) округление расчетных значений; ---- не знаю как
        Rounder.roundingMethod();

        // 4) вывод расчетов по заданному формату.
        String output = "[вывод по формату!]";

        view.getOutput(output);
    }
}
