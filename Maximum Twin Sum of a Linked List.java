class Solution {
     public int getMid(ListNode head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
	
    public int pairSum(ListNode head) {
        ArrayList<Integer>l=new ArrayList<>();
        int mid=getMid(head)/2;
        int i=0; 
        while(i<mid){
            l.add(head.val);
            head=head.next;
            i++;
        }
        i=i-1;
		
        while(head!=null){
            int sum=0;
            sum=l.get(i)+head.val;
            l.set(i,sum);
            i--;
            head=head.next;
        }
        return Collections.max(l);
    } 
}
