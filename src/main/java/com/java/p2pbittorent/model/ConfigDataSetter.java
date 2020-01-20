package com.java.p2pbittorent.model;

import java.io.IOException;
import java.util.Map;

import com.java.p2pbittorent.fileparser.ConfigFileParserDao;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ConfigDataSetter {
	private static final String ROOT = System.getProperty("user.dir");
    private static final String COMMON_FILE_PATH = ROOT + "/src/main/java/common.cfg";
    private static final String PEER_INFO_FILE_PATH = ROOT + "/src/main/java/PeerInfo.cfg";

	private ConfigFileParserDao configFileParserDao;
	
	public void setCommonConstantsData(final CommonConstants commonConstants) throws IOException {
		final Map<String, String> commonConfigComponentsMap = configFileParserDao.parseConfigFile(COMMON_FILE_PATH);
		commonConstants.setNumberOfPreferredNeighbors(Integer.parseInt(commonConfigComponentsMap.get("NumberOfPreferredNeighbours")));
		commonConstants.setUnchokingInterval(Integer.parseInt(commonConfigComponentsMap.get("UnchokingInterval")));
		commonConstants.setOptimisticUnchokingInterval(Integer.parseInt(commonConfigComponentsMap.get("OptimisticUnchokingInterval")));
		commonConstants.setFileName(commonConfigComponentsMap.get("FileName"));
		commonConstants.setFileSize(Integer.parseInt(commonConfigComponentsMap.get("FileSize")));
		commonConstants.setPieceSize(Integer.parseInt(commonConfigComponentsMap.get("pieceSize")));
	}
	
	public void setPeerInfoData(final PeerInfo peerInfo) throws IOException {
		final Map<String, String> commonConfigComponentsMap = configFileParserDao.parseConfigFile(PEER_INFO_FILE_PATH);
		peerInfo.setPeerID(Integer.parseInt(commonConfigComponentsMap.get("PeerID")));
		peerInfo.setHostName(commonConfigComponentsMap.get("PeerID"));
		peerInfo.setPortNo(Integer.parseInt(commonConfigComponentsMap.get("PortNo")));
		peerInfo.setHasFile(Integer.parseInt(commonConfigComponentsMap.get("HasFile")));

	}
}
