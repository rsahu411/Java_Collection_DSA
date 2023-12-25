package DSA.Trie;

public class Trie {

    TrieNode root;

    Trie()
    {
        root=new TrieNode('\0');
    }


    // Insert string word in trie
    public void insertUtil(TrieNode root, String word)
    {
        // base case
        if(word.isEmpty())
        {
            root.isTerminal=true;
            return;
        }

        // find index of char
        int index = word.charAt(0)-'a';
        TrieNode child;

        // if char is present then jump to next char
        if(root.children[index]!=null)
        {
            child=root.children[index];
        }
        else
        {
            // if char is absent then create it
            child= new TrieNode(word.charAt(0));
            root.childCount++;
            root.children[index]=child;
        }

        // Recursion
        insertUtil(child,word.substring(1));
    }

    public void insertWord(String word)
    {
        insertUtil(root,word);
    }




    // Search word in trie
    public boolean searchUtil(TrieNode root,String word)
    {
        // base case
        if(word.isEmpty())
        {
            return root.isTerminal;
        }

        // find char position
        int index = word.charAt(0)-'a';
        TrieNode child;

        // if char is present and jump to next and check it
        if(root.children[index]!=null)
        {
            child= root.children[index];
        }
        // if absent
        else
        {
            return false;
        }

        // recursive
        return searchUtil(child,word.substring(1));
    }

    public boolean searchWord(String word)
    {
        return  searchUtil(root,word);
    }



    // Remove word from trie
    public void deleteUtil(TrieNode root, String word)
    {
        // base condition
        if(word.length()==0)
        {
            root.isTerminal=false;
            return;
        }

        int index = word.charAt(0)-'a';
        TrieNode child;

        // if present
        if(root.children[index]!=null)
        {
            child=root.children[index];
            deleteUtil(child,word.substring(1));
        }
    }
    public void deleteWord(String word)
    {
        if(searchWord(word))
        {
           // System.out.println("word is found");
            deleteUtil(root,word);
        }
        else
        {
            System.out.println("word is not found in the trie;");
        }
    }




    // Longest Common Prefix
    public String longestCommonPrefix(String[] arr, int n)
    {
        return longestCommonPrefixUtil(root,arr,n);
    }
    public String longestCommonPrefixUtil(TrieNode root, String[] arr,int n)
    {
        // Insert all strings in trie
        for(int i=0;i<n;i++)
        {
            insertWord(arr[i]);
        }

        String first = arr[0];
        StringBuilder ans= new StringBuilder();

        for(int i=0;i<first.length();i++)
        {
            char ch= first.charAt(i);

            // check node count
            if(root.childCount==1)
            {
                // add in ans and jump to next
                ans.append(ch);
                int idx = ch-'a';
                root=root.children[idx];
            }
            else
            {
                break;
            }

            if(root.isTerminal)
            {
                break;
            }
        }
        return ans.toString();
    }


     

}
