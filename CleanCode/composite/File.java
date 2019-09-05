package composite;

public class File implements FileSystem{
	
	public int size;
	
	public File(int size) {
		
		this.size = size;
		
	}

	public int size() {

		return size;
		
	}

}
