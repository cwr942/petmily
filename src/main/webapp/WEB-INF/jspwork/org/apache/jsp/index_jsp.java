/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-09-01 07:37:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.Member;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/views/common/main.jsp", Long.valueOf(1693553799811L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.vo.Member");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"ko\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>petmily</title>\n");
      out.write("<script type=\"text/javascript\" src=\"/petmily/resources/js/common/jquery-3.7.0.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"/petmily/resources/js/main/banner_scroll.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"/petmily/resources/css/main/banner.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<section>\n");
      out.write('\n');
 Member member = (Member)session.getAttribute("member"); 
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Petmily</title>\n");
      out.write("<script type=\"text/javascript\" src=\"/petmily/resources/js/main/main.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"/petmily/resources/css/main/main.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	<input type=\"checkbox\" id=\"menuicon\">\n");
      out.write("\n");
      out.write("	<header style=\"left: 0px;\">\n");
      out.write("		<div>\n");
      out.write("			<ul class=\"navi\">\n");
      out.write("				<!-- style=\"top: 50px; right: 77px;\" -->\n");
      out.write("				<li class=\"logo\"><a href=\"/petmily/index.jsp\">Petmily</a></li>\n");
      out.write("				<li>\n");
      out.write("               <form action=\"/petmily/selectdepartment\" method=\"get\" class='formSearch' style=\"margin-right: 80px;\">\n");
      out.write("                  <div class='field'>\n");
      out.write("                     <input class='inputSearch' id='inputSearch' name='inputSearch'\n");
      out.write("                        required type='text'><label for='inputSearch'>\n");
      out.write("                        지역, 이름으로 검색 </label>\n");
      out.write("                  </div>\n");
      out.write("               </form>\n");
      out.write("				</li>\n");
      out.write("\n");
      out.write("				<li><a class=\"sub-link\" href=\"/petmily/selectdepttype?selecttype=9&typename=내주변\">내주변</a></li>\n");
      out.write("				<li><a class=\"sub-link\" href=\"/petmily/splist\" method=\"get\">커뮤니티</a></li>\n");
      out.write("\n");
      out.write("				");
