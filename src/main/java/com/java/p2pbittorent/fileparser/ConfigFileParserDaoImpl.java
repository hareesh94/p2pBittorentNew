package com.java.p2pbittorent.fileparser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ConfigFileParserDaoImpl implements ConfigFileParserDao{

	@Override
	public Map<String, String> parseConfigFile(String filePath) throws IOException {
        final File CommonFile = new File(filePath);
        final BufferedReader fileReader = new BufferedReader(new FileReader(CommonFile));
        final Map<String, String> componentsToValueMap = new HashMap<>();
        String currentLine;
        String[] parts;
        while ((currentLine = fileReader.readLine()) != null) {
            parts = currentLine.split(" ");
            componentsToValueMap.put(parts[0], parts[1]);
        }
        fileReader.close();
		return componentsToValueMap;
	}
}
