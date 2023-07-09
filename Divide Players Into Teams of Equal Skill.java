class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long temp = skill[0]+skill[skill.length-1];
        long sum = 0;
        int start=0,end=skill.length-1;
        while(start<end){
            if(skill[start]+skill[end] != temp) return -1;
            sum +=skill[start]*skill[end];
            start++;end--;
        }
        return sum;
    }
}
