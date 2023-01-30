class Solution {
    public String alphabetBoardPath(String target) {
      if(target == null) return "";
        char[] ch = target.toCharArray();
        StringBuilder sb = new StringBuilder();
        int previ = 0, prevj = 0;
        for(int i = 0; i < ch.length; i++) {
            int curri = (ch[i] - 'a') / 5;
            int currj = (ch[i] - 'a') % 5;
            if(curri == previ && currj == prevj) {
                sb.append("!");
            } else {
                printPath(sb, previ, prevj, curri, currj); 
                sb.append("!");
                previ = curri; prevj = currj;
            }
        }
        
        return sb.toString();
    }
    
    private void printPath(StringBuilder sb, int previ, int prevj, int curi, int curj) {       
        while(curi < previ) {
            sb.append("U"); curi++;
        } 
        while(curj > prevj) {
            sb.append("R"); curj--;
        } 
        while(curj < prevj) {
            sb.append("L"); curj++;
        }  
        while(curi > previ) {
            sb.append("D"); curi--;
        }
    }
}
