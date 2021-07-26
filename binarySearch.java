/*
Binary search is a searching technique that is based upon the Divide-and-Conquer Rule.
In this searching technique, a sorted array is divided into two equal halves and 
then the same technique is applied onto the two halves searching for the element by comparing the high and the low.
*/
import java.util.*;
class BinarySearch
{
    public int search(int x[],int num)
    {
        int si=0;
        int ei=x.length-1;
        while(si<=ei)
        {
            int mid=si+(ei-si)/2;
            if(x[mid]==num) return mid;
            else if(x[mid]<num) si=mid+1;
            else ei=mid-1;
        }
        return -1;
    }

    public static void main(String gg[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter the element : ");
            array[i]=sc.nextInt();
        }
        System.out.print("Enter the element to be searched : ");
        int d=sc.nextInt();
        BinarySearch bs=new BinarySearch();
        int index=bs.search(array,d);
        if(index==-1)System.out.println("Element not found");
        else System.out.println("Element found at index : "+index);
        sc.close();
    }
}

//Time Complexities Best=O(1) Average/Worst=O(log n)
//Space complexity O(1)