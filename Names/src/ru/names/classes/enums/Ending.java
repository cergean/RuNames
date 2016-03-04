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
 */
public enum Ending {
    
    A_Acct_Ы_s("A_Acct_Ы_s"),
    A_Acct_Ы_p("A_Acct_Ы_p"),
    /**
     * Ударное окончание "а", например как в имени Лука.
     */
    A_Acct_I("A_Acct_I"),
    /**
     * Безударное окончание "а", например как в имени Никита.
     */
    A_Free_Ы("A_Free_Ы"),
    /**
     * Безударное окончание "а", например как в имени Анжелика.
     */
    A_Free_I("A_Free_I"),
    /**
     * Окончание "ай", например как в имени Николай.
     */
    AJ("AJ"),
    /**
     * Окончание "ей", например как в слове муравей.
     */
    EJ_ЬEV("EJ_ЬEV"),
    /**
     * Окончание "ей", например как в имени Андрей.
     */
    EJ_EEV("EJ_EEV"),
    /**
     * Окончание "ел", как в имени Павел.
     */
    EL("EL"),
    /**
     * Окончание "ид", как в имени Давид. при образовании фамилии и отчества "и"
     * преобразуется в "ы".
     */
    ID_ЫDOV("ID_ЫDOV"),
    /**
     * Окончание "ид", например как в имени Давид. при образовании фамилии и
     * отчества "и" сохраняется.
     */
    ID_IDOV("ID_IDOV"),
    /**
     * Окончание "иил", например как в имени Даниил.
     */
    IIL_ILOV("IIL_ILOV"),
    /**
     * Окончание "ий", например как в имени Анатолий. Используется после
     * открытого слога.
     */
    IJ_ЬEV("IJ_ЬEV"),
    /**
     * Окончание "ий", например как в имени Георгий. Используется после
     * закрытого слога.
     */
    IJ_IEV("IJ_IEV"),
    /**
     * Окончание "ия", например как в имени Анастасия.
     */
    IJ_IN("IJ_IN"),
    /**
     * Окончание "ил", как в имени Михаил.
     */
    IL_JLOV("IL_JLOV"),
    /**
     * Окончание "л", как в имени Кирилл
     */
    L_OV("L_OV"),
    /**
     * Ударное окончание "ок" с выпадающей гласной "о".
     */
    OK_KOV_Acct("OK_KOV_Acct"),
    /**
     * Безударное окончание "ок" с выпадающей гласной "о".
     */
    OK_KOV_Free("OK_KOV_Free"),
    /**
     * Ударное окончание "ол" с выпадающей гласной "о".
     */
    OL_LOV_Acct("OL_LOV_Acct"),
    /**
     * Безударное окончание "ол" с выпадающей гласной "о".
     */
    OL_LOV_Free("OL_LOV_Free"),
    /**
     * Окончание "овь", как в имени Любовь. мужской вариант окончания
     * отсутствует.
     */
    OVЬ("OVЬ"),
    /**
     * Окончание "п", как в имени Филипп.
     */
    P_OV("P_OV"),
    /**
     * Окончание "уй", как в слове Зуй. используется для фамилии Зуев и женского
     * имени Зоя.
     */
    UY("UY"),
    
    
    
    
    
    
    
    
    
    /**
     * Пустое ударное окончание, например как в фамилии Беляков.
     */
    EMPTY_OV_Acct_I("EMPTY_OV_Acct_I"),
    /**
     * Пустое окончание, например как в имени Александр.
     */
    EMPTY_OV_Free_I("EMPTY_OV_Free_I"),
    /**
     * Пустое ударное окончание, например как в фамилии Блинов.
     */
    EMPTY_OV_Acct_Ы("EMPTY_OV_Acct_Ы"),
    /**
     * Пустое окончание, например как в имени Александр.
     */
    EMPTY_OV_Free_Ы("EMPTY_OV_Free_Ы");
    
    
    private final GrCaseEnding nominative;
    private final GrCaseEnding genitive;
    private final GrCaseEnding dative;
    private final GrCaseEnding accusative;
    private final GrCaseEnding ablative;
    private final GrCaseEnding prepositive;
    
    private Ending(String name) {
        this(GrCaseEnding.valueOf(name+"_nom"), GrCaseEnding.valueOf(name+"_gen"), GrCaseEnding.valueOf(name+"_dat"), GrCaseEnding.valueOf(name+"_acc"), GrCaseEnding.valueOf(name+"_abl"), GrCaseEnding.valueOf(name+"_pre")); 
    }

    private Ending(GrCaseEnding nominative, GrCaseEnding genitive, GrCaseEnding dative, GrCaseEnding accusative, GrCaseEnding ablative, GrCaseEnding prepositive) {
        this.nominative = nominative;
        this.genitive = genitive;
        this.dative = dative;
        this.accusative = accusative;
        this.ablative = ablative;
        this.prepositive = prepositive;
    }

    public GrCaseEnding getNominative() {
        return nominative;
    }

    public GrCaseEnding getGenitive() {
        return genitive;
    }

    public GrCaseEnding getDative() {
        return dative;
    }

    public GrCaseEnding getAccusative() {
        return accusative;
    }

    public GrCaseEnding getAblative() {
        return ablative;
    }

    public GrCaseEnding getPrepositive() {
        return prepositive;
    }

}
