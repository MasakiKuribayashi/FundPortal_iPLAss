/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.34
 * Generated at: 2025-02-28 08:12:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.gem.generic.detail;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.util.HashMap;
import org.iplass.mtp.ManagerLocator;
import org.iplass.mtp.auth.AuthContext;
import org.iplass.mtp.entity.Entity;
import org.iplass.mtp.entity.EntityManager;
import org.iplass.mtp.entity.definition.VersionControlType;
import org.iplass.mtp.entity.query.condition.expr.And;
import org.iplass.mtp.entity.query.condition.predicate.Equals;
import org.iplass.mtp.entity.query.Query;
import org.iplass.mtp.util.StringUtil;
import org.iplass.mtp.view.generic.element.Button;
import org.iplass.mtp.view.generic.element.DisplayType;
import org.iplass.mtp.view.generic.DetailFormView;
import org.iplass.mtp.view.generic.EntityViewManager;
import org.iplass.mtp.view.generic.EntityViewUtil;
import org.iplass.mtp.view.generic.OutputType;
import org.iplass.mtp.web.template.TemplateUtil;
import org.iplass.gem.command.Constants;
import org.iplass.gem.command.GemResourceBundleUtil;
import org.iplass.gem.command.generic.detail.DetailFormViewData;

public final class viewButton_inc_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {


	boolean hasLock(String lockId) {
		String userOid = AuthContext.getCurrentContext().getUser().getOid();
		return lockId != null ? userOid.equals(lockId) : false;
	}

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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(27);
    _jspx_imports_classes.add("org.iplass.mtp.entity.Entity");
    _jspx_imports_classes.add("org.iplass.mtp.entity.query.condition.expr.And");
    _jspx_imports_classes.add("org.iplass.mtp.view.generic.element.DisplayType");
    _jspx_imports_classes.add("org.iplass.mtp.view.generic.DetailFormView");
    _jspx_imports_classes.add("org.iplass.gem.command.generic.detail.DetailFormViewData");
    _jspx_imports_classes.add("org.iplass.mtp.entity.definition.VersionControlType");
    _jspx_imports_classes.add("java.util.HashMap");
    _jspx_imports_classes.add("org.iplass.mtp.view.generic.EntityViewUtil");
    _jspx_imports_classes.add("org.iplass.mtp.auth.AuthContext");
    _jspx_imports_classes.add("org.iplass.mtp.util.StringUtil");
    _jspx_imports_classes.add("org.iplass.mtp.view.generic.OutputType");
    _jspx_imports_classes.add("org.iplass.gem.command.GemResourceBundleUtil");
    _jspx_imports_classes.add("org.iplass.mtp.ManagerLocator");
    _jspx_imports_classes.add("org.iplass.mtp.entity.query.Query");
    _jspx_imports_classes.add("org.iplass.gem.command.Constants");
    _jspx_imports_classes.add("org.iplass.mtp.web.template.TemplateUtil");
    _jspx_imports_classes.add("org.iplass.mtp.view.generic.element.Button");
    _jspx_imports_classes.add("org.iplass.mtp.view.generic.EntityViewManager");
    _jspx_imports_classes.add("org.iplass.mtp.entity.EntityManager");
    _jspx_imports_classes.add("org.iplass.mtp.entity.query.condition.predicate.Equals");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
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


	String defName = (String) request.getAttribute(Constants.DEF_NAME);
	DetailFormViewData data = (DetailFormViewData) request.getAttribute(Constants.DATA);

	DetailFormView form = data.getView();
	//コピーボタン表示可否
	boolean isNoneDispCopyButton = form.isNoneDispCopyButton();

	//ロック制御
	String oid = null;
	boolean isLock = false;
	boolean hasLock = false;
	String lockId = null;
	if (data.getEntity() != null) {
		oid = data.getEntity().getOid();
		lockId = data.getEntity().getLockedBy();
		isLock = lockId != null;
		hasLock = hasLock(lockId);
	}
	String lockStyle = isLock ? "display:none;" : "";
	String unlockStyle = !isLock ? "display:none;" : "";

