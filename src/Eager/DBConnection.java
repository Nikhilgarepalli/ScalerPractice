package Eager;

public class DBConnection {

    private static DBConnection instance = null;

    private DBConnection()
    {

    }

    public static DBConnection getInstance()
    {

        return instance;
    }
}
