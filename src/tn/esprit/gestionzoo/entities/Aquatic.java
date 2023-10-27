package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal{
    protected String habitat;

    public Aquatic(){}

    public Aquatic(String family, String name, int age, boolean isMammal,String habitat){
        super(family,name,age,isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Aquatic{" +
                super.toString()+
                "habitat='" + habitat + '\'' +
                '}';
    }

    public void swim(){
        System.out.println("this aquatic animal is swimming");
    }

    @Override
    public boolean equals(Object obj) {
        boolean ok=false;

        if (obj instanceof Aquatic){
            ok = (
                    age == ((Aquatic) obj).age
                    && name.equals(((Aquatic) obj).getName())
                    && habitat.equals(((Aquatic) obj).getHabitat())
            );
        }
        return ok;
    }
}
