package me.ibeyond.decorator_pattern;

import java.io.File;
import java.util.ArrayList;

/**
 * @author Share 2017.9.10
 */
public class Application {
	/*
	 * 装饰模式(包装器，扩展)：Component ConcreteComponent Decorator ConcreteDecotator
	 * 内容：一些客户想要读取句子的时候也会得到翻译已有ReadWord.java和ReadEnglishWord.java不允许修改现有系统的代码进行扩展
	 */
	public static void main(String[] args) {
		File file = new File("D:\\Workspaces\\MyEclipse 10\\DesignPatterns\\src\\me\\ibeyond\\decorator_pattern\\article.txt");
		File file2 = new File("D:\\Workspaces\\MyEclipse 10\\DesignPatterns\\src\\me\\ibeyond\\decorator_pattern\\article2.txt");
		ReadWord rw = new ReadEnglishWord();
		Decorator rw1 = new WordDecorator(rw, file2);
		ArrayList<String> wordList = rw1.readWord(file);
		for(String s : wordList)
			System.out.println(s);
		
		
		
	}

}
