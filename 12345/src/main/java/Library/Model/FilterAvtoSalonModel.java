package Library.Model;

public class FilterAvtoSalonModel implements IModel
{
  public int id;
  public String car;
  public double price;
  public String seller;
  public String client;

  public FilterAvtoSalonModel() { }

  public FilterAvtoSalonModel(int id,
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
