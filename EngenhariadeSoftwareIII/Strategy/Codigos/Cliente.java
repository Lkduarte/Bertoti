package EngenhariadeSoftwareIII.Strategy.Codigos;

public class Cliente {

    private Festival festival;

    public void setFestival(Festival festival) {
        this.festival = festival;
    }

    public void participarFestival() {
        this.festival.participar();
    }
}