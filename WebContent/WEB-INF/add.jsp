<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="./parts/header.jsp"></jsp:include>
		<div id="main_bottom">
		
<div id="addForm_box">
<form name="myForm" action="add" method="post">
<div class="bg_select">
<select name="spot" onChange="setMenuItem(this.selectedIndex)" class="select_box">
<option value="肩">肩</option>
<option value="胸">胸</option>
<option value="背">背</option>
<option value="腹">腹</option>
<option value="腕">腕</option>
<option value="足">足</option>
</select>
</div>

<div class="bg_select2">
<select name="menu" class="select_box">
<option value="ディップシュ">ディップシュ</option>
<option value="プッシュアップ">プッシュアップ</option>
</select>
</div>

<div class="bg_select3">
<input type="text" name="times" class="select_box" placeholder="回数">
</div>

<br>
<input type="image" src="./images/add_img2.png">

</form>
</div>

	
		</div>
	
	
	</div>


</div>

</body>
</html>