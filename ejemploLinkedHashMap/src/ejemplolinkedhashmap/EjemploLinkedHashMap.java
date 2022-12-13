/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplolinkedhashmap;

import java.util.LinkedHashMap;

/**
 *
 * @author mario
 */
public class EjemploLinkedHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*creamos un nuevo LinkedHashMap e indicamos como genericos integer y string, 
        estos representan la llave y el valor respectivamente*/
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();

        /* con este metodo sabemos si esta vacio o no el arbol*/
        System.out.println("¿lhm esta vacio? " + lhm.isEmpty());

        /* con este metodo agragamos nuevos valores, con sus respectivas llaves
        al linkedHashMap
         */
        lhm.put(2, "México");
        lhm.put(4, "Canada");
        lhm.put(0, "Japon");
        lhm.put(3, "España");
        lhm.put(1, "Italia");

        /* imprimimos lhm*/
        System.out.println("imprimimos lhm: ");
        System.out.println(lhm);

        System.out.println("¿lhm esta vacio? " + lhm.isEmpty());

        /*metodo para saber el tamaño de lhm*/
        System.out.println("tamaño de lhm: " + lhm.size());

        /* metodo para preguntar si lhm contiene un valor*/
        System.out.println("¿lhm contiene el valor 'España'? " + lhm.containsValue("España"));

        /* metodo que devuelve el valor ligado a la llave*/
        System.out.println("valor ligado a la llave '0': " + lhm.get(0));

        /* metodo para dejar vacio lhm*/
        System.out.println("vaciamos lhm: ");
        lhm.clear();
        System.out.println("imprimos lhm: ");
        System.out.println(lhm);
        System.out.println("tamaño de lhm: " + lhm.size());
        System.out.println("¿lhm esta vacio? " + lhm.isEmpty());

    }

}
