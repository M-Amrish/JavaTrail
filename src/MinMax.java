public class MinMax {
    public static void main(String []args){
        int arr[]=new int[]{9,8,12,2,99,1,5};
        int min = arr[0];
        int max = arr[0];
        for(int i =0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }

        }
        System.out.println("minimum is"+min);
        for(int i =0;i< arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("maximum is "+max);
    }
}
