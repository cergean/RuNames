/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.names.classes.enums;

/**
 *
 * @author cergean
 * Тип, определяющий применимость исходных слов с учетом окончаний. Слово,
 * применимое в качестве мужского имени, автоматически применимо в качестве
 * отчества.
 */
public enum Usage {

    /**
     * Полная применимость: в качестве мужского/женского имени, фамилии или
     * отчества
     */
    FULL(true, true, true, true),
    /**
     * Применимость только в качестве мужского/женского имени или отчества
     */
    NAME_ONLY(true, true, false, true),
    /**
     * Применимость только в качестве фамилии
     */
    FAM_ONLY(false, false, true, false),
    /**
     * Применимость в качестве женского имени или фамилии
     */
    FEMALE_FAM(false, true, true, false),
    /**
     * Применимость только в качестве женского имени
     */
    FEMALE_NAME(false, true, false, false),
    /**
     * Применимость в качестве мужского имени, фамилии или отчества
     */
    MALE_FAM(true, false, true, true),
    /**
     * Применимость только в качестве мужского имени или отчества
     */
    MALE_NAME(true, false, false, true);

    private final Boolean canBeF;
    private final Boolean canBeFG;
    private final Boolean canBeMG;
    private final Boolean canBeP;

    private Usage(Boolean canBeMG, Boolean canBeFG, Boolean canBeF, Boolean canBeP) {
        this.canBeF = canBeF;
        this.canBeFG = canBeFG;
        this.canBeMG = canBeMG;
        this.canBeP = canBeP;
    }

    /**
     *
     * @return может ли быть мужским именем
     */
    public Boolean getCanBeMG() {
        return canBeMG;
    }

    /**
     *
     * @return может ли быть женским именем
     */
    public Boolean getCanBeFG() {
        return canBeFG;
    }

    /**
     *
     * @return может ли быть фамилией
     */
    public Boolean getCanBeF() {
        return canBeF;
    }

    /**
     *
     * @return может ли быть отчеством
     */
    public Boolean getCanBeP() {
        return canBeP;
    }
}
