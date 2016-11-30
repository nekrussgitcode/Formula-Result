package infixToPostFix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FormulaApp {

	public static void main(String[] args) throws IOException {

		/*
		 * Вначале мы из введенных цифр вычистяем постфиксное выражение,  дабы проще было организовать
		 * итоговый алгоритм рассчета. А затем подсчитываем наш постфикс и выводим результат.
		 * Реализовано с помощью своего стэка. 
		 */
		
		
		String input, output;
		int outputRes;
		while (true){
			
			System.out.print("Enter simple formula: ");
			System.out.flush();
			input = getString();
			if(input.equals(""))
				break;
			
			InToPost theTrans = new InToPost(input);
			output = theTrans.doTrans();
			
			System.out.println("PostFix is: "+output+'\n');
			
			PostToRes thePost = new PostToRes(output);
			outputRes = thePost.doParse();
			
			System.out.println("Result is: "+outputRes);
					
		}

	}
	
	public static String getString() throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;		
	}

}
