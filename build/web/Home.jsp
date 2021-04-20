<%-- 
    Document   : Home
    Created on : Jan 13, 2021, 2:02:06 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">-->
        <!--<title>JSP Page</title>-->
        <meta charset="UTF-8">
        <meta name="description" content="">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

        <!-- Title  -->
        <title>KiA Shop - Be good, Be bad, Be yourself | Home</title>

        <!-- Favicon  -->
        <link rel="icon" href="img/core-img/favicon2.ico">

        <!-- Core Style CSS -->
        <link href="http://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link rel="stylesheet" href="css/core-style.css">
        <!-- <link rel="stylesheet" href="style.css"> -->

    </head>
    <body>
        <!-- Search Wrapper Area Start -->
        <jsp:include page="common/search.jsp"></jsp:include>
            <!-- Search Wrapper Area End -->

            <!-- ##### Main Content Wrapper Start ##### -->
        <jsp:include page="common/header.jsp"></jsp:include>
            <!-- Header Area End -->

            <!-- Product Catagories Area Start -->
            <div class="products-catagories-area clearfix">
                <div class="amado-pro-catagory clearfix">
                <c:forEach items="${listP}" var="o">
                    <!-- Single Catagory -->
                    <div class="single-products-catagory clearfix">
                        <a href="ShopControl">
                            <img src="${o.image}" alt="">
                            <!-- Hover Content -->
                            <div class="hover-content">
                                <div class="line"></div>
                                <p>From $${o.price}</p>
                                <h4>${o.name}</h4>
                            </div>
                        </a>
                    </div>
                </c:forEach>
            </div>
        </div>
        <!-- Product Catagories Area End -->
    </div>
    <!-- ##### Main Content Wrapper End ##### -->

    <!-- ##### Newsletter Area Start ##### -->

    <!-- ##### Newsletter Area End ##### -->

    <!-- ##### Footer Area Start ##### -->
    <jsp:include page="common/footer.jsp"></jsp:include>
    <!-- ##### Footer Area End ##### -->

    <!-- ##### jQuery (Necessary for All JavaScript Plugins) ##### -->
    <script src="js/jquery/jquery-2.2.4.min.js"></script>
    <!-- Popper js -->
    <script src="js/popper.min.js"></script>
    <!-- Bootstrap js -->
    <script src="js/bootstrap.min.js"></script>
    <!-- Plugins js -->
    <script src="js/plugins.js"></script>
    <!-- Active js -->
    <script src="js/active.js"></script>
</body>
</html>
