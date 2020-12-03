package Library.DB;

import Library.Model.JoinOneManyModel;

import java.sql.*;

public class DBJoinOneMany extends DB{
    private String url = "jdbc:postgresql://localhost:5432/alex";
    private String login = "postgres";
    private String password = "1";

    public DBJoinOneMany() {
        System.out.println("DB");
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, login, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select avtosalon.car, service.sername, service.car2 FROM avtosalon JOIN service on avtosalon.id = service.carid1 OR avtosalon.id = service.carid2;");
            while (resultSet.next()) {
                this.modelList.add(new JoinOneManyModel(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3)
                ));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public IDB showIDB() {
        return this;
    }
}
