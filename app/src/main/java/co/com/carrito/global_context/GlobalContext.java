package co.com.carrito.global_context;

import java.util.ArrayList;
import java.util.List;

import co.com.carrito.models.Product;

public class GlobalContext {

    private static GlobalContext instance;
    private List<Product> products = new ArrayList<>();

    private GlobalContext() {
        // Constructor privado para evitar instanciación directa
    }

    public static synchronized GlobalContext getInstance() {
        if (instance == null) {
            instance = new GlobalContext();
        }
        return instance;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }
    public void removeProduct(Product product) {
        products.remove(product);
    }
}
