/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.34
 * Generated at: 2025-02-28 08:14:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.gem.auth;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import org.iplass.mtp.entity.Entity;
import org.iplass.mtp.entity.permission.EntityPermission;
import org.iplass.mtp.entity.permission.EntityPropertyPermission;
import org.iplass.mtp.auth.AuthContext;
import org.iplass.mtp.auth.User;
import org.iplass.mtp.entity.definition.EntityDefinition;
import org.iplass.mtp.entity.definition.EntityDefinitionManager;
import org.iplass.mtp.entity.EntityManager;
import org.iplass.mtp.view.generic.editor.*;
import org.iplass.mtp.view.generic.element.property.PropertyItem;
import org.iplass.mtp.view.generic.element.section.*;
import org.iplass.mtp.view.generic.element.Element;
import org.iplass.mtp.view.generic.DetailFormView;
import org.iplass.mtp.view.generic.EntityView;
import org.iplass.mtp.view.generic.EntityViewManager;
import org.iplass.mtp.view.generic.EntityViewUtil;
import org.iplass.mtp.view.generic.OutputType;
import org.iplass.mtp.view.generic.ViewConst;
import org.iplass.mtp.view.top.parts.UserMaintenanceParts;
import org.iplass.mtp.view.top.parts.TopViewParts;
import org.iplass.mtp.view.top.TopViewDefinition;
import org.iplass.mtp.view.top.TopViewDefinitionManager;
import org.iplass.mtp.web.template.TemplateUtil;
import org.iplass.mtp.web.WebRequestConstants;
import org.iplass.mtp.ManagerLocator;
import org.iplass.gem.command.auth.AuthCommandConstants;
import org.iplass.gem.command.auth.UpdatePasswordCommand;
import org.iplass.gem.command.auth.UpdateUserCommand;
import org.iplass.gem.command.Constants;
import org.iplass.gem.command.ViewUtil;

public final class Password_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {



	List<PropertyItem> getProperty(DetailFormView view, Entity entity) {
		List<PropertyItem> propList = new ArrayList<PropertyItem>();
		for (Section section : view.getSections()) {
			if (section instanceof DefaultSection
					&& EntityViewUtil.isDisplayElement(User.DEFINITION_NAME, section.getElementRuntimeId(), OutputType.EDIT, entity)
					&& ViewUtil.dispElement(Constants.EXEC_TYPE_UPDATE, section)) {
				propList.addAll(getProperty((DefaultSection) section, entity));
			}
		}
		return propList;
	}

	List<PropertyItem> getProperty(DefaultSection section, Entity entity) {
		List<PropertyItem> propList = new ArrayList<PropertyItem>();
		for (Element elem : section.getElements()) {
			if (elem instanceof PropertyItem) {
				PropertyItem prop = (PropertyItem) elem;
				if (EntityViewUtil.isDisplayElement(User.DEFINITION_NAME, prop.getElementRuntimeId(), OutputType.EDIT, entity)
						&& ViewUtil.dispElement(Constants.EXEC_TYPE_UPDATE, prop)) propList.add(prop);
			} else if (elem instanceof DefaultSection) {
				propList.addAll(getProperty((DefaultSection) elem, entity));
			}
		}
		return propList;
	}

private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;
private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_1;
private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_2;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("m:rs", org.iplass.mtp.web.template.ELFunctions.class, "rs", new Class[] {java.lang.String.class, java.lang.String.class});
  _jspx_fnmap_1= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("m:tcPath", org.iplass.mtp.web.template.ELFunctions.class, "tcPath", new Class[] {});
  _jspx_fnmap_2= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("m:outputToken", org.iplass.mtp.web.template.ELFunctions.class, "outputToken", new Class[] {java.lang.Object.class, boolean.class});
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
    _jspx_imports_packages = new java.util.LinkedHashSet<>(7);
    _jspx_imports_packages.add("org.iplass.mtp.view.generic.element.section");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("org.iplass.mtp.view.generic.editor");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(40);
    _jspx_imports_classes.add("org.iplass.gem.command.auth.UpdatePasswordCommand");
    _jspx_imports_classes.add("org.iplass.gem.command.ViewUtil");
    _jspx_imports_classes.add("org.iplass.mtp.entity.permission.EntityPermission");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("org.iplass.mtp.view.generic.OutputType");
    _jspx_imports_classes.add("org.iplass.mtp.entity.definition.EntityDefinition");
    _jspx_imports_classes.add("org.iplass.mtp.view.generic.EntityView");
    _jspx_imports_classes.add("org.iplass.mtp.view.top.TopViewDefinition");
    _jspx_imports_classes.add("org.iplass.gem.command.Constants");
    _jspx_imports_classes.add("org.iplass.mtp.view.top.TopViewDefinitionManager");
    _jspx_imports_classes.add("org.iplass.gem.command.auth.UpdateUserCommand");
    _jspx_imports_classes.add("org.iplass.mtp.entity.EntityManager");
    _jspx_imports_classes.add("org.iplass.mtp.entity.definition.EntityDefinitionManager");
    _jspx_imports_classes.add("org.iplass.mtp.entity.Entity");
    _jspx_imports_classes.add("org.iplass.mtp.view.generic.DetailFormView");
    _jspx_imports_classes.add("org.iplass.mtp.view.generic.EntityViewUtil");
    _jspx_imports_classes.add("org.iplass.mtp.auth.User");
    _jspx_imports_classes.add("org.iplass.mtp.entity.permission.EntityPropertyPermission");
    _jspx_imports_classes.add("org.iplass.mtp.auth.AuthContext");
    _jspx_imports_classes.add("org.iplass.gem.command.auth.AuthCommandConstants");
    _jspx_imports_classes.add("org.iplass.mtp.view.generic.element.property.PropertyItem");
    _jspx_imports_classes.add("org.iplass.mtp.view.generic.ViewConst");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("org.iplass.mtp.ManagerLocator");
    _jspx_imports_classes.add("org.iplass.mtp.web.template.TemplateUtil");
    _jspx_imports_classes.add("org.iplass.mtp.view.generic.element.Element");
    _jspx_imports_classes.add("org.iplass.mtp.view.generic.EntityViewManager");
    _jspx_imports_classes.add("org.iplass.mtp.view.top.parts.TopViewParts");
    _jspx_imports_classes.add("org.iplass.mtp.view.top.parts.UserMaintenanceParts");
    _jspx_imports_classes.add("org.iplass.mtp.web.WebRequestConstants");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fm_005fauth_0026_005fprivileged;

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
    _005fjspx_005ftagPool_005fm_005fauth_0026_005fprivileged = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fm_005fauth_0026_005fprivileged.release();
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


