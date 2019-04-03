package ejerciciolistapila;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ContenedorMapa implements Contenedor {
    private Map<String, Usuario> usuarios;
    private int posicion = 0;
    
    public ContenedorMapa() {
        usuarios = new HashMap<String, Usuario>();
    }
    public void agregarUsuario(Usuario u) {
        usuarios.put(u.id, u);        
        posicion = usuarios.size() - 1;
    }
    public void visualizar() {
        for (String key : usuarios.keySet()) {
            System.out.println(usuarios.get(key));
        }
        System.out.println("-------------------------------------");
    }
    public Usuario volverAtras() {
        return new Usuario("NO","Tengo", "Idea");
    }
}
