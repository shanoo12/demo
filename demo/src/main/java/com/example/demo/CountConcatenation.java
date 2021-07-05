package com.example.demo;

import java.util.Arrays;

public class CountConcatenation {
	public static void main(String[] args) {
		CountConcatenation c=new CountConcatenation();
		String y[]= {"news", "paper", "newspaper", "binary", "search", "binarysearch"};
		System.out.print(c.solve(y));
				
	}

    Trie root[] = new Trie[26];
    public int solve(String[] words) {
        int res = 0;
        Arrays.sort(words, (a, b) -> { return a.length() - b.length(); });

        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            boolean dp[] = new boolean[w.length()];
            for (int j = 0; j < w.length(); j++) {
                boolean f = search(root, dp, w, j);
                if (f) {
                    dp[j] = true;
                }
            }
            if (dp[dp.length - 1])
                res++;
            insert(root, w, w.length() - 1);
        }
        return res;
    }

    public boolean search(Trie root[], boolean dp[], String w, int i) {
        if (i < 0) {
            return false;
        }

        int d = w.charAt(i) - 'a';
        if (root[d] == null) {
            return false;
        } else {
            if ((i == 0 && root[d].end) || (i > 0 && dp[i - 1] && root[d].end)) {
                return true;
            } else {
                return search(root[d].childs, dp, w, i - 1);
            }
        }
    }

    public void insert(Trie root[], String w, int i) {
        int d = w.charAt(i) - 'a';
        if (root[d] == null) {
            root[d] = new Trie();
        }
        if (i == 0) {
            root[d].end = true;
            return;
        }
        insert(root[d].childs, w, i - 1);
    }

    class Trie {
        Trie childs[] = new Trie[26];
        boolean end = false;
    }
}
