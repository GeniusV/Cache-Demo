<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="ch">
<head>
    <meta charset="UTF-8">

    <title>Welcome</title>
    <jsp:include page="common-resouces.jsp"/>

    <%--
        <script>
            jQuery(document).ready(function () {
                var offset = 0;
                var num = 15;
                var total = 0;

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

                $('#deleteUsers').click(function () {
                    var data = [];
                    $('tbody input[type=checkbox]').each(function () {
                        if ($(this).prop('checked')) {
                            var e = $(this).parent().next();
                            data.push($(this).parent().next().text());
                        }
                    });
                    deleteUser(data);
                    setTimeout(function () {
                        $.get('/admin/users', {'offset': offset, 'num': num}, function (data) {
                            setUser(data);
                            checkButton();
                        });
                    }, 1000);
                });


                function checkButton() {

                    $('#ct').text('now ' + (offset + 1) + '-' + (offset + num) + ', total:' + total);
                    $('#total').prop('checked', false);
                    if (offset < num) {
                        $('#previous').hide();
                        offset = 0;
                    } else {
                        $('#previous').show();
                    }

                    if (offset + num > total) {
                        offset = offset - num;
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
                    })
                    $('tbody tr').click(function () {
                        var checkbox = $(this).find('input');
                        $(checkbox).click();
                    });
                }

                $("#add-user").click(function () {
                    $.post("/user/subject", {
                            userName: $("#userName").val(),
                            password: $("#password").val(),
                            status: $("#status").val()
                        },
                        function (data) {
                            if (data.error) {
                                showMessage('danger', data.error);
                            } else {
                                showMessage('success', data.info);
                            }
                        });
                });
            });

            function showMessage(level, message) {
                $(".container").prepend(
                    '<div class="animated fadeInDown">' +
                    '<div class="alert alert-' + level + ' alert-dismissable fade in">' +
                    '    <button type="button" class="close" data-dismiss="alert"' +
                    '    aria-hidden="true">' +
                    '    x' +
                    '</button>' +
                    message +
                    '</div>' +
                    '</div>'
                );
                setTimeout(function () {
                    $('.close').click()
                }, 5000);
            }

            function deleteUser(ids) {
                $.ajax({
                    type: 'DELETE',
                    url: '/user/subject',
                    data: JSON.stringify(ids),
                    dataType: 'json',
                    contentType: "application/json",
                    success: function (data) {
                        if (data.error) {
                            showMessage('danger', 'Delete failed.')
                        } else {
                            showMessage('success', 'Delete success.')
                        }
                    }
                });
            }
        </script>
    --%>

    <%--jQuery--%>
    <%--todo remove before release, this is for auto hint of css--%>
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/css/animate.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/bootstrap-table.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/css/bootstrap-editable.css" rel="stylesheet"/>

    <script src="${pageContext.request.contextPath}/js/bootstrap-table.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap-table-zh-CN.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap-table-editable.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap-editable.min.js"></script>


</head>
<body>
<jsp:include page="header.jsp"/>
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">Add User</h4>
            </div>
            <div class="modal-body">

                <form class="form-horizontal">
                    <div class="form-group">
                        <label for="userName" class="col-sm-2 control-label">User Name</label>
                        <div class="col-sm-10">
                            <input type="email" class="form-control" id="userName" placeholder="User Name">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="password" class="col-sm-2 control-label">Password</label>
                        <div class="col-sm-10">
                            <input type="password" class="form-control" id="password" placeholder="Password">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="status" class="col-sm-2 control-label">Status</label>
                        <div class="col-sm-10">
                            <select id="status" class="form-control">
                                <option>1</option>
                                <option>2</option>
                            </select>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button id="add-user" type="button" class="btn btn-primary" data-dismiss="modal">Save changes</button>
            </div>
        </div>
    </div>
</div>

<div class="container animated fadeIn ">
    <%--
        <a type="button" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#myModal"><span
                class="glyphicon glyphicon-plus"
                style="color:white;"></span>
            Add</a>
        <a type="button" id="deleteUsers" class="btn btn-primary btn-sm "><span class="glyphicon glyphicon-trash"
                                                                                style="color: white"></span>
            Trash</a>
    --%>
    <div class="table-responsive">

        <%--
                <a id="next" href="#" style="float: right;">Next<span class="glyphicon glyphicon-chevron-right"
                                                                      style="color: rgb(50, 185, 234);"></span>

                </a>
                <span id="ct" style="float: right; padding-right: 4em;padding-left: 4em"></span>
                <a id="previous" href="#" style="float: right;"><span class="glyphicon glyphicon-chevron-left"
                                                                      style="color: rgb(50, 185, 234);"></span>Precious</a>
        --%>
        <script>
            $(document).ready(function () {
                initTable();
//                fillTableData();
                $("p").editable();
            });

            function initTable() {
                $("#test-table").bootstrapTable({
                    columns: [{
                        checkbox: 'true'
                    }, {
                        title: 'id',
                        field: 'id',
                    }, {
                        title: 'name',
                        field: 'userName',
                        editable: {
                            type: 'text',
                            title: '用户名',
                            mode: 'inline',
                            validate: function (v) {
                                if (!v) return '用户名不能为空';

                            }
                        }
                    }, {
                        title: 'status',
                        field: 'status'
                    }],
                    filter: true,

                });
            }

            function fillTableData() {
                $.get('/admin/users', {'offset': 1, 'num': 20}, function (data) {
                    $("#test-table").bootstrapTable('load', data);
                    $("#test-table").bootstrapTable('hideLoading');
                });
            }

            function get_param(param) {
                var ret = {'offset': param.offset, 'num': param.limit};
                return ret;
            }

            function get_total() {
                $.ajaxSettings.async = false;
                var total = 0;
                $.get('/admin/usersCount', function (data) {
                    total = data[0];
                });
                $.ajaxSettings.async = true;
                return total;
            }

            function add_totalPage(res) {
                return {
                    total: get_total(),
                    page: this.total / res.length,
                    rows: res
                };
            }
        </script>

        <table id="test-table"
               data-search="true" data-show-refresh="true"
               data-show-toggle="true" data-show-columns="true" data-show-export="true"
               data-detail-view="false" data-minimum-count-columns="2" data-show-pagination-switch="true"
               data-pagination="true"
               data-id-field="id" data-page-size="10" data-show-footer="false" data-side-pagination="server"
               data-method="get" data-checkbox="true" data-url="/admin/users" data-query-params="get_param"
               data-response-handler="add_totalPage">
            <%--
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Status</th>
                        </tr>
            --%>
        </table>
    </div>
</div>
</body>
</html>