package JavaPOO;

class Polimorfismo {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }    
}

class Pig extends Polimorfismo {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Polimorfismo {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

