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
        // 标记叶子节点
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

----

## 实际应用I 

### 题目1 `leetcode 211 添加与搜索单词-数据结构设计`

```java
class WordDictionary {
    class TrieNode {
        private TrieNode[] child;
        private boolean isLeaf;

        public TrieNode() {
            this.child = new TrieNode[26];
            this.isLeaf = false;
        }
    }

    TrieNode root;
    /** Initialize your data structure here. */
    public WordDictionary() {
        this.root = new TrieNode();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode node = this.root;
        for(char c:word.toCharArray()) {
            if(node.child[c - 'a'] == null) {
                node.child[c - 'a'] = new TrieNode();
            }
            node = node.child[c - 'a'];
        }
        node.isLeaf = true;
    }
    
    /** 
    * Returns if the word is in the data structure. 
    * A word could contain the dot character '.' to 
    * represent any one letter. 
    */
    public boolean search(String word) {
        return dfs(word, root, 0);
    }

    private boolean dfs(String word, TrieNode root, int length) {
        if(length == word.length()) {
            return root.isLeaf;
        }

        char curVal = word.charAt(length);
        if(curVal == '.') {
            for(int i = 0; i < 26; i++) {
                if(root.child[i] != null && dfs(word, root.child[i], length + 1)) {
                    return true;
                }
            }
            return false;
        } else {
            if(root.child[curVal - 'a'] == null) {
                return false;
            }
            return dfs(word, root.child[curVal - 'a'], length + 1);
        }
    }
}
```

-----

### 题目2  `leetcode 648 单词替换`

```java
class Solution {
    
    class TrieNode {
        private TrieNode[] child;
        private String word;

        public TrieNode() {
            this.child = new TrieNode[26];
        }
    }
    
    public String replaceWords(List<String> dictionary, String sentence) {
        TrieNode trie = new TrieNode();
        // 将所有词根用于构造前缀树
        for(String root:dictionary) {
            TrieNode cur = trie;
            for(char c:root.toCharArray()) {
                if(cur.child[c - 'a'] == null) {
                    cur.child[c - 'a'] = new TrieNode();
                }
                cur = cur.child[c - 'a'];   
            }
            cur.word = root;
        }

        StringBuffer res = new StringBuffer();
        for(String word:sentence.split(" ")) {
            if(res.length() > 0) {
                res.append(" ");
            }

            TrieNode cur = trie;
            for(char c:word.toCharArray()) {
                // 如果单词在前缀树中没有词根或者碰到了第一个满足的前缀
                // 则退出当前单词的循环
                if(cur.child[c - 'a'] == null || cur.word != null) {
                    break;
                }
                cur = cur.child[c - 'a'];
            }
            res.append(cur.word == null? word:cur.word);
        }
        return res.toString();
    }
}
```

