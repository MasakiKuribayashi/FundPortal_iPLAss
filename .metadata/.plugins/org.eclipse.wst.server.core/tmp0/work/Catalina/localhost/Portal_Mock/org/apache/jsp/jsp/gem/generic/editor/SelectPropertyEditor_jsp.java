/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.34
 * Generated at: 2025-02-28 08:12:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.gem.generic.editor;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import org.iplass.mtp.ManagerLocator;
import org.iplass.mtp.entity.SelectValue;
import org.iplass.mtp.entity.definition.LocalizedSelectValueDefinition;
import org.iplass.mtp.entity.definition.properties.selectvalue.SelectValueDefinition;
import org.iplass.mtp.entity.definition.properties.selectvalue.SelectValueDefinitionManager;
import org.iplass.mtp.entity.definition.PropertyDefinition;
import org.iplass.mtp.entity.definition.PropertyDefinitionType;
import org.iplass.mtp.entity.definition.properties.ExpressionProperty;
import org.iplass.mtp.entity.definition.properties.SelectProperty;
import org.iplass.mtp.view.generic.editor.SelectPropertyEditor;
import org.iplass.mtp.view.generic.EntityViewRuntimeException;
import org.iplass.mtp.view.generic.EntityViewUtil;
import org.iplass.mtp.view.generic.OutputType;
import org.iplass.mtp.util.StringUtil;
import org.iplass.mtp.impl.core.ExecuteContext;
import org.iplass.gem.command.Constants;

