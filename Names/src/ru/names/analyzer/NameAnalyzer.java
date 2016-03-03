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
package ru.names.analyzer;

import ru.names.classes.RythmicString;
import java.util.HashMap;
import java.util.Map;
import ru.names.classes.Morphic;
import ru.names.classes.Person;
import ru.names.classes.enums.Gender;
import ru.names.classes.enums.Size;
import ru.names.provider.NameContainer;
import ru.names.stringUtils.Utility;

/**
 *
 * @author cergean
 */
public class NameAnalyzer {

    public static Double analyzeRythm(RythmicString name, RythmicString patronic) {
        //Анализируем ритмичность произношения
        Double bestMatch = 0.0;
        for (Size size : Size.values()) {
            Double bestMatchSize = 0.0;
            String wrk = String.valueOf(name.getRythmPattern() + patronic.getRythmPattern());
            for (int i = 0; i < 9; i++) {
                Double ok = 0.0;
                Double err = 0.0;
                if (i > 0) {
                    wrk = wrk.replace(String.valueOf(i), "0");
                }
                for (String chunk : wrk.split("(?<=\\G.{" + size.getSize()
                        + "})")) {
                    if (chunk.length() == size.getPattern().length()) {
                        //размеры строки и паттерна совпадают
                        if ('0' != (chunk.charAt(size.getXPos())) && (Utility.count(
                                chunk, "0") == Utility.count(size.getPattern(), "0"))) {
                            ok += 1;
                        } else {
                            err += 1;
                        }
                    } else //разные размеры строки и паттерна
                    {
                        if ((chunk.length() > size.getXPos()) && '0' != (chunk.
                                charAt(size.getXPos())) && (Utility.count(chunk, "0")
                                == Utility.count(size.getPattern().substring(0, chunk.
                                        length()), "0"))) {
                            ok += 1;
                        } else {
                            err += 1;
                        }
                    }
                }
                bestMatchSize = Math.max(bestMatch, ok / (ok + err));
            }
            bestMatch = Math.max(bestMatch, bestMatchSize);
        }
        return bestMatch;
    }

    public static Double analyzeConsonants(RythmicString name, RythmicString patronic) {
        //Проверяем стык двух слов на конфликт согласных. сначала количество:
        Double ret = 1.0;
        String lst = name.getLast(1);
        String fst = patronic.getFirst(1);
        if (Utility.countConsonants(lst + fst) == 2) {
            String check = name.getLast(2) + patronic.getFirst(2);
            Integer count = Utility.countConsonants(check);
            switch (count) {
                case 3:
                    ret = ret / 3;
                    break;
                case 4:
                    ret = ret / 8;
                    break;
            }
        }
        for (int i = 1; i < 4; i++) {
            lst = name.getLast(i);
            fst = patronic.getFirst(i);
            if (fst.equals(lst)) {
                ret = ret / 5;
            }
        }

        return ret;
    }

    public static Double complexCheck(RythmicString name, RythmicString patronic) {
        return analyzeRythm(name, patronic) + analyzeConsonants(name, patronic);
    }

    public static Boolean isOk(RythmicString name, RythmicString patronic) {
        return complexCheck(name, patronic) >= 1.5;
    }

    public static Person checkPerson(Person person) {
        person.setIsFine(isOk(person.getGivenName(), person.getPatronic()));
        person.setIsPerfect(isOk(person.getGivenName(), person.getPatronic()) && isOk(person.getFamilyName(), person.getGivenName()));
        return person;
    }
}
