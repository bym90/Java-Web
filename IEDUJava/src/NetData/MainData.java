package NetData;

import java.io.*;

// ��Ʈ������ ����� Ŭ������ �ݵ�� ����ȭ �Ǿ���Ѵ�.
public class MainData implements Serializable {
	// �� Ŭ���� �ȿ��� �������� �۾��� �ʿ��� �͸� ����Ѵ�.
	public int protocol;
	public String id;
	public String pw;
	public boolean isSuccess;
	// �� Ŭ������ �߽��� �Ǵ� Ŭ������ �� Ŭ�����ȿ� �ٸ� Ŭ������ ���Խ��Ѽ�
	// ������ ����� �� ����ϴ� Ŭ�����̴�.
	public ChatData cData;
	public FileData fData;
}