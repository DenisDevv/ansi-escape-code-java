package escape;

public class Ritardo {
    public static void ritardo() {
        for (int i = 0; i < 999999999; i++) {
            for (int j = 0; j < 999999999; j++) {
                // Non fare nulla
            }
        }
    }
    public static void ritardoComplicato(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.out.println("Errore: " + e);
        }
    }
}
