/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
