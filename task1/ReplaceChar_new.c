#include <stdio.h>
#include <string.h>


void replace(char *s1, int l); // Function prototype for replace

int main() {
    char s1[1000]; // Declare a character array to store the input string
    int length; // Declare an integer to store the length of the string

    gets(s1); // Read the input string (Note: `gets` is unsafe and deprecated; consider using `fgets` instead)
    length = strlen(s1); // Calculate the length of the input string

    replace(s1, length); // Call the replace function to perform the replacement

    printf("\n%s", s1); // Print the modified string

    return 0; // Exit the program
}

// Function to replace occurrences of "cd" with "abc" in the string
void replace(char *s1, int l) {
    int i = 0, j;

    // Loop through the string up to the second-last character
    for (i = 0; i < l - 1; i++) {

        if (s1[i] == 'c' && s1[i + 1] == 'd') {  // Check if the current character and the next one form the substring "cd"

            s1[i] = 'a';  // Replace "cd" with "ab"
            s1[i + 1] = 'b';

            // Shift the remaining characters to the right to make room for 'c'
            for (j = l; j > i + 1; j--) {
                s1[j + 1] = s1[j]; // Shift characters to the right
            }


            s1[i + 2] = 'c';  // Insert 'c' after "ab"


            s1[l + 1] = '\0';  // Null-terminate the string


            l += 1;  // Update the length of the string since it increased by 1 character


            replace(s1, l);  // Recursively call replace to check for further occurrences of "cd"



            break;  // Since the string has been modified, break out of the current loop
        }
    }
}

