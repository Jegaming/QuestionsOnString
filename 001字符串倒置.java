package stringpractice;

/*
 题目：
将一句话的单词进行倒置，标点不倒置。比如 I like beijing. 经过函数后变为：beijing. like I

输入：
每个测试输入包含1个测试用例： I like beijing. 输入用例长度不超过100

输出：
依次输出倒置之后的字符串,以空格分割

示例：
输入
I like beijing.
输出
beijing. like I
*/

import java.util.Scanner;
import java.util.Stack;


public class Main {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		//字符串以一个或多个空格分割
		String[] strArray = str.split("\\s+");
		
		Stack<String> strStack = new Stack<>(); 
		for(String s:strArray){
			strStack.push(s);
		}
		
		for(int i=0 ; i<strArray.length ; i++){
			System.out.print(strStack.pop());
			if(i!=strArray.length-1)System.out.print(" ");
		}
		
		
	}

}
