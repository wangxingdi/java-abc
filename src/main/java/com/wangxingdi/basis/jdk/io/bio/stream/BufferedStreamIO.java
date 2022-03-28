package com.wangxingdi.basis.jdk.io.bio.stream;

import java.io.*;
import java.util.Date;

/**
 * 
 * @author wangxd
 */
public class BufferedStreamIO {
	
	public static void main(String[] args) {
		String inFile = "src/main/java/com/youyanpai/jdk/io/bio/stream/BufferedStreamIO.java";
		String outFile = "src/main/java/com/youyanpai/jdk/io/bio/stream/BufferedStreamIOCopy.txt";
		try(InputStream is = new FileInputStream(inFile);
				OutputStream os = new FileOutputStream(outFile);
				BufferedInputStream bis = new BufferedInputStream(is);
				BufferedOutputStream bos = new BufferedOutputStream(os)){
			byte[] bytes = new byte[16];
			int i = -1;
			while((i=bis.read(bytes, 0, bytes.length)) != -1){
				System.out.println("本次buffer读取的数据长度:"+i);
				bos.write(bytes, 0, i);
			}
			bos.write(("当前系统时间:"+new Date().toString()).getBytes());
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("===读写结束===");
	}

}
