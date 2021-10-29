package Carlos.com;

public class Review {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.myMethod();
        System.out.println("The value of myInt is: " + mc.myInt);
        mc.myInt = 10;
        System.out.println("The new value of myInt is " + mc.myInt + " changed from the entry point.");
    }
}
