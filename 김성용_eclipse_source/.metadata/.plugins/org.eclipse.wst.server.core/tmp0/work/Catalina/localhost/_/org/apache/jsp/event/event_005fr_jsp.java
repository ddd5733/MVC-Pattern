/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.72
 * Generated at: 2019-12-09 03:47:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.event;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import common.CommonUtil;
import java.util.*;
import dao.Event_DAO;
import dto.Event_DTO;
import dto.EventM_DTO;
import common.CommonUtil;

public final class event_005fr_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1574915036074L));
    _jspx_dependants.put("/common/common_session_info.jsp", Long.valueOf(1573107591886L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1574166490189L));
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    ");
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
      out.write("\t\t\r\n");

request.setCharacterEncoding("UTF-8");		

String	lv = sessionLevel;
Event_DAO dao = new Event_DAO();
String selValue = request.getParameter("t_sel");
String txtValue = request.getParameter("t_search");
if(selValue == null){
		selValue = "title";
		txtValue = "";
}
ArrayList<Event_DTO> dtos = dao.getEventList();
String today = CommonUtil.getToday();
String userId = sessionId;




//******** page 시작 *******/
		String tdCount ="5";				

	String r_page = CommonUtil.checkNull(request.getParameter("r_page"));		
	int			current_page;					// 현재페이지 번호
	int			total_page;						// 총페이지 수
	int			total_count;					// 총레코드 수
	int			for_count;						
	int			list_setup_count = 10;			// 한번에 출력될 List 수
	int			p_no;
	int			v_count;
	int			a_count;
	String		url				= null;	

	// 조회된 건수 구하기  total_count : 설정
	if(dtos == null) total_count =0;
	else total_count = dtos.size(); 


	// 페이지번호가 없으면 1페이지로 간주
	if(r_page.equals("")) current_page = 1;
	else current_page = Integer.parseInt(r_page);
		
	for_count		= list_setup_count;
	p_no			= list_setup_count;				// 페이지수가 10
	total_page = total_count / list_setup_count;		// 전체페이지수 계산 (if 23개 게시물이면 2)

	if(current_page == 1) {
		v_count		= 0;
		a_count		= list_setup_count;
		for_count	= 0;
	} else{
		v_count		= 0;
		a_count		= p_no * current_page;
		for_count	= a_count - list_setup_count;
	}
	if(total_page * list_setup_count != total_count)   total_page = total_page +1;
	//******** page 끝 *******/


      out.write("\r\n");
      out.write("<style>\n");
      out.write(".page-number .gagaga {\r\n");
      out.write("    width: 80px;\r\n");
      out.write("    height: 30px;\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("    float: right;\r\n");
      out.write("    background-color: #6dacb8;\r\n");
      out.write("    font-size: 15px;\r\n");
      out.write("    line-height: 25px;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    border: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("</style>\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- sub page start -->\r\n");
      out.write("\t\t<div class=\"notice\">\r\n");
      out.write("\t\t\t<div class=\"sub-notice\">\r\n");
      out.write("\t\t\t<h2><a href=\"/notice/notice_r.jsp\">NOTICE</a></h2>\t\r\n");
      out.write("\t\t\t<h2 class=\"color\"><a href=\"/event/event_r.jsp\"><i class=\"fas fa-check\"></i> Event</a></h2>\r\n");
      out.write("\t\t\t<h2><a href=\"/faq/faq_r.jsp\"> FAQ</a></h2>\t\r\n");
      out.write("\t\t\t<h2><a href=\"/news/news_r.jsp\"> NEWS</a></h2>\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- table start-->\r\n");
      out.write("\t\t\t<div class=\"table-box\">\r\n");
      out.write("\t\t\t\t<table class=\"table\">\r\n");
      out.write("\t\t\t\t\t<caption>공지사항 - 번호, 제목, 첨부, 작성일, 조회수</caption>\r\n");
      out.write("\t\t\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t\t\t<col width=\"5%\">\r\n");
      out.write("\t\t\t\t\t\t<col width=\"*\"> \r\n");
      out.write("\t\t\t\t\t\t<col width=\"12%\">\r\n");
      out.write("\t\t\t\t\t\t<col width=\"20%\">\r\n");
      out.write("\t\t\t\t\t\t<col width=\"20%\">\r\n");
      out.write("\t\t\t\t\t\t<col width=\"12%\">\r\n");
      out.write("\t\t\t\t\t\t<col width=\"10%\">\r\n");
      out.write("\t\t\t\t\t\t<col width=\"7%\">\r\n");
      out.write("\t\t\t\t\t</colgroup>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"col\">Number</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"col\">Title</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"col\">EventCondition</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"col\">Startdate</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"col\">Enddate</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"col\">Writer</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"col\">Hits</th>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"col\">ApplyCondition</th>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
	if ( total_count > 0 ){
		for(int k = 0 ; k < total_count ; k++ )	{
			if(v_count == for_count){ 	
String a =dtos.get(k).getEvent_no();
int result = dao.Kakunin(userId,dtos.get(k).getEvent_no());		

      out.write("\t\t\t\t<a href=\"event_v.jsp\">\r\n");
      out.write("\t\t\t\t\t <tr onClick=\"location.href='event_v.jsp?t_eventNo=");
      out.print(dtos.get(k).getEvent_no());
      out.write("'\" style=\"cursor:pointer;\">\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(k+1);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"txt\">");
      out.print(dtos.get(k).getTitle());
      out.write("</a></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"gray\"><span>\r\n");
      out.write("\t\t\t\t\t\t");
if(CommonUtil.StiWithout(20+dtos.get(k).getEnd_date()) < CommonUtil.StiWithout(today)){
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tClosed \r\n");
      out.write("\t\t\t\t\t\t");
	
							}else{
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tOnGoing\r\n");
      out.write("\t\t\t\t\t\t");

							}
						
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t</span></td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(20+dtos.get(k).getStart_date());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(20+dtos.get(k).getEnd_date());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(dtos.get(k).getReg_id());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(dtos.get(k).getHit());
      out.write("</td>\r\n");
if(result>0){

      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<td style=\"color:red\">Submitted</td>\r\n");

}else {

      out.write("\r\n");
      out.write("\t\t\t\t\t\t<td>Not yet</td>\r\n");

}

      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t </tr>\r\n");
      out.write("\t\t\t\t</a>\r\n");

				v_count = v_count + 1;
				for_count = for_count + 1;
			}else { 
				v_count = v_count + 1;
			}

			if(v_count == a_count)break; 

		}
	}else{	

      out.write("\t\t\t\t\t \r\n");
      out.write("\t\r\n");
      out.write("   <TR align=\"center\" bgcolor=\"white\" >\r\n");
      out.write("       <TD colspan=\"");
      out.print(tdCount);
      out.write("\">doesn't have existing</TD>\r\n");
      out.write("   </TR>\r\n");
	} 
      out.write(" \t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t<div class=\"page-number\">\r\n");
      out.write("\t\t\t<a><i class=\"fas fa-arrow-circle-left fa-lg\"></i></a>\r\n");

		url = "event_r.jsp?t_sel="+selValue+"&t_search="+txtValue;		
		out.println(CommonUtil.pageList(current_page, total_page, url));

      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");

				if(lv.equals("manager")){
			
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<a href=\"/event/event_w.jsp\" class=\"btn-write\">Write</a>\r\n");
      out.write("\t\t\t<a href=\"/event/event_check.jsp\" class=\"gagaga\">ApplyList</a>\r\n");
      out.write("\t\t\t<a href=\"/event/event_winner.jsp\" class=\"gagaga\">WinnerCK</a>\r\n");
      out.write("\t\t\t");

				} else {
				
			
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"/event/event_winner.jsp\" class=\"btn-write\">WinnerCK</a>\t\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<link href=\"/css/footer.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t\r\n");
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
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
