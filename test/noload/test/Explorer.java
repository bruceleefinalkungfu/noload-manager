package noload.test;

import java.io.File;
import java.io.IOException;

import noload.explorer.exception.ExplorerException;
import noload.explorer.index.IndexerUtil;
import noload.file.FileWriterUtil;

public class Explorer {
	public static void main(String[] args) throws IOException, ExplorerException {
		long m = System.currentTimeMillis();
		FileWriterUtil.write
				(IndexerUtil.getAllFiles( "D:\\zin\\videos\\")
						//IndexerUtil.DRIVE_NAME.get(1).getKey())
						, new File("zin.txt"), false
						);
		System.out.println(System.currentTimeMillis()-m);
	}
	
}
