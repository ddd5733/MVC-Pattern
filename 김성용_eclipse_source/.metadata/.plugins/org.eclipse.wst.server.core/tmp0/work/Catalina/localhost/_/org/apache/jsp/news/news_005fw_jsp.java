/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.72
 * Generated at: 2019-12-13 04:01:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.news;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import common.CommonUtil;

public final class news_005fw_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/common/common_session_info.jsp", Long.valueOf(1573107591886L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1574166490189L));
    _jspx_dependants.put("/footer2.jsp", Long.valueOf(1574915037375L));
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');

	String sessionName =
						CommonUtil.checkNull((String)session.getAttribute("session_name"));
	String sessionId =
						CommonUtil.checkNull((String)session.getAttribute("session_id"));
	String sessionLevel = 
						CommonUtil.checkNull((String)session.getAttribute("session_level"));

      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("\t<title>project1</title>\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t\t<link href=\"/css/common.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"/css/join.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"/css/login.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"/css/notice-cont.css?ver=2\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"/css/noticewrite.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"/css/sub1.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"/css/sub2.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"/css/sub3.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"/css/sub4.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"/css/sub-artist.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"/css/sub-contact.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"/css/sub-cp.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"/css/sub-faq.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"/css/sub-mpp.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"/css/sub-mtp.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"/css/sub-news.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"/css/sub-news-1.css?ver=3\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"/css/sub-qna.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"/css/sub-notice.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"/css/el.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"/css/header.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.0.9/css/all.css\">\r\n");
      out.write("\t\t<script src=\"/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"/js/common.js\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<!-- skip navigation -->\r\n");
      out.write("\t\t<dl id=\"access\">\r\n");
      out.write("\t\t\t<dt>ë°ë¡ê°ê¸° ë° ê±´ëëê¸° ë§í¬</dt>\r\n");
      out.write("\t\t\t<dd><a href=\"#contents\">ë³¸ë¬¸ë°ë¡ê°ê¸°</a></dd>\r\n");
      out.write("\t\t\t<dd><a href=\"#navigation\">ì£¼ë©ë´ ë°ë¡ê°ê¸°</a></dd>\r\n");
      out.write("\t\t</dl>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"big-box\">\r\n");
      out.write("\t\t\t<header>\r\n");
      out.write("\t\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t\t<div class=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"sub1.jsp\">ABOUT EL WIDE</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"sub2.jsp\">MUSIC</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"sub3.jsp\">MEDIA</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"sub4.jsp\">CULTURE</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"/notice/notice_r.jsp\">NOTICE</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t\t<h1 class=\"el-logo\"><a href=\"/index.jsp\"><img src=\"/images/elwide-logo.svg\" width=\"88\" height=\"88\"></a></h1>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"side-bar\">\r\n");
      out.write("\t\t\t\t\t<div class=\"side-menu\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"http://www.facebook.com/elmusickorea\" target=\"_blank\"><i class=\"fab fa-facebook-f\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"https://blog.naver.com/elmusicstudio\" target=\"_blank\"><i class=\"fab fa-blogger-b\"> </i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"https://www.youtube.com/channel/UCkoJ_TsGn-WqDVWEzGnhfcA\"target=\"_blank\"\r\n");
      out.write("\t\t\t\t\t\t\t><i class=\"fab fa-youtube\"> </i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t");
if(!sessionName.equals("")){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"/member/member_logout.jsp\"><i class=\"fas fa-sign-out-alt\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t");
}else{
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"/member/login.jsp\"><i class=\"fas fa-user\"></i></a></li>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"side-text\">\r\n");
      out.write("\t\t\t\t\t\t <ul>\r\n");
      out.write("\t\t\t\t\t\t ");
if(!sessionName.equals("")){
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t \t<li>[");
      out.print(sessionName);
      out.write("]</li>\r\n");
      out.write("\t\t\t\t\t\t ");
}else{
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<li>CONNECT WITH WIDE</li>\r\n");
      out.write("\t\t\t\t\t\t ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t </ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</header>\r\n");
      out.write("\t\t</div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- sub page start -->\r\n");
      out.write("\t\t<div class=\"notice\">\r\n");
      out.write("\t\t\t<div class=\"sub-notice\">\r\n");
      out.write("\t\t\t<h2><span><i class=\"fas fa-edit\"></i> NEWS-write</span></h2>\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"notice-write\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<form name=\"write\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t\t\t<h2 class=\"readonly\">제목, 첨부파일, 내용을 작성합니다</h2>\r\n");
      out.write("\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t<legend>공지사항 글쓰기</legend>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<table class=\"table\">\r\n");
      out.write("\t\t\t\t\t\t\t<caption>공지사항 글쓰기</caption>\r\n");
      out.write("\t\t\t\t\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t<col width=\"20%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<col width=\"*\">\r\n");
      out.write("\t\t\t\t\t\t\t</colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th><label for=\"title\">작성자</label></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td style=\"padding-top:10px; padding-bottom:10px\">");
      out.print(sessionName);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th><label for=\"title\">제목</label></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"t_title\" id=\"title\" class=\"title\" placeholder=\"제목을 입력해주세요\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th><label for=\"cont\">내용</label></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><textarea type=\"cont\" name=\"t_content\" id=\"cont\" class=\"cont\" placeholder=\"내용을 입력해주세요\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th><label for=\"file\">파일 첨부</label></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"file\" name=\"fileName_a\" class=\"file\" id=\"file\"></label></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"javascript:newscheck()\"><input type=\"button\" value=\"전송\" class=\"btn\" ></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" onclick=\"javascript:gohub_r()\" value=\"목록\" class=\"btn\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"t_work\" value=\"insert\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"t_reg_id\" value=\"");
      out.print(sessionId);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<form name=\"list\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"t_work\" value=\"gor\">\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t<!--  footer start  -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<link href=\"/css/footer2.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<footer id=\"footer\">\r\n");
      out.write("\t\t\t<div class=\"footer-text\">\r\n");
      out.write("\t\t\t\t<ul class=\"sub-logo\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/index.jsp\" alt=\"ìë¸ë¡ê³ \">EL WIDE</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<ul class=\"copy\">\r\n");
      out.write("\t\t\t\t\t<li>Copyright â EL WIDE. All Rights Reserved.</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</footer>");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\tfunction gohub_r(){\r\n");
      out.write("\t\t\tvar fm = document.list;\r\n");
      out.write("\t\t\tfm.action =\"/newshubServlet\";\r\n");
      out.write("\t\t\tfm.method =\"post\";\r\n");
      out.write("\t\t\tfm.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\tfunction newscheck() {\r\n");
      out.write("\t\t\t\tif(write.t_title.value==\"\"){\r\n");
      out.write("\t\t\t\talert(\"제목을 입력하세요\");\r\n");
      out.write("\t\t\t\twrite.t_title.focus();\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(write.t_content.value==\"\"){\r\n");
      out.write("\t\t\t\talert(\"내용을 입력하세요\");\r\n");
      out.write("\t\t\t\twrite.t_content.focus();\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t// 첨부 용량 체크 \r\n");
      out.write("\t\t\t\tvar file = write.fileName_a; \r\n");
      out.write("\t\t\t\tif(file.value != \"\"){ //첨부했을때 사이즈 체크\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar fileName = file.value;\r\n");
      out.write("\t\t\t\t\tvar pathFileName = fileName.lastIndexOf(\".\")+1; //확장자 제외한 경로+파일명\r\n");
      out.write("\t\t\t\t\tvar extension = (fileName.substr(pathFileName)).toLowerCase(); //확장자명\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(extension != \"jpg\" && extension != \"gif\" && extension != \"png\"){ //파일명.확장자\r\n");
      out.write("\t\t\t\t\t\talert(extension +\" 형식 파일은 업로드 안됩니다. 이미지 파일만 가능!\")\r\n");
      out.write("\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar position = file.value.lastIndexOf(\"\\\\\")+1; \r\n");
      out.write("\t\t\t\t\tvar fName    = file.value.substr(position);\r\n");
      out.write("\t\t\t\t\tvar len      = fName.length;\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(len > 20){\r\n");
      out.write("\t\t\t\t\t\talert(\"첨부파일명 길이 20자리 이내\");\r\n");
      out.write("\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t// 사이즈체크\r\n");
      out.write("\t\t\t\t\tvar maxSize  = 8 * 1024 * 1024    //8MB\r\n");
      out.write("\t\t\t\t\tvar fileSize = 0;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tvar browser=navigator.appName; // 브라우저 확인\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(browser==\"Microsoft Internet Explorer\"){ // 익스플로러일 경우\r\n");
      out.write("\t\t\t\t\t\tvar oas = new ActiveXObject(\"Scripting.FileSystemObject\");\r\n");
      out.write("\t\t\t\t\t\tfileSize = oas.getFile(file.value).size;\r\n");
      out.write("\t\t\t\t\t}else{\t// 익스플로러가 아닐경우\r\n");
      out.write("\t\t\t\t\t\tfileSize = file.files[0].size;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t// alert(\"파일사이즈 : \"+fileSize);\r\n");
      out.write("\t\t\t\t\tif(fileSize > maxSize){\r\n");
      out.write("\t\t\t\t\t\talert(\"첨부파일 사이즈는 2MB 이내로 등록 가능합니다.    \");\r\n");
      out.write("\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\twrite.action = \"/newsUpdateServlet\";\r\n");
      out.write("\t\t\t\twrite.method = \"post\";\r\n");
      out.write("\t\t\t\twrite.submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t</body>\r\n");
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
