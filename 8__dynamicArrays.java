/*
Create an ArrayList<Integer> containing 10, 20, 30, 40, 50. Then,

1. Add 60.
2. Remove 30.
3. Print every element using a loop.
4. Print the list's size.
5. Calculate the sum.
*/

import java.util.ArrayList;

class dynamicArrays {
    public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        numbers.add(60); // add 60

        int value_to_remove = 30;
        numbers.remove(Integer.valueOf(value_to_remove)); // remove 30

        int sum = 0;
        int n = numbers.size();
        System.out.println("Elements of array are:");
        for(int i=0; i<n; i++){
            sum = sum + numbers.get(i);
            System.out.println(numbers.get(i));
        }

        System.out.println("Size of array is: "+n);
        System.out.println("Sum of all elements is: "+sum);
    }
}