	//ボタンの表示ラベル
	String editDisplayLabel = GemResourceBundleUtil.resourceString("generic.detail.viewButton.edit");
	String localizedEditDisplayLabel = TemplateUtil.getMultilingualString(form.getEditDisplayLabel(), form.getLocalizedEditDisplayLabelList());
	if (StringUtil.isNotBlank(localizedEditDisplayLabel)) {
		editDisplayLabel = localizedEditDisplayLabel;
	}
	String copyDisplayLabel = GemResourceBundleUtil.resourceString("generic.detail.viewButton.copy");
	String localizedCopyDisplayLabel = TemplateUtil.getMultilingualString(form.getCopyDisplayLabel(), form.getLocalizedCopyDisplayLabelList());
	if (StringUtil.isNotBlank(localizedCopyDisplayLabel)) {
		copyDisplayLabel = localizedCopyDisplayLabel;
	}
	String versionupDisplayLabel = GemResourceBundleUtil.resourceString("generic.detail.viewButton.newVersion");
	String localizedVersionupDisplayLabel = TemplateUtil.getMultilingualString(form.getVersionupDisplayLabel(), form.getLocalizedVersionupDisplayLabelList());
	if (StringUtil.isNotBlank(localizedVersionupDisplayLabel)) {
		versionupDisplayLabel = localizedVersionupDisplayLabel;
	}

	//権限確認用
	boolean showEditButton = data.isCanUpdate() || data.isCanDelete();
	boolean showCopyButton = data.isCanCreate();

	//ワークフローの権限確認用
	EntityManager em = ManagerLocator.getInstance().getManager(EntityManager.class);
	EntityViewManager evm = ManagerLocator.getInstance().getManager(EntityViewManager.class);

      out.write("<ul class=\"list_operation edit-bar\">\n");

