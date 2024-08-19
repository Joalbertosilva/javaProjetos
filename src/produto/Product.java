package produto;

public class Product {
    private String name;
    private Double price;
    private int quantity;
    private Double total;


    public String Stock(){
        setTotal(getQuantity() * getPrice());
        return "Nome do produto: " + getName() + ". Quantidade de produtos: " + getQuantity() + ". Total de produtos em valor é: " + getTotal();
    }

    public void moreStock(double valor, int quant){
        if (valor == getPrice()){
            setQuantity(getQuantity() + quant);
            setTotal(getQuantity() * getPrice());
            System.out.println("Quantidade no estoque atual com o aumento: " + getQuantity());
            System.out.println("Quantidade em real de todos os produtos: " + getTotal());

        } else{
            System.out.println("Valor foi abaixo ou maior que o preço do produto.");
        }
    }

    public void Sale(int quant){
        setQuantity(getQuantity() - quant);
        setTotal(getQuantity() * getPrice());
        System.out.println("Total de produtos: " + getQuantity());
        System.out.println("Total de produtos em real após as vendas: " + getTotal());
    }

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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
