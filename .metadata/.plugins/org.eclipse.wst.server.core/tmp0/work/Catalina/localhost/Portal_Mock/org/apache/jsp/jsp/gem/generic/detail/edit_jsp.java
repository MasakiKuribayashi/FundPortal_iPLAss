/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.34
 * Generated at: 2025-02-27 05:29:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.gem.generic.detail;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import org.iplass.mtp.entity.Entity;
import org.iplass.mtp.util.StringUtil;
import org.iplass.mtp.view.generic.*;
import org.iplass.mtp.view.generic.element.section.*;
import org.iplass.mtp.web.template.TemplateUtil;
import org.iplass.gem.command.generic.delete.DeleteCommand;
import org.iplass.gem.command.generic.detail.DetailViewCommand;
import org.iplass.gem.command.generic.detail.DetailFormViewData;
import org.iplass.gem.command.generic.detail.InsertCommand;
import org.iplass.gem.command.generic.detail.UpdateCommand;
import org.iplass.gem.command.generic.search.SearchViewCommand;
import org.iplass.gem.command.Constants;
import org.iplass.gem.command.GemResourceBundleUtil;
import org.iplass.gem.command.ViewUtil;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;
private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_1;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("m:rs", org.iplass.mtp.web.template.ELFunctions.class, "rs", new Class[] {java.lang.String.class, java.lang.String.class});
  _jspx_fnmap_1= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("m:outputToken", org.iplass.mtp.web.template.ELFunctions.class, "outputToken", new Class[] {java.lang.Object.class, boolean.class});
}

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/mtp.tld", Long.valueOf(1738207446000L));
    _jspx_dependants.put("/jsp/gem/layout/resource/mediaelementResource.inc.jsp", Long.valueOf(1738207466000L));
    _jspx_dependants.put("/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.1.jar", Long.valueOf(1737625086258L));
    _jspx_dependants.put("jar:file:/C:/pleiades/2024-12/workspace/Portal_Mock/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Portal_Mock/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.1.jar!/META-INF/c.tld", Long.valueOf(1664421078000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(7);
    _jspx_imports_packages.add("org.iplass.mtp.view.generic.element.section");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_packages.add("org.iplass.mtp.view.generic");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(16);
    _jspx_imports_classes.add("org.iplass.mtp.entity.Entity");
    _jspx_imports_classes.add("org.iplass.gem.command.generic.detail.UpdateCommand");
    _jspx_imports_classes.add("org.iplass.gem.command.generic.detail.InsertCommand");
    _jspx_imports_classes.add("org.iplass.gem.command.Constants");
    _jspx_imports_classes.add("org.iplass.mtp.web.template.TemplateUtil");
    _jspx_imports_classes.add("org.iplass.gem.command.generic.detail.DetailFormViewData");
    _jspx_imports_classes.add("org.iplass.gem.command.generic.delete.DeleteCommand");
    _jspx_imports_classes.add("org.iplass.gem.command.generic.search.SearchViewCommand");
    _jspx_imports_classes.add("org.iplass.gem.command.ViewUtil");
    _jspx_imports_classes.add("org.iplass.gem.command.generic.detail.DetailViewCommand");
    _jspx_imports_classes.add("org.iplass.mtp.util.StringUtil");
    _jspx_imports_classes.add("org.iplass.gem.command.GemResourceBundleUtil");
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


	String newversion = request.getParameter(Constants.NEWVERSION);
	String backPath = request.getParameter(Constants.BACK_PATH);
	String topViewListOffset = request.getParameter(Constants.TOPVIEW_LIST_OFFSET);
	if (topViewListOffset == null) {topViewListOffset = "";}
	boolean fromView = request.getParameter(Constants.FROM_VIEW) != null
						&& "true".equals(request.getParameter(Constants.FROM_VIEW));

	//コマンドから
	DetailFormViewData data = (DetailFormViewData) request.getAttribute(Constants.DATA);
	String searchCond = (String) request.getAttribute(Constants.SEARCH_COND);
	String message = (String) request.getAttribute(Constants.MESSAGE);

	OutputType type = OutputType.EDIT;
	String contextPath = TemplateUtil.getTenantContextPath();
	DetailFormView form = data.getView();

	String defName = data.getEntityDefinition().getName();
	String viewName = form.getName();

	//表示名
	String displayName = TemplateUtil.getMultilingualString(form.getTitle(), form.getLocalizedTitleList(),
			data.getEntityDefinition().getDisplayName(), data.getEntityDefinition().getLocalizedDisplayNameList());
	//新規or更新
	String execType = data.getExecType();
	//数値のカンマ区切りのセパレータ
	String separator = ViewUtil.getGroupingSeparator();
	//css用クラス
	String className = defName.replaceAll("\\.", "_");
	//タイトルのアイコン
	String imageColor = ViewUtil.getEntityImageColor(form);
	String imageColorStyle = "";
	if (imageColor != null) {
		imageColorStyle = "imgclr_" + imageColor;
	}

	String iconTag = ViewUtil.getIconTag(form);

	//編集対象
	String oid = null;
	Long updateDate = null;
	Long version = null;
	if (data.getEntity() != null) {
		oid = data.getEntity().getOid();
		version = data.getEntity().getVersion();
		if (data.getEntity().getUpdateDate() != null) {
			updateDate = data.getEntity().getUpdateDate().getTime();
		}

		//参照プロパティで利用
		request.setAttribute(Constants.EDITOR_PARENT_ENTITY, data.getEntity());
	}

	//ビュー名があればアクションの後につける
	String urlPath = ViewUtil.getParamMappingPath(defName, viewName);

	//キャンセルアクション
	String cancel = "";
	boolean moveToView = false;
	boolean moveToSearchList = false;
	if (StringUtil.isNotBlank(form.getCancelActionName())) {
		//指定Actionに遷移
		cancel = form.getCancelActionName() + urlPath;
	} else if (fromView) {
		if (StringUtil.isNotEmpty(backPath) && ViewUtil.isTopViewEditCancelBackToTop()) {
			//backPathに遷移
			cancel = backPath;
		} else {
			//詳細画面に遷移
			SearchFormView searchView = (SearchFormView)ViewUtil.getFormView(defName, viewName, true);
			String viewAction = DetailViewCommand.VIEW_ACTION_NAME;
			if (searchView != null && StringUtil.isNotBlank(searchView.getViewActionName())) {
				viewAction = searchView.getViewActionName();
			}
			cancel = viewAction + urlPath;
			moveToView = true;
		}
	} else {
		if (StringUtil.isEmpty(backPath)) {
			//検索画面に遷移(検索結果から直接編集画面を起動。TopViewからの場合はbackPath指定あり)
			cancel = SearchViewCommand.SEARCH_ACTION_NAME + urlPath;
			moveToSearchList = true;
		} else {
			//backPathに遷移
			cancel = backPath;
		}
	}

	//formにセットする初期アクション（Enter押下時に実行）
	String defaultAction = "";
	if (Constants.EXEC_TYPE_UPDATE.equals(execType)) {
		if (StringUtil.isNotBlank(form.getUpdateActionName())) {
			defaultAction = contextPath + "/" + form.getUpdateActionName() + urlPath;
		} else {
			defaultAction = contextPath + "/" + UpdateCommand.UPDATE_ACTION_NAME + urlPath;
		}
	} else {
		if (StringUtil.isNotBlank(form.getInsertActionName())) {
			defaultAction = contextPath + "/" + form.getInsertActionName() + urlPath;
		} else {
			defaultAction = contextPath + "/" + InsertCommand.INSERT_ACTION_NAME + urlPath;
		}
	}

	//各プロパティでの権限チェック用に定義名をリクエストに保存
	request.setAttribute(Constants.DEF_NAME, defName);
	request.setAttribute(Constants.ROOT_DEF_NAME, defName);	//NestTableの場合にDEF_NAMEが置き換わるので別名でRootのDefNameをセット

	Entity rootEntity = null;
	//更新の時のみ、エンティティを設定します。新規の場合はnullを設定します。
	if (Constants.EXEC_TYPE_UPDATE.equals(execType)) {
		rootEntity = data.getEntity();
	}
	//新規時に初期化スクリプト定義が存在する場合、data.getEntity()がnullにならないので、nullに統一するために別のキー名としてスコープに保持しなければなりません。。
	request.setAttribute(Constants.ROOT_ENTITY, rootEntity); //NestTableの場合に内部の表示判定スクリプトで利用

	//editor以下で参照するパラメータ
	request.setAttribute(Constants.VIEW_NAME, viewName);

	//section以下で参照するパラメータ
	request.setAttribute(Constants.OUTPUT_TYPE, type);
	request.setAttribute(Constants.ENTITY_DATA, data.getEntity());
	request.setAttribute(Constants.ENTITY_DEFINITION, data.getEntityDefinition());
	request.setAttribute(Constants.EXEC_TYPE, execType);

	//ボタンのカスタムスタイル用のscriptKey
	request.setAttribute(Constants.FORM_SCRIPT_KEY, form.getScriptKey());

      out.write("<h2 class=\"hgroup-01\">\n");
      out.write("<span class=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent(null);
      // /jsp/gem/generic/detail/edit.jsp(169,13) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue(imageColorStyle);
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      out.write('"');
      out.write('>');
      out.write('\n');
if (StringUtil.isNotBlank(iconTag)) {
      out.print(iconTag);
} else {
      out.write("<i class=\"far fa-circle default-icon\"></i>\n");
} 
      out.write("</span>\n");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f1.setParent(null);
      // /jsp/gem/generic/detail/edit.jsp(176,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f1.setValue( displayName );
      int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
      if (_jspx_th_c_005fout_005f1.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      out.write("</h2>\n");
      out.write("<div class=\"generic_detail detail_edit d_");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f2.setParent(null);
      // /jsp/gem/generic/detail/edit.jsp(179,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f2.setValue(className );
      int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
      if (_jspx_th_c_005fout_005f2.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      out.write('"');
      out.write('>');
      out.write('\n');
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staticContentPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/webjars/mediaelement/4.2.17/build/mediaelement-and-player.min.js?cv=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${apiVersion}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staticContentPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/webjars/mediaelement/4.2.17/build/mediaelementplayer.min.css?cv=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${apiVersion}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("separator = \"");
      out.print( separator );
      out.write("\";\n");
      out.write("\n");
      out.write("function confirm_delete(action, target, hidden) {\n");
      out.write("	if (confirm(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:rs('mtp-gem-messages', 'generic.detail.detail.deleteMsg')}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("\")) {\n");
      out.write("		button_onclick(action, hidden);\n");
      out.write("		if (target) $(target).prop(\"disabled\", true);\n");
      out.write("	}\n");
      out.write("}\n");
      out.write("function onclick_save(action, target, hidden) {\n");
      out.write("	if ($(\"#confirmEditSave\").val() == \"true\" && !confirm(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:rs('mtp-gem-messages', 'generic.detail.detail.saveMsg')}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("\")) {\n");
      out.write("		return;\n");
      out.write("	}\n");
      out.write("\n");
      out.write("	if (!validation()) return;\n");
      out.write("\n");
      out.write("	button_onclick(action, hidden);\n");
      out.write("	if (target) $(target).prop(\"disabled\", true);\n");
      out.write("}\n");
      out.write("function onclick_insert(action, target, hidden) {\n");
      out.write("	if ($(\"#confirmEditSave\").val() == \"true\" && !confirm(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:rs('mtp-gem-messages', 'generic.detail.detail.saveMsg')}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("\")) {\n");
      out.write("		return;\n");
      out.write("	}\n");
      out.write("\n");
      out.write("	if (!validation()) return;\n");
      out.write("\n");
      out.write("	button_onclick(action, hidden);\n");
      out.write("	if (target) $(target).prop(\"disabled\", true);\n");
      out.write("}\n");
      out.write("function button_onclick(action, hidden) {\n");
      out.write("	var $form = $(\"#detailForm\");\n");
      out.write("	if (hidden) {\n");
      out.write("		if ($form) {\n");
      out.write("			for (var keyString in hidden) {\n");
      out.write("				$form.prepend(\"<input type='hidden\\' name='\" + keyString + \"' value='\" + hidden[keyString] + \"'/>\");\n");
      out.write("			}\n");
      out.write("		}\n");
      out.write("	}\n");
      out.write("	$form.attr(\"action\", contextPath + \"/\" + action).submit();\n");
      out.write("}\n");
      out.write("function cancel() {\n");
      out.write("	if ($(\"#confirmEditCancel\").val() == \"true\" && !confirm(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:rs('mtp-gem-messages', 'generic.detail.detail.cancelMsg')}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("\")) {\n");
      out.write("		return;\n");
      out.write("	}\n");
      out.write("\n");
	if (moveToView) { 
      out.write("\n");
      out.write("	var cancelPath = contextPath + \"/");
      out.print(StringUtil.escapeJavaScript(cancel));
      out.write("\" + \"/\" + encodeURIComponent($(\":hidden[name='oid']\").val());\n");
	} else { 
      out.write("\n");
      out.write("	var cancelPath = contextPath + \"/");
      out.print(StringUtil.escapeJavaScript(cancel));
      out.write('"');
      out.write(';');
      out.write('\n');
	} 
      out.write("\n");
      out.write("	submitForm(cancelPath, {\n");
	if (!moveToSearchList) {
		//一覧に戻らない場合

      out.print(Constants.VERSION);
      out.write(":$(\":hidden[name='version']\").val(),\n");
      out.write("		");
      out.print(Constants.BACK_PATH);
      out.write(":$(\":hidden[name='backPath']\").val(),\n");
	}
	//一覧画面表示用

      out.print(Constants.SEARCH_COND);
      out.write(":$(\":hidden[name='searchCond']\").val(),\n");
      out.write("		");
      out.print(Constants.TOPVIEW_LIST_OFFSET);
      out.write(':');
      out.write('"');
      out.print(StringUtil.escapeJavaScript(topViewListOffset));
      out.write("\"\n");
      out.write("	});\n");
      out.write("}\n");
      out.write("function validation() {\n");
      out.write("	");
      out.write("\n");
      out.write("	var ret = editValidate();\n");
      out.write("	var message = !ret ? \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:rs('mtp-gem-messages', 'command.generic.detail.DetailCommandBase.inputErr')}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("\" : \"\";\n");
      out.write("	$(\".detail_edit > .page-error\").text(message);\n");
      out.write("	return ret;\n");
      out.write("}\n");
      out.write("$(function(){\n");
      out.write("	$('.disabled-btn').removeAttr('disabled');\n");
      out.write("});\n");
      out.write("</script>\n");

	if (form.isValidJavascriptDetailPage() && StringUtil.isNotBlank(form.getJavaScript())) {
		//View定義で設定されたJavaScript

      out.write("<script type=\"text/javascript\">\n");
      out.print(form.getJavaScript());
      out.write("</script>\n");

	}

      out.write("<h3 class=\"hgroup-02 hgroup-02-01\">");
      out.print( GemResourceBundleUtil.resourceString("generic.detail.detail.edit", displayName) );
      out.write("</h3>\n");
      out.write("<span class=\"error page-error\">\n");

	if (StringUtil.isNotBlank(message)) {

      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f3.setParent(null);
      // /jsp/gem/generic/detail/edit.jsp(270,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f3.setValue( message );
      int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
      if (_jspx_th_c_005fout_005f3.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);

	}

      out.write("</span>\n");
      out.write("<form id=\"detailForm\" method=\"post\" action=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f4.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f4.setParent(null);
      // /jsp/gem/generic/detail/edit.jsp(275,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f4.setValue(defaultAction);
      int _jspx_eval_c_005fout_005f4 = _jspx_th_c_005fout_005f4.doStartTag();
      if (_jspx_th_c_005fout_005f4.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
      out.write("\">\n");
      out.write("<input type=\"hidden\" name=\"");
      out.print(Constants.DEF_NAME);
      out.write("\" value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f5.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f5.setParent(null);
      // /jsp/gem/generic/detail/edit.jsp(276,59) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f5.setValue(defName);
      int _jspx_eval_c_005fout_005f5 = _jspx_th_c_005fout_005f5.doStartTag();
      if (_jspx_th_c_005fout_005f5.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f5);
      out.write("\" />\n");
      out.write("<input type=\"hidden\" name=\"");
      out.print(Constants.SEARCH_COND);
      out.write("\" value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f6.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f6.setParent(null);
      // /jsp/gem/generic/detail/edit.jsp(277,62) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f6.setValue(searchCond);
      int _jspx_eval_c_005fout_005f6 = _jspx_th_c_005fout_005f6.doStartTag();
      if (_jspx_th_c_005fout_005f6.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f6);
      out.write("\" />\n");
      out.write("<input type=\"hidden\" name=\"");
      out.print(Constants.EXEC_TYPE);
      out.write("\" value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f7 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f7.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f7.setParent(null);
      // /jsp/gem/generic/detail/edit.jsp(278,60) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f7.setValue(execType);
      int _jspx_eval_c_005fout_005f7 = _jspx_th_c_005fout_005f7.doStartTag();
      if (_jspx_th_c_005fout_005f7.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f7);
      out.write("\" />\n");
      out.write("<input type=\"hidden\" name=\"");
      out.print(Constants.BACK_PATH);
      out.write("\" value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f8 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f8.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f8.setParent(null);
      // /jsp/gem/generic/detail/edit.jsp(279,60) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f8.setValue(backPath);
      int _jspx_eval_c_005fout_005f8 = _jspx_th_c_005fout_005f8.doStartTag();
      if (_jspx_th_c_005fout_005f8.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f8);
      out.write("\" />\n");
      out.write("<input type=\"hidden\" name=\"");
      out.print(Constants.TOPVIEW_LIST_OFFSET);
      out.write("\" value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f9 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f9.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f9.setParent(null);
      // /jsp/gem/generic/detail/edit.jsp(280,70) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f9.setValue(topViewListOffset);
      int _jspx_eval_c_005fout_005f9 = _jspx_th_c_005fout_005f9.doStartTag();
      if (_jspx_th_c_005fout_005f9.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f9);
      out.write("\" />\n");

	if (newversion != null) {

      out.write("<input type=\"hidden\" name=\"");
      out.print(Constants.NEWVERSION);
      out.write("\" value=\"true\" />\n");

	}
	if (oid != null) {

      out.write("<input type=\"hidden\" name=\"");
      out.print(Constants.OID);
      out.write("\" value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f10 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f10.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f10.setParent(null);
      // /jsp/gem/generic/detail/edit.jsp(289,54) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f10.setValue(oid);
      int _jspx_eval_c_005fout_005f10 = _jspx_th_c_005fout_005f10.doStartTag();
      if (_jspx_th_c_005fout_005f10.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f10);
      out.write("\" />\n");

	}
	if (updateDate != null) {

      out.write("<input type=\"hidden\" name=\"");
      out.print(Constants.TIMESTAMP);
      out.write("\" value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f11 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f11.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f11.setParent(null);
      // /jsp/gem/generic/detail/edit.jsp(294,60) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f11.setValue(updateDate);
      int _jspx_eval_c_005fout_005f11 = _jspx_th_c_005fout_005f11.doStartTag();
      if (_jspx_th_c_005fout_005f11.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f11);
      out.write("\" />\n");

	}
	if (version != null) {

      out.write("<input type=\"hidden\" name=\"");
      out.print(Constants.VERSION);
      out.write("\" value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f12 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f12.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f12.setParent(null);
      // /jsp/gem/generic/detail/edit.jsp(299,58) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f12.setValue(version);
      int _jspx_eval_c_005fout_005f12 = _jspx_th_c_005fout_005f12.doStartTag();
      if (_jspx_th_c_005fout_005f12.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f12);
      out.write("\" />\n");

	}

      out.write("<input type=\"hidden\" id=\"confirmEditSave\" value=\"");
      out.print(ViewUtil.isConfirmEditSave());
      out.write("\" />\n");
      out.write("<input type=\"hidden\" id=\"confirmEditCancel\" value=\"");
      out.print(ViewUtil.isConfirmEditCancel());
      out.write("\" />\n");
      out.write("<div class=\"operation-bar operation-bar_top\">\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "editButton.inc.jsp", out, false);
      out.write("<ul class=\"nav-disc-all\">\n");
      out.write("<li class=\"all-open\"><a href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:rs(\"mtp-gem-messages\", \"generic.detail.detail.allOpen\")}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</a></li>\n");
      out.write("<li class=\"all-close\"><a href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:rs(\"mtp-gem-messages\", \"generic.detail.detail.allClose\")}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</a></li>\n");
      out.write("</ul>\n");
      out.write("</div><!--operation-bar-->\n");

	request.setAttribute(Constants.NAV_SECTION, form.getSections());

      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sectionNavi.inc.jsp", out, false);

	for (Section section : form.getSections()) {
		if (!EntityViewUtil.isDisplayElement(defName, section.getElementRuntimeId(), OutputType.EDIT, rootEntity)
				|| !ViewUtil.dispElement(section)) {
			continue;
		}
		request.setAttribute(Constants.ELEMENT, section);

		String path = EntityViewUtil.getJspPath(section, ViewConst.DESIGN_TYPE_GEM);
		if (path != null) {

      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, path , out, false);

		}
	}

      out.write("<div class=\"operation-bar operation-bar_bottom\">\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "editButton.inc.jsp", out, false);
      out.write("</div><!--operation-bar-->\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m:outputToken('FORM_XHTML', true)}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_1));
      out.write("</form>\n");
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
