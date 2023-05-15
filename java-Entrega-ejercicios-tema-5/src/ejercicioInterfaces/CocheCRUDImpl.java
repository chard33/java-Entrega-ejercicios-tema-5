package ejercicioInterfaces;

public class CocheCRUDImpl implements CocheCRUD {
    @Override
    public String save() {
        return "Metodo: save()";
    }

    @Override
    public String findAll() {
        return "Metodo: findAll()";
    }

    @Override
    public String delete() {
        return "Metodo: delete()";
    }
}
