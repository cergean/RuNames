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

import ru.names.classes.RythmicString;

/**
 *
 * @author cergean
 */
public class Endings {
    
    
    /**
     * Пустое окончание
     */
    public static final RythmicString Empty = new RythmicString("");
    /**
     * Ударное окончание "а"
     */
    public static final RythmicString A_Acct = new RythmicString("а", "9");

    /**
     * Безударное окончание "а"
     */
    public static final RythmicString A_Free = new RythmicString("а", "0");

    /**
     * Ударное окончание "е"
     */
    public static final RythmicString E_Acct = new RythmicString("е", "9");

    /**
     * Безударное окончание "е"
     */
    public static final RythmicString E_Free = new RythmicString("е", "0");

    /**
     * Ударное окончание "и"
     */
    public static final RythmicString I_Acct = new RythmicString("и", "9");

    /**
     * Безударное окончание "и"
     */
    public static final RythmicString I_Free = new RythmicString("и", "0");
    /**
     * Ударное окончание "ой"
     */
    public static final RythmicString OJ_Acct = new RythmicString("ой", "9");
    /**
     * Безударное окончание "ой"
     */
    public static final RythmicString OJ_Free = new RythmicString("ой", "0");
    /**
     * Ударное окончание "у"
     */
    public static final RythmicString U_Acct = new RythmicString("у", "9");
    /**
     * Безударное окончание "у"
     */
    public static final RythmicString U_Free = new RythmicString("у", "0");
    /**
     * Ударное окончание "ы"
     */
    public static final RythmicString Ы_Acct = new RythmicString("ы", "9");
    /**
     * Безударное окончание "ы"
     */
    public static final RythmicString Ы_Free = new RythmicString("ы", "0");
    
    
}
