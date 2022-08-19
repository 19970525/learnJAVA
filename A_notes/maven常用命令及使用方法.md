>maven仓库：本地仓库、中央仓库（远程仓库：阿里云、apache仓库）、私有仓库（公司私有仓库）

>冲突解决思路：短路优先-第一声明者优先-覆盖优先

>maven包依赖可见性：设置scope标签值为compile（编译时可见）、test（测试时可见）、provided（编译和测试时可见）、runtime（运行时可见）、system（系统可见） 

maven命令：<br/>
（1）**maven clean**

> 清空target目录

对项目进行清理，清理的过程中会删除删除target目录下编译的内容。

![image-20210828214233469](.\images\image-20210828214233469.png)

（2）**maven compile**

> 编译源码

编译项目源代码。

（3）**maven test**

> Junit测试查看是否报错

对项目的运行测试。

![image-20210828214422568](.\images\image-20210828214422568.png)

（4）maven packet

> 打包

可以打包后的文件存放到项目的 target 目录下，打包好的文件通常都是编译后生成的class文件。

对项目打包有三种打包方式，**pom包**，**jar**包（普通工程）和**war**包（Web工程）。打包方式在pom.xml文件中进行指定。

打成pom包和jar包的工程在新建的时候可以不需要制定maven项目的原型，打成war包的项目需要制定maven项目原型，指定的原型通常为maven-archetype-webapp，代表web项目。

![image-20210828214555456](.\images\image-20210828214555456.png)

（4）maven install。

> 1. 将当前项目工程安装到maven本地仓库，这样项目之间就可以通过pom.xml文件配置依赖关系
>
> 2. package 只是打包到target下，   install是打包安装到我的本地maven仓库。

在本地仓库生成仓库的安装包可以供其他项目引用，同时打包后的文件存放到项目的 target 目录下。

比如：项目A 依赖项目B，   B项目 如果只是执行 clean，package的话，只是打包到B项目的target 下面，  再编译项目A 的时候一览会报编译错误，原因是项目B没有执行install。

![image-20210828215150541](.\images\image-20210828215150541.png)
![image-20210828220426806](.\images\image-20210828220426806.png)