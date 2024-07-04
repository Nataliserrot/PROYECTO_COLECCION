package misrc;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Principal {

    public static void main(String[] args) {
        ejemplo2();

    }

    //CREAR UNA COLECCION TREESET Y AGREGAR ELEMENTOS
    public static void ejemplo1() {
        Set<Integer> enteros_ts = new TreeSet<>(); //TREESET: FILTRA, ORGANIZA EN ASCENDENTE Y ELIMINA LOS DUPLICADOS
        enteros_ts.add(2);
        enteros_ts.add(3);
        enteros_ts.add(2);
        enteros_ts.add(1);
        enteros_ts.add(6);
        for (Integer elemento : enteros_ts) { //RECORRE POR ELEMENTO.
            System.out.print(elemento + " ");
        }
        for (int i = 0; i < enteros_ts.size(); i++) { //NO SE PUEDE RECORRER POR INDICE
            //  System.out.print(enteros_ts.get(i); 
        }
//CONVERTIR UN TREESET EN ARRAYLIST
        List<Integer> enteros_al = new ArrayList<>(enteros_ts);

        for (Integer elemento : enteros_ts) { //AQUI SI PERMITE RECORRER POR ELEMENTO
            System.out.print(elemento + " ");
        }
        for (int i = 0; i < enteros_al.size(); i++) { //TAMBIÉN RECORRER POR INDICE
            System.out.print(enteros_al.get(i) + " ");
        }
    }

    //CREAR UN TREESET DE TIPO CADENA
    public static void ejemplo2() {
        Set<String> nombres_ts = new TreeSet<>();
        nombres_ts.add("Luis Cardono");
        nombres_ts.add("Miguel");
        nombres_ts.add("Carlos");
        nombres_ts.add("Luis Cardona");
        nombres_ts.add("Arturo");
        nombres_ts.add("Natali");
        //RECORRER TREESET POR ELEMENTO
        for (String elemento : nombres_ts) {
            System.out.println(elemento);
        }
    }

}
