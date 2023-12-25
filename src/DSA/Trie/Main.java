package DSA.Trie;

public class Main {
    public static void main(String[] args) {

        Trie trie = new Trie();

        // insert
//        trie.insertWord("arm");
//        trie.insertWord("do");
//        trie.insertWord("time");
//        trie.insertWord("timer");
//
//        // search
//        String word = "time";
//        boolean ans = trie.searchWord(word);
//        System.out.println(word+" is present? ");
//        System.out.println(ans);

//        String word1 = "timer";
//        boolean ans1 = trie.searchWord(word1);
//        System.out.println(word1+" is present? ");
//        System.out.println(ans1);


        // delete
//        String word2="time";
//        trie.deleteWord(word2);
//        boolean ans2 = trie.searchWord(word2);
//        System.out.println(word2+" is present? ");
//        System.out.println(ans2);



        // Longest Common Prefix
        int n= 5;
        String[] arr = {"coding", "codezen", "codingninja","coders","coprime"};
        System.out.println("Sting array elements is");
        for(String i: arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        String prefix = trie.longestCommonPrefix(arr,n);
        System.out.println("Longest Common Prefix in array is ");
        System.out.println(prefix);

    }
}
