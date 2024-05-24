package accesodatos;

public interface IAccesoDatos {
    int MAX_REGISTRO = 10;
    
    //Metodo insertar es abstracto y sin cuerpo
    // CRUD
    void inserter();
    void listar();
    void actualizar();
    void eliminar ();
}


