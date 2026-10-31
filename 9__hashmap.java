/*
Create a HashMap<String, Integer> representing employee names and salaries.
1. Add five employees and their salaries.
2. Retrieve and print one employee's salary.
3. Update one employee's salary.
4. Remove one employee.
5. Check whether a particular employee exists.
6. Iterate over the map and print all employees and salaries.
7. Calculate the total salary.
*/

import java.util.HashMap;

class hashMap{
    public static void main(String args[]){
        HashMap<String, Integer> user = new HashMap<>();
        
        // add five employees and their salaries
        user.put("kumar", 1000);
        user.put("kishore", 500);
        user.put("manish", 50000);
        user.put("ketaki", 20000);
        user.put("kalyan", 40000);
        
        // retrieve and print one employee's salary
        System.out.println("Salary for kumar is: "+user.get("kumar")); 

        // update one employee's salary
        user.put("kumar", 2000);
        System.out.println("Revised salary for kumar is: "+user.get("kumar"));

        // remove one employee
        user.remove("kishore");
        System.out.println("Updated Hashmap");
        System.out.println("--------------------------------");

        // Iterate over the map and print all employees and salaries
        for (HashMap.Entry<String, Integer> entry : user.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // check whether a employee exists
        boolean user_exists = false;
        String user_to_be_searched = "kalyan";

        if (user.containsKey(user_to_be_searched)) {
            System.out.println(user_to_be_searched + " found in database!");
        } else {
            System.out.println(user_to_be_searched + " not found in database!");
        }

        // calculate the total salary
        int total_salary = 0;
        for (HashMap.Entry<String, Integer> entry:user.entrySet()){
            total_salary = total_salary + entry.getValue();
        }
        System.out.printf("\nTotal salary is: %d",total_salary);
        System.out.println("");
    }
}
