package org.easyerp.parser;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.logging.Logger;

import org.antlr.v4.runtime.RecognitionException;
import org.junit.Test;

public class JsonFileParserTest {
	private static Logger logger = Logger.getLogger(JsonFileParserTest.class.getName());
	@Test
	public void testParsePythonJson() throws RecognitionException, Exception {
		JsonFileParser parser = new JsonFileParser();
		Map<String, Object> jsonObject = parser.parsePythonJson("__openerp__.py");
		logger.info("" + jsonObject);
	}
}
