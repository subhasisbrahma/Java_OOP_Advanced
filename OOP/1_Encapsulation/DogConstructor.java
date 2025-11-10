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

public class DogConstructor { 
    public static void main(String[] args) {
        
        Dog d = new Dog("Bull Dog", 4.5f, 6500);// Direct object initialization using the constructor
        
        
        System.out.println(d.getBreed());
        System.out.println(d.getAge());
        System.out.println(d.getPrice());
    }
}