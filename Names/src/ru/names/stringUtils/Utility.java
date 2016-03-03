/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.names.stringUtils;

/**
 *
 * @author cergean
 */
public class Utility {

    private static final String VOWELS = "АЕЁИОУЫЭЮЯаеёиоуыэюя";
    private static final String CONSONANTS = "БВГДЖЗЙКЛМНПРСТФХЦЧШЩбвгджзйклмнпрстфхцчшщ";

    public static int count(String source, String searchFor) {
        return (source.length() - source.replace(searchFor, "").length())
                / searchFor.length();
    }

    public static int countVowels(String string) {
        return string.length() - string.replaceAll("[" + VOWELS + "]", "").length();
    }

    public static int countConsonants(String string) {
        return string.length() - string.replaceAll("[" + CONSONANTS + "]", "").length();
    }

    public static String stringOfChar(char c, int count) {
        String ret = "";
        for (int i = 0; i < count; i++) {
            ret += c;
        }
        return ret;
    }

}
