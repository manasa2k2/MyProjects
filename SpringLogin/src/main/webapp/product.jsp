<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  action ="success" modelAttribute="product">
	<div align="center">
		<table align = "left" style = "border:1px solid black;">
           <tr>
             <td>Product Id:</td>
             <td><input type = "text" name = "pId" value = "" /></td>
           </tr>
           <tr>
               <td>Product Area </td>
               <td><input type = "text" name = "area" value = "" /></td>
           </tr>
           <tr>
               <td>Price:</td>
               <td><input type = "number" name = "price" value = "" /></td>
           </tr>
          
           <tr>
               <td>Distributor:</td>
               <td><input type = "text" name = "distributor" value = "" /></td>
           </tr>

           <tr>
               <td>State:</td>
               <td>
               <select name="state" id="state">
                   <option value="Telangana">Telangana</option>
                   <option value="Karnataka">Karnataka</option>
                   <option value="Tamilnadu">Tamilnadu</option>
                      <option value="Goa">Goa</option>
                 </select>                               
               </td>
           </tr>
           <tr>
               <td>Product Name:</td>
               <td>
               <select name="pname" id="pname">
                   <option value="Rice">Rice</option>
                   <option value="Sugar">Sugar</option>
                   <option value="Wheat">Wheat</option>
                      <option value="Dal">Dal</option>
                 </select>                               
               </td>
           </tr>
           <tr>
               <td>Country:</td>
               <td>
               <select name="country" id="country">
                   <option value="India">India</option>
                   <option value="Pakistan">Pakistan</option>
                   <option value="Srilanka">Srilanka</option>
                      <option value="Afganistan">Afganistan</option>
                 </select>                               
               </td>
           </tr>
           <tr colspan = 2>
               <td><input type = "Submit" value = "Submit" />&nbsp; &nbsp;<input type = "Submit" value = "Reset" /></td>
           </tr>
            
		</table>
	</div>
</form>
</body>
</html>