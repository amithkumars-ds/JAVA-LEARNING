/*
Create a java program that,

1. Stores "Distributed Systems" in a String variable.
2. Prints its length.
3. Prints its first character.
4. Checks whether it equals "distributed systems" and prints the result.
5. Prints the first 11 characters.
*/

class strings {
    public static void main(String args[]){
        String message = "Distributed Systems";

        System.out.println("Length of message is: "+message.length());
        System.out.println("First character of message is: "+message.charAt(0));

        String comparison_text = "distributed systems";
        if(message.equalsIgnoreCase(comparison_text)){
            System.out.println("Texts match!");
        }else{
            System.out.println("Texts do not match!");
        }

        System.out.print("First 11 characters of message is: ");
        int required_length = 11;
        for(int i=0; i<required_length; i++){
            System.out.print(message.charAt(i));
        }
        
        System.out.println();
    }
}
