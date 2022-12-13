/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplohashmap;

import java.util.HashMap;

/**
 *
 * @author mario
 */
public class EjemploHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*creamos un nuevo hashMap e indicamos como genericos integer y string, 
        estos representan la llave y el valor respectivamente*/
        HashMap<Integer, String> hash = new HashMap<>();

        /*con el metodo is empty, revisamos si esta vacio el hashMap, devolvera un true si esta vacio y 
        devolvera un false si contiene algo*/
        System.out.println("¿hash esta vacio? " + hash.isEmpty());

        /*con el metodo put guardamos en el HashMap un valor con su respectivo indice*/
        hash.put(1000, "Juan");
        hash.put(5000, "Raul");
        hash.put(4760, "Rene");
        hash.put(9340, "Roman");
        hash.put(7557, "Mar ");

        System.out.println("¿hash esta vacio? " + hash.isEmpty());

        /*metodo para conocer el tamaño del HashMap*/
        System.out.println("tamaño de hash: " + hash.size());

        /* este metodo nos devuelve el valor que contenga la llave*/
        System.out.println("valor de la llave '1000': " + hash.get(1000));

        /*imprimimos hash*/
        System.out.println("imprimimos hash: ");
        System.out.println(hash);

        /* metodo para borrar un valor del HashMap mediante la llave*/
        System.out.println("removemos el valor de la llave '4760'");
        hash.remove(4760);
        System.out.println("tamaño de hash: " + hash.size());
        System.out.println("imprimimos hash: ");
        System.out.println(hash);

        /* metodo para preguntar si el HashMap contiene una llave*/
        System.out.println("¿hash contiene la llave '5000'? " + hash.containsKey(5000));

        /* metodo para preguntar si el HashMap contiene una valor*/
        System.out.println("¿hash contiene el valor 'Juan'? " + hash.containsValue("Juan"));

        /* este metodo deja vacio el HashMap*/
        System.out.println("vaciamos hash");
        hash.clear();
        System.out.println("tamaño de hash: " + hash.size());
        System.out.println("imprimimos hash: " + hash);

    }

}
