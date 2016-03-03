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
