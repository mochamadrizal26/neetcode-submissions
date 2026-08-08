class Solution {
    public int calPoints(String[] operations) {
        
        ArrayList<Integer> scores = new ArrayList<Integer>();
        for(int i=0; i<operations.length; i++){
            if (operations[i].equals("+")) {
                int last = scores.get(scores.size()-1);
                int secondLast = scores.get(scores.size()-2);
                scores.add(last + secondLast);
            }
            else if (operations[i].equals("D")) {
                scores.add(2 * scores.get(scores.size()-1));
            }
            else if  (operations[i].equals("C")) {
                scores.remove(scores.size()-1);
            }
            else {
                scores.add(Integer.valueOf(operations[i]));
            }
        }

        int sum = 0;
        for(Integer score: scores) {
            sum = sum + score;
        }

        return sum;
    }
}