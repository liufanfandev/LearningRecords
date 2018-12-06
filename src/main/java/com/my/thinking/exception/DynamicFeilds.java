package com.my.thinking.exception;

public class DynamicFeilds {

	private Object[][] fields;
	
	public DynamicFeilds(int initialSize){
		fields = new Object[initialSize][2];
		for (int i = 0; i < initialSize; i++) {
			fields[i] = new Object[]{null,null};
		}
	}
	
	public String toString(){
		StringBuilder  result = new StringBuilder();
		for (Object[] objects : fields) {
			result.append(objects[0]);
			result.append(": ");
			result.append(objects[1]);
			result.append("\n");
		}
		return result.toString();
	}
	
	private int hasField(String id){
		for (int i = 0; i < fields.length; i++) {
			if(id.equals(fields[i][0])){
				return i;
			}
		}
		return -1;
	}
	
	private int getFieldNumber(String id) throws NoSuchFieldException{
		
		int fieldNum = hasField(id);
		if(fieldNum == -1){
			throw new NoSuchFieldException();
		}
		return fieldNum;
	}
	
	private int makeField(String id){
		for (int i = 0; i < fields.length; i++) {
			if(fields[i][0] == null){
				fields[i][0] = id;
				return i;
			}
		}
		Object[][] tmp = new Object[fields.length+1][2];
		for (int i = 0; i < fields.length; i++) {
			tmp[i] = fields[i];
		}
		for (int i = fields.length; i < tmp.length; i++) {
			tmp[i] = new Object[]{null,null};
		}
		fields = tmp;
		return makeField(id);
	}
	
	public Object getField(String id) throws NoSuchFieldException{
		return fields[getFieldNumber(id)][1];
	}
	
	public Object setField(String id,Object value) throws DynamicFeildsException{
		
		if(value == null){
			DynamicFeildsException dfe = new DynamicFeildsException();
			dfe.initCause(new NullPointerException());
			throw dfe;
		}
		int fieldNumber = hasField(id);
		if(fieldNumber == -1){
			fieldNumber = makeField(id);
		}
		Object result = null;
		try {
			result = getField(id);
		} catch (NoSuchFieldException e) {
			throw new RuntimeException(e);
		}
		fields[fieldNumber][1] = value;
		return result;
	}
	
	public static void main(String[] args) {
		DynamicFeilds df = new DynamicFeilds(3);
		System.out.println(df);
		try {
			df.setField("d", "A value for d");
			df.setField("number", 47);
			df.setField("number2", 48);
			System.out.println(df);
			df.setField("d", "A new value for d");
			df.setField("number3", 11);
			System.out.println(df);
			System.out.println("df.getField(\"d\")"+df.getField("d"));
			Object field = df.setField("d", null);
			
		} catch (DynamicFeildsException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
	}
	
	
}
class DynamicFeildsException extends Exception{}
