package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Задание №2
 *
 * <p>Тема: "Потоковый ввод-вывод. Чтение и запись данных
 * в текстовом режиме".
 */
public class Task2 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {
        File input = new File("in_task2");
        File output = new File("out_task2");
        String text = read(input);
        write(output, text);

        /*
         * TODO(Студент): Выполнить задание №2
         *
         * 1. Реализовать метод read.
         *
         *    При чтении файла следует пользоваться типами данных:
         *    Reader, FileReader.
         *
         *    Для сохранения прочитанных данных следует пользоваться
         *    классом StringBuilder.
         *
         * 2. Реализовать метод write.
         *
         *    При реализации метода следует пользоваться типами данных:
         *    Writer и FileWriter.
         *
         * 3. С использованием отладчика проверить корректность работы программы.
         */
    }

    /**
     * Выполняет чтение указанного файла в текстовом режиме.
     *
     * <p>Весь текст файла возвращается в виде одного
     * экземпляра типа {@link String}.
     *
     * @param file файл
     * @return содержимое файла в виде текста.
     * @throws IOException в случае ошибок ввода-вывода.
     */
    private String read(File file) throws IOException {
        StringBuilder strbuilder;
        try (FileReader reader = new FileReader(file)) {
            strbuilder = new StringBuilder();
            char[] buffer = new char[1000];
            int len;
            while ((len = reader.read(buffer)) != -1) {
                strbuilder.append(new String(buffer, 0, len));
            }
        }
            return strbuilder.toString();
        //throw new UnsupportedOperationException("Not implement yet!");
        

    }

    /**
     * Выполняет запись текстоых данных в файл в текстовом
     * режиме.
     *
     * @param file файл
     * @param text текст
     * @throws IOException в случае ошибок ввода-вывода.
     */
    private void write(File file, String text) throws IOException {
        FileWriter writer = new FileWriter(file);
        writer.write(text);
        //throw new UnsupportedOperationException("Not implemented yet!");
    }
}
