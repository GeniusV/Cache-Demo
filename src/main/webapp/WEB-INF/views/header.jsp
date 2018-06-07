<%--
  Created by IntelliJ IDEA.
  User: GeniusV
  Date: 8/4/17
  Time: 3:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--old start--%>
<%--<script>--%>

    <%--jQuery.get("/user/subject", function (result) {--%>
        <%--if (result.userName) {--%>
            <%--jQuery("#user-name").text(result.userName);--%>
        <%--} else {--%>
            <%--jQuery("#yes-u").remove();--%>
            <%--jQuery("#right-bar").html('<li id = "no-u"><a href="/login">Login</a></li>');--%>
        <%--}--%>
    <%--});--%>
<%--</script>--%>


<%--<nav class="navbar navbar-default animated fadeIn" role="navigation">--%>
    <%--<div class="navbar-header">--%>
        <%--<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">--%>
            <%--<span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span--%>
                <%--class="icon-bar"></span><span class="icon-bar"></span></button>--%>
        <%--<a class="navbar-brand" href="#">Brand</a>--%>
    <%--</div>--%>

    <%--<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">--%>
        <%--<ul class="nav navbar-nav">--%>
            <%--<li class="active">--%>
                <%--<a href="#">Link</a>--%>
            <%--</li>--%>
            <%--<li>--%>
                <%--<a href="#">Link</a>--%>
            <%--</li>--%>
            <%--<li class="dropdown">--%>
                <%--<a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong class="caret"></strong></a>--%>
                <%--<ul class="dropdown-menu">--%>
                    <%--<li>--%>
                        <%--<a href="#">Action</a>--%>
                    <%--</li>--%>
                    <%--<li>--%>
                        <%--<a href="#">Another action</a>--%>
                    <%--</li>--%>
                    <%--<li>--%>
                        <%--<a href="#">Something else here</a>--%>
                    <%--</li>--%>
                    <%--<li class="divider">--%>
                    <%--</li>--%>
                    <%--<li>--%>
                        <%--<a href="#">Separated link</a>--%>
                    <%--</li>--%>
                    <%--<li class="divider">--%>
                    <%--</li>--%>
                    <%--<li>--%>
                        <%--<a href="/logout">Log Out</a>--%>
                    <%--</li>--%>
                <%--</ul>--%>
            <%--</li>--%>
        <%--</ul>--%>
        <%--<form class="navbar-form navbar-left" role="search">--%>
            <%--<div class="form-group">--%>
                <%--<input type="text" class="form-control"/>--%>
            <%--</div>--%>
            <%--<button type="submit" class="btn btn-default">Submit</button>--%>
        <%--</form>--%>
        <%--<ul id="right-bar" class="nav navbar-nav navbar-right">--%>

            <%--<li class="dropdown" id="yes-u">--%>
                <%--<a href="#" id="user-name" class="dropdown-toggle" data-toggle="dropdown"><strong--%>
                        <%--class="caret"></strong></a>--%>
                <%--<ul class="dropdown-menu">--%>
                    <%--<li>--%>
                        <%--<a href="#">Action</a>--%>
                    <%--</li>--%>
                    <%--<li>--%>
                        <%--<a href="#">Another action</a>--%>
                    <%--</li>--%>
                    <%--<li>--%>
                        <%--<a href="#">Something else here</a>--%>
                    <%--</li>--%>
                    <%--<li class="divider">--%>
                    <%--</li>--%>
                    <%--<li>--%>
                        <%--<a href="/logout">Log Out</a>--%>
                    <%--</li>--%>
                <%--</ul>--%>
            <%--</li>--%>
        <%--</ul>--%>
    <%--</div>--%>
<%--</nav>--%>
<%--old end--%>
<style>
    .navbar-nav>.user-menu>.dropdown-menu>li.user-header{
        height: unset;
    }
</style>


