/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.names.classes.enums;

/**
 *
 * @author cergean
 * Тип, определяющий стихотворные размеры для определения благозвучия имен.
 */
public enum Size {
    YAMB("0X", 2),
    HOREY("X0", 2),
    DACTILE("X00", 3),
    AMPHYBRACH("0X0", 3),
    ANAPEST("00X", 3);
    private final String pattern;
    private final Integer size;

    private Size(String pattern, Integer size) {
        this.pattern = pattern;
        this.size = size;

    }

    public String getPattern() {
        return pattern;
    }

    public Integer getSize() {
        return size;
    }

    public int getXPos() {
        return pattern.indexOf("X");
    }
}
