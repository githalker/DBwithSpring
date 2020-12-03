package Library.DB;

import Library.Model.JoinManyManyModel;

import java.sql.*;

public class DBJoinManyMany extends DB{
    private String url = "jdbc:postgresql://localhost:5432/alex";
    private String login = "postgres";
    private String password = "1";

    public DBJoinManyMany () {
        System.out.println("DB");
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, login, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select service.sername, avtosalon.car, avtosalon.price, avtosalon.seller, avtosalon.client from avtoservice join service on service.id = avtoservice.sername_id join avtosalon on avtosalon.id =  avtoservice.car_id");
            while (resultSet.next()) {
                this.modelList.add(new JoinManyManyModel(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getInt(3),
                        resultSet.getString(4),
                        resultSet.getString(5)
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
