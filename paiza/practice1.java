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



//###########################################################################################################
// servlet:サーバー上でjavaを実行する技術
// JSP:htmlの中にjavaのコードを埋め込んで動的にwebページを生成する技術
// tomcat:servletやJSPをじっこうするサーバーアプリケーション


// javaではソースコードを「java」という拡張子のファイルとして記述する。
// それをコンパイルして「class」という拡張子のファイルとして変換する。
// 複数のコードやライブラリがある場合は、それらをまとめて「jar」というファイルで配布することができる。


// サーブレットの実行に必要なディレクトリ
// mywork(自分で作ったディレクトリ)の中にWEB-INFディレクトリ
// WEB-INFの中にclassesディレクトリ
// classesディレクトリの中ににコンパイルしたclassファイルを移動させる

// ブラウザからのアクセスに合わせて、どのクラスを実行するかを指定する
// その為にWEB-INFの中にweb.xmlファイルを作る

// web.xmlファイル
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
        http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
        version="4.0" metadata-complete="true">

    <servlet>
        <servlet-name>Hello</servlet-name>
        <servlet-class>HelloWorld</servlet-class>　　//←呼び出すサーブレット
    </servlet>
    <servlet-mapping>
        <servlet-name>Hello</servlet-name>
        <url-pattern>/hello</url-pattern>　　//←呼び出しパス　ブラウザで「/hello」と入力するとHelloWorld食わすファイルを呼び出すことになる。
    </servlet-mapping>

</web-app>

// ブラウザからのアクセスをどのサーブレットに割り当てるかを指定している。
// これで、ブラウザから~cloud:8080/mywork/hello/と指定すると
// ###############
// paiza

// Hello World!
// ###############
// このように表示される。

// うまくいかないとき…
// ソースコードやコンパイルに入力ミスがないか、作成したディレクトリ名やweb.xmlが違っていないか確認

//###########################################################################################################


// ＠tomcatの再起動を不要にする（起動したまま編集してもリロードで更新してくれる。停止する必要がない）
// tomcat/conf/Catalina/localhost/mywork.xml

// mywork.xmlファイルに下記のように書く。
<Context
reloadable="true"/>


// WEB-INFはサーバーからアクセス呼び出せるけどユーザーからアクセスできないディレクトリ。
// WEB-INFの上位のディレクトリにあるファイルはユーザーが直接アクセスできてしまう。



// Webページを表示するHelloServlet.javaというプログラムを作成してコンパイルしてあります。
// 「/info」というパスにアクセスしたとき、このクラスを実行するように修正してください。

<servlet>
        <servlet-name>Servlet</servlet-name>
        <servlet-class>HelloServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>Servlet</servlet-name>
        <url-pattern>/info</url-pattern>
    </servlet-mapping>

// ブラウザでmywork/infoで入力するとHelloServletクラスのものが表示される。
