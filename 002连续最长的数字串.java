package stringpractice;
import java.util.Scanner;

/*
题目:
读入一个字符串str，输出字符串str中的连续最长的数字串

输入:
个测试输入包含1个测试用例，一个字符串str，长度不超过255。
输出:
在一行内输出str中里连续最长的数字串。

示例
输入
abcd12345ed125ss123456789
输出
123456789
 
*/




public class Main {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		char[] charArray = str.toCharArray();
		
		int maxLength = 0, maxIndex = 0;
		
		int curLength = 0 , curIndex = 0;
		
		for(int i=0 ;i<charArray.length ; i++){
			
			//如果是数字
			if( '0'<= charArray[i] && charArray[i]<= '9'){
				//如果出现第一位数字，记录curIndex，curLength自增
				if(curLength==0){
					curIndex = i;
					curLength++;
				}else{
					//如果不是第一位数字，只增加curLength
					curLength++;
				}
			}
			
			//如果不是数字，则保存最长的length和index
			if(charArray[i]<'0' || charArray[i]>'9' || i==charArray.length-1){
				if(curLength>maxLength){
					maxLength = curLength;
					maxIndex = curIndex;
				}
				//清空curLength
				curLength = 0;
			}
		}
		for(int i=0 ; i<maxLength ;i++){
			System.out.print(charArray[i+maxIndex]);
		}
		System.out.println();
		
	}

}
