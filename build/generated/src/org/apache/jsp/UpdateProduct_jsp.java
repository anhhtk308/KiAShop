package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UpdateProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <!--        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("                <title>JSP Page</title>-->\n");
      out.write("        <!-- Required meta tags-->\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("        <!-- Title Page-->\n");
      out.write("        <title>Manager Product</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Main CSS-->\n");
      out.write("        <link href=\"css/manager.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("        <style>\n");
      out.write("            img {\n");
      out.write("                width: 100px;\n");
      out.write("                height: 100px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"page-wrapper\">\n");
      out.write("            <!-- MAIN CONTENT-->\n");
      out.write("            <div class=\"main-content\">\n");
      out.write("                <div class=\"section__content section__content--p30\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <div class=\"overview-wrap\">\n");
      out.write("                                    <h2 class=\"title-1\"><a href=\"ShopControl\">Shop</a> / Manager Product</h2>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row m-t-25\">\n");
      out.write("                            <div class=\"col-sm-6 col-lg-3\">\n");
      out.write("                                <div class=\"overview-item overview-item--c1\">\n");
      out.write("                                    <div class=\"overview__inner\">\n");
      out.write("                                        <div class=\"overview-box clearfix\">\n");
      out.write("                                            <div class=\"icon\">\n");
      out.write("                                                <i class=\"zmdi zmdi-account-o\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"text\">\n");
      out.write("                                                <h2>10368</h2>\n");
      out.write("                                                <span>View</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"overview-chart\">\n");
      out.write("                                            <canvas id=\"widgetChart1\"></canvas>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6 col-lg-3\">\n");
      out.write("                                <div class=\"overview-item overview-item--c2\">\n");
      out.write("                                    <div class=\"overview__inner\">\n");
      out.write("                                        <div class=\"overview-box clearfix\">\n");
      out.write("                                            <div class=\"icon\">\n");
      out.write("                                                <i class=\"zmdi zmdi-shopping-cart\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"text\">\n");
      out.write("                                                <h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${numberI}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("                                                <span>Items solid</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"overview-chart\">\n");
      out.write("                                            <canvas id=\"widgetChart2\"></canvas>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6 col-lg-3\">\n");
      out.write("                                <div class=\"overview-item overview-item--c3\">\n");
      out.write("                                    <div class=\"overview__inner\">\n");
      out.write("                                        <div class=\"overview-box clearfix\">\n");
      out.write("                                            <div class=\"icon\">\n");
      out.write("                                                <i class=\"zmdi zmdi-calendar-note\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"text\">\n");
      out.write("                                                <h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${numberP}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("                                                <span>Product</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"overview-chart\">\n");
      out.write("                                            <canvas id=\"widgetChart3\"></canvas>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6 col-lg-3\">\n");
      out.write("                                <div class=\"overview-item overview-item--c4\">\n");
      out.write("                                    <div class=\"overview__inner\">\n");
      out.write("                                        <div class=\"overview-box clearfix\">\n");
      out.write("                                            <div class=\"icon\">\n");
      out.write("                                                <i class=\"zmdi zmdi-money\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"text\">\n");
      out.write("                                                <h2>$");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalE}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("                                                <span>Total earnings</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"overview-chart\">\n");
      out.write("                                            <canvas id=\"widgetChart4\"></canvas>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- END MAIN CONTENT-->\n");
      out.write("            \n");
      out.write("            <div id=\"editEmployeeModal\" class=\"modal fade\">\n");
      out.write("                <div class=\"modal-dialog\">\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <form>\n");
      out.write("                            <div class=\"modal-header\">\n");
      out.write("                                <h4 class=\"modal-title\">Edit Product</h4>\n");
      out.write("                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-body\">\n");
      out.write("                                \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Name</label>\n");
      out.write("                                    <input name=\"name\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Image</label>\n");
      out.write("                                    <input name=\"image\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>SubImage1</label>\n");
      out.write("                                    <input name=\"subImage1\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>SubImage2</label>\n");
      out.write("                                    <input name=\"subImage2\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>SubImage3</label>\n");
      out.write("                                    <input name=\"subImage3\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>SubImage4</label>\n");
      out.write("                                    <input name=\"subImage4\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Price</label>\n");
      out.write("                                    <input name=\"price\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Title</label>\n");
      out.write("                                    <textarea name=\"title\" class=\"form-control\" required></textarea>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Description</label>\n");
      out.write("                                    <textarea name=\"description\" class=\"form-control\" required></textarea>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Amount</label>\n");
      out.write("                                    <input name=\"amount\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Category</label>\n");
      out.write("                                    <select name=\"category\" class=\"form-select\" aria-label=\"Default select example\">\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-footer\">\n");
      out.write("                                <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancel\">\n");
      out.write("                                <input type=\"submit\" class=\"btn btn-info\" value=\"Save\">\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <script src=\"js/manager.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.listC}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
