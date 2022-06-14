package advance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class MainApp {

	public static void main(String[] args) throws IOException {
		List<String> tokenList = new ArrayList<String>();		
		countTokens(tokenList);
		typeTokens(tokenList);
		maxTokens(tokenList);
	}
	
	public static void countTokens(List<String> tokenList) throws IOException {		
		String line;
		StringTokenizer myTokens;
		String url = "F:\\Eclipse\\Stringtokenize\\in.txt";
		File file = new File(url);
		BufferedReader br = new BufferedReader(new FileReader(file));
				
		while((line = br.readLine()) != null){
			myTokens = new StringTokenizer(line);
			System.out.println("Tong so tu trong file: " + myTokens.countTokens());
			while (myTokens.hasMoreTokens()) {
				tokenList.add(myTokens.nextToken());
			}
			System.out.println(tokenList);       	
		}
		br.close();
	}
	
	public static void typeTokens(List<String> tokenList) {
		int so = 0,  phuAm = 0, nguyenAm = 0;
		
		for (String token : tokenList) {
			try {
				Integer.parseInt(token);
				so++;
			} catch (Exception e) {
				String lowerCase = token.toLowerCase();
				char a = lowerCase.charAt(0);
				int b = a;
				switch (b) {
				case 97, 101, 105, 111, 117:
					nguyenAm++;
				default:
					phuAm++;
				}
			}
		}
		
		System.out.format("So trong doan van: %d", so).println();
		System.out.format("So tu bat dau bang nguyen am: %d", nguyenAm).println();
		System.out.format("So tu bat dau bang phu am: %d", phuAm).println();
	}
	
	public static void maxTokens(List<String> tokenList) {
		int max = 0;
		String maxWord = null;
		String[] array = new String[tokenList.size()];
		array = tokenList.toArray(array);
		List<String> asList = Arrays.asList(array);
		Set<String> mySet = new HashSet<String>(asList);
		
		for(String s: mySet){
			 if(Collections.frequency(asList,s) > max) {
				 max = Collections.frequency(asList,s);
				 maxWord = s;
			 }			 
			}
		
		System.out.println("Tu xuat hien nhieu nhat trong doan van: " + maxWord);
	}
}