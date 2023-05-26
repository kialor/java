package files;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.stream.Collectors;

public class IO {
    public static void main(String[] args){
        List<Integer> inputList1 = readFile("src/files/input1.txt");
        List<Integer> inputList2 = readFile("src/files/input2.txt");

        List<Integer> mergedList = new ArrayList<>(inputList1);
        mergedList.addAll(inputList2);
        writeFile("src/merged.txt", mergedList);
        System.out.println("Merged file created: merged.txt");


        List<Integer> commonList = new ArrayList<>(inputList1);
        commonList.retainAll(inputList2);
        writeFile("src/common.txt", commonList);
        System.out.println("Common file created: common.txt");

    }

    private static List<Integer> readFile(String fileName) {
        List<Integer> list = new ArrayList<>();
        try {
            Path filePath = Path.of(fileName);
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                int number = Integer.parseInt(line);
                list.add(number);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileName);
        } catch (IOException e) {
            System.err.println("Error reading or writing files: " + fileName);
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format in files: " + fileName);
        }
        return list;
    }

    private static void writeFile(String fileName, List<Integer> list) {
        try {
            List<String> stringList = list.stream()
                    .map(Object::toString)
                    .collect(Collectors.toList());
            Path filePath = Path.of(fileName);
            Files.write(filePath, stringList, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + fileName);
        }
    }

}
