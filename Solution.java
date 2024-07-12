class Solution {
    public String digitSum(String s, int k) {
        if(s.length() <= k){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i<s.length()){
            int sum = 0;
            int j = i;
            for(j=i; j<i+k && j<s.length(); j++){
                int a = Integer.parseInt(s.charAt(j)+"");
                sum += a;
            }
            i = j;
            sb.append(sum);
        }

        return digitSum(sb.toString(),k);
    }
}
