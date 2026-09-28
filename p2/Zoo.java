package p2;

public class Zoo {
    private static final int MAX_ANIMALS = 25;

    final Animal[] animals;
    final String name;
    final String city;
    final int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[MAX_ANIMALS];
    }

    public void displayZoo() {
        System.out.println("Zoo : " + name + ", ville : " + city
                + ", cages : " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo{name='" + name + "', city='" + city
                + "', nbrCages=" + nbrCages + "}";
    }
}
