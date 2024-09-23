#include <stdio.h>

int main() {
    int n;  //n for the number of elements
    int i, j;// i and j for loop counters.


    scanf("%d", &n);  // Read the number of elements in the array

    int arr[n]; // Declare an array of size n

    // Loop to read n elements into the array
    for(i = 0; i < n; i++) {
        scanf("%d", &arr[i]); // Read each element and store it in the array
    }

    // Implementing a simple bubble sort algorithm to sort the array in ascending order
    for(i = 0; i < n - 1; i++) {
        for(j = i + 1; j < n; j++) {
            if(arr[i] > arr[j]) { // Compare adjacent elements
                int temp = arr[i]; // Swap elements if they are in the wrong order
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    // Loop to print the sorted array
    for(i = 0; i < n; i++) {
        printf("%d ", arr[i]); // Print each element of the sorted array
    }

    return 0; // Exit the program
}
