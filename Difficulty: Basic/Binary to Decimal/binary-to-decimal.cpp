class Solution {
  public:
    int binaryToDecimal(string& n) {
        // code here
       return stoi(n, nullptr, 2);
    }
};