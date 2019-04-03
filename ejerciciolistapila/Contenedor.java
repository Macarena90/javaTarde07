package ejerciciolistapila;

import java.util.ArrayList;

public interface Contenedor {
    public void agregarUsuario(Usuario u);
    public void visualizar();
    public Usuario volverAtras();
}
