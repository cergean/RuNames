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

import ru.names.exceptions.InconsistentDataException;

/**
 *
 * @author cergean Тип, определяющий пол (род).
 */
public enum Gender {

    /**
     * Мужской род.
     */
    MALE,
    /**
     * Женский род.
     */
    FEMALE;

    public static Gender forString(String gender) {
        switch (gender.toLowerCase()) {
            case "1":
            case "m":
            case "m.":
            case "mal":
            case "mal.":
            case "male":
            case "м":
            case "м.":
            case "муж":
            case "муж.":
            case "мужской":
            case "мужчина":
            case "♂":
                return MALE;
            case "0":
            case "f":
            case "f.":
            case "fem":
            case "fem.":
            case "female":
            case "ж":
            case "ж.":
            case "жен":
            case "жен.":
            case "женский":
            case "женщина":
            case "♀":
                return FEMALE;
            default:
                throw new InconsistentDataException("Не найдено соответствие пола переданной строке: \"" + gender + "\"");
        }
    }
}
