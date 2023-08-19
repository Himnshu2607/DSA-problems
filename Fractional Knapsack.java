/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/
class comp implements Comparator<Item>{
    public int compare(Item a,Item b){
        double p1 = (double) (a.value) / (double)(a.weight);
        double p2 = (double) (b.value) / (double)(b.weight);
        if(p1 < p2) return 1;
        else if(p1 > p2) return -1;
        return 0;
    }
}
class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        Arrays.sort(arr, new comp());
        int currWeight =0;
        double total =0;
        for(int i=0;i<n;i++){
            if(currWeight+arr[i].weight <= W){
                total += arr[i].value;
                currWeight += arr[i].weight;
            }
            else{
                int remain = W - currWeight;
                total += (double) remain * ((double) arr[i].value / (double)arr[i].weight);
                break;
            }
        }
        return total;
    }
}
