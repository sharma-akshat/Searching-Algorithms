import java.util.*;
public class linearSearch
{
public static int search(int[] x,int s)
{
int l=x.length;
for(int i=0;i<l;i++)
{
if(x[i]==s) return i;
}
return -1;
}

public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the size of array:");
int size=sc.nextInt();
int array[]=new int[size];
for(int i=0;i<size;i++)
{
System.out.print("Enter element:");
array[i]=sc.nextInt();
}
System.out.print("Enter the number to be searched:");
int num=sc.nextInt();
int result=search(array,num);
if(result==-1) System.out.println("Element not found");
else System.out.println("Element found at index "+result);
}

}

