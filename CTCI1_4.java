//1.4


//multiple white spaces?
//in place means you can not create a new array

public String replaceSpaces(String s){
	char[] content = s.toCharArray();
	int front = content.length - 1;
	int back  = content.length - 1;
	for(; front >= 0; front--){
		if(content[front]!=' ') break;
	}
	while(back<=0&&front>=0){
		if(content[front]!=' '){
			content[back] = content[front];
			back--;
			front--;
		}else{
			content[back--] = '0';
			content[back--] = '2';
			content[back--] = '%';
			front--;
		}
	}
	return new String(content);
}
///??not same with the answer of book