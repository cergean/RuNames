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
