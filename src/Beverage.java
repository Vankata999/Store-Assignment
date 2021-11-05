import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import static java.time.DayOfWeek.SATURDAY;
import static java.time.DayOfWeek.SUNDAY;

public class Beverage extends  Products {
    private LocalDateTime expirationDates;

    public Beverage(String name, String brand, Double price,Double quantity, LocalDateTime expirationDates) {
        super(name, brand, price,quantity);
        setExpirationDates(expirationDates);
    }

    public LocalDateTime getExpirationDates() {
        return expirationDates;
    }

    public void setExpirationDates(LocalDateTime expirationDates) {
        this.expirationDates = expirationDates;
    }

    public double discount(LocalDateTime purchaseDate)
    {
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
