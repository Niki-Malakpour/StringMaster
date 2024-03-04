import java.util.Objects;

public class Advanced {

    /**
     * Goal : Changing a Sentence Content

     * In this function, you have a sentence, a word & a newWord as Entry
     * You have to search the sentence to find the word that you were given as input and change it with the newWord

     */
    public String wordCensor(String sentence, String word, String newWord){
        String[] words = sentence.split(" ");
        StringBuilder x = new StringBuilder();
        for(String w : words){
            if(w.equals(words)) {
                x.append(newWord).append(" ");
            }else {
                x.append(w).append(" ");
            }
        }
        return x.toString().trim();
    }

    /**
     * In this function You have a firstName and a lastName as Entry and you have to normalize them as a fullName
     * @param firstName is a first name with irregular letters (example : hARry)
     * @param lastName is a last name with irregular letters (example : pOtTeR)
     * @return fullName is a normal full name that just the first letter of firstName & lastName is Capitalized (example : Harry Potter)
     */
    public String normalizingName(String firstName, String lastName){
        String normalizedFirstName = firstName.substring(0, 1).toUpperCase()+firstName.substring(1).toLowerCase();
        String normalizedLastName = lastName.substring(0, 1).toUpperCase()+lastName.substring(1).toLowerCase();
        if (normalizedLastName.isBlank()){
            return normalizedFirstName;
        }else{
            return normalizedFirstName+ " " + normalizedLastName ;
        }
    }
    /**
     * Removing repeated letter in a word
     * @param word This input could have Consecutive repeated letters or not
     * @return if word contains Consecutive repeated letters, one of the repeated letters should be omitted
     */
    public String doubleChar(String word) {
        StringBuilder x=new StringBuilder();
        for ( int i=0 ; i<word.length() ; i++){
            if ((i< word.length()-1) && (word.charAt(i+1)== word.charAt(i))){
                continue;
            }
            x.append(word.charAt(i));
        }
        return x.toString();
    }
}

