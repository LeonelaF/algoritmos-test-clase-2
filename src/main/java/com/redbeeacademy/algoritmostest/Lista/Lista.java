package com.redbeeacademy.algoritmostest.Lista;
/*
Realizar los siguientes métodos:
1) Guarde un numero en una lista
2) Intercambie el elemento de la posicion 2 por la posicion 4.
3) Un metodo recibe una lista de numeros y un numero, la funcion debe agregar el numero al inicio de la lista
4) Calcular el promedio de los elementos de una lista
5) Eliminar la posicion donde se encuentre el valor maximo de la lista
6) Dadas dos listas, crear una nueva con los elementos que se repitan en ambas
 */

import java.util.ArrayList;
import java.util.List;


public class Lista {

    public static List<Integer> guardarEnLista(Integer numero){
       List<Integer> nueva= new ArrayList<>();
       if(numero!=null){
           nueva.add(numero);
       }
        return nueva;
    }

    public static List<Integer> intercambiar(List<Integer> lista){
        List<Integer> nueva= new ArrayList<>();
        for (int i=0;i<lista.size();i++){
            if(i==2){
                nueva.add(lista.get(4));
            } else if(i==4){
                nueva.add(lista.get(2));
            }else{
                nueva.add(lista.get(i));
            }
        }
        return nueva;
    }

    public static List<Integer> agregarElementoAlInicio(List<Integer> lista, Integer numero){
        List<Integer> nueva= new ArrayList<>();
        if(numero!=null){
            nueva.add(numero);
        }
        for (int i=0; i<lista.size();i++){
            nueva.add(lista.get(i));
        }
        return nueva;
    }

    public static Double promedioLista(List<Integer> lista) {
        Double prom = 0.0;
        if (lista != null) {
            for (int i = 0; i < lista.size(); i++) {
                prom = prom + lista.get(i);
            }
            prom = prom / lista.size();
        }
        return prom;
    }

    public static List<Integer> eliminarMaximo(List<Integer> lista){
        //fixme
        Integer max=lista.get(0);
        Integer pos=0;
        List<Integer> nueva= new ArrayList<>();
        for (int i=0; i<lista.size();i++){
            if(lista.get(i)>max){
                max=lista.get(i);
            }else{
                nueva.add(lista.get(i));
            }
        }
        nueva=lista;
        return nueva;
    }

    public static List<Integer> repetidos(List<Integer> a, List<Integer> b) {
        List<Integer> c = new ArrayList<>();
        if (a != null && b != null) {
            for (int i = 0; i < a.size(); i++) {
                for (int j = 0; j < b.size(); j++) {
                    if (a.get(i) == b.get(j)) {
                        c.add(a.get(i));
                    }
                }
            }
        }
        return c;
    }
}
