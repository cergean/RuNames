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
package ru.names.classes;

import ru.names.classes.enums.Ending;
import ru.names.classes.enums.EndingFull;
import ru.names.classes.enums.Usage;
import ru.names.classes.enums.GrCaseEnding;
import ru.names.classes.enums.Gender;

/**
 *
 * @author cergean
 */
/**
 * Тип, хранящий в себе данные для сборки имен, фамилий и отчеств всех
 * вариантов, с окончаниями и типами применимости.
 */
public class Morphic {

    private final RythmicString base;
    private final GrCaseEnding grCaseEnding;
    private final Ending ending;
    private final EndingFull endingFull;
    private final Usage usage;
    private final Boolean outdated;
    
    /**
     * Конструктор вариатора словоформ.
     *
     * @param base строка, неизменно присутствуящая во всех словоформах.
     * @param ending варианты окончаний для всех словоформ.
     * @param usage применимость слова.
     */
    public Morphic(RythmicString base, GrCaseEnding ending, Usage usage) {
        this.base = base;
        this.grCaseEnding = ending;
        this.ending = null;
        this.endingFull = null;
        this.usage = usage;
        this.outdated = false;
    }

    /**
     * Конструктор вариатора словоформ.
     *
     * @param base строка, неизменно присутствуящая во всех словоформах.
     * @param ending варианты окончаний для всех словоформ.
     * @param usage применимость слова.
     * @param outdated флаг устаревшего, старомодного имени.
     */
    public Morphic(RythmicString base, GrCaseEnding ending, Usage usage,
            Boolean outdated) {
        this.base = base;
        this.grCaseEnding = ending;
        this.ending = null;
        this.endingFull = null;
        this.usage = usage;
        this.outdated = outdated;
    }
    
    /**
     * Конструктор вариатора словоформ.
     *
     * @param base строка, неизменно присутствуящая во всех словоформах.
     * @param ending варианты окончаний для всех словоформ.
     * @param usage применимость слова.
     */
    public Morphic(RythmicString base, Ending ending, Usage usage) {
        this.base = base;
        this.grCaseEnding = ending.getNominative();
        this.ending = ending;
        this.endingFull = null;
        this.usage = usage;
        this.outdated = false;
    }

    /**
     * Конструктор вариатора словоформ.
     *
     * @param base строка, неизменно присутствуящая во всех словоформах.
     * @param ending варианты окончаний для всех словоформ.
     * @param usage применимость слова.
     * @param outdated флаг устаревшего, старомодного имени.
     */
    public Morphic(RythmicString base, Ending ending, Usage usage,
            Boolean outdated) {
        this.base = base;
        this.grCaseEnding = ending.getNominative();
        this.ending = ending;
        this.endingFull = null;
        this.usage = usage;
        this.outdated = outdated;
    }
    
    /**
     * Конструктор вариатора словоформ.
     *
     * @param base строка, неизменно присутствуящая во всех словоформах.
     * @param ending варианты окончаний для всех словоформ.
     * @param usage применимость слова.
     */
    public Morphic(RythmicString base, EndingFull ending, Usage usage) {
        this.base = base;
        this.grCaseEnding = ending.getSingle().getNominative();
        this.ending = ending.getSingle();
        this.endingFull = ending;
        this.usage = usage;
        this.outdated = false;
    }

    /**
     * Конструктор вариатора словоформ.
     *
     * @param base строка, неизменно присутствуящая во всех словоформах.
     * @param ending варианты окончаний для всех словоформ.
     * @param usage применимость слова.
     * @param outdated флаг устаревшего, старомодного имени.
     */
    public Morphic(RythmicString base, EndingFull ending, Usage usage,
            Boolean outdated) {
        this.base = base;
        this.grCaseEnding = ending.getSingle().getNominative();
        this.ending = ending.getSingle();
        this.endingFull = ending;
        this.usage = usage;
        this.outdated = outdated;
    }

    /**
     * Возвращает имя без проверки на применимость.
     *
     * @param gen пол.
     * @return имя для данного пола.
     */
    public RythmicString getGivenName(Gender gen) {
        return base.add((gen.equals(Gender.MALE) ? grCaseEnding.getEndNameMale()
                : grCaseEnding.getEndNameFemale()));
    }

    /**
     * Возвращает фамилию без проверки на применимость.
     *
     * @param gen пол.
     * @return фамилия для данного пола.
     */
    public RythmicString getFamilyName(Gender gen) {
        return base.add((gen.equals(Gender.MALE) ? grCaseEnding.getMaleFamEnd()
                : grCaseEnding.getFemaleFamEnd()));
    }

    /**
     * Возвращает отчество без проверки на приенимость.
     *
     * @param gen пол.
     * @return отчество для данного пола.
     */
    public RythmicString getPatronic(Gender gen) {
        return base.add((gen.equals(Gender.MALE) ? grCaseEnding.getMalePatEnd()
                : grCaseEnding.getFemalePatEnd()));
    }

    /**
     * Выполняет проверку применимости.
     *
     * @return может ли быть мужским именем.
     */
    public Boolean getCanBeMG() {
        return usage.getCanBeMG();
    }

    /**
     * Выполняет проверку применимости.
     *
     * @return может ли быть женским именем.
     */
    public Boolean getCanBeFG() {
        return usage.getCanBeFG();
    }

    /**
     * Выполняет проверку применимости.
     *
     * @return может ли быть фамилией.
     */
    public Boolean getCanBeF() {
        return usage.getCanBeF();
    }

    /**
     * Выполняет проверку применимости.
     *
     * @return может ли быть отчеством.
     */
    public Boolean getCanBeP() {
        return usage.getCanBeP();
    }

    public Boolean getOutdated() {
        return outdated;
    }

}
