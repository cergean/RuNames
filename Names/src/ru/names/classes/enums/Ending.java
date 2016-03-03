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
