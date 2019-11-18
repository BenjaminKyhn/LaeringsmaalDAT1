/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 15/11/2019
 */
package model;

/**
 * Se data på https://docs.google.com/document/d/1iOl1tE5otK4_62Imoffysd3hA0AGPWTA4LrNidOlf3k/edit
 */
public class Emner {

    public String[] emner = new String[13];

    public Emner() {
        emner[0] = "Variable";
        emner[1] = "Klasser og objekter";
        emner[2] = "Opbygning af en javaklasse";
        emner[3] = "Kontrolstrukturer";
        emner[4] = "Arrays og ArrayLists";
        emner[5] = "GUI";
        emner[6] = "Exceptions";
        emner[7] = "Polymorfi";
        emner[8] = "Database";
        emner[9] = "Versioneringssystemer";
        emner[10] = "Nedarvning";

    }

    // Gemt data
    public String[] gemtEmne = new String[1];

    public String[] getEmner() {
        return emner;
    }

    public String getEmne(int i) {
        return emner[i];
    }

    public void setEmne(int i, String value) {
        emner[i] = value;
    }

}
