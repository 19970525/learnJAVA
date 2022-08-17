### everything
1. 空格（“且”）：多关键词模糊匹配<br/>
   比如想要搜索的文件名叫《你是真的狗呀.txt》，那么，输入几个关键词以空格隔开， “你 狗 真 txt”，达到模糊匹配的效果！
2. *（星号）：多关键词模糊顺序匹配<br/>
   1的例子，“*你*真*狗*txt*”，按照关键词的顺序匹配
3. |（“或”）：<br/>
   1的例子，“你 狗 真|假 txt”，可以匹配“真”或“假”两种关键字
4. 匹配引号：输入英文半角引号<br/>
5. 按文件大小搜索：size:>1MB size:1MB-5MB size:1024<br/>
搜索大于300MB的 rar压缩文件：*.rar size:>300MB ，搜索大小1M至5M的文件： size:1MB-5MB ，搜索1024个字节的：size:1024
6. !(“非”):不包含关键词<br/>
搜索所有包含abc 但不包含123的文件：abc !123
7. ?(匹配单个字符)、*（匹配0-多个字符）<br/>
8. 文件内容搜索：content:关键字<br/>
搜索文件内容： d:\笔记 *.txt content:tmtony 搜索D:\笔记 下所有包含“tmtony”字眼的文本文件
9. 多文件批量重命名<br/>
多选文件，右键，选择重命名
10. 高级搜索：搜索-高级搜索<br/>
11. 不知道语法命令，帮助-搜索语法<br/>