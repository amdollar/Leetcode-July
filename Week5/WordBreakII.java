package io.test.Week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
*Link : https://leetcode.com/problems/word-break-ii/
*/

public class WordBreakII {

	public static void main(String[] args) {
		String s = "catsanddog";
		List<String> wordDist = Arrays.asList("cat", "cats", "and", "sand", "dog");
		List<String> dis = wordBreak(s, wordDist);
		for (String str : dis)
			System.out.println(str);
	}

	public static List<String> wordBreak(String s, List<String> wordDict) {
		if (s.length() > 100)
			return new ArrayList();
		List<String> result = new ArrayList<String>();
		wordBreakUtil(s, wordDict, result, new StringBuilder());
		return result;
	}

	public static void wordBreakUtil(String s, List<String> wordDict, List<String> result, StringBuilder subList) {
		// add " " between 2 words in subList
		if (subList.length() != 0) {
			subList.append(" ");
		}
		// iterate over all the words in wordDict
		for (String word : wordDict) {
			if (s.startsWith(word)) {
				StringBuilder sb = new StringBuilder(subList);
				// append current match in sb
				sb.append(word);
				// if this is last word to be matched
				if (s.equals(word)) {
					result.add(new String(sb));
				} else {
					wordBreakUtil(s.substring(word.length()), wordDict, result, sb);

				}
			}
		}
	}
}
