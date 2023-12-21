## Average of Small Numbers Assignment 

### Program Description 

This Java program prompts the user to enter a sequence of integers. It performs the following operations:

* If the user enters the number 0, the program stops taking input and subtracts the occurrences of the number 0 from the sequence.
* If the entered numbers are less than or equal to 10, the program calculates and displays their average.
* If all entered numbers are greater than 10, the program does not calculate the average.

### Usage
    1. Run the program.
    2. Enter integers when prompted. To stop input, enter 0.
    3. View the input sequence and, if applicable, the average of numbers less than or equal to 10.

### Code Structure

#### Main Method
The main method initializes variables, creates a Scanner, and accepts user input until 0 is entered. It then displays the input sequence and calls the computeAverage method.

#### computeAverage Method
This method calculates the average of numbers less than or equal to 10. It uses an array to store qualifying numbers, and if no such numbers are found, it informs the user. The average is calculated if at least one qualifying number is present.

### Example Screen Shot

![](/screenshots/ssFirstSol.png)
![](/screenshots/ssSecondSol.png)

### Note
* The program assumes a maximum of 100 input integers but can handle any number of inputs.
* Zero is treated as a special number, and its occurrences are subtracted from the sequence.
* The program provides informative messages if no numbers are less than or equal to 10.

Feel free to use, modify, and contribute to this code!