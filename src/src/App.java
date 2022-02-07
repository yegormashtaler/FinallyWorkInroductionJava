import models.Product;
import controllers.ProductController;
import views.SalesView;

// Входная точка в программу/приложение
public class App {

    public static void main(String[] args) {

        // Здесь создайте экземпляры Model, View и Controller,
        // на основании соответствующих конструкторов.
        Product model = new Product() {
            @Override
            public int calculationMethod(int price, int amount) {
                return price * amount;
            }
        };
        SalesView view = new SalesView(model);
        ProductController controller = new ProductController(model, view);

        // Запуск программы/приложения.
        // Раскомментированный код будет корректным после
        // правильной настройки приложения
        // controller.runApp();
    }
}
