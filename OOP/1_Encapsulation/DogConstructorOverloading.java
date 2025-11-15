class Dog {
    private String breed;
    private float age;
    private int price;

    public Dog(String breed, float age, int price) {  // Parameterized Constructor
        // super(); // Implicit call to Object's constructor
        this.breed = breed; 
        this.age = age;
        this.price = price;
    }

    public Dog() { // Zero Parameterized Constructor
        // super(); // Implicit call to Object's constructor
        this.breed = "Pug";
        this.age = 5.5f;
        this.price = 7900;
    }

    public String getBreed() {
        return breed;
    }

    public float getAge() { 
        return age;
    }

    public int getPrice() {
        return price;
    }
}

public class DogConstructorOverloading { 
    public static void main(String[] args) {
        
        Dog d = new Dog("Bull Dog", 4.5f, 6500); // Using the Parameterized Constructor
        
        
        System.out.println(d.getBreed());
        System.out.println(d.getAge());
        System.out.println(d.getPrice());

        Dog d2 = new Dog(); // Using the Zero Parameterized Constructor

        System.out.println(d2.getBreed());
        System.out.println(d2.getAge());
        System.out.println(d2.getPrice());
    }
}
