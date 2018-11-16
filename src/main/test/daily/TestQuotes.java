package daily;

import java.text.MessageFormat;

public class TestQuotes {
	public static final String SERVICE = "resource service show '{'name \"{0}\"'}' '{' \"{1}\" \"{2}\"'}'";
	public static final String SERVICEGROUPADD = "resource group_service add name \"{0}\" member \"{1}\" '{' desc \"{2}\" '}'";
	public static void main(String[] args) {
		Object[] params = {"555","xiao,da","小"};
		String msg= MessageFormat.format(SERVICEGROUPADD, params);
		System.out.println(msg);
	
	}
}
