import java.io.File;

public class Ex5 {
    private File folderA, folderB;

    public void setFolders(File folderA, File folderB) throws UtilityFileException {

        if (folderA.isDirectory() && folderB.isDirectory() && folderA.exists() && folderB.exists()) {
            this.folderA = folderA;
            this.folderB = folderB;
        } else {
            throw new UtilityFileException();
        }


    }

    public File getFolderA() {
        return folderA;
    }

    public File getFolderB() {
        return folderB;
    }

    public Boolean compare() {

        File[] contentFolderA;
        contentFolderA = folderA.listFiles();

        File[] contentFolderB;
        contentFolderB = folderB.listFiles();

        boolean equals = true;

        if (contentFolderA.length == contentFolderB.length) {
            for (int i = 0; i < contentFolderA.length && equals == true; i++) {
                if (contentFolderA[i].getName().equals(contentFolderB[i].getName()) && contentFolderA[i].length() == contentFolderB[i].length()) {
                    equals = true;
                } else {
                    equals = false;
                }
            }
        } else {
            equals = false;
        }


        return equals;

    }
}
