/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.names.classes.generics;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author cergean
 * @param <T> Class
 */
public class ArrayListRandom<T> extends ArrayList<T> implements ListRandom<T> {
    private final Random rnd = new Random();
    
    @Override
    public T random(){
        if (this!=null && this.size()>0){
            return this.get(rnd.nextInt(this.size()));
        }
        return null;
    }
}
