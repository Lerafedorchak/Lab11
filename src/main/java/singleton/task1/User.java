package singleton.task1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class User {
    private Integer id;
    private String name;
    private  String email;

    public void save(){
        Connection connection = Connection.getConnection();
        String query = "insert into user (email, name) values ('ya.prytula@ucu.edu.ua', 'Yaroslav');";
        connection.executeQuery(query);
    }
}
