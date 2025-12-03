package TMSlesson14_h;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        File fileRomeo = new File("C:\\Users\\XE\\IdeaProjects\\TMSlessons\\src\\TMSlesson14_h\\roman.txt");
        File longestWordFile = new File("C:\\Users\\XE\\IdeaProjects\\TMSlessons\\src\\TMSlesson14_h\\LongestWord.txt");
        getWord(fileRomeo, longestWordFile);
    }

    public static void getWord(File inputFile, File outputFile) {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(" ");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
            return;
        }

        String[] stringWords = content.toString().split("[^a-zA-Zа-яА-ЯёЁ-]+");

        String longestWord = "";
        int maxLength = 0;

        for (String word : stringWords) {

            if (word != null && !word.trim().isEmpty() && !word.matches("^-+$")) {

                String cleanWord = word.replaceAll("^-+|-$", "");

                if (cleanWord.length() > maxLength) {
                    maxLength = cleanWord.length();
                    longestWord = cleanWord;
                }
            }
        }

        if (longestWord.isEmpty()) {
            System.out.println("В файле не найдено слов");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write(longestWord);
        } catch (IOException e) {
            System.out.println("Ошибка при записи файла: " + e.getMessage());
        }

        System.out.println("Самое длинное слово в файле " + inputFile.getName() + ": \"" + longestWord + "\" (длина: " + longestWord.length() + " символов)");
    }
}