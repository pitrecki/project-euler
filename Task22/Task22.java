package Task22;

import java.io.*;
import java.util.Arrays;
import java.util.List;

/**
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names,
 * begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value
 * by its alphabetical position in the list to obtain a name score.
 * <p>
 * For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in
 * the list. So, COLIN would obtain a score of 938 × 53 = 49714.
 * <p>
 * What is the total of all the name scores in the file?
 * <p>
 * Created by Pitrecki on 2016-12-02.
 */
public class Task22
{

    private static final String PATH = "P:/#Java nauka/PROJECT EULER/src/names.txt";

    public static void main(String[] args) {
        long starTime = System.currentTimeMillis();
        String readiedData = readFile(PATH);

        List<String> stringList = Arrays.asList(readiedData.replaceFirst("\"", "").split("\",\""));
        stringList.sort(null);
        /*
        Or you can use this
        Collections.sort(stringList);
         */
        char[] asciiTable = asciiTableGenerator();
        long totalSum = solve(stringList, asciiTable);

        long endTime = System.currentTimeMillis();
        System.out.println("Total sum: " + totalSum + "\nTime: " + (endTime - starTime)/1e3 + " s");
        System.out.println(871198282);
    }

    private static String readFile(String path) throws NullPointerException{
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String strLine = bufferedReader.readLine();
            return  strLine;

        } catch(IOException e) {
            e.printStackTrace();
        }
        return  null;
    }

    private static char[] asciiTableGenerator() {
        char[] asciiTable = new char[26];
        for (int i = 0; i < asciiTable.length; i++)
            asciiTable[i] = (char) ('a' + i);

        return asciiTable;

    }

    private static long solve(List<String> list, char[] asciiTable) {
        long fullResult = 0;
        for (int i = 0; i < list.size(); i++) {
            long localSum = 0;
            char[] strCharArray = list.get(i).toLowerCase().toCharArray();
            for (char letter : strCharArray) {
                for (int k = 0; k < asciiTable.length; k++)
                    if (letter == asciiTable[k])
                        localSum += (k +1);

            }
            fullResult += (localSum * (i + 1));
        }

        return fullResult;
    }
}


