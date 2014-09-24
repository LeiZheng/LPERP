package org.easyerp.parser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.easyerp.parser.JSONParser.ArrayContext;
import org.easyerp.parser.JSONParser.JsonContext;
import org.easyerp.parser.JSONParser.ObjectContext;
import org.easyerp.parser.JSONParser.PairContext;
import org.easyerp.parser.JSONParser.ValueContext;

public class JsonFileParser {
	private static Logger logger = Logger.getLogger(JsonFileParser.class.getName());
	public Map<String, Object> parsePythonJson(String filename) throws RecognitionException, Exception {
		JSONLexer lexer = new JSONLexer(new ANTLRFileStream(JsonFileParser.class.getClassLoader().getResource(filename).getFile()));
		JSONParser parser = new JSONParser(new CommonTokenStream(lexer));
		return (Map<String, Object>)parseToObject(parser.json());
		
	}

	private void print(ParseTree tree, String parent) {
		System.out.println("---------------\n type: " + tree.getClass().getSimpleName() + "\n self: " + tree.getText() + "\n parent: " +parent + "\n childcount: " + tree.getChildCount());
		for(int i = 0; i < tree.getChildCount(); i ++) {
			print(tree.getChild(i), tree.getText());
		} 
	}
	
	private Object parseToObject(ParseTree root) throws Exception {
		Object parsedObject = null;			
		if(root instanceof ObjectContext) {
			//iterator all pair context for object context
			Map<String, Object> parsedMap = new HashMap<String, Object>();
			for(int i = 0; i < root.getChildCount(); i ++) {
				ParseTree childNode = root.getChild(i);
				if(childNode instanceof PairContext) {
					PairContext context = (PairContext)childNode;
					String name = context.STRING().getText();
					parsedMap.put(name.substring(1,name.length() - 1), parseToObject(context.value()));
				}
			}
			parsedObject = parsedMap;
		} else if(root instanceof JsonContext) {//the parse tree begin at JsonContext, it should only contain one ObjectContext
			return parseToObject(root.getChild(0));			
		} else if(root instanceof PairContext) {
			throw new Exception("PairContext detected");
		} else if(root instanceof ValueContext) {
			ValueContext context = (ValueContext) root;
			//Token token = (Token)root.getPayload();			
			logger.info("value content payload: " + root.getPayload().getClass());			
			switch(context.getRuleIndex()) {
			case JSONParser.RULE_array:
				List<Object> objects = new ArrayList<Object>();				
				for(ParseTree childNode : context.array().children) {
					objects.add(parseToObject(childNode));
				}
				parsedObject = objects;
				break;
			case JSONParser.RULE_object:
				parsedObject = parseToObject(context.object());
				break;
			case JSONParser.RULE_value:
				parsedObject = parseToObject(context.getChild(0));
				break;
			}
		} else if(root instanceof ArrayContext) {
			ArrayContext context = (ArrayContext) root;
			List<Object> objects = new ArrayList<Object>();				
			for(ParseTree childNode : context.children) {
				if(childNode instanceof ValueContext)
				objects.add(parseToObject(childNode));
			}
			parsedObject = objects;
		} else if(root instanceof TerminalNodeImpl) {
			if(root.getPayload() instanceof Token) {
				Token token = (Token)root.getPayload();
				String value = root.getText();				
				switch(token.getType()) {
				case JSONParser.LONGSTRING:
					parsedObject = value.substring(3,value.length() - 3);
					break;
				case JSONParser.STRING:
					parsedObject = value.substring(1,value.length() - 1);
					break;
					default:
						parsedObject = root.getText();		
				}
			}
			logger.info("TerminalNodeImpl payload: " + root.getPayload().getClass());		
		}		
		
		return parsedObject;
	}

}
