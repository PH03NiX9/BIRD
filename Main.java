

public class Main {

    public static void main(String[] args) {
        // Vytvoří klasického ptáka
        Ptak kos = new Ptak();
        System.out.println(kos);
        kos.snez(20); // Nechá ho sníst 20g jídla
        System.out.println(kos);

        // Vytvoří ptáka se schopností vzteku
        AngryPtak redBird = new AngryPtak();
        System.out.println(redBird);
        redBird.provokuj(5); // Vyprovokuje hladového ptáka
        System.out.println(redBird);
        redBird.snez(100);
        redBird.provokuj(5); // Vyprovokuje najezeného ptáka
        System.out.println(redBird);
    }
}
