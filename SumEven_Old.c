#include <stdio.h>

int main() {
    int n, i, count=0, x, sum, esum=0;
    scanf ("%d",  &n);
    for (i=0; i<=n; i++){
       if (n!=0){
        x=n%10;
        printf("\nNumber %d",x);
        if(x%2==0){
            printf("\nEven Number %d", x);
            esum=esum+x;
        }
        n=n/10;
        count++;
        sum=sum+x;
       }
    }
    printf ("\nNumber of digits :- %d", count);
    printf ("\nThe summation %d", sum);
    printf ("\nSum of even number %d", esum);

    return 0;
}

