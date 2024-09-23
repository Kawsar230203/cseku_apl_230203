#include<stdio.h>
int main()
{
    int arr[50], arr2[50], arr3[50], i=0, j=0, k=0;
    for(i=0;i<10;i++)
    {
        scanf("%d", &arr[i]);
    }
    for(i=0;i<10;i++)
    {
        if(arr[i]%2==0)
            {
                arr2[j]=arr[i]; j++;
            }
        else{
            arr3[k]=arr[i]; k++;
        }
    }
    for(i=0;i<j;i++)
    {
        printf(" %d ", arr2[i] );
    }
    printf("\n");
    for(i=0;i<k;i++)
    {
        printf(" %d ", arr3[i]);
    }












    return 0;
}