public final class SelectPropertyEditor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(24);
    _jspx_imports_classes.add("org.iplass.mtp.entity.definition.PropertyDefinition");
    _jspx_imports_classes.add("org.iplass.mtp.impl.core.ExecuteContext");
    _jspx_imports_classes.add("org.iplass.mtp.view.generic.EntityViewUtil");
    _jspx_imports_classes.add("org.iplass.mtp.entity.definition.LocalizedSelectValueDefinition");
    _jspx_imports_classes.add("org.iplass.mtp.entity.definition.PropertyDefinitionType");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("org.iplass.mtp.view.generic.OutputType");
    _jspx_imports_classes.add("org.iplass.mtp.util.StringUtil");
    _jspx_imports_classes.add("org.iplass.mtp.entity.definition.properties.ExpressionProperty");
    _jspx_imports_classes.add("org.iplass.mtp.view.generic.editor.SelectPropertyEditor");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("org.iplass.mtp.ManagerLocator");
    _jspx_imports_classes.add("org.iplass.gem.command.Constants");
    _jspx_imports_classes.add("org.iplass.mtp.entity.definition.properties.selectvalue.SelectValueDefinition");
    _jspx_imports_classes.add("org.iplass.mtp.view.generic.EntityViewRuntimeException");
    _jspx_imports_classes.add("org.iplass.mtp.entity.definition.properties.selectvalue.SelectValueDefinitionManager");
    _jspx_imports_classes.add("org.iplass.mtp.entity.definition.properties.SelectProperty");
    _jspx_imports_classes.add("org.iplass.mtp.entity.SelectValue");
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


	SelectPropertyEditor editor = (SelectPropertyEditor) request.getAttribute(Constants.EDITOR_EDITOR);
	OutputType type = (OutputType) request.getAttribute(Constants.OUTPUT_TYPE);

	PropertyDefinition pd = (PropertyDefinition) request.getAttribute(Constants.EDITOR_PROPERTY_DEFINITION);

	String propName = editor.getPropertyName();
	if (pd == null || !(pd instanceof SelectProperty)) {
		//定義がSelectPropertyか、Expression(resultType=Select)でなければ表示不可
		if (pd instanceof ExpressionProperty) {
			ExpressionProperty ep = (ExpressionProperty) pd;
			if (ep.getResultType() != PropertyDefinitionType.SELECT) {
				throw new EntityViewRuntimeException(propName + " 's editor is unsupport "
						+ (pd != null ? pd.getClass().getSimpleName() : "(unknown)") + " type." );
			}
		} else {
			throw new EntityViewRuntimeException(propName + " 's editor is unsupport "
					+ (pd != null ? pd.getClass().getSimpleName() : "(unknown)") + " type." );
		}
	}

	if (pd instanceof SelectProperty) {
		SelectProperty sp = (SelectProperty) pd;
		List<SelectValue> selectValueList = sp.getSelectValueList();
		List<LocalizedSelectValueDefinition> localeValueList = sp.getLocalizedSelectValueList();

		//attributeにセット
		request.setAttribute(Constants.EDITOR_SELECT_VALUE_LIST, selectValueList);
		request.setAttribute(Constants.EDITOR_LOCAL_VALUE_LIST, localeValueList);

		//EditorにEditorValueが未指定の場合、SelectValueから生成
		if (editor.getValues().isEmpty()) {
			//言語は対象言語のみ取得
			editor.setValues(EntityViewUtil.createEditorValueList(sp, ExecuteContext.getCurrentContext().getLanguage()));
		}

	} else if (pd instanceof ExpressionProperty) {
		ExpressionProperty ep = (ExpressionProperty) pd;
		if (ep.getResultTypeSpec() != null
				&& ep.getResultTypeSpec() instanceof SelectProperty) {

			SelectProperty resultTypeSpec = (SelectProperty)ep.getResultTypeSpec();
			if (StringUtil.isEmpty(resultTypeSpec.getSelectValueDefinitionName())) {
				//Globalが未指定の場合、表示不可
				return;
			}

			SelectValueDefinitionManager svdm = ManagerLocator.getInstance().getManager(SelectValueDefinitionManager.class);
			SelectValueDefinition svd = svdm.get(resultTypeSpec.getSelectValueDefinitionName());
			if (svd != null) {
				List<SelectValue> selectValueList = svd.getSelectValueList();
				List<LocalizedSelectValueDefinition> localeValueList = svd.getLocalizedSelectValueList();

				//attributeにセット
				request.setAttribute(Constants.EDITOR_SELECT_VALUE_LIST, selectValueList);
				request.setAttribute(Constants.EDITOR_LOCAL_VALUE_LIST, localeValueList);

				//EditorにEditorValueが未指定の場合、SelectValueから生成
				if (editor.getValues().isEmpty()) {
					//言語は対象言語のみ取得
					editor.setValues(EntityViewUtil.createEditorValueList(svd, ExecuteContext.getCurrentContext().getLanguage()));
				}
			} else {
				//Global定義が見つからないため、表示不可
				return;
			}
		}
	}

	//タイプ毎に出力内容かえる
	if (OutputType.EDIT == type || OutputType.BULK == type) {

      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./select/SelectPropertyEditor_Edit.jsp", out, false);
      String _jspx_temp0_url = "ErrorMessage.jsp";
      String _jspx_temp0_requestEncoding = request.getCharacterEncoding();
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, _jspx_temp0_url + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("propName", _jspx_temp0_requestEncoding)+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(propName ), _jspx_temp0_requestEncoding), out, false);

	} else if (OutputType.VIEW == type) {
		//詳細表示

      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./select/SelectPropertyEditor_View.jsp", out, false);

	} else if (OutputType.SEARCHCONDITION == type) {
		//検索条件

      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./select/SelectPropertyEditor_Condition.jsp", out, false);

	} else {
		//検索結果

      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./select/SelectPropertyEditor_View.jsp", out, false);

	}

	request.removeAttribute(Constants.EDITOR_EDITOR);
	request.removeAttribute(Constants.EDITOR_PROP_VALUE);
	request.removeAttribute(Constants.EDITOR_PROPERTY_DEFINITION);
	request.removeAttribute(Constants.EDITOR_DISPLAY_LABEL);
	request.removeAttribute(Constants.EDITOR_SELECT_VALUE_LIST);
	request.removeAttribute(Constants.EDITOR_LOCAL_VALUE_LIST);

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
