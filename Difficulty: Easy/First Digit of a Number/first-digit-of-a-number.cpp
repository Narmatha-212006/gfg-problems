int firstDigit(int n) {
    // code here
   
    while(n>9){
        n=n/10;
    }
    return n;
}