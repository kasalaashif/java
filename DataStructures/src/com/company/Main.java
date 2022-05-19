package com.company;


public class Main
{

    public static void main(String[] args)
    {
        Trie trie = new Trie();
        trie.insert("Ashif");
        trie.insert("Ammu");
        trie.insert("Chanu");
        trie.insert("Ashraf");
        System.out.println(trie.search("Chanu"));
    }
}
