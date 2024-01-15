package Problem2;

import java.util.ArrayList;
import java.util.List;

public class PetShop {
    private List<Pet> availablePets = new ArrayList<>();
    private List<Sale> salesHistory = new ArrayList<>();

    public void addPet(Pet pet) {
        availablePets.add(pet);
    }

    public void sellPet(Pet pet, Customer customer) {
        availablePets.remove(pet);
        Sale sale = new Sale(pet, customer, pet.getPrice());
        salesHistory.add(sale);
    }

    public List<Pet> searchPets(String species, String breed, double maxPrice) {
        List<Pet> matchingPets = new ArrayList<>();
        for (Pet pet : availablePets) {
            if (pet.getSpecies().equalsIgnoreCase(species) &&
                    pet.getBreed().equalsIgnoreCase(breed) &&
                    pet.getPrice() <= maxPrice) {
                matchingPets.add(pet);
            }
        }
        return matchingPets;
    }

    public void displayAvailablePets() {
        if (availablePets.isEmpty()) {
            System.out.println("No pets available.");
        } else {
            System.out.println("Available Pets:");
            for (Pet pet : availablePets) {
                System.out.println(pet);
            }
        }
    }

    public void displaySalesHistory() {
        if (salesHistory.isEmpty()) {
            System.out.println("No sales history.");
        } else {
            System.out.println("Sales History:");
            for (Sale sale : salesHistory) {
                System.out.println(sale.getDate() + " - " + sale.getPet() + " sold to " + sale.getCustomer() + " for $"
                        + sale.getTotalPrice());
            }
        }
    }
}
