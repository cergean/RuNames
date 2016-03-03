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
 * Тип, определяющий окончание слова. Задает окончания для мужского и женского
 * варианта имени, фамилии и отчества. Не всегда соответствует морфологическому
 * окончанию слова.
 */
public enum GrCaseEnding {

    /**
     * Ударное окончание "а", например как в имени Фома.
     */
    A_Acct(new RythmicString("а", "9"), new RythmicString("а", "9"), new RythmicString("ин", "9"), new RythmicString("ина", "09"), new RythmicString("ич", "9"), new RythmicString("инична", "901")),
    /**
     * Безударное окончание "а", например как в имени Никита.
     */
    A_Free(new RythmicString("а", "0"), new RythmicString("а", "0"), new RythmicString("ин", "0"), new RythmicString("ина", "01"), new RythmicString("ич", "0"), new RythmicString("ична", "01")),
    /**
     * Окончание "ай", например как в имени Николай.
     */
    AJ(new RythmicString("ай", "9"), new RythmicString("айя", "90"), new RythmicString("аев", "90"), new RythmicString("аева", "901"), new RythmicString("аевич", "901"), new RythmicString("аевна", "901")),
    /**
     * Окончание "ей", например как в слове муравей.
     */
    EJ_ЬEV(new RythmicString("ей", "9"), new RythmicString("ея", "90"), new RythmicString("ьев", "9"), new RythmicString("ьева", "90"), new RythmicString("ьевич", "90"), new RythmicString("ьевна", "90")),
    /**
     * Окончание "ей", например как в имени Андрей.
     */
    EJ_EEV(new RythmicString("ей", "9"), new RythmicString("ея", "90"), new RythmicString("еев", "90"), new RythmicString("еева", "901"), new RythmicString("еевич", "901"), new RythmicString("еевна", "901")),
    /**
     * Окончание "ел", как в имени Павел.
     */
    EL(new RythmicString("ел", "0"), new RythmicString("ла", "0"), new RythmicString("лов", "0"), new RythmicString("лова", "01"), new RythmicString("лович", "01"), new RythmicString("ловна", "01")),
    /**
     * Окончание "ид", как в имени Давид. при образовании фамилии и отчества "и"
     * преобразуется в "ы".
     */
    ID_ЫDOV(new RythmicString("ид", "9"), new RythmicString("ида", "90"), new RythmicString("ыдов", "90"), new RythmicString("ыдова", "901"), new RythmicString("ыдович", "901"), new RythmicString("ыдовна", "901")),
    /**
     * Окончание "ид", например как в имени Давид. при образовании фамилии и
     * отчества "и" сохраняется.
     */
    ID_IDOV(new RythmicString("ид", "9"), new RythmicString("ида", "90"), new RythmicString("идов", "90"), new RythmicString("идова", "901"), new RythmicString("идович", "901"), new RythmicString("идовна", "901")),
    /**
     * Окончание "иил", например как в имени Даниил.
     */
    IIL_ILOV(new RythmicString("иил", "09"), new RythmicString("а", "0"), new RythmicString("илов", "90"), new RythmicString("илова", "901"), new RythmicString("илович", "901"), new RythmicString("иловна", "901")),
    /**
     * Окончание "ий", например как в имени Анатолий. Используется после
     * открытого слога.
     */
    IJ_ЬEV(new RythmicString("ий", "0"), new RythmicString("ья", "0"), new RythmicString("ьев", "0"), new RythmicString("ьева", "01"), new RythmicString("ьевич", "01"), new RythmicString("ьевна", "01")),
    /**
     * Окончание "ий", например как в имени Георгий. Используется после
     * закрытого слога.
     */
    IJ_IEV(new RythmicString("ий", "0"), new RythmicString("ия", "01"), new RythmicString("иев", "01"), new RythmicString("иева", "010"), new RythmicString("иевич", "010"), new RythmicString("иевна", "010")),
    /**
     * Окончание "ия", например как в имени Анастасия.
     */
    IJ_IN(new RythmicString("ий", "0"), new RythmicString("ия", "90"), new RythmicString("ьин", "01"), new RythmicString("ьина", "01"), new RythmicString("ьич", "0"), new RythmicString("ьична", "01")),
    /**
     * Окончание "ил", как в имени Михаил.
     */
    IL_JLOV(new RythmicString("ил", "9"), new RythmicString("ила", "90"), new RythmicString("йлов", "0"), new RythmicString("йлова", "01"), new RythmicString("йлович", "01"), new RythmicString("йловна", "01")),
    /**
     * Окончание "ил"
     */
    IL_LOV(new RythmicString("ил", "9"), new RythmicString("ила", "90"), new RythmicString("лов", "0"), new RythmicString("лова", "01"), new RythmicString("лович", "01"), new RythmicString("ловна", "01")),
    /**
     * Окончание "л", как в имени Кирилл
     */
    L_OV(new RythmicString("л"), new RythmicString("ла", "9"), new RythmicString("ов", "0"), new RythmicString("ова", "01"), new RythmicString("лович", "01"), new RythmicString("ловна", "01")),
    /**
     * Ударное окончание "ок" с выпадающей гласной "о".
     */
    OK_KOV_Acct(new RythmicString("ок","9"), new RythmicString("ка", "0"), new RythmicString("ков", "9"), new RythmicString("кова", "90"), new RythmicString("кович", "90"), new RythmicString("ковна", "90")),
    /**
     * Безударное окончание "ок" с выпадающей гласной "о".
     */
    OK_KOV_Free(new RythmicString("ок","0"), new RythmicString("ка", "0"), new RythmicString("ков", "0"), new RythmicString("кова", "01"), new RythmicString("кович", "01"), new RythmicString("ковна", "01")),
    /**
     * Ударное окончание "ок" с выпадающей гласной "о".
     */
    OL_LOV_Acct(new RythmicString("ол","9"), new RythmicString("ла", "0"), new RythmicString("лов", "9"), new RythmicString("лова", "90"), new RythmicString("лович", "90"), new RythmicString("ловна", "90")),
    /**
     * Безударное окончание "ок" с выпадающей гласной "о".
     */
    OL_LOV_Free(new RythmicString("ол","0"), new RythmicString("ла", "0"), new RythmicString("лов", "0"), new RythmicString("лова", "01"), new RythmicString("лович", "01"), new RythmicString("ловна", "01")),
    
