<%--
  Created by IntelliJ IDEA.
  User: GeniusV
  Date: 6/6/18
  Time: 12:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- jQuery 3 -->
<script src="${pageContext.request.contextPath}/bower_components/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="${pageContext.request.contextPath}/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- AdminLTE App -->
<script src="${pageContext.request.contextPath}/dist/js/adminlte.min.js"></script>

<script>

    jQuery.get("/user/subject", function (result) {
        if (Object.keys(result).length !== 0) {
            jQuery("#dropdown-username").text(result.userName);
            $("#navbar-with-user").removeAttr("hidden");
        }else {
            $("#navbar-without-user").removeAttr("hidden");
        }
    });
</script>
