/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.names.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author ksv
 */
public class RythmicString {

    private String base;
    private String rythmPattern;

    public RythmicString(String base) {
        this.base = base;
        this.rythmPattern = "";
    }

    public RythmicString(String base, String rythmPattern) {
        this.base = base;
        this.rythmPattern = rythmPattern;
    }

    public RythmicString(RythmicString... otherStrings) {
        this.base = "";
        this.rythmPattern = "";
        for (RythmicString str : otherStrings) {
            this.base = this.base + str.base;
            this.rythmPattern = this.rythmPattern + str.rythmPattern;
        }
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getRythmPattern() {
        String ret = this.rythmPattern;
        if (ret.contains("*")) {
            if (ret.contains("9")) {
                ret = ret.replace("*", "0");
            } else {
                ret = ret.replace("*", "9");
            }
        }
        if (ret.contains("!")) {
            if (ret.contains("9")) {
                ret = ret.replace("!", "1");
            } else {
                ret = ret.replace("!", "9");
            }
        }
        return ret;
    }
    
    public String getLast(Integer count){
        String ret="          "+base;
        return ret.substring(ret.length()-count).toLowerCase();
    }
    
    public String getFirst(Integer count){
        String ret=base+"          ";
        return ret.substring(0,count).toLowerCase();
    }

    public void setRythmPattern(String rythmPattern) {
        this.rythmPattern = rythmPattern;
    }
    
    public RythmicString add(RythmicString otherString){
        return new RythmicString(this,otherString);
    }
    
    public RythmicString add(RythmicString... otherStrings){
        List<RythmicString> ret = new ArrayList<>();
        ret.add(this);
        ret.addAll(Arrays.asList(otherStrings));
        return new RythmicString((RythmicString[])ret.toArray());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.base);
        hash = 29 * hash + Objects.hashCode(this.rythmPattern);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RythmicString other = (RythmicString) obj;
        if (!Objects.equals(this.base, other.base)) {
            return false;
        }
        return Objects.equals(this.rythmPattern, other.rythmPattern);
    }

    @Override
    public String toString() {
        return base;
    }

}
