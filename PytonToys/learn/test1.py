#!/usr/bin/python3
from urllib.request import *
from bs4 import BeautifulSoup

print("get html")
html = None

try:
	html = urlopen("https://www.zhihu.com/question/20702054")
except Exception as e:
	print(e)

# html can be only read once
#print(html.read())
print()

if html is None:
	print("URL not found")
else:
	bsobj = BeautifulSoup(html.read(), "html.parser")
	print(bsobj.div)

print("end")