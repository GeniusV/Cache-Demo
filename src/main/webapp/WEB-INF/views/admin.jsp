<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="ch">
<head>
    <meta charset="UTF-8">

    <title>Welcome</title>
    <jsp:include page="common-resouces.jsp"/>

    <script>
        jQuery(document).ready(function () {
            var offset = 0;
            var num = 20;
            var total = 0;

            $('.close').click(function () {
                $(this).parent().addClass('animated');
                $(this).parent().addClass("fadeOutUp");
                setTimeout(function () {
                    $('.alert').remove();
                }, 700);
            });


            $.get('/admin/usersCount', function (data) {
                total = data[0];
            });

            $.get('/admin/users', {'offset': offset, 'num': num}, function (data) {
                setUser(data);
                checkButton();
            });

            $('#total').click(function () {
                var all = true;
                var list = $('tbody input[type=checkbox]').each(function () {
                    all = $(this).prop('checked') && all;
                });
                if (all == true) {
                    $('input[type=checkbox]').prop('checked', false);
                } else {
                    $('input[type=checkbox]').prop('checked', true);
                }
            });


            $('#previous').click(function () {
                offset = offset - num;
                $.get('/admin/users', {'offset': offset, 'num': num}, function (data) {
                    setUser(data);
                    checkButton();
                });
            });

            $('#next').click(function () {
                offset = offset + num;
                $.get('/admin/users', {'offset': offset, 'num': num}, function (data) {
                    setUser(data);
                    checkButton();
                });
            });


            function checkButton() {

                $('#ct').text('now ' + (offset + 1) + '-' + (offset + num) + ', total:' + total);
                $('#total').prop('checked', false);
                if (offset < num) {
                    $('#previous').hide();

                } else {
                    $('#previous').show();
                }

                if (offset + num > total) {
                    $('#next').hide();
                } else {
                    $('#next').show();
                }
            }

            function setUser(data) {

                $("#content").empty();
                var i = 0;
                for (var item in data) {
                    $("#content").append(
                            '<tr id="temp">' +
                            '    <td><input class="row-item"  type="checkbox"></td>' +
                            '    <td>' + data[item].id + '</td>' +
                            '    <td>' + data[item].userName + '</td>' +
                            '    <td>' + data[item].status + '</td> ' +
                            '</tr>'
                    )
                    $("#temp").attr("id", "row-" + i);
                    i++;
                }

                $('.row-item').click(function () {
                    $(this).prop('checked', $(this).prop('checked'));
                    var all = true;
                    var list = $('tbody input[type=checkbox]').each(function () {
                        all = $(this).prop('checked') && all;
                    });

                    if (all == true) {
                        $('#total').prop('checked', true);
                    } else {
                        $('#total').prop('checked', false);
                    }
                });

                $('tbody tr').click(function () {
                    var checkbox = $(this).find('input');
                    $(checkbox).click();
                });
            }

        });


    </script>

    <%--todo remove before release, this is for auto hint of css--%>
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/css/animate.min.css" rel="stylesheet">

</head>
<body>
<jsp:include page="header.jsp"/>

<div class="container animated fadeIn ">
    <div class="alert alert-warning"
         style="position: fixed;left: 0px;right: 0px ; width: 75%; margin: auto; opacity: 0.9; ">
        <a href="#" class="close">
            x
        </a>
        <strong>警告！</strong>您的网络连接有问题。
    </div>

    <div class="table-responsive">
        <a type="button" class="btn btn-primary btn-sm"><span class="glyphicon glyphicon-plus"
                                                              style="color:white;"></span>
            Add</a>
        <a type="button" class="btn btn-primary btn-sm "><span class="glyphicon glyphicon-edit"
                                                               style="color: white"></span>
            Edit</a>
        <a id="next" href="#" style="float: right;">Next<span class="glyphicon glyphicon-chevron-right"
                                                              style="color: rgb(50, 185, 234);"></span>

        </a>

        <span id="ct" style="float: right; padding-right: 4em;padding-left: 4em"></span>
        <a id="previous" href="#" style="float: right;"><span class="glyphicon glyphicon-chevron-left"
                                                              style="color: rgb(50, 185, 234);"></span>Precious</a>

        <table class="table table-hover">
            <thead>
            <tr>
                <th width="4em"><input id="total" type="checkbox"></th>
                <th>ID</th>
                <th>Name</th>
                <th>Status</th>
            </tr>
            </thead>
            <tbody id="content">
            </tbody>
        </table>
    </div>
</div>
</body>
</html>