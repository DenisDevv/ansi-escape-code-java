package escape;
public class Escape {
    public static String posizione(int x, int y) {
        return "\033["+ y +";2"+ x +"H";
    }
    public static String pulisci() {
        return "\033[2J";
    }
}