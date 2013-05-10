package com.tomsl.dbalive;


import org.opencms.main.OpenCms;
import org.opencms.module.CmsModule;
//import org.opencms.module.CmsModuleManager;

public class DbAliveModule {
	public static final String TRANSFER_DATABASE = "transferDatabase";
	public static final String STARTUPSETTINGSSITE = "startupSettingsSite";
	
	public static CmsModule getModule()
	  {
	    return OpenCms.getModuleManager().getModule(DbAliveModule.class.getPackage().getName());
	  }

	  public static String getParameter(String parameterName)
	  {
	    return getModule().getParameter(parameterName);
	  }
}