<header class="main-header">

    <!-- Logo -->
    <a href="/" class="logo">
        <!-- mini logo for sidebar mini 50x50 pixels -->
        <span class="logo-mini"><b>A</b>LT</span>
        <!-- logo for regular state and mobile devices -->
        <span class="logo-lg"><b>Jcimas</b>LTE</span>
    </a>

    <!-- Header Navbar -->
    <nav class="navbar navbar-static-top" role="navigation">
        <!-- Sidebar toggle button-->
        <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
            <span class="sr-only">Toggle navigation</span>
        </a>
        <!-- Navbar Right Menu -->
        <div id="navbar-without-user" class="navbar-custom-menu" hidden>
            <ul class="nav navbar-nav" >
                <li>
                    <a href="/login">Login</a>
                </li>
            </ul>
        </div>
        <div id="navbar-with-user" class="navbar-custom-menu" hidden>
            <ul class="nav navbar-nav">
                <!-- Messages: style can be found in dropdown.less-->
                <%--<li class="dropdown messages-menu">--%>
                    <%--<!-- Menu toggle button -->--%>
                    <%--<a href="#" class="dropdown-toggle" data-toggle="dropdown">--%>
                        <%--<i class="fa fa-envelope-o"></i>--%>
                        <%--<span class="label label-success">4</span>--%>
                    <%--</a>--%>
                    <%--<ul class="dropdown-menu">--%>
                        <%--<li class="header">You have 4 messages</li>--%>
                        <%--<li>--%>
                            <%--<!-- inner menu: contains the messages -->--%>
                            <%--<ul class="menu">--%>
                                <%--<li><!-- start message -->--%>
                                    <%--<a href="#">--%>
                                        <%--<div class="pull-left">--%>
                                            <%--<!-- User Image -->--%>
                                            <%--<!--<img src="dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">-->--%>
                                        <%--</div>--%>
                                        <%--<!-- Message title and timestamp -->--%>
                                        <%--<h4>--%>
                                            <%--Support Team--%>
                                            <%--<small><i class="fa fa-clock-o"></i> 5 mins</small>--%>
                                        <%--</h4>--%>
                                        <%--<!-- The message -->--%>
                                        <%--<p>Why not buy a new awesome theme?</p>--%>
                                    <%--</a>--%>
                                <%--</li>--%>
                                <%--<!-- end message -->--%>
                            <%--</ul>--%>
                            <%--<!-- /.menu -->--%>
                        <%--</li>--%>
                        <%--<li class="footer"><a href="#">See All Messages</a></li>--%>
                    <%--</ul>--%>
                <%--</li>--%>
                <!-- /.messages-menu -->

                <!-- Notifications Menu -->
                <%--<li class="dropdown notifications-menu">--%>
                    <%--<!-- Menu toggle button -->--%>
                    <%--<a href="#" class="dropdown-toggle" data-toggle="dropdown">--%>
                        <%--<i class="fa fa-bell-o"></i>--%>
                        <%--<span class="label label-warning">10</span>--%>
                    <%--</a>--%>
                    <%--<ul class="dropdown-menu">--%>
                        <%--<li class="header">You have 10 notifications</li>--%>
                        <%--<li>--%>
                            <%--<!-- Inner Menu: contains the notifications -->--%>
                            <%--<ul class="menu">--%>
                                <%--<li><!-- start notification -->--%>
                                    <%--<a href="#">--%>
                                        <%--<i class="fa fa-users text-aqua"></i> 5 new members joined today--%>
                                    <%--</a>--%>
                                <%--</li>--%>
                                <%--<!-- end notification -->--%>
                            <%--</ul>--%>
                        <%--</li>--%>
                        <%--<li class="footer"><a href="#">View all</a></li>--%>
                    <%--</ul>--%>
                <%--</li>--%>
                <!-- Tasks Menu -->
                <%--<li class="dropdown tasks-menu">--%>
                    <%--<!-- Menu Toggle Button -->--%>
                    <%--<a href="#" class="dropdown-toggle" data-toggle="dropdown">--%>
                        <%--<i class="fa fa-flag-o"></i>--%>
                        <%--<span class="label label-danger">9</span>--%>
                    <%--</a>--%>
                    <%--<ul class="dropdown-menu">--%>
                        <%--<li class="header">You have 9 tasks</li>--%>
                        <%--<li>--%>
                            <%--<!-- Inner menu: contains the tasks -->--%>
                            <%--<ul class="menu">--%>
                                <%--<li><!-- Task item -->--%>
                                    <%--<a href="#">--%>
                                        <%--<!-- Task title and progress text -->--%>
                                        <%--<h3>--%>
                                            <%--Design some buttons--%>
                                            <%--<small class="pull-right">20%</small>--%>
                                        <%--</h3>--%>
                                        <%--<!-- The progress bar -->--%>
                                        <%--<div class="progress xs">--%>
                                            <%--<!-- Change the css width attribute to simulate progress -->--%>
                                            <%--<div class="progress-bar progress-bar-aqua" style="width: 20%"--%>
                                                 <%--role="progressbar"--%>
                                                 <%--aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">--%>
                                                <%--<span class="sr-only">20% Complete</span>--%>
                                            <%--</div>--%>
                                        <%--</div>--%>
                                    <%--</a>--%>
                                <%--</li>--%>
                                <%--<!-- end task item -->--%>
                            <%--</ul>--%>
                        <%--</li>--%>
                        <%--<li class="footer">--%>
                            <%--<a href="#">View all tasks</a>--%>
                        <%--</li>--%>
                    <%--</ul>--%>
                <%--</li>--%>
                <!-- User Account Menu -->
                <li class="dropdown user user-menu">
                    <!-- Menu Toggle Button -->
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <!-- The user image in the navbar-->
                        <!--<img src="dist/img/user2-160x160.jpg" class="user-image" alt="User Image">-->
                        <!-- hidden-xs hides the username on small devices so only the image appears. -->
                        <span id="dropdown-username" class="hidden-xs"></span>
                    </a>
                    <ul class="dropdown-menu">
                        <!-- The user image in the menu -->
                        <%--<li class="user-header">--%>
                            <%--<img src="dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">--%>

                            <%--<p>--%>
                                <%--Alexander Pierce - Web Developer--%>
                                <%--<small>Member since Nov. 2012</small>--%>
                            <%--</p>--%>
                        <%--</li>--%>
                        <!-- Menu Body -->
                        <!--<li class="user-body">-->
                        <!--<div class="row">-->
                        <!--<div class="col-xs-4 text-center">-->
                        <!--<a href="#">Followers</a>-->
                        <!--</div>-->
                        <!--<div class="col-xs-4 text-center">-->
                        <!--<a href="#">Sales</a>-->
                        <!--</div>-->
                        <!--<div class="col-xs-4 text-center">-->
                        <!--<a href="#">Friends</a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--&lt;!&ndash; /.row &ndash;&gt;-->
                        <!--</li>-->
                        <!-- Menu Footer-->
                        <li class="user-footer">
                            <div class="pull-left">
                                <a href="/home" class="btn btn-default btn-flat">Profile</a>
                            </div>
                            <div class="pull-right">
                                <a href="/logout" class="btn btn-default btn-flat">Sign out</a>
                            </div>
                        </li>
                    </ul>
                </li>
                <!-- Control Sidebar Toggle Button -->
                <%--<li>--%>
                    <%--<a href="#" data-toggle="control-sidebar"><i class="fa fa-gears"></i></a>--%>
                <%--</li>--%>
            </ul>
        </div>
    </nav>
</header>

