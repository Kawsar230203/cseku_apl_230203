#include <stdio.h>

int main() {
    int n; // n to store the input number
    int i; // i for the loop
    int flag = 0; //  flag to indicate if n is prime or not.


    printf("Enter a positive integer: ");  // Prompt the user to enter a positive integer
    scanf("%d", &n);  // Read the input value and store it in n


    if (n <= 1) // Check if the number is less than or equal to 1, which are not considered prime numbers
    {
        printf("%d is not a prime number.\n", n);
        return 0; // Exit the program if n is not a prime number
    }

    // Loop from 2 to n/2 to check for divisors
    // No need to check beyond n/2 because a larger factor would have to multiply by a smaller factor already checked
    for (i = 2; i <= n / 2; ++i) {
        if (n % i == 0) { // If n is divisible by any i, it's not a prime number
            flag = 1; // Set flag to 1 indicating n is not prime
            break; // Exit the loop since we found a divisor
        }
    }

    // Check the flag to determine if n is prime or not
    if (flag == 0)
        printf("%d is a prime number.\n", n); // If flag is still 0, n is prime
    else
        printf("%d is not a prime number.\n", n); // If flag is 1, n is not prime

    return 0; // Exit the program
}

