package io.github.thunderbots.autoseq;

import java.io.File;
import java.io.PrintStream;

import io.github.thunderbots.sdk.opmode.SimpleOpMode;

public class AutoSequencer {
	
	private SimpleOpMode opmode;
	private File outputFile;
	private PrintStream outputStream;
	
	public AutoSequencer(SimpleOpMode opmode, String filename) {
		this.opmode = opmode;
		this.setOutputFile(filename);
		this.outputStream = new PrintStream(this.outputStream);
	}
	
	private void setOutputFile(String filename) {
		this.outputFile = null;
		// TODO: implement this
		throw new UnsupportedOperationException();
	}

}
