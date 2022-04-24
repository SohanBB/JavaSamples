package DSA.Bsearch;
class Bsearch {
    public static void main(String[] args) {
        int []data = {1,2,3,7,8,9,10,12};
        int x = 9;
        int result = Bsearch.find(data,x,0,data.length-1);
        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: "+result);



    }
    static int find (int [] data,int x,int low, int high){
        while (low<=high){
            int mid = low+(high-low)/2;
            if(data[mid]==x)
                return mid;
            else if(x<data[mid])
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }

}