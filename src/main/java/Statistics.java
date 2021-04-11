import java.util.Arrays;

public class Statistics {

    public static int findFrequency(int[] arr, int n){
        int frequency = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == n){
                frequency++;
            }
        }
        return frequency;

    }

    public static double findRelativeFrequency(int[] arr, int n){
        if(arr.length != 0 ){
            return (double) findFrequency(arr,n)/arr.length;
        }
        else
            return Integer.MIN_VALUE;

    }

    public static double findMedian(int[] arr){
        Arrays.sort(arr);
        if(arr.length%2==0){
            return (double) (arr[arr.length/2]+arr[arr.length/2-1])/2;
        }
        return   arr[arr.length/2];
    }
    public static double findMean(int[] arr){
        if(arr.length!= 0){
            int arrSum = 0;
            for (int i = 0; i < arr.length; i++) {
                arrSum += arr[i];
            }
            return (double) arrSum/arr.length;
        }
        return Integer.MIN_VALUE;
    }

    public static double findTrimmedMean(int[] arr, double trim){
        int p = (int) (arr.length*trim);
        if((double)p/arr.length > 0 && (double)p/arr.length<0.5){
            int trimArr[] = new int[arr.length - 2*p];
            Arrays.sort(arr);
            trimArr = Arrays.copyOfRange(arr,p,arr.length -p);
            return findMean(trimArr);
        }
        return Integer.MIN_VALUE;
    }

    public static double findWinsoizedMean(int[] arr, double trim){
        int p = (int) (arr.length*trim);
        if((double)p/arr.length > 0 && (double)p/arr.length<0.5){
            int winsorizedArr[] = new int[arr.length ];
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                if(i < p){
                    winsorizedArr[i] = arr[p];
                }
                else if(i >arr.length-p-1){
                    winsorizedArr[i] = arr[arr.length-p-1];
                }
                else
                    winsorizedArr[i]=arr[i];
            }
            return findMean(winsorizedArr);
        }

        return Integer.MIN_VALUE;

    }

}
