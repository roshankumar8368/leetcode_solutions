class Solution {
    public int findDuplicate(int[] nums) {
       int slow=0;
       int fast=0; 
       while(true){
        slow=nums[slow]; // move step one
       fast = nums[nums[fast]]; // move step 2
       
       if(slow==fast){ //cycle detected
         slow=0;
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow; //duplicate found
       } 
       }
       
    }
}