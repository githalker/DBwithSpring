package Library.DB;

import Library.Model.ServiseModel;

import java.sql.*;

public class DBService extends DB {
    private String url = "jdbc:postgresql://localhost:5432/alex";
    private String login = "postgres";
    private String password = "1";

    public DBService() {
        System.out.println("DB");
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, login, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM service ");
            while (resultSet.next()) {
                this.modelList.add(new ServiseModel(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getInt(5),
                        resultSet.getInt(6)
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


