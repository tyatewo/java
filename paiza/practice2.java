// JSP・・・ webアプリケーションで出力するHTMLのテンプレート（java server pages）
// 　　　　  HTMLの中にjavaコードを記述
// 　　　  　Webページとして出力
// 　　　　  Servlet型テンプレートとして呼び出し
// テンプレート・・・プログラムからのデータを組み合わせるHTMLのひな型　プログラム+HTMLのひな形（テンプレート)=ブラウザ表示
// 　　　　　　データと見た目を分離してプログラムからwebページを見やすくする

// template.jspファイル
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello Template</title>
    </head>
    <body>
        <h1>Hello Template</h1>
        <%= new java.util.Date() %>
    </body>
</html>

//<%= ~ %>これを使ってjavaコードを埋め込めるようになる。


// JSPのコンパイルはtomcatが自動的にやってくれるから、保存したら更新するだけでおｋ

// 練習
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello Template</title>
    </head>
    <body>
        <!-- この下に、テキストを出力するタグを記述する -->
        <p>Hello Servlet!</p>
    </body>
</html>









// #######################################################################
// ServletからJSPを呼び出す

// Servlet...制御部分
// JSP...表示部分
// これら2つを連携させる

// このjspファイルをServletから呼び出す
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello Template</title>
    </head>
    <body>
        <h1>Hello JSP</h1>
        <%= new java.util.Date() %>
    </body>
</html>

// Servletから呼び出せるようにJSPファイルを配置する
// WEB-INFディレクトリの中に専用のディレクトリを配置する
// WEB-INFディレクトリの中にviewsディレクトリを作成し、myworkにあるjspファイルをindex.jspという名前で移動させる
// このjspファイルを呼び出すサーブレットを用意する。

// ShowTemprateファイル
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ShowTemplate extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws IOException, ServletException{

 // 以下で、呼び出すJSPファイルを指定する
        String view = "/WEB-INF/views/index.jsp"; ←呼び出し先のJSPファイルを指定（ここがゴール）
        RequestDispatcher dispatcher = request.getRequestDispatcher(view); ←ほかのプログラムに処理を切り替えるためのオブジェクトとして用意(上で指定したファイルにすべりだいをかける)
        dispatcher.forward(request, response); ←処理を呼び出し先に転送するメソッド（背中を押して滑らせる人）
    }
}

// ↑これがjspファイルを呼び出すサーブレット

// RequestDispatcher　ディスパッチャーがサーブレットからのリクエストをディスパッチ（受け渡し）してくれる。
// request.getRequestDispatcher(view)　ServletからJSPを表示するためのインターフェイス
// forward　サーブレットから別のサーブレットへリクエストをフォワード（forward：転送）する
// forward(request, response)はRequestDispatcherインターフェイスを使うことで使用可能になる。
// forwardを使うことで指定のJSPへ飛ばすことができる。
// 画面遷移の時に使われる？



// Servletをコンパイルする
// $ javac -classpath "../../lib/servlet-api.jar" -d WEB-INF/classes ShowTemplate.java
// ↑JSPを呼び出すサーブレットもコンパイルしたら、classesディレクトリに配置します。
// javac -classpath "../../lib/servlet-api.jar"このファイルを使ってコンパイルしてね
// -d WEB-INF/classes ShowTemplate.java　-d WEB-INF/classesこのディレクトリに入れといてね　コンパイルするファイルはこれだよ


// web.xmlファイルに書き加える
　　<servlet>
        <servlet-name>Temprate</servlet-name>
        <servlet-class>ShowTemplate</servlet-class>class名（ファイル名）
    </servlet>
    <servlet-mapping>
        <servlet-name>Temprate</servlet-name>
        <url-pattern>/show</url-pattern>（ブラウザでのパス入力指定）
    </servlet-mapping>

要約
Servlet（javaファイル）とJSP（jspファイル）で、Webページを表示するプログラムが作成してあります。

ShowTemplate.java（Servlet）に呼び出すJSPファイルを指定するコードを描いて

