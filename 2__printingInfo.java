/*
Write a program that prints output like this, 
using variables rather than hardcoding the entire output:

Name: Kumar
Age: 25
Goal: Learn Java for distributed systems
Next year, I will be 26.
*/

class printingInfo{
    public static void main(String args[]){
        String name = "Kumar";
        int age = 25;
        String goal = "Learn Java for distributed systems";
        int next_year_age = age+1;
        
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Goal: "+goal);
        System.out.println("Next year, I will be "+next_year_age);

    }
}
