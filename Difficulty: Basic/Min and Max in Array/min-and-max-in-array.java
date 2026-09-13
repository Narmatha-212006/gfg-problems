class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int max=arr[0];
        int min=arr[0];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<max){
                max=arr[i];
            }
            if(arr[i]>min){
                min=arr[i];

            }
        }
        list.add(max);
        list.add(min);
        return list;
    }
}