    /**
     * Окончание "овь", как в имени Любовь. мужской вариант окончания
     * отсутствует.
     */
    OVЬ(new RythmicString(""), new RythmicString("овь", "9"), new RythmicString("ин", "0"), new RythmicString("ина", "01"), new RythmicString("ич", "0"), new RythmicString("инична", "901")),
    /**
     * Окончание "п", как в имени Филипп.
     */
    P_OV(new RythmicString("п"), new RythmicString("па", "0"), new RythmicString("ов", "0"), new RythmicString("ова", "01"), new RythmicString("пович", "01"), new RythmicString("повна", "01")),
    /**
     * Окончание "уй", как в слове Зуй. Используется для фамилии Зуев и женского
     * имени Зоя.
     */
    UY(new RythmicString("уй", "9"), new RythmicString("оя", "90"), new RythmicString("уев", "90"), new RythmicString("уева", "901"), new RythmicString("уевич", "901"), new RythmicString("уевна", "901")),
    /**
     * Ударное окончание "я", например как в имени Илья.
     */
    Y_Acct(new RythmicString("я", "9"), new RythmicString("я", "9"), new RythmicString("ин", "9"), new RythmicString("ина", "90"), new RythmicString("ич", "9"), new RythmicString("инична", "901")),
    /**
     * Безударное окончание "я", как в имени Ия.
     */
    Y_Free(new RythmicString("я", "0"), new RythmicString("я", "0"), new RythmicString("ин", "0"), new RythmicString("ина", "01"), new RythmicString("ич", "0"), new RythmicString("ична", "01")),
    /**
     * Окончание "яй", как в фамилии Беляев.
     */
    YJ(new RythmicString("яй", "9"), new RythmicString("яя", "90"), new RythmicString("яев", "90"), new RythmicString("яева", "901"), new RythmicString("яевич", "901"), new RythmicString("яевна", "901")),
    /**
     * Пустое окончание, как в имени Яков.
     */
    EMPTY_LEV(new RythmicString(""), new RythmicString("а", "1"), new RythmicString("лев", "1"), new RythmicString("лева", "01"), new RythmicString("левич", "01"), new RythmicString("левна", "01")),
    /**
     * Пустое окончание, например как в имени Александр.
     */
    EMPTY_OV_Free(new RythmicString(""), new RythmicString("а", "0"), new RythmicString("ов", "0"), new RythmicString("ова", "01"), new RythmicString("ович", "01"), new RythmicString("овна", "01")),
    /**
     * Пустое окончание именительного падежа, например как в имени Александр.
     */
    EMPTY_OV_Free_nom(new RythmicString(""), new RythmicString("а", "0"), new RythmicString("ов", "0"), new RythmicString("ова", "01"), new RythmicString("ович", "01"), new RythmicString("овна", "01")),
    /**
     * Пустое окончание родительного падежа, например как в имени Александр.
     */
    EMPTY_OV_Free_gen(new RythmicString("а","0"), new RythmicString("ы", "0"), new RythmicString("ова", "0"), new RythmicString("овой", "01"), new RythmicString("овича", "010"), new RythmicString("овны", "01")),
    /**
     * Пустое окончание дательного падежа, например как в имени Александр.
     */
    EMPTY_OV_Free_dat(new RythmicString("у","0"), new RythmicString("е", "0"), new RythmicString("ову", "0"), new RythmicString("овой", "01"), new RythmicString("овичу", "010"), new RythmicString("овне", "01")),
    /**
     * Пустое окончание винительного падежа, например как в имени Александр.
     */
    EMPTY_OV_Free_acc(new RythmicString("а","0"), new RythmicString("у", "0"), new RythmicString("ова", "0"), new RythmicString("ову", "01"), new RythmicString("овича", "010"), new RythmicString("овну", "01")),
    /**
     * Пустое окончание творительного падежа, например как в имени Александр.
     */
    EMPTY_OV_Free_abl(new RythmicString("ом","0"), new RythmicString("ой", "0"), new RythmicString("овым", "0"), new RythmicString("овой", "01"), new RythmicString("овичем", "010"), new RythmicString("овной", "01")),
    /**
     * Пустое окончание предложного падежа, например как в имени Александр.
     */
    EMPTY_OV_Free_pre(new RythmicString("е","0"), new RythmicString("е", "0"), new RythmicString("ове", "0"), new RythmicString("ове", "01"), new RythmicString("овиче", "010"), new RythmicString("овне", "01")),
    
