package ejerciciolistapila;

import java.util.HashMap;
import java.util.Map;

public class Init {
    public static void main(String[] args) {
        
        Contenedor contenedor = new ContenedorPila();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana(contenedor).setVisible(true);
            }
        });
    }
    public static void main2(String[] args) {
        Map<String, String> opuestos = new HashMap<String, String>();
        
        opuestos.put("River", "Boca");
        opuestos.put("ford", "Chevrolet");
        opuestos.put("Macri", "Cristina");
        opuestos.put("Acuaman", "Tarzan");
        opuestos.put("Menotti", "Bilardo");
        opuestos.put("J&B", "Chivas");
        
        String s = opuestos.get("hola");
        System.out.println(s);
        
        for (String key : opuestos.keySet()) {
            System.out.println(opuestos.get(key));
        }
    }
}
