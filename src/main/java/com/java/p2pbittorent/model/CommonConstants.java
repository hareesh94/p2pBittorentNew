package com.java.p2pbittorent.model;

import lombok.Data;
import lombok.Getter;

@Data
public class CommonConstants {
    private int numberOfPreferredNeighbors;
    private int unchokingInterval;
    private int optimisticUnchokingInterval;
    private int fileSize;
    private int pieceSize;
    private String fileName;
}
