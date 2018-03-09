package me.ibeyond.decorator_pattern;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class WordDecorator extends Decorator{
	File decoratorFile;
	
	public WordDecorator(ReadWord readWord,File decoratorFile) {
		super(readWord);
		this.decoratorFile = decoratorFile;
	}

	@Override
	public ArrayList<String> readWord(File file) {
		ArrayList<String> wordList = readWord.readWord(file);
		try {
			FileReader in = new FileReader(decoratorFile);
			BufferedReader br = new BufferedReader(in);
			String s = null;
			int i = 0;
			while((s=br.readLine())!=null){
				String word = wordList.get(i);
				word = word.concat(" | "+s);
				wordList.set(i, word);
				i++;
				if(i>=wordList.size())break;
			}
			in.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return wordList;
	}

}
