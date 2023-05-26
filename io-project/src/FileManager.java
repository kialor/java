import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FileManager {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static Path directoryPath;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter path of directory: ");
        String inputDirectoryPath = scanner.nextLine();

        try {
            directoryPath = Paths.get(inputDirectoryPath);
            if (!Files.exists(directoryPath) || !Files.isDirectory(directoryPath)) {
                System.out.println("Invalid directory path: " + inputDirectoryPath);
                return;
            }

            boolean exit = false;
            while (!exit) {
                System.out.println("Simple File Manager Menu (select 1-8): ");
                System.out.println("1) Display contents of the directory");
                System.out.println("2) Copy a file");
                System.out.println("3) Move a file");
                System.out.println("4) Delete a file");
                System.out.println("5) Search for a file");
                System.out.println("6) Create a directory");
                System.out.println("7) Delete a directory");
                System.out.println("8) Exit menu");

                int input = scanner.nextInt();
                scanner.nextLine();

                switch (input) {
                    case 1 -> displayDirectory();
                    case 2 -> {
                        System.out.println("Enter the source file name:");
                        String sourceFile = scanner.nextLine();
                        System.out.println("Enter the target file name:");
                        String targetFile = scanner.nextLine();
                        copyFile(Paths.get(sourceFile), directoryPath.resolve(targetFile));
                    }
                    case 3 -> {
                        System.out.println("Enter the path of the file to move: ");
                        String sourceFilePath = scanner.nextLine();
                        moveFile(Paths.get(sourceFilePath), directoryPath);
                    }
                    case 4 -> {
                        System.out.println("Enter the file name to delete: ");
                        String fileName = scanner.nextLine();
                        deleteFile(directoryPath.resolve(fileName));
                    }
                    case 5 -> {
                        System.out.println("Search by file name: ");
                        String searchBy = scanner.nextLine();
                        searchForFile(Paths.get(searchBy));
                    }
                    case 6 -> {
                        System.out.println("Enter the directory name to create: ");
                        String directoryName = scanner.nextLine();
                        createDirectory(directoryPath.resolve(directoryName));
                    }
                    case 7 -> deleteDirectory(directoryPath);
                    case 8 -> {
                        exit = true;
                        System.out.println("Exiting the menu.");
                    }
                    default -> System.out.println("Invalid input.");
                }
            }

        } catch (InvalidPathException e) {
            System.out.println("Invalid path: " + e.getMessage());

        }

    }

    public static void displayDirectory() {
        try {
            System.out.println("\nDirectory contents:");
            Files.walk(directoryPath)
                    .filter(Files::isRegularFile)
                    .forEach(file -> {
                        try {
                            BasicFileAttributes attrs = Files.readAttributes(file, BasicFileAttributes.class);
                            String type = attrs.isDirectory() ? "DIR" : "FILE";
                            long size = attrs.size();
                            LocalDateTime lastModified = LocalDateTime.ofInstant(attrs.lastModifiedTime().toInstant(), ZoneOffset.UTC);
                            String formattedLastModified = lastModified.format(formatter);
                            System.out.printf("%-10s %-10d %-20s %s%n", type, size, formattedLastModified, file.getFileName());
                        } catch (IOException e) {
                            System.err.println("Error reading file attributes: " + e.getMessage());
                        }
                    });
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void copyFile(Path sourcePath, Path targetPath) {
        try {
            Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }

    private static void moveFile(Path sourceFilePath, Path targetDirectoryPath) {
        Path sourcePath = directoryPath.resolve(sourceFilePath);
        Path targetPath = directoryPath.resolve(targetDirectoryPath).resolve(sourcePath.getFileName());

        try {
            if (Files.exists(targetPath)) {
                System.err.println("File already exists at the target location.");
                return;
            }
            Files.move(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved successfully.");
        } catch (IOException e) {
            System.err.println("Error moving file: " + e.getMessage());
        }
    }

    private static void deleteFile(Path filePath) {
        Path path = directoryPath.resolve(filePath);

        try {
            Files.delete(path);
            System.out.println("File deleted.");
        } catch (IOException e) {
            System.out.println("Error deleting file: " + e.getMessage());
        }
    }

    private static void searchForFile(Path searchBy) {
        Path directory = directoryPath;

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(directory, searchBy.toString())) {
            System.out.println("\nSearch results:");
            for (Path entry : stream) {
                System.out.println(entry.getFileName());
            }
        } catch (IOException e) {
            System.out.println("Error searching for files: " + e.getMessage());
        }
    }

    private static void createDirectory(Path directoryPath) {

        try {
            Files.createDirectory(directoryPath);
            System.out.println("Directory created.");
        } catch (IOException e) {
            System.out.println("Error creating directory: " + e.getMessage());
        }
    }

    private static void deleteDirectory(Path directoryPath) {

        try {
            Files.delete(directoryPath);
            System.out.println("Directory deleted.");
        } catch (IOException e) {
            System.out.println("Error deleting directory: " + e.getMessage());
        }
    }
}
