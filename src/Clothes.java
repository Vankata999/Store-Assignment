import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Clothes extends  Products {
    private String size;
    private String color;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {

        if (size == "XS" || size == "S" || size == "M"
        || size == "L" || size == "Xl" )
        {
            this.size = size;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Clothes(String name, String brand, Double price, Double quantity,String size, String color) {
        super(name, brand, price,quantity);
        setColor(color);
        setSize(size);
    }
    public double discount(LocalDateTime dayOfBuy)
    {
        double discount = 0;
        if(dayOfBuy.getDayOfWeek() == DayOfWeek.MONDAY ||
           dayOfBuy.getDayOfWeek() == DayOfWeek.TUESDAY ||
           dayOfBuy.getDayOfWeek() == DayOfWeek.WEDNESDAY ||
           dayOfBuy.getDayOfWeek() == DayOfWeek.THURSDAY ||
           dayOfBuy.getDayOfWeek() == DayOfWeek.FRIDAY )
        {
            discount = (getPrice()* getQuantity() *10) /100;
        }
        return discount;
    }


}
