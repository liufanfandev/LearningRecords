package thinking.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class TableCreator {

	public static void main(String[] args) throws Exception{
		if(args.length < 1){
			System.out.println("arguments:annotated classes");
			System.exit(0);
		}
		for (String className : args) {
			Class<?> cl;
				cl = Class.forName(className);
			DBTable dbTable = cl.getAnnotation(DBTable.class);
			if(dbTable == null){
				System.out.println("NO DBTable annotations in class"+className);
				continue;
			}
			String tableName = dbTable.name();
			if(tableName.length() < 1){
				tableName = cl.getName().toUpperCase();
			}
			List<String> columnDefs = new ArrayList<String>();
			for (Field field : cl.getDeclaredFields()) {
				String columnName = null;
				Annotation[] anno = field.getDeclaredAnnotations();
				
			}
			
		}
	}
}
