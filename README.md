# 微信小程序 - 说明
    作为一个喜欢尝鲜的码农也跟着大部队的脚步学习了微信小程序的官方文档，发现微信小程序
    居然可以做到如此简单，并且“小程序”并不是指它小功能少，而是指开发量小、代码少、发
    布方便等从众多繁重的工作中简化而得到的这个“小”。
# 微信小程序的开发难吗？学习周期长吗？
    难者不会，会者不难。不过总体来讲微信小程序算是非常简单的了，在后面的实战实例中可以
    体现出来。至于学习周期，基本看完官方文档就可以着手写代码了。
# 学习微信小程序需要有什么基础？
    1、至少要认识什么是编程
    2、有css基础更容易
    3、懂Javascript更容易
    4、有一定的Html基础
    其他基本也不需要太多的基础。
# 如何学习微信小程序？
    查阅官方文档：https://mp.weixin.qq.com/debug/wxadoc/dev/index.html
    下载IDE工具写代码：https://mp.weixin.qq.com/debug/wxadoc/dev/devtools/download.html
# 微信小程序架构说明
    官方的说明：https://mp.weixin.qq.com/debug/wxadoc/dev/framework/config.html?t=2017112
    
    pages：用来放置程序页面信息，在pages中每一个页面放在一个文件夹下，这里拿index页面作说明：
    在index文件夹中有4个同名的文件（只是后缀有所不同，这个是必须的），
        .js是index页面的业务逻辑层、
        .json是index页面的配置信息文件（无配置信息是可以不要）、
        .wxml：是index页面的视图层（WeiXin Markup language）、
        .wxss：是index页面的样式表（WeiXin Style Sheet，若无样式可以不要）。
    
    utils：用来放置一些通用工具，不用的话，这个是可以删除的。
    
    README.md：这个是自己加进去的，可以不要，我用这个作为该实例的说明
    
    app.js：程序的关键脚本文件，也是整个程序的全局脚本文件，这里的配置在程序的其他页面都可以调用。
    
    app.json：整个程序的全局配置，决定页面文件的路径、窗口表现、设置网络超时时间、设置多 tab 等。
    
    app.wxss：全局样式，wxss其实就是微信进行再次封装后的css，只是在css中增加了一些特殊的处理。