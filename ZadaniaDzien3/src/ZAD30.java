import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class ZAD30 {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\Sławomir\\Desktop\\SDA\\Nowy program\\Java zaawansowana - programowanie\\zxc.txt";
        String outputFilePath = "";
        String directoryPath = "";
        String fileName = "";
        String fileNameWithoutExtension = "";
        String fileExtension = "";
        String inputText = "";
        String outputText = "";

        //sami sobie ustalamy co znajdzie sie w tym pliku pierwotnym
        String text = new StringBuilder().append("qwerty").append("\n")
                .append("asdfgh").append("\n")
                .append("zxcvbn").append("\n").toString();

        createFile(inputFilePath, text); //tworzymy plik wejsciowy
        inputText=readFile(inputFilePath); //odczytujemy tekst z pliku wejsciowego

        Path path = Paths.get(inputFilePath); //tworzymy nowa sciezke
        fileName = path.getFileName().toString();//dostajemy sie do nazwy pliku
        directoryPath = path.getParent().toString();//dostajemy sie do sciezki folderu

        //w taki sposob nawet gdy w nazwie pliku wystepuje wiecej niz 1 kropka
        //my i tak odnajdujemy ostatnia, a ona odpowiada za rozszerzenie pliku
        fileExtension = fileName.substring(fileName.lastIndexOf("."));
        fileNameWithoutExtension = fileName.substring(0, fileName.lastIndexOf("."));

        //utworzenie nowej sciezki
        outputFilePath = directoryPath+"\\"+new StringBuilder(fileNameWithoutExtension).reverse().toString()+fileExtension;

        System.out.println(fileNameWithoutExtension);
        System.out.println(fileExtension);
        System.out.println(outputFilePath);

        //odwracanie zawartosci (tekstu) z pliku
        char[] characters = inputText.toCharArray();
        char[] outputChar = new char[characters.length];
        for(int i=0; i<characters.length; i++){
            outputChar[characters.length-i-1]=characters[i];
        }

        outputText = String.copyValueOf(outputChar);
        System.out.println(outputText);

        //tworzymy i zapisujemy do nowego pliku
        createFile(outputFilePath, outputText);
    }

    public static void createFile(String path, String text) {
        //zaczynamy od utworzenia pliku
        try {
            File file = new File(path);
            if (file.createNewFile()) {
                System.out.println("File created"); //gdy plik zostanie utworzony zwrocone zostanie true
            } else {
                System.out.println("File already exists"); //gdy plik nie zostanie utworzony zostanie zwrocone false
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //wstawiamy tekst do utworzonego pliku
        //w nawiasie okraglym wpisujemy zasoby ktore bedziemy uzywac
        //bedzie dzialac to w taki ze te zasoby zostana automatycznie zwolnione zarowno w przypadku powodzenia
        //instrukcji z bloku try jak i niepowodzenia
        try(FileWriter fileWriter = new FileWriter(path)){
            fileWriter.write(text);
            System.out.println("Text written to the file");
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static String readFile(String path){
        String s="";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            //uzywajac metody lines() tworzymy strumien a nastepenie zamieniamy go na stringa
            //w strumieniu tym znajduja sie kolejne wiersze z pliku, wiec laczac je w pojedynczy strumien
            //wstawiamy znaki nowej linii
            s=bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return s;
    }
}
