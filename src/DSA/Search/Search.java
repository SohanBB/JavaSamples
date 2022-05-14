package DSA.Search;

public class Search {
    static int find(int []data,int x, int low, int high){
        while(low<=high){
            int mid = low+(high-low)/2;
            if (x==data[mid])
                return mid;
            else if(x<data[mid])
                high = mid-1;
            else
                low= mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int []data = {1,2,3,4,5,6,7,8};
        int x= 5;
        int result= Search.find(data,x,0,data.length-1);
        if(result == -1){
            System.out.println("Not found");
        }
        else
            System.out.println(result);
    }
}
