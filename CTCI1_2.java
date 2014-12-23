//1.3

//definition of anagram: two words with same character counts.
// whitespace? case sensitive?
//what character set is? ASCII(256)


//first idea: hash table or array to count the number of each character of a string
// first string: character occur, plus one; seconde string: minus one when occur
//compare those number of two arrays
public boolean isPermutation(String s1, String s2){
	if(s1.length() != s2.length()) return false;
	int[] a1 = new int[256];
	for(int i = 0; i < s1.length(); i++){
		int s1c = s1.charAt(i);
		int s2c = s2.charAt(i);
		a1[s1c]++;
		a1[s2c]--;
	}
	for(int i = 0; i < a1.length; i++){
		if(a1[i] != 0) return false;
	}
	return true;
}
//time complexity O(n) . Space O(1);

//second idea: sort string first, and compare each string whether they are equal.
public boolean isPermutation(String s1, String s2){
	if(s1.length()!=s2.length()) return false;
	return Arrays.sort(s1).equals(Arrays.sort(s2));
}
//NOT CLEAR ABOUT COMPLEXITY OF sort() and equals();
//WRONG!! Arrays.sort only sort array not string

public String sort(String s){
	char[] c = s.toCharArray();
	Arrays.sort(c);
	//return c.toString(); WRONG!
	return new String(c);
}

public boolean isPermutation(String s1, String s2){
	if(s1.length() != s2.length()) return false;
	return sort(s1).equals(sort(s2));
}

