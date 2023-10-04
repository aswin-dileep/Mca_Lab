#include<stdio.h>
#include<stdlib.h>

struct Node {
   int data;
   struct Node *next;
};

typedef struct Node node;
//head is the starting position of the list 
node *head =NULL;
//Function to create new Node 
node *createNode(int data){
   node *newNode =(node *)malloc(sizeof(node));
   newNode->data = data;
   newNode->next =NULL;
   return newNode;
}
//Function for insert node at the beginning of the list
void insertB(){
   node *newNode;
   int data;
   printf("\n Enter the number :");
   scanf("%d",&data);
   newNode = createNode(data);
   newNode->next = head;
   head = newNode;
}
//Funtion to insert node at the end of the list
void insertE(){
  int data;
  node *lastNode,*newNode;
  printf("\n Enter the Number :");
  scanf("%d",&data);
  newNode = createNode(data);
  lastNode = head;
  while(lastNode->next!=NULL){
   lastNode = lastNode->next;
  }
  lastNode->next = newNode;
}
//Funtion to insert a node at a given position
void insertPos(){
   int pos,count=1,data;
   node *nodeAtPos,*newNode;
   printf("\n Enter the Position :");
   scanf("%d",&pos);
   printf("\n Enter the number :");
   scanf("%d",&data);
   newNode = createNode(data);
   nodeAtPos = head;
   while(count<pos-1){
      nodeAtPos = nodeAtPos->next;
      count++;
   }
   newNode->next = nodeAtPos->next;
   nodeAtPos->next = newNode;
   printf("\n Successfully Added at the position ");
}
//This funtion is used to delete Node at a given position 
void deletePos(){
   int pos,count=1;
   node *deleteNode,*temp;
   printf("\n Enter the position :");
   scanf("%d",&pos);
   temp = head;
   while(count<pos-1){
      temp = temp->next;
      count++;
   }
   deleteNode = temp->next;
   temp->next= deleteNode->next;
   free(deleteNode);
}
//This funtion is used to display the list 
void display(){
   int i=1;
   node *currentNode;
   currentNode = head;
   while(currentNode!=NULL)
   {
      printf("Node %d->[%d] ",i,currentNode->data);
      currentNode = currentNode->next;
      i++;
   }
}


void main(){
   int ch;

   while(1){
      printf("\n********************************************************************************************************************");
    printf("\nMenu\n1)insert beginning\n2)insert End\n3)Insert Position\n4)Delete Position\n5)display\n6)exit\nEnter your choice :");
    scanf("%d",&ch);
    
    switch(ch){
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
      deletePos();
      break;
      case 5:
      display();
      break;
      case 6:
      exit(0);
      default:
      printf("\n Invalid choice");
    }

   }
}