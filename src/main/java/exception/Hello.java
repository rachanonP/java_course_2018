package exception;

import java.sql.*;

public class Hello {

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.start();
    }

    private void start() {
//        UserDatabase userDatabase = new UserDatabase();
//        try {
//            userDatabase.getName(1);
//        } catch (UserNotFoundExceoption userNotFoundExceoption) {
//            userNotFoundExceoption.printStackTrace();
//        } catch (DataBaseDownExceoption dataBaseDownExceoption) {
//            dataBaseDownExceoption.printStackTrace();
//        } catch (InternalInExceoption internalInExceoption) {
//            internalInExceoption.printStackTrace();
//        }
        try {
            double d = div(9,5);
            System.out.println(d);
        } catch (InputByZeroException e) {
            System.out.println("Error");
        }

    }

    private double div(int a, int b){
        if (b != 0)
            return a/b;
        throw new InputByZeroException();
    }

}

class UserDatabase {

    public String getName(int id) throws UserNotFoundExceoption, DataBaseDownExceoption, InternalInExceoption {
        try {
            getClass().forName("mysql.xxx");
            Connection connection = DriverManager.getConnection("url");
            PreparedStatement preparedStatement
                     = connection.prepareStatement("select * from table");
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getString("");
            }
            throw new UserNotFoundExceoption();
        } catch (SQLException e) {
            throw new DataBaseDownExceoption();
        } catch (ClassNotFoundException e) {
            throw new InternalInExceoption();
        }
    }

}
