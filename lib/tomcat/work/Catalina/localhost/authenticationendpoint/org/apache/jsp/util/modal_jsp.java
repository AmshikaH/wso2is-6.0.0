/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2022-10-26 09:02:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.util;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class modal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1660113304000L));
    _jspx_dependants.put("jar:file:/C:/Users/amshikahameed/Downloads/wso2is-6.0.0-rc2/wso2is-6.0.0/repository/deployment/server/webapps/authenticationendpoint/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425958870000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      response.setContentType("text/html");
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
      out.write("<div class=\"ui modal tiny notify\" id=\"asg-modal-0\">\n");
      out.write("    <div class=\"animated-icon text-center\">\n");
      out.write("        <div class=\"svg-box\" data-testid=\"session-timeout-modal-warning-animated-icon\">\n");
      out.write("            <svg class=\"circular warning-stroke\">\n");
      out.write("                <circle class=\"path\" cx=\"75\" cy=\"75\" r=\"50\" fill=\"none\" stroke-width=\"2\" stroke-miterlimit=\"10\">\n");
      out.write("                </circle>\n");
      out.write("            </svg>\n");
      out.write("            <svg class=\"warning-icon warning-stroke\">\n");
      out.write("                <g transform=\"matrix(1,0,0,1,-615.516,-257.346)\">\n");
      out.write("                    <g transform=\"matrix(0.56541,-0.56541,0.56541,0.56541,93.7153,495.69)\">\n");
      out.write("                        <path class=\"line\" d=\"M634.087,300.805L673.361,261.53\" fill=\"none\"></path>\n");
      out.write("                    </g>\n");
      out.write("                    <g transform=\"matrix(2.27612,-2.46519e-32,0,2.27612,-792.339,-404.147)\">\n");
      out.write("                        <circle class=\"dot\" cx=\"621.52\" cy=\"316.126\" r=\"1.318\"></circle>\n");
      out.write("                    </g>\n");
      out.write("                </g>\n");
      out.write("            </svg>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"content text-center\">\n");
      out.write("        <div class=\"description\">\n");
      out.write("            <div class=\"ui header\" id=\"asg-modal-0-title\">\n");
      out.write("                <b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</b>\n");
      out.write("            </div>\n");
      out.write("            <p id=\"asg-modal-0-description\">\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.description}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"actions\">\n");
      out.write("        <div class=\"ui deny button\" id=\"asg-modal-0-dismiss-button\">\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.cancel_button_text}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("    function ModalRef(onAction = ModalRef.noop, onCancel = ModalRef.noop) {\n");
      out.write("        try {\n");
      out.write("            this.onAction = onAction;\n");
      out.write("            this.onCancel = onCancel;\n");
      out.write("            this.modal = $(\"#asg-modal-0\");\n");
      out.write("            this.desc = $(\"#asg-modal-0-description\");\n");
      out.write("            this.cancelBtn = $(\"#asg-modal-0-dismiss-button\");\n");
      out.write("            this.actionBtn = $(\"#asg-modal-0-action-button\");\n");
      out.write("            this.init();\n");
      out.write("        } catch (e) {\n");
      out.write("            // Ignore any exceptions.\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    ModalRef.prototype.init = function () {\n");
      out.write("        if (this.cancelBtn) {\n");
      out.write("            this.cancelBtn.click(this.onCancel);\n");
      out.write("        }\n");
      out.write("        if (this.actionBtn) {\n");
      out.write("            this.actionBtn.click(this.onAction);\n");
      out.write("        }\n");
      out.write("    };\n");
      out.write("\n");
      out.write("    ModalRef.prototype.isActive = function () {\n");
      out.write("        return this.modal.hasClass(\"active\");\n");
      out.write("    };\n");
      out.write("\n");
      out.write("    ModalRef.prototype.show = function () {\n");
      out.write("        if (this.isActive()) return;\n");
      out.write("        this.modal.modal({\n");
      out.write("            detachable: false,\n");
      out.write("            closable: false\n");
      out.write("        }).modal(\"show\");\n");
      out.write("    };\n");
      out.write("\n");
      out.write("    ModalRef.prototype.hide = function () {\n");
      out.write("        this.modal.modal(\"hide\");\n");
      out.write("    };\n");
      out.write("\n");
      out.write("    ModalRef.prototype.changeDescription = function (desc) {\n");
      out.write("        this.desc.text(desc);\n");
      out.write("    };\n");
      out.write("\n");
      out.write("    ModalRef.prototype.changeDescriptionAsHTML = function (html) {\n");
      out.write("        this.desc.html(html);\n");
      out.write("    };\n");
      out.write("\n");
      out.write("    ModalRef.prototype.hideDismissButton = function () {\n");
      out.write("        this.cancelBtn.hide();\n");
      out.write("    };\n");
      out.write("\n");
      out.write("    ModalRef.prototype.showDismissButton = function () {\n");
      out.write("        this.cancelBtn.show();\n");
      out.write("    };\n");
      out.write("\n");
      out.write("    ModalRef.prototype.dispose = function () {\n");
      out.write("        this.hide();\n");
      out.write("        this.actionBtn.unbind(\"click\");\n");
      out.write("        this.cancelBtn.unbind(\"click\");\n");
      out.write("        this.onAction = null;\n");
      out.write("        this.onCancel = null;\n");
      out.write("        this.modal = null;\n");
      out.write("        this.desc = null;\n");
      out.write("        this.cancelBtn = null;\n");
      out.write("        this.actionBtn = null;\n");
      out.write("    };\n");
      out.write("\n");
      out.write("    ModalRef.noop = function () {\n");
      out.write("        // No operations\n");
      out.write("    };\n");
      out.write("\n");
      out.write("</script>\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /util/modal.jsp(54,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty param.action_button_text}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            <div class=\"ui primary button\" id=\"asg-modal-0-action-button\">\n");
          out.write("                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.action_button_text}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("            </div>\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }
}
