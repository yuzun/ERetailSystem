<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>易成内部管理系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<link href="<%=path%>/resources/js/easyui/jquery-easyui-theme/default/easyui.css" rel="stylesheet" type="text/css" />
    <link href="<%=path%>/resources/js/easyui/jquery-easyui-theme/icon.css" rel="stylesheet" type="text/css" />
    <link href="<%=path%>/resources/js/easyui/icons/icon-all.css" rel="stylesheet" type="text/css" />

    <script src="<%=path%>/resources/js/easyui/jquery/jquery-1.11.1.js" type="text/javascript"></script>
    <!--<script src="jquery/jquery-1.11.1.min.js"></script>-->

    <script src="<%=path%>/resources/js/easyui/jquery-easyui-1.3.6/jquery.easyui.min.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jquery-easyui-1.3.6/locale/easyui-lang-zh_CN.js" type="text/javascript"></script>

    <script src="<%=path%>/resources/js/easyui/jquery.jdirk.js" type="text/javascript"></script>
    <!--<script src="release/jquery.jdirk.min.js"></script>-->

    <link href="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.css" rel="stylesheet" type="text/css" />

    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.progressbar.js"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.slider.js"></script>
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
    <!--<script src="release/jeasyui.extensions.all.min.js"></script>-->

    <script src="<%=path%>/resources/js/easyui/icons/jeasyui.icons.all.js" type="text/javascript"></script>
    <!--<script src="release/jeasyui.icons.all.min.js"></script>-->

    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.icons.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.gridselector.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/plugins/My97DatePicker/WdatePicker.js" type="text/javascript"></script>

    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jquery.toolbar.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jquery.comboicons.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jquery.comboselector.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jquery.my97.js" type="text/javascript"></script>
    <script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jquery.portal.js" type="text/javascript"></script>

    <!--导入首页启动时需要的相应资源文件(首页相应功能的 js 库、css样式以及渲染首页界面的 js 文件)-->
    <script src="<%=path%>/resources/js/inner/index.js" type="text/javascript"></script>
    <link href="<%=path%>/resources/css/inner/index.css" rel="stylesheet" />
    <script src="<%=path%>/resources/js/inner/index-startup.js"></script>
    <script type="text/javascript">
        
    </script>

  </head>
  
  <body>
    <div id="maskContainer">
        <div class="datagrid-mask" style="display: block;"></div>
        <div class="datagrid-mask-msg" style="display: block; left: 50%; margin-left: -52.5px;">
            正在加载...
        </div>
    </div>

    <div id="mainLayout" class="easyui-layout hidden" data-options="fit: true">


        <div id="northPanel" data-options="region: 'north', border: false" style="height: 80px; overflow: hidden;">
            <div id="topbar" class="top-bar">
                <div class="top-bar-left">
                    <h1 style="margin-left: 10px; margin-top: 10px;">易成内部管理系统</h1>
                </div>
                <div class="top-bar-right">
                    <div id="timerSpan"></div>
                    <div id="themeSpan">
                        <span>更换皮肤风格：</span>
                        <select id="themeSelector"></select>
                        <a id="btnHideNorth" class="easyui-linkbutton" data-options="plain: true, iconCls: 'layout-button-up'"></a>
                    </div>
                </div>
            </div>
            <div id="toolbar" class="panel-header panel-header-noborder top-toolbar">
                <div id="infobar">
                    <span class="icon-hamburg-user" style="padding-left: 25px; background-position: left center;">
                        欢迎：${sessionScope.user.username}
                    </span>
                </div>
                <div id="searchbar">
                    <input id="topSearchbox" name="topSearchbox" class="easyui-searchbox" data-options="width: 350, height: 26, prompt: '请输入您要查找的内容关键词', menu: '#topSearchboxMenu'" />
                    <div id="topSearchboxMenu" style="width: 85px;">
                        <div data-options="name:'0', iconCls: 'icon-hamburg-zoom'">查询类型</div>
                        <div data-options="name:'1'">测试类型1</div>
                        <div data-options="name:'2'">测试类型2</div>
                        <div data-options="name:'3'">测试类型3</div>
                        <div data-options="name:'4'">测试类型4</div>
                    </div>
                </div>
                <div id="buttonbar">
                    <!-- <a id="btnContact" class="easyui-linkbutton" data-options="plain: true, iconCls: 'icon-hamburg-contact', tooltip: '前往作者关于该插件集合的博客专文；可以进行问题反馈提交或留言操作。'">博客留言</a>
                    <a id="btn2" class="easyui-linkbutton" data-options="plain: true, iconCls: 'icon-hamburg-bug'">按钮2</a>
                    <a id="btn3" class="easyui-linkbutton" data-options="plain: true, iconCls: 'icon-hamburg-archives'">按钮3</a> -->
                    <a id="btnFullScreen" class="easyui-linkbutton" data-options="plain: true, iconCls: 'icon-standard-arrow-inout'">全屏切换</a>
                    <a id="btnExit" class="easyui-linkbutton" data-options="plain: true, iconCls: 'icon-hamburg-sign-out'">退出系统</a>
                    <a id="btnShowNorth" class="easyui-linkbutton" data-options="plain: true, iconCls: 'layout-button-down'" style="display: none;"></a>
                </div>
            </div>
        </div>

        <div data-options="region: 'west', title: '菜单导航栏', iconCls: 'icon-standard-map', split: true, minWidth: 250, maxWidth: 500" style="width: 250px; padding: 1px;">
            <div id="navTabs_tools" class="tabs-tool">
                <table>
                    <tr>
                        <td><a id="navMenu_refresh" class="easyui-linkbutton easyui-tooltip" title="刷新该选项卡及其导航菜单" data-options="plain: true, iconCls: 'icon-hamburg-refresh'"></a></td>
                    </tr>
                </table>
            </div>
            <div id="navTabs" class="easyui-tabs" data-options="fit: true, border: true, tools: '#navTabs_tools'">
                <div data-options="title: '导航菜单', iconCls: 'icon-standard-application-view-tile', refreshable: false, selected: true">
                    <div id="westLayout" class="easyui-layout" data-options="fit: true">
                        <div data-options="region: 'center', border: false" style="border-bottom-width: 1px;">
                            <div id="westCenterLayout" class="easyui-layout" data-options="fit: true">
                                <div data-options="region: 'north', split: false, border: false" style="height: 33px;">
                                    <div class="easyui-toolbar">
                                        <a id="navMenu_expand" class="easyui-splitbutton" data-options="iconCls: 'icon-metro-expand2', menu: '#navMenu_toggleMenu'">展开</a>
                                        <a id="navMenu_Favo" class="easyui-linkbutton" data-options="plain: true, iconCls: 'icon-standard-feed-add'">收藏</a>
                                        <a id="navMenu_Rename" class="easyui-linkbutton" data-options="plain: true, iconCls: 'icon-hamburg-pencil'">重命名</a>
                                        <div id="navMenu_toggleMenu" class="easyui-menu">
                                            <div id="navMenu_collapse" data-options="iconCls: 'icon-metro-contract2'">折叠当前</div>
                                            <div class="menu-sep"></div>
                                            <div id="navMenu_collapseCurrentAll" data-options="iconCls: 'icon-metro-expand'">展开当前所有</div>
                                            <div id="navMenu_expandCurrentAll" data-options="iconCls: 'icon-metro-contract'">折叠当前所有</div>
                                            <div class="menu-sep"></div>
                                            <div id="navMenu_collapseAll" data-options="iconCls: 'icon-standard-arrow-out'">展开所有</div>
                                            <div id="navMenu_expandAll" data-options="iconCls: 'icon-standard-arrow-in'">折叠所有</div>
                                        </div>
                                    </div>
                                </div>
                                <div data-options="region: 'center', border: false">
                                    <ul id="navMenu_Tree" style="padding-top: 2px; padding-bottom: 2px;"></ul>
                                </div>
                            </div>
                        </div>
                        <div id="westSouthPanel" data-options="region: 'south', border: false, split: true, minHeight: 32, maxHeight: 275" style="height: 275px; border-top-width: 1px;">
                            <ul id="navMenu_list"></ul>
                        </div>
                    </div>
                </div>
                <div data-options="title: '个人收藏', iconCls: 'icon-hamburg-star', refreshable: false">
                    <div id="westFavoLayout" class="easyui-layout" data-options="fit: true">
                        <div data-options="region: 'north', split: false, border: false" style="height: 33px;">
                            <div class="easyui-toolbar">
                                <a id="favoMenu_expand" class="easyui-splitbutton" data-options="iconCls: 'icon-metro-expand2', menu: '#favoMenu_toggleMenu'">展开</a>
                                <a id="favoMenu_Favo" class="easyui-linkbutton" data-options="plain: true, iconCls: 'icon-standard-feed-delete'">取消收藏</a>
                                <a id="favoMenu_Rename" class="easyui-linkbutton" data-options="plain: true, iconCls: 'icon-hamburg-pencil'">重命名</a>
                                <div id="favoMenu_toggleMenu" class="easyui-menu">
                                    <div id="favoMenu_collapse" data-options="iconCls: 'icon-metro-contract2'">折叠当前</div>
                                    <div class="menu-sep"></div>
                                    <div id="favoMenu_collapseCurrentAll" data-options="iconCls: 'icon-metro-expand'">展开当前所有</div>
                                    <div id="favoMenu_expandCurrentAll" data-options="iconCls: 'icon-metro-contract'">折叠当前所有</div>
                                    <div class="menu-sep"></div>
                                    <div id="favoMenu_collapseAll" data-options="iconCls: 'icon-standard-arrow-out'">展开所有</div>
                                    <div id="favoMenu_expandAll" data-options="iconCls: 'icon-standard-arrow-in'">折叠所有</div>
                                </div>
                            </div>
                        </div>
                        <div data-options="region: 'center', border: false">
                            <ul id="favoMenu_Tree" style="padding-top: 2px; padding-bottom: 2px;"></ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div data-options="region: 'center'" style="padding: 1px;">
            <div id="mainTabs_tools" class="tabs-tool">
                <table>
                    <tr>
                        <td><a id="mainTabs_jumpHome" class="easyui-linkbutton easyui-tooltip" title="跳转至主页选项卡" data-options="plain: true, iconCls: 'icon-hamburg-home'"></a></td>
                        <td><div class="datagrid-btn-separator"></div></td>
                        <td><a id="mainTabs_toggleAll" class="easyui-linkbutton easyui-tooltip" title="展开/折叠面板使选项卡最大化" data-options="plain: true, iconCls: 'icon-standard-arrow-inout'"></a></td>
                        <td><div class="datagrid-btn-separator"></div></td>
                        <td><a id="mainTabs_jumpTab" class="easyui-linkbutton easyui-tooltip" title="在新页面中打开该选项卡" data-options="plain: true, iconCls: 'icon-standard-shape-move-forwards'"></a></td>
                        <td><div class="datagrid-btn-separator"></div></td>
                        <td><a id="mainTabs_closeTab" class="easyui-linkbutton easyui-tooltip" title="关闭当前选中的选项卡" data-options="plain: true, iconCls: 'icon-standard-application-form-delete'"></a></td>
                        <td><a id="mainTabs_closeOther" class="easyui-linkbutton easyui-tooltip" title="关闭除当前选中外的其他所有选项卡" data-options="plain: true, iconCls: 'icon-standard-cancel'"></a></td>
                        <td><div class="datagrid-btn-separator"></div></td>
                        <td><a id="mainTabs_closeLeft" class="easyui-linkbutton easyui-tooltip" title="关闭左侧所有选项卡" data-options="plain: true, iconCls: 'icon-standard-tab-close-left'"></a></td>
                        <td><a id="mainTabs_closeRight" class="easyui-linkbutton easyui-tooltip" title="关闭右侧所有选项卡" data-options="plain: true, iconCls: 'icon-standard-tab-close-right'"></a></td>
                        <td><div class="datagrid-btn-separator"></div></td>
                        <td><a id="mainTabs_closeAll" class="easyui-linkbutton easyui-tooltip" title="关闭所有选项卡" data-options="plain: true, iconCls: 'icon-standard-cross'"></a></td>
                    </tr>
                </table>
            </div>
            <div id="mainTabs" class="easyui-tabs" data-options="fit: true, border: true, showOption: true, enableNewTabMenu: true, tools: '#mainTabs_tools', enableJumpTabMenu: true, onSelect: function (title, index) { window.mainpage.mainTabs.updateHash(index); }">
                <div id="homePanel" data-options="title: '主页', iconCls: 'icon-hamburg-home'">
                    <div class="easyui-layout" data-options="fit: true">
                        <div data-options="region: 'north', split: false, border: false" style="height: 33px;">
                            <div class="easyui-toolbar">
                                <a id="A1" class="easyui-linkbutton" data-options="plain: true, iconCls: 'icon-standard-add'">添加一列</a>
                                <a id="A2" class="easyui-linkbutton" data-options="plain: true, iconCls: 'icon-standard-delete'">删除一列</a>
                                <!-- <span>-</span>
                                <a id="A3" class="easyui-linkbutton" data-options="plain: true, iconCls: 'icon-hamburg-for-job'">测试操作01</a>
                                <span>-</span>
                                <a id="A4" class="easyui-linkbutton" data-options="plain: true, iconCls: 'icon-hamburg-config'">测试操作02</a>
 -->                            </div>
                        </div>
                        <div data-options="region: 'center', border: false" style="overflow: hidden;">
                            <div id="portal" class="easyui-portal" data-options="fit: true, border: false">
                                <div style="width: 33%;">
                                    <div data-options="title: '我的项目', height: 260, collapsible: true, closable: true">
                                        <ul class="portlet-list">
                                            <li><b style="font-size: xx-large;">源码下载</b>：<a href="https://github.com/cjw0511/jquery-extensions/" target="_blank">https://github.com/cjw0511/jquery-extensions/</a></li>
                                            <li>在线演示地址：<a href="http://jqext.sinaapp.com/" target="_blank">http://jqext.sinaapp.com/</a></li>
                                            <li>如将源码下载至本地硬盘并需查看演示 DEMO，请将其部署至 IIS、Tomcat 等 WEB 服务器容器中。</li>
                                            <li>
                                                对于本扩展有任何意见或者建议，欢迎大家及时向我反馈；可以在我的
                                                <a href="http://www.cnblogs.com/cjw0511/p/3324082.html" target="_blank">博客</a>
                                                留言，我会尽可能的给大家回复。
                                            </li>
                                            <li>转载请注明出处；如您需在自己的项目用引用本扩展集合，请遵循 gpl-v3 协议；</li>
                                            <li>
                                                关于 jquery-easyui 相关API，参见：
                                                <ul>
                                                    <li>官方 API(英文)：<a href="http://www.jeasyui.com/documentation/index.php" target="_blank">http://www.jeasyui.com/documentation/index.php</a></li>
                                                    <li>中文社区 API  ：<a href="http://api.btboys.com/" target="_blank">http://api.btboys.com/</a></li>
                                                </ul>
                                            </li>
                                        </ul>
                                    </div>
                                    <div data-options="title: '功能简介', height: 370, collapsible: true, closable: true">
                                        <div class="portlet-list">
                                            <span style="font-weight: bold;">本扩展集合包含两大部分：</span>
                                        </div>
                                        <ul class="portlet-list" style="list-style-type: decimal;">
                                            <li>
                                                <span>jquery 基础库扩展；由文件 jquery.jdirk.js 实现；该文件扩充了 jquery 的基础功能，主要体现在：</span>
                                                <ul style="list-style-type: lower-alpha;">
                                                    <li>增加了大量的 jquery-utility，为前端开发提供诸多便利；</li>
                                                    <li>对 javascript 的基础对象 String、Date、Array、Number、Boolean 进行了大量的静态和实例方法扩充；</li>
                                                    <li>增加了 jquery 对 HTML5 属性验证的支持；</li>
                                                    <li>增加了在 IE6/7 环境下对 JSON 数据格式的支持(整合 json2.js)；</li>
                                                    <li>增加了 jQuery 对快速 cookie 操作的支持(整合 jquery.cookie.js)；</li>
                                                </ul>
                                            </li>
                                            <li>
                                                <span>jeasyui 功能扩展；该部分扩展涵盖四个部分：</span>
                                                <ul style="list-style-type: lower-alpha;">
                                                    <li>jeasyui 扩展基础库；</li>
                                                    <li>对 jeasyui 的现有插件进行了功能扩展；</li>
                                                    <li>新增部分 jeasyui 插件；</li>
                                                    <li>对 jeasyui 官方提供的部分扩展插件进行了代码重构或 BUG 修复，并增强其部分功能；</li>
                                                </ul>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                                <div style="width: 34%;">
                                    <div data-options="title: 'LICENSE', height: 310, iniframe: true, href: '', collapsible: true, closable: true"></div>
                                    <div data-options="title: '更新日志', height: 320, iniframe: true, href: '', collapsible: true, closable: true"></div>
                                </div>
                                <div style="width: 33%;">
                                    <div data-options="title: '关于本项目', height: 300, collapsible: true, closable: true" style="padding: 10px;">
                                        易成内部管理系统<br />
                                        该扩展功能基于 jQuery 1.9.x/2.x ， jQuery EasyUI 1.3.6和jquery-extensions 实现<br />
                                        <br />
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div data-options="region: 'east', title: '日历', iconCls: 'icon-standard-date', split: false, minWidth: 200, maxWidth: 500" style="width: 220px;">
            <div id="eastLayout" class="easyui-layout" data-options="fit: true">
                <div data-options="region: 'north', split: false, border: false" style="height: 220px;">
                    <div class="easyui-calendar" data-options="fit: true, border: false"></div>
                </div>
                <div id="linkPanel" data-options="region: 'center', border: false, title: '友情链接', iconCls: 'icon-hamburg-link', tools: [{ iconCls: 'icon-hamburg-refresh', handler: function () { window.link.reload(); } }]">
                    <ul id="linkList" class="portlet-list link-list"></ul>
                </div>
            </div>
        </div>

        <div data-options="region: 'south', title: '关于...', iconCls: 'icon-standard-information', collapsed: true, border: false" style="height: 70px;">
            <div style="color: #4e5766; padding: 6px 0px 0px 0px; margin: 0px auto; text-align: center; font-size:12px; font-family:微软雅黑;">
                @2015-2016 Copyright: 鼎捷软件 E流通事业部.&nbsp;&nbsp;|&nbsp;&nbsp;
                <a href="http://www.digiwin.biz" target="_blank" style="text-decoration: none;">关于 鼎捷软件</a><br />
                建议使用&nbsp;
                <a href="http://windows.microsoft.com/zh-CN/internet-explorer/products/ie/home" target="_blank" style="text-decoration: none;">IE(Version 9/10/11)</a>/
                <a href="https://www.google.com/intl/zh-CN/chrome/browser/" target="_blank" style="text-decoration: none;">Chrome</a>/
                <a href="http://firefox.com.cn/download/" target="_blank" style="text-decoration: none;">Firefox</a>
                &nbsp;系列浏览器。
                <script type="text/javascript">
                    var cnzz_protocol = (("https:" == document.location.protocol) ? " https://" : " http://");
                    document.write(unescape("%3Cspan id='cnzz_stat_icon_5654850'%3E%3C/span%3E%3Cscript src='" + cnzz_protocol + "s9.cnzz.com/stat.php%3Fid%3D5654850%26show%3Dpic' type='text/javascript'%3E%3C/script%3E"));
                </script>
            </div>
        </div>


    </div>
  </body>
</html>
