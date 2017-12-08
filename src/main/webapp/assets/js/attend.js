$(document).ready(function(){

    function refarshtable() {
        $("#attendtable").DataTable({
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
                "url": "/attend/all",
                datasrc:function(data){
                    if(data.code==100)
                        return data.data;
                    else {
                        alert("发生了错误！  错误代码："+data.code+"   详细信息："+data.msg)
                    }
                }
            },
            "columns": [
                {"data": "emp_id", },
                {"data": "date",},
                {"data": "work_time",},
                {"data": "offwork_time",},
                {"data": "flag" ,},
                null
            ],
            "aoColumnDefs":[
                {//倒数第一列
                    "targets":-1,
                    "bSortable": false,
                    render: function(data, type, row) {
                        var html ='<button class="btn btn-xs btn-danger fileedit" value="'+row.emp_id+'">编辑</button>';
                        return html;
                    }
                },
                {
                    "targets":-2,
                    "bSortable": true,
                    render: function(data, type, row) {
                        var html;
                        if(data==0){
                            html ='<label style="text-align: center">工时不足</label>';
                        }else {
                            html ='<label style="text-align: center">正常</label>';
                        }

                        return html;
                    }
                }
            ]
        })
    }
    refarshtable();
    $("#attendsearch").on("click",function () {
        $("#newattendcard").hide();
        $("#attendcard").show()
    });
    $("#attendadd").on("click",function () {
        $("#newattendcard").show();
        $("#attendcard").hide()
    });

    $("table").on("click",".fileedit",function () {
        alert(this.value)
    });
    /*删除*/

    /*点击 打卡 */
    $("#attendsubmit").on("click",function () {
        var emp_id = $("#emp_id").val();

        $.get("/attend/click",
            { "emp_id":emp_id} ,
            function (data) {
                if(data.code==100){
                    alert("打卡成功！")
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