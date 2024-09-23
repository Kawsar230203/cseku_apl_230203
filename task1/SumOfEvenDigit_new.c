#include <stdio.h>

int main() {
    int n;  //n for the input number
    int i;  // i for the loop
    int count = 0;  // count for the number of digits
    int x;  // x for the current digit
    int sum = 0;  // sum for the sum  of all digits
    int esum = 0; // esum for the sum of even digits.


    scanf("%d", &n); // Read the input number from the user

    // Loop to process each digit of the number
    for (i = 0; n != 0; i++) {   // Continue the loop as long as n is not 0
        x = n % 10;      // Get the last digit of n
        printf("\nNumber %d", x);    // Print the current digit

        if (x % 2 == 0) {   // Check if the digit is even
            printf("\nEven Number %d", x);   // Print the even digit
            esum = esum + x;   // Add the even digit to the sum of even digits
        }

        n = n / 10; // Remove the last digit from n
        count++; // Increment the digit count
        sum = sum + x; // Add the digit to the total sum
    }


    printf("\nNumber of digits :- %d", count);  // Print the total number of digits


    printf("\nThe summation %d", sum);  // Print the sum of all digits


    printf("\nSum of even number %d", esum);  //print the sum of even digits

    return 0; // Exit the program
}

