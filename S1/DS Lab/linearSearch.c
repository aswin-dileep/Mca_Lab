#include<stdio.h>


void main(){
    int flag=0,n,a[10],size;
    printf("\n Enter the Size of the array :");
    scanf("%d",&size);

    printf("\n Enter the %d elements :",size);
    for(int i =0;i<size;i++)
        scanf("%d",&a[i]);
    
    printf("\n Enter the number to find :");
    scanf("%d",&n);

    for(int i=0;i<size;i++){
        if(a[i]==n){
            flag =1;
            printf("\n Found on %d position ",i+1);
            break;
        }
    }

    if(flag==0)
        printf("\n Not found"); 
}