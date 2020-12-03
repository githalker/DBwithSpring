package Library.DB;

import Library.Model.AvtosalonModel;

import java.sql.*;

public class DBSortAvtosalon extends DB {
    private String url = "jdbc:postgresql://localhost:5432/alex";
    private String login = "postgres";
    private String password = "1";

    public DBSortAvtosalon() {
        System.out.println("DB");
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, login, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM avtosalon ORDER BY price");

            while (resultSet.next()) {
                this.modelList.add(new AvtosalonModel(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getDouble(3),
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
