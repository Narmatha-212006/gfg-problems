class Solution {
  public:
    bool isPalindrome(vector<int> &arr) {
        // code here
        vector<int> copy = arr;
        reverse(arr.begin(),arr.end());
        for(int i=0;i<arr.size();i++){
           if(copy[i]!=arr[i]){
               return false;
           } 
        }
        return true;
    }
};
