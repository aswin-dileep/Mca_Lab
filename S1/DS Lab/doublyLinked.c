#include<stdio.h>
#include<stdlib.h>

struct Node{
    int data;
    struct Node *pre;
    struct Node *next;
};
typedef struct Node node; 
node *head =NULL;

node *create(int data);
void insertB();
void insertE();
void insertPos();
void deleteB();
void deleteE();
void deletePos();
void search();
void show();


void main(){
    int choice;
    do{
        printf("\n********Menu********\n");
        printf("\n1)Insert Beginning\n2)Insert End\n3)Insert Position\n4)Delete Beginning\n5)Delete End\n6)Delete Position\n7)Display\n8)Search\n9)Exit\nEnter Your Choice :");
        scanf("%d",&choice);
        switch(choice){
            case 1:
            insertB();
            break;
            case 2:
            insertE();
            break;
            case 3:
            insertPos();
            break;
            case 4:
            deleteB();
            break;
            case 5:
            deleteE();
            break;
            case 6:
            deletePos();
            break;
            case 7:
            show();
            break;
            case 8 :
            search();
            break;
            case 9:
            exit(0);
            default:
            printf("\n Invalid position ");
        }
    }while(1);
}

//This function is used to create a node
node *create(int data){
    node *newNode = (node*)malloc(sizeof(node));
    newNode->pre =NULL;
    newNode->next=NULL;
    newNode->data=data;
    return newNode;
}
//This function is used to insert a node at the starting of the list
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
}
//This function is used to insert a node at the end of the list;
void insertE(){
    if(head==NULL){
        insertB();
    }else{
        int data;
        node *temp,*newNode;
        printf("\n Enter the data :");
        scanf("%d",&data);
        newNode = create(data);
        temp=head;
        while(temp->next!=NULL){
            temp=temp->next;
        }
        newNode->pre = temp;
        temp->next = newNode;
    }
}
//This function is used to insert a node at a given position 
void insertPos(){
    if(head==NULL)
        printf("\n Empty List");
    else{
        int data,pos,count=1;
        node *newNode,*nodeAtPos;
        printf("\n Enter the Number :");
        scanf("%d",&data);
        newNode=create(data);
        printf("\n Enter the position :");
        scanf("%d",&pos);
        nodeAtPos = head;
        while(count<pos-1){
            nodeAtPos=nodeAtPos->next;
            count++;
        }
        newNode->pre =nodeAtPos;
        newNode->next = nodeAtPos->next;
        nodeAtPos->next = newNode;
        
    }
}
//This function is used to delete a node at the beginning 
void deleteB(){
    if(head==NULL)
        printf("\n Empty list");
    else{
        node *firstNode;
        firstNode =head;
        head=head->next;
        head->pre =NULL;
        free(firstNode);
    }
}
//This function is used to delete a node at the end of the list 
void deleteE(){
    if(head==NULL){
        printf("\n Nothing to delete");
    }else {
       node *lastNode,*temp;
       lastNode=head;
       while(lastNode->next!=NULL){
            temp = lastNode;
            lastNode = lastNode->next;
       }
       temp->next =NULL;
       free(lastNode);

    }
}
//This function is used to delete a node at a given position 
void deletePos(){
    if(head==NULL){
        printf("\n Nothing to delete");
    }else{
        int pos,count=1;
        node *nodeAtPos,*temp;
        printf("\n Enter the position :");
        scanf("%d",&pos);
        temp=head;
        while(count<pos-1){
            if(temp->next==NULL){
                printf("\n Less than %d elements in the list ",pos);
                return;
            }
            temp=temp->next;
        }
        nodeAtPos = temp->next;
        temp->next = nodeAtPos->next;
        nodeAtPos->next->pre = temp;

    }
}
//This function is used to search a given number inside the list
void search(){
    if(head==NULL){
        printf("\n Empty list");
    }else{
        int count=1,no;
        node *temp;
        printf("\n Enter the number to be founded :");
        scanf("%d",&no);
        temp = head;
        while(temp->data!=no){
            if(temp->next==NULL){
                break;
            }
            count++;
            temp = temp->next;
        }

        if(temp->data==no){
            printf("\n Found at %d position ",count);
        }else{
            printf("\n not fount");
        }
        
    }
}
void show(){
    if(head==NULL)
        printf("\n Empty list");
    else{
        node *temp;
        temp=head;
        while(temp!=NULL){
            printf("%d ",temp->data);
            temp=temp->next;
        }
    }
}