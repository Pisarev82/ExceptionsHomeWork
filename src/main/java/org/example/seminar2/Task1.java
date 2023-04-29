package org.example.seminar2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

/*📔 Запишите в файл следующие строки:
Анна=4
Елена=5
Марина=6
Владимир=?
Константин=?
Иван=4
Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив
(либо HashMap, если студенты с ним знакомы). В отдельном методе нужно будет пройти
по структуре данных, если сохранено значение ?, заменить его на соответствующее число.
Если на каком-то месте встречается символ, отличный от числа или ?,
бросить подходящее исключение.Записать в тот же файл данные с замененными символами ?.
*/
public class Task1 {
    String inputText = "Анна=4" +
            "\n" + "Елена=5" +
            "\n" + "Марина=6" +
            "\n" + "Владимир=?" +
            "\n" + "Константин=?" +
            "\n" + "Иван=4" + "\n" + "\n";

    public void run() {
        write(inputText);
        HashMap<String, String> data = readDataFromFile("notes3.txt");
        data = editedData(data);
        write(convertHashMapToString(data));
    }
    private void write (String text){
        try {
            FileWriter writerwriter = new FileWriter("notes3.txt", true);
            writerwriter.write(text);
            writerwriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private HashMap<String, String> readDataFromFile(String fileName) {
       HashMap<String, String> data = new HashMap<String, String>();
        try {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = br.readLine()) != null ) {
            if (line.matches(".*=.*")) {
                String[] parts = line.split("=");
                String name = parts[0];
                String value = parts[1];
                data.put(name, value);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
        System.out.println("ok");
        return data;
    }

    private String convertHashMapToString(HashMap<String, String> data) {
        String result = "";
        for (String value: data.keySet()) {
            result = result + value + "=";
            result = result + data.get(value) + "\n";
        }
        return result;
    }

    private HashMap<String, String> editedData (HashMap<String, String> data) {
        for (String key: data.keySet()) {
            String regex = "\\d";
            if (data.get(key).matches(regex)) {
                continue;
            } else if (data.get(key).matches("\\?")){
                System.out.print(key + "=");
                System.out.println(data.get(key));
                int ansver = key.length();
                String value = "" + ansver;
                data.put(key, value);
            } else {
                System.out.println("fack");
            }
        }
        return data;
    }
}
