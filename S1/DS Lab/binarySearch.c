#include<stdio.h>




void main(){
	int arr[10],size,n,flag=0,temp,h,l,mid;
	
	printf("\n Enter the size of the array ");
	scanf("%d",&size);
	
	printf("\n Enter the %d array Elements ",size);
	for(int i=0;i<size;i++){
		scanf("%d",&arr[i]);
	}
	
	//sorting the array
	for(int i=0;i<size;i++){
		for(int j=0;j<size-i-1;j++){
			if(arr[j]>arr[j+1]){
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	
	printf("\n Enter the number to be founded :");
	scanf("%d",&n);
	
	printf("\n The sorted array is \n");
	for(int i=0;i<size;i++){
		printf("%d ",arr[i]);
	}
	
	h = size -1;
	l =0;
	// code for Binary Search
	while(l<=h){
	
		mid =(l+h)/2;
		if(arr[mid]==n){
			printf("\n The number is founded at %d position ",mid+1);
			flag=1;
			break;
		}else if(n<arr[mid]){
			h = mid-1;
		}else{
			l =mid +1;
		}
	}
	
	if(flag==0){
		printf("\n The number not int the array ");
	}
}


