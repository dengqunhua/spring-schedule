package classloder;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileClassLoader extends ClassLoader{
	private String rootDir ;
	
	

	public FileClassLoader(String rootDir) {
		super();
		this.rootDir = rootDir;
	}

	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		return super.findClass(name);
	}
	
	 private byte[] getClassData(String className) {
		 String path = classNameToPath(className);
	        try {
	            InputStream ins = new FileInputStream(path);
	            ByteArrayOutputStream baos = new ByteArrayOutputStream();
	            int bufferSize = 4096;
	            byte[] buffer = new byte[bufferSize];
	            int bytesNumRead = 0;
	            // 读取类文件的字节码
	            while ((bytesNumRead = ins.read(buffer)) != -1) {
	                baos.write(buffer, 0, bytesNumRead);
	            }
	            return baos.toByteArray();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return null;
	 }
	
	 private String classNameToPath(String className){
		 return rootDir + File.separatorChar
         + className.replace('.', File.separatorChar) + ".class";
	 }
}