package com.awsravi.HRank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagramStrings {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            if (!anagramGroups.containsKey(sortedStr)) {
                anagramGroups.put(sortedStr, new ArrayList<>());
            }

            anagramGroups.get(sortedStr).add(str);
        }

        return new ArrayList<>(anagramGroups.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        GroupAnagramStrings groupAnagrams = new GroupAnagramStrings();
        List<List<String>> result = groupAnagrams.groupAnagrams(strs);

        for (List<String> group : result) {
            System.out.print(group);
        }
    }
}
