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

import ru.names.classes.enums.Gender;

/**
 *
 * @author cergean
 */
public class Person {

    private final RythmicString givenName;
    private final RythmicString familyName;
    private final RythmicString patronic;
    private final Gender gender;
    private Boolean isFine;
    private Boolean isPerfect;

    public Person(Gender gender, RythmicString familyName, RythmicString givenName, RythmicString patronic) {
        this.gender = gender;
        this.familyName = familyName;
        this.givenName = givenName;
        this.patronic = patronic;
    }

    public RythmicString getGivenName() {
        return givenName;
    }

    public RythmicString getFamilyName() {
        return familyName;
    }

    public RythmicString getPatronic() {
        return patronic;
    }

    public Gender getGender() {
        return gender;
    }

    public Boolean getIsFine() {
        return isFine;
    }

    public Boolean getIsPerfect() {
        return isPerfect;
    }

    public void setIsFine(Boolean isFine) {
        this.isFine = isFine;
    }

    public void setIsPerfect(Boolean isPerfect) {
        this.isPerfect = isPerfect;
    }

    @Override
    public String toString() {
        return (familyName + " " + givenName + " " + patronic).trim();
    }
    
}
