<%@ page language="java" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="ch">
<head>
    <meta charset="UTF-8">

    <title>Home</title>

    <jsp:include page="common-resouces.jsp"/>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">
    <jsp:include page="header.jsp"/>
    <jsp:include page="sidebar.jsp"/>

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

            <div class="col-md-6 col-md-offset-3" style="margin-top: 10%">
                <div class="box box-primary">
                    <div class="box-header with-border">
                        <h3 class="box-title">Change Your Profile</h3>
                    </div>
                    <!-- /.box-header -->
                    <!-- form start -->
                    <form role="form" action="/user/update" method="post">
                        <div class="box-body">
                            <div class="form-group">
                                <label for="exampleInputEmail1">Email address</label>
                                <input type="email" name="email" class="form-control" id="exampleInputEmail1" placeholder="Enter email" value="${user.email}">
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1">Password</label>
                                <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                            </div>
                            <div class="form-group">
                                <label for="tel">Telephone</label>
                                <input type="text" name="tel" class="form-control" id="tel" placeholder="Password" value="${user.tel}">
                            </div>
                            <div class="form-group" >
                                <label>Gender</label>
                                <select class="form-control" data-default="${user.gender}" id="gender" name="gender">
                                    <option value="male">男</option>
                                    <option value="female">女</option>
                                    <option value="both">？？？</option>
                                    <option value="other">其他</option>
                                </select>
                            </div>
                        </div>
                        <!-- /.box-body -->

                        <div class="box-footer">
                            <button type="submit" class="btn btn-primary">Submit</button>
                        </div>
                    </form>
                </div>
            </div>
        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->

    <jsp:include page="footer.jsp"/>



</div>
</body>
<jsp:include page="footer-js.jsp"/>
<script>
    $.get("/user/subject", function (result) {
        $("#user").text(result.subject);
    });

    $("#tab-main").addClass("active");

    $("#gender").children().each(function (index, e) {
        if ($(e).attr("value") === $('#gender').attr("data-default")) {
            $(e).attr("selected", "selected");
        }
    });
</script>
</html>