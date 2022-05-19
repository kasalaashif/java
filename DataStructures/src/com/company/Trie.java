package com.company;
import java.lang.String;
public class Trie
{
    public Node root;
    public Trie()
    {
        this.root = new Node("");
    }
    public void insert(String word)
    {
        String text = word.toLowerCase();
        Node tempNode =  root;
        for(int index=0; index< text.length(); index++)
        {
            char character = text.charAt(index);
            int asciiIndex = character - 'a';
            if(tempNode.getChild(asciiIndex) == null)
            {
                Node node = new Node(String.valueOf(character));
                tempNode.setChild(asciiIndex,node);
                tempNode = tempNode.getChild(asciiIndex);
            }
            else
            {
                tempNode = tempNode.getChild(asciiIndex);
            }

        }
        tempNode.setLeaf(true);
    }

    public boolean search(String word)
    {
        String text = word.toLowerCase();
        Node tempNode = root;
        for(int index = 0; index < text.length(); index++) {
            char character = text.charAt(index);
            int asciiIndex = character - 'a';
            if (tempNode.getChild(asciiIndex) == null) {
                return false;
            } else {
                tempNode = tempNode.getChild(asciiIndex);
            }
        }
        if(tempNode.getLeaf())
        {
            return true;
        }
        return false;
    }
}
