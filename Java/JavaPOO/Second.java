package JavaPOO;

class Second {
    // Criando um objeto da classe 'Student' (que herda atributos e métodos da Principal)
    public static void main(String[] args){
        Student myObj = new Student();

        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study(); //chamando método abstract
    }
}
