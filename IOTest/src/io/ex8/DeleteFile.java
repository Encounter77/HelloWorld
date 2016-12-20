package io.ex8;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
		File f = new File("deleted.txt");
		f.delete();
	}
}
