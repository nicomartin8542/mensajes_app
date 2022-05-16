import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hola mundo");
        if (Conxion.getConnection() == null) new Conxion();
        System.out.println(Conxion.getConnection());
    }
}
