/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author forstjoh
 */
public class Nollaa extends Komento {

    private Sovelluslogiikka sovellus;
    private TextField tuloskentta;
    private TextField syotekentta;
    private Button nollaa;
    private Button undo;
    
    public Nollaa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.undo = undo;
        this.nollaa = nollaa;
    }

    @Override
    void suorita() {
        tuloskentta.setText(String.valueOf(""));
    }

    @Override
    void peru() {
//        this.sovellus.miinus(this.sovellus.getEdellinenLuku());
    }
    
}
