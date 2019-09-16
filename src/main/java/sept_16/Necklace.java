package sept_16;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Necklace extends Product{
    private double price;
    private int item_id;
    private String name;
    private String date_created;


    public Necklace(String name, double price) {
        super(name, price);
        this.name = name;
        this.price = price;
        this.item_id = (int) (Math.random() * 9999) + 1;
        //Create date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();

        this.date_created = dateFormat.format(date);
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int getItem_id() {
        return item_id;
    }

    @Override
    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDate_created() {
        return date_created;
    }

    @Override
    public String toString() {
        return
                "\nitem_id=" + item_id +
                ", name='" + name +
                "\' price=" + price +
                ", date_created='" + date_created + '\'';
    }
}
