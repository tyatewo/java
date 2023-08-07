// HelloWorld Serblet

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            out.println("<html><head>paiza</head><body>");
            out.println("<p>Hello World!</p>");
            out.println("</body></html>");
        }
}

// doGet...このプログラムを呼び出すときにトムキャットが自動で呼び出すメソッド
// 親クラスのメソッドをオーバーライドしている

// HttpServletRequest request...サーブレットを呼び出すときのリクエストに対応したオブジェクト
// このオブジェクトを通じてリクエストに含まれる様々な情報を取り出す

// HttpServletResponse response...サーブレットからの出力に対応したオブジェクト
// このオブジェクトを通して処理結果を出力する


// PrintWriter out...サーブレットでhtmlを直接出力するためにつかう

// out.println("<html><head>paiza</head><body>");...webページの出力として引数のテキストを表示する
