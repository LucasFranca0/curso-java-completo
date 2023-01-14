package Temas.herança.exercicio2.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufactureDate;

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public String priceTag() {
        return name + " (used) $ " + String.format("%.2f", price)
                +  " (Manufacture date: " + sdf.format(manufactureDate) + ")";
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
}
