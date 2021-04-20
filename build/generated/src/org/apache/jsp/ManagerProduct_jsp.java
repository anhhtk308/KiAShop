package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ManagerProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- list------------------------------------------------------------------- -->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"table-wrapper\">\n");
      out.write("                    <div class=\"table-title\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <h2>Manage <b>Product</b></h2>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <a href=\"#addEmployeeModal\" class=\"btn btn-success\" data-toggle=\"modal\"><i class=\"material-icons\">&#xE147;</i> <span>Add New Product</span></a>\n");
      out.write("                                <a href=\"#deleteEmployeeModal\" class=\"btn btn-danger\" data-toggle=\"modal\"><i class=\"material-icons\">&#xE15C;</i> <span>Delete</span></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <table class=\"table table-striped table-hover\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>\n");
      out.write("                                    <span class=\"custom-checkbox\">\n");
      out.write("                                        <input type=\"checkbox\" id=\"selectAll\">\n");
      out.write("                                        <label for=\"selectAll\"></label>\n");
      out.write("                                    </span>\n");
      out.write("                                </th>\n");
      out.write("                                <th>ID</th>\n");
      out.write("                                <th>Name</th>\n");
      out.write("                                <th>Image</th>\n");
      out.write("                                <th>Price</th>\n");
      out.write("                                <th>Actions</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                    <div class=\"clearfix\">\n");
      out.write("                        <div class=\"hint-text\">Showing <b>5</b> out of <b>25</b> entries</div>\n");
      out.write("                        <ul class=\"pagination\">\n");
      out.write("                            <li class=\"page-item disabled\"><a href=\"#\">Previous</a></li>\n");
      out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">1</a></li>\n");
      out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">2</a></li>\n");
      out.write("                            <li class=\"page-item active\"><a href=\"#\" class=\"page-link\">3</a></li>\n");
      out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">4</a></li>\n");
      out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">5</a></li>\n");
      out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">Next</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Edit Modal HTML -->\n");
      out.write("            <div id=\"addEmployeeModal\" class=\"modal fade\">\n");
      out.write("                <div class=\"modal-dialog\">\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <form action=\"add\" method=\"post\">\n");
      out.write("                            <div class=\"modal-header\">\n");
      out.write("                                <h4 class=\"modal-title\">Add Product</h4>\n");
      out.write("                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-body\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Name</label>\n");
      out.write("                                    <input name=\"name\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Image</label>\n");
      out.write("                                    <input name=\"image\" type=\"text\" class=\"form-control\" required>\n");
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
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-footer\">\n");
      out.write("                                <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancel\">\n");
      out.write("                                <input type=\"submit\" class=\"btn btn-success\" value=\"Add\">\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Edit Modal HTML -->\n");
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
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
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
      out.write("            <!-- Delete Modal HTML -->\n");
      out.write("            <div id=\"deleteEmployeeModal\" class=\"modal fade\">\n");
      out.write("                <div class=\"modal-dialog\">\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <form>\n");
      out.write("                            <div class=\"modal-header\">\n");
      out.write("                                <h4 class=\"modal-title\">Delete Product</h4>\n");
      out.write("                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-body\">\n");
      out.write("                                <p>Are you sure you want to delete these Records?</p>\n");
      out.write("                                <p class=\"text-warning\"><small>This action cannot be undone.</small></p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-footer\">\n");
      out.write("                                <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancel\">\n");
      out.write("                                <input type=\"submit\" class=\"btn btn-danger\" value=\"Delete\">\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <script src=\"js/manager.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n");
          out.write("                            <tr>\n");
          out.write("                                <td>\n");
          out.write("                                    <span class=\"custom-checkbox\">\n");
          out.write("                                        <input type=\"checkbox\" id=\"checkbox1\" name=\"options[]\" value=\"1\">\n");
          out.write("                                        <label for=\"checkbox1\"></label>\n");
          out.write("                                    </span>\n");
          out.write("                                </td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>\n");
          out.write("                                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                </td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" $</td>\n");
          out.write("                                <td>\n");
          out.write("                                    <a href=\"#editEmployeeModal\" class=\"edit\" data-toggle=\"modal\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Edit\">&#xE254;</i></a>\n");
          out.write("                                    <a href=\"#deleteEmployeeModal\" class=\"delete\" data-toggle=\"modal\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Delete\">&#xE872;</i></a>\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                             ");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listC}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("o");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.listC}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("o");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}
