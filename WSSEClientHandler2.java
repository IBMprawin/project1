package com.att.ctp.action;
import com.att.ctp.ctcUtil.*;

import java.util.Map;
import java.util.Iterator;

import javax.xml.rpc.handler.Handler;
import javax.xml.rpc.handler.HandlerInfo;
import javax.xml.rpc.handler.MessageContext;
import javax.xml.rpc.handler.soap.SOAPMessageContext;
import javax.xml.rpc.JAXRPCException;
import javax.xml.namespace.QName;
import javax.xml.soap.*;
import weblogic.webservice.core.handler.WSSEClientHandler;

import com.att.ctp.common.util.*;


/**
 * Class that implements a handler in the handler chain, used allow us
 * to see the wsse structure from the other handlers.
 * <p>
 * The class implements the <code>javax.xml.rpc.handler.Handler</code>
 *  interface. The class allows us to see the wsse:Security header and 
 * thus use other handlers to set the mustUnderstand flag to false.
 *
 * @author Copyright (c) 2003 by BEA Systems. All Rights Reserved.
 */

public final class WSSEClientHandler2 extends weblogic.webservice.core.handler.WSSEClientHandler
  implements Handler
{

  /**
   * We override the Response handler to prevent validation of Content-Type
   */
  public boolean handleResponse(MessageContext mc) {

    return true;
  }

}
