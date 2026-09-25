Sum of Numbers in Array
📌 Description
This Java program calculates the sum of all numbers stored in an integer array.

The program uses a for loop to iterate through each element of the array and adds each number to a sum variable.

🛠️ Technologies Used
Java

Arrays

For Loop

System.out.println()

📂 Package
day7

📄 Class Name
SumOfNumbersInArray

🔍 How It Works
An integer array is created with the following values:

12, 2, 67, 3, 54, 42

A variable sum is initialized to 0.

A for loop iterates through the array.

Each array element is added to sum.

The final sum is displayed on the console.

💻 Code
package day7;

public class SumOfNumbersInArray {

    public static void main(String[] args) {
        // Program to get sum of numbers in array
        int numbers[] = {12, 2, 67, 3, 54, 42};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Sum of all numbers in an array is: " + sum);
    }
}

▶️ Output
Sum of all numbers in an array is: 180

📚 Concepts Practiced
Declaring and initializing arrays

Accessing array elements using indexes

Using numbers.length

Using a for loop

Performing addition

Printing output to the console
