/* 
Write a Java program that:
1. Creates an integer array containing {12, 7, 25, 3, 18}.
2. Uses a for loop to print every element.
3. Calculates and prints the sum of all elements.
4. Finds and prints the largest element.
*/

class arrays {
    static int[] bubbleSort(int[] numbers){
        int n = numbers.length;

        for(int i=0; i<n; i++){
            boolean swapped = false;
            for(int j=0; j<n-i-1; j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;

                    swapped = true;
                }
            }

            if(swapped == false){
                break;
            }
        }

        return numbers;
    }

    public static void main(String args[]){
        int sum = 0;
        int[] numbers = {12, 7, 25, 3, 18};

        System.out.println("Elements of the array are:");
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
            sum = sum + numbers[i];
        }

        System.out.println("\nSum of all numbers is: "+sum);

        int[] sorted_numbers = bubbleSort(numbers);
        int highest_index = sorted_numbers.length - 1;
        System.out.println("\nLargest element of all numbers is: "+numbers[highest_index]);

    }
}
