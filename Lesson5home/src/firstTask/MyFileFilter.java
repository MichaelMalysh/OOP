package firstTask;

import java.io.File;
import java.io.FileFilter;

public class MyFileFilter implements FileFilter {//������ ��� "����������� ������"
	private String[] arr;

	public MyFileFilter(String... arr) {//
		super();						//������������� � ������������
		this.arr = arr;					//
	}

	private boolean check(String ext) { //
		for (String stringExt : arr) {  //
			if (stringExt.equals(ext)) {//�������� ����� �� ����� ����������
				return true;			//� ������� � ���� ���� �� ������ 
			}							//true, � ��������� ������ false
		}								//
		return false;					//
	}

	@Override
	public boolean accept(File pathname) {						  //	
		int pointIndex = pathname.getName().lastIndexOf(".");	  //
		if (pointIndex == -1) {									  //��������������� ������ ����������. 
			return false;										  //�������� ���������� � ����� � ����������
		}														  //� ���� ��� ���� � �������
		String ext = pathname.getName().substring(pointIndex + 1);//
		return check(ext);										  //
	}															  //

}
