package composite;

public class UseFileSystem {

	public static void main(String[] args) {

		File file1 = new File(1);
		
		File file2 = new File(3);
		
		File file3 = new File(9);
		
		Directory directory1 = new Directory();
		
		Directory directory2 = new Directory();
		
		
		directory1.childs.add(file1);

		directory1.childs.add(file2);
		
		directory2.childs.add(file3);
	
		directory1.childs.add(directory2);
		
		System.out.println(directory1.size());

		System.out.println(directory2.size());
		
		System.out.println(file1.size());
		
		System.out.println(file2.size());
		
		System.out.println(file3.size());
				
	}
	
}
