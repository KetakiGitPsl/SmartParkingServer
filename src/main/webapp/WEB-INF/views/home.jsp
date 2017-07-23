<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SMART PARKING</title>

<head>    
   <script type="text/javascript" >
 
   window.onload = function(){
    	var table = document.getElementById("mytable");
    	var rows = table.getElementsByTagName("tr");
    	//alert(rows.length);
    	for (var z = 0; z < rows.length; z++) {
        	//alert(rows[z].cells[1].innerHTML);
            if(rows[z].cells[1].innerHTML=="1")
                rows[z].cells[1].style.backgroundColor = "#00ff00";
            else
            	rows[z].cells[1].style.backgroundColor = "#ff0000";
       
    	}
   }
    </script>  
</head>

<style>
    div
    {
    text-align: left; 
    text-indent: 0px; 
    padding: 0px 0px 0px 0px; 
    margin: 0px 0px 0px 0px;
    }
    td.td
    {
                 border-width : 1px; 
                 background-color: #99cc00;
                 text-align:center;

    }
    </style>  
    
<body>
 
<h1>Parking Slots Summary:</h1><br>

List: ${Msg } **
<br>


<table id = "mytable" width="20%" border="1" cellpadding="2" cellspacing="2" style="background-color: #ffffff;">
<c:forEach var="s" items="${list}">
	<tr valign="top">
		<td>Slot - ${s.slotId}</td>
	 	<td>${s.isAvailable}</td>
	</tr>
</c:forEach>
</table>

</body>
</html>