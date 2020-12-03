package Library.Controller;
import Library.DB.*;
import Library.Model.IModel;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Controller
public class Controller
{
    public static DBAvtosalon dbAvtosalon;
    public static List<IModel> avtosalonList;

    public static DBService dbService;
    public static List<IModel> serviceList;

    public static DBSortAvtosalon dbSortAvtosalon;
    public static List<IModel> savtosalonList;

    public static  DBFilterAvtoSalon dbFilterAvtosalon;
    public static List<IModel> favtosalonList;

    public static  DBJoinOneMany dbJoinOneMany;
    public static List<IModel> joinOneManyList;

    public static DBJoinManyMany dbJoinManyMany;
    public static List<IModel> joinManyManyList;



    static
    {
        dbAvtosalon = new DBAvtosalon();
        Controller.avtosalonList = dbAvtosalon.modelList;

        dbService = new DBService();
        Controller.serviceList = dbService.modelList;

        dbSortAvtosalon = new DBSortAvtosalon();
        Controller.savtosalonList = dbSortAvtosalon.modelList;

        dbFilterAvtosalon= new DBFilterAvtoSalon();
        Controller.favtosalonList = dbFilterAvtosalon.modelList;

        dbJoinOneMany= new DBJoinOneMany();
        Controller.joinOneManyList = dbJoinOneMany.modelList;

        dbJoinManyMany = new DBJoinManyMany();
        Controller.joinManyManyList = dbJoinManyMany.modelList;
    }

    @GetMapping("/avtosalon")
    public String getAvtosalon(Map<String, Object> model) throws Exception
    {
        model.put("avtosalonList", avtosalonList);
        return "avtosalon";
    }

    @GetMapping("/service")
    public String getService(Map<String, Object> model) throws Exception
    {
        model.put("serviceList", serviceList);
        return "service";
    }

    @GetMapping("/savtosalon")
    public String getSAvtosalon(Map<String, Object> model) throws Exception
    {
        model.put("savtosalonList", savtosalonList);
        return "savtosalon";
    }
    @GetMapping("/favtosalon")
    public String getFAvtosalon(Map<String, Object> model) throws Exception
    {
        model.put("favtosalonList", favtosalonList);
        return "favtosalon";
    }

    @GetMapping("/onemany")
    public String getOneMany(Map<String, Object> model) throws Exception
    {
        model.put("joinOneManyList", joinOneManyList);
        return "onemany";
    }

    @GetMapping("/manymany")
    public String getManyMany(Map<String, Object> model) throws Exception
    {
        model.put("joinManyManyList", joinManyManyList);
        return "manymany";
    }

}
