package schema.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 * 原型模式
 * */
public class Prototype implements Cloneable,Serializable {
	
	private String proName;
	
	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public Object clone() throws CloneNotSupportedException {
		Prototype prototype =(Prototype) super.clone();
		return prototype;
	}
	
	public Object deepClone() throws IOException, ClassNotFoundException {
		ByteArrayOutputStream arrayOutputStream =new ByteArrayOutputStream();
		ObjectOutputStream ooStream =new ObjectOutputStream(arrayOutputStream);
		ooStream.writeObject(this);
		ByteArrayInputStream byteInputStream =new ByteArrayInputStream(arrayOutputStream.toByteArray());
		ObjectInputStream objectInputStream =new ObjectInputStream(byteInputStream);
		return objectInputStream.readObject();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		Prototype rpPrototype =new Prototype();
		rpPrototype.setProName("ddd");
		Prototype rpPrototype2 =(Prototype) rpPrototype.clone();
		System.out.println(rpPrototype2.getProName());
		Prototype prototype3 =(Prototype) rpPrototype.deepClone();
		System.out.println("deepClone:"+prototype3.getProName());
	}

}
