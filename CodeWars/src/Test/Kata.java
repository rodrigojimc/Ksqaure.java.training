package Test;

public class Kata {
	
	private final static int a = 'a';
	
	public static String high(String s) {
		
	    String[] words = s.split(" ", 0);
	    String high = "";
	    
	    int maxScore = 0;
	    int wordScore;
	    
	    for(String word : words) {
	    	
	    	wordScore = score(word);
	    	
	    	if(wordScore > maxScore) {
	    		maxScore = wordScore;
	    		high = word;
	    	}
	    	
	    }
	    
	    return high;
	}
	
	  public static int score(String word){
	    int score = 0;
	    for(int i=0 ; i < word.length(); i++) {
	    	int value = word.charAt(i) - a+1; // "-a+1" is only needed to match the scoring system
	    	score += value; 
	    }
	    return score;
	  }
	  
}
