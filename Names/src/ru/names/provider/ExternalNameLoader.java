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
package ru.names.provider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URI;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.names.classes.enums.GrCaseEnding;
import ru.names.classes.Morphic;
import ru.names.classes.RythmicString;
import ru.names.classes.enums.Usage;
import ru.names.classes.generics.ArrayListRandom;
import ru.names.classes.generics.ListRandom;
import ru.names.exceptions.ExternalDictionaryException;

/**
 *
 * @author cergean
 */
public class ExternalNameLoader {

    private BufferedReader reader;
    private static final String CSVFILE = "names.csv";
    private ListRandom<Morphic> externalNames = new ArrayListRandom<>();

    public ExternalNameLoader() {
        try {
            URL url = ExternalNameLoader.class.getProtectionDomain().
                    getCodeSource().getLocation();
            init(new URI(url.toString() + CSVFILE));
        } catch (Exception ex) {
            Logger.getLogger(ExternalNameLoader.class.getName()).log(
                    Level.SEVERE, null, ex);
            throw new ExternalDictionaryException(
                    "Не удалось получить путь к jar-файлу.", ex);
        }
    }

    public ExternalNameLoader(String filePath) {
        try {
            if (filePath.endsWith("/")) {
                filePath = filePath + CSVFILE;
            }
            init(new URI(filePath));
        } catch (Exception ex) {
            Logger.getLogger(ExternalNameLoader.class.getName()).log(
                    Level.SEVERE, null, ex);
            throw new ExternalDictionaryException(
                    "Не удалось получить путь к внешнему словарю.", ex);
        }
    }

    public ExternalNameLoader(File names) {
        init(names);
    }

    private void init(URI pathToFile) {
        init(new File(pathToFile));
    }

    private void init(File names) {
        String oneLine="";
        try {
            reader = new BufferedReader(new FileReader(names));
            oneLine = reader.readLine();
            while (oneLine != null) {
                String[] oneName = (oneLine + ",,,,,").split(",");
                externalNames.add(new Morphic(new RythmicString(oneName[0],
                        oneName[1]), GrCaseEnding.valueOf(oneName[2]), Usage.valueOf(
                                oneName[3]), Boolean.parseBoolean(oneName[4])));
                oneLine = reader.readLine();
            }
        } catch (Exception ex) {
            Logger.getLogger(ExternalNameLoader.class.getName()).log(
                    Level.SEVERE, null, ex);
            throw new ExternalDictionaryException("Ошибка при чтении файла, строка \"" + oneLine+"\":", ex);
        }
    }

    public ListRandom<Morphic> getExternalNames() {
        return externalNames;
    }
}
