private String recombine(String[] wordArr) {
	String firstHalf = word1.substring(0, word1.length()/2);
	String secondHalf = word2.substring(word2.length()/2);
	return firstHalf + secondHalf;

}
