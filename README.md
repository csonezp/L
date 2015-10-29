# L
简单的Android Log 封装
## 使用
module的build.gradle中buildTypes要加入buildConfigField，设置debug版为true，relese版为false。然后将此java文件复制到项目中，需要用Log的地方全部用此类来完成。
实例：
`L.d("msg")`
