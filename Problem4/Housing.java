package Problem4;

import java.util.ArrayList;

public class Housing implements IStructure {
    private String address;
    private ArrayList<IStructure> structures;

    public Housing(String address) {
        this.structures = new ArrayList<IStructure>();
        this.address = address;
    }

    public String getName() {
        return this.address;
    };

    public int addStructure(IStructure component) {
        this.structures.add(component);
        return this.structures.size() - 1;
    }

    public IStructure getStructure(int componentNumber) {
        return this.structures.get(componentNumber);
    }

    public void enter() {
        System.out.println("You have entered the " + this.address);
    };

    public void exit() {
        System.out.println("You have left the " + this.address);
    };

    public void location() {
        System.out.println("You are currently in  " + this.getName() + ". It has ");
        for (IStructure struct : this.structures) {
            System.out.println("\t- " + struct.getName());
        }
    };

}