コンパイル
$ javac -classpath "../../lib/servlet-api.jar" -d WEB-INF/classes ShowTemplate.java

web.xmlファイルに追記する。
　　<servlet>
        <servlet-name>Template</servlet-name>
        <servlet-class>ShowTemplate</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>Template</servlet-name>
        <url-pattern>/show</url-pattern>
    </servlet-mapping>


jsp(表示)→servlet（制御）（jspもってる）→xmlでサーブレットのパス指定→ブラウザでパス入力→表示！








Servletからjspにデータを渡す方法

JSPファイルではjavaのコードを埋め込める
このとき<%...%>を使う

<%@...%>     JSPの宣言（ディレクティブ）
<%!...%>　　　変数やメソッドの宣言
<%=...%>　　　式の評価結果を出力
<%...%>　　　　コードを実行
<%--...--%>　　コメント

ShowTemplate.javaファイル
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ShowTemplate extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws IOException, ServletException {

          request.setAttribute("message", "HelloWorld!");←jspにデータを渡すコード

        String view = "/WEB-INF/views/index.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(view);
        dispatcher.forward(request, response);
    }
}

request.setAttribute("message", "HelloWorld!");←jspにデータを渡すコード
の
requestは
doGet(HttpServletRequest request, HttpServletResponse response)doGetメソッドの引数で設定してある。

doGetの材料は
HttpServletRequestのrequestオブジェクトと
HttpServletResponseのresponseオブジェクトで
構成されている。

setAttributeメソッドを呼び出す
request.setAttribute("message", "HelloWorld!");
（スコープのオブジェクト）.setAttribute(データ名, データ);
requestオブジェクトにAttributeにデータをセットするとJSPがわでデータを取り出すことができる。

ShowTemplate.javaファイルで書いた
request.setAttribute("message", "HelloWorld!");←jspにデータを渡すコード
を実際に受け取る

index.jspファイル
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello Template</title>
    </head>
    <body>
        <h1>Hello JSP</h1>
        <strong><%= new java.util.Date() %></strong>

        <% String message = (String)request.getAttribute("message");%> //追記
        <p><%= message %></p> //追記
    </body>
</html>


ShowTemplate.java
request.setAttribute("message", "HelloWorld!");←jspにデータを渡すコード

index.jspファイル
<% String message = (String)request.getAttribute("message");%> //追記
<p><%= message %></p> //追記 <%=で結果表示、、、"HelloWorld!"が出力される

<% String message = (String)request.getAttribute("message");%>
  (String)request.getAttribute("message");の戻り値をString messageに代入
　％でJavaのコードを実行するときは末尾に;が必要
<%= message %>
　これは出力だけなので;は不要

getAttributeメソッドで
requestオブジェクトからデータを取り出している。

Attribute=属性

setAttribute()...特定の名前を目印に値を格納
getAttribute()...setAttributeで付けた名前をもとに値を取り出す
どこに格納？...request.setAttribute("message", "HelloWorld!");の場合、
　　　　　　　requestの中に"message"という名前を付けた"HelloWorld!"という文字列を格納している。
　　　　　　　session.setAttribute("str","Qiita");の場合、
　　　　　　　sessionの中に"str"と名前を付けた"Qiita"という文字列が格納されている。
取り出す時...　request.getAttribute("message");   (String)request.getAttribute("message");
                         session.getAttribute("str");


要約
右の環境には、ServletとJSPで、Webページを表示するプログラムが作成してあります。
このプログラムを修正して、ShowTemplate.javaからindex.jspに以下のデータを渡して、表示してください。

Hello Servlet

ShowTemplate.java（servlet）にindex.jsp(jsp)へ受け渡すメッセージを指定する
request.setAttribute("message", "HelloServlet!");


ShowTemplate.javaをコンパイルする
（Javaファイルのあるディレクトリに移動してから）
$ javac -classpath "../../lib/servlet-api.jar" -d WEB-INF/classes ShowTemplate.java
ShowTemplate.classにする

web.xmlはclassしか呼び出せないからコンパイルする必要がある。






