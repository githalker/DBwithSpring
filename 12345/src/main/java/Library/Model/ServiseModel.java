package Library.Model;

public class ServiseModel implements IModel {
    public int id;
    public String sername;
    public String car1;
    public String car2;
    public int carid1;
    public int carid2;

    public ServiseModel() {}

    public ServiseModel(int id,
                        String sername,
                        String car1,
                        String car2,
                        int carid1,
                        int carid2) {
        this.id = id;
        this.sername = sername;
        this.car1 = car1;
        this.car2 = car2;
        this.carid1 = carid1;
        this.carid2 = carid2;
        }



}
