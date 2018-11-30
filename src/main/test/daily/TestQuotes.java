package daily;

import java.text.MessageFormat;

public class TestQuotes {
	public static final String SERVICE = "resource service show '{'name \"{0}\"'}' '{' \"{1}\" \"{2}\"'}'";
	public static final String SERVICEGROUPADD = "resource group_service add name \"{0}\" member \"{1}\" '{' desc \"{2}\" '}'";
	public static final String ITEM = "add item name  ''{0}'' '{' value ''{1}'' '}' ";
	public static final String DELETEADDRESSGROUP = "resource group_addr delete { name ''{0}'' }";
	public static final String INTERAUTONEG = "network interface autoneg  [''{0}'']";
	
	public static void main(String[] args) {
		Object[] params = {"555"};
		String msg= MessageFormat.format(INTERAUTONEG, params);
		System.out.println(msg);
	
	}
}
