package main;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import main.LogicaClasificacion;
public class App {
    public static void main(String[] args) throws Exception {
        LogicaClasificacion logica = new LogicaClasificacion();
        Queue<String> colaNombres = new LinkedList<>();
            colaNombres.add("Ana");
            colaNombres.add("Luis");
            colaNombres.add("Marta");
        System.out.println("Entrada: " + colaNombres);
        Queue<String> invertida = logica.invertirColaNombres(colaNombres);
        System.out.println("Salida esperada (impresa): " + invertida);

        Queue<Integer> cola1 = new LinkedList<>();
            cola1.add(1);
            cola1.add(3);
            cola1.add(5);

        Queue<Integer> cola2 = new LinkedList<>();
            cola1.add(2);
            cola1.add(4);
            cola1.add(6);
            cola1.add(8);

    }
}
