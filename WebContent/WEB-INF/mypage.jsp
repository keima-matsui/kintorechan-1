<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<jsp:include page="./parts/header2.jsp"></jsp:include>
		
		
		<div id="main_bottom">
		
			<div id="bottom_left">
				<div class="leftbox_header"> <span>あなたのトレーニングの最高</span> </div>
				<table class="table">
					<thead>
						<tr>
							<th class="sum_one">部位</th>
							<th class="sum_two"><span class="top-half">最高</span></th>
						</tr>
					</thead>
				
					<tbody>
						<tr>
						
						<c:forEach var="f" items="${favList}">
 		 <tr>
						
							<td>
								<span class="spot">${f.spot }</span>
							</td>
							
							<td>
								<span class="t_name">${f.menu}</span>
								<span class="high_per">${f.times }</span>
							</td>
							
						</tr>
						
						
						
						</c:forEach>	
							
						</tr>
							
							
								
					</tbody>
				
				</table>
			</div>
		
			<div id="bottom_right">
				<div class="leftbox_header"> <span> あなたの最新のトレーニング</span> </div>
				
				<table class="table">
					<thead>
						<tr>
							<th class="sum_one">部位</th>
							<th class="sum_two"><span class="top-half">メニュー</span></th>
							<th class="sum_three"><span class="bottom-half">追加日時</span></th>	
						</tr>
					</thead>
				
					<tbody>
						<tr>
							<c:forEach var="r" items="${recList}">
							<td>
								<span class="spot">${r.spot }</span>
							</td>
							
							<td>
								<span class="t_name">${r.menu }</span>
								<span class="high_per">${r.times }</span>
							</td>
							
							<td>
								<span class="t_name">${r.time }</span>
								<!-- <span class="low_per">21%</span>-->
							</td>
						</tr>
						
						
							
							</c:forEach>
							
						</tr>
							
							
								
					</tbody>
				
				</table>
				
			</div>
	
		</div>
	
	
	</div>


</div>

</body>
</html>