public class Iteration {
    public static void main(String[] args) {
        String[] breakfast = new String[4];
        breakfast[0] = "Coffee";
        breakfast[1] = "Bacon";
        breakfast[2] = "Eggs";
        breakfast[3] = "Hash browns";

        System.out.println("What is my ideal breakfast? I'm glad you asked!!");

        for (String i : breakfast) {
            System.out.println(i);
        }
    }
}
