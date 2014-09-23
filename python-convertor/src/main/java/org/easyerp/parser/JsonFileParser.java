package org.easyerp.parser;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class JsonFileParser {
	static public void main(String[] args) throws IOException {
		JSONLexer lexer = new JSONLexer(new ANTLRFileStream(JsonFileParser.class.getClassLoader().getResource("__openerp__.py").getFile()));
		JSONParser parser = new JSONParser(new CommonTokenStream(lexer));
		
		print(parser.pair());	
	}

	private static void print(ParseTree tree) {
		System.out.println("new line: " + tree.getText() + " : " + tree.getChildCount());
		for(int i = 0; i < tree.getChildCount(); i ++) {
			print(tree.getChild(i));
		} 
	}
}
