<%-- 
    Document   : Shop
    Created on : Jan 13, 2021, 2:10:09 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <title>JSP Page</title>-->
        <meta charset="UTF-8">
        <meta name="description" content="">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

        <!-- Title  -->
        <title>KiA Shop - Be good, Be bad, Be yourself | Shop</title>

        <!-- Favicon  -->
        <link rel="icon" href="img/core-img/favicon2.ico">

        <!-- Core Style CSS -->
        <link href="http://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link rel="stylesheet" href="css/core-style.css">
        <!-- <link rel="stylesheet" href="style.css"> -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </head>
    <body>
        <!-- Search Wrapper Area Start -->
        <jsp:include page="common/search.jsp"></jsp:include>
            <!-- Search Wrapper Area End -->

            <!-- ##### Main Content Wrapper Start ##### -->
        <jsp:include page="common/header.jsp"></jsp:include>
            <!-- Header Area End -->

            <div class="shop_sidebar_area">

                <!-- ##### Single Widget ##### -->
                <div class="widget catagory mb-50">
                    <!-- Widget Title -->
                    <h6 class="widget-title mb-30">Catagories</h6>

                    <!--  Catagories  -->
                    <div class="catagories-menu">
                        <ul>
                        <c:forEach items="${listC}" var="o">
                            <li class="${tag == o.id ? "active":""}"><a href="category?cid=${o.id}">${o.name}</a></li>
                            </c:forEach>
                    </ul>
                </div>
            </div>

            <!-- ##### Single Widget ##### -->
            <div class="widget brands mb-50">
                <!-- Widget Title -->
                <h6 class="widget-title mb-30">Price</h6>

                <div class="widget-desc">
                    <!-- Single Form Check -->
                    <div class="form-check">
                        <input class="form-check-input" type="radio" value="1" id="amado" name="price">
                        <label class="form-check-label" for="amado">Under $100</label>
                    </div>
                    <!-- Single Form Check -->
                    <div class="form-check">
                        <input class="form-check-input" type="radio" value="2" id="ikea" name="price">
                        <label class="form-check-label" for="ikea">$100 - $300</label>
                    </div>
                    <!-- Single Form Check -->
                    <div class="form-check">
                        <input class="form-check-input" type="radio" value="3" id="furniture" name="price">
                        <label class="form-check-label" for="furniture">$300 - $500</label>
                    </div>
                    <!-- Single Form Check -->
                    <div class="form-check">
                        <input class="form-check-input" type="radio" value="4" id="factory" name="price">
                        <label class="form-check-label" for="factory">$500 - $1000</label>
                    </div>
                    <!-- Single Form Check -->
                    <div class="form-check">
                        <input class="form-check-input" type="radio" value="5" id="artdeco" name="price">
                        <label class="form-check-label" for="artdeco">$1000 +</label>
                    </div>
                </div>
            </div>

            <!-- ##### Single Widget ##### -->
            <div class="widget color mb-50">
                <!-- Widget Title -->
                <h6 class="widget-title mb-30">Color</h6>

                <div class="widget-desc">
                    <ul class="d-flex">
                        <li>
                            <a href="#" class="color1"></a>
                        </li>
                        <li>
                            <a href="#" class="color2"></a>
                        </li>
                        <li>
                            <a href="#" class="color3"></a>
                        </li>
                        <li>
                            <a href="#" class="color4"></a>
                        </li>
                        <li>
                            <a href="#" class="color5"></a>
                        </li>
                        <li>
                            <a href="#" class="color6"></a>
                        </li>
                        <li>
                            <a href="#" class="color7"></a>
                        </li>
                        <li>
                            <a href="#" class="color8"></a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>

        <div class="amado_product_area section-padding-100">
            <div class="container-fluid">

                <div class="row">
                    <div class="col-12">
                        <div class="product-topbar d-xl-flex align-items-end justify-content-between">
                            <!-- Total Products -->
                            <div class="total-products">
                                <p>Showing 1-8 0f 25</p>
                                <div class="view d-flex">
                                    <a href="#"><i class="fa fa-th-large" aria-hidden="true"></i></a>
                                    <a href="#"><i class="fa fa-bars" aria-hidden="true"></i></a>
                                </div>
                            </div>
                            <!-- Sorting -->
                            <div class="product-sorting d-flex">
                                <div class="sort-by-date d-flex align-items-center mr-15">
                                    <p>Sort by</p>
                                    <form action="#" method="get">
                                        <select name="select" id="sortBydate">
                                            <option value="value">Oldest</option>
                                            <option value="value">Newest</option>
                                            <option value="value">Popular</option>
                                            <option value="value">Price</option>
                                        </select>
                                    </form>
                                </div>
                                <div class="view-product d-flex align-items-center">
                                    <p>View</p>
                                    <form action="ShopControl" method="post">
                                        <select name="viewPage" id="viewProduct" onchange="this.form.submit()">
                                            <c:forEach items="${listView}" var="o">
                                                <option ${numberProduct == o?"selected":""} value="${o}">${o}</option>
                                            </c:forEach>
                                        </select>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div id="content" class="row">
                    <c:forEach items="${listP}" var="o">
                        <!-- Single Product Area -->
                        <div class="col-12 col-sm-6 col-md-12 col-xl-6">
                            <div class="single-product-wrapper">
                                <!-- Product Image -->
                                <div class="product-img">
                                    <img src="${o.image}" alt="">
                                    <!-- Hover Thumb -->
                                    <!--<img class="hover-img" src="img/product-img/product5.jpg" alt="">-->
                                </div>

                                <!-- Product Description -->
                                <div class="product-description d-flex align-items-center justify-content-between">
                                    <!-- Product Meta Data -->
                                    <div class="product-meta-data">
                                        <div class="line"></div>
                                        <p class="product-price">$${o.price}</p>
                                        <a href="productDetail?productID=${o.id}">
                                            <h6>${o.name}</h6>
                                        </a>
                                    </div>
                                    <!-- Ratings & Cart -->
                                    <div class="ratings-cart text-right">
                                        <div class="ratings">
                                            <i class="fa fa-star" aria-hidden="true"></i>
                                            <i class="fa fa-star" aria-hidden="true"></i>
                                            <i class="fa fa-star" aria-hidden="true"></i>
                                            <i class="fa fa-star" aria-hidden="true"></i>
                                            <i class="fa fa-star" aria-hidden="true"></i>
                                        </div>
                                        <div class="cart">
                                            <c:if test="${o.amount != 0}">
                                                <a href="cart?id=${o.id}" data-toggle="tooltip" data-placement="left" title="Add to Cart"><img src="img/core-img/cart.png" alt=""></a>
                                                <a href="Shop.jsp" style='font-size:16px;' title="Add to favourite">&#129505;</a>
                                            </c:if>
                                            <c:if test="${o.amount == 0}">
                                                <a href="ShopControl" data-toggle="tooltip" data-placement="left">Hết Hàng</a>
                                                <a href="FavouriteControl" style='font-size:16px;' title="Add to favourite">&#129505;</a>
                                            </c:if>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>

                <div class="row">
                    <div class="col-12">
                        <!-- Pagination -->
                        <nav aria-label="navigation">
                            <ul class="pagination justify-content-end mt-50">
                            <c:if test="${sessionScope.cateID eq null}">
                                <c:forEach begin="1" end="${totalPage}" var="i">
                                    <li class="page-item ${pageIndex == i ? "active":""}"><a class="page-link" href="ShopControl?pageIndex=${i}&viewPage=${numberProduct}">${i}</a></li>
                                </c:forEach>
                                    </c:if>
                            <c:if test="${sessionScope.cateID ne null}">
                                <c:forEach begin="1" end="${totalPage}" var="i">
                                <li class="page-item ${pageIndex == i ? "active":""}"><a class="page-link" href="category?pageIndex=${i}&viewPage=${numberProduct}&cid=${sessionScope.cateID}">${i}</a></li>
                                </c:forEach>
                                    </c:if>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
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

    <script>
                                            function searchByName(param) {
                                                var txtSearch = param.value;
                                                console.log(txtSearch);
                                                $.ajax({
                                                    url: "/Project_KiaShop/search",
                                                    type: "get", //send it throung get method
                                                    data: {
                                                        txt: txtSearch
                                                    },
                                                    success: function (data) {
                                                        var row = document.getElementById("content");
                                                        row.innerHTML = data;
                                                    },
                                                    error: function (xhr) {
                                                        //do something to handle error
                                                    }
                                                });
                                            }
    </script>
</body>
</html>
