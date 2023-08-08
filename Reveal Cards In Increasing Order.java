class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Deque<Integer> dq = new LinkedList<>();
        for(int i=0;i<deck.length;i++) dq.add(i);
        int ans[] = new int[deck.length];
        for(int i=0;i<deck.length;i++){
            ans[dq.pollFirst()] = deck[i];
            dq.add(dq.pollFirst());
        }
        return ans;
    }
}
