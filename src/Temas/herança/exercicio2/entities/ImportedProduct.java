package Temas.herança.exercicio2.entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    // Sobreposição de método
    @Override
    public String priceTag() {
        return name + " $ " + String.format("%.2f", (price + customsFee))
                +  " (Customs fee: $ " + String.format("%.2f", customsFee) + ")";
    }

    public Double totalPrice() {
       return price + customsFee;
    }


    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
}
