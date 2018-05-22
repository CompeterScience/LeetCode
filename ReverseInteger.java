class Solution {
    public int reverse(int x) {
        String str = String.valueOf(x);
        String rts = "";
        String sgn = "";
        
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(c == '-') {
                sgn = "-";
            } else {
                rts = String.valueOf(c) + rts;
            }
        }
        rts = sgn + rts;
        
        try {
            return Integer.valueOf(rts);
        } catch (Exception e) {
            return 0;
        }
    }
}
