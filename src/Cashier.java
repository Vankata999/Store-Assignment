import java.sql.Time;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

public class Cashier {
    public void printReceipt(ArrayList<Products> productList, LocalDateTime dateOfPurchase, Time timeOfPurchase)
    {
        double subtotal = 0;
        double discount = 0;
        System.out.println("Date :" + dateOfPurchase + timeOfPurchase);
        System.out.println("---Products---");
        for (int i = 0 ; i < productList.size();++i)
        {
            System.out.println(productList.get(i).getName() + ":" + productList.get(i).getBrand());
            System.out.println(productList.get(i).getQuantity() + "x" + productList.get(i).getPrice() + "=" +
                    productList.get(i).getQuantity()*productList.get(i).getPrice());

            System.out.println('\n');
            subtotal = productList.get(i).getQuantity()*productList.get(i).getPrice();
            discount = productList.get(i).discount(dateOfPurchase);
        }
        System.out.println(subtotal);
        System.out.println(discount);
        System.out.println(subtotal-discount);
    }




}

