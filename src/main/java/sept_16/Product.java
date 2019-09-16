package sept_16;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
    private double price;
    private int item_id;
    private String name;
    private String date_created;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
        this.item_id = (int) (Math.random() * 9999) + 1;

        //Create date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();

        this.date_created = dateFormat.format(date);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate_created() {
        return date_created;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", item_id=" + item_id +
                ", name='" + name + '\'' +
                ", date_created='" + date_created + '\'' +
                '}';
    }
}
