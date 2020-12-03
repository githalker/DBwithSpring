package Library.Model;

public class AvtosalonModel implements IModel {
    public int id;
    public String car;
    public double price;
    public String seller;
    public String client;

    public AvtosalonModel() { }

    public AvtosalonModel(int id,
                           String car,
                           double price,
                           String seller,
                           String client) {
        this.id = id;
        this.car = car;
        this.price = price;
        this.seller = seller;
        this.client = client;
    }
}
