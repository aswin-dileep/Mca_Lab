#include<stdio.h>
#include<stdlib.h>

struct Node{
    int data;
    struct Node *pre;
    struct Node *next;
};
typedef Node node
node *head =NULL;

node *create();
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
        printf("\n1)Insert Beginning\n2)Insert End\n3)Insert Position\n4)Delete Beginning\n5)Delete End\n6)Delete Position\n7)Display\n8)Search9)Exit\nEnter Your Choice :");
    }while(1);
}