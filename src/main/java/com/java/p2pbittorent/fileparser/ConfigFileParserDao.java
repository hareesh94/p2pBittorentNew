package com.java.p2pbittorent.fileparser;

import java.io.IOException;
import java.util.Map;

public interface ConfigFileParserDao {

	/**
	 * Parse the config file and return the components to value map
	 * 
	 * @throws IOException 
	 */
	Map<String, String> parseConfigFile(final String filePath) throws IOException;
}
