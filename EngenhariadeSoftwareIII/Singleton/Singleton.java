package EngenhariadeSoftwareIII.Singleton;

public class Singleton {

    private static Singleton instance = null;

    public String singleton;

    private Singleton() {
        singleton = "Olá, eu sou a String que faz parte da classe Singleton!";
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}