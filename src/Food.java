import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.function.DoubleToIntFunction;

public class Food  extends  Products{
    private LocalDateTime expirationDates;
    public Food(String name, String brand, Double price, LocalDateTime expirationDates, Double quantity) {
        super(name, brand, price,quantity);
        setExpirationDates(expirationDates);
    }

    public LocalDateTime getExpirationDates() {
        return expirationDates;
    }

    public void setExpirationDates(LocalDateTime expirationDates) {
        this.expirationDates = expirationDates;
    }



    @Override
    public double discount(LocalDateTime purchaseDate) {
        double discount = 0;
        long dayDifference =Math.abs(ChronoUnit.DAYS.between(purchaseDate,getExpirationDates()));
        if (dayDifference<=5 && dayDifference>0)
        {
            discount = (getPrice()*10)/100;
        }
        else if (dayDifference == 0)
        {
            discount = (getPrice()*getQuantity()*50)/100;
        }
        return discount;
    }
}
