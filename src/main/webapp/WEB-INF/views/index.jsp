<%@ page language="java" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="ch">
<head>
    <meta charset="UTF-8">

    <title>Welcome</title>

    <jsp:include page="common-resouces.jsp"/>
    <script>
        jQuery.get("/user/subject", function (result) {
            jQuery("#user").text(result.subject);
        });
    </script>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">
    <jsp:include page="header.jsp"/>
    <div class="container">
        <h1 id="user"></h1>
    </div>
</div>
</body>
</html>