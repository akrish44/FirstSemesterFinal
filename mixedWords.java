private String[] mixedWords(String[] words) {
	String[] mixed = new String[words.length];
	for (int i=0; i<words.length(); i++) {
		mixed[i] = recombine(words[i], words[i+1]);
		mixed[i+1] = recombine(words[i+1], words[i]);
	}

	return mixed;
}
