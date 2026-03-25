//Desconsiderar o Package
package ports;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
       ArrayList<Figura> figuras = new ArrayList<>();
       figuras.add(new Retangulo(10, 30));
       figuras.add(new Circulo(9));
        
       for (Figura f : figuras){
        System.out.println("Classe: " + f.getClass().getSimpleName() + " | Área: " + f.calculararea());
       }
    }
}
