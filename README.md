# OptionAnalyser

## 运行环境

- jdk 15.0.1

## 目录结构

```
├── StackOptionApplication.java
├── application // 应用入口
├── domain // 领域层
│   └── analyser
│       ├── Analyser.java // 聚合根
│       └── entity // 领域实体
│           ├── Option.java
│           ├── OptionOrder.java
│           ├── OptionType.java
│           └── OrderType.java
├── infrastructure // 基础设施层
│   └── persistence
└── presentation // 表现层
    └── controller
```


期权分析工具

- [X] 单脚期权盈亏平衡点
- [ ] 多脚期权盈亏平衡点
- [ ] 策略年化收益率范围
