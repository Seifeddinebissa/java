package tn.esprit.gestionzoo.entities;

public class InvalidAgeException extends Exception{
    public InvalidAgeException(){
        super("Age est  invalid");
    }
}
