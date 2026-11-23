class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        return helper(nums,target,low,high);
    }
    public int helper(int[] arr,int target,int low,int high){
        if(low>high) return -1;
        int mid = (low+high)/2;
        if(arr[mid]==target) return mid;
        else if(arr[mid]>target) return helper(arr,target,low,mid-1);
        return helper(arr,target,mid+1,high);
    }
}