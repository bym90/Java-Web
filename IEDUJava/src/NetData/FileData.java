package NetData;

import java.io.*;

public class FileData implements Serializable{
	// 파일 업로드
	public String fileName;
	// 파일 다운로드
	// 파이르이 목록을 알아야 한다.
	public String[] files;
	// 실제 파일의 내용을 알려주어야 한다.
	public byte[] buff;
}
