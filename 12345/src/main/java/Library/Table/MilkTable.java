package Library.Table;

import Library.Model.IModel;
import java.util.List;

public class MilkTable extends Table {
    public MilkTable()
    {
        super();
    }

    public MilkTable(List<IModel> modelList)
    {
        super(modelList);
    }

    @Override
    public List<IModel> showModel()
    {
        return this.modelList;
    }

    @Override
    public ITable showTable()
    {
        return this;
    }
}
