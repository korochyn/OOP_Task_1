package Task1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        Cat cat = new Cat(); //экземпляр класса
        cat.setName("barsic");
        System.out.println(cat.getName());
        Dog dog = new Dog("max",new Chumka("chumka123"), "petr",
                LocalDate.of(3,12,21));
        Fish fish = new Fish();
        Duck duck = new Duck();        
        // System.out.println(dog.getName());
        // System.out.println(dog.getIllness());
        // dog.getIllness().heal();
//        dog.toWakeUp("13:22");
//        cat.toWakeUp();
        // ArrayList <Animal> animals = new ArrayList<>();
        // animals.add(cat);
        // animals.add(dog);
        // cat.liveCycle();
        // dog.breathe();
        cat.toGo();
        cat.swim();
        cat.fly();
        System.out.println("____________________________");
        dog.toGo();
        dog.swim();
        dog.fly();
        System.out.println("____________________________");
        fish.toGo();
        fish.swim();
        fish.fly();
        System.out.println("____________________________");
        duck.toGo();
        duck.swim();
        duck.fly();


    }
}
