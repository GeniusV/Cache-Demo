<%--
  Created by IntelliJ IDEA.
  User: GeniusV
  Date: 8/4/17
  Time: 7:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--old start--%>
<%--<html>--%>
<%--<head>--%>
    <%--<title>Login</title>--%>
    <%--<jsp:include page="/WEB-INF/views/common-resouces.jsp"/>--%>
<%--</head>--%>
<%--<body>--%>

<%--<script>--%>
    <%--jQuery(document).ready(function () {--%>
        <%--jQuery("#submit").click(function () {--%>
            <%--jQuery("#submit").addClass("disable");--%>
            <%--jQuery.post("/login",--%>
                    <%--{--%>
                        <%--userName: jQuery("#username").val(),--%>
                        <%--password: jQuery("#password").val(),--%>
                        <%--rememberMe: jQuery('#rememberMe').prop('checked')--%>
                    <%--},--%>
                    <%--function (data, status) {--%>
                        <%--if (data.error) {--%>
                            <%--jQuery("#warning").html(--%>
                                    <%--'<div class="col-md-12 column animated fadeInDown">' +--%>
                                    <%--'    <div class="alert alert-dismissable alert-danger">' +--%>
                                    <%--'       <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>' +--%>
                                    <%--'       <h4>' +--%>
                                    <%--'        注意!' +--%>
                                    <%--'        </h4> <strong>Warning!</strong><p id="info"></p>' +--%>
                                    <%--'</div>' +--%>
                                    <%--'</div>'--%>
                            <%--);--%>
                            <%--jQuery("#info").html(data.error);--%>
                            <%--jQuery("#submit").removeClass("disable");--%>

                        <%--} else {--%>
                            <%--window.location.href = data.redirect;--%>
                        <%--}--%>
                    <%--});--%>
        <%--});--%>
    <%--});--%>
<%--</script>--%>
<%--<jsp:include page="/WEB-INF/views/header.jsp"/>--%>
<%--<div class="container animated fadeIn">--%>
    <%--<div id="warning"></div>--%>
    <%--<form class="form-horizontal">--%>
        <%--<div class="form-group">--%>
            <%--<label for="username" class="col-sm-2 control-label">User Name</label>--%>
            <%--<div class="col-sm-10">--%>
                <%--<input type="text" class="form-control" name="userName" id="username" placeholder="User Name">--%>
            <%--</div>--%>
        <%--</div>--%>
        <%--<div class="form-group">--%>
            <%--<label for="password" class="col-sm-2 control-label">password</label>--%>
            <%--<div class="col-sm-10">--%>
                <%--<input type="password" class="form-control" name="password" id="password" placeholder="Password">--%>
            <%--</div>--%>
        <%--</div>--%>
        <%--<div class="form-group">--%>
            <%--<div class="col-sm-offset-2 col-sm-10">--%>
                <%--<div class="checkbox">--%>
                    <%--<label>--%>
                        <%--<input id="rememberMe" type="checkbox"> Remember me--%>
                    <%--</label>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>
        <%--<div class="form-group">--%>
            <%--<div class="col-sm-offset-2 col-sm-10">--%>
                <%--<button id="submit" type="button" class="btn btn-default">Sign in</button>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</form>--%>
<%--</div>--%>

<%--</body>--%>
<%--</html>--%>
<%--old end--%>


<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Jciams | Log in</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.7 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bower_components/bootstrap/dist/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bower_components/font-awesome/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bower_components/Ionicons/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/dist/css/AdminLTE.min.css">
    <!-- iCheck -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/iCheck/square/blue.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- Google Font -->
    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">

    <style>
        .login-page {
            width: 100%;
            height: 100%;
            position: relative;
            background-image: url(/dist/img/bg.jpg);
            background-position: center top;
            background-size: cover;
        }

        .login-box {
            /*box-shadow: 0 10px 20px rgba(0,0,0,0.5);*/
            overflow: hidden;
            z-index: 2;
            /*box-shadow: 0 10px 20px rgba(0,0,0,0.5);*/
            overflow: hidden;
            z-index: 2;
            box-sizing: border-box;
        }

        .login-box::before {
            content: '';
            position: absolute;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
            -webkit-filter: blur(5px);
            -moz-filter: blur(5px);
            -ms-filter: blur(5px);
            -o-filter: blur(5px);

            box-sizing: border-box;
        }

        .login-box::before {
            content: '';
            position: absolute;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
            -webkit-filter: blur(5px);
            -moz-filter: blur(5px);
            -ms-filter: blur(5px);
            -o-filter: blur(5px);
            filter: blur(5px);
            margin-top: -150px;
            z-index: -3;
            background-image: url(/dist/img/bg.jpg);
            background-position: center top;
            background-size: cover;
            background-attachment: fixed;
        }

        .login-logo a, .register-logo a {
            color: #ffffff;
        }

        .login-box, .register-box{
            margin: unset;
            margin-left: auto;
            margin-right: auto;
            padding-top: 7%;
        }
    </style>
</head>
<body class="hold-transition login-page">

<div class="login-box">
    <div id="warning"></div>

    <div class="login-logo">
        <a href="../../index2.html"><b>Admin</b>LTE</a>
    </div>
    <!-- /.login-logo -->
    <div class="login-box-body">
        <!--<p class="login-box-msg">Sign in to start your session</p>-->

        <form onsubmit="return false;">
            <div class="form-group has-feedback">
                <input id="username" type="text" class="form-control" placeholder="Username">
                <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <input id="password" type="password" class="form-control" placeholder="Password">
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>
            <div class="row">
                <div class="col-xs-8">
                    <div class="checkbox icheck">
                        <label>
                            <input id="rememberMe" type="checkbox"> Remember Me
                        </label>
                    </div>
                </div>
                <!-- /.col -->
                <div class="col-xs-4">
                    <button id="submit" class="btn btn-primary btn-block btn-flat">Sign In</button>
                </div>
                <!-- /.col -->
            </div>
        </form>

        <!-- /.social-auth-links -->

        <a href="#">I forgot my password</a><br>
        <a href="register.html" class="text-center">Register a new membership</a>

    </div>
    <!-- /.login-box-body -->
</div>
<!-- /.login-box -->

<!-- jQuery 3 -->
<script src="${pageContext.request.contextPath}/bower_components/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="${pageContext.request.contextPath}/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- iCheck -->
<script src="${pageContext.request.contextPath}/plugins/iCheck/icheck.min.js"></script>
<script>
    $(function () {
        $('input').iCheck({
            checkboxClass: 'icheckbox_square-blue',
            radioClass: 'iradio_square-blue',
            increaseArea: '20%' /* optional */
        });
    });
</script>

<script>
    jQuery(document).ready(function () {
        jQuery("#submit").click(function () {
            jQuery("#submit").addClass("disable");
            jQuery.post("/login",
                {
                    userName: jQuery("#username").val(),
                    password: jQuery("#password").val(),
                    rememberMe: jQuery('#rememberMe').prop('checked')
                },
                function (data, status) {
                    if (data.error) {
                        jQuery("#warning").html(
                            '<div class="col-md-12 column animated fadeInDown">' +
                            '    <div class="alert alert-dismissable alert-danger">' +
                            '       <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>' +
                            '       <h4>' +
                            '        Alert!' +
                            '        </h4> <strong>Warning!</strong><p id="info"></p>' +
                            '</div>' +
                            '</div>'
                        );
                        jQuery("#info").html(data.error);
                        jQuery("#submit").removeClass("disable");

                    } else {
                        window.location.href = data.redirect;
                    }
                });
        });
    });
</script>
</body>
</html>
