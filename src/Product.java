import lombok.Getter;

import java.time.LocalDate;

public class Product {
    private String name;
    private String description;
    private int price;
    private LocalDate madeOfDate;
    private TypeProduct type;
    private String StatusExpirationDate;

    public Product(String name, String description, int price, LocalDate madeOfDate, TypeProduct type) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.madeOfDate = madeOfDate;
        this.type = type;

    }

    public Product() {
    }

    public Product(String name, String description, int price, LocalDate madeOfDate, TypeProduct type, String StatusExpirationDate) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.madeOfDate = madeOfDate;
        this.type = type;
        this.StatusExpirationDate = StatusExpirationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getMadeOfDate() {
        return madeOfDate;
    }

    public void setMadeOfDate(LocalDate madeOfDate) {
        this.madeOfDate = madeOfDate;
    }

    public TypeProduct getType() {
        return type;
    }

    public void setType(TypeProduct type) {
        this.type = type;
    }

    public String getStatusExpirationDate() {
        return StatusExpirationDate;
    }

    public void setStatusExpirationDate(String statusExpirationDate) {
        StatusExpirationDate = statusExpirationDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", madeOfDate=" + madeOfDate +
                ", type=" + type +
                ", StatusExpirationDate='" + StatusExpirationDate + '\'' +
                '}';
    }
}
