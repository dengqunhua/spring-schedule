package classloder;

public class Test {

	    
	public static void main(String[] args) {
		long DATACENTER_BIT = 6;//数据中心占用的位数
		long m =-1L << DATACENTER_BIT;
		long n =100>>DATACENTER_BIT;
		long h =100 <<1;
		long i =100/7;
		System.out.println(Long.toBinaryString(-1));
		System.out.println(m+",binary ="+Long.toBinaryString(m));
		System.out.println(n);
		System.out.println(h);
		System.out.println(i);
		System.out.println(100>>3);
		
	}

}
