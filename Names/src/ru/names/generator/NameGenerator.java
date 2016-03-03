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
package ru.names.generator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import ru.names.analyzer.NameAnalyzer;
import ru.names.classes.Morphic;
import ru.names.classes.Person;
import ru.names.classes.RythmicString;
import ru.names.classes.enums.Gender;
import ru.names.exceptions.InconsistentDataException;
import ru.names.provider.NameProvider;

/**
 *
 * @author cergean
 */
public class NameGenerator {

    NameProvider provider;

    public NameGenerator() {
        provider = new NameProvider();
    }

    public NameGenerator(String... filePaths) {
        provider = new NameProvider(filePaths);
    }

    public NameGenerator(File... files) {
        provider = new NameProvider(files);
    }

    public void providerStat() {
        provider.stat();
    }

    public Person checkPerson(String familyName, String givenName, String patronic) {
        RythmicString giv = provider.findGivenName(givenName);
        RythmicString fam = provider.findFamilyName(familyName);
        RythmicString pat = provider.findPatronic(patronic);
        Gender gen = provider.findGender(giv, fam, pat);
        Person ret = new Person(gen, fam, giv, pat);
        return NameAnalyzer.checkPerson(ret);
    }

    public Person nextPerson() {
        return nextPerson((new Random().nextBoolean()) ? "MALE" : "FEMALE");
    }

    public Person nextPerson(String gender) {
        Gender gen = Gender.forString(gender);
        RythmicString givenName;
        RythmicString familyName;
        RythmicString patronic;
        if (gen.equals(Gender.MALE)) {
            familyName = provider.getMaleFams().random();
            givenName = provider.getMaleNames().random();
            patronic = provider.getMalePats().random();
        } else {
            familyName = provider.getFemaleFams().random();
            givenName = provider.getFemaleNames().random();
            patronic = provider.getFemalePats().random();
        }
        Person ret = new Person(gen, familyName, givenName, patronic);
        return NameAnalyzer.checkPerson(ret);
    }

    public Person nextFinePerson() {
        return nextFinePerson((new Random().nextBoolean()) ? "MALE" : "FEMALE");
    }

    public Person nextFinePerson(String gender) {
        Person ret = nextPerson(gender);
        while (!ret.getIsFine()) {
            ret = nextPerson(gender);
        }
        return ret;
    }

    public Person nextPerfectPerson() {
        return nextPerfectPerson((new Random().nextBoolean()) ? "MALE" : "FEMALE");
    }

    /**
     *
     * @param gender пол.
     * @return случайное имя заданного пола, с согласованными парами Фамилия-Имя
     * и Имя-Отчество.
     */
    public Person nextPerfectPerson(String gender) {
        Person ret = nextPerson(gender);
        while (!ret.getIsPerfect()) {
            ret = nextPerson(gender);
        }
        return ret;
    }

    private List<Person> listChildren(String maleName, String familyName, Boolean needPerfect) {
        List<Person> ret = new ArrayList<>();
        Morphic fam = null;
        if (needPerfect && familyName == null) {
            throw new InconsistentDataException("Для данной проверки необходимо передать фамилию.");
        } else {
            fam = provider.getFamIndex().get(familyName);
        }
        RythmicString giv = provider.findGivenName(maleName);
        Gender gen = provider.findGender(giv, null, null);
        if (!Gender.MALE.equals(gen)) {
            throw new InconsistentDataException("В данный метод необходимо передать мужское имя.");
        }
        Morphic pat = provider.getNameIndex().get(giv.getBase());
        for (RythmicString chName : provider.getMaleNames()) {
            Person person = new Person(Gender.MALE, (familyName == null) ? null : fam.getFamilyName(Gender.MALE), chName, pat.getPatronic(Gender.MALE));
            person = NameAnalyzer.checkPerson(person);
            if (needPerfect) {
                if (person.getIsPerfect()) {
                    ret.add(person);
                }
            } else if (person.getIsFine()) {
                ret.add(person);
            }
        }
        for (RythmicString chName : provider.getFemaleNames()) {
            Person person = new Person(Gender.FEMALE, (familyName == null) ? null : fam.getFamilyName(Gender.FEMALE), chName, pat.getPatronic(Gender.FEMALE));
            person = NameAnalyzer.checkPerson(person);
            if (needPerfect) {
                if (person.getIsPerfect()) {
                    ret.add(person);
                }
            } else if (person.getIsFine()) {
                ret.add(person);
            }
        }
        return ret;
    }

    public List<Person> listFineChildren(String maleName, String familyName) {
        return listChildren(maleName, familyName, false);
    }

    public List<Person> listPerfectChildren(String maleName, String familyName) {
        return listChildren(maleName, familyName, true);
    }
}
