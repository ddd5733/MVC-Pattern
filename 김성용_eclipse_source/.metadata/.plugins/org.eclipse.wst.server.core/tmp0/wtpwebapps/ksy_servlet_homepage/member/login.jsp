<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ include file="/common/header.jsp" %>
<!DOCTYPE html>
<html>
<div class="sub_title">
		<h2>로그인해주세요</h2>
	</div>

	<div class="bg_admin">
		<div class="container">
			<div class="grap">
				<form name="admin" >
					<fieldset>
						<legend class="sr-only">관리자로그인</legend>

						<label for="id" class="sr-only">아이디입력</label>
						<input type="text" name="t_id" placeholder="아이디를 입력하세요" id="l_id">

						<label for="pw" class="sr-only">패스원드입력</label>
						<input type="password" name="t_pw" placeholder="패스워드를 입력하세요" id="l_pw">

						<a href="javascript:void(0)" onClick="admin_check();" class="btn_admin">로그인</a>
					</fieldset>
				</form>
			</div>
		</div>
	</div>

	<script>
		function admin_check(){
			var fm = document.admin;
			if(fm.t_id.value==""){
				alert("아이디입력");
				fm.t_id.focus();
				return false;
			}
			if(fm.t_pw.value==""){
				alert("패스워드입력");
				fm.t_pw.focus();
				return false;
			}
			fm.action ="/memberLoginCheck";
			fm.method ="post";
			fm.submit();
		}
		
	</script>
	<script>
		$(function(){
			$(".location .dropdown>a").on("click",function(e){
				e.preventDefault();
				if($(this).next().is(":visible")){
					$(".location .dropdown > a").next().hide();
				}else{
					$(".location .dropdown > a").next().hide();
					$(this).next().show();
				}
			});
		});
	</script>

	<?php include "footer.html"; ?>
 </body>


</html>