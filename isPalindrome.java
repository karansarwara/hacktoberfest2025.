class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int remainder;
        int original_num = x;
        if(x<0){
            return false;
        }
        while(x!=0){
            remainder = x%10;
            reverse = reverse * 10 + remainder;
            x/=10;
        }
        return original_num == reverse;
    }
}
