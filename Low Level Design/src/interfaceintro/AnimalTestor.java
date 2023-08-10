package interfaceintro;

import java.util.ArrayList;
import java.util.List;

// Interface is skelton for class
public class AnimalTestor{
    public  static void  main(String[] args){
        /*Animal animal;
        animal = new Dog();
        animal.move();
        animal.speak();

        animal = new Cat();
        animal.speak();
        animal.move();*/

        System.out.println("------------------------------------------");
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cat());
        animals.add(new Dog());
        AnimalUtility.makenoise(animals);

    }
}
