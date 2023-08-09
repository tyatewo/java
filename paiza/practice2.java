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