<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
.boardlist {wrap:500px; margin: 0 auto;}
.boardlist tfoot {text-align:center;}
.signUp_agree {text-align:center;}
.signUp_agree_textarea {text-align:center;}
.signUp_agree_textarea textarea {resize:none;}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form id="frm">
<table class="board_list">
<caption>회원가입</caption>
<thead>
<tr>
<td colspan="3" class="signUp_agree">약관동의</td>
</tr>
<tr>
<td colspan="3" class="signUp_agree_textarea"><textarea rows="20" cols="100" readonoly="readonoly">회원가입을 하신다 함은...</textarea></td>
</tr>
<tr>
<td colspan="3" class="signUp_agree_textarea_checkbox"><input type="checkbox" id="agree_checkbox">약관에 동의합니다</td>
</tr>
</thead>
<tbody>
<tr>
<th scope="row">이름</th>
<td><input type="text" id="user_name" name="name" class="wdp_90"></td>
<td></td>
</tr>
<tr>
<th scope="row">전화번호</th>
<td><input type="text" id="user_tel" name="tel" class="wdp_90"></td>
<td></td>
</tr>
<tr>
<th scope="row">아이디</th>
<td><input type="text" id="user_id" name="id" class="wdp_90"></td>
<td><a href="#" id="user_id_checkBtn class="btn">중복확인</a></td>
</tr>
<tr>
<th scope="row">비밀번호</th>
<td><input type="text" id="user_pwd" name="password" class="wdp_90"></td>
<td></td>
</tr>
</tbody>
<tfoot>
<tr>
<td colspan="3">
<a href="#" class="btn" id="signUpBtn">회원가입</a>
<a href="#" class="btn" id="homeBtn">취소</a>
</td>
</tr>
</tfoot>
</table>

</form>

</body>
</html>