package io.github.thunderbots.autoseq;

import io.github.thunderbots.sdk.opmode.SimpleOpMode;

public class AutoSequencer {
	
	private SimpleOpMode opmode;
	private String filename;
	
	public AutoSequencer(SimpleOpMode opmode, String filename) {
		this.opmode = opmode;
		this.filename = filename;
	}

}
