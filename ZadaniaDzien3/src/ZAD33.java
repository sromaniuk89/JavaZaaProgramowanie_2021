import java.io.File;

public class ZAD33 {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\Sławomir\\Desktop\\SDA\\Nowy program\\Java zaawansowana - programowanie";

        searchForPngJpgFiles(directoryPath);
    }

    private static void searchForPngJpgFiles(String path){
        //utworzenie nowe obiektu File
        File file = new File(path);

        File[] filesPNG=file.listFiles(f->f.getName().endsWith(".png")); //zwroci pliki png
        File[] filesJPG=file.listFiles(f->f.getName().endsWith(".jpg"));    //zwroci pliki jpg
        File[] directory=file.listFiles(f->f.isDirectory()); //zwraca jedynie foldery

        for(File f:filesPNG)
            System.out.println(path+"\\"+f.getName());

        for(File f:filesJPG)
            System.out.println(path+"\\"+f.getName());

        for(File f:directory)
            //rekurencyjnie przeszukujemy pozostałe podkatalogi
            searchForPngJpgFiles(path+"\\"+f.getName());
    }
}
