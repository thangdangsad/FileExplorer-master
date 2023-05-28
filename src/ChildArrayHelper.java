import javafx.collections.ObservableList;


public class ChildArrayHelper {
    public static ObservableList<FileTreeItem> getChildren(FileTreeItem item)
    {
        if(item.getAbsolutePath().equals(Controller.hostName))return Controller.drives;
        return item.childrenArray;
    }
}
