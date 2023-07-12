import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) throws IOException {
   /*     writeMethod();
        readMethod();

    }

    public static void writeMethod() throws IOException {
        FileWriter fileWriter = new FileWriter("fairy tale.txt");
        fileWriter.write("Create file... \n");
        fileWriter.write("Welcome to the world of fairy tales. Here you will find the best selection of fairy tales list,\n" +
                " that will enchant the young minds with positivity of the most popular fairy tales. \n" +
                "These fables and fairy tale characters have been collected from different cultures,\n" +
                " and you will always find something new for the kids,including the ubiquitous king,\n" +
                " prince and princess fairy tales. So, just scroll down and enjoy these English fairy tales. Happy Reading!");
        fileWriter.close();
    }

    public static void readMethod() throws IOException {
        FileReader fileReader = new FileReader("fairy tale.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
            fileReader.close();
        }*/

       method();

    }
    public static void method() throws IOException {
       FileWriter fileWriter =new FileWriter("Alfavit.txt");
       FileReader fileReader =new FileReader("Alfavit.txt");
       fileWriter.write("Aa Bb Cc Dd Ee Ff Gg Hh Ii Jj Kk Ll Mm Nn Oo Pp Qq Rr Ss Tt Uu Vv Ww Xx Yy Zz \n");
       fileWriter.write("1 2 3 4 5 6 7 8 9");
       fileWriter.close();
       Scanner scanner = new Scanner(fileReader);
       while (scanner.hasNextLine()){
           System.out.println(scanner.nextLine());
           fileReader.close();
       }


    }
}

