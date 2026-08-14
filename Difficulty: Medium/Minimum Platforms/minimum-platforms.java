
class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
       Arrays.sort(arr);
       Arrays.sort(dep);
       int max=0;
       int min=0;
       int i=0;
       int j=0;
       int n=arr.length;
     while(i<n &&j<n){
           if(arr[i]<=dep[j]){
               max++;
               i++;
           }
           else{
               max--;
               j++;
           }
           min=Math.max(max,min);
       }
       return min;
    }
}