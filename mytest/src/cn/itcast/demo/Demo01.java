package cn.itcast.demo;

public class Demo01 {
	public static void main(String[] args) {
		//双引号声明的字符串,直接保存在常量池中
		String a = "dshld";
		//jdk1.7,执行intern方法时,如果常量池中存在和String对象相同的字符串,则返回常量池中对应字符串的引用.
		System.out.println(a == a.intern());
		//true
		String s = new String("java");
		String s1 = new String("dahaidsfas12");
		//s.intern()是常量池中字符串引用,s是字符串对象引用
		
		System.out.println(s1 == s1.intern());
		System.out.println(s == s.intern());
		//false
	}
}
