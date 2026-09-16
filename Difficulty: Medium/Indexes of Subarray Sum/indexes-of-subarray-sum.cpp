class Solution {
  public:
    vector<int> subarraySum(vector<int> &arr, int target) {
        // code here
        int sum=0;
        int start=0;
        int end=arr.size()-1;
        for(int i=0;i<arr.size();i++){
            sum+=arr[i];
            while(sum>target&&start<=i){
                sum-=arr[start];
                start++;
            }
            if(sum==target){
                return{start+1,i+1};
            }
            
        }
        return{-1};
    }
};