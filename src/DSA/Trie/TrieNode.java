package DSA.Trie;

public class TrieNode {

    char data;
    TrieNode[] children = new TrieNode[26];
    int childCount;
    boolean isTerminal;

    public TrieNode(char ch)
    {
        this.data=ch;
        for(int i=0;i<26;i++)
        {
            children[i]=null;
        }
        childCount=0;
        isTerminal=false;
    }

}
