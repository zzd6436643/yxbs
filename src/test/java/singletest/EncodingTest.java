package singletest;public class EncodingTest {	/**	 * @param args	 */	public static void main(String[] args) {		try {//			byte[] buf1 = {-79,-90,-79,-76};//gbk//			byte[] buf2 = {-27,-82,-99,-24,-76,-99};//utf8//			//			String str1 = new String(buf1,"gbk");//			String str2 = new String(buf1,"utf8");//			String str3 = new String(buf2,"gbk");//			String str4 = new String(buf2,"utf8");//			//			System.out.println(str1);//			System.out.println(str2);//			System.out.println(str3);//			System.out.println(str4);			String str = " 宝贝";			byte[] b1 = str.getBytes("utf8");			byte[] b2 = str.getBytes("gbk");			byte[] b3 = str.getBytes("utf16");			byte[] b4 = str.getBytes("gb2312");			byte[] b5 = str.getBytes("unicode");			System.out.println("utf8");			for (int i=0;i<b1.length;i++) {				System.out.printf("%X ",b1[i]);			}			System.out.println();			System.out.println("gbk");			for (int i=0;i<b2.length;i++) {				System.out.printf("%X ",b2[i]);			}			System.out.println();			System.out.println("utf16");			for (int i=0;i<b3.length;i++) {				System.out.printf("%X ",b3[i]);			}			System.out.println();			System.out.println("gb2312");			for (int i=0;i<b4.length;i++) {				System.out.printf("%X ",b4[i]);			}			System.out.println();			System.out.println("unicode");			for (int i=0;i<b5.length;i++) {				System.out.print(b5[i]+" ");			}		} catch (Exception e) {			e.printStackTrace();		}	}}