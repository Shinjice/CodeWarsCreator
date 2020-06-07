import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodeWarsFileCreator {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List<String> tokens = new ArrayList<>();

        System.out.println("Enter KataName");
        String mapName = sc.nextLine() + "\\";

        System.out.println("Enter KataURL");
        String websiteKata = "\n//" + sc.nextLine();

        System.out.println("Enter KataCode and close with CTRL+D");
        while (sc.hasNext()) {
            tokens.add(sc.nextLine());
        }

        File theDir = new File("C:\\Users\\Gebruiker\\Desktop\\CodeWars\\8kyu\\" + mapName);
        theDir.mkdir();
        FileWriter myWriter = new FileWriter("C:\\Users\\Gebruiker\\Desktop\\CodeWars\\8kyu\\" + mapName + "Demo.java");
        myWriter.write(  loop(tokens)  + websiteKata);
        myWriter.close();
        System.out.println("File created!");
    }

    public static String loop(List<String> tokens){
        String temp = "";
        for(int i = 0; i < tokens.size(); i++){
            temp += tokens.get(i) + "\n";
        }
        return temp;
    }


}
