package DSA.Search;

public class Search {
    public int find(int array[],int x,int low,int high){
        while (low<=high){
            int mid = low+(high-low)/2;
            if(array[mid]==x)
                return mid;
            if(x<array[mid])
                high=mid-1;
            else
                low=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] array={3,6,9,12,15,18};
        int x= 15;
        int n = array.length;
        Search obj = new Search();
        int result= obj.find(array,x,0,n);
        if (result==-1){
            System.out.println("Element is not found");
        }
        else
        System.out.println("Element found at index:  "+result);
    }
}
