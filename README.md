# RecyclerViewHelloWorld
## 使用RecyclerView实现瀑布流输出helloworld
### 1.首先引入RecyclerView的布局在gradle中
![avatar](https://github.com/Github1103/RecyclerViewHelloWorld/blob/master/app/src/main/res/lab_image/dependency.jpg)
### 2.创建用于存放消息的（hello.kt）的类
![avatar](https://github.com/Github1103/RecyclerViewHelloWorld/blob/master/app/src/main/res/lab_image/hello.jpg)
### 3.自定义适配器HelloAdapter用于瀑布流的加载
![avatar](https://github.com/Github1103/RecyclerViewHelloWorld/blob/master/app/src/main/res/lab_image/adapter.jpg)
### 4.设置adapter的布局
![avatar](https://github.com/Github1103/RecyclerViewHelloWorld/blob/master/app/src/main/res/lab_image/hello_item.jpg)
### 5.修改activity_main的布局，设置为纵向，并且导入瀑布流布局
![avatar](https://github.com/Github1103/RecyclerViewHelloWorld/blob/master/app/src/main/res/lab_image/main_layout.jpg)
### 6.在MainActivity中导入瀑布流适配器，输出图片加helloworld样式
![avatar](https://github.com/Github1103/RecyclerViewHelloWorld/blob/master/app/src/main/res/lab_image/activity.jpg)
### 7.最终实现的效果如下
![avatar](https://github.com/Github1103/RecyclerViewHelloWorld/blob/master/app/src/main/res/lab_image/show.jpg)
