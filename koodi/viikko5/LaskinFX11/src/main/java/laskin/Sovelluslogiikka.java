package laskin;





public class Sovelluslogiikka {
 
    private int tulos;
    private int edellinenLuku = 0;
 
    
    public void plus(int luku) {
        tulos += luku;
        edellinenLuku = luku;
    }
     
    public void miinus(int luku) {
        tulos -= luku;
        edellinenLuku = luku;
    }
 
    public void nollaa() {
        tulos = 0;
    }
 
    public int getEdellinenLuku() {
        return edellinenLuku;
    }
    
    public int tulos() {
        return tulos;
    }
}