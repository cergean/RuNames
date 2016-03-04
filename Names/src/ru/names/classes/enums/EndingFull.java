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
public enum EndingFull {
    
    /**
     * Ударное окончание "а", например как в имени Фома.
     */
    A_Acct_Ы("A_Acct_Ы");
    
    private final Ending single;
    private final Ending plural;

    private EndingFull(String name) {
        this(Ending.valueOf(name+"_s"), Ending.valueOf(name+"_p")); 
    }

    private EndingFull(Ending single, Ending plural) {
        this.single = single;
        this.plural = plural;
    }

    public Ending getSingle() {
        return single;
    }

    public Ending getPlural() {
        return plural;
    }
    
}
