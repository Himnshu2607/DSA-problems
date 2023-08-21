public class Solution {
	public static int findCelebrity(int n) {
       int celebrity =0;
	   for(int i=1;i<n;i++) if(Runner.knows(celebrity,i)) celebrity = i;
	   
	for(int i=0;i<n;i++){
		if(celebrity == i) continue;
		if(Runner.knows(celebrity,i) || !Runner.knows(i,celebrity)) return -1;
		// If it knows someone, or someone doesn't know it, it's not a celebrity
	}
	return celebrity;
 }
}