	Exception e = (Exception) request.getAttribute(AuthCommandConstants.RESULT_ERROR);
	String errorMessage = null;
	if (e != null) {
		errorMessage = e.getMessage();
	}
	if (errorMessage == null) {
		errorMessage = (String) request.getAttribute(Constants.MESSAGE);
	}
	if (errorMessage == null) {
		errorMessage = "";
	}

	//ユーザー情報メンテナンス用
	String defName = User.DEFINITION_NAME;
	AuthContext auth = AuthContext.getCurrentContext();

	String roleName = (String) request.getSession().getAttribute(Constants.ROLE_NAME);
	if (roleName == null) roleName = "DEFAULT";
	TopViewDefinitionManager manager = ManagerLocator.getInstance().getManager(TopViewDefinitionManager.class);
	TopViewDefinition td = manager.get(roleName);
	UserMaintenanceParts setting = null;
	if (td != null) {
		for (TopViewParts parts : td.getParts()) {
			if (parts instanceof UserMaintenanceParts) {
				setting = (UserMaintenanceParts) parts;
				break;
			}
		}
	}
	EntityDefinitionManager edm = ManagerLocator.getInstance().getManager(EntityDefinitionManager.class);
	EntityViewManager evm = ManagerLocator.getInstance().getManager(EntityViewManager.class);
	EntityManager em = ManagerLocator.getInstance().getManager(EntityManager.class);

	User user = (User) em.load(auth.getUser().getOid(), auth.getUser().getVersion(), User.DEFINITION_NAME);

      out.write("<h2 class=\"hgroup-01\">\n");
      out.write("<span>\n");
      out.write("<i class=\"far fa-circle default-icon\"></i>\n");
      out.write("</span>\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:rs(\"mtp-gem-messages\", \"auth.Password.changeUserInfo\")}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</h2>\n");
      out.write("<div class=\"user-profile\">\n");
      out.write("<h3 class=\"hgroup-02 hgroup-02-01\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:rs(\"mtp-gem-messages\", \"auth.Password.enterPass\")}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</h3>\n");

if (!"true".equals(request.getAttribute(Constants.UPDATE_USER_INFO))) {
	if ("SUCCESS".equals(request.getAttribute(WebRequestConstants.COMMAND_RESULT))) {

      out.write("<div class=\"completePasswordChange\">\n");
      out.write("			<span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:rs(\"mtp-gem-messages\", \"auth.Password.successMsg\")}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</span>\n");
      out.write("		</div>\n");

	}

      out.write("<div class=\"error\" style=\"color:red;\">\n");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent(null);
      // /jsp/gem/auth/Password.jsp(139,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue( errorMessage );
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      out.write("</div>\n");

}

