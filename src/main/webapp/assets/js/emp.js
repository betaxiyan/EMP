$(document).ready(function(){

    function refarshtable() {
        $("#filetable").DataTable({
            "destroy":true,
            "oLanguage": { //国际化配置
                "sProcessing" : "正在获取数据，请稍后...",
                "sLengthMenu" : "显示 _MENU_ 条",
                "sZeroRecords" : "没有您要搜索的内容",
                "sInfo" : "从 _START_ 到  _END_ 条记录 总记录数为 _TOTAL_ 条",
                "sInfoEmpty" : "记录数为0",
                "sInfoFiltered" : "(全部记录数 _MAX_ 条)",
                "sInfoPostFix" : "",
                "sSearch" : "搜索",
                "sUrl" : "",
                "oPaginate": {
                    "sFirst" : "第一页",
                    "sPrevious" : "上一页",
                    "sNext" : "下一页",
                    "sLast" : "最后一页"
                }
            },
            "dom": "l<'#toolbar'>ftip",
            //自定义布局sdom：l- 每行显示的记录数;f- 搜索框;t- 表格;i- 表格信息;p- 分页条;r- 加载时的进度条
            "ajax": {
                "url": "/file/all",
                datasrc:function(data){
                    if(data.code==100)
                        return data.data;
                    else {
                        alert("发生了错误！  错误代码："+data.code+"   详细信息："+data.msg)
                    }
                }
            },
            "columns": [
                {"data": "fileId",width:"10%", },
                {"data": "iD",width:"10%",},
                {"data": "start_date",width:"10%",},
                {"data": "end_date",width:"10%",},
                {"data": "description"  ,},
                null
            ],
            "aoColumnDefs":[
                {//倒数第一列
                    "targets":-1,
                    "bSortable": false,
                    render: function(data, type, row) {
                        var html ='<button class="btn btn-xs btn-danger fileedit" value="'+row.fileId+'">编辑</button>&nbsp;&nbsp;&nbsp;&nbsp;'
                            +'<button class="btn btn-xs btn-danger filedel" value="'+row.fileId+'">删除</button>';
                        return html;
                    }
                },
            ]
        })
    }
    refarshtable();
    $("#filesearch").on("click",function () {
        $("#newfilecard").hide();
        $("#filecard").show()
    });
    $("#filenew").on("click",function () {
        $("#newfilecard").show();
        $("#filecard").hide()
    });

    $("table").on("click",".fileedit",function () {
        alert(this.value)
    });
    /*删除*/
    $("table").on("click",".filedel",function () {
        var fileid=this.value;
        $.get("/file/delete",
            {fileid:fileid},
            function (data) {
                if (data.code == 100) {
                    alert("删除成功！")
                    refarshtable();
                }
                else {
                    alert("发生了错误！  错误代码：" + data.code + "   详细信息：" + data.msg)
                }
            }
        )
    });

    /*单击提交以后*/
    $("#filesubmit").on("click",function () {
        var id = $("#ID").val();
        var startdate = $('#startdate').val();
        var enddate = $('#enddate').val();
        var desc = $('#desc').val();

        $.get("/file/insert",
            { "ID":id, "start_date":startdate,"end_date":enddate,"description":desc } ,
            function (data) {
                if(data.code==100){
                    alert("新建成功！")
                    refarshtable();
                    $("#newfilecard").hide();
                    $("#filecard").show()
                }
                else {
                    alert("发生了错误！  错误代码："+data.code+"   详细信息："+data.msg)
                }
            })

    });


})