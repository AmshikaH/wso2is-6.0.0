/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2022-10-26 08:55:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.owasp.encoder.Encode;
import org.wso2.carbon.identity.captcha.util.CaptchaUtil;
import org.wso2.carbon.identity.mgt.endpoint.util.IdentityManagementEndpointUtil;
import org.wso2.carbon.identity.mgt.endpoint.util.client.model.InitiateQuestionResponse;
import org.wso2.carbon.identity.mgt.endpoint.util.client.model.RetryError;
import java.io.File;
import org.wso2.carbon.identity.mgt.endpoint.util.EncodedControl;
import java.nio.charset.StandardCharsets;
import java.util.ResourceBundle;
import java.util.Map;
import java.util.HashMap;

public final class challenge_002dquestion_002dview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/includes/localize.jsp", Long.valueOf(1660113374000L));
    _jspx_dependants.put("jar:file:/C:/Users/amshikahameed/Downloads/wso2is-6.0.0-rc2/wso2is-6.0.0/repository/deployment/server/webapps/accountrecoveryendpoint/WEB-INF/lib/org.wso2.identity.apps.taglibs.layout.controller-1.4.28.jar!/META-INF/taglib.tld", Long.valueOf(1660114014000L));
    _jspx_dependants.put("/WEB-INF/lib/org.wso2.identity.apps.taglibs.layout.controller-1.4.28.jar", Long.valueOf(1660114018000L));
    _jspx_dependants.put("/includes/layout-resolver.jsp", Long.valueOf(1660113374000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.owasp.encoder.Encode");
    _jspx_imports_classes.add("java.util.ResourceBundle");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.client.model.RetryError");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.EncodedControl");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.IdentityManagementEndpointUtil");
    _jspx_imports_classes.add("java.util.HashMap");
    _jspx_imports_classes.add("org.wso2.carbon.identity.captcha.util.CaptchaUtil");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.client.model.InitiateQuestionResponse");
    _jspx_imports_classes.add("java.io.File");
    _jspx_imports_classes.add("java.nio.charset.StandardCharsets");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fmain_0026_005flayoutName_005flayoutFileRelativePath_005fdata;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fcomponent_0026_005fcomponentName;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005flayout_005fmain_0026_005flayoutName_005flayoutFileRelativePath_005fdata = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fcomponent_0026_005fcomponentName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005flayout_005fmain_0026_005flayoutName_005flayoutFileRelativePath_005fdata.release();
    _005fjspx_005ftagPool_005flayout_005fcomponent_0026_005fcomponentName.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String BUNDLE = "org.wso2.carbon.identity.mgt.recovery.endpoint.i18n.Resources";
    ResourceBundle recoveryResourceBundle = ResourceBundle.getBundle(BUNDLE, request.getLocale(),
            new EncodedControl(StandardCharsets.UTF_8.toString()));

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');

    String layout = "default";

      out.write('\n');
      out.write('\n');
      out.write('\n');

    if (config.getServletContext().getResource("extensions/layouts/custom/body.html") != null) {
        layout = "custom";
    }

      out.write('\n');
      out.write('\n');
      out.write('\n');

    String layoutFileRelativePath;
    Map<String, Object> layoutData = new HashMap<String, Object>();

    if (!layout.equals("custom")) {
        if (layout.equals("default")) {
            layoutFileRelativePath = "includes/layouts/" + layout + "/body.html";
        } else {
            layoutFileRelativePath = "extensions/layouts/" + layout + "/body.html";
            if (config.getServletContext().getResource(layoutFileRelativePath) == null) {
                layout = "default";
                layoutFileRelativePath = "includes/layouts/default/body.html";
            }
        }
    } else {
        layoutFileRelativePath = "extensions/layouts/custom/body.html";
    }

      out.write('\n');
      out.write('\n');
      out.write('\n');

    InitiateQuestionResponse initiateQuestionResponse = (InitiateQuestionResponse)
            session.getAttribute("initiateChallengeQuestionResponse");
    RetryError errorResponse = (RetryError) request.getAttribute("errorResponse");
    boolean reCaptchaEnabled = false;
    if (request.getAttribute("reCaptcha") != null && "TRUE".equalsIgnoreCase((String) request.getAttribute("reCaptcha"))) {
        reCaptchaEnabled = true;
    }

      out.write('\n');
      out.write('\n');
      out.write('\n');

    layoutData.put("containerSize", "medium");

      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    ");

        File headerFile = new File(getServletContext().getRealPath("extensions/header.jsp"));
        if (headerFile.exists()) {
    
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/header.jsp", out, false);
      out.write("\n");
      out.write("    ");
 } else { 
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/header.jsp", out, false);
      out.write("\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("    ");

        if (reCaptchaEnabled) {
            String reCaptchaAPI = CaptchaUtil.reCaptchaAPIURL();
    
      out.write("\n");
      out.write("    <script src='");
      out.print((reCaptchaAPI));
      out.write("'></script>\n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class=\"login-portal layout recovery-layout\">\n");
      out.write("    ");
      //  layout:main
      org.wso2.identity.apps.taglibs.layout.controller.MainTagHandler _jspx_th_layout_005fmain_005f0 = (org.wso2.identity.apps.taglibs.layout.controller.MainTagHandler) _005fjspx_005ftagPool_005flayout_005fmain_0026_005flayoutName_005flayoutFileRelativePath_005fdata.get(org.wso2.identity.apps.taglibs.layout.controller.MainTagHandler.class);
      boolean _jspx_th_layout_005fmain_005f0_reused = false;
      try {
        _jspx_th_layout_005fmain_005f0.setPageContext(_jspx_page_context);
        _jspx_th_layout_005fmain_005f0.setParent(null);
        // /challenge-question-view.jsp(68,4) name = layoutName type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_layout_005fmain_005f0.setLayoutName( layout );
        // /challenge-question-view.jsp(68,4) name = layoutFileRelativePath type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_layout_005fmain_005f0.setLayoutFileRelativePath( layoutFileRelativePath );
        // /challenge-question-view.jsp(68,4) name = data type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_layout_005fmain_005f0.setData( layoutData );
        int _jspx_eval_layout_005fmain_005f0 = _jspx_th_layout_005fmain_005f0.doStartTag();
        if (_jspx_eval_layout_005fmain_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("        ");
            //  layout:component
            org.wso2.identity.apps.taglibs.layout.controller.ComponentTagHandler _jspx_th_layout_005fcomponent_005f0 = (org.wso2.identity.apps.taglibs.layout.controller.ComponentTagHandler) _005fjspx_005ftagPool_005flayout_005fcomponent_0026_005fcomponentName.get(org.wso2.identity.apps.taglibs.layout.controller.ComponentTagHandler.class);
            boolean _jspx_th_layout_005fcomponent_005f0_reused = false;
            try {
              _jspx_th_layout_005fcomponent_005f0.setPageContext(_jspx_page_context);
              _jspx_th_layout_005fcomponent_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fmain_005f0);
              // /challenge-question-view.jsp(69,8) name = componentName type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_layout_005fcomponent_005f0.setComponentName("ProductHeader");
              int _jspx_eval_layout_005fcomponent_005f0 = _jspx_th_layout_005fcomponent_005f0.doStartTag();
              if (_jspx_eval_layout_005fcomponent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("            <!-- product-title -->\n");
                  out.write("            ");

                File productTitleFile = new File(getServletContext().getRealPath("extensions/product-title.jsp"));
                if (productTitleFile.exists()) {
            
                  out.write("\n");
                  out.write("            ");
                  org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/product-title.jsp", out, false);
                  out.write("\n");
                  out.write("            ");
 } else { 
                  out.write("\n");
                  out.write("            ");
                  org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/product-title.jsp", out, false);
                  out.write("\n");
                  out.write("            ");
 } 
                  out.write("\n");
                  out.write("        ");
                  int evalDoAfterBody = _jspx_th_layout_005fcomponent_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_layout_005fcomponent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
              _005fjspx_005ftagPool_005flayout_005fcomponent_0026_005fcomponentName.reuse(_jspx_th_layout_005fcomponent_005f0);
              _jspx_th_layout_005fcomponent_005f0_reused = true;
            } finally {
              org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_layout_005fcomponent_005f0, _jsp_getInstanceManager(), _jspx_th_layout_005fcomponent_005f0_reused);
            }
            out.write("\n");
            out.write("        ");
            //  layout:component
            org.wso2.identity.apps.taglibs.layout.controller.ComponentTagHandler _jspx_th_layout_005fcomponent_005f1 = (org.wso2.identity.apps.taglibs.layout.controller.ComponentTagHandler) _005fjspx_005ftagPool_005flayout_005fcomponent_0026_005fcomponentName.get(org.wso2.identity.apps.taglibs.layout.controller.ComponentTagHandler.class);
            boolean _jspx_th_layout_005fcomponent_005f1_reused = false;
            try {
              _jspx_th_layout_005fcomponent_005f1.setPageContext(_jspx_page_context);
              _jspx_th_layout_005fcomponent_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fmain_005f0);
              // /challenge-question-view.jsp(80,8) name = componentName type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_layout_005fcomponent_005f1.setComponentName("MainSection");
              int _jspx_eval_layout_005fcomponent_005f1 = _jspx_th_layout_005fcomponent_005f1.doStartTag();
              if (_jspx_eval_layout_005fcomponent_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("            <div class=\"ui segment\">\n");
                  out.write("                <!-- page content -->\n");
                  out.write("                ");

                    if (errorResponse != null) {
                
                  out.write("\n");
                  out.write("                <div class=\"ui visible negative message\" id=\"server-error-msg\">\n");
                  out.write("                    ");
                  out.print(IdentityManagementEndpointUtil.i18nBase64(recoveryResourceBundle, errorResponse.getDescription()));
                  out.write("\n");
                  out.write("                </div>\n");
                  out.write("                <div class=\"ui divider hidden\"></div>\n");
                  out.write("\n");
                  out.write("                ");

                    }
                
                  out.write("\n");
                  out.write("                <div class=\"ui negative message\" id=\"error-msg\" hidden=\"hidden\"></div>\n");
                  out.write("                <div class=\"segment-form\">\n");
                  out.write("                    <form class=\"ui large form\" method=\"post\" action=\"processsecurityquestions.do\"\n");
                  out.write("                          id=\"securityQuestionForm\">\n");
                  out.write("                        <div class=\"field\">\n");
                  out.write("                            <label class=\"control-label\">");
                  out.print(initiateQuestionResponse.getQuestion().getQuestion());
                  out.write("\n");
                  out.write("                            </label>\n");
                  out.write("                        </div>\n");
                  out.write("                        <div class=\"field\">\n");
                  out.write("                            <input id=\"securityQuestionAnswer\" name=\"securityQuestionAnswer\" type=\"password\"\n");
                  out.write("                                   class=\"form-control\"\n");
                  out.write("                                   tabindex=\"0\" autocomplete=\"off\" required/>\n");
                  out.write("                        </div>\n");
                  out.write("                        <div class=\"field\">\n");
                  out.write("                            <input type=\"hidden\" name=\"step\"\n");
                  out.write("                                   value=\"");
                  out.print(Encode.forHtmlAttribute(request.getParameter("step")));
                  out.write("\"/>\n");
                  out.write("                        </div>\n");
                  out.write("                        <div class=\"ui divider hidden\"></div>\n");
                  out.write("                        ");

                            if (reCaptchaEnabled) {
                                String reCaptchaKey = CaptchaUtil.reCaptchaSiteKey();
                        
                  out.write("\n");
                  out.write("                        <div class=\"field\">\n");
                  out.write("                            <div class=\"g-recaptcha\"\n");
                  out.write("                                    data-size=\"invisible\"\n");
                  out.write("                                    data-callback=\"onCompleted\"\n");
                  out.write("                                    data-action=\"usernameRecovery\"\n");
                  out.write("                                    data-sitekey=\n");
                  out.write("                                            \"");
                  out.print(Encode.forHtmlContent(reCaptchaKey));
                  out.write("\">\n");
                  out.write("                            </div>\n");
                  out.write("                        </div>\n");
                  out.write("                        ");

                            }
                        
                  out.write("\n");
                  out.write("                        <div class=\"align-right buttons\">\n");
                  out.write("                            <button id=\"answerSubmit\"\n");
                  out.write("                                    class=\"ui primary button\"\n");
                  out.write("                                    type=\"submit\">\n");
                  out.write("                                ");
                  out.print(IdentityManagementEndpointUtil.i18n(recoveryResourceBundle, "Submit"));
                  out.write("\n");
                  out.write("                            </button>\n");
                  out.write("                        </div>\n");
                  out.write("                    </form>\n");
                  out.write("                </div>\n");
                  out.write("            </div>\n");
                  out.write("        ");
                  int evalDoAfterBody = _jspx_th_layout_005fcomponent_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_layout_005fcomponent_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
              _005fjspx_005ftagPool_005flayout_005fcomponent_0026_005fcomponentName.reuse(_jspx_th_layout_005fcomponent_005f1);
              _jspx_th_layout_005fcomponent_005f1_reused = true;
            } finally {
              org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_layout_005fcomponent_005f1, _jsp_getInstanceManager(), _jspx_th_layout_005fcomponent_005f1_reused);
            }
            out.write("\n");
            out.write("        ");
            //  layout:component
            org.wso2.identity.apps.taglibs.layout.controller.ComponentTagHandler _jspx_th_layout_005fcomponent_005f2 = (org.wso2.identity.apps.taglibs.layout.controller.ComponentTagHandler) _005fjspx_005ftagPool_005flayout_005fcomponent_0026_005fcomponentName.get(org.wso2.identity.apps.taglibs.layout.controller.ComponentTagHandler.class);
            boolean _jspx_th_layout_005fcomponent_005f2_reused = false;
            try {
              _jspx_th_layout_005fcomponent_005f2.setPageContext(_jspx_page_context);
              _jspx_th_layout_005fcomponent_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fmain_005f0);
              // /challenge-question-view.jsp(139,8) name = componentName type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_layout_005fcomponent_005f2.setComponentName("ProductFooter");
              int _jspx_eval_layout_005fcomponent_005f2 = _jspx_th_layout_005fcomponent_005f2.doStartTag();
              if (_jspx_eval_layout_005fcomponent_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("            <!-- product-footer -->\n");
                  out.write("            ");

                File productFooterFile = new File(getServletContext().getRealPath("extensions/product-footer.jsp"));
                if (productFooterFile.exists()) {
            
                  out.write("\n");
                  out.write("            ");
                  org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/product-footer.jsp", out, false);
                  out.write("\n");
                  out.write("            ");
 } else { 
                  out.write("\n");
                  out.write("            ");
                  org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/product-footer.jsp", out, false);
                  out.write("\n");
                  out.write("            ");
 } 
                  out.write("\n");
                  out.write("        ");
                  int evalDoAfterBody = _jspx_th_layout_005fcomponent_005f2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_layout_005fcomponent_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
              _005fjspx_005ftagPool_005flayout_005fcomponent_0026_005fcomponentName.reuse(_jspx_th_layout_005fcomponent_005f2);
              _jspx_th_layout_005fcomponent_005f2_reused = true;
            } finally {
              org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_layout_005fcomponent_005f2, _jsp_getInstanceManager(), _jspx_th_layout_005fcomponent_005f2_reused);
            }
            out.write("\n");
            out.write("    ");
            int evalDoAfterBody = _jspx_th_layout_005fmain_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_layout_005fmain_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005flayout_005fmain_0026_005flayoutName_005flayoutFileRelativePath_005fdata.reuse(_jspx_th_layout_005fmain_005f0);
        _jspx_th_layout_005fmain_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_layout_005fmain_005f0, _jsp_getInstanceManager(), _jspx_th_layout_005fmain_005f0_reused);
      }
      out.write("\n");
      out.write("\n");
      out.write("    <!-- footer -->\n");
      out.write("    ");

        File footerFile = new File(getServletContext().getRealPath("extensions/footer.jsp"));
        if (footerFile.exists()) {
    
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/footer.jsp", out, false);
      out.write("\n");
      out.write("    ");
 } else { 
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/footer.jsp", out, false);
      out.write("\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function onCompleted() {\n");
      out.write("            $('#securityQuestionForm').submit();\n");
      out.write("        }\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            $(\"#securityQuestionForm\").submit(function (e) {\n");
      out.write("               ");

                   if (reCaptchaEnabled) {
               
      out.write("\n");
      out.write("               if (!grecaptcha.getResponse()) {\n");
      out.write("                   e.preventDefault();\n");
      out.write("                   grecaptcha.execute();\n");
      out.write("\n");
      out.write("                   return true;\n");
      out.write("               }\n");
      out.write("               ");

                   }
               
      out.write("\n");
      out.write("               return true;\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
