import java.time.LocalDateTime;

abstract class Products {
    private String name;
    private String brand;
    private Double price;
    private Double quantity;




    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Products(String name, String brand, Double price, Double quantity) {
        setBrand(brand);
        setName(name);
        setPrice(price);
        setQuantity(quantity);

    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public abstract double discount(LocalDateTime purchaseDate);

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name +
                ", brand='" + brand  +
                ", price=" + price +
                '}';
    }
}

