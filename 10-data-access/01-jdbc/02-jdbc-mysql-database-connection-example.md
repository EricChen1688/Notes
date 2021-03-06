# Java jdbc connection Example(MySQL)

By Lokesh Gupta | Filed Under: [JDBC](https://howtodoinjava.com/java/jdbc/)

It’s very strange if you are still using [**JDBC**](https://howtodoinjava.com/category/java/jdbc/) in your project for database access because there are lot’s of powerful alternatives like [**hibernate**](https://howtodoinjava.com/hibernate-tutorials/) and [**iBatis**](https://howtodoinjava.com/category/frameworks/ibatis/). But it is important to learn basics and it requires learning JDBC first.

In this post, I am giving an **example of making a connection with database using MySQL Driver**. Read more about [**types of JDBC drivers**](https://howtodoinjava.com/java/jdbc/jdbc-basics-types-of-jdbc-drivers/).

Handling a connection requires following steps:

1) Load the driver
2) Open database connection
3) Close database connection

Let’s follow above steps in code:

## 代码实例

```java
/**
 * <p>
 * 使用 JDBC API 的普通方式
 * The Common Way to Use JDBC Api
 * </p>
 *
 * @author qiang.chen04@hand-china.com 2020/02/08 23:16
 */
public class SimpleJdbcExample {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found !!");
            return;
        }
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCDemo", "root", "root");
            String sql = "SELECT * FROM sys_user where user_id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,1);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int user_id = resultSet.getInt("user_id");
                String username = resultSet.getString("username");
                System.out.println("user_id = " + user_id + ",username = " + username);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                preparedStatement.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
```

缺点显而易见:

- 