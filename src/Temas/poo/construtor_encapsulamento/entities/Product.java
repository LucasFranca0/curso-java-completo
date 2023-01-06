package Temas.poo.construtor_encapsulamento.entities;

// Construtor //
//• É uma operação especial da classe, que executa no momento da
//  instanciação do objeto
//• Usos comuns:
//• Iniciar valores dos atributos
//• Permitir ou obrigar que o objeto receba dados / dependências no momento de sua
//  instanciação (injeção de dependência)
//• Se um construtor customizado não for especificado, a classe disponibiliza o
//construtor padrão:
//Product p = new Product();
//• É possível especificar mais de um construtor na mesma classe (sobrecarga)

public class Product {

    // Atributos e Encapsulamento
    // private, para o atributo não ser alterado e visível para o usuário
    // para alterar o atributo será necessário inserir os métodos Getters and Setters
    private String name;
    private double price;
    private int quantity;

    // Construtor
    // Passa como parametros argumentos e o construtor irá inserir os parametros recebidos
    // nos atributos de classe.
    public Product(String name, double price, int quantity){
        // palavra 'this' faz referencia aos atributos de classe, pois os parametros tem o mesmo nome e fica ambígua
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Sobrecarga = disponibilizar mais de uma versão da mesma operação. O que difere é a lista de parâmetros
    // Construtor que recebe apenas nome e preço. Por padrão a quantidade vai ser 0;
    public Product(String name, double price){
        this.name = name;
        this.price = price;
        // É opcional pois por padrão a linguagem java inicia por padrão números com 0
        //this.quantity = 0;
    }

    // Construtor padrão
    public Product(){

    }

    // Métodos
    public double totalValueInStock() {
       return price * quantity;
    }

    // this é uma referência para o atributo da classe, já que tem uma ambiguidade
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", " + quantity + " units, Total: $"
                + String.format("%.2f",totalValueInStock());
    }

    // Getters and Setters
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

    // Consultar a quantidade. Não foi feito o Setter, já que ele só poderá ser alterado
    // quando houver uma entrada ou saída e não diretamente pelo método Set.
    public int getQuantity() {
        return quantity;
    }

}
