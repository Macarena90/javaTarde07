package ejerciciolistapila;

import java.util.ArrayList;

public class ContenedorLista implements Contenedor {
    private ArrayList<Usuario> usuarios;
    private int posicion = 0;
    
    public ContenedorLista() {
        usuarios = new ArrayList<Usuario>();
    }
    public void agregarUsuario(Usuario u) {
        // usuarios.add(u);
        long cant = usuarios.stream().filter( z -> z.id.equals(u.id) ).count();
        if (cant == 0) {
            usuarios.add(u);
        }
        posicion = usuarios.size() - 1;
    }
    public void visualizar() {
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }
    public Usuario volverAtras() {        
        Usuario u = usuarios.get(posicion);
        if (posicion > 0) {
            posicion--;
        }
        return u;
    }
}
