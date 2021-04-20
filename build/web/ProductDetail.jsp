<%-- 
    Document   : ProductDetail
    Created on : Jan 13, 2021, 2:09:11 PM
    Author     : Admin
--%>

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
        <title>KiA Shop - Be good, Be bad, Be yourself | Product Details</title>

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

            <!-- Product Details Area Start -->
            <div class="single-product-area section-padding-100 clearfix">
                <div class="container-fluid">

                    <div class="row">
                        <div class="col-12">
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb mt-50">
                                    <li class="breadcrumb-item"><a href="HomeControl">Home</a></li>
                                    <li class="breadcrumb-item"><a href="ShopControl">Shop</a></li>
                                    <li class="breadcrumb-item"><a href="category?cid=${cid}">${cateName}</a></li>
                                <li class="breadcrumb-item active" aria-current="page">${detail.name}</li>
                            </ol>
                        </nav>
                    </div>
                </div>

                <div class="row">
                    <div class="col-12 col-lg-7">
                        <div class="single_product_thumb">
                            <div id="product_details_slider" class="carousel slide" data-ride="carousel">
                                <ol class="carousel-indicators">
                                    <li class="active" data-target="#product_details_slider" data-slide-to="0" style="background-image: url(${image0}); background-repeat: no-repeat; background-size: 100% 100%;">
                                    </li>
                                    <li data-target="#product_details_slider" data-slide-to="1" style="background-image: url(${image1}); background-repeat: no-repeat; background-size: 100% 100%;">
                                    </li>
                                    <li data-target="#product_details_slider" data-slide-to="2" style="background-image: url(${image2}); background-repeat: no-repeat; background-size: 100% 100%;">
                                    </li>
                                    <li data-target="#product_details_slider" data-slide-to="3" style="background-image: url(${image3}); background-repeat: no-repeat; background-size: 100% 100%;">
                                    </li>
                                </ol>
                                <div class="carousel-inner">
                                    <div class="carousel-item active">
                                        <a class="gallery_img" href="${image0}">
                                            <img class="d-block w-100" src="${image0}" alt="First slide">
                                        </a>
                                    </div>
                                    <div class="carousel-item">
                                        <a class="gallery_img" href="${image1}">
                                            <img class="d-block w-100" src="${image1}" alt="Second slide">
                                        </a>
                                    </div>
                                    <div class="carousel-item">
                                        <a class="gallery_img" href="${image2}">
                                            <img class="d-block w-100" src="${image2}" alt="Third slide">
                                        </a>
                                    </div>
                                    <div class="carousel-item">
                                        <a class="gallery_img" href="${image3}">
                                            <img class="d-block w-100" src="${image3}" alt="Fourth slide">
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 col-lg-5">
                        <div class="single_product_desc">
                            <!-- Product Meta Data -->
                            <div class="product-meta-data">
                                <div class="line"></div>
                                <p class="product-price">$${detail.price}</p>
                                <a href="product-details.html">
                                    <h6>${detail.name}</h6>
                                </a>
                                <!-- Ratings & Review -->
                                <div class="ratings-review mb-15 d-flex align-items-center justify-content-between">
                                    <div class="ratings">
                                        <i class="fa fa-star" aria-hidden="true"></i>
                                        <i class="fa fa-star" aria-hidden="true"></i>
                                        <i class="fa fa-star" aria-hidden="true"></i>
                                        <i class="fa fa-star" aria-hidden="true"></i>
                                        <i class="fa fa-star" aria-hidden="true"></i>
                                    </div>
                                    <div class="review">
                                        <a href="#">Write A Review</a>
                                    </div>
                                </div>
                                <!-- Avaiable -->
                                <p class="avaibility"><i class="fa fa-circle"></i> In Stock</p>
                            </div>

                            <div class="short_overview my-5">
                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aliquid quae eveniet culpa officia quidem mollitia impedit iste asperiores nisi reprehenderit consequatur, autem, nostrum pariatur enim?</p>
                            </div>


                            <!-- Add to Cart Form -->
                            <form class="cart clearfix" method="post" action="sendPID">
                                <!--<div class="cart-btn d-flex mb-50">-->
<!--                                    <p>Qty</p>
                                    <div class="quantity">
                                        <span class="qty-minus" onclick="var effect = document.getElementById('qty');
                                                var qty = effect.value;
                                                if (!isNaN(qty) & amp)
                                                    ;
                                                amp;
                                                qty & gt;
                                                1;
                                                effect.value--;
                                                return false;"><i class="fa fa-caret-down" aria-hidden="true"></i></span>
                                        <input type="number" class="qty-text" id="qty" step="1" min="1" max="300" name="quantity" value="1">
                                        <span class="qty-plus" onclick="var effect = document.getElementById('qty');
                                                var qty = effect.value;
                                                if (!isNaN(qty))
                                                    effect.value++;
                                                return false;"><i class="fa fa-caret-up" aria-hidden="true"></i></span>
                                    </div>-->
                                <!--</div>-->
                                <button type="submit" name="addtocart" value="${detail.id}" class="btn amado-btn">Add to cart</button>
                            </form>
                            <form action="loadMore" method="post">
                                <button type="submit" class="loadMore">Load More</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Product Details Area End -->
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
    <style>
        .loadMore{
            display: inline-block;
            min-width: 160px;
            height: 55px;
            color: #ffffff;
            border: none;
            border-radius: 0;
            padding: 0 7px;
            font-size: 18px;
            line-height: 56px;
            background-color: #fbb710;
            font-weight: 400;
            margin-top: 10px;
        }
        .loadMore.active,
        .loadMore:hover,
        .loadMore:focus {
            font-size: 18px;
            color: #ffffff;
            background-color: #131212;
        }
        .loadMore{
            width: 160px;
            display: block;
        }
        .loadMore{
            width: 310px;
            height: 80px;
            line-height: 80px;
        }
        @media only screen and (min-width: 992px) and (max-width: 1199px) {
            .loadMore{
                width: 250px;
            }
        }
        @media only screen and (max-width: 767px) {
            .loadMore{
                width: 280px;
            }
        }
    </style>
</body>
</html>
