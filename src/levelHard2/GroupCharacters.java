package levelHard2;

import utils.enums.CategorizeCharacters;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupCharacters {
    /**
     * Group Characters by UPPERCASE, LOWERCASE, DIGIT, OTHERS
     */
    public static void categorizeChars() {
        String input = "Welcome To My GIT. 1234@@";
        Map<CategorizeCharacters, List<Character>> collect = input.replaceAll(" ", "").chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(GroupCharacters::getCharCategory, Collectors.toList()));
        System.out.println(collect);
    }

    public static CategorizeCharacters getCharCategory(Character c) {
        if (Character.isDigit(c)) return CategorizeCharacters.DIGIT;
        if (Character.isLowerCase(c)) return CategorizeCharacters.LOWERCASE;
        if (Character.isUpperCase(c)) return CategorizeCharacters.UPPERCASE;
        else return CategorizeCharacters.OTHERS;
    }

    public static void main(String[] args) {
        categorizeChars();
    }
}