		if (form.getButtons().size() > 0) {
			for (Button button : form.getButtons()) {
				boolean isDisplayCustomType = false;
				if (button.getDisplayType() == DisplayType.CUSTOM) {
					isDisplayCustomType = evm.isDisplayButton(data.getEntityDefinition().getName(), button.getCustomDisplayTypeScriptKey(), OutputType.VIEW, data.getEntity());
				}
				if (EntityViewUtil.isDisplayElement(defName, button.getElementRuntimeId(), OutputType.VIEW, data.getEntity())
						&& (button.getDisplayType() != null
							&& (button.getDisplayType() == DisplayType.VIEW
								|| button.getDisplayType() == DisplayType.BOTH || isDisplayCustomType))) {
					String cssClass = button.isPrimary() ? "gr-btn" : "gr-btn-02";
					if (StringUtil.isNotBlank(button.getStyle())) {
						cssClass = button.getStyle();
					}
					String customStyle = "";
					if (StringUtil.isNotBlank(button.getInputCustomStyle())) {
						Object value = request.getAttribute(Constants.ENTITY_DATA);
						Entity entity = value instanceof Entity ? (Entity) value : null;
						String scriptKey = (String)request.getAttribute(Constants.FORM_SCRIPT_KEY);
						customStyle = EntityViewUtil.getCustomStyle(defName, scriptKey, button.getInputCustomStyleScriptKey(), entity, null);
					}

					String displayLabel = TemplateUtil.getMultilingualString(button.getDisplayLabel(), button.getLocalizedDisplayLabelList());

      out.write("<li class=\"btn\">\n");
      out.write("<input type=\"button\" value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent(null);
      // /jsp/gem/generic/detail/viewButton.inc.jsp(127,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue(displayLabel );
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      out.write("\" class=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f1.setParent(null);
      // /jsp/gem/generic/detail/viewButton.inc.jsp(127,72) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f1.setValue(cssClass );
      int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
      if (_jspx_th_c_005fout_005f1.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      out.write("\" \n");
      out.write("	style=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f2.setParent(null);
      // /jsp/gem/generic/detail/viewButton.inc.jsp(128,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f2.setValue(customStyle );
      int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
      if (_jspx_th_c_005fout_005f2.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      out.write("\" onclick=\"");
      out.print(button.getOnclickEvent() );
      out.write("\" />\n");
      out.write("</li>\n");

				}
			}
		}
		if (showEditButton) {
			if (!form.isHideLock()) {

      out.write("<li class=\"btn lock-btn\">\n");
      out.write("<input type=\"button\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:rs('mtp-gem-messages', 'generic.detail.viewButton.lock')}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("\" class=\"gr-btn-02\" \n");
      out.write("	name=\"lock\" style=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f3.setParent(null);
      // /jsp/gem/generic/detail/viewButton.inc.jsp(139,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f3.setValue(lockStyle );
      int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
      if (_jspx_th_c_005fout_005f3.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
      out.write("\" onclick=\"dataLock()\" />\n");
      out.write("</li>\n");
      out.write("<li class=\"btn unlock-btn\">\n");
      out.write("<input type=\"button\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:rs('mtp-gem-messages', 'generic.detail.viewButton.unlock')}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("\" class=\"gr-btn-02\" \n");
      out.write("	name=\"unlock\" style=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f4.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f4.setParent(null);
      // /jsp/gem/generic/detail/viewButton.inc.jsp(143,22) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f4.setValue(unlockStyle );
      int _jspx_eval_c_005fout_005f4 = _jspx_th_c_005fout_005f4.doStartTag();
      if (_jspx_th_c_005fout_005f4.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
      out.write("\" onclick=\"dataUnlock()\" />\n");
      out.write("</li>\n");

			}
			if (!form.isHideDetail()) {
				String dispStyle = "";
				if (isLock && !hasLock) {
					dispStyle = "display: none";
				}

      out.write("<li class=\"btn edit-btn\">\n");
      out.write("<input type=\"submit\" value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f5.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f5.setParent(null);
      // /jsp/gem/generic/detail/viewButton.inc.jsp(154,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f5.setValue(editDisplayLabel );
      int _jspx_eval_c_005fout_005f5 = _jspx_th_c_005fout_005f5.doStartTag();
      if (_jspx_th_c_005fout_005f5.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f5);
      out.write("\" class=\"gr-btn\" \n");
      out.write("	style=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f6.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f6.setParent(null);
      // /jsp/gem/generic/detail/viewButton.inc.jsp(155,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f6.setValue(dispStyle );
      int _jspx_eval_c_005fout_005f6 = _jspx_th_c_005fout_005f6.doStartTag();
      if (_jspx_th_c_005fout_005f6.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f6);
      out.write("\" onclick=\"onclick_submit()\" />\n");
      out.write("</li>\n");

			}
		}
		if (showCopyButton && !isNoneDispCopyButton) {

      out.write("<li class=\"btn copy-btn\">\n");
      out.write("<input type=\"button\" value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f7 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f7.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f7.setParent(null);
      // /jsp/gem/generic/detail/viewButton.inc.jsp(163,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f7.setValue(copyDisplayLabel );
      int _jspx_eval_c_005fout_005f7 = _jspx_th_c_005fout_005f7.doStartTag();
      if (_jspx_th_c_005fout_005f7.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f7);
      out.write("\" class=\"gr-btn\" \n");
      out.write("	onclick=\"onclick_copy()\" />\n");
      out.write("</li>\n");

		}
		if (showEditButton) {
			if (data.getEntityDefinition().getVersionControlType() != VersionControlType.NONE) {
				String dispStyle = "";
				if (isLock && !hasLock) {
					dispStyle = "display: none";
				}

      out.write("<li class=\"btn version-btn\">\n");
      out.write("<input type=\"button\" value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f8 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f8.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f8.setParent(null);
      // /jsp/gem/generic/detail/viewButton.inc.jsp(176,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f8.setValue(versionupDisplayLabel );
      int _jspx_eval_c_005fout_005f8 = _jspx_th_c_005fout_005f8.doStartTag();
      if (_jspx_th_c_005fout_005f8.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f8);
      out.write("\" class=\"gr-btn gr-size-03\" \n");
      out.write("	style=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f9 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f9.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f9.setParent(null);
      // /jsp/gem/generic/detail/viewButton.inc.jsp(177,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f9.setValue(dispStyle );
      int _jspx_eval_c_005fout_005f9 = _jspx_th_c_005fout_005f9.doStartTag();
      if (_jspx_th_c_005fout_005f9.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f9);
      out.write("\" onclick=\"onclick_newversion()\" />\n");
      out.write("</li>\n");

			}
		}

      out.write("<li class=\"mt05 cancel-link\">\n");
      out.write("<a href=\"javascript:void(0)\" onclick=\"cancel();return false;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:rs(\"mtp-gem-messages\", \"generic.detail.viewButton.back\")}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</a>\n");
      out.write("</li>\n");
      out.write("</ul>\n");
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
