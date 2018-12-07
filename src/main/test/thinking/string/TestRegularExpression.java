package thinking.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression {

	private static String[] strs = {"abcabcabcdefabc","abc+","(abc)+","(abc){2,}"};
	
	public static void main(String[] args) {
		System.out.println("Input:\""+strs[0]+"\"");
		for (String str : strs) {
			System.out.println("Regular experssion:\""+str+"\"");
			Pattern p = Pattern.compile(str);
			Matcher m = p.matcher(strs[0]);
			while(m.find()){
				System.out.println("Match \""+m.group()+"\"at Positions"+m.start()+"-"+(m.end()-1));
			}
		}
	}
}
