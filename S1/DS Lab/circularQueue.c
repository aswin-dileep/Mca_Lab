#include<stdio.h>
#include<stdlib.h>
#define SIZE 5
int arr[SIZE];
int f=-1,r=-1;

void enQueue();
void deQueue();
void display();

void main(){
	int choice;

	while(1){
		printf("\nMenu\n1)Insert\n2)Delete\n3)Display\n4)Exit\nEnter your choice :");
		scanf("%d",&choice);
		switch(choice){
			case 1:
			enQueue();
			break;
			case 2:
			deQueue();
			break;
			case 3:
			display();
			break;
			case 4:
			exit(0);
			default:
			printf("\n Invalid choice ");
		}
	}
}

//This function is used to insert number into the queue

void enQueue(){
	if((r+1)%SIZE==f){
		printf("\n overflow ");
	}
	else{
		
		int n;
		printf("\n enter the Number :");
		scanf("%d",&n);
		if(f==-1&&r==-1){
			f=0;
			r=0;
		}else{
                	r=(r+1)%SIZE;
                }
		arr[r] =n;
	}
}

void deQueue(){
	if(f==-1){
		printf("\n Empty Queue ");
	}else{
		printf("\n The Deleted Number is %d",arr[f]);
		if(f==r){
			
			f=-1;
			r=-1;
		}else{
			f= (f+1)%SIZE;
		}
	}
}

void display(){
	if(f==-1){
		printf("\n Empty Queue ");
	}else{
	
		printf("\n Front -> %d ", f);
    		printf("\n Items -> ");
    		int i =f;
    		for(i=f;i!=r;i=(i+1)%SIZE){  
            		printf("%d ", arr[i]);  
            		  
        	}  
    			printf("%d ",arr[i]);
    		printf("\n Rear -> %d \n", r);
}	

}
