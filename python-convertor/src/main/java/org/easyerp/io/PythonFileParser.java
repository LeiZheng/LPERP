package org.easyerp.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Stack;

public class PythonFileParser {
	private Stack<Integer> intStack = new Stack<Integer>();
	private List<Integer> currentString = new ArrayList<Integer>();
	private String currentName;
	private ParserStatus status;
	private String currentText;
	private Class currentClassType;
	private boolean isEnd = false;
	Properties props = new Properties();
	public Properties loadProperties(File file) throws IOException {
		
		FileInputStream fis = new FileInputStream(file);
		props.clear();
		while(fis.available() > 0 && !isEnd) {
			int currentInt = fis.read();
			switch(currentInt) {
				case '\'': 
					onSingleQuotesToken(currentInt);
					break;
				case '#':
					onPoundToken(currentInt); 
					break;
				case ',': 
					onCommaToken();
					break;
				case '"': 
					onDoubleQuotesToken();
					break;
				case '[':
					onLeftBracketToken();
					break;
				case ']':
					onRightBracketToken();
					break;
				case '\r':
					onEnterToken();
					break;
				case '\n':
					onNewLineToken();					
					break;
				case '{':
					onLeftBigBracketToken();
					break;
				case '}':
					onRightBigBracketToken();
					break;
				case ':':
					onColonToken(currentInt);
					break;
				default: onDefaultToken();				
			}
		}
		return props;
	}
	private void onColonToken(int currentInt) {//:
		intStack.push(currentInt);			
	}
	private void onDefaultToken() {//default
		// TODO Auto-generated method stub
		
	}
	
	private void onRightBigBracketToken() {//}
		List<Integer> content = new ArrayList<Integer>();
		//TODO
		int value;
		while( (value = intStack.pop()) != '{') {
			content.add(value);
		}
		isEnd = true;
	}
	
	private void onLeftBigBracketToken(int currentInt) {
		// TODO Auto-generated method stub
		intStack.push(currentInt);			
	}
	
	private void onNewLineToken(int currentInt) {
		intStack.push(currentInt);
		
	}
	
	private void onEnterToken(int currentInt) {
		intStack.push(currentInt);
		
	}
	
	private void onRightBracketToken() {
		// TODO Auto-generated method stub
		
	}
	private void onLeftBracketToken() {
		// TODO Auto-generated method stub
		
	}
	private void onDoubleQuotesToken() {
		// TODO Auto-generated method stub
		
	}
	private void onCommaToken() {
		// TODO Auto-generated method stub
		
	}
	private void onPoundToken() {
		// TODO Auto-generated method stub
		
	}
	private void onSingleQuotesToken(int currentInt) {
		//'\'
		List<Integer> content = new ArrayList<Integer>();
		//TODO
		int value;
		while( (value = intStack.pop()) != '{') {
			content.add(value);
		}

		switch(currentInt) {
		case '\'': 
			break;
		default:
			intStack.push(currentInt);			
		}
	}
}
