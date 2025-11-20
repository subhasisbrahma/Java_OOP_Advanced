class Dog {
    String breed;
    float age;
    int price;

    static int count; // Static variable used to count instances

    // Non-static block (copied to every constructor)
    {
        ++count; // Increment the counter every time an object is created
    }

    public Dog() { // Constructor 1 (No-Arg)
        breed = "Pug";
        age = 4.5f;
        price = 6660;
    }

    public Dog(String breed) { // Constructor 2 (Single-Arg)
        this.breed = breed;
    }

    public Dog(String breed,float age) { // Constructor 3 (Double-Arg)
        this.breed = breed;
        this.age = age;
    }

    public Dog(String breed, float age, int price) { // Constructor 4 
        this.breed = breed;
        this.age = age;
        this.price = price;
    }
}

public class ObjectCountDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        Dog d1 = new Dog("Bull Dog");
        Dog d2 = new Dog("German Shepherd", 6.5f, 9999);
        Dog d3 = new Dog("Husky", 4.5f, 9999);
        
        System.out.println(Dog.count); // Accessing the static counter variable via the class name
        
    }
}