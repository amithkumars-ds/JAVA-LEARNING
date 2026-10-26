class methods {
    static int add(int a, int b){
        return a+b;
    }

    static int subtract(int a, int b){
        return a-b;
    }

    static int multiply(int a, int b){
        return a*b;
    }

    static int divide(int a, int b){
        return a/b;
    }

    static int remainder(int a, int b){
        return a%b;
    }

    public static void main(String args[]){
        int a = 17;
        int b = 5;

        int sum = add(a,b);
        int difference = subtract(a,b);
        int product = multiply(a,b);
        int quotient = divide(a,b);
        int rem = remainder(a,b);

        System.out.println("Sum: "+sum);
        System.out.println("Difference: "+difference);
        System.out.println("Product: "+product);
        System.out.println("Quotient: "+quotient);
        System.out.println("Remainder: "+rem);

    }
}
