# 网格地图生成器（Grid Map Generator）

## 项目简介

Grid Map Generator 是一个基于 Java Swing 的轻量级网格地图生成工具，用于生成可自定义大小的二维网格地图。  
每一个网格单元由 `MapGrid` 对象表示，`MapGrid` 继承自 `JLabel`，便于进行渲染与交互扩展。

在当前版本中，程序会创建一个静态主窗口（`Window.Win`），其中包含两个面板：

- `Window.Map_panel`：用于显示生成的网格地图  
- `Window.infoboard`：用于显示信息与控制组件  

窗口中提供一个按钮（`Win.start`），用于触发地图生成。

---

## 自定义说明

本项目未提供可视化参数输入界面，因为其设计目标是作为模块嵌入到其他程序中使用。

### 核心地图生成方法

```java
public static MapGrid[][] generate(
    JPanel mapPanel,
    int rows,
    int columns,
    int cellSizeX,
    int cellSizeY
)
```

关于参数含义及返回值的详细说明，请参考源代码中的注释。

> 如果地图显示异常，请尝试调整主窗口大小。

---

## 功能特性

- 支持生成自定义行列数的网格地图  
- 每个网格单元均为独立对象，便于扩展  
- 支持交互式地图渲染  
- 基于 Java Swing 的图形界面  
- 易于嵌入其他 Java 项目  

---

## 运行环境

- Java Development Kit (JDK) 8 或更高版本

## 运行

```bash
java -jar Grid-Map-Generator.jar
```

## 使用方法

1. 启动程序  
2. 点击 **Start** 按钮  
3. 程序将在窗口中生成并显示新的网格地图  

---

## 项目结构

- `src/MapGenerator/Game.java`：程序入口  
- `src/MapGenerator/Window.java`：主窗口与界面布局  
- `src/MapGenerator/MapGrid.java`：网格单元组件  
- `bin/`：编译后的 class 文件  

---

## 贡献

欢迎提出建议、提交改进或扩展功能！
