<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path0" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <%--<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css">--%>
    <link rel="stylesheet" href="${path0}/resource/css/pure-min.css">
    <link rel="stylesheet" href="${path0}/resource/css/grids-responsive-min.css">
    <link rel="stylesheet" href="${path0}/resource/css/styles.css">
    <title>회원 상세보기</title>
</head>
<body>
<div class="pure-menu pure-menu-horizontal">
    <a href="#" class="pure-menu-heading">Your Logo</a>
    <ul class="pure-menu-list">
        <li class="pure-menu-item"><a href="#" class="pure-menu-link">Home</a></li>
        <li class="pure-menu-item pure-menu-selected"><a href="#" class="pure-menu-link">Pricing</a></li>
        <li class="pure-menu-item"><a href="#" class="pure-menu-link">Contact</a></li>
    </ul>
</div>
<div class="banner">
    <h1 class="banner-head">
        <h2>회원 상세보기</h2>
    </h1>
</div>
<div class="l-content" style="width:1280px;margin:20px auto;">
    <table class="pure-table">
        <thead>
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>REGDATE</th>
        </tr>
        </thead>
        <tbody>
            <tr>
                <td>${user.name}</td>
                <td>${user.username}</td>
                <td>${user.regdate}</td>
            </tr>
        </tbody>
    </table>
</div>
<div class="l-content">
    <div class="pricing-tables pure-g">
        <div class="pure-u-1 pure-u-md-1-3">
            <div class="pricing-table pricing-table-free">
                <div class="pricing-table-header">
                    <h2>Personal</h2>

                    <span class="pricing-table-price">
                        $5 <span>per month</span>
                    </span>
                </div>

                <ul class="pricing-table-list">
                    <li>Free setup</li>
                    <li>Custom sub-domain</li>
                    <li>Standard customer support</li>
                    <li>1GB file storage</li>
                    <li>1 database</li>
                    <li>Unlimited bandwidth</li>
                </ul>

                <button class="button-choose pure-button">Choose</button>
            </div>
        </div>

        <div class="pure-u-1 pure-u-md-1-3">
            <div class="pricing-table pricing-table-biz pricing-table-selected">
                <div class="pricing-table-header">
                    <h2>Small Business</h2>

                    <span class="pricing-table-price">
                        $25 <span>per month</span>
                    </span>
                </div>

                <ul class="pricing-table-list">
                    <li>Free setup</li>
                    <li>Use your own domain</li>
                    <li>Standard customer support</li>
                    <li>10GB file storage</li>
                    <li>5 databases</li>
                    <li>Unlimited bandwidth</li>
                </ul>

                <button class="button-choose pure-button">Choose</button>
            </div>
        </div>

        <div class="pure-u-1 pure-u-md-1-3">
            <div class="pricing-table pricing-table-enterprise">
                <div class="pricing-table-header">
                    <h2>Enterprise</h2>

                    <span class="pricing-table-price">
                        $45 <span>per month</span>
                    </span>
                </div>

                <ul class="pricing-table-list">
                    <li>Free setup</li>
                    <li>Use your own domain</li>
                    <li>Premium customer support</li>
                    <li>Unlimited file storage</li>
                    <li>25 databases</li>
                    <li>Unlimited bandwidth</li>
                </ul>

                <button class="button-choose pure-button">Choose</button>
            </div>
        </div>
    </div> <!-- end pricing-tables -->

    <div class="information pure-g">
        <div class="pure-u-1 pure-u-md-1-2">
            <div class="l-box">
                <h3 class="information-head">Get started today</h3>
                <p>
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.
                </p>
            </div>
        </div>

        <div class="pure-u-1 pure-u-md-1-2">
            <div class="l-box">
                <h3 class="information-head">Pay monthly or annually</h3>
                <p>
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ullamco laboris nisi ut aliquip ex ea commodo
                    consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse.
                </p>
            </div>
        </div>

        <div class="pure-u-1 pure-u-md-1-2">
            <div class="l-box">
                <h3 class="information-head">24/7 customer support</h3>
                <p>
                    Cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
                </p>
            </div>
        </div>

        <div class="pure-u-1 pure-u-md-1-2">
            <div class="l-box">
                <h3 class="information-head">Cancel your plan anytime</h3>
                <p>
                    Duis aute irure dolor in reprehenderit in voluptate velit esse
                    cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                </p>
            </div>
        </div>
    </div> <!-- end information -->
</div>
<div class="footer l-box">
    <p>
        <a href="#">Try now</a> for 14 days. No credit card required. Header image courtesy of <a href="http://unsplash.com/">Unsplash</a>.
    </p>
</div>
</body>
</html>