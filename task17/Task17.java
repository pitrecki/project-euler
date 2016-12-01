package task17;


//      If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
//
//        If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
//
//        NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (
//          one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.


/**
 * Created by Pitrecki on 2016-10-03.
 */
public class Task17
{
    private final static String[] NUMBERS_NAME = {
            "Zero", "One", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN",
            "TWENTY", "THIRTY", "FORTY", "FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINETY", "HUNDRED", "THOUSAND"
    };

    private final static int NUMB_OF_ITERATION = 1000;
    private final static String AND = "AND";

    public static void main(String[] args) {
        int letterAmount = 0;
        String s;
        String tmp = "";
        for (int i = 1; i <= NUMB_OF_ITERATION; i++) {
            s = String.valueOf(i);
            if (i < 21)
                letterAmount += NUMBERS_NAME[i].length();
            else if (i > 20 && i < 100) {
                int val = Character.getNumericValue(s.charAt(0)) - 3;
                if (Character.getNumericValue(s.charAt(1)) == 0) {
                    tmp = NUMBERS_NAME[21 + val];
                }
                else {
                    tmp = NUMBERS_NAME[21 + val] + NUMBERS_NAME[Character.getNumericValue(s.charAt(1))];
                }

            }
            else if (i > 99 && i < 1000) {
                int val = Integer.parseInt(s.substring(0, 1));
                if (Integer.parseInt(s.substring(1,3)) <= 20)
                    if (s.contains("00"))
                        tmp = NUMBERS_NAME[val] + NUMBERS_NAME[28];
                    else
                        tmp = NUMBERS_NAME[val] + NUMBERS_NAME[28] + AND + NUMBERS_NAME[Integer.parseInt(s.substring(1,3))];

                else if (Integer.parseInt(s.substring(1,3)) > 20) {
                    int sval = Character.getNumericValue(s.charAt(1)) - 3;
                    if (s.contains("0"))
                        tmp = NUMBERS_NAME[val] + NUMBERS_NAME[28] + AND + NUMBERS_NAME[21 + sval];
                    else {
                        tmp = NUMBERS_NAME[val] + NUMBERS_NAME[28] + AND + NUMBERS_NAME[21 + sval] + NUMBERS_NAME[Character.getNumericValue(s.charAt(2))];
                    }

                }
            }
            else if (i > 999)
                tmp = NUMBERS_NAME[1] + NUMBERS_NAME[29];

            letterAmount += tmp.length();
        }

        System.out.println("Liczba liter: " + letterAmount);
    }


}
