package com.jethrodata.auto;

import com.jethrodata.auto.cli.AbstractStation;

import jsystem.framework.system.SystemObjectImpl;

public abstract class AbstractProber extends SystemObjectImpl {
	
	private AbstractStation getCLI(String machineName) {
		AbstractStation cli;
		try {
			cli = ((Lab) system.getSystemObject("lab")).jethroServer.cli;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return cli;
		
	}
	public float getCPUUsage(String machineName) {
		return getCLI(machineName).getCPUUsage();
	}
	
	public float getRAMUsage(String machineName) {
		return getCLI(machineName).getRAMUsage();
	}

}
