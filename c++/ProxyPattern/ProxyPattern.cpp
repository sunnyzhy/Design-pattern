// ProxyPattern.cpp : �������̨Ӧ�ó������ڵ㡣
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

