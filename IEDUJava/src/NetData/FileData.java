package NetData;

import java.io.*;

public class FileData implements Serializable{
	// ���� ���ε�
	public String fileName;
	// ���� �ٿ�ε�
	// ���̸��� ����� �˾ƾ� �Ѵ�.
	public String[] files;
	// ���� ������ ������ �˷��־�� �Ѵ�.
	public byte[] buff;
}