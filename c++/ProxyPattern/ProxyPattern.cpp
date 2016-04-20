// ProxyPattern.cpp : 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include "Proxy.h"

int _tmain(int argc, _TCHAR* argv[])
{
	Google google;
	Proxy proxy(google);
	proxy.Request("www.google.com");
	cout<<proxy.Response()<<endl;

	system("pause");
	return 0;
}

