


public class Practice {


    public static void main(String[]args){

        int num = 11;
        int[]arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};

        int start=0;
        int end = arr.length-1;
        boolean status=false;

        while (start<end){
            int mid = start + (end-start)/2;

            if(mid==num){
               System.out.println("Array has the number" + mid);
               status=true;
            }
            if(num<mid){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }

       System.out.println("Status is : " + status);

    }

}
