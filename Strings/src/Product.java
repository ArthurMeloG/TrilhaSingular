public class Product {

    private String name;
    private Double price;
    private Integer amount;

    public Product() {
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

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Nome: " + getName() + "\n" +
                "Preço: " + getPrice() + "\n" +
                "Quantidade: " + getAmount();
    }

}
