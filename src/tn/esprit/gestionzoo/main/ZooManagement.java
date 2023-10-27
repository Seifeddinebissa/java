package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        Animal dog3 = new Animal("Canine", "l", 2, true);
        Animal dog4 = new Animal("Canine", "lrr", -1, true);

        try {
            myZoo.addAnimal(lion);
            myZoo.addAnimal(dog);
            myZoo.addAnimal(dog);
            myZoo.addAnimal(dog);
        }catch (ZooFullException z){
            z.getMessage();
        }catch (InvalidAgeException i){
            i.getMessage();
        }
        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));

        System.out.println(myZoo.searchAnimal(dog2));

        //   System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);


        myZoo.displayAnimals();
        //System.out.println("a" + myZoo.removeAnimal(dog));
        //myZoo.displayAnimals();
        /*System.out.println("a" + myZoo.removeAnimal(dog));
        myZoo.displayAnimals();*/

//        System.out.println(tn.esprit.gestionzoo.entities.Zoo.comparerZoo(myZoo, notMyZoo));
//        System.out.println(myZoo.isZooFull());
        Aquatic aquatic = new Aquatic();
        Terrestrial terrestrial = new Terrestrial();
        Dolphin dol = new Dolphin();
        Penguin peng = new Penguin();
        //aquatic.swim();
        //dol.swim();
        //peng.swim();

        // prosit 6
        Aquatic a1 = new Aquatic();
        Aquatic a2 = new Aquatic();
        Penguin a3 = new Penguin();
        notMyZoo.addAquaticAnimal(a1);
        notMyZoo.addAquaticAnimal(a2);
        notMyZoo.addAquaticAnimal(a3);
        for(int i=0;i< notMyZoo.getNbAquaticAnimals();i++){
            notMyZoo.getAquaticAnimals()[i].swim();
        }
    }

}
