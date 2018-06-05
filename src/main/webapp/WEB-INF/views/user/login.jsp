<%--
  Created by IntelliJ IDEA.
  User: GeniusV
  Date: 8/4/17
  Time: 7:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <jsp:include page="/WEB-INF/views/common-resouces.jsp"/>
</head>
<body>

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
                                    '        注意!' +
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
<jsp:include page="/WEB-INF/views/header.jsp"/>
<div class="container animated fadeIn">
    <div id="warning"></div>
    <form class="form-horizontal">
        <div class="form-group">
            <label for="username" class="col-sm-2 control-label">User Name</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="userName" id="username" placeholder="User Name">
            </div>
        </div>
        <div class="form-group">
            <label for="password" class="col-sm-2 control-label">password</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" name="password" id="password" placeholder="Password">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <div class="checkbox">
                    <label>
                        <input id="rememberMe" type="checkbox"> Remember me
                    </label>
                </div>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button id="submit" type="button" class="btn btn-default">Sign in</button>
            </div>
        </div>
    </form>
</div>

</body>
</html>
