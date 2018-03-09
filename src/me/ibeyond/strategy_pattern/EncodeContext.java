package me.ibeyond.strategy_pattern;

import java.io.File;

public class EncodeContext {
	
	EncryptStrategy strategy;

	public void setStrategy(EncryptStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void encryptFile(File file) {
		strategy.decryptFile(file);
	}

	public String decryptFile(File file) {
		return strategy.decryptFile(file);
	}
	
	
}
