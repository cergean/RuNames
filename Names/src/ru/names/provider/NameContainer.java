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
package ru.names.provider;

import ru.names.classes.enums.GrCaseEnding;
import ru.names.classes.Morphic;
import ru.names.classes.RythmicString;
import ru.names.classes.enums.Ending;
import ru.names.classes.enums.EndingFull;
import ru.names.classes.enums.Usage;

/**
 *
 * @author cergean
 */
public class NameContainer {

    public static final Morphic[] SELF_MORPHICS = new Morphic[]{
        new Morphic(new RythmicString("Абрам", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Авд", "0"), Ending.EJ_EEV, Usage.MALE_FAM,true),
        new Morphic(new RythmicString("Агафон", "109"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM,true),
        new Morphic(new RythmicString("Агриппин", "009"), Ending.A_Free_Ы, Usage.FEMALE_NAME,true),
        new Morphic(new RythmicString("Аксён", "09"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Акулин", "009"), Ending.A_Free_Ы, Usage.FEMALE_NAME,true),
        new Morphic(new RythmicString("Алевтин", "009"), Ending.A_Free_Ы, Usage.FEMALE_NAME,true),
        new Morphic(new RythmicString("Александр", "009"), Ending.EMPTY_OV_Free_Ы, Usage.FULL),
        new Morphic(new RythmicString("Алекс", "00"), Ending.EJ_EEV, Usage.MALE_FAM),
        new Morphic(new RythmicString("Алин", "09"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Алл", "9"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Альберт", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_NAME),
        new Morphic(new RythmicString("Анастас", "100"), Ending.IJ_IN, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Анатол", "009"), Ending.IJ_ЬEV, Usage.MALE_NAME),
        new Morphic(new RythmicString("Ангелин", "009"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Андр", "0"), Ending.EJ_EEV, Usage.MALE_FAM),
        new Morphic(new RythmicString("Анжел", "09"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Анжелик", "009"), Ending.A_Free_I, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Анисим", "090"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Агриппин", "009"), Ending.A_Free_Ы, Usage.FEMALE_NAME,true),
        new Morphic(new RythmicString("Анн", "9"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Антон", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Антонин", "009"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Аристарх", "009"), Ending.EMPTY_OV_Free_I, Usage.MALE_NAME,true),
        new Morphic(new RythmicString("Аркад", "09"), Ending.IJ_ЬEV, Usage.MALE_NAME),
        new Morphic(new RythmicString("Арсен", "09"), Ending.IJ_ЬEV, Usage.MALE_NAME),
        new Morphic(new RythmicString("Артем", "09"), Ending.IJ_ЬEV, Usage.MALE_FAM),
        new Morphic(new RythmicString("Артем", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Артур", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_NAME),
        new Morphic(new RythmicString("Архип", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Афанас", "009"), Ending.IJ_ЬEV, Usage.MALE_FAM,true),
        new Morphic(new RythmicString("Баран", "09"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Бел", "0"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Белозёр", "009"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Белоус", "009"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Бел", "0"), GrCaseEnding.YJ, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Беляк", "0*"), Ending.EMPTY_OV_Acct_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Беспал", "09"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Бирюк", "0*"), Ending.EMPTY_OV_Acct_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Блин", "*"), Ending.EMPTY_OV_Acct_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Блох", "*"), Ending.A_Acct_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Бобр", "0"), Ending.EMPTY_OV_Acct_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Бобыл", "90"), GrCaseEnding.SOFT_Free, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Богдан", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Большак", "00"), Ending.EMPTY_OV_Acct_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Борис", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Браг", "9"), Ending.A_Free_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Бур", "9"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Бык", "9"), Ending.EMPTY_OV_Free_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Вадим", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_NAME),
        new Morphic(new RythmicString("Валентин", "009"), Ending.EMPTY_OV_Free_Ы, Usage.NAME_ONLY),
        new Morphic(new RythmicString("Валер", "09"), Ending.IJ_ЬEV, Usage.MALE_NAME),
        new Morphic(new RythmicString("Валер", "09"), Ending.IJ_IEV, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Валерьян", "009"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_NAME),
        new Morphic(new RythmicString("Варвар", "09"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Варлам", "09"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Васил", "09"), Ending.IJ_ЬEV, Usage.MALE_FAM),
        new Morphic(new RythmicString("Василис", "009"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Венедикт", "009"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Вениамин", "0109"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Вер", "9"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Вероник", "009"), Ending.A_Free_I, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Весел", "00"), Ending.EMPTY_OV_Acct_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Виктор", "09"), Ending.IJ_IEV, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Виктор", "90"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_NAME),
        new Morphic(new RythmicString("Виноград", "009"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Витал", "09"), Ending.IJ_ЬEV, Usage.MALE_NAME),
        new Morphic(new RythmicString("Вишняк", "00"), Ending.EMPTY_OV_Acct_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Владимир", "090"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Владислав", "009"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_NAME),
        new Morphic(new RythmicString("Владлен", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_NAME),
        new Morphic(new RythmicString("Влас", "9"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Волк", "9"), Ending.EMPTY_OV_Free_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Вороб", "00"), Ending.EJ_ЬEV, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Ворон", "90"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Воронц", "00"), Ending.EMPTY_OV_Acct_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Всеволод", "901"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_NAME),
        new Morphic(new RythmicString("Вячеслав", "009"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_NAME),
        new Morphic(new RythmicString("Гавр", "0"), Ending.IIL_ILOV, Usage.MALE_FAM),
        new Morphic(new RythmicString("Галк", "9"), Ending.A_Free_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Галин", "09"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Георг", "09"), Ending.IJ_IEV, Usage.MALE_NAME),
        new Morphic(new RythmicString("Герасим", "090"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM,true),
        new Morphic(new RythmicString("Герман", "90"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_NAME),
        new Morphic(new RythmicString("Глафир", "09"), Ending.A_Free_Ы, Usage.FEMALE_NAME,true),
        new Morphic(new RythmicString("Глеб", "9"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_NAME),
        new Morphic(new RythmicString("Голуб", "90"), GrCaseEnding.SOFT_Free, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Горбач", "09"), GrCaseEnding.SOFT_Free, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Горбун", "09"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Горд", "0"), Ending.EJ_EEV, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Горш", "*"), GrCaseEnding.OK_KOV_Acct, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Григор", "09"), Ending.IJ_ЬEV, Usage.MALE_FAM),
        new Morphic(new RythmicString("Гриш", "9"), Ending.A_Free_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Гром", "9"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Гул", "0"), GrCaseEnding.YJ, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Гур", "9"), Ending.IJ_ЬEV, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Гус", "9"), GrCaseEnding.SOFT_Free, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Гущ", "9"), Ending.A_Free_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Дав", "0"), Ending.ID_ЫDOV, Usage.MALE_FAM),
        new Morphic(new RythmicString("Дав", "0"), Ending.ID_IDOV, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Дан", "0"), Ending.IIL_ILOV, Usage.FULL),
        new Morphic(new RythmicString("Дар", "9"), Ending.IJ_ЬEV, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Демент", "09"), Ending.IJ_ЬEV, Usage.MALE_FAM,true),
        new Morphic(new RythmicString("Демьян", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_NAME),
        new Morphic(new RythmicString("Денис", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Дмитр", "9"), Ending.IJ_IEV, Usage.MALE_FAM),
        new Morphic(new RythmicString("Дорон", "09"), Ending.A_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Дороф", "00"), Ending.EJ_EEV, Usage.MALE_FAM),
        new Morphic(new RythmicString("Дрозд", "*"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Дьяк", "9"), Ending.EMPTY_OV_Free_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Дьяч", "*"), GrCaseEnding.OK_KOV_Acct, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Евген", "09"), Ending.IJ_IEV, Usage.FULL),
        new Morphic(new RythmicString("Евдоким", "009"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Евдок", "10"), Ending.IJ_IN, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Евс", "0"), Ending.EJ_EEV, Usage.MALE_FAM),
        new Morphic(new RythmicString("Егор", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Екатерин", "0109"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Елен", "09"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Елизавет", "0109"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Елис", "00"), Ending.EJ_EEV, Usage.MALE_FAM,true),
        new Morphic(new RythmicString("Емельян", "009"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM,true),
        new Morphic(new RythmicString("Ерем", "00"), Ending.EJ_EEV, Usage.MALE_NAME,true),
        new Morphic(new RythmicString("Ермак", "09"), Ending.EMPTY_OV_Free_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Ермол", "00"), Ending.AJ, Usage.MALE_FAM,true),
        new Morphic(new RythmicString("Ерш", "0"), Ending.EMPTY_OV_Acct_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Ефим", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Ефрем", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Ждан", "9"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Жук", "9"), Ending.EMPTY_OV_Free_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Журавл", "0*"), GrCaseEnding.SOFT_Acct, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Зайц", "9"), GrCaseEnding.SOFT_Free, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Захар", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Зим", "0"), EndingFull.A_Acct_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Зина", "00"), Ending.ID_IDOV, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Зинов", "09"), Ending.IJ_ЬEV, Usage.MALE_FAM),
        new Morphic(new RythmicString("Злат", "9"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("З"), GrCaseEnding.UY, Usage.FEMALE_FAM),
        new Morphic(new RythmicString("Зык", "9"), Ending.A_Free_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Иван", "09"), Ending.EMPTY_OV_Free_Ы, Usage.FULL),
        new Morphic(new RythmicString("Игнат", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Игнат", "09"), Ending.IJ_ЬEV, Usage.MALE_FAM),
        new Morphic(new RythmicString("Игор", "90"), GrCaseEnding.SOFT_Free, Usage.MALE_NAME),
        new Morphic(new RythmicString("Иль", "0"), GrCaseEnding.Y_Acct, Usage.MALE_FAM),
        new Morphic(new RythmicString("Инг", "9"), Ending.A_Free_I, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Инесс", "09"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Иннокент", "009"), Ending.IJ_IEV, Usage.MALE_NAME),
        new Morphic(new RythmicString("Ира", "00"), Ending.ID_IDOV, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Ирин", "09"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Ис", ""), Ending.AJ, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Исак", "9"), Ending.EMPTY_OV_Free_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Исаак", "09"), Ending.EMPTY_OV_Free_I, Usage.MALE_NAME),
        new Morphic(new RythmicString("И", "9"), GrCaseEnding.Y_Free, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Кабан", "0*"), Ending.EMPTY_OV_Acct_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Казак", "0*"), Ending.EMPTY_OV_Acct_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Калашник", "090"), Ending.EMPTY_OV_Free_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Калин", "09"), Ending.A_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Капуст", "09"), Ending.A_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Касьян", "09"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Карин", "09"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Каролин", "009"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Карп", "9"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Кир", "9"), Ending.EMPTY_OV_Free_Ы, Usage.FULL),
        new Morphic(new RythmicString("Кирил", "09"), Ending.L_OV, Usage.MALE_FAM),
        new Morphic(new RythmicString("Кисел", "0*"), GrCaseEnding.SOFT_Acct, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Клавд", "9"), Ending.IJ_IEV, Usage.NAME_ONLY),
        new Morphic(new RythmicString("Княз", "9"), GrCaseEnding.SOFT_Free, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Ковал", "*0"), GrCaseEnding.SOFT_Acct, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Козл", "0"), Ending.EMPTY_OV_Acct_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Колесник", "090"), Ending.EMPTY_OV_Free_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Колоб", "90"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Комар", "0*"), Ending.EMPTY_OV_Acct_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Комиссар", "009"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Кондрат", "09"), Ending.IJ_ЬEV, Usage.FULL),
        new Morphic(new RythmicString("Кондрат", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Коновал", "009"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Конон", "90"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Константин", "009"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Копыл", "90"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Корнил", "09"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Корол", "0*"), GrCaseEnding.SOFT_Acct, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Кост", "9"), GrCaseEnding.Y_Free, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Кот", "9"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Кошел", "90"), GrCaseEnding.SOFT_Free, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Красильник", "090"), Ending.EMPTY_OV_Free_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Крыл", "0"), Ending.EMPTY_OV_Acct_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Крюк", "9"), Ending.EMPTY_OV_Free_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Ксен", "9"), Ending.IJ_IEV, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Кудрявц", "09"), GrCaseEnding.SOFT_Free, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Кудряш", "0*"), Ending.EMPTY_OV_Acct_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Кузнец", "0*"), Ending.EMPTY_OV_Acct_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Кузьм", "0"), EndingFull.A_Acct_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Кулаг", "09"), Ending.A_Free_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Кулак", "0*"), Ending.EMPTY_OV_Acct_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Кулик", "0*"), Ending.EMPTY_OV_Acct_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Куприян", "009"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Лаврент", "09"), Ending.IJ_ЬEV, Usage.MALE_FAM,true),
        new Morphic(new RythmicString("Лад", "9"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Лазар", "90"), GrCaseEnding.SOFT_Free, Usage.MALE_FAM),
        new Morphic(new RythmicString("Лап", "9"), Ending.A_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Ларион", "009"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Ларис", "09"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Лебед", "90"), GrCaseEnding.SOFT_Free, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Леонид", "009"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_NAME),
        new Morphic(new RythmicString("Леонт", "09"), Ending.IJ_ЬEV, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Лид", "9"), Ending.IJ_IEV, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Лил", "9"), Ending.IJ_IEV, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Лихач", "0*"), GrCaseEnding.SOFT_Acct, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Лобан", "09"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Логин", "90"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Лук", "0"), Ending.A_Acct_I, Usage.MALE_FAM),
        new Morphic(new RythmicString("Лукьян", "09"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Лытк", "9"), Ending.A_Free_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Люб", "*"), GrCaseEnding.OVЬ, Usage.FEMALE_FAM),
        new Morphic(new RythmicString("Людмил", "09"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("М"), Ending.AJ, Usage.FEMALE_FAM),
        new Morphic(new RythmicString("Макар", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Максим", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Мамонт", "90"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Маргарит", "009"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Марин", "09"), Ending.A_Free_Ы, Usage.FEMALE_FAM),
        new Morphic(new RythmicString("Мар", "0"), Ending.IJ_IN, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Марк", "9"), Ending.EMPTY_OV_Free_I, Usage.MALE_FAM),
        new Morphic(new RythmicString("Мартын", "09"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Марф", "9"), Ending.A_Free_Ы, Usage.FEMALE_NAME,true),
        new Morphic(new RythmicString("Масл", "9"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Матв", "0"), Ending.EJ_EEV, Usage.MALE_FAM),
        new Morphic(new RythmicString("Матрен", "09"), Ending.A_Free_Ы, Usage.FEMALE_NAME,true),
        new Morphic(new RythmicString("Медвед", "09"), GrCaseEnding.SOFT_Free, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Мельник", "90"), Ending.EMPTY_OV_Free_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Меркуш", "90"), GrCaseEnding.SOFT_Free, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Митрофан", "009"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM,true),
        new Morphic(new RythmicString("Мирон", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Мирослав", "009"), Ending.EMPTY_OV_Free_Ы, Usage.NAME_ONLY,true),
        new Morphic(new RythmicString("Миха", "00"), Ending.IL_JLOV, Usage.MALE_FAM),
        new Morphic(new RythmicString("Мих", "0"), Ending.EJ_EEV, Usage.MALE_FAM),
        new Morphic(new RythmicString("Миш", "9"), Ending.A_Free_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Моис", "00"), Ending.EJ_EEV, Usage.MALE_FAM),
        new Morphic(new RythmicString("Молчан", "09"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Мороз", "09"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Мстислав", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_NAME,true),
        new Morphic(new RythmicString("Мурав", "00"), Ending.EJ_ЬEV, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Мух", "9"), Ending.A_Free_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Мясник", "09"), Ending.EMPTY_OV_Free_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Надежд", "09"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Назар", "09"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Наин", "09"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Натал", "09"), Ending.IJ_ЬEV, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Натал", "09"), Ending.IJ_IEV, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Наум", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Некрас", "09"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Нестер", "90"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Никит", "09"), Ending.A_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Никифор", "090"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Никол", "00"), Ending.AJ, Usage.MALE_FAM),
        new Morphic(new RythmicString("Никон", "90"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM,true),
        new Morphic(new RythmicString("Нин", "9"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Новик", "90"), Ending.EMPTY_OV_Free_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Нонн", "9"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Нос", "*"), GrCaseEnding.OK_KOV_Acct, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Нос", "9"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Овчинник", "090"), Ending.EMPTY_OV_Free_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Одинц", "00"), Ending.EMPTY_OV_Acct_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Оксан", "09"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Олег", "09"), Ending.EMPTY_OV_Free_I, Usage.MALE_NAME),
        new Morphic(new RythmicString("Ольг", "9"), Ending.A_Free_I, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Орех", "09"), Ending.EMPTY_OV_Free_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Орл", "0"), Ending.EMPTY_OV_Acct_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Осип", "90"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Пав", "9"), Ending.EL, Usage.MALE_FAM),
        new Morphic(new RythmicString("Пан", "9"), Ending.A_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Пан", "0"), Ending.EMPTY_OV_Acct_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Пантелеймон", "0109"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_NAME,true),
        new Morphic(new RythmicString("Панфил", "09"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Пахом", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM,true),
        new Morphic(new RythmicString("Пелаг", "00"), Ending.EJ_EEV, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Пест", "9"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Петр", "*"), Ending.EMPTY_OV_Acct_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Петух", "0*"), Ending.EMPTY_OV_Acct_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Полин", "09"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Поляк", "0*"), Ending.EMPTY_OV_Acct_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Пономар", "010"), GrCaseEnding.SOFT_Acct, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Поп", "0"), Ending.EMPTY_OV_Acct_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Порфир", "09"), Ending.IJ_ЬEV, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Потап", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Прасков", "09"), Ending.IJ_ЬEV, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Прохор", "90"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Раис", "09"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Регин", "09"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Реп", "9"), Ending.A_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Рог", "9"), Ending.EMPTY_OV_Free_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Родион", "009"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Рож", "*"), GrCaseEnding.OK_KOV_Acct, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Роман", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Ростислав", "009"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_NAME,true),
        new Morphic(new RythmicString("Русак", "00"), Ending.EMPTY_OV_Acct_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Руслан", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Рыбак", "0*"), Ending.EMPTY_OV_Acct_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Ряб", "9"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Рябин", "09"), Ending.A_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Савел", "09"), Ending.IJ_ЬEV, Usage.MALE_FAM),
        new Morphic(new RythmicString("Савв", "9"), Ending.A_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Сазон", "09"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Самойл", "09"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Самсон", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Сафон", "09"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Светлан", "09"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Святослав", "109"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_NAME),
        new Morphic(new RythmicString("Селезн", "00"), GrCaseEnding.SOFT_Acct, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Селиверст", "109"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Семён", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Серафим", "009"), Ending.EMPTY_OV_Free_Ы, Usage.FULL),
        new Morphic(new RythmicString("Серг", "0"), Ending.EJ_EEV, Usage.MALE_FAM),
        new Morphic(new RythmicString("Сидор", "90"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Сил", "9"), Ending.A_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Симон", "90"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Ситник", "90"), Ending.EMPTY_OV_Free_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Смирн", "0"), Ending.EMPTY_OV_Acct_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Снежан", "09"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Собол", "90"), GrCaseEnding.SOFT_Free, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Сокол", "!0"), Ending.EMPTY_OV_Acct_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Солов", "10"), Ending.EJ_ЬEV, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Сорок", "09"), Ending.A_Free_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Соф", "*"), Ending.IJ_IN, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Соф", "*"), Ending.IJ_ЬEV, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Спиридон", "109"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Станислав", "109"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_NAME),
        new Morphic(new RythmicString("Степан", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Степан", "10"), Ending.ID_IDOV, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Стрел", "*"), GrCaseEnding.OK_KOV_Acct, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Суббот", "09"), Ending.A_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Сувор", "09"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Сухан", "09"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Сысо", "09"), GrCaseEnding.SOFT_Free, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Таис", "09"), Ending.IJ_IEV, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Тамар", "09"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Тарас", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Татьян", "09"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Терент", "09"), Ending.IJ_ЬEV, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Тетер", "09"), GrCaseEnding.Y_Free, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Тимоф", "10"), Ending.EJ_EEV, Usage.MALE_FAM),
        new Morphic(new RythmicString("Тит", "0"), Ending.EMPTY_OV_Acct_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Тихон", "90"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Третьяк", "0*"), Ending.EMPTY_OV_Acct_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Трифон", "90"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Трофим", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Тур", "9"), Ending.A_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Тур", "9"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Увар", "09"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Ульян", "09"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Устин", "09"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Фад", "0"), Ending.EJ_EEV, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Фаин", "09"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Феврон", "09"), Ending.IJ_IEV, Usage.NAME_ONLY),
        new Morphic(new RythmicString("Федос", "10"), Ending.EJ_EEV, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Федор", "90"), Ending.EMPTY_OV_Free_Ы, Usage.FULL),
        new Morphic(new RythmicString("Федот", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Фекл", "9"), Ending.A_Free_Ы, Usage.FEMALE_NAME),
        new Morphic(new RythmicString("Филат", "09"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Филип", "09"), GrCaseEnding.P_OV, Usage.MALE_FAM),
        new Morphic(new RythmicString("Фок", "0"), Ending.A_Acct_I, Usage.MALE_FAM),
        new Morphic(new RythmicString("Фом", "0"), EndingFull.A_Acct_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Фомич", "09"), GrCaseEnding.SOFT_Free, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Фрол", "*"), Ending.EMPTY_OV_Acct_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Харитон", "109"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_FAM),
        new Morphic(new RythmicString("Хох", "*"), GrCaseEnding.OL_LOV_Acct, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Христофор", "109"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_NAME),
        new Morphic(new RythmicString("Цветк", "0"), Ending.EMPTY_OV_Acct_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Черн", "0"), Ending.EMPTY_OV_Acct_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Шарап", "09"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Шар", "*"), Ending.EMPTY_OV_Acct_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Шашк", "0"), Ending.EMPTY_OV_Acct_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Шестак", "0*"), Ending.EMPTY_OV_Acct_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Шил", "9"), Ending.EMPTY_OV_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Шир", "0"), GrCaseEnding.YJ, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Широк", "09"), Ending.EMPTY_OV_Free_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Шуб", "9"), Ending.A_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Щербак", "!*"), Ending.EMPTY_OV_Acct_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Щук", ""), Ending.A_Free_I, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Эдуард", "109"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_NAME),
        new Morphic(new RythmicString("Эраст", "09"), Ending.EMPTY_OV_Free_Ы, Usage.MALE_NAME),
        new Morphic(new RythmicString("Юд", "9"), Ending.A_Free_Ы, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Юл", "9"), Ending.IJ_IEV, Usage.NAME_ONLY),
        new Morphic(new RythmicString("Юр", "9"), Ending.IJ_ЬEV, Usage.MALE_NAME),
        new Morphic(new RythmicString("Яков", "90"), GrCaseEnding.EMPTY_LEV, Usage.MALE_FAM),
        new Morphic(new RythmicString("Якуш", "90"), GrCaseEnding.SOFT_Free, Usage.FAM_ONLY),
        new Morphic(new RythmicString("Ян", "9"), Ending.EMPTY_OV_Free_Ы, Usage.NAME_ONLY),
        new Morphic(new RythmicString("Ярослав", "109"), Ending.EMPTY_OV_Free_Ы, Usage.NAME_ONLY)};

}
