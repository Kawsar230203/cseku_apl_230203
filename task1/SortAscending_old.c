#include <stdio.h>

int main() {
    // Write C code here
    //printf("Hello world");
    int n, i, j;
    scanf("%d", &n);
    int arr[n];
    for(i=0; i<n; i++)
    {
        scanf("%d",&arr[i]);
    }

    for(i=0; i<n-1; i++)
    {

        for(j=i+1; j<n; j++)
        {
            if(arr[i]>arr[j])
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    for(i=0; i<n; i++)
    {
    printf("%d ",arr[i]);
    }
    return 0;
}

