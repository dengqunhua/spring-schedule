package dubbo;

import java.util.Set;

import com.alibaba.dubbo.common.extension.ExtensionLoader;


public class Test {

	public static void main(String[] args){
		ExtensionLoader<Robot> extensionLoader = 
	            ExtensionLoader.getExtensionLoader(Robot.class);
		 Set<String> sets =extensionLoader.getLoadedExtensions();
	        Robot optimusPrime = extensionLoader.getExtension("animal");
	        optimusPrime.say("33");
	       
	}
}
