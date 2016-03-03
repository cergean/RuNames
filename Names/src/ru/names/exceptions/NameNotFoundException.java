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
