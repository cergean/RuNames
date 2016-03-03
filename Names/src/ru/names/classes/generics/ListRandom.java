/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.names.classes.generics;

import java.util.List;

/**
 *
 * @author cergean
 * @param <T>
 */
public abstract interface ListRandom<T> extends List<T> {

    public T random();
}
