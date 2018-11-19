package xyz.vaith;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {


        try {
            ComboPooledDataSource dataSource = new ComboPooledDataSource();
            dataSource.setDriverClass("com.mysql.jdbc.Driver");
            dataSource.setJdbcUrl("jdbc:mysql://localhost/bank");
            dataSource.setUser("root");
            dataSource.setPassword("abcd1234");
            QueryRunner runner = new QueryRunner(dataSource);
           // runner.update("insert into account values (null, ?, ?)", "aa", 1000);
           // runner.update("update account set money = ? where id = ?", 9, 4);
           // runner.update("delete from account where id = ?", 4);
            Account account = runner.query("select * from account", new ResultSetHandler<Account>() {
                @Override
                public Account handle(ResultSet resultSet) throws SQLException {
                    while (resultSet.next()) {
                        Account account1 = new Account();
                        account1.setId(resultSet.getInt("id"));
                        account1.setAccount(resultSet.getString("account"));
                        account1.setMoney(resultSet.getDouble("money"));
                        return account1;
                    }
                    return null;
                }
            });

            List list = runner.query("select * from account", new BeanListHandler<Account>(Account.class));
            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                System.out.println(listIterator.next());
            }

            System.out.println(account);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