    /**
     * Пустое ударное окончание, например как в фамилии Беляков.
     */
    EMPTY_OV_Acct(new RythmicString(""), new RythmicString("а", "9"), new RythmicString("ов", "9"), new RythmicString("ова", "90"), new RythmicString("ович", "90"), new RythmicString("овна", "90")),
    /**
     * Окончание "ь", например как в имени Игорь.
     */
    SOFT_Free(new RythmicString("ь"), new RythmicString("я", "0"), new RythmicString("ев", "0"), new RythmicString("ева", "01"), new RythmicString("евич", "01"), new RythmicString("евна", "01")),
    /**
     * Окончание "ь", например как в фамилии Бобылев.
     */
    SOFT_Acct(new RythmicString("ь"), new RythmicString("я", "9"), new RythmicString("ев", "9"), new RythmicString("ева", "90"), new RythmicString("евич", "90"), new RythmicString("евна", "90"));

    private final RythmicString maleBase;
    private final RythmicString femaleBase;
    private final RythmicString endFamMale;
    private final RythmicString endFamFemale;
    private final RythmicString endPatMale;
    private final RythmicString endPatFemale;

    private GrCaseEnding(RythmicString maleBase, RythmicString femaleBase, RythmicString famMale, RythmicString famFemale, RythmicString patMale, RythmicString patFemale) {
        this.maleBase = maleBase;
        this.femaleBase = femaleBase;
        this.endFamMale = famMale;
        this.endFamFemale = famFemale;
        this.endPatMale = patMale;
        this.endPatFemale = patFemale;
    }

    /**
     *
     * @return окончание мужского имени
     */
    public RythmicString getMaleBaseEnd() {
        return maleBase;
    }

    /**
     *
     * @return окончание женского имени
     */
    public RythmicString getFemaleBaseEnd() {
        return femaleBase;
    }

    /**
     *
     * @return окончание мужской фамилии
     */
    public RythmicString getMaleFamEnd() {
        return endFamMale;
    }

    /**
     *
     * @return окончание женской фамилии
     */
    public RythmicString getFemaleFamEnd() {
        return endFamFemale;
    }

    /**
     *
     * @return окончание мужского отчества
     */
    public RythmicString getMalePatEnd() {
        return endPatMale;
    }

    /**
     *
     * @return окончание женского отчества
     */
    public RythmicString getFemalePatEnd() {
        return endPatFemale;
    }
}
