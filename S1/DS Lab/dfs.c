#include<stdio.h>
#include<stdlib.h>
#define MAX 10
int edge[MAX][MAX],visited[MAX],n;

void dfs(int i){
    visited[i] =1;
    printf("%d ",i);

    for(int j=1;j<=n;j++){
        if(edge[i][j]==1 && visited[j]==0){
            dfs(j);
        }
    }
}

void main(){
    printf("\n Enter the number of vertex :");
    scanf("%d",&n);

    printf("\n Enter 1 if edge is present else 0 \n");

    for(int i=1;i<=n;i++){
        for(int j=i+1;j<=n;j++){
            printf("\n Edge [%d][%d] ||[%d][%d] :",i,j,j,i);
            scanf("%d",&edge[i][j]);
            edge[j][i]=edge[i][j];
        }
    }

    dfs(1);
}