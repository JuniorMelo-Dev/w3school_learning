package javapoo;

class Main3 {
    public static void main(String[] args) {
        Polimorfismo myAnimal = new Polimorfismo();
        Polimorfismo myPig = new Pig();
        Polimorfismo myDog = new Dog();
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
