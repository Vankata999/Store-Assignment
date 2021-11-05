import java.time.LocalDateTime;
import java.util.Date;

import static java.time.DayOfWeek.SATURDAY;
import static java.time.DayOfWeek.SUNDAY;

public class Appliances extends  Products{
    private String model;
    private Date productionDate;
    private Double weight;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Appliances(String name, String brand, Double price,Double quantity, String model, Date productionDate, Double weight) {
        super(name, brand, price,quantity);
        setModel(model);
        setProductionDate(productionDate);
        setWeight(weight);
    }

    public double discount(LocalDateTime dayOfBuy)
    {
        double discount = 0;
        if((dayOfBuy.getDayOfWeek() == SUNDAY|| dayOfBuy.getDayOfWeek() == SATURDAY) && getPrice()>999 )
        {
            discount = (getPrice()*getQuantity()*5)/100;
        }
        return discount;
    }
}
