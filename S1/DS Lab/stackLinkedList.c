#include<stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node *next;
};
typedef struct Node node;
node *head=NULL;
node *create(int data);
void push();
void pop();
void show();
void search();

void main(){
    int choice;
    while(1){
        printf("\nMenu\n");
        printf("\n1)push\n2)pop\n3)Search\n4)display\n5)Exit\nEnter your choice :");
        scanf("%d",&choice);
        switch(choice){
            case 1:
            push();
            break;
            case 2:
            pop();
            break;
            case 3:
            search();
            break;
            case 4:
            show();
            break;
            case 5:
            exit(0);
            default:
            printf("\n Invalid choice");
        }
    }
}

//this function is used to create Node
node *create(int data){
    node *newNode =(node *)malloc(sizeof(node));
    newNode->data = data;
    newNode->next=NULL;
    return newNode;
}
//this funtion is used to insert node to the stack
void push(){
    int data;
    node*newNode;
    printf("\n Enter the Number :");
    scanf("%d",&data);

    newNode = create(data);
    if(head==NULL){
        head =newNode;
    }else{
        node *temp;
        temp = head;
        while(temp->next!=NULL){
            temp = temp->next;
        }
        temp->next=newNode;
    }

}

//This funtion is used to delete node from the stack
void pop(){
    if(head==NULL){
        printf("\n Underflow");
    }else if(head->next==NULL){
         head=NULL;
    }else{
        node *pre,*temp;
        temp= head;
        while(temp->next!=NULL){
            pre = temp;
            temp=temp->next;
        }
        printf("\n Deleted Element is %d",temp->data);
        pre->next = NULL;
        free(temp);
    }
}
//This function is used to display the stack elements
void show(){
    if(head==NULL){
        printf("\n Underflow");
    }else{
        node *temp;
        temp=head;
        while(temp!=NULL){
            printf("%d ",temp->data);
            temp=temp->next;
        }
    }
}

void search(){
    if(head==NULL){
        printf("\n Underflow");
    }else{
        int no,count=1,flag=0;
        //temp is a temporary verible to traverse through the Nodes
        node *temp;
        printf("\nEnter the number to Search :");
        scanf("%d",&no);
        temp = head;
        while(temp!=NULL){
            if(no==temp->data){
                printf("\n found at %dth position",count);
                flag=1;
                break;
            }else{
                temp=temp->next;
                count++;
            }
        }
        if(flag==0)
           printf("\n Not founded");
    }

}