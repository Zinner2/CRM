<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
    <link rel="stylesheet" href="http://unpkg.com/layui@2.6.8/dist/css/layui.css">
    <script src="http://unpkg.com/layui@2.6.8/dist/layui.js"></script>
    <script src="js/jquery-3.6.0.min.js"></script>
</head>
<body>
<form class="layui-form" action="user/insertUser.do">

    <div class="layui-form-item">
        <label class="layui-form-label">账号</label>
        <div class="layui-input-inline">
            <input type="text" name="username" required  lay-verify="required" placeholder="请输入账号" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">密码</label>
        <div class="layui-input-inline">
            <input type="text" name="password" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button type="submit" class="layui-btn" lay-submit id="btn" >立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" >查询账户</button>
        </div>
    </div>
<script>
    $(function (){
        $("#btn").click(function (){
            $.ajax({
                url: "user/selectUser.do",
                data: {
                    id:"2",
                },
                type: "get",
                dataType: "json",
                success : function (data){
                    $.each(data,function (index){
                        alert("username"+data[index].username+"password"+data[index].password)
                    });
                }
            })
        })
    })
</script>
</body>
</html>
