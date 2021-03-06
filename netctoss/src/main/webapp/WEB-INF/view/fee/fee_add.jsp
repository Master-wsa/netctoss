<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title></title>
        <%@include file="/WEB-INF/view/include/css.jsp" %>
        <script language="javascript" type="text/javascript">
		     //切换资费类型
		     $(function(){
		       	$("#month").click(function(){
		       		$("#month1").hide();
		       		$("#month2").hide();
		       		$("#ftime").val("0");
		       		$("#ftimetip1").attr("name","yes");
		       		$("#bas1").show();
		       		$("#bas2").show();
		       		$("#bfee").val("");
		       		$("#bfeetip1").attr("name","no");
		       		$("#unit1").hide();
		       		$("#unit2").hide();
		       		$("#ufee").val("0");
		       		$("#ufeetip1").attr("name","yes");
		       		$("#bfeetip1").hide();
		       		$("#bfeetip2").hide();
		       		$("#ufeetip1").hide();
		       		$("#ufeetip2").hide();
		       		$("#ftimetip1").hide();
		       		$("#ftimetip2").hide();
		       	})
		       	$("#combo").click(function(){
		       		$("#month1").show();
		       		$("#month2").show(); 
		       		$("#ftime").val("");
		       		$("#ftimetip1").attr("name","no");
		       		$("#bas1").show();
		       		$("#bas2").show();
		       		$("#bfee").val("");
		       		$("#bfeetip1").attr("name","no");
		       		$("#unit1").show();
		       		$("#unit2").show(); 
		       		$("#ufee").val("");
		       		$("#ufeetip1").attr("name","no");
		       		$("#bfeetip1").hide();
		       		$("#bfeetip2").hide();
		       		$("#ufeetip1").hide();
		       		$("#ufeetip2").hide();
		       		$("#ftimetip1").hide();
		       		$("#ftimetip2").hide();
		       	})
		       	$("#time").click(function(){
		       		$("#month1").hide();
		       		$("#month2").hide();
		       		$("#ftime").val("0");
		       		$("#ftimetip1").attr("name","yes");
		       		$("#bas1").hide();
		       		$("#bas2").hide();
		       		$("#bfee").val("0");
		       		$("#bfeetip1").attr("name","yes");
		       		$("#unit1").show();
		       		$("#unit2").show();
		       		$("#ufee").val("");
		       		$("#ufeetip1").attr("name","no");
		       		$("#bfeetip1").hide();
		       		$("#bfeetip2").hide();
		       		$("#ufeetip1").hide();
		       		$("#ufeetip2").hide();
		       		$("#ftimetip1").hide();
		       		$("#ftimetip2").hide();
		       	})
		       	if("${success}"!=''){
		       		showResultDiv("${success}")
		       		window.setTimeout("closeResultDiv()", 1000);
		       	}
		       	$("#fname").focus(function(){
		       		$("#fnametip").show();
		       		$("#fnametip1").hide();
		       		$("#fnametip2").hide();
		       	})
		       	$("#fname").blur(function(){
		       		var reg=/^[a-zA-Z\d\_\u2E80-\u9FFF]{2,50}$/;
		       		var fname=$("#fname").val();
		       		if(reg.test(fname)&&fname!=""){
		       			$("#fnametip").hide();
		       			$.ajax({
		       				url:"${pageContext.request.contextPath}/fee/equalsName.do",
		       				type:"POST",
		       				data:{"fee_name":fname},
		       				success:function(result){
		       					if(result=="yes"){
		       						$("#fnametip1").show();
		       						$("#fnametip1").empty();
		       						$("#fnametip1").hide();
		       						$("#fnametip1").attr("name","yes");
		       						$("#fnametip2").show();
		       					}
		       					if(result=="no"){
		       						$("#fnametip1").show();
		       						$("#fnametip1").empty();
		       						$("#fnametip1").append('资费名重复!');
		       						$("#fnametip1").attr("name","no");
		       					}
		       				}
		       			})
		       		}else {
		       			$("#fnametip").hide();
		       			$("#fnametip1").show();
		       			$("#fnametip1").empty();
		       			$("#fnametip1").append('格式不正确请重新输入!');
		       			$("#fnametip1").attr("name","no");
		       		}
		       	})
		       	$("#ftime").focus(function(){
		       		$("#ftimetip").show();
		       		$("#ftimetip1").hide();
		       		$("#ftimetip2").hide();
		       	})
		       	$("#ftime").blur(function(){
		       		$("#ftimetip").hide();
		       		var reg=/^([1-5]\d{0,2}|600|[1-9]\d{0,1})$/;
		       		var ftime=$("#ftime").val();
		       		if(!reg.test(ftime)||ftime==""){
		       			$("#ftimetip1").empty();
		       			$("#ftimetip1").append('格式不正确请重新输入!');
		       			$("#ftimetip1").show();
		       			$("#ftimetip1").attr("name","no");
		       			
		       		}else{
		       			$("#ftimetip1").attr("name","yes");
		       			$("#ftimetip2").show();
		       		}
		       	})
		       	$("#bfee").focus(function(){
		       		$("#bfeetip").show();
		       		$("#bfeetip1").hide();
		       		$("#bfeetip2").hide();
		       	})
		       	$("#bfee").blur(function(){
		       		$("#bfeetip").hide();
		       		var reg=/^([1-9]{1})([0-9]{0,4})(\.\d{1,2})?$/;
		       		var bfee=$("#bfee").val();
		       		if(!reg.test(bfee)||ftime==""){
		       			$("#bfeetip1").empty();
		       			$("#bfeetip1").append('格式不正确请重新输入!');
		       			$("#bfeetip1").show();
		       			$("#bfeetip1").attr("name","no");
		       			
		       		}else{
		       			$("#bfeetip1").attr("name","yes");
		       			$("#bfeetip2").show();
		       		}
		       	})
		       	$("#ufee").focus(function(){
		       		$("#ufeetip").show();
		       		$("#ufeetip1").hide();
		       		$("#ufeetip2").hide();
		       	})
		       	$("#ufee").blur(function(){
		       		$("#ufeetip").hide();
		       		var reg=/^([1-9]{1})([0-9]{0,4})(\.\d{1,2})?$/;
		       		var ufee=$("#ufee").val();
		       		if(!reg.test(ufee)||ftime==""){
		       			$("#ufeetip1").empty();
		       			$("#ufeetip1").append('格式不正确请重新输入!');
		       			$("#ufeetip1").show();
		       			$("#ufeetip1").attr("name","no");
		       			
		       		}else{
		       			$("#ufeetip1").attr("name","yes");
		       			$("#ufeetip2").show();
		       		}
		       	})
		       	$("#fdesc").focus(function(){
		       		$("#fdesctip").show();
		       		$("#fdesctip1").hide();
		       		$("#fdesctip2").hide();
		       	})
		       	$("#fdesc").blur(function(){
		       		$("#fdesctip").hide();
		       		var reg=/^[a-zA-Z\d\_\u2E80-\u9FFF]{2,100}$/;
		       		var fdesc=$("#fdesc").val();
		       		if(!reg.test(fdesc)||ftime==""){
		       			$("#fdesctip1").empty();
		       			$("#fdesctip1").append('格式不正确请重新输入!');
		       			$("#fdesctip1").show();
		       			$("#fdesctip1").attr("name","no");
		       			
		       		}else{
		       			$("#fdesctip1").attr("name","yes");
		       			$("#fdesctip2").show();
		       		}
		       	})
		       	$("#add").click(function(){
		       		var t1 =$("#fnametip1").attr("name");
		       		var t2 =$("#ftimetip1").attr("name");
		       		var t3 =$("#bfeetip1").attr("name");
		       		var t4 =$("#ufeetip1").attr("name");
		       		var t5 =$("#fdesctip1").attr("name");
		       		 if(t1!="yes"){
		       			$("#fnametip").hide();
		       			$("#fnametip1").show();
		       			$("#fnametip1").empty();
		       			$("#fnametip1").append('格式不正确请重新输入!');
		       		 }else if(t2!="yes"){
		       			$("#ftimetip").hide();
		       			$("#ftimetip1").empty();
		       			$("#ftimetip1").append('格式不正确请重新输入!');
		       			$("#ftimetip1").show();
		       		 }else if(t3!="yes"){
		       			$("#bfeetip").hide();
		       			$("#bfeetip1").empty();
		       			$("#bfeetip1").append('格式不正确请重新输入!');
		       			$("#bfeetip1").show();
		       		 }else if(t4!="yes"){
		       			$("#ufeetip").hide();
		       			$("#ufeetip1").empty();
		       			$("#ufeetip1").append('格式不正确请重新输入!');
		       			$("#ufeetip1").show();
		       		 }else if(t5!="yes"){
		       			$("#fdesctip").hide();
		       			$("#fdesctip1").empty();
		       			$("#fdesctip1").append('格式不正确请重新输入!');
		       			$("#fdesctip1").show();
		       		 }
		       		if(t1=="yes"&&t2=="yes"&&t3=="yes"&&t4=="yes"&&t5=="yes"){
		       			var fee_name=$("#fname").val();
			       		var fee_time=$("#ftime").val();
			       		var fee_bfee=$("#bfee").val();
			       		var fee_ufee=$("#ufee").val();
			       		var fee_des=$("#fdesc").val();
			       		var fee_type=$("[name='type']:checked").val();
		       		    $.ajax({
		          			url:"${pageContext.request.contextPath}/fee/addFee.do",
		          			type:"POST",
		          			data:{"fee_name":fee_name,"fee_time":fee_time,"fee_bfee":fee_bfee,"fee_ufee":fee_ufee,"fee_des":fee_des,"fee_type":fee_type},
		          			success:function(reportList){
		          				if(reportList=="yes"){
		          					 $("#save_result_info").text("添加成功！");
	                                 $("#save_result_info").attr("class","save_success");
	                				 $("#save_result_info").show().delay(1000).hide(300);
	                				 setTimeout("window.location.href ='${pageContext.request.contextPath}/fee/getAllFee.do'",1500);
	                				 
		          				}else{
		          					$("#save_result_info").text("添加失败!");
		                            $("#save_result_info").attr("class","save_fail");
		            				$("#save_result_info").show().delay(1000).hide(300);
		          				}
		          			}
		       			})	 
		      
		       		}
		       	})
		     })
            //保存结果的提示
          	function showResultDiv(flag) {
                //var divResult = document.getElementById("save_result_info");
                if (flag){
                    $("#save_result_info").show();
                	$("#save_result_info").text("创建成功！");
                	$("#save_result_info").attr("class","save_success");
                }else{
                	$("#save_result_info").show();
                 	$("#save_result_info").text("创建失败！");
                 	$("#save_result_info").attr("class","save_fail");
                }
            }
            function closeResultDiv(){
            	$("#save_result_info").hide();
            } 
            document.onreadystatechange = function () {      
                if(document.readyState=="complete") {
                	$("#headClass3").attr("class","fee_on");
                }     
            } 
        </script>
    </head>
    <body >
        <!--Logo区域开始-->
        <%@include file="/WEB-INF/view/include/header.jsp" %>
        <!--导航区域开始-->
        <%@include file="/WEB-INF/view/include/menu.jsp" %>
        <!--主要区域开始-->
        <div id="main">            
            <div id="save_result_info"></div>
            <form action="${pageContext.request.contextPath}/fee/addFee.do" method="post" class="main_form" id="asd">
                <div class="text_info clearfix"><span>资费名称：</span></div>
                <div class="input_info">
                    <input name="fee_name" type="text" class="width300" value="" id="fname"/>
                    <!-- <span class="required">*</span>!-->
                    <div class="validate_msg_short error_msg1" id="fnametip" style="display:none;">2-50长度的字母、数字、汉字和下划线的组合</div>
                    <div class="validate_msg_short error_msg" id="fnametip1" name="no" style="display:none;"></div> 
                    <div class="validate_msg_short success" id="fnametip2"  style="display:none;">&nbsp;</div>
                    
                </div>
                <div class="text_info clearfix"><span>资费类型：</span></div>
                <div class="input_info fee_type">
                    <input type="radio" name="type" id="month" value="0"/>
                    <label for="monthly">包月</label>
                    <input type="radio" name="type" id="combo" value="1"  checked="checked"/>
                    <label for="package">套餐</label>
                    <input type="radio" name="type" id="time" value="2"/>
                    <label for="timeBased">计时</label>
                </div>
                <div class="text_info clearfix" id="month1"><span>基本时长：</span></div>
                <div class="input_info" id="month2">
                    <input name="fee_time" type="text" value="" class="width100" id="ftime" />
                    <span class="info">小时</span>
                    <!-- <span class="required">*</span>!-->
                    <div class="validate_msg_long error_msg1" id="ftimetip" style="display:none;width: 420px;">1-600之间的整数</div>
                    <div class="validate_msg_long error_msg" id="ftimetip1" name="no"  style="display:none;width: 420px;"></div>
                    <div class="validate_msg_long success" id="ftimetip2"  style="display:none;width: 420px;">&nbsp;</div>
                </div>
                <div class="text_info clearfix" id="bas1"><span>基本费用：</span></div>
                <div class="input_info" id="bas2">
                    <input name="fee_bfee" type="text" value="" class="width100" id="bfee" />
                    <span class="info" >元</span>
                    <!-- <span class="required">*</span>!-->
                    <div class="validate_msg_long error_msg1" id="bfeetip" style="display:none;width: 420px;">1-99999.99之间的数值</div>
                    <div class="validate_msg_long error_msg" id="bfeetip1" name="no"   style="display:none;width: 420px;"></div>
                    <div class="validate_msg_long success" id="bfeetip2"  style="display:none;width: 420px;">&nbsp;</div>
                </div>
                <div class="text_info clearfix" id="unit1"><span>单位费用：</span></div>
                <div class="input_info"  id="unit2" >
                    <input name="fee_ufee" type="text" value="" class="width100" id="ufee"/>
                    <span class="info" >元/小时</span>
                    <!-- <span class="required">*</span> !-->
                    <div class="validate_msg_long error_msg1" id="ufeetip" style="display:none;width: 420px;">1-99999.99之间的数值</div>
                    <div class="validate_msg_long error_msg" id="ufeetip1"  name="no"  style="display:none;width: 420px;"></div>
                    <div class="validate_msg_long success" id="ufeetip2"  style="display:none;width: 420px;">&nbsp;</div>
                </div>
                <div class="text_info clearfix"><span>资费说明：</span></div>
                <div class="input_info_high">
                    <textarea name="fee_des" class="width300 height70" id="fdesc"></textarea>
                    <div class="validate_msg_short error_msg1" id="fdesctip" style="display:none;">2-100长度的字母、数字、汉字和下划线的组合</div> 
                    <div class="validate_msg_short error_msg" id="fdesctip1" name="no"    style="display:none;"></div>
                    <div class="validate_msg_short success" id="fdesctip2"  style="display:none;">&nbsp;</div> 
                </div>                    
                <div class="button_info clearfix">
                    <%-- <input type="button" value="保存" class="btn_save" id="add" />
                    <input type="button" value="返回" class="btn_save" onclick="location.href='${pageContext.request.contextPath}/fee/getAllFee.do'" /> --%>
                    <button type="button" class="btn btn-primary" style="height:36px;width:100px;font-size:18px" id="add" >&nbsp;&nbsp;保&nbsp;&nbsp;存&nbsp;&nbsp;</button>
                    <button type="button" class="btn btn-primary" style="height:36px;width:100px;font-size:18px" onclick="location.href='${pageContext.request.contextPath}/fee/getAllFee.do'" >&nbsp;&nbsp;返&nbsp;&nbsp;回&nbsp;&nbsp;</button>
                </div>
            </form>  
        </div>
        <!--主要区域结束-->
        <div id="footer">
          
        </div>
    </body>
</html>
