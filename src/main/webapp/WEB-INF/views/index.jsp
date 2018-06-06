<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="ch">
<head>
    <meta charset="UTF-8">

    <title>Welcome</title>

    <jsp:include page="common-resouces.jsp"/>
    <style>
        ul li{
            list-style: none;
        }

        .content-wrapper, .main-footer {
            margin-left: unset;
        }

        .item {
            width: 240px;
            height: 420px;
            float: left;
            position: relative;
            z-index: 1;
        }

        .gl-i-wrap {
            width: 220px;
            position: absolute;
            z-index: 1;
            left: 0;
            top: 0;
            background: #fff;
            border: 1px solid #fff;
            padding: 38px 9px 10px;
            transition: border-color .1s ease;
        }

        .p-img {
            height: 220px;
            padding: 0;
            margin-bottom: 15px;
            position: relative;
            overflow: hidden;
            border: 0;
            vertical-align: middle;
        }

        .p-price {
            position: relative;
            line-height: 22px;
            height: 22px;
            overflow: hidden;
            width: 100%;
            margin: 0 0 8px;
        }

        .p-price strong {
            float: left;
            margin-right: 10px;
            color: #e4393c;
            font-size: 20px;
        }
        .p-name {
            height: 40px;
            margin-bottom: 8px;
            overflow: hidden;
        }
    </style>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">
    <jsp:include page="header.jsp"/>


    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <!--<section class="content-header">-->
        <!--&lt;!&ndash;<h1>&ndash;&gt;-->
        <!--&lt;!&ndash;&lt;!&ndash;<small>Optional description</small>&ndash;&gt;&ndash;&gt;-->
        <!--&lt;!&ndash;</h1>&ndash;&gt;-->
        <!--<ol class="breadcrumb">-->
        <!--<li><a href="#"><i class="fa fa-dashboard"></i> Level</a></li>-->
        <!--<li class="active">Here</li>-->
        <!--</ol>-->
        <!--</section>-->

        <!-- Main content -->
        <section class="content container-fluid">
            <div  style="margin-top: 10%; width: 1242px; margin: auto;">
                <ul style="overflow: hidden;">
                    <c:forEach items="${goodList}" varStatus="i" var="good">
                    <li class="item">
                        <div class="gl-i-wrap">
                            <img class="p-img" width="200px" height="220px" src="${good.img}"/>
                            <div class="p-price">
                                <strong class="J_4541540" data-done="1"><em>￥</em><i>${good.price}</i></strong>
                            </div>
                            <div class="p-name">
                                <p>${good.name}</p>
                            </div>
                            <button type="button" class="btn btn-block btn-warning">Buy</button>
                        </div>
                    </li>
                    </c:forEach>
                </ul>

            </div>

        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->

    <!-- Main Footer -->
    <jsp:include page="footer.jsp"/>

    <!-- Control Sidebar -->
    <%--<aside class="control-sidebar control-sidebar-dark">--%>
    <%--<!-- Create the tabs -->--%>
    <%--<ul class="nav nav-tabs nav-justified control-sidebar-tabs">--%>
    <%--<li class="active"><a href="#control-sidebar-home-tab" data-toggle="tab"><i class="fa fa-home"></i></a></li>--%>
    <%--<li><a href="#control-sidebar-settings-tab" data-toggle="tab"><i class="fa fa-gears"></i></a></li>--%>
    <%--</ul>--%>
    <%--<!-- Tab panes -->--%>
    <%--<div class="tab-content">--%>
    <%--<!-- Home tab content -->--%>
    <%--<div class="tab-pane active" id="control-sidebar-home-tab">--%>
    <%--<h3 class="control-sidebar-heading">Recent Activity</h3>--%>
    <%--<ul class="control-sidebar-menu">--%>
    <%--<li>--%>
    <%--<a href="javascript:;">--%>
    <%--<i class="menu-icon fa fa-birthday-cake bg-red"></i>--%>

    <%--<div class="menu-info">--%>
    <%--<h4 class="control-sidebar-subheading">Langdon's Birthday</h4>--%>

    <%--<p>Will be 23 on April 24th</p>--%>
    <%--</div>--%>
    <%--</a>--%>
    <%--</li>--%>
    <%--</ul>--%>
    <%--<!-- /.control-sidebar-menu -->--%>

    <%--<h3 class="control-sidebar-heading">Tasks Progress</h3>--%>
    <%--<ul class="control-sidebar-menu">--%>
    <%--<li>--%>
    <%--<a href="javascript:;">--%>
    <%--<h4 class="control-sidebar-subheading">--%>
    <%--Custom Template Design--%>
    <%--<span class="pull-right-container">--%>
    <%--<span class="label label-danger pull-right">70%</span>--%>
    <%--</span>--%>
    <%--</h4>--%>

    <%--<div class="progress progress-xxs">--%>
    <%--<div class="progress-bar progress-bar-danger" style="width: 70%"></div>--%>
    <%--</div>--%>
    <%--</a>--%>
    <%--</li>--%>
    <%--</ul>--%>
    <%--<!-- /.control-sidebar-menu -->--%>

    <%--</div>--%>
    <%--<!-- /.tab-pane -->--%>
    <%--<!-- Stats tab content -->--%>
    <%--&lt;%&ndash;<div class="tab-pane" id="control-sidebar-stats-tab">Stats Tab Content</div>&ndash;%&gt;--%>
    <%--<!-- /.tab-pane -->--%>
    <%--<!-- Settings tab content -->--%>
    <%--<div class="tab-pane" id="control-sidebar-settings-tab">--%>
    <%--<form method="post">--%>
    <%--<h3 class="control-sidebar-heading">General Settings</h3>--%>

    <%--<div class="form-group">--%>
    <%--<label class="control-sidebar-subheading">--%>
    <%--Report panel usage--%>
    <%--<input type="checkbox" class="pull-right" checked>--%>
    <%--</label>--%>

    <%--<p>--%>
    <%--Some information about this general settings option--%>
    <%--</p>--%>
    <%--</div>--%>
    <%--<!-- /.form-group -->--%>
    <%--</form>--%>
    <%--</div>--%>
    <%--<!-- /.tab-pane -->--%>
    <%--</div>--%>
    <%--</aside>--%>
    <!-- /.control-sidebar -->
    <!-- Add the sidebar's background. This div must be placed
    immediately after the control sidebar -->
    <div class="control-sidebar-bg"></div>


</div>
</body>
<jsp:include page="footer-js.jsp"/>
<script>
    $.get("/user/subject", function (result) {
        $("#user").text(result.subject);
    });

    $(".sidebar-toggle").remove();
</script>
</html>