package tn.esprit.gestionzoo.entities;

public class Zoo {

    private static final int NUMBER_OF_CAGES = 25;
    private Animal[] animals;
    private String name, city;
    private int nbrAnimals;
    private Aquatic[] aquaticAnimals;
    private int nbAquaticAnimals=0;

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        this.name = name;
        this.city = city;
        this.aquaticAnimals = new Aquatic[10];
    }

    public int getNbAquaticAnimals() {
        return nbAquaticAnimals;
    }

    public void setNbAquaticAnimals(int nbAquaticAnimals) {
        this.nbAquaticAnimals = nbAquaticAnimals;
    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    public void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (this.isZooFull())
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals] = null;
        this.nbrAnimals--;
        return true;
    }

    public void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }

    public boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals;
    }

    public void addAquaticAnimal(Aquatic aquatic){
        if (nbAquaticAnimals == 10){
            System.out.println("table is full");
        } else{
            this.aquaticAnimals[nbAquaticAnimals] = aquatic;
            this.nbAquaticAnimals++;
        }
    }

    public float maxPenguinSwimmingDepth(){
        if (aquaticAnimals == null || aquaticAnimals.length==0) {
            return 0.0f;
        }
        float maxDepth = 0;
        for(Aquatic aquatic : aquaticAnimals){
            if (aquatic.getClass()==Penguin.class){
                if (((Penguin) aquatic).getSwimmingDepth() > maxDepth){
                    maxDepth = ((Penguin) aquatic).getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dophins = 0;
        int pinguins = 0;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic.getClass() == Penguin.class) {
                pinguins++;
            }
            if (aquatic.getClass() == Dolphin.class) {
                dophins++;
            }
        }
        System.out.println("Nombre des pinguins : "+pinguins);
        System.out.println("Nombre des dophins : "+dophins);
    }
}
