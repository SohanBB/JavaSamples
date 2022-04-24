package DSA.BinarySearch;

public class BinarySearch {
    int search(int [] data,int x,int left,int right){
        while(left<=right){
            int mid= left+(right-left)/2;
            if(data[mid]==x)
                return mid;
            if(data[mid]<x)
                left=mid+1;
            else
                right=mid-1;
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] data = {2, 4, 6, 8, 10, 12, 14};
        int x = 12;
        int size = data.length;
        BinarySearch obj = new BinarySearch();
        int result = obj.search(data,x,0,size-1);
        if(result== -1){
            System.out.println("Result not found");
        }
        else System.out.println("Element found at index : " +result );


    }
















}
