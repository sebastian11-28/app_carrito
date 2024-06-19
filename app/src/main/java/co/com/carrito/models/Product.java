package co.com.carrito.models;

public class Product {
    public Product(int id, String name, String price, int image, String branch) {
        Id = id;
        Name = name;
        Price = price;
        Image = image;
        Branch = branch;
    }

    public int Id;
    public String Branch;
    public String Name;
    public String Price;
    public int Image;
}
