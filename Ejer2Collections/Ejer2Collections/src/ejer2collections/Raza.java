
package ejer2collections;

import java.util.ArrayList;

public class Raza {
    ArrayList<String> razas = new ArrayList ();
    private String raza;

    public Raza() {
    }

    public Raza(String raza) {
        this.raza = raza;
    }
    //se guarda con el .add 
    public ArrayList<String> getRazas() {
        return razas;
    }

    public void setRazas(String razas) {
        this.razas.add(razas);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
  
}
