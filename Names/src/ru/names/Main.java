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
package ru.names;

import java.util.ArrayList;
import java.util.List;
import ru.names.classes.Morphic;
import ru.names.classes.Person;
import ru.names.classes.enums.Gender;
import ru.names.generator.NameGenerator;

/**
 *
 * @author cergean
 */
public class Main {
    
    public static void main(String[] args) {
        NameGenerator generator = new NameGenerator();
        List<Morphic> morphics = new ArrayList<>();
        //generator.providerStat();
        generator.listFineChildren("Матвей", "Мартынов").stream().
                forEach((person) -> {
                    System.out.println(person);
        }); /* for (int i = 0; i < 10; i++) {
        System.out.println(" random: "+generator.nextPerson());
        System.out.println("   fine: "+generator.nextFinePerson());
        System.out.println("perfect: "+generator.nextPerfectPerson());
        }*/
        
    }
  
}
