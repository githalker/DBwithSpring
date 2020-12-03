package Library.Model;

public class    JoinManyManyModel implements IModel{
    public String sername;
    public String car;
    public double price;
    public String seller;
    public String client;

    public JoinManyManyModel() { }

    public JoinManyManyModel(String sername,
                          String car,
                          double price,
                          String seller,
                          String client) {
        this.sername = sername;
        this.car = car;
        this.price = price;
        this.seller = seller;
        this.client = client;
    }
}
