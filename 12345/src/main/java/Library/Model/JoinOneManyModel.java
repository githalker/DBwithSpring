package Library.Model;

public class JoinOneManyModel implements IModel{
    public String car1;
    public String sername;
    public String car2;

    public JoinOneManyModel() {}

    public JoinOneManyModel(String car1,
                            String sername,
                            String car2) {
        this.car1 = car1;
        this.sername = sername;
        this.car2 = car2;
    }
}
