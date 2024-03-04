public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     *
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number) {
        String[] sep = sentence.split(" ");
        String x = "Number = " + number + " is out Of Bound";
        if (number > 0 && number <= sep.length)
            return sep[number - 1];
        else
            return x;
    }


    /**
     * Goal : Basic introduction to Strings & using foreach
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
    public int oddEvenCounter(String number, boolean searchForEven) {
        int c = 0;
        if(searchForEven) {
            String numberString = String.valueOf(number);
            for (int i = 0 ; i < numberString.length() ; i++) {
                int digit = Character.getNumericValue(numberString.charAt(i));
                if (digit % 2 == 0) {
                    c++;
                }
            }
            return c;
        }else{
            String numberString = String.valueOf(number);
            for (int i = 0 ; i < numberString.length() ; i++) {
                int digit = Character.getNumericValue(numberString.charAt(i));
                if (digit % 2 == 1) {
                    c++;
                }
            }
            return c;
        }
    }

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public String firstWord(String wordA, String wordB) {
         String wordALower = wordA.toLowerCase();
         String wordBLower = wordB.toLowerCase();
         if (wordALower . compareTo(wordBLower) < 0){
             return wordA;
         }else if (wordBLower . compareTo(wordALower) < 0){
             return wordB ;
         } else {
             return "Both words are equal.";
         }
    }
}
