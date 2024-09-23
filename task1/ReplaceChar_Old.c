// Online C compiler to run C program online
#include <stdio.h>
#include <string.h>

void replace(char *s1, int l);

int main()
{
    // Write C code here
    char s1[1000], s2[1000];
    int i, l,j, k=0, n;

    gets(s1);
    l=strlen(s1);
    replace(s1,l);

    printf("\n%s", s1);

    return 0;
}
void replace(char *s1,  int l)
{
    int i=0,j;
    for(i=0; i<l-1;  i++)
    {
        if(s1[i]=='c' && s1[i+1]=='d')
        {
            s1[i]='a';
            s1[i+1]='b';



            for(j=l;j>l-i-2; j--)
            {
               s1[j]=s1[j-1] ;
            }
            s1[i+2]='c';
            s1[l+1]='\0';
            replace(s1,l+1);
        }

    }
}
