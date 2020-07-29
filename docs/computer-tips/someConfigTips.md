1. 禁用笔记本键盘：
    管理员模式运行cmd,输入：sc config i8042prt start= disabled，重启即可
    恢复笔记本键盘：
    管理员模式运行cmd,输入：sc config i8042prt start= demand，重启即可
2. vscode交互式运行python代码方法：
    在终端输入：python,之后就进入了交互模式
3. JAVA简单项目：RAFT算法实现
    https://thinkinjava.cn/2019/01/12/2019/2019-01-12-lu-raft-kv/
    https://github.com/AprilYoLies/raft-java
4. 阿里云root密码：Dj20172021
5. 在将md文件push到github时，为文件增加目录：
    - 在vs code中安装 Markdown all in one插件
    - 使用vs code打开md文件
    - 使用快捷键 `ctrl + shift + p`, 在输入框中输入 ：`Markdown all in one:Create table of content`,回车
    - 将md文件push到github,可以看到目录已经生成