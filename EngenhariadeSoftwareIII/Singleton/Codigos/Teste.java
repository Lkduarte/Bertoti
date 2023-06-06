package EngenhariadeSoftwareIII.Singleton.Codigos;

public class Teste {
    public static void main(String args[]) {

        Singleton x = Singleton.getInstance();

        Singleton y = Singleton.getInstance();

        Singleton z = Singleton.getInstance();

        System.out.println("Hashcode de a é " + x.hashCode());
        System.out.println("Hashcode de b é " + y.hashCode());
        System.out.println("Hashcode de c é " + z.hashCode());

        if (x == y && y == z) {

            System.out.println("\nTrês objetos apontam para o mesmo local");
        }

        else {
            System.out.println("\nOs três objetos não apontam para o mesmo local");
        }
    }
}
