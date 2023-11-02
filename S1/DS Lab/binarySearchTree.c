#include<stdio.h>
#include<stdlib.h>

struct Node{
    int data;
    struct Node *left,*right;
};
typedef struct Node node;

node *Create(int data){
    node newNode = (node*)malloc(sizeof(node));
    newNode->data =data;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

node *insert(node *newNode,int data){
    if(newNode==NULL){
        return Create(data);
    }else if(data >newNode->data){
        return Create(newNode->right,data);
    }else if(data<newNode->data){
        return Create(newNode->left,data);
    }
    return newNode;
}


node *search(node *root,int data){
    if(root==NULL||root->data ==data){
        return root;
    }
    if(data>root->data){
        return search(root->right,data);
    }
    if(data<root->data){
        return search(root->left,data);
    }
}


int main(){
    node *root=NULL;
    root =insert(root,50);
    insert(root, 30);
    insert(root, 20);
    insert(root, 40);
    insert(root, 70);
    insert(root, 60);
    insert(root, 80);

    int data =40;

    if(search(root,data)==NULL){
        printf("%d not founded",data);
    }else{
        printf("%d  founded",data);
    }
    data =3;

     if(search(root,data)==NULL){
        printf("%d not founded",data);
    }else{
        printf("%d  founded",data);
    }
}