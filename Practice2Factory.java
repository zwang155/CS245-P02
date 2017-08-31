package edu.usfca.cs.cs245;

public class Practice2Factory {
	
	public Practice2Search getSearch(String searchtype) {
		if (searchtype.contains("linear"))
			return new LinearSearch();
		else if (searchtype.contains("binary") && searchtype.contains("binrecursive"))
			return new BinaryRecursiveSearch();
		else if (searchtype.contains("binary") && searchtype.contains("biniterative"))
			return new BinaryIterativeSearch();
		return null;
	}

}
