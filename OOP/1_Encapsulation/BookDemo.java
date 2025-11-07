class Book {
    private int page_no; // private variable

    public void setData(int n) { // public setter/mutator method
        if (n > 0) {
            page_no = n;
        } else {
            System.out.println("Invalid Input");
        }
    }

    public int getData() { // public getter/accessor method
        if (page_no > 0) {
            return page_no;
        } else {
            System.out.println("Book is empty");
            return 0;
        }
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Book b = new Book();

        // b.page_no = -100; // INVALID : Cannot be directly accessed or modified as it is "private"
        // System.out.println(b.page_no); // INVALID

        b.setData(100); // Use of the public setter method to set the value
        System.out.println(b.getData()); // Use of the public getter method to get the value
    }
}