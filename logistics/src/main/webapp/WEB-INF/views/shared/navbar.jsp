
<%-- <%@taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<	<script>
		window.userRole = '${userModel.role}';
	</script>

 --%>


  <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
       <a class="navbar-brand" href="${contextRoot}">
        <img src="${brand}/bootstrap-solid.svg" width="30" height="30" class="d-inline-block align-top" alt="">
       Jordan Contraceptive Logistics System <br/> MOH Familiy Planning Program
       </a> 

<!-- Image and text -->
<!-- <nav class="navbar navbar-light bg-light"> -->
<!--   <a class="navbar-brand" href="#"> -->
<!--     <img src="/docs/4.4/assets/brand/bootstrap-solid.svg" width="30" height="30" class="d-inline-block align-top" alt=""> -->
<!--     Bootstrap -->
<!--   </a> -->
<!-- </nav> -->

      <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li id="about" 
          class="nav-item">
            <a class="nav-link" href="${contextRoot}/about">About</a>
          </li>
<!--           <li class="nav-item"> -->
<!--             <a class="nav-link" href="services.html">Services</a> -->
<!--           </li> -->
<!--           <li class="nav-item"> -->
<!--             <a class="nav-link" href="contact.html">Contact</a> -->
<!--           </li> -->
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownPortfolio" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
              Reports
            </a>
            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownPortfolio">
              <a class="dropdown-item" href="${contextRoot}/1/report">Non-Reporting Facilities Report</a>
              <a class="dropdown-item" href="${contextRoot}/2/report">CYP - Report</a>
              <a class="dropdown-item" href="${contextRoot}/3/report">Supply Status Report</a>
              <a class="dropdown-item" href="${contextRoot}/downloadPDF">4 Column Portfolio</a>
              <a class="dropdown-item" href="portfolio-item.html">Single Portfolio Item</a>
            </div>
          </li>
       <!--    <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownBlog" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
              Blog
            </a>
            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownBlog">
              <a class="dropdown-item" href="blog-home-1.html">Blog Home 1</a>
              <a class="dropdown-item" href="blog-home-2.html">Blog Home 2</a>
              <a class="dropdown-item" href="blog-post.html">Blog Post</a>
            </div>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownBlog" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
              Other Pages
            </a>
            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownBlog">
              <a class="dropdown-item" href="full-width.html">Full Width Page</a>
              <a class="dropdown-item" href="sidebar.html">Sidebar Page</a>
              <a class="dropdown-item" href="faq.html">FAQ</a>
              <a class="dropdown-item" href="404.html">404</a>
              <a class="dropdown-item" href="pricing.html">Pricing Table</a>
            </div>
          </li> -->
        </ul>
      </div>
    </div>
  </nav>
