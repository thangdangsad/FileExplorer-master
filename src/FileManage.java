import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javafx.scene.control.Alert;
import org.apache.commons.io.FileUtils;
public class FileManage {

    public void showNotification(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Thông báo");
        alert.setContentText(message);
        alert.showAndWait();
    }
    public void showError(String errorMessage) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Lỗi");
        alert.setContentText(errorMessage);
        alert.showAndWait();
    }
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
