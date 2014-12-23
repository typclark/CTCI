public boolean isUnique(String s){
	char[] array = new char[256];
	char[] sarray = s.toCharArray();
	for(char c : sarray){
		if(array[c] = 1) return false;
		else array[c] = 1;
	}
	return true;
}
//time complexity O(n) space complexity O(n)

//improvement
public boolean isUnique(String s){
	booean code = new boolean[256];
	for(int i = 0; i < s.length(); i++){
		char c = s.charAt(i);
		if(code[c]) return false;
		else code[c] = true;
	}
	return true;
}

//time complexity O(n) space complexity O(1)
public boolean isUnique(String s){
	if(s.length()>256) return false;
	boolean code = new boolean[256];
	for(int i = 0; i < s.length(); i++){
		int c = s.charAt(i);
		if(code[i]) return false;
		else code[i] = true;
	}
	return true;
}