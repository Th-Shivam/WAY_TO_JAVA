class ReverseINT {
    public int reverse(int x) {
        int result = 0;
        
        while (x != 0) {
            // Get the last digit
            int digit = x % 10;
            // Remove the last digit from x
            x /= 10;
            
            // Check for overflow before multiplying result by 10 and adding digit
            if (result > Integer.MAX_VALUE / 10 || 
                (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || 
                (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            
            // Build the reversed number
            result = result * 10 + digit;
        }
        
        return result;
    }
}
