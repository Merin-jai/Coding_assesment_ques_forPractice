
public class solutions {
    public String answerString(String word, int numFriends) {
        int len = word.length();
        // Calculate the length of the substring to be considered
        int subLen = len - numFriends + 1;

        // Check if the calculated length is valid
        if (subLen <= 0 || subLen > len) {
            return ""; // Return empty string if the length is invalid
        }

        // If the substring length is equal to the word length, return the whole word
        if (subLen == len) {
            return word;
        }

        // Find the lexicographically largest substring of size subLen
        String lex = word.substring(0, subLen);
        return lex; 
    }
}
