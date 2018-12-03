package katok.Core;

import java.sql.*;
import java.util.ArrayList;

public class GetDataFromSQL {
    public ArrayList<String> getDataByQuery(String query) throws SQLException {
        ArrayList<String> dataList = new ArrayList<>();
        String url = "jdbc:mysql://localhost:3306/test_data?useSSL=false&serverTimezone=UTC";
        String login = "root";
        String password = "root";
        Connection con = DriverManager.getConnection(url, login, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while (rs.next()){
            dataList.add(rs.getString("url"));
        }
        return dataList;
    }
}
