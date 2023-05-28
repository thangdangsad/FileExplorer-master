import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileManage {
    public void copyFile(File source, File dest) throws IOException {
        FileUtils.copyFile(source, dest);
        showNotification("File copied successfully!");
    }

    public void deleteFile(File file) {
        try {
            Files.delete(file.toPath());
            showNotification("File deleted successfully!");
        } catch (IOException e) {
            showError(e.getMessage());
        }
    }

    public void pasteFile(File source, File dest) throws IOException {
        FileUtils.copyFile(source, dest);
        showNotification("File pasted successfully!");
    }

    public void addFile(File file) throws IOException {
        file.createNewFile();
        showNotification("File added successfully!");
    }

}
