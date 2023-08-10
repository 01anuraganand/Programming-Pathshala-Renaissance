package interfaceintro;

import java.util.List;

public class AnimalUtility {
    public static void makenoise(List<Animal> animals){
        for(int i = 0; i<animals.size(); i++){
            animals.get(i).speak();
            animals.get(i).move();
        }

    }
}
