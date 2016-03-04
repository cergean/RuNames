/*
 * Copyright (C) 2016 cergean
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the FREE Software Foundation, either version 3 of the License, or
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

import ru.names.classes.RythmicString;

/**
 *
 * @author cergean
 */
public class Endings {
    
    
    /**
     * Пустое окончание
     */
    public static final RythmicString EMP = new RythmicString();
    /**
     * Ударное окончание "а"
     */
    public static final RythmicString A_ACCT = new RythmicString("а", "9");

    /**
     * Безударное окончание "а"
     */
    public static final RythmicString A_FREE = new RythmicString("а", "0");
    /**
     * Ударное окончание "ам"
     */
    public static final RythmicString AM_ACCT =new RythmicString("ам", "9");
    /**
     * Безударное окончание "ам"
     */
    public static final RythmicString AM_FREE =new RythmicString("ам", "0");
/**
     * Ударное окончание "ами"
     */
    public static final RythmicString AMI_ACCT =new RythmicString("ами", "90");
    /**
     * Безударное окончание "ами"
     */
    public static final RythmicString AMI_FREE =new RythmicString("ами", "01");
    /**
     * Ударное окончание "ах"
     */
    public static final RythmicString AH_ACCT =new RythmicString("ах", "9");
    /**
     * Безударное окончание "ах"
     */
    public static final RythmicString AH_FREE =new RythmicString("ах", "0");
    /**
     * Ударное окончание "е"
     */
    public static final RythmicString E_ACCT = new RythmicString("е", "9");

    /**
     * Безударное окончание "е"
     */
    public static final RythmicString E_FREE = new RythmicString("е", "0");

    /**
     * Ударное окончание "и"
     */
    public static final RythmicString I_ACCT = new RythmicString("и", "9");

    /**
     * Безударное окончание "и"
     */
    public static final RythmicString I_FREE = new RythmicString("и", "0");
    /**
     * Ударное окончание "ой"
     */
    public static final RythmicString OJ_ACCT = new RythmicString("ой", "9");
    /**
     * Безударное окончание "ой"
     */
    public static final RythmicString OJ_FREE = new RythmicString("ой", "0");
    /**
     * Ударное окончание "у"
     */
    public static final RythmicString U_ACCT = new RythmicString("у", "9");
    /**
     * Безударное окончание "у"
     */
    public static final RythmicString U_FREE = new RythmicString("у", "0");
    /**
     * Ударное окончание "ы"
     */
    public static final RythmicString Ы_ACCT = new RythmicString("ы", "9");
    /**
     * Безударное окончание "ы"
     */
    public static final RythmicString Ы_FREE = new RythmicString("ы", "0");
    
    
}
