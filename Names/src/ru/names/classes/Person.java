/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
