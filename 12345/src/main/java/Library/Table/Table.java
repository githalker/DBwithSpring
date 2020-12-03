package Library.Table;

import Library.Model.IModel;

import java.util.ArrayList;
import java.util.List;

public abstract class Table implements ITable
{

    public List<IModel> modelList = new ArrayList<>();

    public Table()
    {
    }

    public Table(List<IModel> modelList)
    {
        this.modelList = modelList;
    }
}
