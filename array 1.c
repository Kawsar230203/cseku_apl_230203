#include<stdio.h>
int main()
{
    int arr[50],i,sum1,sum2;
    for(i=0;i<10;i++)
    {
        scanf("%d",&arr[i]);
    }
    int highest = arr[0];
    for(i=0;i<10;i++)
    {
        if(arr[i]>highest)
        {
            highest = arr[i];
        }
    }
    for(i=0;i<10;i++)
    {
        printf(" %d ", arr[i]+2);
    }
    printf("\n%d",highest);

    return 0;
}
