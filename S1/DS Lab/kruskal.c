#include<stdio.h>
#include<stdlib.h>
#define MAX 10
int parent[MAX];
int v,i,j,cost[MAX][MAX],edgecount,count=1,mincost,c,row,col,v1,v2;
int find(int i)
{ 
	return parent[i]; 
} 
						  
int unionk(int i,int j)
{
	if(i!=j)
	{  
		parent[j]=i; 
		return 1; 
	} 
	return 0; 
} 
	 
	 
int main(){  
	printf("Total number of vertices(v) :: ");
	scanf("%d",&v);
	for(i=1;i<=v;i++)
		 parent[i]=i;
	//Get edge weight matrix from user	
	for(i=1;i<=v;i++)
	{
		for(j=i+1;j<=v;j++)
		{
			if(i!=j)
			{
				printf("enter cost[%d][%d]||cost[%d][%d]:",i,j,j,i);
				scanf("%d",&cost[i][j]);
				cost[j][i]=cost[i][j];
				if(cost[i][j]==0)
					{
					   cost[i][j]=999;
					   cost[j][i]=999;
					}
			}
		}
	}
	
	edgecount = v-1;
	
	while(count <= edgecount)
	{
	c=999;
		for(i=1;i<=v;i++)
		{
			for(j=i+1;j<=v;j++)
			{
				if(cost[i][j] < c)
				{
						c = cost[i][j];
						v1 = row =  i;
						v2 = col=  j;
				}
			}
		}   
		row  = find(row);  
		col = find(col);  
		if(unionk(row,col))
		{  
			printf("\nEdge %d : (%d -> %d) , cost : %d ",count++,v1,v2,c);
			mincost = mincost + c;
		}
		cost[v1][v2] = cost[v2][v1] = 999;
	}    
	printf("\n Minimum cost=%d",mincost);  
	return 0;
} 