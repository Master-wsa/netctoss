<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title></title>
      	<%@include file="/WEB-INF/view/include/css.jsp" %>
        <script language="javascript" type="text/javascript">
	      	//排序按钮的点击事件
	        function sort(feeType) {
	            if ($("#"+feeType).attr("class") == "sort_desc")
	            	$("#"+feeType).attr("class","sort_asc");
	            else
	            	$("#"+feeType).attr("class","sort_desc");
	            var ds = $("#"+feeType).attr("class");
	            window.location.href="${pageContext.request.contextPath}/fee/getAllFee.do?descOrAsc="+ds+"&&field="+feeType;
	        }
	        //启用
	        function startFee(fee_id) {
	            var r = window.confirm("确定要启用此资费吗？资费启用后将不能修改和删除。");
		          if(r){
	            	$.post({
		           		url:'${pageContext.request.contextPath}/fee/startFee.do',
		           		data:'start_id='+fee_id,
		           		success:function(result){
		           			if(result!="no"){
		           				/* var time = rs.time; */
	          					$("#operate_result_info").text("启动成功！");
                                $("#operate_result_info").attr("class","operate_success");
               					$("#operate_result_info").show().delay(1000).hide(300);
               				    $("#f"+fee_id).children("td").eq(7).empty();
               					$("#f"+fee_id).children("td").eq(8).empty();
               				    $("#f"+fee_id).children("td").eq(7).html("启用");
               				    $("#f"+fee_id).children("td").eq(6).html(result);
               				 $("#f"+fee_id).children("td").eq(8).html("—");
	          				}else{
	          					$("#operate_result_info").text("启动失败!");
	                            $("#operate_result_info").attr("class","operate_fail");
	            				$("#operate_result_info").show().delay(1000).hide(300);
	          				}
		           		}
		           	})
		            document.getElementById("operate_result_info").style.display = "block";
		          }
	        }
	        //修改
	        function updateFee(fee_id) {
	        	window.location.href="${pageContext.request.contextPath}/fee/toUpdateFee.do?fee_id="+fee_id;
	        }
	        //删除
	        function deleteFee(fee_id) {
	            var r = window.confirm("确定要删除此资费吗？");
		        if(r){
	            	$.post({
		           		url:'${pageContext.request.contextPath}/fee/deleteFee.do',
		           		data:'delete_id='+fee_id,
		           		success:function(result){
		           			if(result=="yes"){
	          					$("#operate_result_info").text("删除成功！");
                                $("#operate_result_info").attr("class","operate_success");
               					$("#operate_result_info").show().delay(1500).hide(500);
               					$("#f"+fee_id).children("td").eq(7).empty();
            					$("#f"+fee_id).children("td").eq(8).empty();
            					$("#f"+fee_id).children("td").eq(6).html("—");
            					$("#f"+fee_id).children("td").eq(8).html("—");
            				    $("#f"+fee_id).children("td").eq(7).html("删除");
	          				}else{
	          					$("#operate_result_info").text("删除失败!");
	                            $("#operate_result_info").attr("class","operate_fail");
	            				$("#operate_result_info").show().delay(1500).hide(500);
	          				}
		           		}
		           	})
		            document.getElementById("operate_result_info").style.display = "block";
		        }
	        }
	        //查看资费具体信息
	        function ctrlFee(fee_id){
	        	window.location.href="${pageContext.request.contextPath}/fee/getFeeDetail.do?fee_id="+fee_id;
	        }
	        //排序按钮
	        function sortBtn(){
	        	var descOrAsc = "${descOrAsc }";
	        	var field = "${field }"
	        		if(field=="fee_bfee"){
	            		 if (descOrAsc == "asc")
	            			 $("#fee_bfee").attr("class","sort_asc");
	                     else
	                    	 $("#fee_bfee").attr("class","sort_desc");
	            	 }
	            	 if(field=="fee_ctime"){
	            		 if (descOrAsc == "asc")
	            			 $("#fee_ctime").attr("class","sort_asc");
	                     else
	                    	 $("#fee_ctime").attr("class","sort_desc");
	            	 }
	            	 if(field=="fee_time"){
	            		 if (descOrAsc == "asc")
	            			 $("#fee_time").attr("class","sort_asc");
	                     else
	                    	 $("#fee_time").attr("class","sort_desc");
	            	 }
	        }
	        document.onreadystatechange = function () {      
	            if(document.readyState=="complete") {
	            	$("#headClass3").attr("class","fee_on");
	            }     
	        } 
        </script>        
    </head>
    <body onload="sortBtn()">
        <!--Logo区域-->
        <%@include file="/WEB-INF/view/include/header.jsp" %>
        <!--导航区域开始-->
        <%@include file="/WEB-INF/view/include/menu.jsp" %>
        <div id="main">
            <form id="myform" action="${pageContext.request.contextPath }/fee/getAllFee.do" method="post">
                <!--排序-->
                <div class="search_add">
                    <div>
                        <input id="fee_bfee"  type="button" value="基 费" class="sort_asc" onclick="sort('fee_bfee');" />
                        <input id="fee_time"  type="button" value="时 长" class="sort_asc" onclick="sort('fee_time');" />
                        <input id="fee_ctime" type="button" value="创建时间" class="sort_asc" onclick="sort('fee_ctime');" />
                    </div>
                    <%-- <input type="button" value="增加" class="btn_add" onclick="location.href='${pageContext.request.contextPath}/fee/toAddFee.do';" /> --%>
                    <button type="button" class="btn btn-primary btn-xs " style="height:25px;width:80px" onclick="location.href='${pageContext.request.contextPath}/fee/toAddFee.do';" >&nbsp;&nbsp;&nbsp;&nbsp;增&nbsp;&nbsp;加&nbsp;&nbsp;&nbsp;&nbsp;</button>
                </div> 
                <!--启用操作的操作提示-->
                <div id="operate_result_info"></div>    
                <!--数据区域：用表格展示数据-->     
                <div id="data">            
                    <table id="datalist">
					<tr>
						<th class="width66">资费ID</th>
						<th class="width100">资费名称</th>
						<th class="width100">基本时长</th>
						<th class="width100">基本费用</th>
						<th class="width100">单位费用</th>
						<th class="width100">创建时间</th>
						<th class="width100">开通时间</th>
						<th class="width50">状态</th>
						<th class="width200"></th>
					</tr>
					<c:forEach items="${l_all_fee }" var="lf">
						<tr id="f${lf.fee_id }">
							<td>${lf.fee_id }</td>
							<td><a href="javascript:ctrlFee(${lf.fee_id })">${lf.fee_name }</a></td>
							<td>
							<c:if test="${lf.fee_time!=0}">
							${lf.fee_time }小时
							</c:if>
							<c:if test="${lf.fee_time==0}">
							—
							</c:if>
							</td>
							<td>
							<c:if test="${lf.fee_bfee!=0}">
							${lf.fee_bfee }元
							</c:if>
							<c:if test="${lf.fee_bfee==0}">
							—
							</c:if>
							</td>
							<td>
							<c:if test="${lf.fee_ufee!=0}">
							${lf.fee_ufee }元/小时
							</c:if>
							<c:if test="${lf.fee_ufee==0}">
							—
							</c:if>
							</td>
							<td>${lf.fee_ctime }</td>
							<td><c:if test="${lf.fee_state==1}">
								${lf.fee_stime }
								</c:if>
								<c:if test="${lf.fee_state!=1}">
								—
								</c:if>
							</td>
							<td>
								<c:choose>
									<c:when test="${lf.fee_state==0 }">暂停</c:when>
									<c:when test="${lf.fee_state==1 }">启用</c:when>
									<c:when test="${lf.fee_state==2 }">删除</c:when>
								</c:choose></td>
							<td>
								<c:choose>
									<c:when test="${lf.fee_state==0 }">
										<input type="button" value="启用" class="btn_start"
											onclick="startFee(${lf.fee_id });" />
										<input type="button" value="修改" class="btn_modify"
											onclick="updateFee(${lf.fee_id })" />
										<input type="button" value="删除" class="btn_delete"
											onclick="deleteFee(${lf.fee_id });" />
									</c:when>

								</c:choose>
								<c:if test="${lf.fee_state!=0 }">
									—
									</c:if>
							</td>
						</tr>
					</c:forEach>
				</table>
                </div>
                <!--分页-->
                <div id="pages">
        	       <c:if test="${curPage!=1}">
        	       <a href="getAllFee.do?curPage=1&descOrAsc=sort_${descOrAsc}&field=${field}">首页</a> 
        	        <a href="getAllFee.do?curPage=${curPage-1}&descOrAsc=sort_${descOrAsc}&field=${field}">上一页</a>
        	        </c:if>
                    <!-- <a href="#">1</a> -->
               		<c:if test="${curPage==totalPage&&totalPage>=3}">
	               				<a href="getAllFee.do?curPage=${totalPage-2}&descOrAsc=sort_${descOrAsc}&field=${field}">${totalPage-2}</a>
	               			</c:if>
               		<c:forEach var="item" varStatus="status" begin="1" end="${totalPage}">
               			<c:if test="${status.index>curPage-2&&status.index<curPage+2}">	 
	               			<c:if test="${curPage==status.index}"> 
								<a href="getAllFee.do?curPage=${status.index}&descOrAsc=sort_${descOrAsc}&field=${field}" class="current_page">${status.index}</a>
							</c:if>
							 <c:if test="${curPage!=status.index}"> 
								<a href="getAllFee.do?curPage=${status.index}&descOrAsc=sort_${descOrAsc}&field=${field}">${status.index}</a>
							</c:if>
						</c:if>
					</c:forEach>
					<c:if test="${curPage==1&&totalPage>=3}">
	               				<a href="getAllFee.do?curPage=3&descOrAsc=sort_${descOrAsc}&field=${field}">3</a>
	               			</c:if>
	        	      <c:if test="${curPage!=totalPage}">
	        	        <a href="getAllFee.do?curPage=${curPage+1}&descOrAsc=sort_${descOrAsc}&field=${field}">下一页</a>
	        	       
	        	        <a href="getAllFee.do?curPage=${totalPage}&descOrAsc=sort_${descOrAsc}&field=${field}">末页</a>
	        	      </c:if>  
	        	      <span>&nbsp;第${curPage}页/共${totalPage}页&nbsp;&nbsp;&nbsp;共${totalSize}条记录</span>
                </div>
                <input id="idSort" name="idSort" type="hidden">
                <input id="baseSort" name="baseSort" type="hidden">
                <input id="timeSort" name="timeSort" type="hidden">
                <input id="message" type="hidden">
            </form>
        </div>
        <!--主要区域结束-->
        <div id="footer">
           
        </div>
    </body>
</html>