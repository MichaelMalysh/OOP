package firstTask;

import java.io.File;
import java.io.FileFilter;

public class MyFileFilter implements FileFilter {//массив для "разширенных файлов"
	private String[] arr;

	public MyFileFilter(String... arr) {//
		super();						//инициализация в конструкторе
		this.arr = arr;					//
	}

	private boolean check(String ext) { //
		for (String stringExt : arr) {  //
			if (stringExt.equals(ext)) {//проверка еслть ли такое расширение
				return true;			//в массиве и если есть то вернем 
			}							//true, в противном случае false
		}								//
		return false;					//
	}

	@Override
	public boolean accept(File pathname) {						  //	
		int pointIndex = pathname.getName().lastIndexOf(".");	  //
		if (pointIndex == -1) {									  //переопредиление метода интерфейса. 
			return false;										  //получаем расширение у файла и сравниваем
		}														  //с теми что есть в массиве
		String ext = pathname.getName().substring(pointIndex + 1);//
		return check(ext);										  //
	}															  //

}
