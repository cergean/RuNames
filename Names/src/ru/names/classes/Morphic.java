/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.names.classes;

import ru.names.classes.enums.Usage;
import ru.names.classes.enums.Ending;
import ru.names.classes.enums.Gender;

/**
 *
 * @author cergean
 */
/**
     * Тип, хранящий в себе данные для сборки имен, фамилий и отчеств всех
     * вариантов, с окончаниями и типами применимости.
     */
    public class Morphic {

        private final RythmicString base;
        private final Ending ending;
        private final Usage usage;

        /**
         * Конструктор вариатора словоформ.
         *
         * @param base строка, неизменно присутствуящая во всех словоформах.
         * @param ending варианты окончаний для всех словоформ.
         * @param usage применимость слова.
         */
        public Morphic(RythmicString base, Ending ending, Usage usage) {
            this.base = base;
            this.ending = ending;
            this.usage = usage;
        }

        /**
         * Возвращает имя без проверки на применимость.
         *
         * @param gen пол.
         * @return имя для данного пола.
         */
        public RythmicString getGivenName(Gender gen) {
            return base.add((gen.equals(Gender.MALE) ? ending.getMaleBaseEnd() : ending.getFemaleBaseEnd()));
        }

        /**
         * Возвращает фамилию без проверки на применимость.
         *
         * @param gen пол.
         * @return фамилия для данного пола.
         */
        public RythmicString getFamilyName(Gender gen) {
            return base.add((gen.equals(Gender.MALE) ? ending.getMaleFamEnd() : ending.getFemaleFamEnd()));
        }

        /**
         * Возвращает отчество без проверки на приенимость.
         *
         * @param gen пол.
         * @return отчество для данного пола.
         */
        public RythmicString getPatronic(Gender gen) {
            return base.add((gen.equals(Gender.MALE) ? ending.getMalePatEnd() : ending.getFemalePatEnd()));
        }

        /**
         * Выполняет проверку применимости.
         *
         * @return может ли быть мужским именем.
         */
        public Boolean getCanBeMG() {
            return usage.getCanBeMG();
        }

        /**
         * Выполняет проверку применимости.
         *
         * @return может ли быть женским именем.
         */
        public Boolean getCanBeFG() {
            return usage.getCanBeFG();
        }

        /**
         * Выполняет проверку применимости.
         *
         * @return может ли быть фамилией.
         */
        public Boolean getCanBeF() {
            return usage.getCanBeF();
        }

        /**
         * Выполняет проверку применимости.
         *
         * @return может ли быть отчеством.
         */
        public Boolean getCanBeP() {
            return usage.getCanBeP();
        }

    }
