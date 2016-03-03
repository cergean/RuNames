/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.names.provider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URI;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.names.classes.enums.Ending;
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
            URL url = ExternalNameLoader.class.getProtectionDomain().getCodeSource().getLocation();
            init(new URI(url.toString() + CSVFILE));
        } catch (Exception ex) {
            Logger.getLogger(ExternalNameLoader.class.getName()).log(Level.SEVERE, null, ex);
            throw new ExternalDictionaryException("Не удалось получить путь к jar-файлу.", ex);
        }
    }

    public ExternalNameLoader(String filePath) {
        try {
            if (filePath.endsWith("/")) {
                filePath = filePath + CSVFILE;
            }
            init(new URI(filePath));
        } catch (Exception ex) {
            Logger.getLogger(ExternalNameLoader.class.getName()).log(Level.SEVERE, null, ex);
            throw new ExternalDictionaryException("Не удалось получить путь к внешнему словарю.", ex);
        }
    }

    public ExternalNameLoader(File names) {
        init(names);
    }

    private void init(URI pathToFile) {
        init(new File(pathToFile));
    }

    private void init(File names) {
        try {
            reader = new BufferedReader(new FileReader(names));
            for (String oneLine; (oneLine = reader.readLine()) != null;) {
                String[] oneName = (oneLine+",,,,,").split(",");
                externalNames.add(new Morphic(new RythmicString(oneName[0], oneName[1]), Ending.valueOf(oneName[2]), Usage.valueOf(oneName[3]),Boolean.parseBoolean(oneName[4])));
            }
        } catch (Exception ex) {
            Logger.getLogger(ExternalNameLoader.class.getName()).log(Level.SEVERE, null, ex);
            throw new ExternalDictionaryException("Ошибка при чтении файла.", ex);
        }
    }

    public ListRandom<Morphic> getExternalNames() {
        return externalNames;
    }
}
