
package com.mycompany.aventura.main.listas;

import java.io.Serializable;

public class ListaElementosExcepcion extends Exception implements Serializable{
    
    public ListaElementosExcepcion(String string) {
        super(string);
    }
}