      out.write("<form method=\"POST\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:tcPath()}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_1));
      out.write('/');
      out.print(UpdatePasswordCommand.ACTION_DO_UPDATE_PASSWORD);
      out.write("\">\n");
      out.write("<div class=\"formArchive\">\n");
      out.write("<div>\n");
      out.write("<table class=\"tbl-maintenance tbl-section mb10\">\n");
      out.write("<tbody><tr>\n");
      out.write("<th class=\"section-data col1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:rs(\"mtp-gem-messages\", \"auth.Password.curPass\")}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</th>\n");
      out.write("<td class=\"section-data col1\">\n");
      out.write("<input type=\"password\" name=\"");
      out.print( AuthCommandConstants.PARAM_PASSWORD );
      out.write("\" value=\"\" class=\"form-size-01 inpbr\" />\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<th class=\"section-data col1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:rs(\"mtp-gem-messages\", \"auth.Password.newPass\")}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</th>\n");
      out.write("<td class=\"section-data col1\"><input type=\"password\" name=\"");
      out.print( AuthCommandConstants.PARAM_NEW_PASSWORD );
      out.write("\" value=\"\" class=\"form-size-01 inpbr\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<th class=\"section-data col1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:rs(\"mtp-gem-messages\", \"auth.Password.cnfrmNewPass\")}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</th>\n");
      out.write("<td class=\"section-data col1\"><input type=\"password\" name=\"");
      out.print( AuthCommandConstants.PARAM_CONFIRM_PASSWORD );
      out.write("\" value=\"\" class=\"form-size-01 inpbr\" /></td>\n");
      out.write("</tr>\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<p class=\"mb30\"><input type=\"submit\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:rs(\"mtp-gem-messages\", \"auth.Password.save\")}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(" class=\"gr-btn\" /></p>\n");
      out.write("</form>\n");

	if (user != null && setting != null) {
		EntityDefinition ed = edm.get(defName);
		EntityView view = evm.get(defName);
		DetailFormView form = view.getDetailFormView(setting.getViewName());
		List<PropertyItem> propList = getProperty(form, user);
		if (propList.size() > 0) {
			// 自身の情報更新は特権実行で行う

      //  m:auth
      org.iplass.mtp.web.template.tags.AuthTag _jspx_th_m_005fauth_005f0 = (org.iplass.mtp.web.template.tags.AuthTag) _005fjspx_005ftagPool_005fm_005fauth_0026_005fprivileged.get(org.iplass.mtp.web.template.tags.AuthTag.class);
      _jspx_th_m_005fauth_005f0.setPageContext(_jspx_page_context);
      _jspx_th_m_005fauth_005f0.setParent(null);
      // /jsp/gem/auth/Password.jsp(177,0) name = privileged type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_m_005fauth_005f0.setPrivileged(java.lang.Boolean.valueOf("true"));
      int[] _jspx_push_body_count_m_005fauth_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_m_005fauth_005f0 = _jspx_th_m_005fauth_005f0.doStartTag();
        if (_jspx_eval_m_005fauth_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("<h3 class=\"hgroup-02 hgroup-02-01\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:rs(\"mtp-gem-messages\", \"auth.Password.inputUserInfo\")}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
            out.write("</h3>\n");
            out.write("<form action=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:tcPath()}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_1));
            out.write('/');
            out.print(UpdateUserCommand.ACTION_NAME);
            out.write("\" method=\"POST\">\n");
            out.write("<input type=\"hidden\" name=\"defName\" value=\"");
            //  c:out
            org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
            _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
            _jspx_th_c_005fout_005f1.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_m_005fauth_005f0);
            // /jsp/gem/auth/Password.jsp(180,43) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_c_005fout_005f1.setValue(User.DEFINITION_NAME);
            int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
            if (_jspx_th_c_005fout_005f1.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              return;
            }
            _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
            out.write("\" />\n");
            out.write("<input type=\"hidden\" name=\"oid\" value=\"");
            //  c:out
            org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
            _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
            _jspx_th_c_005fout_005f2.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_m_005fauth_005f0);
            // /jsp/gem/auth/Password.jsp(181,39) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_c_005fout_005f2.setValue(user.getOid());
            int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
            if (_jspx_th_c_005fout_005f2.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              return;
            }
            _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
            out.write("\" />\n");
            out.write("<input type=\"hidden\" name=\"version\" value=\"");
            //  c:out
            org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
            _jspx_th_c_005fout_005f3.setPageContext(_jspx_page_context);
            _jspx_th_c_005fout_005f3.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_m_005fauth_005f0);
            // /jsp/gem/auth/Password.jsp(182,43) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_c_005fout_005f3.setValue(user.getVersion());
            int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
            if (_jspx_th_c_005fout_005f3.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              return;
            }
            _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
            out.write("\" />\n");
            out.write("<input type=\"hidden\" name=\"timestamp\" value=\"");
            //  c:out
            org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
            _jspx_th_c_005fout_005f4.setPageContext(_jspx_page_context);
            _jspx_th_c_005fout_005f4.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_m_005fauth_005f0);
            // /jsp/gem/auth/Password.jsp(183,45) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_c_005fout_005f4.setValue(user.getUpdateDate().getTime());
            int _jspx_eval_c_005fout_005f4 = _jspx_th_c_005fout_005f4.doStartTag();
            if (_jspx_th_c_005fout_005f4.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              return;
            }
            _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
            out.write("\" />\n");
            out.write("<input type=\"hidden\" name=\"roleName\" value=\"");
            //  c:out
            org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
            _jspx_th_c_005fout_005f5.setPageContext(_jspx_page_context);
            _jspx_th_c_005fout_005f5.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_m_005fauth_005f0);
            // /jsp/gem/auth/Password.jsp(184,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_c_005fout_005f5.setValue(roleName);
            int _jspx_eval_c_005fout_005f5 = _jspx_th_c_005fout_005f5.doStartTag();
            if (_jspx_th_c_005fout_005f5.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              return;
            }
            _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f5);
            out.write("\" />\n");

if ("true".equals(request.getAttribute(Constants.UPDATE_USER_INFO))) {
	if ("SUCCESS".equals(request.getAttribute(WebRequestConstants.COMMAND_RESULT))) {

            out.write("<div class=\"completePasswordChange\">\n");
            out.write("			<span>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:rs(\"mtp-gem-messages\", \"auth.Password.updateUserInfoMsg\")}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
            out.write("</span>\n");
            out.write("		</div>\n");

	}

            out.write("<div class=\"error\" style=\"color:red;\">\n");
            //  c:out
            org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
            _jspx_th_c_005fout_005f6.setPageContext(_jspx_page_context);
            _jspx_th_c_005fout_005f6.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_m_005fauth_005f0);
            // /jsp/gem/auth/Password.jsp(196,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_c_005fout_005f6.setValue( errorMessage );
            int _jspx_eval_c_005fout_005f6 = _jspx_th_c_005fout_005f6.doStartTag();
            if (_jspx_th_c_005fout_005f6.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              return;
            }
            _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f6);
            out.write("</div>\n");

}

            out.write("<div class=\"formArchive\">\n");
            out.write("<div>\n");
            out.write("<table class=\"tbl-maintenance tbl-section\">\n");
            out.write("<tbody>\n");

			request.setAttribute(Constants.DEF_NAME, defName);
			request.setAttribute(Constants.ROOT_DEF_NAME, defName); //NestTableの場合にDEF_NAMEが置き換わるので別名でRootのDefNameをセット
			request.setAttribute(Constants.ROOT_ENTITY, user); //NestTableの場合に内部の表示判定スクリプトで利用
			request.setAttribute(Constants.VIEW_NAME, setting.getViewName());
			request.setAttribute(Constants.OUTPUT_TYPE, OutputType.EDIT);
			request.setAttribute(Constants.ENTITY_DEFINITION, ed);
			request.setAttribute(Constants.EXEC_TYPE, Constants.EXEC_TYPE_UPDATE);
			request.setAttribute(Constants.ENTITY_DATA, user);
			for (PropertyItem property : propList) {
				boolean isPropertyUpdatable = auth.checkPermission(new EntityPropertyPermission(defName, property.getPropertyName(), EntityPropertyPermission.Action.UPDATE));
				if (isPropertyUpdatable) {
					request.setAttribute(Constants.ELEMENT, property);

					String path = EntityViewUtil.getJspPath(property, ViewConst.DESIGN_TYPE_GEM);
					if (path != null) {

            out.write("<tr>\n");
            org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, path , out, false);
            out.write("</tr>\n");

					}
				}
			}

            out.write("</tbody>\n");
            out.write("</table>\n");
            out.write("</div>\n");
            out.write("</div>\n");
            out.write("<p><input type=\"submit\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:rs('mtp-gem-messages', 'auth.Password.save')}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
            out.write("\" class=\"gr-btn\" /></p>\n");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:outputToken('FORM_XHTML', true)}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_2));
            out.write("</form>\n");
            int evalDoAfterBody = _jspx_th_m_005fauth_005f0.doAfterBody();
            if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_m_005fauth_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_m_005fauth_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_m_005fauth_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_m_005fauth_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fm_005fauth_0026_005fprivileged.reuse(_jspx_th_m_005fauth_005f0);

		}
	}

      out.write("</div>\n");
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
