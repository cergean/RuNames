/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.names.provider;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.names.classes.Morphic;
import ru.names.classes.RythmicString;
import ru.names.classes.enums.Gender;
import ru.names.classes.generics.ArrayListRandom;
import ru.names.classes.generics.ListRandom;
import ru.names.exceptions.ExternalDictionaryException;
import ru.names.exceptions.InconsistentDataException;
import ru.names.exceptions.NameNotFoundException;

/**
 *
 * @author cergean
 */
public class NameProvider {

    private final List<Morphic> morphics = new ArrayList<>();
    private ListRandom<RythmicString> maleNames;
    private ListRandom<RythmicString> femaleNames;
    private ListRandom<RythmicString> maleFams;
    private ListRandom<RythmicString> femaleFams;
    private ListRandom<RythmicString> malePats;
    private ListRandom<RythmicString> femalePats;
    private Map<String, Morphic> nameIndex;
    private Map<String, Morphic> famIndex;
    private Map<String, Morphic> patIndex;
    private Map<String, Morphic> index = new HashMap<>();

    /**
     *
     */
    public NameProvider() {
        morphics.addAll(Arrays.asList(NameContainer.SELF_MORPHICS));
    }

    /**
     *
     * @param filePaths массив путей к внешним словарям. если передан путь до
     * папки - ожидается наличие внутри файла namws.csv. если путь не передан -
     * файл ожидается в одной директории с jar-архивом.
     */
    public NameProvider(String... filePaths) {
        this();
        if (filePaths != null && filePaths.length > 0) {
            for (String filePath : filePaths) {
                try {
                    ExternalNameLoader loader = (filePath == null) ? new ExternalNameLoader() : new ExternalNameLoader(filePath);
                    if (loader.getExternalNames().size() > 0) {
                        morphics.addAll(loader.getExternalNames());
                    }
                } catch (ExternalDictionaryException ex) {
                    Logger.getLogger(NameProvider.class.getName()).log(Level.WARNING, "Не был подключен внешний словарь по переданному пути: \"" + filePath + "\".", ex);
                }
            }
        }
    }

    /**
     *
     * @param files массив файлов внешних словарей.
     */
    public NameProvider(File... files) {
        this();
        if (files != null && files.length > 0) {
            for (File file : files) {
                if (file != null) {
                    try {
                        ExternalNameLoader loader = new ExternalNameLoader(file);
                        if (loader.getExternalNames().size() > 0) {
                            morphics.addAll(loader.getExternalNames());
                        }
                    } catch (ExternalDictionaryException ex) {
                        Logger.getLogger(NameProvider.class.getName()).log(Level.WARNING, "Не был подключен внешний словарь по переданному пути: \"" + file.getAbsolutePath() + "\".", ex);
                    }
                }
            }
        }
    }

    /**
     *
     * @return полный список мужских имен.
     */
    public ListRandom<RythmicString> getMaleNames() {
        if (maleNames == null) {
            maleNames = new ArrayListRandom<>();
            for (Morphic name : morphics) {
                if (name.getCanBeMG()) {
                    maleNames.add(name.getGivenName(Gender.MALE));
                }
            }
        }
        return maleNames;
    }

    /**
     *
     * @return полный список женских имен.
     */
    public ListRandom<RythmicString> getFemaleNames() {
        if (femaleNames == null) {
            femaleNames = new ArrayListRandom<>();
            for (Morphic name : morphics) {
                if (name.getCanBeFG()) {
                    femaleNames.add(name.getGivenName(Gender.FEMALE));
                }
            }
        }
        return femaleNames;
    }

    /**
     *
     * @return полный список мужских фамилий.
     */
    public ListRandom<RythmicString> getMaleFams() {
        if (maleFams == null) {
            maleFams = new ArrayListRandom<>();
            for (Morphic name : morphics) {
                if (name.getCanBeF()) {
                    maleFams.add(name.getFamilyName(Gender.MALE));
                }
            }
        }
        return maleFams;
    }

    /**
     *
     * @return полный список женских фамилий.
     */
    public ListRandom<RythmicString> getFemaleFams() {
        if (femaleFams == null) {
            femaleFams = new ArrayListRandom<>();
            for (Morphic name : morphics) {
                if (name.getCanBeF()) {
                    femaleFams.add(name.getFamilyName(Gender.FEMALE));
                }
            }
        }
        return femaleFams;
    }

    /**
     *
     * @return полный список мужских отчеств.
     */
    public ListRandom<RythmicString> getMalePats() {
        if (malePats == null) {
            malePats = new ArrayListRandom<>();
            for (Morphic name : morphics) {
                if (name.getCanBeP()) {
                    malePats.add(name.getPatronic(Gender.MALE));
                }
            }
        }
        return malePats;
    }

    /**
     *
     * @return полный список женских отчеств.
     */
    public ListRandom<RythmicString> getFemalePats() {
        if (femalePats == null) {
            femalePats = new ArrayListRandom<>();
            for (Morphic name : morphics) {
                if (name.getCanBeP()) {
                    femalePats.add(name.getPatronic(Gender.FEMALE));
                }
            }
        }
        return femalePats;
    }

