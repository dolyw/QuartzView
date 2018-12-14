/*
 * @Author: https://github.com/WangEn
 * @Author: https://gitee.com/lovetime/
 * @Date:   2018-03-27
 * @lastModify 2018-3-28
 * +----------------------------------------------------------------------
 * | WeAdmin 表格table中多个删除等操作公用js
 * | 有改用时直接复制到对应页面也不影响使用
 * +----------------------------------------------------------------------
 */
layui.extend({
	admin: '{/}../../static/js/admin'
});
layui.use(['laydate', 'jquery', 'admin'], function() {
	var laydate = layui.laydate,
		$ = layui.jquery,
		admin = layui.admin;
	//执行一个laydate实例
	laydate.render({
		elem: '#start' //指定元素
	});
	//执行一个laydate实例
	laydate.render({
		elem: '#end' //指定元素
	});
	/*用户-停用*/
	window.member_stop = function (obj, id) {
		layer.confirm('确认要停用吗？', function(index) {
			if($(obj).attr('title') == '启用') {

				//发异步把用户状态进行更改
				$(obj).attr('title', '停用')
				$(obj).find('i').html('&#xe62f;');

				$(obj).parents("tr").find(".td-status").find('span').addClass('layui-btn-disabled').html('已停用');
				layer.msg('已停用!', {
					icon: 5,
					time: 1000
				});

			} else {
				$(obj).attr('title', '启用')
				$(obj).find('i').html('&#xe601;');

				$(obj).parents("tr").find(".td-status").find('span').removeClass('layui-btn-disabled').html('已启用');
				layer.msg('已启用!', {
					icon: 5,
					time: 1000
				});
			}
		});
	}

	/*用户-删除*/
	window.member_del = function (obj, id) {
		layer.confirm('确认要删除吗？', function(index) {
			//发异步删除数据
			$(obj).parents("tr").remove();
			layer.msg('已删除!', {
				icon: 1,
				time: 1000
			});
		});
	}

	window.delAll = function (argument) {
		var data = tableCheck.getData();
		layer.confirm('确认要删除吗？' + data, function(index) {
			//捉到所有被选中的，发异步进行删除
			layer.msg('删除成功', {
				icon: 1
			});
			$(".layui-form-checked").not('.header').parents('tr').remove();
		});
	}
});

layui.use('table', function(){
	var table = layui.table;
	
	//展示已知数据
	table.render({
	  elem: '#demo'
	  ,cols: [[ //标题栏
		{field: 'id', title: 'ID', sort: true}
		,{field: 'username', title: '用户名'}
		,{field: 'email', title: '邮箱'}
		,{field: 'sign', title: '签名'}
		,{field: 'sex', title: '性别'}
		,{field: 'city', title: '城市'}
		,{field: 'experience', title: '积分', sort: true}
	  ]]
	  ,data: [{
		"id": "10001"
		,"username": "杜甫"
		,"email": "xianxin@layui.com"
		,"sex": "男"
		,"city": "浙江杭州"
		,"sign": "人生恰似一场修行"
		,"experience": "116"
		,"ip": "192.168.0.8"
		,"logins": "108"
		,"joinTime": "2016-10-14"
	  }, {
		"id": "10002"
		,"username": "李白"
		,"email": "xianxin@layui.com"
		,"sex": "男"
		,"city": "浙江杭州"
		,"sign": "人生恰似一场修行"
		,"experience": "12"
		,"ip": "192.168.0.8"
		,"logins": "106"
		,"joinTime": "2016-10-14"
		,"LAY_CHECKED": true
	  }, {
		"id": "10003"
		,"username": "王勃"
		,"email": "xianxin@layui.com"
		,"sex": "男"
		,"city": "浙江杭州"
		,"sign": "人生恰似一场修行"
		,"experience": "65"
		,"ip": "192.168.0.8"
		,"logins": "106"
		,"joinTime": "2016-10-14"
	  }, {
		"id": "10004"
		,"username": "贤心"
		,"email": "xianxin@layui.com"
		,"sex": "男"
		,"city": "浙江杭州"
		,"sign": "人生恰似一场修行"
		,"experience": "666"
		,"ip": "192.168.0.8"
		,"logins": "106"
		,"joinTime": "2016-10-14"
	  }, {
		"id": "10005"
		,"username": "贤心"
		,"email": "xianxin@layui.com"
		,"sex": "男"
		,"city": "浙江杭州"
		,"sign": "人生恰似一场修行"
		,"experience": "86"
		,"ip": "192.168.0.8"
		,"logins": "106"
		,"joinTime": "2016-10-14"
	  }, {
		"id": "10006"
		,"username": "贤心"
		,"email": "xianxin@layui.com"
		,"sex": "男"
		,"city": "浙江杭州"
		,"sign": "人生恰似一场修行"
		,"experience": "12"
		,"ip": "192.168.0.8"
		,"logins": "106"
		,"joinTime": "2016-10-14"
	  }, {
		"id": "10007"
		,"username": "贤心"
		,"email": "xianxin@layui.com"
		,"sex": "男"
		,"city": "浙江杭州"
		,"sign": "人生恰似一场修行"
		,"experience": "16"
		,"ip": "192.168.0.8"
		,"logins": "106"
		,"joinTime": "2016-10-14"
	  }, {
		"id": "10008"
		,"username": "贤心"
		,"email": "xianxin@layui.com"
		,"sex": "男"
		,"city": "浙江杭州"
		,"sign": "人生恰似一场修行"
		,"experience": "106"
		,"ip": "192.168.0.8"
		,"logins": "106"
		,"joinTime": "2016-10-14"
	  }]
	  //,skin: 'line' //表格风格
	  ,even: true
	  ,page: true //是否显示分页
	  ,limits: [5, 7, 10]
	  ,limit: 5 //每页默认显示的数量
	});
  });