class Dog {
    private String breed;
    private float age;
    private int price;

    public Dog(String breed, float age, int price) {  // Three Arguments Constructor
        this(breed);
    }

    public Dog(String breed){ // One Argument Constructor
        this();
        this.breed = breed;
    }

    public Dog() { // Zero Argument Constructor
        // BASE for default values
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

public class DogConstructorChainingTwo { 
    public static void main(String[] args) {
        
        Dog d = new Dog("Bull Dog", 4.5f, 6500); 
        
        System.out.println(d.getBreed());
        System.out.println(d.getAge());
        System.out.println(d.getPrice());

        Dog d2 = new Dog(); 

        System.out.println(d2.getBreed());
        System.out.println(d2.getAge());
        System.out.println(d2.getPrice());
    }
}