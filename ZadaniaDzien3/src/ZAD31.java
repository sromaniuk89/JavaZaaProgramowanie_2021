import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class ZAD31 {
    public static void main(String[] args) {
        Map<String, Long> wordsCount = new HashMap<>();
        Map<String, Long> wordsCountSorted = new HashMap<>();
        String inputFilePath = "C:\\Users\\Sławomir\\Desktop\\SDA\\Nowy program\\Java zaawansowana - programowanie\\pan-tadeusz.txt";
        String outputFilePath = "C:\\Users\\Sławomir\\Desktop\\SDA\\Nowy program\\Java zaawansowana - programowanie\\pan-tadeusz-statistics.txt";
        String inputText = readFile(inputFilePath);
        String outputText = "";

        System.out.println(inputText);

        //rozdzielamy caly tekst na slowa
        //a nastepenie tworzymy stream
        wordsCount = Arrays.asList(inputText.split("[ .,-?–—«*»…!)_(\"\n]")).stream()
                .filter(w->!w.equals(""))
                //.peek(System.out::println) //peek nie konczy strumienia w przeciwienstwie do forEach
                //zamieniamy na mape gdzie wartosc to jest liczba wystapien
                .collect(Collectors.groupingBy(w->w.toLowerCase(), Collectors.counting()));

        //sortowanie mapy po wartosciach z uzyciema strumienia
        //to do
//        wordsCount.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                .limit(50)
//                .forEachOrdered(e->wordsCountSorted.put(e.getKey(), e.getValue()));

        wordsCountSorted=sortMapByValue(wordsCount);

        String horizontalLine = new StringBuilder().append("-------------------------------") //dodajemy linie poziome
                .append(System.lineSeparator()).toString(); //dodanie znaku nowej linii

        //wyswietlenie zawartosci mapy i tworzenie tabeli tekstowej w stringu
        for(Map.Entry<String, Long> entry:wordsCountSorted.entrySet()){
            //System.out.println(entry.getKey()+": "+entry.getValue()); //wyswietlanie


            outputText += horizontalLine; //dodajemy linie poziome
            outputText += new StringBuilder().append("                                     ")
                    .insert(0,"|") //dodanie linii pionowej
                    .insert(1,entry.getKey())
                    .insert(20, "|")
                    .insert(21,entry.getValue())
                    .insert(30, "|")
                    .append(System.lineSeparator()).toString();
        }
        outputText += horizontalLine; //dodajemy linie poziome

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

    private static <K, V extends Comparable<? super V>> Map<K, V> sortMapByValue(Map<K, V> map){
        //zamieniamy mape na liste wpisow
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        //dokonujemy sortowania wpisow porownujac po wartosciach
        //wstawiamy reverseOrder zeby posortowac od najwiekszych do najmniejszych
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        Map<K, V> result = new LinkedHashMap<>(); //tworzymy nowa mape

        for (Map.Entry<K, V> entry: list){
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }
}
