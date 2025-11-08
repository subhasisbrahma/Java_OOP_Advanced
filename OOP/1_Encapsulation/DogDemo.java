class Dog {
    private String breed;
    private float age;
    private int price;

    public void setDog(String breed, float age, int price) { //Setter methods for all three variables
        this.breed = breed; // "this" is an implicit reference maintained by the JVM, that would be pointing to the currently executing object within the program. It is used to resolve the "Shadowing Problem"
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

public class DogDemo { 
    public static void main(String[] args) {
        Dog d = new Dog();
        
        d.setDog("Bull Dog", 4.5f, 6500);
        
        System.out.println(d.getBreed());
        System.out.println(d.getAge());
        System.out.println(d.getPrice());
    }
}