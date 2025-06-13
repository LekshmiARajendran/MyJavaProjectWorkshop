package collectionsinjava;

public class EBook extends Book{
    private String downloadUrl;

    public EBook(String title, String author, String downloadUrl) {
        super(title, author);
        this.downloadUrl = downloadUrl;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Download URL: " + downloadUrl);
    }
}
