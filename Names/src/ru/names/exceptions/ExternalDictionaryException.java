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
public class ExternalDictionaryException extends RuntimeException {

    public ExternalDictionaryException(String message, Throwable cause) {
        super("Ошибка подключения внешнего словаря: "+message, cause);
    }
}
