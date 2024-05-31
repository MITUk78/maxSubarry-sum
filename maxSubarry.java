// import java.util.*;

// public class maxSubarry {
//     public static void maxSubarrysum(int num[]){
//         int currSum= 0;
//         int maxSum= Integer.MAX_VALUE;

//         for(int i=0;i<num.length;i++){
//             int start=i;
//             for(int j=1; j<num.length; j++){
//                 int end=j;
//                 currSum=0;
//                 for(int k= start; k<=end; k++){
//                     //subbarySum
//                     currSum += num[k];
//                 }
//                 System.out.println(currSum);
//                 if(maxSum < currSum){
//                     maxSum = currSum;
//                 }
                
//             }
//         }
//         System.out.println("max sum = "+ maxSum);
//     }
//     public static void main(String args[]){
//         int num[]={1,-2,6,+1,3};

//         maxSubarrysum(num);
//     }
// }

import java.util.*;

public class maxSubarry {
    public static void maxSubarrysum(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE; // Initialize maxSum to smallest possible value

        for(int i = 0; i < num.length; i++) {
            currSum = 0; // Reset currSum for each new starting point
            for(int j = i; j < num.length; j++) { // Start from i instead of 1
                currSum += num[j]; // Add the current element to currSum
                // Compare currSum with maxSum and update maxSum if necessary
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }

    public static void main(String args[]){
        int num[] = {2,4,6,8,10};
        maxSubarrysum(num);
    }
}
