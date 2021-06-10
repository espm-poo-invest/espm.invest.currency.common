package espm.invest.currency.common.datatype;

import java.util.Date;
import java.util.UUID;

public class Currency {
    private UUID id;
    private String name;
    private Date date;
    private double price;

    public Currency() {

    }

    public Currency(UUID id, String name, Date date, double price) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", price=" + price +
                '}';
    }
}
