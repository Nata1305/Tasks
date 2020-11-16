/*
Создать абстрактный класс Animal с характеристиками животного.
Создать класс Horse который наследуется от Animal, в классе Horse
 реализовать метод public void run(){ System.out.println("Игого, я поскакал(а)"); }
Создать класс Pegasus который наследуется от Horse,
в классе Pegasus реализовать метод public void fly(){ System.out.println("Игого, я полетел(а)"); }
Создать объект лошади и вызвать метод run();
Создать объект пегаса и вызвать метод fly();
*/

public class Main{
    public static void main(String[] args) {
        Horse horse=new Horse("Рысак","упряжная",5);
        Pegasus pegasus=new Pegasus("Арабская", "верховая", 7);
        pegasus.fly();
        horse.run();
    }
}
abstract class Animal {
    String breed;
    String view;
    int age;

    public Animal(String breed, String view, int age) {
        this.breed = breed;
        this.view = view;
        this.age = age;
    }
}
class Horse extends Animal{

    public Horse(String breed, String view, int age) {
        super(breed, view, age);
    }
    public void run(){ System.out.println("Игого, я поскакал(а)"); }
}
class Pegasus extends Horse {

    public Pegasus(String breed, String view, int age) {
        super(breed, view, age);
    }
    public void fly(){ System.out.println("Игого, я полетел(а)"); }
}

