import java.util.Scanner; // for taking inputs from user

class calculator{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        if(num2==0){
            System.out.println("exception: num2 cannot be zero!");
            return;
        }
        
        int sum = num1 + num2; // compute sum
        int difference = num1 - num2; // compute difference
        int product = num1 * num2; // compute product
        int quotient = num1 / num2; // compute quotient
        int remainder = num1 % num2; // compute remainder

        System.out.println("\nDisplaying Computations");
        System.out.println("------------------------");

        System.out.println("Sum: "+sum);
        System.out.println("Difference: "+difference);
        System.out.println("Product: "+product);
        System.out.println("Quotient: "+quotient);
        System.out.println("Remainder: "+remainder);


    }
}
