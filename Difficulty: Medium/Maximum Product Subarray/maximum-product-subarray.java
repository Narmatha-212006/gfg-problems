class Solution {
    int maxProduct(int[] arr) {
        // code here
       /* int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int prod=1;
            for(int j=i;j<arr.length;j++){
                prod=prod*arr[j];
                max=Math.max(max,prod);
            }
        }
        return max;*/
        if (arr == null || arr.length == 0) return 0;
        
        long min = arr[0]; 
        long max = arr[0];
        long result = arr[0]; 
        
        for (int i = 1; i < arr.length; i++) {
             if (arr[i] < 0) {
                long temp = max;
                max = min;
                min = temp;
            }
            
            max = Math.max((long) arr[i], max * arr[i]);
            min = Math.min((long) arr[i], min * arr[i]);
            result = Math.max(result, max);
        }
        return (int) result;
    
}

    
}