if(member == null){ 
      out.write("\n");
      out.write("				<li><a class=\"sub-link\" href=\"/petmily/views/member/login.jsp\">로그인</a></li>\n");
      out.write("				");
 }else{ 
      out.write("\n");
      out.write("				\n");
      out.write("				<li\n");
      out.write("					style=\"display: inline-block; font-size: 15px; width: 90px; height: 20px; position: absolute; top: 25px; margin-left: 20px;\">");
      out.print( member.getMemberNick() );
      out.write("님</li>\n");
      out.write("				<li\n");
      out.write("					style=\"display: inline-block; font-size: 15px; width: 90px; height: 20px;\"><a\n");
      out.write("					href=\"/petmily/logout\"\n");
      out.write("					style=\"padding-top: 0px; padding-left: 0px; padding-right: 0px; padding-bottom: 0px; margin-left: 45px; position: relative; top: 12px;\">logout</a></li>\n");
      out.write("				");
 } 
      out.write("\n");
      out.write("			</ul>\n");
      out.write("			<label for=\"menuicon\" class=\"menubtn\"> <span></span> <span></span>\n");
      out.write("				<span></span>\n");
      out.write("			</label>\n");
      out.write("		</div>\n");
      out.write("	</header>\n");
      out.write("	<div class=\"menu-container\">\n");
      out.write("		<div class=\"sidebar\">\n");
      out.write("			<span class=\"area_desc\" style=\"margin-top: 25%\">\n");
      out.write("				<ul>\n");
      out.write("					");
 if(member == null) { 
      out.write("\n");
      out.write("					<li class=\"sidebarmenutitle\">더보기</li>\n");
      out.write("					\n");
      out.write("					<li><a href=\"/petmily/suggest\" class=\"sidebarmenu\">고객센터</a></li>\n");
      out.write("					");
 }else if(member.getMemberGrade().equals("1")){ 
      out.write("\n");
      out.write("					<li class=\"sidebarmenutitle\">더보기</li>\n");
      out.write("\n");
      out.write("\n");
      out.write("					<li><a href=\"/petmily/mypet?memberSeq=");
      out.print( member.getMemberSeq() );
      out.write("\" class=\"sidebarmenu\">마이페이지</a></li>\n");
      out.write("\n");
      out.write("					<li><a href=\"/petmily/suggest\" class=\"sidebarmenu\">고객센터</a></li>\n");
      out.write("\n");
      out.write("					");
 }else if(member.getMemberGrade().equals("0")){ 
      out.write("\n");
      out.write("					<li class=\"sidebarmenutitle\">더보기</li>\n");
      out.write("					<li><a href=\"#\" class=\"sidebarmenu\">마이페이지</a></li>\n");
      out.write("					<li><a href=\"/petmily/adminmain\" class=\"sidebarmenu\">업체등록</a></li>\n");
      out.write("					<li><a href=\"/petmily/srtd\" class=\"sidebarmenu\">업체삭제</a></li>\n");
      out.write("					<li><a href=\"/petmily/memli\" class=\"sidebarmenu\">회원등급변경</a></li>\n");
      out.write("					<li><a href=\"#\" class=\"sidebarmenu\">일반게시판관리</a></li>\n");
      out.write("					<li><a href=\"#\" class=\"sidebarmenu\">거래게시판관리</a></li>\n");
      out.write("					<li><a href=\"/petmily/suggestAdmin?mseq=");
      out.print(member.getMemberSeq());
      out.write(", mGrade=");
      out.print(member.getMemberGrade());
      out.write("\" class=\"sidebarmenu\">관리자 고객센터</a></li>\n");
      out.write("					");
 }else if(member.getMemberGrade().equals("2")){ 
      out.write("\n");
      out.write("					\n");
      out.write("					");
 } 
      out.write("\n");
      out.write("				</ul>\n");
      out.write("			</span><br>\n");
      out.write("\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("	</header>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("</section>\n");
      out.write("<div style=\"display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: end;\n");
      out.write("    height: 740px;\">\n");
      out.write("<div class=\"banner-container\" style=\"height: 670px; margin-top:85px\">\n");
      out.write("  <div class=\"banner\">\n");
      out.write("    <div data-index=1><img src=\"/petmily/resources/images/mainbanner/882.jpg\"></div>\n");
      out.write("    <div data-index=2><img src=\"/petmily/resources/images/mainbanner/miho.jpg\"></div>\n");
      out.write("    <div data-index=3><img src=\"/petmily/resources/images/mainbanner/884.jpg\"></div>\n");
      out.write("    <div data-index=4><img src=\"/petmily/resources/images/mainbanner/885.jpg\"></div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"list-button\" style=\"margin-bottom: 28px;\">\n");
      out.write("  <span class=\"list-button-item active\"></span> \n");
      out.write("  <span class=\"list-button-item\"></span> \n");
      out.write("  <span class=\"list-button-item\"></span> \n");
      out.write("  <span class=\"list-button-item\"></span> \n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"block\">\n");
      out.write("<ul style=\"display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\">\n");
      out.write("<span style=\"margin-right:50px;\"><a href=\"/petmily/selectdepttype?selecttype=1&typename=의료\"><ul style=\"display:inline-block\"><li><img src=\"/petmily/resources/images/mainicon/veterinary.png\" style=\"height:100px; width:100px;\"></li><li class=\"main-icon\" style=\"text-align: center\">병원</li></ul></a></span>\n");
      out.write("<span style=\"margin-right:50px;\"><a href=\"/petmily/selectdepttype?selecttype=2&typename=미용\"><ul style=\"display:inline-block\"><li><img src=\"/petmily/resources/images/mainicon/miyong.png\" style=\"height:100px; width:100px;\"></li><li class=\"main-icon\" style=\"text-align: center\">미용</li></ul></a></span>\n");
      out.write("<span style=\"margin-right:50px;\"><a href=\"/petmily/selectdepttype?selecttype=3&typename=용품\"><ul style=\"display:inline-block\"><li><img src=\"/petmily/resources/images/mainicon/shop.png\" style=\"height:100px; width:100px;\"></li><li class=\"main-icon\" style=\"text-align: center\">용품</li></ul></a></span>\n");
      out.write("<span style=\"margin-right:50px;\"><a href=\"/petmily/selectdepttype?selecttype=4&typename=위탁\"><ul style=\"display:inline-block\"><li><img src=\"/petmily/resources/images/mainicon/witac.png\" style=\"height:100px; width:100px;\"></li><li class=\"main-icon\" style=\"text-align: center\">위탁</li></ul></a></span>\n");
      out.write("<span style=\"margin-right:50px;\"><a href=\"/petmily/selectdepttype?selecttype=6&typename=카페/식당\" ><ul style=\"display:inline-block\"><li><img src=\"/petmily/resources/images/mainicon/hosp.png\" style=\"height:100px; width:100px;\"></li><li class=\"main-icon\" style=\"text-align: center\">카페, 식당</li></ul></a></span>\n");
      out.write("<span style=\"margin-right:50px;\"><a href=\"/petmily/selectdepttype?selecttype=7&typename=호텔\"><ul style=\"display:inline-block\"><li><img src=\"/petmily/resources/images/mainicon/hotel.png\" style=\"height:100px; width:100px;\"></li><li class=\"main-icon\" style=\"text-align: center\">호텔</li></ul></a></span>\n");
      out.write("<span style=\"margin-right:50px;\"><a href=\"/petmily/selectdepttype?selecttype=8&typename=문화\"><ul style=\"display:inline-block\"><li><img src=\"/petmily/resources/images/mainicon/muhwa.png\" style=\"height:100px; width:100px;\"></li><li class=\"main-icon\" style=\"text-align: center\">문화</li></ul></a></span>\n");
      out.write("<span style=\"margin-right:50px;\"><a href=\"/petmily/selectdepttype?selecttype=5&typename=장묘\"><ul style=\"display:inline-block\"><li><img src=\"/petmily/resources/images/mainicon/dead.png\" style=\"height:100px; width:100px;\"></li><li class=\"main-icon\" style=\"text-align: center\">장묘</li></ul></a></span>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
