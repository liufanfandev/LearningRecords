package thinking.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public final class Directory {

	public static File[] local(File dir, final String regex){
		return dir.listFiles(new FilenameFilter() {
			private Pattern pattern = Pattern.compile(regex);
			@Override
			public boolean accept(File dir, String name) {
				return pattern.matcher(new File(name).getName()).matches();
			}
		});
	}
	
	public static File[] local(String path,final String regex){
		return local(new File(path),regex);
	}
	
	public static class TreeInfo implements Iterable<File>{

		public List<File> files = new ArrayList<File>();
		public List<File> dirs = new ArrayList<File>();
		
		@Override
		public Iterator<File> iterator() {
			return files.iterator();
		}
		
		void addAll(TreeInfo other){
			files.addAll(other.files);
			files.addAll(other.dirs);
		}
		
		public String toString(){
			return "dirs:"+PPrint.pformat(dirs)+"\n\nfiles:"+PPrint.pformat(files);
		}
	}
	
	static TreeInfo recurseDirs(File startDir,String regex){
		TreeInfo result = new TreeInfo();
		for(File item : startDir.listFiles()){
			if(item.isDirectory()){
				result.dirs.add(item);
				result.addAll(recurseDirs(item, regex));
			}else{
				if(item.getName().matches(regex)){
					result.files.add(item);
				}
			}
		}
		return result;
	}
}



