import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = 10; 
        int K = 5;  

        int candiesAvailable = N;

        
        int order = sc.nextInt();

        if (order <= 0 || order > candiesAvailable || candiesAvailable - order < K) {
            System.out.println("INVALID INPUT");
        } else {

            candiesAvailable = candiesAvailable - order;

            System.out.println("Number of Candies Sold: " + order);
            System.out.println("Number of Candies available:" + candiesAvailable);
        }
    }
}
