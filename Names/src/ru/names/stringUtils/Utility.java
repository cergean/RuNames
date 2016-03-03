/* 
 * Copyright (C) 2016 cergean
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
