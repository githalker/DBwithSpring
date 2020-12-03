package Library.DB;

import Library.Model.IModel;
import Library.Table.Table;
import java.util.ArrayList;
import java.util.List;

public abstract class DB implements IDB
{
    public List<IModel> modelList = new ArrayList<>();
    public List<Table> tableList = new ArrayList<>();

    public DB()
    {
    }

    public DB(List<IModel> modelList, List<Table> tableList)
    {
        this.modelList = modelList;
        this.tableList = tableList;
    }
}
