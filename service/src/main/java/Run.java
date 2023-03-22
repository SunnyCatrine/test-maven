import dao.Dao;

public class Run {
    public static void main(String[] args) {
        System.out.println("Iyi misin?");
        Dao dao = new Dao();
        System.out.println(dao.find());
    }
}
