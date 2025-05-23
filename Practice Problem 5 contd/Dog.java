public class Dog {

    String name;
    int age;
    String breed;
    
    public Dog(String name, int age, String breed) {

        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void bark() {

        System.out.println("The dog is barking");
    }

    public void spin() {

        System.out.println("The dog is spinning");
    }

    public void run() {

        System.out.println("The dog is running");
    }

    public static void main(String[] args) {
        
        Dog myDog = new Dog("Kaaju", 3, "Golden Retriever");

        System.out.println("Dog's name: " + myDog.name);
        System.out.println("Dog's age: " + myDog.age + " Years");
        System.out.println("Dog's breed: " + myDog.breed);

        myDog.bark();
        myDog.spin();
        myDog.run();
    }
}
