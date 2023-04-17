package javaPrograms;

public class palindromeNumber {
	
public static int checkPalindrome(int num) {
	
	int temp=0;
	
	while(num%10>0) {
		temp=temp*10+num%10;
		num=num/10;
	}
	System.out.println(temp);
	return temp;
}

public static void main(String [] args) {
	int checkNum=30043;
	int revVal=checkPalindrome(checkNum);
	String check=(checkNum==revVal)?"True":"False";
	System.out.println("If Palindrome : "+check);
}

}
