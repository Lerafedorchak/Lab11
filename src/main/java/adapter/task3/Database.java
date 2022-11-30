package adapter.task3;

public class Database extends БазаДаних{
    public String retriveUserData(){
        return отриматиДаніКористувача();
    }
    public String retriveStatic(){
        return отриматиСтатистичніДані();
    }
}