    /**
     *
     * @return поисковый индекс по именам.
     */
    public Map<String, Morphic> getNameIndex() {
        if (nameIndex == null) {
            nameIndex = new HashMap<>();
            for (Morphic name : morphics) {
                if (name.getCanBeFG()) {
                    nameIndex.put(name.getGivenName(Gender.FEMALE).getBase(), name);
                    index.put(name.getGivenName(Gender.FEMALE).getBase(), name);
                }
                if (name.getCanBeMG()) {
                    nameIndex.put(name.getGivenName(Gender.MALE).getBase(), name);
                    index.put(name.getGivenName(Gender.MALE).getBase(), name);
                }
            }
        }
        return nameIndex;
    }

    /**
     *
     * @return поисковый индекс по фамилиям.
     */
    public Map<String, Morphic> getFamIndex() {
        if (famIndex == null) {
            famIndex = new HashMap<>();
            for (Morphic name : morphics) {
                if (name.getCanBeF()) {
                    famIndex.put(name.getFamilyName(Gender.MALE).getBase(), name);
                    index.put(name.getFamilyName(Gender.MALE).getBase(), name);
                    famIndex.put(name.getFamilyName(Gender.FEMALE).getBase(), name);
                    index.put(name.getFamilyName(Gender.FEMALE).getBase(), name);
                }
            }
        }
        return famIndex;
    }

    /**
     *
     * @return поисковый индекс по отчествам.
     */
    public Map<String, Morphic> getPatIndex() {
        if (patIndex == null) {
            patIndex = new HashMap<>();
            for (Morphic name : morphics) {
                if (name.getCanBeP()) {
                    patIndex.put(name.getPatronic(Gender.MALE).getBase(), name);
                    index.put(name.getPatronic(Gender.MALE).getBase(), name);
                    patIndex.put(name.getPatronic(Gender.FEMALE).getBase(), name);
                    index.put(name.getPatronic(Gender.FEMALE).getBase(), name);
                }
            }
        }
        return patIndex;
    }

    public RythmicString findGivenName(String givenName) {
        Morphic ret = getNameIndex().get(givenName);
        if (ret == null) {
            throw new NameNotFoundException("имя " + givenName);
        }
        return (ret.getGivenName(Gender.MALE).getBase().equals(givenName)) ? ret.getGivenName(Gender.MALE) : ret.getGivenName(Gender.FEMALE);
    }

    public RythmicString findFamilyName(String familyName) {
        Morphic ret = getFamIndex().get(familyName);
        if (ret == null) {
            throw new NameNotFoundException("фамилию " + familyName);
        }
        return (ret.getFamilyName(Gender.MALE).getBase().equals(familyName)) ? ret.getFamilyName(Gender.MALE) : ret.getFamilyName(Gender.FEMALE);
    }

    public RythmicString findPatronic(String patronic) {
        Morphic ret = getPatIndex().get(patronic);
        if (ret == null) {
            throw new NameNotFoundException("отчество " + patronic);
        }
        return (ret.getPatronic(Gender.MALE).getBase().equals(patronic)) ? ret.getPatronic(Gender.MALE) : ret.getPatronic(Gender.FEMALE);
    }

    public Gender findGender(RythmicString givenName, RythmicString familyName, RythmicString patronic) {
        Gender giv = null;
        Gender fam = null;
        Gender pat = null;
        if (givenName != null) {
            giv = (getIndex().get(givenName.getBase()).getGivenName(Gender.MALE).equals(givenName)) ? Gender.MALE : Gender.FEMALE;
        }
        if (familyName != null) {
            fam = (getIndex().get(familyName.getBase()).getFamilyName(Gender.MALE).equals(familyName)) ? Gender.MALE : Gender.FEMALE;
        }
        if (patronic != null) {
            pat = (getIndex().get(patronic.getBase()).getPatronic(Gender.MALE).equals(patronic)) ? Gender.MALE : Gender.FEMALE;
        }
        Gender ret = (giv == null) ? ((fam == null) ? ((pat == null) ? null : pat) : fam) : giv;
        if (ret == null) {
            throw new InconsistentDataException("Не передан ни один параметр для определения пола.");
        }
        return ret;
    }

    public void stat() {
        System.out.println("Количество мужских имен:");
        System.out.println(getMaleNames().size());
        System.out.println("Количество женских имен:");
        System.out.println(getFemaleNames().size());
        System.out.println("Количество фамилий:");
        System.out.println(getMaleFams().size());
        System.out.println("Уникальных мужских персон:");
        System.out.println(getMaleFams().size() * getMaleNames().size() * getMalePats().size());
        System.out.println("Уникальных женских персон:");
        System.out.println(getFemaleFams().size() * getFemaleNames().size() * getFemalePats().size());

    }

    private Map<String, Morphic> getIndex() {
        return index;
    }
}
