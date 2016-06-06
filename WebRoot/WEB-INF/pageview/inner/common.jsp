<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'common.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="<%=path%>/resources/js/easyui/jquery-easyui-theme/default/easyui.css" rel="stylesheet" type="text/css" />
    <link href="<%=path%>/resources/js/easyui/jquery-easyui-theme/icon.css" rel="stylesheet" type="text/css" />
    <link href="<%=path%>/resources/js/easyui/icons/icon-all.css" rel="stylesheet" type="text/css" />

    <script src="<%=path%>/resources/js/easyui/jquery/jquery-1.11.1.js" type="text/javascript"></script>
    <!--<script src="<%=path%>/resources/js/easyui/jquery/jquery-1.11.1.min.js"></script>-->

    <script src="<%=path%>/resources/js/easyui/jquery-easyui-1.3.6/jquery.easyui.min.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jquery-easyui-1.3.6/locale/easyui-lang-zh_CN.js" type="text/javascript"></script>

    <script src="<%=path%>/resources/js/easyui/jquery.jdirk.js" type="text/javascript"></script>
    <!--<script src="<%=path%>/resources/js/easyui/release/jquery.jdirk.min.js"></script>-->

    <link href="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.css" rel="stylesheet" type="text/css" />

    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.progressbar.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.slider.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.linkbutton.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.form.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.validatebox.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.combo.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.combobox.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.menu.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.searchbox.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.panel.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.window.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.dialog.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.layout.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.tree.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.datagrid.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.treegrid.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.combogrid.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.combotree.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.tabs.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.theme.js" type="text/javascript"></script>
    <!--<script src="<%=path%>/resources/js/easyui/release/jeasyui.extensions.all.min.js"></script>-->

    <script src="<%=path%>/resources/js/easyui/icons/jeasyui.icons.all.js" type="text/javascript"></script>
    <!--<script src="<%=path%>/resources/js/easyui/release/jeasyui.icons.all.min.js"></script>-->

    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.icons.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.gridselector.js" type="text/javascript"></script>

    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jquery.toolbar.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jquery.comboicons.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jquery.comboselector.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jquery.portal.js" type="text/javascript"></script>

    <script src="<%=path%>/resources/js/easyui/common/plugin-import.js"></script>

    <style type="text/css">
        body {
            padding: 0px;
            margin: 0px;
            font-size: 12px;
        }

        .panel-container {
            padding: 0px 10px 10px 10px;
        }

        .panel-noborder {
            border-left-width: 0px;
            border-top-width: 0px;
            border-right-width: 0px;
        }
    </style>

    <script type="text/javascript">
        $.util.namespace("$.easyui");
        $.easyui.showSourceDialog = function (url, options) {
            var defaults = { title: $.string.format("查看页面\"{0}\"的源码", url), width: 800, height: 600, enableCloseButton: false, enableApplyButton: false },
                opts = typeof options == "string"
                    ? $.extend({}, defaults, { title: options, content: "<textarea></textarea>", topMost: false, maximizable: true })
                    : $.extend({}, defaults, options || {}, { content: "<textarea></textarea>", topMost: false });
            $.easyui.showDialog(opts).find("textarea").codemirror({
                fit: true, url: url, border: false, readOnly: true, bodyCls: "panel-noborder", fontSize: "13px", lineHeight: "15px"
            });
        };

        $(function () {
            var path = $.util.request["path"];

            $.ajaxSetup({
                statusCode: {
                    404: function (XMLHttpRequest, status, error) {
                        if ($.util.browser.chrome && !XMLHttpRequest.responseText) {
                            alert("IE11及WebKit核心的浏览器(包括 Chrome、搜狗/傲游/360等等的极速模式)浏览器下不支持 AJAX 本地访问，请选择其他浏览器进行浏览操作！");
                        }
                    }
                }
            });

            var containerTabs = $("#containerTabs"), tabsOpts = containerTabs.tabs("options"),
                onSelect = tabsOpts.onSelect, isLoaded = false,
                cookieTheme = $.cookie("themeName"), theme = cookieTheme ? cookieTheme : $.util.$.easyui.theme(),
                openNewPage = function (node) {
                    var n = node || {}, attrs = node.attributes || {}, opts = $.extend({}, n, { title: n.text }, attrs);
                    if (!opts.href) { return; }
                    <%-- window.open("<%=path%>/resources/js/easyui/" + opts.href, "_blank"); --%>
                    window.open("..js/" + opts.href, "_blank");
                },
                addModuleTab = $.util.parent && $.util.parent.mainpage && $.isFunction($.util.parent.mainpage.addModuleTab) ? $.util.parent.mainpage.addModuleTab : openNewPage,
                t = $("#tt");
			//containerTabs.tabs('disableTab',1);
            $("#demo").each(function () {
                var p = $(this), opts = p.panel("options"), onLoad = opts.onLoad;
                opts.onLoad = function () {
                    if ($.isFunction(onLoad)) { onLoad.apply(this, arguments); }
                    p.find(":header:first").each(function () { document.title = $(this).text(); });
                };
                p.panel("refresh", path);

                $("#codemirror").codemirror({
                    fit: true, url: path, readOnly: true, border: true, bodyCls: "panel-noborder", fontSize: "13px", lineHeight: "15px"
                });
            });

            $.easyui.theme(theme);

            tabsOpts.onSelect = function (title, index) {
                if ($.isFunction(onSelect)) { onSelect.apply(this, arguments); }
                <%-- if (index == 2 && !isLoaded) {
                    t.tree({
                        animate: true,
                        lines: true,
                        toggleOnClick: true,
                        selectOnContextMenu: true,
                        dataPlain: false,
                        showOption: true,
                        url: "<%=path%>/resources/js/easyui/common/nav-api-menu-data.json",
                        method: "get",
                        onClick: function (node) { addModuleTab(node); },
                        onLoadSuccess: function (node, data) { t.tree("collapseAll"); },
                        contextMenu: [
                            {
                                text: "打开/转到", hideDisabledMenu: true, iconCls: "icon-standard-application-add",
                                disabled: function (e, node) {
                                    return (!node.attributes || !node.attributes.href || openNewPage === addModuleTab) ? true : false;
                                },
                                handler: function (e, node) { addModuleTab(node); }
                            },
                            {
                                text: "在新页面中打开", iconCls: "icon-standard-shape-move-forwards", bold: openNewPage === addModuleTab,
                                disabled: function (e, node) {
                                    return (!node.attributes || !node.attributes.href) ? true : false;
                                },
                                handler: function (e, node) { openNewPage(node); }
                            },
                            "-",
                            { text: "刷新", iconCls: "icon-cologne-refresh", handler: function (e, node) { t.tree("reload"); } }
                        ],
                        onAfterEdit: function (node) { window.mainpage.nav.rename(node.id, node.text); }
                    });
                    isLoaded = true;
                } --%>
            };
        });
    </script>
</head>
<body>
    <div id="containerTabs" class="easyui-tabs" data-options="fit: true, border: false, showOption: false, enableNewTabMenu: false, tabPosition: 'bottom', headerWidth: 100">
        <div id="demo" class="panel-container" data-options="title: '数据浏览',refreshable: false, iconCls: 'icon-hamburg-advertising', selected: true" style="position: relative;">
            
        </div>
        <div id="code" data-options="title: '数据编辑',refreshable: false, iconCls: 'icon-standard-script-code'">
            dfgfdgfdgdfg
        </div>
    </div>
<!--     <div style="display: none;">
        <script type="text/javascript">
            var cnzz_protocol = (("https:" == document.location.protocol) ? " https://" : " http://");
            document.write(unescape("%3Cspan id='cnzz_stat_icon_5654850'%3E%3C/span%3E%3Cscript src='" + cnzz_protocol + "s9.cnzz.com/stat.php%3Fid%3D5654850%26show%3Dpic' type='text/javascript'%3E%3C/script%3E"));
        </script>
    </div> -->
</body>
</html>
