package Problem2;

public class Main {
    public static void main(String[] args) {
        PetShop shop = new PetShop();

        Pet dog = new Pet("Buddy", "Dog", "Golden Retriever", 500.0);
        Pet cat = new Pet("Whiskers", "Cat", "Persian", 300.0);
        Pet cat1 = new Pet("Whiskers1", "Cat", "Persian", 306.0);
        shop.addPet(dog);
        shop.addPet(cat);
        shop.addPet(cat1);

        Customer jane = new Customer("Jane Smith", "456 Elm St", "555-1234");

        shop.sellPet(dog, jane);

        shop.displayAvailablePets();
        shop.displaySalesHistory();
    }
}
