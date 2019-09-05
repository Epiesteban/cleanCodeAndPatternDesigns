package composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Directory implements FileSystem{

	List<FileSystem> childs = new ArrayList<FileSystem>();
	
	int size = 0;
	
	public int size() {

		for (FileSystem child : childs) {
			
			size += child.size();
			
		}
		
		return size;
	}
	
}
