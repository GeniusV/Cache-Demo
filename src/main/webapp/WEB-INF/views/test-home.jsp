<%--
  Created by IntelliJ IDEA.
  User: GeniusV
  Date: 8/5/17
  Time: 5:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>test-home</title>
    <jsp:include page="common-resouces.jsp"/>

</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container animated fadeIn">

    <h1>This is the test-home page</h1>
    <div class="col-xs-12">
        <h2>info test</h2>

        <span class="glyphicon glyphicon-remove" style="color: rgb(0, 255, 0); font-size: 1000%;"></span>
        <script>

            $(function () {
                $(".input-group").popover({
                    html: true,
                    content: '<div class="alert alert-danger alert-dismissable fade in">' +
                    '<button button type="button" class="close" data-dismiss="alert" aria-label="Close">×</button>' +
                    '错误！请进行一些更改。' +
                    '</div>',
                    trigger:'focus'
                });
            });


        </script>
        <button type="button" class="btn btn-default" title="Popover title"
                data-container="body" data-toggle="popover" data-placement="auto right"
                data-content="左侧的 Popover 中的一些内容" data-trigger="hover">
            左侧的 Popover
        </button>


        <form class="bs-example bs-example-form" role="form">
            <div class="input-group" >
                <input type="text" class="form-control" placeholder="twitterhandle">
            </div>
            <br>
            <div class="input-group">
                <input type="text" class="form-control">
            </div>
            <br>
            <div class="input-group">
                <input type="text" class="form-control">
            </div>
        </form>

    </div>

</div>
</body>
</html>
