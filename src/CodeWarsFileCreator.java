import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodeWarsFileCreator {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List<String> multiLine = new ArrayList<>();

        System.out.println("Enter KataName");
        String mapName = sc.nextLine().replace("/","")
                                    .replace("\\","")
                                    .replace(":","")
                                    .replace("?","")
                                    .replace("\"","")
                                    .replace("<","")
                                    .replace(">","")
                                    .replace("|","")
                                    .replace("*","") + "\\";

        System.out.println("Enter KataURL");
        String websiteKata = "\n//" + sc.nextLine();

        System.out.println("Enter KataCode and close with CTRL+D");
        while (sc.hasNext()) {
            multiLine.add(sc.nextLine());
        }

        File theDir = new File("C:\\Users\\Gebruiker\\Desktop\\CodeWars\\8kyu\\" + mapName);
        theDir.mkdir();
        FileWriter myWriter = new FileWriter("C:\\Users\\Gebruiker\\Desktop\\CodeWars\\8kyu\\" + mapName + "Demo.java");
        myWriter.write(  loop(multiLine)  + websiteKata);
        myWriter.close();
        System.out.println("File created!");

    }
    public static String loop(List<String> multiLine){
        String temp = "";
        for(int i = 0; i < multiLine.size(); i++){
            temp += multiLine.get(i) + "\n";
        }
        return temp;
    }
}
