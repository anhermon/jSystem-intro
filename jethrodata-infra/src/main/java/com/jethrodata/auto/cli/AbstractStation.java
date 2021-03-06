package com.jethrodata.auto.cli;

import jsystem.framework.system.SystemObjectImpl;

public abstract class AbstractStation extends SystemObjectImpl {

	public abstract void listDir(String folderName) throws Exception;
	
	public abstract void runCommand(String command) throws Exception;
	
	public abstract String runCommandWithResult(String command) throws Exception;
	
	public abstract int getFileSize(String folder, String fileName) throws Exception;

	public abstract float getCPUUsage();

	public abstract float getRAMUsage();
	
}
