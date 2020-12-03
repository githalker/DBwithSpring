package Library.Table;

import Library.Model.IModel;
import java.util.List;

public class ProductTable extends Table {
    public ProductTable() { super(); }

    public ProductTable(List<IModel> modelList)
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
