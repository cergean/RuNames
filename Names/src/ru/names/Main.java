/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.names;

import ru.names.classes.Person;
import ru.names.generator.NameGenerator;

/**
 *
 * @author cergean
 */
public class Main {
    
    public static void main(String[] args) {
        NameGenerator generator = new NameGenerator();
        //generator.providerStat();
        for (Person person: generator.listFineChildren("Матвей", "Мартынов")){
            System.out.println(person);
        }
       /* for (int i = 0; i < 10; i++) {
            System.out.println(" random: "+generator.nextPerson());
            System.out.println("   fine: "+generator.nextFinePerson());
            System.out.println("perfect: "+generator.nextPerfectPerson()); 
        }*/
        
    }
  
}
