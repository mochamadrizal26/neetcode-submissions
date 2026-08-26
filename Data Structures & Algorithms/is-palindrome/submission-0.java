class Solution {
    public boolean isPalindrome(String s) {
        //lowering case
        s = s.toLowerCase();
        
        //only take alphanumeric
        List<Character> chars = new ArrayList<>();
        for(char c: s.toCharArray()) {
            if(Character.isLetterOrDigit(c)){
                chars.add(c);
            }
        }

        int pointerA = 0;
        int pointerB = chars.size()-1;

        while(pointerA <= pointerB) {
            if(!chars.get(pointerA).equals(chars.get(pointerB))) {
                return false;
            }

            pointerA++;
            pointerB--;
        }
        return true;
    }
}
