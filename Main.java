/**
 * Escape.java
 * Escape.pulisci()
 * Nessun parametro
 * @return Pulisce lo schermo
 * Escape.posizione()
 * @param x Coordinata x
 * @param y Coordinata y
 * @return Posizione del cursore
 * Ritardo.java
 * Ritardo.ritardo()
 * Nessun parametro
 * Ritardo.ritardoComplicato()
 * @param ms Millisecondi 
 */
package escape;
public class Main {
    public static void main(String[] args) {
        System.out.print(Escape.pulisci());
        int max = 5;
        for (int i = max; i>0; i--) {
            if (i<max) {
                System.out.print(Escape.posizione(i+1, i+1) + " ");
            }
            System.out.print(Escape.posizione(i, i) + "*");
           //  Ritardo.ritardo(); Non sembra funzionare il doppio ciclo for all'esterno del file Main.java
            Ritardo.ritardoComplicato(100);
        }
        System.out.println(Escape.posizione(0, 13));
    }
}