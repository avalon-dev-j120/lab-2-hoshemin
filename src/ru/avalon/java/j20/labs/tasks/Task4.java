package ru.avalon.java.j20.labs.tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import ru.avalon.java.j20.labs.Task;

import java.io.IOException;
import java.util.Properties;

/**
 * Задание №4
 *
 * <p>Тема: "Потоковый ввод-вывод. Чтение файлов конфигурации".
 */
public class Task4 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {
        Properties properties = read("src/resources/database.properties");

        /*
         * TODO(Студент): Выполнить задание №4
         *
         * 1. Реализовать метод read.
         *
         * 2. С использованием отладчика проверить корректность работы программы.
         */
    }

    /**
     * Выполняет чтение файла конфигураций описанного
     * параметром {@code path}.
     *
     * @param path путь к конфигурации
     * @return новый экземпляр типа {@link Properties}
     */
    private Properties read(String path) {

        try {
            Properties properties = new Properties();

            try(FileReader reader = new FileReader(new File(path))){
                properties.load(reader);
                return properties;
            }
        }

        catch (IOException e) {

            System.err.println("Файл не найден");
        }

        return null;
    }
        //throw new UnsupportedOperationException("Not implement yet!");
    
}
