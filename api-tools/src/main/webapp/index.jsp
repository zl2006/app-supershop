<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>make</title>
<style type="text/css">
	body{
		margin: 10px auto;
		width :1200px;
	}
</style>
</head>
<body>
	<form action="/makeapi" target="_blank" method="post">
		<input type="button" value="增加字段"  style="width:120px;height:40px;line-height: 40px" onclick="addRow()" >
		<input type="button" value="增加自定义类型字段"  style="width:120px;height:40px;line-height: 40px" onclick="addCustomRow()" >
		<input type="button" value="删除字段"  style="width:120px;height:40px;line-height: 40px" onclick="delRow()" >
		<hr>
		<div>
			<input id="firstType" name="type" value="response" type="radio" checked="checked" style="height:30px;vertical-align: middle" onclick="swicthOper(1)">响应类生成
			<input name="type" value="model" type="radio" onclick="swicthOper(2)">实体类生成
			<input name="type" value="request" type="radio" onclick="swicthOper(3)">请求类生成
		</div>
		<label  style="width:90px;display: inline-block;">类名:</label><input name="className" style="width:300px;height:30px" type="text"><br>
		<label  style="width:90px;display: inline-block;">类描述：</label><input name="classDesc" style="width:300px;height:30px" type="text"><br>
		<div id="methodNameDIV" style="display: none">
			<label  style="width:90px;display: inline-block;">请求方法：</label><input name="methodName" style="width:300px;height:30px" type="text"><br>
			<input id="useResponse" name="useResponse" value="use" type="checkbox" checked="checked">使用自定义Response
		</div>
		<table style="border: 1px solid gray; margin-top:20px">
			<thead>
				<tr>
					<th>字段名称</th>
					<th>字段类型</th>
					<th>字段描述</th>
				</tr>
			</thead>
			<tbody id="content">
				<tr>
					<td><input name="fieldName" style="width:300px;height:30px" type="text"></td>
					<td>
						<select name="fieldType" style="width:150px;height:30px" >
							<option value="String">String
							<option value="Date">Date
							<option value="Long">Long
						</select>
					</td>
					<td><input name="fieldDesc"  style="width:600px;height:30px"  type="text"></td>
				</tr>
				<tr>
					<td><input name="fieldName" style="width:300px;height:30px" type="text"></td>
					<td>
						<select name="fieldType" style="width:150px;height:30px" >
							<option value="String">String
							<option value="Date">Date
							<option value="Long">Long
						</select>
					</td>
					<td><input name="fieldDesc"  style="width:600px;height:30px"  type="text"></td>
				</tr>
			</tbody>
		</table>
		<input type="submit" value="生成代码"  style="width:100px;height:40px;line-height: 40px" >
	</form>
	<script type="text/javascript" src="jquery.js"></script>
	<script type="text/javascript">
		
		jQuery(document).ready(function(){
			jQuery('#firstType').click();
			jQuery('#useResponse').click();
		});
	
		function swicthOper(type){
			if( 1 == type){	//响应
				jQuery('#methodNameDIV').hide();
			}else if(2 == type){//实体
				jQuery('#methodNameDIV').hide();
			}else if( 3 == type){//请求
				jQuery('#methodNameDIV').show();
			}
		}
		function addCustomRow(){
			jQuery("#content").append('<tr>\
					<td><input name="fieldName" style="width:300px;height:30px" type="text"></td>\
					<td><input name="fieldType" style="width:150px;height:30px" type="text"></td>\
					<td><input name="fieldDesc"  style="width:600px;height:30px"  type="text"></td>\
				</tr>');
		}
		function addRow(){
			jQuery("#content").append('<tr>\
					<td><input name="fieldName" style="width:300px;height:30px" type="text"></td>\
					<td>\
						<select name="fieldType" style="width:150px;height:30px" >\
							<option value="String">String\
							<option value="Date">Date\
							<option value="Long">Long\
						</select>\
					</td>\
					<td><input name="fieldDesc"  style="width:600px;height:30px"  type="text"></td>\
				</tr>');
		}
		
		function delRow(){
			jQuery("#content tr").last().remove();
		}
	</script>
</body>
</html>