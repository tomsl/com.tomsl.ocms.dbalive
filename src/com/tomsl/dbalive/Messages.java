package com.tomsl.dbalive;

import org.opencms.i18n.A_CmsMessageBundle;
import org.opencms.i18n.I_CmsMessageBundle;

public final class Messages extends A_CmsMessageBundle
{
  public static final String BUNDLE_NAME = "com.tomsl.dbalive";
  private static final I_CmsMessageBundle INSTANCE = new Messages();

  public static I_CmsMessageBundle get()
  {
    return INSTANCE;
  }

  public String getBundleName()
  {
    return "com.tomsl.dbalive";
  }
}