public class Main{
    public static void main(String[] args) {
        int x;
        int y;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        x = in.nextInt();
        System.out.println("Enter the second number: ");
        y = in.nextInt();
        for (int i = x; i <= y; i++) {
            System.out.println(i);
            if (isPrime(i)) {
                System.out.println(i + " is a prime number.");
            } else {
                System.out.println(i + " is not a prime number.");
            }
        }
    }
public static double computeAverage(int x, int y) {
    return (x + y) / 2.0;
}
public class UserChoice { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter X: ");
        int x = sc.nextInt();

        System.out.print("Enter Y: ");
        int y = sc.nextInt();

        System.out.println("Choose an option:");
        System.out.println("1 - Compute average");
        System.out.println("2 - Display prime numbers between X and Y");
        int choice = sc.nextInt();

    }
}
