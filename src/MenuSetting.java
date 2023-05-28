
public class MenuSetting {
    public String view;
    public FileTreeItem currItem;
    private static MenuSetting mSetting=null;
    private MenuSetting()
    {
        view="details";
        currItem=null;
    }

    public static MenuSetting getInstance()
    {
        if(mSetting==null) mSetting =new MenuSetting();
        return mSetting;
    }
}
