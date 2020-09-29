package factoryDesignPattern.DAO;

public class BookDAO implements DAO {
    @Override
    public void insert() {
        System.out.println("book inserted");
    }

    @Override
    public void select() {

    }

    @Override
    public void update() {

    }
}
