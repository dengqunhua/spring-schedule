package classloder;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ClassLoaderTest {

	public static void main(String[] args) {
		
		  String rootDir="D:\\tools\\workplaces\\shedule\\spring-schedule\\src\\main\\java\\classloder";
	        //创建自定义文件类加载器
	        FileClassLoader loader = new FileClassLoader(rootDir);

	        try {
	            //加载指定的class文件
	            Class<?> object1=loader.loadClass("classloder.FileClassLoader");
	            System.out.println(object1.newInstance().toString());

	            //输出结果:I am DemoObj
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

}

}

