package com.java.p2pbittorent.model;

import lombok.Data;

@Data
public class PeerInfo {
	private int peerID;
    private int portNo;
    private int hasFile;
    private String hostName;
}
