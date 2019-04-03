package ejerciciolistapila;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ContenedorPila implements Contenedor {
    private Stack<Usuario> usuarios;
    
    public ContenedorPila() {
        usuarios = new Stack<Usuario>();
    }
    public void agregarUsuario(Usuario u) {
        usuarios.push(u);
    }
    public void visualizar() {
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
        System.out.println("-------------------------------------");
    }
    public Usuario volverAtras() {
        return usuarios.pop();
    }
}
