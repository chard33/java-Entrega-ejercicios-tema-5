package ejercicioInterfaces;

public class Main {
    public static void main(String[] args)
    {
        CocheCRUD cocheCrud = new CocheCRUDImpl();

        System.out.println(cocheCrud.save());
        System.out.println(cocheCrud.findAll());
        System.out.println(cocheCrud.delete());
    }
}