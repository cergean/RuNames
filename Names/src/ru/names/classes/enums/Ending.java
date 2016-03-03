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
    /**
     * Ударное окончание "а", например как в имени Фома.
     */
    A_Acct_Ы(GrCaseEnding.A_Acct_Ы_nom,GrCaseEnding.A_Acct_Ы_gen,GrCaseEnding.A_Acct_Ы_dat,GrCaseEnding.A_Acct_Ы_acc,GrCaseEnding.A_Acct_Ы_abl,GrCaseEnding.A_Acct_Ы_pre),
    /**
     * Ударное окончание "а", например как в имени Лука.
     */
    A_Acct_I(GrCaseEnding.A_Acct_I_nom,GrCaseEnding.A_Acct_I_gen,GrCaseEnding.A_Acct_I_dat,GrCaseEnding.A_Acct_I_acc,GrCaseEnding.A_Acct_I_abl,GrCaseEnding.A_Acct_I_pre),
    /**
     * Безударное окончание "а", например как в имени Никита.
     */
    A_Free_Ы(GrCaseEnding.A_Free_Ы_nom,GrCaseEnding.A_Free_Ы_gen,GrCaseEnding.A_Free_Ы_dat,GrCaseEnding.A_Free_Ы_acc,GrCaseEnding.A_Free_Ы_abl,GrCaseEnding.A_Free_Ы_pre),
    /**
     * Безударное окончание "а", например как в имени Анжелика.
     */
    A_Free_I(GrCaseEnding.A_Free_I_nom,GrCaseEnding.A_Free_I_gen,GrCaseEnding.A_Free_I_dat,GrCaseEnding.A_Free_I_acc,GrCaseEnding.A_Free_I_abl,GrCaseEnding.A_Free_I_pre),
    /**
     * Окончание "ай", например как в имени Николай.
     */
    AJ(GrCaseEnding.AJ_nom,GrCaseEnding.AJ_gen,GrCaseEnding.AJ_dat,GrCaseEnding.AJ_acc,GrCaseEnding.AJ_abl,GrCaseEnding.AJ_pre),
    
    
    
    /**
     * Пустое окончание, например как в имени Александр.
     */
    EMPTY_OV_Free(GrCaseEnding.EMPTY_OV_Free_nom, GrCaseEnding.EMPTY_OV_Free_gen, GrCaseEnding.EMPTY_OV_Free_dat, GrCaseEnding.EMPTY_OV_Free_acc, GrCaseEnding.EMPTY_OV_Free_abl,GrCaseEnding.EMPTY_OV_Free_pre);
    
    private final GrCaseEnding nominative;
    private final GrCaseEnding genitive;
    private final GrCaseEnding dative;
    private final GrCaseEnding accusative;
    private final GrCaseEnding ablative;
    private final GrCaseEnding prepositive;

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
