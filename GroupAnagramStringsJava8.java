package com.awsravi.HRank;
import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagramStringsJava8 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return Collections.emptyList();
        }

        Map<String, List<String>> anagramGroups = Arrays.stream(strs)
                .collect(Collectors.groupingBy(
                        this::sortedString,
                        Collectors.toList()
                ));

        return new ArrayList<>(anagramGroups.values());
    }

    private String sortedString(String str) {
        return str.chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        GroupAnagramStringsJava8 groupAnagrams = new GroupAnagramStringsJava8();
        List<List<String>> result = groupAnagrams.groupAnagrams(strs);

        result.forEach(System.out::println);
    }
}
