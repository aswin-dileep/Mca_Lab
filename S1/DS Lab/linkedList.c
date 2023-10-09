#include<stdio.h>
#include<stdlib.h>

struct Node {
    int data;
    struct Node *next;
};
typedef struct Node node;
int noOfNode=0;
node *head=NULL;
node* create();
void insertB();
void insertE();
void insertP();
void display();
void search();
void deleteP();
void deleteE();
void deleteB();

void main(){
    int choice;
    while(1){
        printf("\n**************************************************************************************************************************************\n");
        printf("\nMenu\n");  
        printf("1)Insert Beginning\n2)Insert End\n3)Insert At Position\n4)Search \n5)Show List\n6)Delete By Position\n7)Delete First \n8)Delete End \n9) Exit \nEnter Your Choice :");
        
        scanf("%d",&choice);
        switch(choice){
            case 1:
            insertB();
            break;
            case 2:
            insertE();
            break;
            case 3:
            insertP();
            break;
            case 4:
            search();
            break;
            case 5:
            display();
            break;
            case 6:
            deleteP();
            break;
            case 7:
            deleteB();
            break;
            case 8:
            deleteE();
            break;
            case 9:
            exit(0);
            default:
            printf("\n Invalid Choice ");

        }

    }

}

//This funtion is used to Create a node
node* create(int data){
 node *newNode = (node *)malloc(sizeof(node));
 newNode->data =data;
 newNode->next =NULL;
 return newNode;
}
//This function is used to insert at the beginning of the list
void insertB(){
    int data;
    node *newNode;
    printf("\n Enter the number :");
    scanf("%d",&data);
    newNode = create(data);
    if(head==NULL){
        head = newNode;
    }else{
        newNode->next = head;
        head = newNode;
    }
    noOfNode++;
    
}
//This funtion is used to insert node at the end of the list 
void insertE(){
    if(head==NULL){
        insertB();
    }else{
        node *currentNode,*newNode;
        int data;
        printf("\n Enter the Number :");
        scanf("%d",&data);
        newNode = create(data);
        currentNode=head;
        while(currentNode->next!=NULL)
           currentNode = currentNode->next;
        currentNode->next = newNode;
    }
    noOfNode++;
}
//This funtion is used to display the list elements
void display(){
    if(head==NULL)
      printf("\n Empty list");
    else{
    node *currentNode;
    currentNode=head;
    while(currentNode!=NULL)
    {
        printf("%d ",currentNode->data);
        currentNode=currentNode->next;
    }
    }
}
//This funtion is used to insert a node at a given position 
void insertP(){
    if(head==NULL)
        printf("\n Empty List");
    else{
        int pos;
        printf("\n Enter the position you want to insert Node:");
        scanf("%d",&pos);
        if(pos<=noOfNode+1){
            int data,noOfNode,count=1;
            node *newNode,*temp,*nodeAtPos;
            printf("\n Enter the Number :");
            scanf("%d",&data);
            newNode = create(data);
            temp = head;
            while(count<pos-1){
                temp = temp->next;
                count++;
            }
            newNode->next =temp->next;
            temp->next = newNode;
        }else{
            printf("\n Invalid position");
        }
    } 
}
//This funtion is used to check a given number is present in the list
void search(){
    if(head==NULL){
        printf("\n Empty List");
    }else{
        int n,pos=1,flag=0;
        node *temp;
        printf("\n Enter the number to be Search :");
        scanf("%d",&n);
        temp=head;
        while(temp!=NULL){
            if(temp->data==n){
                printf("\n Found at %d position",pos);
                flag++;
               
                break;
            }
            temp=temp->next;
            pos++;
        }
        
         if(flag==0)
           printf("\n Number not found");
    }
}
//This function is used to delete a node at a given position 
void deleteP(){
    if(head==NULL)
        printf("\n Empty List");
    else{
        int pos,count=1;
        printf("\n Enter the position to Delete :");
        scanf("%d",&pos);
        if(pos>noOfNode){
            printf("\n Invalid Position ");
        }else{
            node *temp,*nodeAtPos;
            if(pos==1){

            }else{
                temp = head;
                while(count<pos-1){
                    temp = temp->next;
                    count++;
                }
                nodeAtPos=temp->next;
                temp->next = nodeAtPos->next;
                free(nodeAtPos);

            }
        }
    }
}
//This function is used to delete a node at the starting of the list
void deleteB(){
    if(head==NULL){
        printf("\n Empty List");
    }else{
        node *deleteNode;
        deleteNode = head;
        head = head->next;
    }
}
//This function is used to delete last node in the list
void deleteE(){
    if(head==NULL){
        printf("\n Empty List");
    }else{
        node *pre,*temp;
        temp=head;
        while(temp->next!=NULL){
            pre = temp;
            temp = temp->next;
        }

        pre->next =NULL;
        free(temp);

    }
}
