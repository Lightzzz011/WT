#include<stdio.h>
#include<stdlib.h>
#include<pthread.h>
#define NUM_THREADS 3
double average =0;
int maximum=0;
int minimum=0;
void* calculate_average(void *arg)
{
printf("thread Average is Running");
int* numbers=(int*)arg;
double sum=0;
int i;
for(i=0;i<5;i++)
{
sum+=numbers[i];

}
average=sum/5;
pthread_exit(NULL);
}
void* find_maximum(void *arg)
{
printf("thread maximum is Running");
int* numbers=(int*)arg;
maximum=numbers[0];
int i;
for(i=0;i<5;i++)
{
if(numbers[i]>maximum)
{
maximum=numbers[i];
}
}
pthread_exit(NULL);
}
void* find_minimum(void *arg)
{
printf("thread maximum is Running");
int* numbers=(int*)arg;
minimum=numbers[0];
int i;
for(i=0;i<5;i++)
{
if(numbers[i]<minimum)

minimum=numbers[i];

}
pthread_exit(NULL);
}
int main(int argc,char *argv[])
{
int numbers[argc],i,j;
for(i=0;i<argc;i++)
{
numbers[i]=atoi(argv[i+1]);
}
pthread_t threads[NUM_THREADS];
pthread_create(&threads[0],NULL,calculate_average,(void*)numbers);

for(j=0;j<NUM_THREADS;j++)
{
pthread_join(threads[j],NULL);
}
printf("The average value is %.2f\n",average);
printf("The maximum value is %d",maximum);
printf("The minimum value is %d",minimum);
return 0;
}
