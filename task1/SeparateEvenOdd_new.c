#include <stdio.h>

int main() {
    int arr[50];  //arr for input
    int arr2[50]; //arr2 for even numbers
    int arr3[50]; // arr3 for odd numbers
    int i = 0;   // i for loop counter
    int j = 0;   //j for counting even numbers
    int k = 0; // k for counting odd numbers

    // Loop to read 10 integers into the array arr
    for(i = 0; i < 10; i++) {
        scanf("%d", &arr[i]); // Read each integer and store it in arr
    }

    // Loop to separate even and odd numbers into arr2 and arr3
    for(i = 0; i < 10; i++) {
        if(arr[i] % 2 == 0) { // Check if the number is even
            arr2[j] = arr[i]; // Store the even number in arr2
            j++; // Increment the even number counter
        } else { // If the number is odd
            arr3[k] = arr[i]; // Store the odd number in arr3
            k++; // Increment the odd number counter
        }
    }

    // Loop to print all the even numbers stored in arr2
    for(i = 0; i < j; i++) {
        printf(" %d ", arr2[i]); // Print each even number
    }
    printf("\n"); // Print a new line to separate even and odd numbers output

    // Loop to print all the odd numbers stored in arr3
    for(i = 0; i < k; i++) {
        printf(" %d ", arr3[i]); // Print each odd number
    }

    return 0; // Exit the program
}

