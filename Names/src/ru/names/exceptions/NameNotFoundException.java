/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.names.exceptions;

/**
 *
 * @author cergean
 */
public class NameNotFoundException extends RuntimeException {

    public NameNotFoundException(String errorSource) {
        super("В словаре не удалось найти " + errorSource +".");
    }

    public NameNotFoundException(String errorSource, String message) {
        super("В словаре не удалось найти " + errorSource +". "+message);
    }

    public NameNotFoundException(String errorSource, String message, Throwable cause) {
        super("В словаре не удалось найти " + errorSource +". "+message, cause);
    }

    public NameNotFoundException(String errorSource, Throwable cause) {
        super("В словаре не удалось найти " + errorSource +". ",cause);
    }
    
}
