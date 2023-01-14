package Temas.herança.exercicio2.entities;


public class Product {

    protected String name;
    protected Double price;

    // Construct
    public Product() {}

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    // Methods

    public String priceTag() {
        return name + " $ " + price;
    }


    // Gettters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
