class Solution {
    public String sortVowels(String s) {
        char arr[] = s.toCharArray();
        int vowel = 0;
        for(char ch : arr) if(isVowel(ch)) vowel++;
        int k =0;
        char vowels[] = new char[vowel];
        for(char ch : arr) if(isVowel(ch)) vowels[k++] = ch;
        Arrays.sort(vowels);
        k =0;
        for(int i=0;i<arr.length;i++) if(isVowel(arr[i])) arr[i] = vowels[k++];

        return String.valueOf(arr); 
    }
    boolean isVowel(char ch){
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
