/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.34
 * Generated at: 2025-02-28 08:12:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.gem.generic.element.section;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import org.iplass.mtp.util.StringUtil;
import org.iplass.mtp.view.generic.element.section.SearchConditionSection;
import org.iplass.mtp.view.generic.element.section.SearchConditionSection.FileSupportType;
import org.iplass.mtp.view.generic.SearchFormView;
import org.iplass.mtp.web.template.TemplateUtil;
import org.iplass.gem.command.generic.search.SearchFormViewData;
import org.iplass.gem.command.Constants;
import org.iplass.gem.command.ViewUtil;

public final class SearchConditionSection_005fEntityFileDownloadDialog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("m:rs", org.iplass.mtp.web.template.ELFunctions.class, "rs", new Class[] {java.lang.String.class, java.lang.String.class});
}

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/mtp.tld", Long.valueOf(1740642050000L));
    _jspx_dependants.put("/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.1.jar", Long.valueOf(1737625086258L));
    _jspx_dependants.put("jar:file:/C:/pleiades/2024-12/workspace/Portal_Mock/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Portal_Mock/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.1.jar!/META-INF/c.tld", Long.valueOf(1664421078000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(11);
    _jspx_imports_classes.add("org.iplass.gem.command.Constants");
    _jspx_imports_classes.add("org.iplass.mtp.web.template.TemplateUtil");
    _jspx_imports_classes.add("org.iplass.mtp.view.generic.element.section.SearchConditionSection.FileSupportType");
    _jspx_imports_classes.add("org.iplass.mtp.view.generic.SearchFormView");
    _jspx_imports_classes.add("org.iplass.gem.command.ViewUtil");
    _jspx_imports_classes.add("org.iplass.mtp.view.generic.element.section.SearchConditionSection");
    _jspx_imports_classes.add("org.iplass.gem.command.generic.search.SearchFormViewData");
    _jspx_imports_classes.add("org.iplass.mtp.util.StringUtil");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPではGET、POST、またはHEADのみが許可されます。 JasperはOPTIONSも許可しています。");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;


	SearchFormViewData data = (SearchFormViewData) request.getAttribute(Constants.DATA);
	SearchFormView view = data.getView();
	SearchConditionSection section = view.getCondSection();
	FileSupportType fileSupportType = data.getFileSupportType();

      out.write("<div id=\"file-download-dialog\" class=\"mtp-jq-dialog\" title=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:rs('mtp-gem-messages', 'generic.element.section.SearchConditionSection.dwnCsv')}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("\" style=\"display:none;\">\n");

	if (fileSupportType == FileSupportType.SPECIFY) {

      out.write("<fieldset>\n");
      out.write("		<label><input name=\"fileSupportType\" type=\"radio\" value=\"");
      out.print(FileSupportType.CSV);
      out.write("\" checked />CSV</label>\n");
      out.write("		<label><input name=\"fileSupportType\" type=\"radio\" value=\"");
      out.print(FileSupportType.EXCEL);
      out.write("\" />EXCEL</label>\n");
      out.write("	</fieldset>\n");

	}

      out.write("<fieldset class=\"fs-checkbox\" id=\"fsForUpload\">\n");
      out.write("		<input type=\"checkbox\" name=\"forUpload\" id=\"forUpload\" value=\"1\"  onchange=\"checkForUpload()\"/>\n");
      out.write("		<label for=\"forUpload\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:rs(\"mtp-gem-messages\", \"generic.element.section.SearchConditionSection.forUpload\")}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</label>\n");
      out.write("	</fieldset>\n");

	if (!section.isNonOutputDisplayName()) {
		// 表示名を明示的に出力しないか

      out.write("<fieldset class=\"fs-checkbox disabled\" id=\"fsNoDispName\">\n");
      out.write("		<input type=\"checkbox\" name=\"noDispName\" id=\"noDispName\" value=\"1\" disabled=\"disabled\" />\n");
      out.write("		<label for=\"noDispName\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:rs(\"mtp-gem-messages\", \"generic.element.section.SearchConditionSection.noDispName\")}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</label>\n");
      out.write("	</fieldset>\n");

	}

      out.write("<fieldset class=\"fs-checkbox\" id=\"fsDownloadCodeValue\">\n");
      out.write("		<input type=\"checkbox\" name=\"downloadCodeValue\" id=\"downloadCodeValue\" value=\"1\" />\n");
      out.write("		<label for=\"downloadCodeValue\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:rs(\"mtp-gem-messages\", \"generic.element.section.SearchConditionSection.downloadCodeValue\")}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</label>\n");
      out.write("	</fieldset>\n");

	if (StringUtil.isNotBlank(section.getCsvdownloadProperties())) {
		// CSVを検索結果ベースで出力するか

      out.write("<fieldset class=\"fs-checkbox\" id=\"fsOutputResult\">\n");
      out.write("		<input type=\"checkbox\" name=\"outputResult\" id=\"outputResult\" value=\"1\"  onchange=\"checkOutputResult()\"/>\n");
      out.write("		<label for=\"outputResult\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:rs(\"mtp-gem-messages\", \"generic.element.section.SearchConditionSection.outputDisplayItem\")}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</label>\n");
      out.write("	</fieldset>\n");

	}
	if (fileSupportType != FileSupportType.EXCEL 
			&& ViewUtil.isEntityViewCsvDownloadSpecifyCharacterCode(section.getSpecifyCharacterCode())){

      out.write("<fieldset>\n");
      out.write("		<select name=\"characterCode\" id=\"characterCode\">\n");
		for (String characterCode : ViewUtil.getCsvDownloadCharacterCode()) {
      out.write("<option value=\"");
      out.print(characterCode);
      out.write('"');
      out.write('>');
      out.print(characterCode);
      out.write("</option>\n");
		}
      out.write("</select>\n");
      out.write("		<label for=\"characterCode\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:rs(\"mtp-gem-messages\", \"generic.element.section.SearchConditionSection.charCd\")}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</label>\n");
      out.write("	</fieldset>\n");
	}
      out.write("<input type=\"hidden\" name=\"execType\"/>\n");
      out.write("	<input type=\"hidden\" id=\"trigger\"/>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".fs-checkbox.disabled .pseudo-checkbox::after {\n");
      out.write("  -webkit-transition: 0ms;\n");
      out.write("  transition: 0ms;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function checkForUpload() {\n");
      out.write("	if ($(\"#forUpload\").prop('checked')) {\n");
      out.write("		$(\"#characterCode\").val(\"UTF-8\");\n");
      out.write("		$(\"#characterCode\").prop('disabled', true);\n");
      out.write("		$(\"#noDispName\").prop('disabled', false);\n");
      out.write("		$(\"#downloadCodeValue\").prop('disabled', true);\n");
      out.write("		$(\"#outputResult\").prop('disabled', true);\n");
      out.write("		$(\"#fsNoDispName\").removeClass('disabled');\n");
      out.write("		$(\"#fsDownloadCodeValue\").addClass('disabled');\n");
      out.write("		$(\"#fsOutputResult\").addClass('disabled');\n");
      out.write("	} else {\n");
      out.write("		$(\"#characterCode\").prop('disabled', false);\n");
      out.write("		$(\"#noDispName\").prop('disabled', true);\n");
      out.write("		$(\"#downloadCodeValue\").prop('disabled', false);\n");
      out.write("		$(\"#outputResult\").prop('disabled', false);\n");
      out.write("		$(\"#fsNoDispName\").addClass('disabled');\n");
      out.write("		$(\"#fsDownloadCodeValue\").removeClass('disabled');\n");
      out.write("		$(\"#fsOutputResult\").removeClass('disabled');\n");
      out.write("	}\n");
      out.write("}\n");

if (StringUtil.isNotBlank(section.getCsvdownloadProperties())) {

      out.write("\n");
      out.write("function checkOutputResult() {\n");
      out.write("	if ($(\"#outputResult\").prop(\"checked\")) {\n");
      out.write("		$(\"#forUpload\").prop('disabled', true);\n");
      out.write("		$(\"#fsForUpload\").addClass('disabled');\n");
      out.write("	} else {\n");
      out.write("		$(\"#forUpload\").prop('disabled', false);\n");
      out.write("		$(\"#fsForUpload\").removeClass('disabled');\n");
      out.write("	}\n");
      out.write("}\n");

}

      out.write("\n");
      out.write("function showFileDownloadDialog(searchType, buttonId, validate, callback) {\n");
      out.write("	var dialog = $(\"#file-download-dialog\");\n");
      out.write("	dialog.dialog({\n");
      out.write("		resizable: false,\n");
      out.write("		autoOpen: false,\n");
      out.write("		height: 250,\n");
      out.write("		width: 360,\n");
      out.write("		modal: true,\n");
      out.write("		buttons: [\n");
      out.write("			{\n");
      out.write("				text: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:rs('mtp-gem-messages', 'generic.element.section.SearchConditionSection.csvDl')}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("\",\n");
      out.write("				class: \"dialog-csvdl-btn\",\n");
      out.write("				click: function() {\n");
      out.write("						var execType = $(\"input[name=execType]\", dialog).val();\n");
      out.write("						var forUpload = $(\"#forUpload\").is(':checked');\n");
      out.write("						var noDispName = null;\n");
      out.write("						");
if (!section.isNonOutputDisplayName()) {
      out.write("\n");
      out.write("						noDispName = $(\"#noDispName\").is(':checked');\n");
      out.write("						");
}
      out.write("\n");
      out.write("						var downloadCodeValue = $(\"#downloadCodeValue\").prop('checked');\n");
      out.write("						var characterCode = $(\"#characterCode\").val();\n");
      out.write("						var outputResult = null;\n");
      out.write("						");
if (StringUtil.isNotBlank(section.getCsvdownloadProperties())) {
      out.write("\n");
      out.write("						outputResult = $(\"#outputResult\").is(':checked');\n");
      out.write("						");
}
      out.write("\n");
      out.write("						var fileSupportType = null;\n");
      out.write("						");
if (fileSupportType == FileSupportType.SPECIFY) {
      out.write("\n");
      out.write("						fileSupportType = $('input:radio[name=\"fileSupportType\"]:checked', dialog).val();\n");
      out.write("						");
}
      out.write("\n");
      out.write("\n");
      out.write("						var id = $(\"#trigger\", dialog).val();\n");
      out.write("						var $target = $(\"#\"+id);\n");
      out.write("						callback.call($target, execType, forUpload, characterCode, noDispName, outputResult, downloadCodeValue, fileSupportType);\n");
      out.write("\n");
      out.write("						$(this).dialog(\"close\");\n");
      out.write("				}\n");
      out.write("			},\n");
      out.write("			{\n");
      out.write("				text: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:rs('mtp-gem-messages', 'generic.element.section.SearchConditionSection.cancel')}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("\",\n");
      out.write("				click: function() {\n");
      out.write("						$(this).dialog(\"close\");\n");
      out.write("				}\n");
      out.write("			}\n");
      out.write("		],\n");
      out.write("		close: function() {\n");
      out.write("		}\n");
      out.write("	});\n");
      out.write("	dialog.on(\"dialogopen\", function(e) {\n");
      out.write("		adjustDialogLayer($(\".ui-widget-overlay\"));\n");
      out.write("	});\n");
      out.write("\n");
      out.write("	$(\"#\" + buttonId).on(\"click\", function() {\n");
      out.write("		$(\"input[name=execType]\", dialog).val(searchType);\n");
      out.write("		var id = $(this).attr(\"id\");\n");
      out.write("		if (!validation(searchType)) return;\n");
      out.write("\n");
      out.write("		if (validate != \"\") {\n");
      out.write("			");
      out.write("\n");
      out.write("			searchValidate(validate, searchType, searchType + 'Form', function() {\n");
      out.write("				$(\"#trigger\", dialog).val(id);\n");
      out.write("				dialog.dialog(\"open\");\n");
      out.write("			});\n");
      out.write("		} else {\n");
      out.write("			$(\"#trigger\", dialog).val(id);\n");
      out.write("			dialog.dialog(\"open\");\n");
      out.write("		}\n");
      out.write("	});\n");
      out.write("}\n");
      out.write("</script>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
