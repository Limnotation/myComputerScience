## Tire的代码实现

```java
/**
* Trie树节点类
*/
class TrieNode {
    // 孩子节点指针数组
    TrieNode[] child;
    // 当前字符是否为一个串的结束
    boolean isLeaf;
    
    public TrieNode() {
        this.child = new TrieNode[26];
        this.isLeaf = false;
    }
}

class Trie {
    // 前缀树的根节点
    TrieNode root;

    /** Initialize your data structure here. */
    public Trie() {
        this.root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;
        for(char c:word.toCharArray()) {
            if(node.child[c - 'a'] == null) {
                node.child[c - 'a'] = new TrieNode();
            }
            node = node.child[c- 'a'];
        }
        node.isLeaf = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = root;
        for(char c:word.toCharArray()) {
            if(node.child[c- 'a'] == null) {
                return false;
            }
            node = node.child[c - 'a'];
        }
        return node.isLeaf;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for(char c:prefix.toCharArray()) {
            if(node.child[c - 'a'] == null) {
                return false;
            }
            node = node.child[c - 'a'];
        }
        return true;
    }
}
```

