/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplotreemap;

import java.util.TreeMap;

/**
 *
 * @author mario
 */
public class EjemploTreeMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*creamos un nuevo TreeMap e indicamos como genericos String e integer, 
        estos representan la llave y el valor respectivamente*/
        TreeMap<String, Integer> tree = new TreeMap<>();

        /* con este metodo sabemos si esta vacio o no el arbol*/
        System.out.println("¿tree esta vacio? " + tree.isEmpty());

        /* con este metodo agragamos nuevos valores, con sus respectivas llaves
        al arbol
         */
        tree.put("B", 45);
        tree.put("D", 29);
        tree.put("C", 90);
        tree.put("A", 57);
        tree.put("E", 75);

        /* imprimimos tree*/
        System.out.println("imprimimos tree: ");
        System.out.println(tree);

        System.out.println("¿tree esta vacio? " + tree.isEmpty());

        /*metodo para saber el tamaño de tree*/
        System.out.println("tamaño de tree: " + tree.size());

        /* metodo para preguntar si el TreeMap contiene una llave*/
        System.out.println("¿tree contiene la llave 'C'? " + tree.containsKey("C"));

        /* metodo para preguntar si el TreeMap contiene una valor*/
        System.out.println("¿tree contiene el valor '90'? " + tree.containsValue(90));

        /* metodo que devuelve la primer llave con respecto al ordenamiento de estas*/
        System.out.println("primer llave de tree: " + tree.firstKey());

        /* metodo que devuelve la ultima llave*/
        System.out.println("ultima llave de tree: " + tree.lastKey());

        /* metodo que devuelve el valor ligado a la llave*/
        System.out.println("valor de la llave 'C': " + tree.get("C"));

        /* metodo para remover el valor asignado a una llave*/
        System.out.println("removemos el valor de la llave 'C' ");
        tree.remove("C");
        System.out.println("imprimimos tree: ");
        System.out.println(tree);
        System.out.println("tamaño de tree: " + tree.size());

        /* metodo para dejar vacio tree*/
        System.out.println("vaciamos tree: ");
        tree.clear();
        System.out.println("imprimimos tree: ");
        System.out.println(tree);
        System.out.println("tamaño de tree: " + tree.size());
        System.out.println("¿tree esta vacio? " + tree.isEmpty());

    }

}
