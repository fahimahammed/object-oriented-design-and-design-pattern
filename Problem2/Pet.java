package Problem2;

public class Pet {
    private String name;
    private String species;
    private String breed;
    private double price;

    public Pet(String name, String species, String breed, double price) {
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.price = price;
    }

    // Getters for pet information
    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getBreed() {
        return breed;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", breed='" + breed + '\'' +
                ", price=" + price +
                '}';
    }
}
