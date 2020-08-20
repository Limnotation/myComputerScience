- [数据结构](#数据结构)
  - [树](#树)
    - [二叉树遍历问题](#二叉树遍历问题)
      - [树结点定义](#树结点定义)
      - [树的遍历](#树的遍历)
        - [递归遍历](#递归遍历)
        - [前序非递归](#前序非递归)
        - [中序非递归](#中序非递归)
        - [后序非递归](#后序非递归)
    - [普通二叉树问题（未仔细分类）](#普通二叉树问题未仔细分类)
      - [题目示例1 `leetcode 104 二叉树的最大深度`](#题目示例1-leetcode-104-二叉树的最大深度)
      - [题目示例2`leetcode 110 平衡二叉树`](#题目示例2leetcode-110-平衡二叉树)
      - [题目示例3： `leetcode 124:二叉树中的最大路径和`](#题目示例3-leetcode-124二叉树中的最大路径和)
      - [题目示例4  `leetcode 236 二叉树的最近公共祖先`](#题目示例4-leetcode-236-二叉树的最近公共祖先)
      - [题目示例5 `leetcode 543 二叉树的直径`](#题目示例5-leetcode-543-二叉树的直径)
      - [题目示例6 `leetcode 226 翻转二叉树`](#题目示例6-leetcode-226-翻转二叉树)
      - [题目示例7 `leetcode 617 合并二叉树`](#题目示例7-leetcode-617-合并二叉树)
      - [题目示例8  `leetcode 112 路径总和`](#题目示例8-leetcode-112-路径总和)
      - [题目示例9 `leetcode 437 路径总和III`](#题目示例9-leetcode-437-路径总和iii)
      - [题目示例10 `leetcode 572 另一个树的子树`](#题目示例10-leetcode-572-另一个树的子树)
      - [题目示例11 `leetcode 101 对称二叉树`](#题目示例11-leetcode-101-对称二叉树)
      - [题目示例12 `leetcode 111 二叉树的最小深度`](#题目示例12-leetcode-111-二叉树的最小深度)
      - [题目示例13 `leetcode 404 左叶子之和`](#题目示例13-leetcode-404-左叶子之和)
      - [题目示例14 `leetcode 687 最长同值路径`](#题目示例14-leetcode-687-最长同值路径)
      - [题目示例15 `leetcode 671 二叉树中第二小的节点`](#题目示例15-leetcode-671-二叉树中第二小的节点)
      - [题目示例16 `leetcode 106 从中序遍历和后序遍历构造二叉树`](#题目示例16-leetcode-106-从中序遍历和后序遍历构造二叉树)
      - [题目示例17 `leetcode 105 从前序遍历和中序遍历序列构造二叉树`](#题目示例17-leetcode-105-从前序遍历和中序遍历序列构造二叉树)
      - [题目示例18 `leetcode 116 填充每个节点的下一个右侧节点指针`](#题目示例18-leetcode-116-填充每个节点的下一个右侧节点指针)
      - [题目示例19 `leetcode 117 填充每个节点的下一个右侧节点指针 II`](#题目示例19-leetcode-117-填充每个节点的下一个右侧节点指针-ii)
      - [题目示例20： `leetcode 102 二叉树的层序遍历`](#题目示例20-leetcode-102-二叉树的层序遍历)
      - [题目示例21 ：`leetcode 107 二叉树的层次遍历II`](#题目示例21-leetcode-107-二叉树的层次遍历ii)
      - [题目示例22：`leetcode 103 二叉树的锯齿形层次遍历`](#题目示例22leetcode-103-二叉树的锯齿形层次遍历)
      - [题目示例23 ：`leetcode 114 二叉树展开为链表`](#题目示例23-leetcode-114-二叉树展开为链表)
      - [题目示例24 `leetcode 222 完全二叉树的节点个数`](#题目示例24-leetcode-222-完全二叉树的节点个数)
    - [二叉搜索树](#二叉搜索树)
      - [题目示例1 `leetcode 98 验证二叉搜索树`](#题目示例1-leetcode-98-验证二叉搜索树)
      - [题目示例2 `leetcode  701  二叉搜索树中的插入操作`](#题目示例2-leetcode-701-二叉搜索树中的插入操作)
      - [题目示例3 `leetcode 450 删除二叉搜索树 `](#题目示例3-leetcode-450-删除二叉搜索树-)
      - [题目示例4 `leetcode 669 修剪二叉搜索树`](#题目示例4-leetcode-669-修剪二叉搜索树)
      - [题目示例5 `leetcode 230 二叉搜索树中第K小的元素`](#题目示例5-leetcode-230-二叉搜索树中第k小的元素)
      - [题目示例6 `leetcode 538 把二叉搜索树转换为累加树`](#题目示例6-leetcode-538-把二叉搜索树转换为累加树)
      - [题目示例7 `leetcode 235 二叉查找树的最近公共祖先`](#题目示例7-leetcode-235-二叉查找树的最近公共祖先)
      - [题目示例8 `leetcode 108 将有序数组转换为二叉搜索树`](#题目示例8-leetcode-108-将有序数组转换为二叉搜索树)
      - [题目示例9 `leetcode 109 有序链表转换二叉搜索树`](#题目示例9-leetcode-109-有序链表转换二叉搜索树)
      - [题目示例10 `leetcode 653两数之和IV 输入BST`](#题目示例10-leetcode-653两数之和iv-输入bst)
      - [题目示例 11 `leetcode 530 二叉搜索树的最小绝对差`](#题目示例-11-leetcode-530-二叉搜索树的最小绝对差)
      - [题目示例12 `leetcode 333  最大BST子树`](#题目示例12-leetcode-333-最大bst子树)
      - [题目示例13 `leetcode 776拆分二叉搜索树`](#题目示例13-leetcode-776拆分二叉搜索树)
      - [题目示例14 `leetcode 1214 查找两棵二叉搜索树之和`](#题目示例14-leetcode-1214-查找两棵二叉搜索树之和)
      - [题目示例15 `leetcode 285 二叉搜索树中的顺序后继`](#题目示例15-leetcode-285-二叉搜索树中的顺序后继)
      - [题目示例16 `leetcode 510 二叉搜索树中的中序后继`](#题目示例16-leetcode-510-二叉搜索树中的中序后继)
      - [题目示例17  `leetcode 426 将二叉搜索树转化为排序的双向链表`](#题目示例17-leetcode-426-将二叉搜索树转化为排序的双向链表)
      - [题目示例18 `leetcode 99 恢复二叉搜索树`](#题目示例18-leetcode-99-恢复二叉搜索树)
    - [Tire树](#tire树)
      - [题目示例1 `leetcode 208 实现Tire(前缀树)`](#题目示例1-leetcode-208-实现tire前缀树)
  - [链表](#链表)
    - [基本技能](#基本技能)
    - [常见题型](#常见题型)
      - [基本操作类题目](#基本操作类题目)
        - [题目示例1`leetcode 203 移除链表元素`](#题目示例1leetcode-203-移除链表元素)
        - [题目示例2 `leetcode 237 删除链表中的节点`](#题目示例2-leetcode-237-删除链表中的节点)
        - [题目示例3 `leetcode 21 合并两个有序链表`](#题目示例3-leetcode-21-合并两个有序链表)
        - [题目示例4 `leetcode 23 合并K个排序链表`](#题目示例4-leetcode-23-合并k个排序链表)
        - [题目示例5 `leetcode 86 分隔链表`](#题目示例5-leetcode-86-分隔链表)
        - [题目示例6 `leetcode 24 两两交换链表中的节点`](#题目示例6-leetcode-24-两两交换链表中的节点)
        - [题目示例7 `leetcode 61 旋转链表`](#题目示例7-leetcode-61-旋转链表)
        - [题目示例8 `leetcode 143 重排链表`](#题目示例8-leetcode-143-重排链表)
        - [题目示例9 `leetcode 147 对链表进行插入排序`](#题目示例9-leetcode-147-对链表进行插入排序)
        - [题目示例10 `leetcode 148 排序链表`](#题目示例10-leetcode-148-排序链表)
        - [题目示例11 `leetcode 2 两数相加`](#题目示例11-leetcode-2-两数相加)
      - [反转类题目](#反转类题目)
        - [题目示例1 `leetcode 206 反转链表`](#题目示例1-leetcode-206-反转链表)
        - [题目示例2 `leetcode 92 反转链表II`](#题目示例2-leetcode-92-反转链表ii)
        - [题目示例3 `leetcode 25 K个一组翻转链表`](#题目示例3-leetcode-25-k个一组翻转链表)
      - [链表中的双指针问题](#链表中的双指针问题)
        - [题目示例1  `leetcode 19 删除链表的倒数第N个节点`](#题目示例1-leetcode-19-删除链表的倒数第n个节点)
        - [题目示例 2 `leetcode 83 删除排序链表中的重复元素`](#题目示例-2-leetcode-83-删除排序链表中的重复元素)
        - [题目示例3  `leetcode 82 删除排序链表中的重复元素II`](#题目示例3-leetcode-82-删除排序链表中的重复元素ii)
        - [题目示例4 `leetcode 141 环形链表`](#题目示例4-leetcode-141-环形链表)
        - [题目示例5  `leetcode 142 环形链表II`](#题目示例5-leetcode-142-环形链表ii)
        - [题目示例6 `leetcode 234 回文链表`](#题目示例6-leetcode-234-回文链表)
        - [题目示例7 `leetcode 328 奇偶链表`](#题目示例7-leetcode-328-奇偶链表)
      - [其他题目](#其他题目)
        - [题目示例11 `leetcode 138 复制带随机指针的链表`](#题目示例11-leetcode-138-复制带随机指针的链表)
        - [题目示例 12 `leetcode 876 链表的中间结点`](#题目示例-12-leetcode-876-链表的中间结点)
        - [题目示例15 `leetcode 1171 从链表中删去总和值为零的连续节点`](#题目示例15-leetcode-1171-从链表中删去总和值为零的连续节点)
        - [题目示例16 `leetcode 708 循环有序链表的插入`](#题目示例16-leetcode-708-循环有序链表的插入)
        - [题目示例17 `leetcode 1474 删链表M个节点之后的N个节点`](#题目示例17-leetcode-1474-删链表m个节点之后的n个节点)
        - [题目示例18 `leetcode 369 给单链表加一`](#题目示例18-leetcode-369-给单链表加一)
  - [栈和队列](#栈和队列)
    - [栈](#栈)
      - [题目示例1 `leetcode 155 最小栈`](#题目示例1-leetcode-155-最小栈)
      - [题目示例2 `leetcode 150 逆波兰表达式求值`](#题目示例2-leetcode-150-逆波兰表达式求值)
      - [题目示例3 `leetcode 394 字符串解码`](#题目示例3-leetcode-394-字符串解码)
      - [题目示例4 `leetcode 20 有效的括号`](#题目示例4-leetcode-20-有效的括号)
    - [栈和队列的特殊应用1：单调栈/单调队列](#栈和队列的特殊应用1单调栈单调队列)
      - [概念](#概念)
        - [单调栈：](#单调栈)
        - [单调队列：](#单调队列)
      - [典型题目](#典型题目)
        - [题目示例 1 `leetcode 496 下一个更大元素I`](#题目示例-1-leetcode-496-下一个更大元素i)
        - [题目示例2 `leetcode 503 下一个更大元素II`](#题目示例2-leetcode-503-下一个更大元素ii)
        - [题目示例3 `leetcode 739 每日温度`](#题目示例3-leetcode-739-每日温度)
        - [题目示例 4`leetcode 962 最大宽度坡`](#题目示例-4leetcode-962-最大宽度坡)
        - [题目示例5 `leetcode 42 接雨水`](#题目示例5-leetcode-42-接雨水)
        - [题目示例 6 `leetcode 84 柱状图中最大的矩形`](#题目示例-6-leetcode-84-柱状图中最大的矩形)
        - [题目示例7 `leetcode 239 滑动窗口最大值`](#题目示例7-leetcode-239-滑动窗口最大值)
        - [题目示例8 `leetcode 85 最大矩形 `](#题目示例8-leetcode-85-最大矩形-)
        - [题目示例9 `leetcode 402 移掉K位数字`](#题目示例9-leetcode-402-移掉k位数字)
        - [题目示例10 `leetcode 768 最多能完成排序的块II`](#题目示例10-leetcode-768-最多能完成排序的块ii)
        - [题目示例11 `leetcode 901 股票价格跨度`](#题目示例11-leetcode-901-股票价格跨度)
        - [题目示例12 `leetcode 1019 链表的下一个更大结点`](#题目示例12-leetcode-1019-链表的下一个更大结点)
        - [题目示例13 `leetcode 1124 表现良好的最长时间段`](#题目示例13-leetcode-1124-表现良好的最长时间段)
        - [题目示例14 `leetcode 316 去除重复字母`](#题目示例14-leetcode-316-去除重复字母)
        - [题目示例15 `leetcode 132模式`](#题目示例15-leetcode-132模式)
  - [并查集](#并查集)
    - [概念](#概念-1)
      - [1、基础并查集代码](#1基础并查集代码)
    - [典型题目](#典型题目-1)
      - [基础题目](#基础题目)
        - [题目示例1 `leetcode 547 朋友圈`](#题目示例1-leetcode-547-朋友圈)
        - [题目示例2 `leetcode 323 无向图中连通分量的个数`](#题目示例2-leetcode-323-无向图中连通分量的个数)
        - [题目示例3 `leetcode 261 以图判树`](#题目示例3-leetcode-261-以图判树)
        - [题目示例4 `leetcode 1319 连通网络的操作次数`](#题目示例4-leetcode-1319-连通网络的操作次数)
        - [题目示例5 `leetcode 684 冗余连接`](#题目示例5-leetcode-684-冗余连接)
        - [题目示例6 `leetcode 990 等式方程的可满足性`](#题目示例6-leetcode-990-等式方程的可满足性)
      - [带权值的并查集问题](#带权值的并查集问题)
        - [题目示例1 `leetcode 128 最长连续序列`](#题目示例1-leetcode-128-最长连续序列)
  - [堆/优先队列](#堆优先队列)
    - [典型题目](#典型题目-2)
      - [题目示例1 `leetcode 692 前K个高频单词`](#题目示例1-leetcode-692-前k个高频单词)
- [基础算法](#基础算法)
  - [排序](#排序)
  - [深度优先搜索](#深度优先搜索)
    - [概念](#概念-2)
      - [1、沉岛思想](#1沉岛思想)
    - [典型题目](#典型题目-3)
      - [题目示例1 `leetcode 200 岛屿数量`](#题目示例1-leetcode-200-岛屿数量)
      - [题目示例2  `leetcode 733 图像渲染`](#题目示例2-leetcode-733-图像渲染)
      - [题目示例3 `剑指offer 13 机器人的运动范围`](#题目示例3-剑指offer-13-机器人的运动范围)
      - [题目示例4 `leetcode 695 岛屿的最大面积`](#题目示例4-leetcode-695-岛屿的最大面积)
      - [题目示例5 `leetcode 1254 统计封闭岛屿的数目`](#题目示例5-leetcode-1254-统计封闭岛屿的数目)
      - [题目示例6 `leetcode 130 被围绕的区域`](#题目示例6-leetcode-130-被围绕的区域)
      - [题目示例7 `leetcode 417 太平洋大西洋水流问题`](#题目示例7-leetcode-417-太平洋大西洋水流问题)
      - [题目示例8 `leetcode 329 矩阵中的最长递增路径`](#题目示例8-leetcode-329-矩阵中的最长递增路径)
      - [题目示例9 `leetcode 199 二叉树的右视图`](#题目示例9-leetcode-199-二叉树的右视图)
      - [题目示例10 `leetcode 257 二叉树的所有路径`](#题目示例10-leetcode-257-二叉树的所有路径)
  - [二分搜索](#二分搜索)
    - [二分搜索模板](#二分搜索模板)
      - [零、二分查找框架](#零二分查找框架)
      - [一、寻找一个数（基本的二分搜索）](#一寻找一个数基本的二分搜索)
      - [二、寻找左侧边界的二分搜索](#二寻找左侧边界的二分搜索)
      - [三、寻找右侧边界的二分查找](#三寻找右侧边界的二分查找)
      - [四、逻辑统一](#四逻辑统一)
    - [典型题目](#典型题目-4)
      - [题型1：二分求满足条件的元素](#题型1二分求满足条件的元素)
        - [题目示例1 `leetcode 704 二分查找`](#题目示例1-leetcode-704-二分查找)
        - [题目示例2 `leetcode 34 在排序数组中查找元素的第一个和最后一个位置`](#题目示例2-leetcode-34-在排序数组中查找元素的第一个和最后一个位置)
        - [题目示例3 `leetcode 35 搜索插入位置`](#题目示例3-leetcode-35-搜索插入位置)
        - [题目示例4 `leetcode 33 搜索旋转排序数组`](#题目示例4-leetcode-33-搜索旋转排序数组)
        - [题目示例5 `leetcode 81 搜索旋转排序数组II`](#题目示例5-leetcode-81-搜索旋转排序数组ii)
        - [题目示例6  `leetcode 153 寻找旋转排序数组中的最小值`](#题目示例6-leetcode-153-寻找旋转排序数组中的最小值)
        - [题目示例7 `leetcode 154 寻找旋转排序数组中的最小值II`](#题目示例7-leetcode-154-寻找旋转排序数组中的最小值ii)
        - [题目示例8 `leetcode 275 H指数II`](#题目示例8-leetcode-275-h指数ii)
      - [题目示例2 `leetcode 74 搜索二维矩阵`](#题目示例2-leetcode-74-搜索二维矩阵)
      - [题目示例3 `leetcode 278 第一个错误的版本`](#题目示例3-leetcode-278-第一个错误的版本)
      - [题目示例8 `leetcode 162 寻找峰值`](#题目示例8-leetcode-162-寻找峰值)
      - [题目示例10  `leetcode 287 寻找重复数`](#题目示例10-leetcode-287-寻找重复数)
      - [题目示例11 `leetcode 315 计算右侧小于当前元素的个数`](#题目示例11-leetcode-315-计算右侧小于当前元素的个数)
      - [题目示例12 `leetcode 69 X的平方根`](#题目示例12-leetcode-69-x的平方根)
      - [题目示例13 `leetcode 374 猜数字大小`](#题目示例13-leetcode-374-猜数字大小)
      - [题目示例14 `leetcode 638 找到K个最接近的元素`](#题目示例14-leetcode-638-找到k个最接近的元素)
      - [题目示例15 `剑指offer 53-II 0 ~ n-1中缺失的数字`](#题目示例15-剑指offer-53-ii-0--n-1中缺失的数字)
  - [动态规划](#动态规划)
    - [矩阵类型( 10% )](#矩阵类型-10-)
        - [题目示例1 `leetcode 64 最小路径和`](#题目示例1-leetcode-64-最小路径和)
        - [题目示例2 `leetcode 62 不同路径`](#题目示例2-leetcode-62-不同路径)
        - [题目示例3 `leetcode 63不同路径II`](#题目示例3-leetcode-63不同路径ii)
    - [序列类型（40%）](#序列类型40)
        - [题目示例1 `leetcode 70 爬楼梯`](#题目示例1-leetcode-70-爬楼梯)
        - [题目示例2 `leetcode 55跳跃游戏`](#题目示例2-leetcode-55跳跃游戏)
        - [题目示例3 `leetcode 45跳跃游戏II`](#题目示例3-leetcode-45跳跃游戏ii)
        - [题目示例4 `leetcode 132 分割回文串`](#题目示例4-leetcode-132-分割回文串)
        - [题目示例5 `leetcode 300最长上升子序列`](#题目示例5-leetcode-300最长上升子序列)
        - [题目示例6 `leetcode 139 单词拆分`](#题目示例6-leetcode-139-单词拆分)
        - [题目示例7 `leetcode 647 回文子串`](#题目示例7-leetcode-647-回文子串)
    - [双序列（字符串）DP类型 （40%）](#双序列字符串dp类型-40)
    - [0-1背包问题 （10%）](#0-1背包问题-10)
        - [题目示例1 `leetcode 416分割等和子集`](#题目示例1-leetcode-416分割等和子集)
        - [题目示例2 `leetcode 322零钱兑换`](#题目示例2-leetcode-322零钱兑换)
        - [题目示例3 `leetcode 518 零钱兑换II`](#题目示例3-leetcode-518-零钱兑换ii)
    - [`leetcode 股票买卖系列问题`](#leetcode-股票买卖系列问题)
        - [题目示例1 `leetcode 121 买卖股票的最佳时机`](#题目示例1-leetcode-121-买卖股票的最佳时机)
        - [题目示例2 `leetcode 122 买卖股票的最佳时机II`](#题目示例2-leetcode-122-买卖股票的最佳时机ii)
        - [题目示例3 `leetcode 123 买卖股票的最佳时机III`](#题目示例3-leetcode-123-买卖股票的最佳时机iii)
        - [题目示例4 `leetcode 124 买卖股票的最佳时机IV`](#题目示例4-leetcode-124-买卖股票的最佳时机iv)
        - [题目示例5 `leetcode 309 买卖股票的最佳时机含冷冻期`](#题目示例5-leetcode-309-买卖股票的最佳时机含冷冻期)
        - [题目示例6 `leetcode 714 买卖股票的最佳时机含手续费`](#题目示例6-leetcode-714-买卖股票的最佳时机含手续费)
    - [`leetcode 打家劫舍系列问题`](#leetcode-打家劫舍系列问题)
      - [题目示例1 `leetcode 198 打家劫舍`](#题目示例1-leetcode-198-打家劫舍)
      - [题目示例2 `leetcode 213 打家劫舍II`](#题目示例2-leetcode-213-打家劫舍ii)
      - [题目示例2 `leetcode 337 打家劫舍III`](#题目示例2-leetcode-337-打家劫舍iii)
- [算法思维](#算法思维)
  - [回溯法](#回溯法)
    - [简单的回溯法模板](#简单的回溯法模板)
    - [典型题目](#典型题目-5)
      - [题型1：基本回溯问题，在数组上进行回溯搜索](#题型1基本回溯问题在数组上进行回溯搜索)
        - [题目示例1 `leetcode78 子集 `](#题目示例1-leetcode78-子集-)
        - [题目示例2 `leetcode 90 子集II`](#题目示例2-leetcode-90-子集ii)
        - [题目示例3 `leetcode 46 全排列`](#题目示例3-leetcode-46-全排列)
        - [题目示例4 `leetcode 47 全排列II `](#题目示例4-leetcode-47-全排列ii-)
        - [题目示例5 `leetcode 77 组合`](#题目示例5-leetcode-77-组合)
        - [题目示例6 `leetcode 39 组合总和`](#题目示例6-leetcode-39-组合总和)
        - [题目示例7 `leetcode 40 组合总和II`](#题目示例7-leetcode-40-组合总和ii)
        - [题目示例8 `leetcode 216 组合总和III`](#题目示例8-leetcode-216-组合总和iii)
      - [题型2：字符串上的回溯问题](#题型2字符串上的回溯问题)
        - [题目示例1 `leetcode 131 分割回文串`](#题目示例1-leetcode-131-分割回文串)
        - [题目示例2  `leetcode 93 复原IP地址`](#题目示例2-leetcode-93-复原ip地址)
        - [题目示例3 `leetcode 17 电话号码的字母组合`](#题目示例3-leetcode-17-电话号码的字母组合)
        - [题目示例4 `leetcode 784 字母大小写全排列`](#题目示例4-leetcode-784-字母大小写全排列)
        - [题目示例5 `leetcode 22 括号生成`](#题目示例5-leetcode-22-括号生成)
      - [题型3：二维平面上的回溯问题](#题型3二维平面上的回溯问题)
        - [题目示例1 `leetcode 79 单词搜索`](#题目示例1-leetcode-79-单词搜索)
      - [题型四：游戏问题](#题型四游戏问题)
        - [题目示例1 `leetcode37 解数独`](#题目示例1-leetcode37-解数独)
        - [题目示例2 `leetcode 51 N皇后`](#题目示例2-leetcode-51-n皇后)
      - [其他题目](#其他题目-1)
        - [题目示例17 `leetcode 113 路径总和II`](#题目示例17-leetcode-113-路径总和ii)
        - [题目示例18 `leetcode 401 二进制手表`](#题目示例18-leetcode-401-二进制手表)
        - [题目示例19 `leetcode 1079 活字印刷`](#题目示例19-leetcode-1079-活字印刷)
        - [题目示例20 `leetcode 526 优美的排列`](#题目示例20-leetcode-526-优美的排列)
  - [双指针](#双指针)
    - [快慢指针（同向指针）](#快慢指针同向指针)
      - [题目示例1  `leetcode 19 删除链表的倒数第N个节点`](#题目示例1-leetcode-19-删除链表的倒数第n个节点-1)
    - [左右指针（对撞指针）](#左右指针对撞指针)
      - [题目示例1 `leetcode 15 三数之和`](#题目示例1-leetcode-15-三数之和)
    - [其他双指针](#其他双指针)
  - [滑动窗口技巧](#滑动窗口技巧)
    - [滑动窗口类型](#滑动窗口类型)
      - [固定窗口：窗口的大小是固定的](#固定窗口窗口的大小是固定的)
      - [可变窗口：窗口的大小不固定](#可变窗口窗口的大小不固定)
    - [简单的滑动窗口模板](#简单的滑动窗口模板)
      - [1、可变窗口模板](#1可变窗口模板)
      - [2、固定窗口模板](#2固定窗口模板)
    - [典型题目](#典型题目-6)
      - [可变窗口题目](#可变窗口题目)
        - [题目示例1 `leetcode 76 最小覆盖子串`](#题目示例1-leetcode-76-最小覆盖子串)
        - [题目示例2 `leetcode 567 字符串的排列`](#题目示例2-leetcode-567-字符串的排列)
        - [题目示例3 `leetcode 438 找到字符串中所有字母异位词`](#题目示例3-leetcode-438-找到字符串中所有字母异位词)
        - [题目示例4 `leetcode 3 无重复字符的最长子串`](#题目示例4-leetcode-3-无重复字符的最长子串)
        - [题目示例5 `leetcode 209 长度最小的子数组`](#题目示例5-leetcode-209-长度最小的子数组)
        - [题目示例6 `leetcode 424 替换后的最长字符串`](#题目示例6-leetcode-424-替换后的最长字符串)
        - [题目示例7 `leetcode 1004 最大连续1的个数III`](#题目示例7-leetcode-1004-最大连续1的个数iii)
        - [题目示例8 `leetcode 1100 长度为K的无重复字符子串`](#题目示例8-leetcode-1100-长度为k的无重复字符子串)
        - [题目示例9 `面试题17.18 最短超串`](#题目示例9-面试题1718-最短超串)
        - [题目示例10 `leetcode 159 至多包含两个不同字符的最长子串`](#题目示例10-leetcode-159-至多包含两个不同字符的最长子串)
        - [题目示例11 `leetcode 340 至多包含K个不同字符的最长子串`](#题目示例11-leetcode-340-至多包含k个不同字符的最长子串)
      - [固定窗口题目](#固定窗口题目)
        - [题目示例1 `leetcode 239 滑动窗口最大值`](#题目示例1-leetcode-239-滑动窗口最大值)
        - [题目示例2 `leetcode 1456 定长子串中原因的最大数目`](#题目示例2-leetcode-1456-定长子串中原因的最大数目)
      - [未分类题目](#未分类题目)
        - [题目示例6 `leetcode 904 水果成篮`](#题目示例6-leetcode-904-水果成篮)
        - [题目示例9 `leetcode 992 K个不同整数的子数组`](#题目示例9-leetcode-992-k个不同整数的子数组)
        - [题目示例11 `leetcode 1234 替换子串得到平衡字符串`](#题目示例11-leetcode-1234-替换子串得到平衡字符串)
        - [题目示例12 `leetcode 395 至少有K个重复字符的最长子串`](#题目示例12-leetcode-395-至少有k个重复字符的最长子串)
        - [题目示例13 `leetcode 1208 尽可能使字符串相等`](#题目示例13-leetcode-1208-尽可能使字符串相等)
        - [题目示例14  `leetcode 978 最长湍流子数组`](#题目示例14-leetcode-978-最长湍流子数组)
        - [题目示例15 `leetcode 995 K连续位的最小翻转次数`](#题目示例15-leetcode-995-k连续位的最小翻转次数)
        - [题目示例16 `leetcode 1040 移动石子直到连续`](#题目示例16-leetcode-1040-移动石子直到连续)
        - [题目示例17 `leetcode 1052 爱生气的书店老板`](#题目示例17-leetcode-1052-爱生气的书店老板)
        - [题目示例19 `leetcode 727 最小窗口子序列`](#题目示例19-leetcode-727-最小窗口子序列)
  - [前缀和技巧](#前缀和技巧)
    - [前缀和概念](#前缀和概念)
    - [题目示例](#题目示例)
      - [题目示例1 `leetcode 1 两数之和`](#题目示例1-leetcode-1-两数之和)
      - [题目示例2 `leetcode 560 和为K的子数组`](#题目示例2-leetcode-560-和为k的子数组)
      - [题目示例3 `leetcode 1248 统计优美子数组`](#题目示例3-leetcode-1248-统计优美子数组)
      - [题目示例4 `leetcode 974 和可被K整除的子数组`](#题目示例4-leetcode-974-和可被k整除的子数组)
      - [题目示例5 `leetcode 1074 元素和为目标值的子矩阵数量`](#题目示例5-leetcode-1074-元素和为目标值的子矩阵数量)
      - [题目示例6 `leetcode 930 和相同的二元子数组`](#题目示例6-leetcode-930-和相同的二元子数组)
      - [题目示例7 `leetcode 303 区域和检索-数组不可变`](#题目示例7-leetcode-303-区域和检索-数组不可变)
      - [题目示例8 `leetcode 304二维区域和检索-矩阵不可变`](#题目示例8-leetcode-304二维区域和检索-矩阵不可变)
      - [题目示例9 `leetcode 307 区域和检索-数组可修改`](#题目示例9-leetcode-307-区域和检索-数组可修改)
      - [题目示例10 `leetcode 554砖墙`](#题目示例10-leetcode-554砖墙)
      - [题目示例11 `leetcode 1124 表现良好的最长时间段`](#题目示例11-leetcode-1124-表现良好的最长时间段)
      - [题目示例12  `leetcode 1109 航班预定`](#题目示例12-leetcode-1109-航班预定)
      - [题目示例13 `leetcode 1094 拼车`](#题目示例13-leetcode-1094-拼车)
  - [循环不变量](#循环不变量)
    - [典型题目](#典型题目-7)
      - [题目示例1 `leetcode 283 移动零`](#题目示例1-leetcode-283-移动零)
      - [题目示例2 `剑指offer 21 调整数组顺序使奇数位于偶数的前面`](#题目示例2-剑指offer-21-调整数组顺序使奇数位于偶数的前面)
- [`leetcode` 未归纳题解（按tag分类）](#leetcode-未归纳题解按tag分类)
  - [跳跃游戏系列](#跳跃游戏系列)
    - [题目1 `leetcode 55 跳跃游戏`](#题目1-leetcode-55-跳跃游戏)
  - [数学](#数学)
    - [题目1 `leetcode 7 整数反转`](#题目1-leetcode-7-整数反转)
  - [字符串](#字符串)
    - [题目1 `leetcode 字符串转换整数(atoi)`](#题目1-leetcode-字符串转换整数atoi)
  - [数组](#数组)
  - [排序](#排序-1)
    - [题目1 `leetcode 179 最大数`](#题目1-leetcode-179-最大数)
  - [设计](#设计)
    - [题目1 `leetcode 146 LRU缓存机制`](#题目1-leetcode-146-lru缓存机制)
    - [题目2 `leetcode 1206 设计跳表（未完成，感觉机制有点复杂）`](#题目2-leetcode-1206-设计跳表未完成感觉机制有点复杂)
## 数据结构

### 树

#### 二叉树遍历问题

**前序遍历**：先**访问根节点**，再前序遍历左子树，再前序遍历右子树；

**中序遍历**：先中序遍历左子树，再**访问根节点**，再中序遍历右子树

**后序遍历**：先后序遍历左子树，再后序遍历右子树，再**访问根节点**

注意点

- 以根节点访问顺序决定是什么遍历
- 左子树都是优先于右子树

##### 树结点定义

```java
public class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode( int x ) { val = x };
}
```

------

##### 树的遍历

###### 递归遍历

```java
private void Traversal(TreeNode root) {
    if(root == null)
        return;
    System.out.println(root.val);		// 前序
    preOrderTraverse(root.left);
    // System.out.println(root.val);   // 中序
    preOrderTraverse(root.right);
    // System.out.println(root.val);   // 后序
}
```

-----

###### 前序非递归

```java
// v1
private List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> res = new LinkedList<>();
    if(root == null)
        return res;
    
    Deque<TreeNode> stack = new LinkedList<>();
    while(root != null || !stack.isEmpty()) {
        while(root != null) {
            // 前序遍历，先保存结果
            res.add(root.val);
            // 被存入栈的节点是已经被访问过的节点
            stack.addLast(root);
            // 由先序遍历的规则可知
            root = root.left;
        }
        // pop
        root = stack.removeLast();
        root = root.right;
    }
    return res;
}

// v2
private List<Integer> preorderTraversal( TreeNode root )
{
    List<Integer> res = new LinkedList<>();
    if( root == null )
        return res;
    
    Deque<TreeNode> stack = new LinkedList<>();
    stack.addLast( root );
    while( !stack.isEmpty() )
    {
        TreeNode node = stack.removeLast();
        res.add( node.val );
        if( node.right != null )
            stack.addLast( node.right );
        if( node.left != null )
            stack.addLast( node.left );
    }
    return res;
}
```

------

###### 中序非递归

```java
private List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> res = new LinkedList<>();
    if(root == null)
        return res;
    
    Deque<TreeNode> stack = new LinkedList<>();
    while(!stack.isEmpty() || root != null) {
        while(root != null) {
            stack.addLast(root);
            root = root.left;
        }
        // pop
        root = stack.removeLast();
        res.add(root.val);
        root = root.right;
    }
    return res;
}
```

-----

###### 后序非递归

```java
private List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> res = new LinkedList<>();
    if(root == null)
        return res;
    
    Deque<TreeNode> stack = new LinkedList<>();
    TreeNode lastVisit = null;
    while(root != null || !stack.isEmpty()) {
        while(root != null) {
            stack.addLast(root);
            root = root.left;
        }
        
        TreeNode node = stack.peekLast();
        if(node.right == null || node.right == lastVisit) {
            // 根节点必须在其右子节点弹出之后再弹出
            stack.removeLast();
            res.add(node.val);
            lastVisit = node;
        } else {
            root = node.right;
        }
    }
    return res;
}
```

------

------



#### 普通二叉树问题（未仔细分类）

```go
func traversal( root *TreeNode ) ResultType {
    // nil or leaf
    if root == nil {
        // do something and return
    }
    
    // Divide 
    ResultType left = traversal( root.left )
    ResultType right = traversal( root.right )
    
    // Conquer
    ResultType result = Merge from left to right 
    
    return result
}
```

##### 题目示例1 `leetcode 104 二叉树的最大深度`

```java
private int maxDepth( TreeNode root )
{
    if( root == null )
        return 0;
    
    // divide 
    int left = maxDepth( root.left );
    int right = maxDepth( root.right );
    return Math.max( left, right ) + 1;
}
```

##### 题目示例2`leetcode 110 平衡二叉树`

```java
public boolean isBalanced( TreeNode root )
{
    if( root == null )
        return true;
    
    int left = maxDepth( root.left );
    int right = maxDepth( root.right );
    int absDiff = Math.abs( left - right );
    if( absDiff > 1 )
        return false;
    
    return isBalanced( root.left ) && isBalanced( root.right );
}

private int maxDepth( TreeNode root )
{
    if( root == null )
        return 0;
    
    // divide 
    int left = maxDepth( root.left );
    int right = maxDepth( root.right );
    return Math.max( left, right ) + 1;
}
```

-----

##### 题目示例3： `leetcode 124:二叉树中的最大路径和`

**思路**：分治法，分为三种情况

- 左子树最大路径和最大
- 右子树最大路径和最大
- 左右子树单向路径加上根节点值之和最大

需要保存两个变量：

- 第一个变量为全局变量res，保存子树最大路径和

- 第二个变量保存左右子树单向路径和加上根节点值，为当前子树的经过根节点的路径的最大值

    比较两个变量取最大值

```java
class Solution {
    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        oneSideMax(root);
        return res;
    }
    
    private int oneSideMax(TreeNode root) {
        if(root == null)
            return 0;
        
        // divide
       	int left = Math.max(0, oneSideMax(root.left));
        int right = Math.max(0, oneSideMax(root.right));
        
        // conquer
        res = Math.max(res, left + right + root.val);
        return Math.max(left, right) + root.val;
    }
}
```

##### 题目示例4  `leetcode 236 二叉树的最近公共祖先` 

```java
private TreeNode lowestCommonAncestor( TreeNode root, TreeNode p, TreeNode q)
{
    if( root == null || p == root || q == root )
        return root;
    // divide
    TreeNode left = lowestCommonAncestor( root.left, p, q );
    TreeNode right = lowestCommonAncestor( root.right, p, q );
    // conquer
    return left == null? right: right == null ? left:root;
}
```

---

##### 题目示例5 `leetcode 543 二叉树的直径`

```java
private int maxDiameter = 0;
public int diameterOfBinaryTree( TreeNode root )
{
    findMaxDiameter( root );
    return maxDiameter;
}

private int findMaxDiameter( TreeNode root )
{
    if( root == null )
        return 0;
    
    int left = findMaxDiameter( root.left );
    int right = findMaxDiameter( root.right );
  	maxDiameter = Math.max( maxDiameter, left + right );
    return Math.max( left, right ) + 1;
}
```

----

##### 题目示例6 `leetcode 226 翻转二叉树`

```java
private TreeNode invertTree( TreeNode root )
{
    if( root == null )
        return null;
    
    TreeNode left = root.left;
    root.left = invertTree( root.right );
    root.right = invertTree( left );
    return root;
}
```

----

##### 题目示例7 `leetcode 617 合并二叉树`

```java
public TreeNode mergeTrees( TreeNode t1, TreeNode t2 )
{
    if( t1 == null && t2 == null )
        return null;
    if( t1 == null )
        return t2;
    if( t2 == null )
        return t1;
    
    TreeNode node = new TreeNode( t1.val + t2.val );
    node.left = mergeTrees( t1.left, t2.left );
    node.right = mergeTrees( t1.right, t2.right );
    return node;
}
```

----

##### 题目示例8  `leetcode 112 路径总和`

```java
private boolean hasPathSum(TreeNode root, int sum)
{
    if(root == null)
        return false;
    if(root.left == null && root.right == null && root.val == sum)
        return true;
    
    int remain = sum - root.val;
    return hasPathSum(root.left, remain) || hasPathSum(root.right, remain);
}
```

----

##### 题目示例9 `leetcode 437 路径总和III`

```java
public int pathSum( TreeNode root, int sum )
{
    if( root == null )
        return 0;
    
    int res = pathSumStartsWithRoot( root, sum ) + pathSum( root.left, sum ) + pathSum( root.right, sum );
    return res;
}

private int pathSumStartsWithRoot( TreeNode root, int sum )
{
    if( root == null )
        return 0;
    
    int res = 0;
    if( root.val == sum )
        res++;
    res += pathSumStartsWithRoot( root.left, sum - root.val ) + pathSumStartsWithRoot( root.right, sum - root.val );
    return res;
}
```

----

##### 题目示例10 `leetcode 572 另一个树的子树`

```java
public boolean isSubtree( TreeNode s, TreeNode t )
{
    if( s == null )
        return false;
    return isSubTreeWithRoot( s, t ) || isSubtree( s.left, t ) || isSubtree( s.right, t );
}

private boolean isSubTreeWithRoot( TreeNode s, TreeNode t )
{
    if( s == null && t == null )
        return true;
    if( s == null || t == null )
        return false;
    if( s.val != t.val )
        return false;
    return isSubTreeWithRoot( s.left, t.left ) && isSubTreeWithRoot( s.right, t.right );
}
```

---

##### 题目示例11 `leetcode 101 对称二叉树`

```java
public boolean isSymmetric(TreeNode root)
{
    if(root == null)
        return true;
    return isSymmetric(root.left, root.right); 
}

private boolean isSymmetric(TreeNode t1, TreeNode t2)
{
    if(t1 == null && t2 == null)
        return true;
    if(t1 == null || t2 == null)
        return false;
    if(t1.val != t2.val)
        return false;
    return isSymmetric(t1.left, t2.right) && isSymmetric(t1.right, t2.left);
}
```

---

##### 题目示例12 `leetcode 111 二叉树的最小深度`

```java
private int minDepth( TreeNode root )
{
    if( root == null )
        return 0;
    int left = minDepth( root.left );
    int right = minDepth( root.right );
    if( left == 0 || right == 0 )
        return left + right + 1;
    return Math.min( left, right ) + 1;
}
```

----

##### 题目示例13 `leetcode 404 左叶子之和`

```java
public int sumOfLeftLeaves( TreeNode root )
{
    if( root == null )
        return 0;
    if( isLeaf(root.left) )
        return root.left.val + sumOfLeftLeaves( root.right );
    return sumOfLeftLeaves(root.left) + sumOfLeftLeaves（root.right);
}

private boolean isLeaf(TreeNode root)
{
    if(node == null)
        return false;
    return root.left == null && root.right == null;
}
```

----

##### 题目示例14 `leetcode 687 最长同值路径`

```java
private int res = 0;
public int longestUnivaluePath(TreeNode root)
{
    arrowLength(root);
    return res;
}

private int arrowLength(TreeNode root)
{
    if(root == null)
        return 0;
    int left = arrowLength(root.left);
    int right = arrowLength(root.right);
    int leftPath = root.left != null && root.left.val == root.val ? left + 1 : 0;
    int rightPath = root.right != null && root.right.val == root.val ? right + 1 : 0;
    res = Math.max(res, leftPath + rightPath);
    return Math.max(leftPath, rightPath);
}
```

----

##### 题目示例15 `leetcode 671 二叉树中第二小的节点`

```java
public int findSecondMinimumValue(TreeNode root) 
{
    ArrayList<Integer> reL = new ArrayList<Integer>();
    inOrderTraverse( root, reL );

    if( reL.size() < 2 )
        return -1;
    else
    {
        Collections.sort(reL);
        return reL.get( 1 );
    } 
}

private void inOrderTraverse( TreeNode root, ArrayList<Integer> list )
{
    if( root == null )
        return;
    inOrderTraverse( root.left, list );
    if( !list.contains( root.val ) )
        list.add( root.val );
    inOrderTraverse( root.right, list );
}
```

-----

##### 题目示例16 `leetcode 106 从中序遍历和后序遍历构造二叉树`

**重点：划分左右子树区间**

```java
private int[] postorder;
private Map<Integer, Integer> hashMap;
public TreeNode buildTree(int[] inorder, int[] postorder)
{
    if(inorder == null || postorder == null)
        return null;
    
    int inLen = inorder.length, postLen = postorder.length;
    if(inLen == 0  || postLen == 0 || inLen != postLen)
        return null;
    
    this.postorder = postorder;
    hashMap = new HashMap<>();
    for(int i = 0; i < inLen; i++)
        hashMap.put(inorder[i], i);
    return buildTree(0, inLen - 1, 0, postLen - 1);
}

/**
* 使用中序遍历序列和后序遍历序列构建二叉树
* @param inLeft		中序遍历序列的左边界
* @param inRight 	中序遍历序列的右边界	
* @param postLeft	后序遍历序列的左边界
* @param postRight	后序遍历序列的右边界
* @return 二叉树的根节点
*/
private TreeNode buildTree(int inLeft, int inRight, int postLeft, int postRight)
{
    if(inLeft > inRight || postLeft > postRight)
        return null;
    
    int rootVal = postorder[postRight];
    int rootIndex = hashMap.get(rootVal);
    TreeNode root = new TreeNode(rootVal);
    root.left = buildTree(inLeft, rootIndex - 1, postLeft, postRight - inRight + rootIndex - 1);
    root.right = buildTree(rootIndex + 1, inRight, postRight - inRight + rootIndex, postRight - 1);
    return root;
}
```

---

##### 题目示例17 `leetcode 105 从前序遍历和中序遍历序列构造二叉树`

**重点：划分左右子树区间**

```java
// 将前序遍历序列设置为全局变量，避免过多的传值
private int[] preorder;
// 存储中序遍历序列中元素和下标的映射（元素无重复）
private Map<Integer, Integer> hashMap;
public TreeNode buildTree(int[] preorder, int[] inorder) {
    // 1、边界条件特判
    if(inorder == null || preorder == null)
        return null;
    int inLen = inorder.length, preLen = preorder.length;
    if(inLen == 0  || preLen == 0 || inLen != preLen)
        return null;
    
    this.preorder = preorder;
    hashMap = new HashMap<>();
    for(int i = 0; i < inLen; i++){
        hashMap.put(inorder[i], i);
    }
    return buildTree(0, preLen - 1, 0, inLen - 1);
}

/**
* 使用前序遍历序列和中序遍历序列构建二叉树
* @param preLeft	前序遍历序列的左边界
* @param preRight	前序遍历序列的右边界
* @param inLeft		中序遍历序列的左边界
* @param inRight 	中序遍历序列的右边界	
* @return 二叉树的根节点
*/
private TreeNode buildTree(int preLeft, int preRight, int inLeft, int inRight) {
    if(inLeft > inRight || preLeft > preRight)
        return null;
    
    int rootVal = preorder[preLeft];
    int rootIndex = hashMap.get(rootVal);
    TreeNode root = new TreeNode(rootVal);
    // 边界的数学关系，如果忘了就在纸上演算一遍
    root.left = buildTree(preLeft + 1, rootIndex - inLeft + preLeft, inLeft, rootIndex - 1);
    root.right = buildTree(rootIndex - inLeft + preLeft + 1, preRight, rootIndex + 1, inRight);
    return root;
}
```

----

##### 题目示例18 `leetcode 116 填充每个节点的下一个右侧节点指针`

**建议在纸上跑一遍算法流程**

```java
private Node connect(Node root)
{
    if(root == null)
        return null;
    Node left = root.left;
    Node right = root.right;
    while(left != null)
    {
        left.next = right;
        left = left.right;
        right = right.left;
    }
    
    connect(root.left);
    connect(root.right);
    return root;
}
```

-----

##### 题目示例19 `leetcode 117 填充每个节点的下一个右侧节点指针 II`

```java
private Node connect(Node root)
{
    
}
```

------

##### 题目示例20： `leetcode 102 二叉树的层序遍历`

```java
private List<List<Integer>> levelOrder( TreeNode root )
{
    List<List<Integer>> res = new LinkedList<>();
    if( root == null )
        return res;
    
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer( root );
    while( !queue.isEmpty() )
    {
        List<Integer> runner = new LinkedList<>();
        int len = queue.size();
        while( len > 0 )
        {
            TreeNode node = queue.poll();
            runner.add( node.val );
            if( node.left != null )
                queue.offer( node.left );
            if( node.right != null )
                queue.offer( node.right );
            len--;
        }
        res.add( new LinkedList( runner ) );
    }
    return res;
}
```

------

##### 题目示例21 ：`leetcode 107 二叉树的层次遍历II`

```java
private List<List<Integer>> levelOrderBottom( TreeNode root )
{
    List<List<Integer>> res = new LinkedList<>();
    if( root == null )
        return res;
    
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer( root );
    while( !queue.isEmpty() )
    {
        List<Integer> runner = new LinkedList<>();
        int len = queue.size();
        while( len > 0 )
        {
            TreeNode node = queue.poll();
            runner.add( node.val );
            if( node.left != null )
                queue.offer( node.left );
            if( node.right != null )
                queue.offer( node.right );
            len--;
        }
        res.add( 0, new LinkedList( runner ) );
    }
    return res;
}
```

-------

##### 题目示例22：`leetcode 103 二叉树的锯齿形层次遍历`

```java
public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> res = new LinkedList<>();
    if(root == null) {
        return res;
    }

    boolean toggle = false;                         // 翻转标志
    Deque<TreeNode> queue = new LinkedList<>();     // 队列，辅助实现BFS
    queue.offer(root);  
    while(!queue.isEmpty()) {
        LinkedList<Integer> temp = new LinkedList<>();  // 存储当前层元素
        int levelSize = queue.size();                   // 当前层所拥有的元素数量
        while(levelSize > 0) {
            // 根据翻转标志，决定把元素放在列表头部还是尾部
            TreeNode node = queue.poll();
            if(!toggle) {
                temp.addLast(node.val);
            } else {
                temp.addFirst(node.val);
            }

            // 查看当前节点是否还有子节点
            if(node.left != null) {
                queue.offer(node.left);
            }
            if(node.right != null) {
                queue.offer(node.right);
            }
            levelSize--;
        }

        res.add(new LinkedList(temp));
        toggle = !toggle;
    }
    return res;
}
```

-----

##### 题目示例23 ：`leetcode 114 二叉树展开为链表`

参考题解：https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/solution/114-er-cha-shu-zhan-kai-wei-lian-biao-by-ming-zhi-/

```java
private void flatten(TreeNode root) {
    if(root == null) {
        return;
    }
    
    // 步骤一：将根节点的左子树展开为链表
    flatten(root.left);
    // 步骤二：将根节点的右子树展开为链表
    flatten(root.right);
    
    // 步骤三：将变成链表的左子树挂到根节点的右子树位置
    TreeNode temp = root.right;
    root.right = root.left;
    root.left = null;
    
    // 步骤四：将变成链表的右子树挂在变成链表的左子树的最右边
    while(root.right != null) {
        root = root.right;
    }
    root.right = temp;
}
```

-----

##### 题目示例24 `leetcode 222 完全二叉树的节点个数`

```java
/**
* 一定要注意理解完全二叉树的性质：若完全二叉树的层数为h，则总节点数为：2^h - 1.
*/
public int countNodes(TreeNode root) {
    if(root == null) {
        return 0;
    }

    int left = level(root.left);
    int right = level(root.right);
    if(left == right) {
        // left == right 代表左子树一定是满的
        return countNodes(root.right) + (1 << left);
    } else {
        // left != right表示右子树是满的
        return countNodes(root.left) + (1 << right);
    }
}

/**
* 计算完全二叉树的高度
*/
private int level(TreeNode root) {
    if(root == null) {
        return 0;
    }

    int h = 0;
    while(root != null) {
        h++;
        root = root.left;
    }
    return h;
}
```



------

#### 二叉搜索树

---

##### 题目示例1 `leetcode 98 验证二叉搜索树`

**思路1：中序遍历，检查结果列表是否有序**

```java
public boolean isValidBST(TreeNode root) {
    // 注意溢出
    double pre = -Double.MAX_VALUE;
    Deque<TreeNode> stack = new LinkedList<>();
    while(!stack.isEmpty() || root != null) {
        while(root != null) {
            stack.addLast(root);
            root = root.left;
        }

        TreeNode node = stack.removeLast();
        if(node.val <= pre) {
            return false;
        }
        root = node.right;
        pre = node.val;
    }
    return true;
}
```

**思路2：分治法，判断左MAX <  根  < 右MIN**

```java
public boolean isValidBST(TreeNode root) {
    return isValidBST(root, null, null);
}

private boolean isValidBST(TreeNode root, TreeNode min, TreeNode max) {
    if(root == null)
        return true;
    if(min != null && root.val <= min.val)
        return false;
    if(max != null && root.val >= max.val)
        return false;
    return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
}
```

------

#####  题目示例2 `leetcode  701  二叉搜索树中的插入操作`

```java
public TreeNode insertIntoBST(TreeNode root, int val) 
{
    if( root == null )
        return new TreeNode( val );
    else if( val < root.val )
        root.left = insertIntoBST( root.left, val );
    else if( val > root.val )
        root.right = insertIntoBST( root.right, val );
    else 
        root.val = val;
    return root;
}
```

------

##### 题目示例3 `leetcode 450 删除二叉搜索树 `

```java
/**
* 删除二叉搜索树一个结点x的完整步骤(当x有两个子结点时)：
* 1、将指向即将被删除的结点的链接保存为t
* 2、将x指向它的后继结点min(t.right);
* 3、将x的右链接（原本指向一棵所有结点都大于x.key的BST）指向deleteMin(t.right),
* 	 deleteMin(t.right)返回的仍然是一棵所有结点都大于x.key的BST
* 4、将x的左链接设为t.left
*/
public TreeNode deleteNode(TreeNode root, int key) {
    if(root == null) {
        return root;
    }

    if(root.val < key) {
        // key < root.val, 递归在左子树删除
        root.right = deleteNode(root.right, key);
    } else if(root.val > key) {
        // key > root.val, 递归在右子树删除
        root.left = deleteNode(root.left, key);
    } else {
        // key == root.val,删除当前结点，根据当前结点子结点数量
        // 进行相关操作
        if(root.left == null) {
            return root.right;
        } else if(root.right == null) {
            return root.left;
        }
        TreeNode t = root;
        root = min(t.right);
        root.right = deleteMin(t.right);
        root.left = t.left;
    }
    return root;
}

/**
* 找到二叉搜索树的最小结点
*/
private TreeNode min(TreeNode root) {
    if(root == null) {
        return null;
    }
    while(root.left != null) {
        root = root.left;
    }
    return root;
}

/**
* 删除二叉搜索树的最小结点
*/
private TreeNode deleteMin(TreeNode root) {
    if(root == null) {
        return root;
    }
    if(root.left == null) {
        return root.right;
    }
    root.left = deleteMin(root.left);
    return root;
}
```

------

##### 题目示例4 `leetcode 669 修剪二叉搜索树`

```java
private TreeNote trimBST( TreeNode root, int L, int R )
{
    if( root == null )		return null;
    if( root.val < L )		return trimBST( root.right, L, R );
    if( root.val > R )		return trimBST( root.left, L, R );
    root.left = trimBST( root.left, L, R );
    root.right = trimBST( root.right, L, R );
    return root;
}
```

---

##### 题目示例5 `leetcode 230 二叉搜索树中第K小的元素`

```java
public int kthSmallest( TreeNode root, int k )
{
    return select( root, k );
}

private int select( TreeNode root, int k )
{
    if( root == null )	return 0;
    int t = size( root.left );
    if( t >= k )					return select( root.left, k );
    else if( t < k - 1 )	 	 	 return select( root.right, k - t - 1 );
    else					 	    return root.val;
}
private int size( TreeNode root )
{
    if( root == null )
        return 0;
    
    return size( root.left ) + size( root.right ) + 1;
}
```

---

##### 题目示例6 `leetcode 538 把二叉搜索树转换为累加树`

```java
private int sum = 0;
public TreeNode convertBST(TreeNode root) 
{
    morrisTraversal(root);
    return root;
}

private void morrisTraversal(TreeNode root)
{
    if(root == null)
        return;
    morrisTraversal(root.right);
    sum += root.val;
    root.val = sum;
    morrisTraversal(root.left);
}
```

---

##### 题目示例7 `leetcode 235 二叉查找树的最近公共祖先`

```java
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
{
	if( root.val < p.val && root.val < q.val )
        return lowestCommonAncestor( root.right, p, q );
    else if( root.val > p.val && root.val > q.val )
        return lowestCommonAncestor( root.left, p, q );
    else 
    	return root;
}
```

---

##### 题目示例8 `leetcode 108 将有序数组转换为二叉搜索树`

```java
public TreeNode sortedArrayToBST(int[] nums) 
{
    return constructTreee( nums, 0, nums.length - 1 );
}

private TreeNode constructTreee( int[] nums, int start, int end )
{
    if( nums == null || nums.length == 0 )
        return null;

    int mid = start + ( end - start ) / 2;
    TreeNode root = new TreeNode( nums[mid] );
    if( mid - 1 >= start )
        root.left = constructTreee( nums, start, mid - 1 );
    if( mid + 1 <= end )
        root.right = constructTreee( nums, mid + 1, end );
    return root;
}
```

---

##### 题目示例9 `leetcode 109 有序链表转换二叉搜索树`

```java
public TreeNode sortedListToBST(ListNode head) 
{
    if(head == null)		
        return null;
    if(head.next == null)	
        return new TreeNode(head.val);
    ListNode preMid = preMid(head);
    ListNode mid = preMid.next;
    preMid.next = null;
    TreeNode root = new TreeNode(mid.val);
    root.left = sortedListToBST(head);
    root.right = sortedListToBST(mid.next);
    return root;
}

private ListNode preMid(ListNode head)
{
    ListNode slow = head;
    ListNode fast = head.next;
    ListNode pre = head;
    while(fast != null && fast.next != null)
    {
        pre = slow;
        slow = slow.next;
        fast = fast.next.next;
    }
	return pre;
}
```

---

##### 题目示例10 `leetcode 653两数之和IV 输入BST`

也有前缀和的思想

```java
public boolean findTarget( TreeNode root, int k )
{
    return find( root, new HashSet<Integer>(), k );
}

private boolean find( TreeNode root, Set<Integer> set, int k )
{
    if( root == null )
        return false;
    if( set.contains( k - root.val ) )
        return true;
    
    set.add( root.val );
    return find( root.left, set, k ) || find( root.right, set, k );
}
```

---

##### 题目示例 11 `leetcode 530 二叉搜索树的最小绝对差`

```java
int minDiff = Integer.MAX_VALUE;
TreeNode pre = null;
public int getMinimumDifference(TreeNode root) 
{
	traversal( root );
    return minDiff;
}

private void traversal( TreeNode root )
{
    if( root == null )
        return;
    traversal( root.left );
    if( pre != null )
        minDiff = Math.min( minDiff, root.val - pre.val );
    pre = root;
    traversal( root.right );
}
```

----

##### 题目示例12 `leetcode 333  最大BST子树`

```java
public int largestBSTSubtree(TreeNode root)
{
    if(root == null)
        return 0;
    if(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE))
        return countNodes(root);
    return Math.max(largestBSTSubtree(root.left), largestBSTSubtree(root.right));
}

/**
* 验证二叉树是否为BST
*/
private boolean isBST(TreeNode root, int min, int max)
{
    if(root == null)
        return true;
    
    if(root.val <= min || root.val >= max)
        return false;
    return isBST(root.left, min, root.val) && isBST(root.right, root.val, max);
}
/**
* 统计BST节点数量
*/
private int countNodes(TreeNode root)
{
    if(root == null)
        return 0;
    return countNodes(root.left) + countNodes(root.right) + 1;
}
```

-----

##### 题目示例13 `leetcode 776拆分二叉搜索树`

```java
private TreeNode[] splitBST(TreeNode root, int V)
{
    if(root == null)
        return new TreeNode[]{null, null};

    TreeNode[] res = new TreeNode[2];
    if(root.val <= V)
    {
        res = splitBST(root.right, V);
        root.right = res[0];
        res[0] = root;
        return res;
    }
    else if(root.val > V)
    {
        res = splitBST(root.left, V);
        root.left = res[1];
        res[1] = root;
        return res;
    }
    return res;
} 
```

------

##### 题目示例14 `leetcode 1214 查找两棵二叉搜索树之和`

```java
public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target)
{
    if(root1 == null)
        return false;
    return findNode(root2, target - root1.val) || twoSumBSTs(root1.left, root2, target) || 
        twoSumBSTs(root1.right, root2, target);
}

/**
* 在BST中找到有特定值的结点
*/
private boolean findNode(TreeNode root, int target)
{
    if(root == null)
        return false;

    if(root.val == target)
        return true;
    else if(root.val < target)
        return findNode(root.right, target);
    else
        return findNode(root.left, target);
}
```

----

##### 题目示例15 `leetcode 285 二叉搜索树中的顺序后继`

```java
private TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
    TreeNode res = null;
    while(root != null) {
        if(p.val < root.val) {
            res = root;
            root = root.left;
        } else {
            root = root.right;
        }
    }
    return res;
}
```

-----

##### 题目示例16 `leetcode 510 二叉搜索树中的中序后继`

```java
private Node inorderSuccessor(Node node)
{
    if(node.right != null)
    {
        node = node.right;
        while(node.left != null)
            node = node.left;
        return node;
    }
    else
    {
        while(node.parent != null && node.parent.val < node.val)
            node = node.parent;
        return node.parent;
    }
}
```

----

##### 题目示例17  `leetcode 426 将二叉搜索树转化为排序的双向链表`

参考题解：https://leetcode-cn.com/problems/er-cha-sou-suo-shu-yu-shuang-xiang-lian-biao-lcof/solution/mian-shi-ti-36-er-cha-sou-suo-shu-yu-shuang-xian-5/

```java
private Node curNode;
public Node treeToDoublyList(Node root) {
    Node dummyHead = new Node(-1, null, null);
    curNode = dummyHead;
    if(root != null) {
        inorderTraversal(root);
        // 将链表头尾结点相连，构成循环双向链表
        curNode.right = dummyHead.right;
        dummyHead.right.left = curNode;
    }
    return dummyHead.right;
}

private void inorderTraversal(Node root) {
    if(root != null) {
        inorderTraversal(root.left);
        // 调整指针指向，将遍历过的部分调整为双向链表
        curNode.right = root;
        root.left = curNode;
        curNode = root;
        inorderTraversal(root.right);
    }
}
```

-----

##### 题目示例18 `leetcode 99 恢复二叉搜索树`

```java
private void recoverTree(TreeNode root) {
    Deque<TreeNode> stack = new LinkedList<>();
    TreeNode firstNode = null, secondNode = null;
    TreeNode pre = new TreeNode(Integer.MIN_VALUE);
    TreeNode cur = root;
    
    while(cur != null || !stack.isEmpty()) {
        while(cur != null) {
            stack.addLast(cur);
            cur = cur.left;
        }
        cur = stack.removeLast();
        if(firstNode == null && pre.val > cur.val)
            firstNode = pre;
        if(firstNode != null && pre.val > cur.val)
            secondNode = cur;
        pre = cur;
        cur = cur.right;
    }
    int temp = firstNode.val;
    firstNode.val = secondNode.val;
    secondNode.val = temp;
}
```



----

-----

#### Tire树

##### 题目示例1 `leetcode 208 实现Tire(前缀树)`

```java
class TrieNode
{
    TrieNode[] child;	// 记录孩子结点
    boolean isLeaf;		// 记录当前节点是否是一个单词的结束字母
    public TrieNode()
    {
        this.child = new TrieNode[26];
        this.isLeaf = false;
    }
}

class Trie 
{
    /** 记录前缀树的根*/
    TrieNode root;
    
    /** Initialize your data structure here. */
    public Trie() 
    {
		this.root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) 
    {
		TrieNode node = root;							// 从根出发
        for( int i = 0; i < word.length(); i++ )
        {
            char c = word.charAt(i);					  // 对于每个字母
            if( node.child[c-'a'] == null )				  // c - 'a'为空，说明未存入		  
                node.child[c-'a'] = new TrieNode();		   // 存入新节点
            node = node.child[c-'a'];					  // 指针指向当前节点
        }
        node.isLeaf = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) 
    {
		TrieNode node = root;
        for( int i = 0; i < word.length(); i++ )
        {
            char c = word.charAt(i);
            if( node.child[c-'a'] == null )
                return false;
            node = node.child[c-'a'];
        }
        return node.isLeaf;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) 
    {
		TrieNode node = root;
    	for( int i = 0; i < prefix.length(); i++ )
        {
            char c = prefix.charAt(i);
            if( node.child[c-'a'] == null )
                return false;
            node = node.child[c-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
```

-----

### 链表

#### 基本技能

链表相关的核心点

1. null/nil异常处理

2. dummy node 哑巴节点

    dummy node就是在链表的head前加一个节点指向head，即 `dummyHead ->head`.可以理解成一个虚拟节点。有了dummy node就使得操作head节点与操作其他节点没有区别。特别适合用在链表的head可能发生变化的情况下，譬如删除或者被修改等

    一个最简单的dummy node使用框架如下：

    ```java
    ListNode dummyHead = new ListNode(0);
    dummyHead.next = head;
    ListNode cur = dummyHead;
    /**
    * lots of codes
    */
    return dummyHead.next;
    ```

3. 快慢指针

    对于寻找链表的某个特定位置，或者判断链表是否有环等问题时，可以使用两个指针变量 fast和slow,两个指针以不同的策略移动

-----

#### 常见题型

---

##### 基本操作类题目

###### 题目示例1`leetcode 203 移除链表元素`

```java
// 使用哑节点，所有节点被删除的流程都是一致的
private ListNode removeElements(ListNode head, int val) {
    ListNode dummyHead = new ListNode(-1);
    dummyHead.next = head;
    ListNode runner = dummyHead;
    while(runner.next != null) {
        if(runner.next.val == val)
            runner.next = runner.next.next;
        else
            runner = runner.next;
    }
    return dummyHead.next;
}
```

-------

###### 题目示例2 `leetcode 237 删除链表中的节点`

```java
private void deleteNode(ListNode node) {
    if(node == null) 
        return;
    node.val = node.next.val;
    node.next = node.next.next;
    return;
}
```

-----

###### 题目示例3 `leetcode 21 合并两个有序链表`

```java
private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(-1);
    ListNode runner = dummy;
    while(l1 != null && l2 != null) {
        if(l1.val < l2.val) {
            runner.next = l1;
            l1 = l1.next;
        } else {
            runner.next = l2;
            l2 = l2.next;
        }
        runner = runner.next;
    }
    
    if(l1 != null)
        runner.next = l1;
    if(l2 != null)
        runner.next = l2;
    return dummy.next;
}
```

------

###### 题目示例4 `leetcode 23 合并K个排序链表`

```java
private ListNode mergeKLists(ListNode[] lists) {
    if(lists == null || lists.length == 0)
        return null;

    PriorityQueue<ListNode> pq = new PriorityQueue<>((o1, o2)->(o1.val - o2.val));
    for(ListNode list:lists) {
        while(list != null) {
            ListNode temp = list;
            list = temp.next;
            temp.next = null;
            pq.offer(temp);
        }
    }

    ListNode dummyHead = new ListNode(-1);
    ListNode runner = dummyHead;
    while(!pq.isEmpty()) {
        runner.next = pq.poll();
        runner = runner.next;
    }
    return dummyHead.next;
}
```

-----

###### 题目示例5 `leetcode 86 分隔链表`

```java
private ListNode partition(ListNode head, int x) {
    if(head == null || head.next == null)
        return head;

    ListNode dummy1 = new ListNode(-1);
    ListNode dummy2 = new ListNode(-1);
    ListNode runner1 = dummy1, runner2 = dummy2;
    while(head != null) {
        if(head.val < x) {
            runner1.next = head;
            runner1 = runner1.next;
        } else {
            runner2.next = head;
            runner2 = runner2.next;
        }
        head = head.next; 
    }
    runner1.next = dummy2.next;
    runner2.next = null;
    return dummy1.next;
}
```

------

###### 题目示例6 `leetcode 24 两两交换链表中的节点`

```java
private ListNode swapPairs(ListNode head) {
    if(head == null || head.next == null) 
        return head;
    ListNode next = head.next;
    head.next = swapPairs(next.next);
    next.next = head;
    return next;
}
```

-----

###### 题目示例7 `leetcode 61 旋转链表`

双指针

注意其中的数学关系: k  = k % length

```java
private ListNode rotateRight(ListNode head, int k) {
    if(head == null || head.next == null) {
        return head;
    }

    int length = 0;
    ListNode runner = head;
    while(runner != null) {
        length++;
        runner = runner.next;
    }
    int gap = k % length;
    ListNode slow = head, fast = head;
    for(int i = 0; i < gap; i++) 
        fast = fast.next;
    while(fast.next != null) {
        slow = slow.next;
        fast = fast.next;
    }
    fast.next = head;
    head = slow.next;
    slow.next = null;
    return head;
}
```

----

###### 题目示例8 `leetcode 143 重排链表`

```java
// 1、将链表从中间断开
// 2、将后半部分反转
// 3、交叉将两个链表节点放入新链表中
public void reorderList( ListNode head )
{
    if( head == null )
        return;
    ListNode middle = findMiddle( head );
    ListNode tail = reverseList( middle.next );
    middle.next = null;
    head = mergeTwoLists( head, tail );
}

private ListNode findMiddle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head.next;
    while(fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}

private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(-1);
    ListNode head = dummy;
    boolean toggle = true;
    while(l1 != null && l2 != null) {
        if(toggle) {
            head.next = l1;
            l1 = l1.next;
        } else {
            head.next = l2;
            l2 = l2.next;
        }
        toggle = !toggle;
        head = head.next;
    }
    
    if(l1 != null)
        head.next = l1;
    if(l2 != null)
        head.next = l2;
    return dummy.next;
}

private ListNode reverseList(ListNode head) {
    ListNode pre = null;
    while(head != null) {
        ListNode next = head.next;
        head.next = pre;
        pre = head;
        head = next;
    }
    return pre;
}
```

-----

###### 题目示例9 `leetcode 147 对链表进行插入排序`

```java
private ListNode insertionSortList(ListNode head) {
    ListNode dummyHead = new ListNode(-1);
    ListNode pre = dummyHead;
    ListNode cur = head;

    while(cur != null) {
        ListNode next = cur.next;
        // 确定插入位置
        while(pre.next != null && pre.next.val < cur.val) {
            pre = pre.next;
        }
        // 插入新节点
        cur.next = pre.next;
        pre.next = cur;
        // 重置指针
        cur = next;
        pre = dummyHead;
    }
    return dummyHead.next;
}
```

-------

###### 题目示例10 `leetcode 148 排序链表`

```java
public ListNode sortList( ListNode head )
{
    return mergeSort( head );
}

private ListNode findMiddle( ListNode head )
{
    ListNode slow = head;
    ListNode fast = head.next;
    while( fast != null && fast.next != null )
    {
        fast = fast.next.next;
        slow = slow.next;
    }
    return slow;
}

private ListNode mergeTwoLists( ListNode l1, ListNode l2 )
{
    ListNode dummy = new ListNode( 0 );
    ListNode head = dummy;
    while( l1 != null && l2 != null )
    {
        if( l1.val < l2.val )
        {
            head.next = l1;
            l1 = l1.next;
        }
        else
        {
            head.next = l2;
            l2 = l2.next;
        }
        head = head.next;
    }
    
    if( l1 != null )
        head.next = l1;
    if( l2 != null )
        head.next = l2;
    return dummy.next;
}

private ListNode mergeSort( ListNode head )
{
    if( head == null || head.next == null )
        return head;
    
    // find middle
    ListNode middle = findMiddle( head );
    // 断开中间结点
    ListNode tail = middle.next;
    middle.next = null;
    
    ListNode left = mergeSort( head );
    ListNode right = mergeSort( tail );
    ListNode res = mergeTwoLists( left, right );
    return res;
}
```

----

###### 题目示例11 `leetcode 2 两数相加`

```java
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int carry = 0;
    ListNode dummyHead = new ListNode(0);
    ListNode runner = dummyHead;
    // 利用好while循环中的条件，避免了特判
    while(l1 != null || l2 != null || carry != 0) {
        int temp = carry;
        if(l1 != null) {
            temp += l1.val;
            l1 = l1.next;
        } 
        if(l2 != null) {
            temp += l2.val;
            l2 = l2.next;
        }

        int val = temp % 10;
        carry = temp / 10;
        runner.next = new ListNode(val);
        runner = runner.next;
    }
    return dummyHead.next;
}
```



-----

##### 反转类题目

###### 题目示例1 `leetcode 206 反转链表`

```java
private ListNode reverseList(ListNode head) {
    ListNode pre = null;
    ListNode cur = head;
    while(cur != null)
    {
        ListNode next = cur.next;
        cur.next = pre;
        pre = cur;
        cur = next;
    }
    return pre;
}
```

-----

###### 题目示例2 `leetcode 92 反转链表II`

```java
public ListNode reverseBetween(ListNode head, int m, int n) {
    ListNode pre = null, cur = head;
    for(int i = 1; i < m; i++) {
        pre = cur;
        cur = cur.next;
        n--;
    }
    ListNode tail = cur, con = pre;
    while(n > 0) {
        ListNode temp = cur.next;
        cur.next = pre;
        pre = cur;
        cur = temp;
        n--;
    }

    if(con != null)
        con.next = pre;
    else 
        head = pre;
    tail.next = cur;
    return head;
}
```

----

###### 题目示例3 `leetcode 25 K个一组翻转链表`

```java
public ListNode reverseKGroup(ListNode head, int k) {
    if(head == null || k <= 0) {
        return head;
    }

    ListNode a = head, b = head;
    for(int i = 0; i < k; i++) {
        if(b == null) {
            return a;
        }
        b = b.next;
    }

    ListNode newHead = reverseWithinRange(a, b);
    a.next = reverseKGroup(b, k);
    return newHead;
}

/**
* 翻转[a,b)间的链表
*/
private ListNode reverseWithinRange(ListNode a, ListNode b) {
    ListNode pre = null, cur = a;
    while(cur != b) {
        ListNode next = cur.next;
        cur.next = pre;
        pre = cur;
        cur = next;
    }
    return pre;
}
```

-----

##### 链表中的双指针问题

**链表中涉及的双指针问题一般为快慢指针问题**

###### 题目示例1  `leetcode 19 删除链表的倒数第N个节点`

```java
private ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummyHead = new ListNode(0);
    dummyHead.next = head;
    ListNode slow = dummyHead, fast = dummyHead;
    for(int i = 0; i <= n; i++) {
        fast = fast.next;
    }
    while(fast != null) {
        slow = slow.next;
        fast = fast.next;
    }
    slow.next = slow.next.next;
    return dummyHead.next;
}
```

-----

###### 题目示例 2 `leetcode 83 删除排序链表中的重复元素`

```java
private ListNode deleteDuplicates(ListNode head) {
    ListNode runner = head;
    while(runner != null && runner.next != null) {
        if(runner.next.val == runner.val) {
            runner.next = runner.next.next;
        } else {
            runner = runner.next;
        }
    }
    return head;
}
```

-----

###### 题目示例3  `leetcode 82 删除排序链表中的重复元素II`

```java
private ListNode deleteDuplicates(ListNode head) {
    if(head == null)
        return null;

    ListNode dummyHead = new ListNode(0);
    ListNode pre = dummyHead;

    ListNode cur = head;
    boolean isDuplicate = false;
    while(cur != null && cur.next != null) {
        if(cur.val == cur.next.val) {
            cur = cur.next;
            isDuplicate = true;
        } else {
            if(isDuplicate) {
                cur = cur.next;
                isDuplicate = false;
            } else {
                pre.next = new ListNode(cur.val);
                pre = pre.next;
                cur = cur.next;
            }
        }
    }
    // 处理链表最后一个节点
    if(!isDuplicate) {
        pre.next = new ListNode(cur.val);
        pre = pre.next;
    }
    return dummyHead.next;
}
```

----

###### 题目示例4 `leetcode 141 环形链表`

```java
private boolean hasCycle(ListNode head) {
    ListNode dummyHead = new ListNode(0);
    dummyHead.next = head;
    ListNode slow = dummyHead, fast = dummyHead;

    while(fast.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast)
            return true;
    }
    return false;
}
```

-----

###### 题目示例5  `leetcode 142 环形链表II`

```java
private ListNode detectCycle(ListNode head) {
    ListNode dummyHead = new ListNode(0);
    dummyHead.next = head;
    ListNode slow = dummyHead, fast = dummyHead;
    while(true) {
        if(fast.next == null || fast.next.next == null) {
            return null;
        }
        slow = slow.next;
        fast = fast.next.next;
        if(fast == slow)
            break;
    }
    slow = dummyHead;
    while(fast != slow) {
        slow = slow.next;
        fast = fast.next;
    }
    return slow;
}
```

-----

###### 题目示例6 `leetcode 234 回文链表`

```java
public boolean isPalindrome(ListNode head) {
    if(head == null || head.next == null)
        return true;
    
    /**
    * 将链表切分成两半，并将第二部分反转
    */
    ListNode preMid = getPreMiddle(head);
    ListNode secondHalf = preMid.next;
    preMid.next = null;
    secondHalf = reverse(secondHalf);

    /**
    * 比较两段链表元素
    */
    while(head != null && secondHalf != null) {
        if(head.val != secondHalf.val) {
            return false;
        }
        head = head.next;
        secondHalf = secondHalf.next;
    }
    return true;
}

/** 获取链表中点的前一个节点
* 链表个数为偶数，返回前半部分最后一个节点
* 链表个数为奇数，返回中点
*/
private ListNode getPreMiddle(ListNode head) {
    if(head == null) {
        return null;
    }

    ListNode slow = head, fast = head.next;
    while(fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}

/**
* 翻转链表
*/
private ListNode reverse(ListNode head) {
    if(head == null)
        return head;
    
    ListNode pre = null;
    while(head != null) {
        ListNode next = head.next;
        head.next = pre;
        pre = head;
        head = next;
    }
    return pre;
}
```

-----

###### 题目示例7 `leetcode 328 奇偶链表`

```java
private ListNode oddEvenList(ListNode head) {
    if(head == null)
        return null;
    
    ListNode oddRunner = head, evenRunner = head.next;
    ListNode evenHead = evenRunner;
    while(evenRunner != null && evenRunner.next != null) {
        oddRunner.next = evenRunner.next;
        oddRunner = oddRunner.next;
        evenRunner.next = oddRunner.next;
        evenRunner = evenRunner.next;
    }
    oddRunner.next = evenHead;
    return head;
}
```

------

##### 其他题目

---

###### 题目示例11 `leetcode 138 复制带随机指针的链表`

```java
private Node copyRandomList( Node head )
{
    if( head == null )
        return head;
    
    // 复制节点，紧挨在原节点之后
    Node cur = head;
    while( cur != null )
    {
        Node node = new Node( cur.val );
        node.next = cur.next;
        cur.next = node;
        cur = node.next;
    }
    
    // 处理random指针
    cur = head;
    while( cur != null )
    {
        if( cur.random != null )
            cur.next.random = cur.random.next;
        cur = cur.next.next;
    }
    
    // 分离两个链表
    cur = head;
    Node cloneHead = cur.next;
    while( cur != null && cur.next != null )
    {
        Node temp = cur.next;
        cur.next = cur.next.next;
        cur = temp;
    }
    return cloneHead;
}
```

---

###### 题目示例 12 `leetcode 876 链表的中间结点`

```java
private ListNode middleNode( ListNode head )
{
    if( head == null || head.next == null )
        return head;
    
    ListNode slow = head, fast = head;
    while( fast != null && fast.next != null )
    {
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}
```

-----

###### 题目示例15 `leetcode 1171 从链表中删去总和值为零的连续节点`

**前缀和思想的一个应用，其实可以把链表看成一个数组，相当于求和为K的子数组（这里K=0）**

**参考前缀和题目示例2**

```java
private ListNode removeZeroSumSublists(ListNode head) {
    ListNode dummyHead = new ListNode(0);
    dummyHead.next = head;
    
    HashMap<Integer, ListNode> preSum = new HashMap<>();
    
    // 首次遍历建立 （节点处链表和，节点）的哈希表
    // 若同一和出现多次会覆盖，则会记录该和出现的最后一次节点
    int sum = 0;
    for(ListNode node = dummyHead; node != null; node = node.next) {
        sum += node.val;
        preSum.put(sum, node);
    }
    
    // 第二遍遍历，设从首节点到当前节点的前缀和为sum,若其后某个节点
    // 前缀和也为sum,则将所有中间节点删除
    sum = 0;
    for(ListNode node = dummyHead; node != null; node = node.next) {
        sum += val;
        node.next = preSum.get(sum).next;
    }
    return dummyHead.next;
}
```

------

###### 题目示例16 `leetcode 708 循环有序链表的插入`

```java
// 参考题解
// 1、https://leetcode-cn.com/problems/insert-into-a-sorted-circular-linked-list/solution/xun-huan-you-xu-lie-biao-de-cha-ru-by-leetcode/

private Node insert(Node head, int insertVal) {
    if(head == null) {
        head = new Node(insertVal, null);
        head.next = head;
        return head;
    }
	
    Node pre = head, cur = head.next;
    boolean canInsert = false;
    do {
        if(pre.val <= insertVal && insertVal <= cur.val) {
            canInsert = true;
        } else if (pre.val > cur.val) {
            if(insertVal >= pre.val || insertVal <= cur.val) {
                canInsert = true;
            }
        }
        
        if(canInsert) {
            pre.next = new Node(insertVal, cur);
            return head;
        }
        
        pre = cur;
        cur = cur.next;
    } while(pre != head);
    
    pre.next = new Node(insertVal, cur);
    return head;
}
```

-----

###### 题目示例17 `leetcode 1474 删链表M个节点之后的N个节点`

```java
// 参考题解
// 1、https://leetcode-cn.com/problems/delete-n-nodes-after-m-nodes-of-a-linked-list/solution/c-dummy-head-jie-fa-by-huan-le-ma-140/
private ListNode deleteNodes(ListNode head, int m, int n) {
    ListNode dummyHead = new ListNode(0);
    dummyHead.next = head;
    ListNode cur = dummyHead;
    while(cur.next != null) {
        for(int i = 0; i < m; i++) {
            if(cur != null)
                cur = cur.next;
            else
                break;
        }
        
        if(cur == null)
            break;
        for(int i = 0; i < n; i++) {
            if(cur.next != null)
                cur.next = cur.next.next;
            else
                break;
        }
    }
    return dummyHead.next;
}
```

------

###### 题目示例18 `leetcode 369 给单链表加一`

```java
// 双指针
// dummyHead
private ListNode plusOne(ListNode head) {
    ListNode slow = new ListNode(0);
    ListNode fast =  head;
    slow.next = head;
    
    while(fast != null) {
        if(fast.val != 9)
            slow = fast;
        fast = fast.next;
    }
    
    slow.val += 1;
    ListNode runner = slow.next;
    while(runner != null) {
        runner.val = 0;
        runner = runner.next;
    }
    
    return slow.next == head? slow:head;
}
```



### 栈和队列

#### 栈

##### 题目示例1 `leetcode 155 最小栈`

```java
class MinStack 
{
    Stack<Integer> dataS;
    Stack<Integer> minS;
    /** initialize your data structure here. */
    public MinStack() 
    {
        dataS = new Stack<>();
        minS = new Stack<>();
    }
    
    public void push(int x) 
    {
        dataS.push( x );
        if( minS.size() == 0 )
            minS.push( x );
        else
        {
            int min = minS.peek() < x ? minS.peek():x;
            minS.push( min );
        }
    }
    
    public void pop() 
    {
        dataS.pop();
        minS.pop();
    }
    
    public int top() 
    {
        return dataS.peek();
    }
    
    public int getMin() 
    {
        return minS.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
```

--

##### 题目示例2 `leetcode 150 逆波兰表达式求值`

```java
private int evalRPN( String[] tokens )
{
    if( tokens == null || tokens.length == 0 )
        return 0;
    
    Stack<Integer> stack = new Stack<>();
    for( int i = 0; i < tokens.length; i++ )
    {
        switch( tokens[i] )
        {
            case "+", "-", "*", "/":
                {
                    if( stack.size() < 2 )
                        return 0;
                    
                    int b = stack.pop();
                    int a = stack.pop();
                    int res = 0;
                    switch( tokens[i] ) 
                    {
                        case "+":
                            res = a + b;
                            break;
                        case "-":
                            res = a - b;
                            break;
                        case "*":
                            res = a * b;
                            break;
                        case "/":
                            res = a / b;
                            break;
                    }
                    stack.push( res );
                    break;
                }
            default:
                {
                    int val = Integer.parseInt( tokens[i] );
                    stack.push( val );
                    break;
                }
        }
    }
    return stack.peek();
}
```

-----

##### 题目示例3 `leetcode 394 字符串解码`

```java
public String decodeString(String s) 
{
    StringBuilder res = new StringBuilder();
    int multi = 0;
    LinkedList<Integer> stack_multi = new LinkedList<>();
    LinkedList<String> stack_res = new LinkedList<>();
    for(Character c : s.toCharArray()) 
    {
        if(c == '[')
        {
            stack_multi.addLast(multi);
            stack_res.addLast(res.toString());
            multi = 0;
            res = new StringBuilder();
        }
        else if(c == ']') 
        {
            StringBuilder tmp = new StringBuilder();
            int cur_multi = stack_multi.removeLast();
            for(int i = 0; i < cur_multi; i++) tmp.append(res);
            res = new StringBuilder(stack_res.removeLast() + tmp);
        }
        else if(c >= '0' && c <= '9') multi = multi * 10 + Integer.parseInt(c + "");
        else res.append(c);
    }
    return res.toString();
}
```

----

##### 题目示例4 `leetcode 20 有效的括号`

```java
private boolean isValid(String s) {
    if(s == null || s.length() == 0) {
        return true;
    } else if(s.length() % 2 != 0) {
        return false;
    }
    
    Deque<Character> stack = new Lin
}
```



---

#### 栈和队列的特殊应用1：单调栈/单调队列

##### 概念

---

###### 单调栈：

**栈中存放的数据都是有序的，元素的分布从栈底到栈顶具有单调性，分为单调递增栈和单调递减栈两种**

1. **单调递增栈就是元素的值由栈底到栈顶大小单调递增**

    - **单调递增栈可以找到左起第一个比当前数字小的元素**
    - **如果栈是一个单调递增栈，对于一个刚刚出栈的元素而言，新的栈顶元素就是其左侧第一个小于自己的元素，即将入栈的元素就是右侧第一个小于自己的元素；如果元素出栈后栈为空表示自己左侧没有更小的元素，如果没有新元素将要入栈，表示自己右侧没有更小的元素。**

2. **单调递减栈就是元素的值由栈底到栈顶大小单调递减**
    - **单调递减栈可以找到左起第一个比当前数字大的元素**
    - **如果栈是一个单调递减栈，对于一个刚刚出栈的元素而言，新的栈顶元素就是其左侧第一个大于自己的元素，即将入栈的元素就是右侧第一个大于自己的元素；如果元素出栈后栈为空表示自己左侧没有更大的元素，如果没有新元素将要入栈，表示自己右侧没有更大的元素。**

**单调栈里可以保存元素的值或者数组下标**

**单调栈维护的时间复杂度O(n),任何元素只会进出单调栈一次**

**构建栈的过程从数组的右侧开始时，可以找到当前元素右侧第一个更大或者更小的元素**

###### 单调队列：

**某些场景下栈底也需要维护，此时可能需要借助队列或双端队列实现，此时称为单调队列**

**根据题目大小变化元素的遍历顺序和不等号的方向即可**

```java
// 一个简单的单调栈模板
Deque<Integer> stack = new LinkedList<>();
for(int i = 0; i < nums.length; i++) {
    while(!stack.isEmpty() && nums[i] <= nums[stack.peekLast()]) // 单调递增栈
        // 单调递减栈 nums[i] >= nums[stack.peekLast()]
        stack.removeLast();
    stack.addLast(i);
}
```

---

##### 典型题目

###### 题目示例 1 `leetcode 496 下一个更大元素I`

**寻找比当前元素更大的下一个元素**

```java
// v1，从右往左构建一个单调递减栈
private int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int[] res = new int[nums1.length];
    int[] temp = new int[nums2.length];
    Deque<Integer> stack = new LinkedList<>();
    for(int i = nums2.length - 1; i >= 0; i--) {
        while(!stack.isEmpty() && nums2[i] >= stack.peekLast()) {
            stack.removeLast();
        }
        temp[i] = stack.isEmpty()? -1:stack.peekLast();
        stack.addLast( nums2[i] );
    }

    for(int i = 0; i < nums1.length; i++) {
        for(int j = 0; j < nums2.length; j++) {
            if(nums2[j] == nums1[i])
                res[i] = temp[j];      
        }
    }
    return res;
}


// v2，从左往右构建一个单调递减栈
private int[] nextGreaterElement( int[] nums1, int[] nums2 )
{
    Deque<Integer> stack = new LinkedList<>();
    HashMap<Integer, Integer> hashmap = new HashMap<>();
    int[] res = new int[nums1.length];
    for( int i = 0; i < nums2.length; i++ )
    {
        while( !stack.isEmpty() && nums2[i] > stack.peekLast() )
            hashmap.put( stack.removeLast(), nums2[i] );
        stack.addLast( nums2[i] );
    }
    while( !stack.isEmpty() )
        hashmap.put( stack.removeLast(), - 1 );
    for( int i = 0; i < nums1.length; i++ )
        res[i] = hashmap.get( nums1[i] );
    return res;
}
```

---

###### 题目示例2 `leetcode 503 下一个更大元素II`

```java
// 从右往左构建一个单调递减栈
private int[] nextGreaterElements(int[] nums) {
    int n = nums.length;
    Deque<Integer> stack = new LinkedList<>();
    int[] res = new int[n];
    for(int i = 2 * n - 1; i >= 0; i--) {
        while(!stack.isEmpty() && nums[i%n] >= s.peekLast())
            stack.removeLast();
        res[i%n] = stack.isEmpty()? -1:stack.peekLast();
        stack.addLast(nums[i%n]);
    }
    return res;
}
```

---

###### 题目示例3 `leetcode 739 每日温度`

```java
// 从右往左构建一个单调递减栈
private int[] dailyTemperatures(int[] T) {
    int[] res = new int[T.length];
    Deque<Integer> stack = new LinkedList<>();
    for( int i = T.length - 1; i >= 0; i--) {
        while(!stack.isEmpty() && T[i] >= T[stack.peekLast()])
            stack.removeLast();
        res[i] = stack.isEmpty() ? 0:stack.peekLast() - i;
        stack.addLast(i);
    }
    return res;
}
```

---

###### 题目示例 4`leetcode 962 最大宽度坡`

```java
// 从左往右构建一个单调递减栈,这个单调递减栈是一个全局性的单调递减栈
// 其最终存储的结果是从数组整体来看的一个全局性的递减序列
private int maxWidthRamp(int[] A) {
    Deque<Integer> stack = new LinkedList<>();
    stack.addLast(0);
    // 构建单调栈的过程不做其他操作，因为要获得全局的一个单调结果
    for(int i = 0; i < A.length; i++)
        if(A[i] <= A[stack.peekLast()])
            stack.addLast(i);
    // 贪心策略，从最远的地方开始往回找
    int maxGap = 0;
    for(int i = A.length - 1; i >= 0; i--)
        while(!stack.isEmpty() && A[i] >= A[stack.peekLast()])
            maxGap = Math.max(maxGap, i - stack.removeLast());
    return maxGap;
}
```

---

###### 题目示例5 `leetcode 42 接雨水`

```java
public int trap(int[] height) {
    if(height == null || height.length < 3)
        return 0;

    int res = 0;
    Deque<Integer> stack = new LinkedList<>();
    for(int i = 0; i < height.length; i++) {
        // 构建一个单调递减栈
        while(!stack.isEmpty() && height[stack.peekLast()] < height[i]) {
            int bottomIndex  = stack.removeLast();
            // 栈顶元素与bottom相等时应该pop出栈，因为无法形成蓄水的凹槽
            while(!stack.isEmpty() && height[stack.peekLast()] == height[bottomIndex]) {
                stack.removeLast();
            }

            if(!stack.isEmpty()) {
                // leftEdge指向蓄水凹槽的左侧边界
                // 蓄水凹槽的右边界即为i
                int leftEdge = stack.peekLast();
                res += (Math.min(height[leftEdge], height[i]) - height[bottomIndex]) * (i - leftEdge - 1);
            }
        }
        stack.addLast(i);
    }
    return res;
}
```

---

###### 题目示例 6 `leetcode 84 柱状图中最大的矩形`

**以当前遍历到的柱子`i`的高度height作为矩形的高，矩形的宽度边界为向左找到第一个高度小于当前柱体 `i`的柱体 `left_i`，向右找到第一个高度小于当前柱体  `i`的柱体  `right_i` ,矩形面积可以表示为  `height * ( right_i - left_i  - 1 )`**

**从左到右构建一个单调递增的栈，对于一个栈顶元素而言，下一个可以入栈的元素就是它右边第一个小于它的元素，在栈中栈顶元素的下一个元素就是它左边第一个小于它的元素**

```java
private int largestRectangleArea(int[] heights) {
    if(heights == null || heights.length == 0)
        return 0;
    
    // 在原数组后面加上一个0，原数组最后一个元素也有了右侧更小的元素
    int[] temp = new int[heights.length+2];
    System.arraycopy(heights, 0, temp, 1, heights.length);
    
    Deque<Integer> stack = new LinkedList<>();
    int maxArea = 0;
    for(int i = 0; i < temp.length; i++) {
        // 构建单调递增栈
        while(!stack.isEmpty() && temp[i] < temp[stack.peekLast()]) {
            int height = temp[stack.removeLast()];
            maxArea = Math.max(maxArea, height * (i - stack.peekLast() - 1));
        }
        stack.addLast(i);
    }
    return maxArea;
}
```

----

###### 题目示例7 `leetcode 239 滑动窗口最大值`

```java
private int[] maxSlidingWindow(int[] nums, int k) {
    if(nums == null || k < 1 || nums.length < k)
        return new int[0];
    
    LinkedList<Integer> window = new LinkedList<>();
    int[] res = new int[nums.length - k + 1];
    int index = 0;
    for(int i = 0; i < nums.length; i++) {
        // 构建一个单调递减栈，栈底元素是窗口范围内的最大元素
        while(!window.isEmpty() && nums[i] >= nums[window.peekLast()])
            window.pollLast();
        window.addLast(i);
        if(window.peek() <= i - k)
            window.poll();
        if(i >= k - 1)
            res[index++] = nums[window.peekFirst()];
    }
    return res;
}
```

----

###### 题目示例8 `leetcode 85 最大矩形 `

```java
public int maximalRectangle(char[][] matrix) {
    if(matrix == null || matrix.length == 0)
        return 0;

    int[] heights = new int[matrix[0].length];
    int maxArea = 0;
    for(int i = 0; i < matrix.length; i++) {
        for(int j = 0; j < matrix[0].length; j++) {
            if(matrix[i][j] == '1') 
                heights[j] += 1;
            else
                heights[j] = 0;
        }
        maxArea = Math.max(maxArea, largestRectangleArea(heights));
    }
    return maxArea;
}

// 使用函数
private int largestRectangleArea(int[] heights) {
    if(heights == null || heights.length == 0)
        return 0;

    int[] temp = new int[heights.length + 2];
    System.arraycopy(heights, 0, temp, 1, heights.length);
    Deque<Integer> stack = new LinkedList<>();
    int maxArea = 0;

    for(int i = 0; i < temp.length; i++) {
        while(!stack.isEmpty() && temp[i] < temp[stack.peekLast()]) {
            int height = temp[stack.removeLast()];
            maxArea = Math.max(maxArea, height * (i - stack.peekLast() - 1));
        }
        stack.add(i);
    }
    return maxArea;
}
```

----

###### 题目示例9 `leetcode 402 移掉K位数字`

```java
// 删除数字的原则：给定一个数字序列[D1, D2, ..Dn].如果数字D2小于其做邻居D1，应该删除其
// 左邻居D1
private String removeKdigits(String num, int K) {
    StringBuffer s = new StringBuffer();
    int n = num.length(), m = n - k;
    for(char c:num.toCharArray()) {
        // 构建一个“单调递增栈”
        while(k > 0 && s.length() > 0 && s.charAt( s.length() - 1 ) > c) {
            s.deleteCharAt(s.length() - 1);
            k--;
        }
        s.append(c);
    }
    
    s.delete(m, s.length());
    while(s.length() > 0 && s.charAt(0) == '0')
        s.deleteCharAt(0);
    return s.length() == 0? "0":s.toString();
}
```

---

###### 题目示例10 `leetcode 768 最多能完成排序的块II`

```java
private int maxChunksToSorted(int[] arr){
    Deque<Integer> stack = new LinkedList<>();
    for(int num:arr) {
        if(!stack.isEmpty() && num < stack.peekLast()) {
            int head = stack.removeLast();
            while(!stack.isEmpty() && num < stack.peekLast())
                stack.removeLast();
            stack.addLast(head);
        } else {
            stack.addLast(num);
        }
    }
    return stack.size();
}
```

---

###### 题目示例11 `leetcode 901 股票价格跨度`

```java
class StockSpanner {
	/*当前元素的序号，代表是第几个元素*/
    private int index;
    /*存储所有元素的列表*/
    private List<Integer> stock;
    /*单调栈，存储满足单调栈关系的元素的序号*/
    private Deque<Integer> stack;
    
    public StockSpanner() {
        this.index = 0;
     	this.stock = new ArrayList<>(32);
        this.stack = new LinkedList<>();
        
        /*放入哨兵，永远不会被弹出*/
        stock.add(Integer.MAX_VALUE);
        stack.addLast(0);
    }
    
    public int next(int price) {
        /*当前放进来的元素的序号*/
        index++;
        /*构建单调递减栈*/
        while(!stack.isEmpty() && stock.get(stack.peekLast()) <= price) {
            stack.removeLast();
        }
        
        int res = index - stack.peekLast();
        stock.add(price);
        stack.addLast(index);
        return res;
    }
}
```



------

###### 题目示例12 `leetcode 1019 链表的下一个更大结点`

---

###### 题目示例13 `leetcode 1124 表现良好的最长时间段`

```java
private int longestWPI(int[] hours) {
    // 计算前缀和
    int[] preSum = new int[hours.length+1];
    for(int i = 0; i < hours.length; i++) {
        if(hours[i] > 8)	
            preSum[i+1] = preSum[i] + 1;
        else			   	
            preSum[i+1] = preSum[i] - 1;
    }
    
    // 构建单调递减栈
    Deque<Integer> stack = new LinkedList<>();
    stack.addLast(0);
    for(int i = 1; i < preSum.length; i++)
        if(preSum[i] < preSum[stack.peekLast()])
            stack.addLast(i);
    
    // 从右向左利用贪心策略求最大跨度
    int maxL = 0;
    for(int i = preSum.length - 1; i >= 0; i--)
    	while(!stack.isEmpty() && preSum[i] > preSum[stack.peekLast()])
            maxL = Math.max(maxL, i - stack.removeLast());
    return maxL;
}
```

-----

###### 题目示例14 `leetcode 316 去除重复字母`

```java
private String removeDuplicateLetters(String s) {
    if(s == null || s.length() < 2) 
        return s;
    
    int len = s.length();
    // 记录字符是否在使用
    boolean[] charSet = new boolean[26];
    // 记录每一个字符最后一次出现的位置
    int[] lastAppearIndex = new int[26];
    for(int i = 0; i < len; i++) {
        lastAppearIndex[s.charAt(i) - 'a'] = i;
    }
    
    Deque<Character> stack = new LinkedList<>();
    for(int i = 0; i < len; i++) {
        // 如果当前字符已经在栈里出现过，跳过
        char curChar = s.charAt(i);
        if(charSet[curChar - 'a']) {
            continue;
        }
        
        // 构建单调递增栈，当前元素比栈顶元素严格小时，当且仅当栈顶元素在之后
        // 还出现时才舍弃栈顶元素
        while(!stack.isEmpty() && stack.peekLast() > curChar
             && lastAppearIndex[stack.peekLast() - 'a'] >= i) {
            charSet[stack.removeLast() - 'a'] = false;
        }
        stack.addLast(curChar);
        charSet[curChar - 'a'] = true;
    }
    
    StringBuffer res = new StringBuffer();
    while(!stack.isEmpty()) {
        res.insert(0, stack.removeLast());
    }
    return res.toString();
}
```

-----

###### 题目示例15 `leetcode 132模式`

```java
// 有点巧妙，好好理解
public boolean find132pattern(int[] nums) {
    if(nums == null || nums.length < 3)
        return false;

    Deque<Integer> stack = new LinkedList<>();
    int third = Integer.MIN_VALUE;
    for(int i = nums.length - 1; i >= 0; i--) {
        if(nums[i] < third) 
            return true;
        while(!stack.isEmpty() && nums[i] > nums[stack.peekLast()]) {
            third = nums[stack.removeLast()];
        }
        stack.addLast(i);
    }
    return false;
}
```

------

### 并查集

参考：https://www.yuque.com/liweiwei1419/algo/ltd86x

#### 概念

##### 1、基础并查集代码

```java
class UnionFind {
    // 连通分量个数
    private int count;
    // 存储触点的父节点引用
    private int[] parent;
    // 记录根节点所代表的树的最大高度
    private int[] rank;
    
    public UnionFind(int n) {
        this.count = n;
       	this.parent = new int[n];
        this.rank = new int[n];
        for(int i = 0; i < n; i++) {
            parent[i] = i;	// 初始时所有节点的父节点引用都指向自己
            rank[i] = 1;	// 初始时每棵树都只有一个根节点，树高为1
        }
    }
    
    // 返回连通分量的个数
    public int count() {
        return this.count;
    }
    
    // 找到指定触点的根节点
    public int find(int k) {
        while(parent[k] != k) {
            parent[k] = parent[parent[k]];
            k = parent[k];
        }
        return k;
    }
    
    // 检查两个触点代表的连通分量的连通性
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }
    
    // 合并两个连通分量
    public boolean union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        
        // 如果已经同属一个集合，不需要再合并
        if(pRoot == qRoot) 
            return false;
        
        // 将“较小”的树放到较大的树下，保证合并后的分量树具有一定平衡性
        if(pRoot < qRoot) {
            parent[pRoot] = qRoot;
        } else if(pRoot > qRoot) {
            parent[qRoot] = pRoot;
        } else {
            parent[pRoot] = qRoot;
            rank[qRoot]++;
        }
        
        // 两个分量合并后总的分量个数减一
        this.count--;
        return true;
    }
}
```

-----

------

#### 典型题目

##### 基础题目

###### 题目示例1 `leetcode 547 朋友圈`

```java
// 求二维数组不相交集合的个数
public int findCircleNum(int[][] M) {
    int len = M.length;
    UnionFind uf = new UnionFind(len);
    for(int i = 0; i < len; i++) {
        for(int j = 0; j < i; j++) {
            // 由于无向连通图的对称性，只需要检查右上半部分矩阵
            if(M[i][j] == 1) {
                uf.union(i, j);
            }
        }
    }
    return nf.count();
}

class UnionFind {
    // 连通分量个数
    private int count;
    // 存储触点的父节点
    private int[] parent;
    // 记录根节点所代表的树的最大高度
    private int[] rank;

    public UnionFind(int n) {
        this.count = n;
        parent = new int[n];
        rank = new int[n];
        for(int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
    }

    // 返回连通分量个数
    public int count() {
        return this.count;
    }

    // 找到所给触点的根节点
    public int find(int k) {
        while(parent[k] != k) {
            // 路径压缩
            parent[k] = parent[parent[k]];
            k = parent[k];
        }
        return k;
    }

    // 检查所给两个分量的连通性
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    // 合并两个分量
    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if(rootP == rootQ)
            return;

        // 将“较小”的树放到较大的树下，保证合并后的分量树具有一定平衡性
        if(rank[rootP] > rank[rootQ]) {
            parent[rootQ] = rootP;
        } else if(rank[rootP] < rank[rootQ]) {
            parent[rootP] = rootQ;
        } else {
            parent[rootP] = rootQ;
            rank[rootQ] ++;
        }
        this.count--;
    }
}
```

-----

###### 题目示例2 `leetcode 323 无向图中连通分量的个数`

```java
// 典型题目，合并所有给出的分量，返回count
public int countComponents(int n, int[][] edges) {
    UnionFind uf = new UnionFind(n);
    for(int[] edge:edges) {
        uf.union(edge[0], edge[1]);
    }
    return uf.count();
}


class UnionFind {
    // 连通分量个数
    private int count;
    // 存储触点的父节点
    private int[] parent;
    // 记录根节点所代表的树的最大高度
    private int[] rank;

    public UnionFind(int n) {
        this.count = n;
        parent = new int[n];
        rank = new int[n];
        for(int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
    }

    // 返回连通分量个数
    public int count() {
        return this.count;
    }

    // 找到所给触点的根节点
    public int find(int k) {
        while(parent[k] != k) {
            // 路径压缩
            parent[k] = parent[parent[k]];
            k = parent[k];
        }
        return k;
    }

    // 检查所给两个分量的连通性
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    // 合并两个分量
    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if(rootP == rootQ)
            return;

        // 将“较小”的树放到较大的树下，保证合并后的分量树具有一定平衡性
        if(rank[rootP] > rank[rootQ]) {
            parent[rootQ] = rootP;
        } else if(rank[rootP] < rank[rootQ]) {
            parent[rootP] = rootQ;
        } else {
            parent[rootP] = rootQ;
            rank[rootQ] ++;
        }
        this.count--;
    }
}
```

-----

###### 题目示例3 `leetcode 261 以图判树`

```java
// 有效的树结构: 无环、根节点唯一
public boolean validTree(int n, int[][] edges) {
    UnionFind uf = new UnionFind(n);
    for(int[] edge:edges) {
        if(!uf.union(edge[0], edge[1])) {
            return false;
        }
    }
    return uf.count() == 1;
}


class UnionFind {
    // 连通分量个数
    private int count;
    // 存储触点的父节点
    private int[] parent;
    // 记录根节点所代表的树的最大高度
    private int[] rank;

    public UnionFind(int n) {
        this.count = n;
        parent = new int[n];
        rank = new int[n];
        for(int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
    }

    // 返回连通分量个数
    public int count() {
        return this.count;
    }

    // 找到所给触点的根节点
    public int find(int k) {
        while(parent[k] != k) {
            // 路径压缩
            parent[k] = parent[parent[k]];
            k = parent[k];
        }
        return k;
    }

    // 检查所给两个分量的连通性
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    // 合并两个分量
    public boolean union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        
        // 如果两个触点的根节点已经属于同一个分量
        // 再合并就会出现环（无向图）
        // 所以直接返回false
        if(rootP == rootQ)
            return false;

        // 将“较小”的树放到较大的树下，保证合并后的分量树具有一定平衡性
        if(rank[rootP] > rank[rootQ]) {
            parent[rootQ] = rootP;
        } else if(rank[rootP] < rank[rootQ]) {
            parent[rootP] = rootQ;
        } else {
            parent[rootP] = rootQ;
            rank[rootQ] ++;
        }
        this.count--;
        return true;
    }
}
```

------

###### 题目示例4 `leetcode 1319 连通网络的操作次数`

```java
public int makeConnected(int n, int[][] connections) {
    UnionFind uf = new UnionFind(n);
    int extraLines = 0;
    for(int[] connection:connections) {
        // 每一次可能成环的操作，代表一条多余的线
        if(!uf.union(connection[0], connection[1])) {
            extraLines++;
        }
    }
    // 多余的线必须能够至少把不相交集合连成一棵树
    int disJointSets = uf.count();
    return extraLines < disJointSets - 1? -1:(disJointSets - 1);
}

class UnionFind {
    // 连通分量个数
    private int count;
    // 存储触点的父节点
    private int[] parent;
    // 记录根节点所代表的树的最大高度
    private int[] rank;

    public UnionFind(int n) {
        this.count = n;
        parent = new int[n];
        rank = new int[n];
        for(int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
    }

    // 返回连通分量个数
    public int count() {
        return this.count;
    }

    // 找到所给触点的根节点
    public int find(int k) {
        while(parent[k] != k) {
            // 路径压缩
            parent[k] = parent[parent[k]];
            k = parent[k];
        }
        return k;
    }

    // 检查所给两个分量的连通性
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    // 合并两个分量
    public boolean union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if(rootP == rootQ)
            return false;

        // 将“较小”的树放到较大的树下，保证合并后的分量树具有一定平衡性
        if(rank[rootP] > rank[rootQ]) {
            parent[rootQ] = rootP;
        } else if(rank[rootP] < rank[rootQ]) {
            parent[rootP] = rootQ;
        } else {
            parent[rootP] = rootQ;
            rank[rootQ] ++;
        }
        this.count--;
        return true;
    }
}
```

-----

###### 题目示例5 `leetcode 684 冗余连接`

```java
// nothing special
public int[] findRedundantConnection(int[][] edges) {
    UnionFind uf = new UnionFind(1001);
    for(int[] edge:edges) {
        if(!uf.union(edge[0], edge[1])) {
            return edge;
        }
    }
    return new int[0];
}

class UnionFind {
    // 连通分量个数
    private int count;
    // 存储触点的父节点
    private int[] parent;
    // 记录根节点所代表的树的最大高度
    private int[] rank;

    public UnionFind(int n) {
        this.count = n;
        parent = new int[n];
        rank = new int[n];
        for(int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
    }

    // 返回连通分量个数
    public int count() {
        return this.count;
    }

    // 找到所给触点的根节点
    public int find(int k) {
        while(parent[k] != k) {
            // 路径压缩
            parent[k] = parent[parent[k]];
            k = parent[k];
        }
        return k;
    }

    // 检查所给两个分量的连通性
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    // 合并两个分量
    public boolean union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if(rootP == rootQ)
            return false;

        // 将“较小”的树放到较大的树下，保证合并后的分量树具有一定平衡性
        if(rank[rootP] > rank[rootQ]) {
            parent[rootQ] = rootP;
        } else if(rank[rootP] < rank[rootQ]) {
            parent[rootP] = rootQ;
        } else {
            parent[rootP] = rootQ;
            rank[rootQ] ++;
        }
        this.count--;
        return true;
    }
}
```

------

###### 题目示例6 `leetcode 990 等式方程的可满足性`

```java
public boolean equationsPossible(String[] equations) {
    // 当且仅当不等号两侧的变量在合并过程中被合并到同一个集合中时
    // 等式方程不可满足
    UnionFind uf = new UnionFind(26);
    for(String equation:equations) {
        char[] eq = equation.toCharArray();
        if(eq[1] == '=') {
            int i = eq[0] - 'a';
            int j = eq[3] - 'a';
            uf.union(i, j);
        }
    }

    for(String equation:equations) {
        char[] eq = equation.toCharArray();
        if(eq[1] == '!') {
            int i = eq[0] - 'a';
            int j = eq[3] - 'a';
            if(uf.connected(i, j))
                return false;
        }
    }
    return true;
}


class UnionFind {
    // 连通分量个数
    private int count;
    // 存储触点的父节点
    private int[] parent;
    // 记录根节点所代表的树的最大高度
    private int[] rank;

    public UnionFind(int n) {
        this.count = n;
        parent = new int[n];
        rank = new int[n];
        for(int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
    }

    // 返回连通分量个数
    public int count() {
        return this.count;
    }

    // 找到所给触点的根节点
    public int find(int k) {
        while(parent[k] != k) {
            // 路径压缩
            parent[k] = parent[parent[k]];
            k = parent[k];
        }
        return k;
    }

    // 检查所给两个分量的连通性
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    // 合并两个分量
    public boolean union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if(rootP == rootQ)
            return false;

        // 将“较小”的树放到较大的树下，保证合并后的分量树具有一定平衡性
        if(rank[rootP] > rank[rootQ]) {
            parent[rootQ] = rootP;
        } else if(rank[rootP] < rank[rootQ]) {
            parent[rootP] = rootQ;
        } else {
            parent[rootP] = rootQ;
            rank[rootQ] ++;
        }
        this.count--;
        return true;
    }
}
```

------

##### 带权值的并查集问题

###### 题目示例1 `leetcode 128 最长连续序列`

```java
// 不得不说这种方法太骚了
public int longestConsecutive(int[] nums) {
    int len = nums.length;
    if(len < 2)
        return len;
    
    UnionFind uf = new UnionFind(nums);
    int res = 1;	// 每个数组都是一个长度为1的序列
    for(int i = 0; i < len; i++) {
        int num = nums[i];
        if(uf.contains(num - 1)) {
            res = Math.max(res, uf.union(num, num - 1));
        }
        if(uf.contains(num + 1)) {
            res = Math.max(res, uf.union(num, num + 1));
        }
    }
    return res;
}



class UnionFind {
    private Map<Integer, Integer> parent;
    // 维护以当前结点为根的子树的结点总数
    private Map<Integer, Integer> size;
    
    public UnionFind(int[] nums) {
        int len = nums.length;
        this.parent = new HashMap<>(len);
        this.size = new HashMap<>(len);
        for(int i = 0; i < len; i++) {
            parent.put(nums[i], nums[i]);
            size.put(nums[i], 1);
        }
    }
    
    // union方法返回合并后的连通分量的结点个数
    public int union(int i, int j) {
        int rootI = find(i);
        int rootJ = find(j);
        
        if(rootI == rootJ) {
            return 0;
        }
        
        int sizeI = this.size.get(rootI);
        int sizeJ = this.size.get(rootJ);
        int sum = sizeI + sizeJ;
        if(sizeI < sizeJ) {
            parent.put(rootI, rootJ);
            size.put(rootJ, sum);
        } else {
            parent.put(rootJ, rootI);
            size.put(rootI, sum);
        }
        return sum;
    }
    
    // 路径压缩版本的find方法
    public int find(int i) {
        while(i != parent.get(i)) {
            parent.put(i, parent.get(parent.get(i)));
            i = parent.get(i);
        }
        return i;
    }
    
    // 检查元素是否存在
    public boolean contains(int x) {
        return parent.containsKey(x);
    }
}
```

-----

------

### 堆/优先队列

#### 典型题目

##### 题目示例1 `leetcode 692 前K个高频单词`

```java
private List<String> topKFrequent(String[] words, int k) {
    LinkedList<String> res = new LinkedList<>();
    if(words == null || words.length == 0 || k <= 0) {
        return res;
    }
    
    /*统计词频的哈希表*/
    HashMap<String, Integer> frequency = new HashMap<>();
    /*优先队列使用自定义比较器,构建小根堆*/
    PriorityQueue<String> pq = new PriorityQueue<>(k, new Comparator<String>() {
        @Override
        public int compare(String s1, String s2) {
            if(frequency.get(s1).equals(frequency.get(s2))) {
                return s2.compareTo(s1);
            }
            return frequency.get(s1).compareTo(frequency.get(s2));
        }
    });
    
    for(String word:words) {
        frequency.put(word, frequency.getOrDefault(word, 0) + 1);
    }
    for(String word:frequency.keySet()) {
        pq.offer(word);
        if(pq.size() > k) {
            pq.poll();
        }
    }
    
    while(!pq.isEmpty()) {
        res.addFirst(pq.poll());
    }
    return res;
}
```



------

-------

## 基础算法

### 排序

------

-----

### 深度优先搜索

#### 概念

##### 1、沉岛思想

一般用于二维数组问题的DFS中，找到满足题意的点时，把该点的值更新（岛屿沉没），确保之后不会再访问

优点是递归流程不需要再自己设置和撤销访问标记

缺点是会修改输入

如果题目要求不能修改除符合条件的区域之外的内容，就要有相应的恢复操作

------

#### 典型题目

##### 题目示例1 `leetcode 200 岛屿数量`

**沉岛思想，会改变输入**

```java
public int numIslands(char[][] grid) {
    int counter = 0;
    for(int i = 0; i < grid.length; i++)
        for(int j = 0; j < grid[0].length; j++)
            if(grid[i][j] == '1' && dfs(grid, i, j) >= 1)
                counter++;
    return counter;
}

private int dfs(char[][] grid, int i, int j) {
    if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length)
        return 0;
    if(grid[i][j] == '1') {
        grid[i][j] = '0';
        return dfs(grid, i - 1, j) + dfs(grid, i, j - 1) + dfs(grid, i + 1, j) + dfs(grid, i, j + 1) + 1;
    }
    return 0;
}
```

------

##### 题目示例2  `leetcode 733 图像渲染`

**沉岛思想，会改变输入**

```java
public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    int oldVal = image[sr][sc];
    if(oldVal == newColor)
        return image;
    dfs(image, sr, sc, oldVal, newColor);
    return image;
}

private void dfs(int[][] image, int i, int j, int oldVal, int newColor) {
    if(i < 0 || i >= image.length || j < 0 || j >= image[0].length)
        return;

    if(image[i][j] == oldVal) {
        image[i][j] = newColor;
        dfs(image, i - 1, j, oldVal, newColor);
        dfs(image, i, j - 1, oldVal, newColor);
        dfs(image, i + 1, j, oldVal, newColor);
        dfs(image, i, j + 1, oldVal, newColor);
    } 
}
```

-----

##### 题目示例3 `剑指offer 13 机器人的运动范围`

**沉岛思想，会改变输入**

```java
public int movingCount(int m, int n, int k) {
    if(m <= 0 || n <= 0 || k < 0)
        return 0;

    boolean[][] visited = new boolean[m][n];
    return dfs(m, n, 0, 0, k, visited);
}

private int dfs(int m, int n, int row, int col, int k, boolean[][] visited) {
    int counter = 0;
    if(check(m, n, row, col, k, visited)) {
        visited[row][col] = true;
        counter = 1 + dfs(m, n, row - 1, col, k, visited)
            + dfs(m, n, row, col + 1, k, visited)
            + dfs(m, n, row + 1, col, k, visited)
            + dfs(m, n, row, col - 1, k, visited);
    }
    return counter;
}

private boolean check(int m, int n, int row, int col, int k, boolean[][] visited) {
    if(row >= 0 && row < m && col >= 0 && col < n && !visited[row][col])
        if(getDigitalSum(row) + getDigitalSum(col) <= k)
            return true;
    return false;
}

private int getDigitalSum(int num) {
    int sum = 0;
    while(num > 0) {
        sum += num % 10;
        num = num / 10;
    }
    return sum;
}
```

------

##### 题目示例4 `leetcode 695 岛屿的最大面积`

**沉岛思想，会改变输入**

```java
public int maxAreaOfIsland(int[][] grid) {
    int res = Integer.MIN_VALUE;
    for(int i = 0; i < grid.length; i++) 
        for(int j = 0; j < grid[0].length; j++)
            res = Math.max(res, dfs(grid, i, j));
    return res;
}

private int dfs(int[][] grid, int i, int j) {
    if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0)
        return 0;

    grid[i][j] = 0;
    int res = 1 + dfs(grid, i - 1, j)
        + dfs(grid, i, j - 1)
        + dfs(grid, i + 1, j)
        + dfs(grid, i, j + 1);
    return res;
}
```

-----

##### 题目示例5 `leetcode 1254 统计封闭岛屿的数目`

**沉岛思想**，**会改变输入**

```java
public int closedIsland(int[][] grid) {
    if(grid == null || grid.length == 0)
        return 0;
    
    int res = 0;
    int m = grid.length, n = grid[0].length;
    for(int i = 0; i < m; i++)
        for(int j = 0; j < n; j++)
            if(grid[i][j] == 0 && !dfs(grid, i, j))
                res++;
    return res;
}

// 判断岛屿是否到达边界
private boolean dfs(int[][] grid, int i, int j) {
    if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length)
        return true;
    
    if(grid[i][j] != 0)
        return false;
    
    grid[i][j] = 1;
    // 分别求四个方向，避免“||”的短链效应
    boolean up = dfs(grid, i - 1, j);
    boolean left = dfs(grid, i, j - 1);
    boolean down = dfs(grid, i + 1, j);
    boolean right = dfs(grid, i, j + 1);
    return up || left || down || right;
}
```

---

##### 题目示例6 `leetcode 130 被围绕的区域`

```java
public void solve(char[][] board) {
    if(board == null || board.length == 0)
        return;

    int m = board.length, n = board[0].length;
    for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {
            // 从边界开始，搜索所有与边界相连的岛屿，这些岛屿不可以被修改
            // 除此之外的所有岛屿都可以被修改
            boolean atEdge = (i == 0) || (i == m - 1) || (j == 0) || (j == n - 1);
            if(atEdge && board[i][j] == 'O')
                dfs(board, i, j); 
        }
    }

    for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {
            if(board[i][j] == 'O')
                board[i][j] = 'X';
            if(board[i][j] == '#')
                board[i][j] = 'O';
        }
    }
}

private void dfs(char[][] board, int i, int j) {
    if(i < 0 || i >= board.length || j < 0 || j >= board[0].length 
       || board[i][j] == 'X'
       || board[i][j] == '#')
        return;

    board[i][j] = '#';
    dfs(board, i - 1, j);
    dfs(board, i, j - 1);
    dfs(board, i + 1, j);
    dfs(board, i, j + 1);
}
```

-----

##### 题目示例7 `leetcode 417 太平洋大西洋水流问题`

**沉岛思想，不过利用备份确保不修改输入**

```java
List<List<Integer>> res = new LinkedList<>();
public List<List<Integer>> pacificAtlantic(int[][] matrix) {
    if(matrix == null || matrix.length == 0)
        return res;
    
    int m = matrix.length, n = matrix[0].length;
    int[][] pacific = new int[m][n];
    int[][] atlantic = new int[m][n];
    
    for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {
            // 从大洋逆流进到陆地，
            if(i == 0 || j == 0) 
                dfs(matrix, pacific, i, j, matrix[i][j]);
            if(i == m - 1 || j == n - 1)
                dfs(matrix, atlantic, i, j, matrix[i][j]);
        }
    }
    
    // 
    for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {
            if(pacific[i][j] == 1 && atlantic[i][j] == 1)
                res.add(Arrays.asList(i, j));
        }
    }
    return res;
}

private void dfs(int[][] matrix, int[][] ocean, int i, int j, int preVal) {
    if(i < 0 || i >= matrix.length || j < 0 || j > matrix[0].length 
       // 已经流到过，不需要再试
       || ocean[i][j] == 1
       // 无法流动（注意这里是逆流）
       || matrix[i][j] < pre ) {
        return;
    }
    
    ocean[i][j] = 1;
    dfs(matrix, ocean, i - 1, j, matrix[i][j]);
    dfs(matrix, ocean, i, j - 1, matrix[i][j]);
    dfs(matrix, ocean, i + 1, j, matrix[i][j]);
    dfs(matrix, ocean, i, j + 1, matrix[i][j]);
}
```

-----

##### 题目示例8 `leetcode 329 矩阵中的最长递增路径`

```java
/*
* 关键：
* 从一个格子开始找，对比它4周的格子，有没有比它小的，如果有，比如有A，B，C三个格子都比它小，
* 那么当前格子的最大连续递增长度就是这3个格子的最大连续递增长度中的最大值+1
*/
class Solution {
    private int row;
    private int col;
    private int[][] dirs = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
    private int[][] visited;
    
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix == null || matrix.length == 0) {
            return 0;
        }
        
        row = matrix.length;
        col = matrix[0].length;
        visited = new int[row][col];
        int res = 0;
        
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                res = Math.max(res, dfs(matrix, i, j));
            }
        }
        return res;
    }
    
    private int dfs(int[][] matrix, int i, int j) {
        if(!checkBound(i, j)) {
            return 0;
        }
        if(visited[i][j] != 0) {
            return visited[i][j];
        }
        
        for(int[] dir:dirs) {
            int newRow = i + dir[0], newCol = j + dir[1];
            if(checkBound(newRow, newCol) && matrix[i][j] > matrix[newRow][newCol]) {
                visited[i][j] = Math.max(visited[i][j], dfs(matrix, newRow, newCol));
            }
        }
        return ++visited[i][j];
    }
    
    private boolean checkBound(int i, int j) {
        return i >= 0 && i < row && j >= 0 && j < col; 
    }
}
```

---

##### 题目示例9 `leetcode 199 二叉树的右视图`

**参考题解:**https://leetcode-cn.com/problems/binary-tree-right-side-view/solution/jian-dan-bfsdfs-bi-xu-miao-dong-by-sweetiee/

```java
List<Integer> res = new LinkedList<>();
public List<Integer> rightSideView(TreeNode root) {
    if(root == null) {
        return res;
    }

    dfs(root, 0);
    return res;
}

/**
* 节点访问顺序：根节点，右子节点，左子节点
*/
private void dfs(TreeNode root, int depth) {
    if(root == null) {
        return;
    }

    if(depth == res.size()) {
        res.add(root.val);
    }

    depth++;
    dfs(root.right, depth);
    dfs(root.left, depth);
}
```

-----

##### 题目示例10 `leetcode 257 二叉树的所有路径`

```java
List<String> res = new LinkedList<>();
public List<String> binaryTreePaths(TreeNode root) {
    dfs(root, "");
    return res;
}

/**
* 在这里传String的原因是，每次改变都会创建一个新对象
*/
private void dfs(TreeNode root, String s) {
    if(root == null) {
        return;
    }

    s += Integer.toString(root.val);
    if(root.left == null && root.right == null) {
        res.add(s);
    }
    s += "->";
    dfs(root.left, s);
    dfs(root.right, s);
}
```



-----

-----

### 二分搜索

#### 二分搜索模板

##### 零、二分查找框架

```java
private int binarySearch(int[] nums, int target) {
    int left = 0, right = ...;
    
    while(...) {
        int mid = left + (right - left) / 2;
        if(nums[mid] == target)
            ...;
        else if(nums[mid] < target)
            left = ...;
        else if(nums[mid] > target)
            right = ...;
    }
    return ...;
}

// 关键点一：分析二分查找算法时，不要出现else,而是把所有情况都用else if写清楚，这样可以清楚的展现所有细节
// 关键点二：为了防止计算mid时发生溢出，应使用 mid = left + (right - left) / 2来代替mid = (right + left) / 2
```

##### 一、寻找一个数（基本的二分搜索）

搜索一个数，如果存在，返回其索引，否则返回-1

```java
private int binarySearch(int[] nums, int target) {
    if(nums == null || nums.length == 0)
        return -1;
    
    int left = 0, right = nums.length - 1;
    while(left <= right) {
        int mid = left + (right - left) / 2;
        if(nums[mid] == target)
            return mid;
        else if(nums[mid] < target)
            left = mid + 1;
        else if(nums[mid] > target)
            right = mid - 1;
    }
    return -1;
}
```

**1、while循环中条件为left <= right ,而不是left < right 的原因**

因为初始化时`right`赋值为`nums.length - 1`,则每次搜索的区间为闭区间`[left, right]`,循环终止有两个可能：

- 找到目标值，即`nums[mid] == target` 
- 搜索区间为空，`while(left <= right)`终止条件为 `left == right + 1 `,表示闭区间 `[right + 1, right]`,此时区间为空，`while`循环正确终止

**2、left = mid + 1, right = mid - 1的变化规律**

因为这个算法搜索区间为闭区间 `[left, right]`,当发现 `mid`对应位置不是目标值时，应该将其从搜索区间中**去除**，搜索区间变为 `[left, mid - 1]` 或 `[mid + 1, right]`

**3、算法的缺陷**

无法有效进行边界搜索，在数组中存在重复元素时，算法在搜索到第一个元素之后立刻返回

----

##### 二、寻找左侧边界的二分搜索

```java
private int leftBound(int[] nums, int target) {
    if(nums.length == 0)
        return -1;
    int left = 0;
    int right = nums.length;
    
    while(left < right) {
        int mid = left + (right - left) / 2;
        if(nums[mid] == target)
            right = mid;	
        else if(nums[mid] < target)
            left = mid + 1;
        else if(nums[mid] > target)
            right = mid;
    }
    return left; // 循环的结束条件是left == right,所以也可以返回right
}
```

**1、while中条件为 left < right 而不是 left <= right的原因**

因为初始化时 `right`赋值为 `right = nums.length`而不是 `nums.length - 1`,其搜索区间为 `[left, right)`的左闭右开区间

`while(left < right)`的终止条件为 `left == right `,此时搜索区间 `[left, left)`为空，循环可以正确终止

在循环内，查找空间的每一步至少有2个元素，在存在目标元素的情况下，循环退出时，`left`和 `right`都指向同一个元素

**2、算法在数组中不存在target值的情况下返回结果的含义**

**左侧边界**的含义：

![](../../../mdPics/1.jpg)

对于上图的数组，算法返回值为1，其含义可以理解为：`nums`中小于2的元素有1个

再比如有序数组 `nums = [2, 3, 5, 7]`,`target = 1`,算法返回值为0，表示： `nums`中小于1的元素有0个

再比如有序数组 `nums = [2, 3, 5, 7],target = 8` 算法返回值为4,表示： `nums`中小于8的元素有4个

可以看出，函数的返回值（即 `left`变量的值）取值范围为 `[0, nums.length]`,可以通过添加简单的代码来处理数组中不存在目标值的情况，当然，具体的返回值根据需求决定

```java
while(left < right) {
    // ...
}

if(left == nums.length)
    return -1;
return nums[left] == target? left:-1;
```

**3、`left = mid + 1, right = mid`的变化规律**

因为算法搜索区间为 `[left, right)`的半开半闭区间，当发现 `mid`对应位置不是目标值时，搜索区间应该为 `mid`分割的两个子区间 `[left, mid )`或 `[mid + 1, right)`

**4、算法搜索左侧边界的原理**

在 `nums[mid] == target`时，算法的处理方式为：

```java
if(nums[mid] == target)
    right = mid;
```

通过不断缩小搜索区间的上界，使得搜索区间不断向左收缩，达到锁定左侧边界的目的

**5、返回值设置为left的原因**

其实也可以设置为 `right`,因为循环的终止条件为 `left == right`，此时查找空间内只剩一个元素，再判断这个元素是否满足条件即可

---

##### 三、寻找右侧边界的二分查找

```java
private int rightBound(int[] nums, int target) {
    if(nums.length == 0)
        return -1;
    
    int left = 0, right = nums.length;
    while(left < right) {
        int mid = left + (right - left) / 2;
        if(nums[mid] == target)
            left = mid + 1;
        else if(nums[mid] < target)
            left = mid + 1;
        else if(nums[mid] > target)
            right = mid;
    }
    return left - 1;// 循环结束的条件是left == right,同时有left = mid + 1；返回值可以是left-1或right-1
}
```

**1、算法搜索右侧边界的原理**

```java
if(nums[mid] == target)
    left = mid + 1;
```

通过不断增大搜索区间的下界 `left`,使得搜索区间不断向右收缩，达到锁定右侧边界的目的

**2、返回值设置为left - 1的原因**

`while`循环终止的条件为 `left == right`,所以也可以返回 `right - 1`

由于在搜索右侧边界时有：

```java
if(nums[mid] == target)
    left = mid + 1;
```

所以有 `mid = left - 1`

**3、在数组中不存在目标值时的返回结果设置**

与左侧边界搜索相同，因为 `while`的终止条件为 `left == right`,也就是 left 的取值范围为 `[0, nums.length]`,可以添加如下代码处理边界条件

```java
while(left < right)
{
    //...
}
if(left == 0)
    return -1;
return nums[left - 1] == target ? (left - 1):-1;
```

----

##### 四、逻辑统一

在之前的分析中，普通的二分搜索与左右边界的二分搜索在形式上有所区别，在这里对其进行统一，规定使用两端封闭的搜索区间来实现

```java
// 基本的二分搜索模板，判断元素存在与否
private int binarySearch(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
    while(left <= right) {
        int mid = left + (right - left) / 2;
        if(nums[mid] == target)
            return mid;
        else if(nums[mid] < target)
            left = mid + 1;
        else if(nums[mid] > target)
            right = mid - 1;
    }
    return -1;
}

// 搜索左侧边界的二分搜索模板
private int leftBound(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
    while(left <= right) {
        int mid = left + (right - left) / 2;
        if(nums[mid] == target)
            right = mid - 1;
        else if(nums[mid] < target)
            left = mid + 1;
        else if(nums[mid] > target)
            right = mid - 1;
    }
    
    // 检查left 越界情况
    if(left >= nums.length || nums[left] != target)
        return -1;
    return left;
}

// 搜索右侧边界的二分搜索模板
private int rightBound(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
    while(left <= right) {
        int mid = left + (right - left) / 2;
        if(nums[mid] == target)
            left = mid + 1;
        else if(nums[mid] < target)
            left = mid + 1;
        else if(nums[mid] > target)
            right = mid - 1;
    }
    
    // 检查right越界情况
    if(right < 0 || nums[right] != target)
        return -1;
    return right;
}
```

----

#### 典型题目

##### 题型1：二分求满足条件的元素

二分法确定**满足条件**的元素的下标/或元素本身

通常是在有序或者半有序的数组中查找特定元素

###### 题目示例1 `leetcode 704 二分查找`

**最基础的二分题, 寻找满足条件的一个数**

```java
private int search(int[] nums, int target) {
    if(nums == null || nums.length == 0) {
        return -1;
    }
    
    int left = 0, right = nums.length - 1;
    while(left <= right) {
        int mid = left + (right - left) / 2;
        if(nums[mid] == target) {
            return mid;
        } else if(nums[mid] < target) {
            left = mid + 1;
        } else if(nums[mid] > target) {
            right = mid - 1;
        }
    }
    return -1;
}
```

----

###### 题目示例2 `leetcode 34 在排序数组中查找元素的第一个和最后一个位置`

**左右边界查找算法的综合使用**

```java
public int[] searchRange(int[] nums, int target) {
    int first = leftBound(nums, target);
    int right = rightBound(nums, target);
    return new int[]{first, right};
}

/**
* 寻找元素的左侧边界
*/
private int leftBound(int[] nums, int target) {
    if(nums == null || nums.length == 0) {
        return -1;
    }

    int left = 0, right = nums.length - 1;
    while(left <= right) {
        int mid = left + (right - left) / 2;
        if(nums[mid] == target) {
            right = mid - 1;
        } else if(nums[mid] < target) {
            left = mid + 1;
        } else if(nums[mid] > target) {
            right = mid - 1;
        }
    }

    if(left >= nums.length || nums[left] != target) {
        return -1;
    }
    return left;
}

/**
* 寻找元素的右侧边界
*/
private int rightBound(int[] nums, int target) {
    if(nums == null || nums.length == 0) {
        return -1;
    }

    int left  = 0, right = nums.length - 1;
    while(left <= right) {
        int mid = left + (right - left) / 2;
        if(nums[mid] == target) {
            left = mid + 1;
        } else if(nums[mid] < target) {
            left = mid + 1;
        } else if(nums[mid] > target) {
            right = mid - 1;
        }
    }

    if(right < 0 || nums[right] != target) {
        return -1;
    }
    return right;
}
```

----

###### 题目示例3 `leetcode 35 搜索插入位置`

**本质是搜索元素的左边界**

```java
public int searchInsert(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
    while(left <= right) {
        int mid = left + (right - left) / 2;
        if(nums[mid] == target) {
            return mid;
        } else if(nums[mid] < target) {
            left = mid + 1;
        } else if(nums[mid] > target) {
            right = mid - 1;
        }
    }
    return left;
}
```

----

###### 题目示例4 `leetcode 33 搜索旋转排序数组`

**要求：时间复杂度为O(logN),只能用二分查找**

```java
/*
* 重点就是在判断mid分割出的两个搜索区间哪个是有序的，先去有序的部分搜索
* 由于题目说数字了无重复，举个例子：
* 1 2 3 4 5 6 7 可以大致分为两类，
* 第一类 2 3 4 5 6 7 1 这种，也就是 nums[start] <= nums[mid]。此例子中就是 2 <= 5。
* 这种情况下，前半部分有序。因此如果 nums[start] <=target<nums[mid]，则在前半部分找，否则去后半部分找。
* 第二类 6 7 1 2 3 4 5 这种，也就是 nums[start] > nums[mid]。此例子中就是 6 > 2。
* 这种情况下，后半部分有序。因此如果 nums[mid] <target<=nums[end]，则在后半部分找，否则去前半部分找
*/
private int search(int[] nums, int target) {
    if(nums == null || nums.length == 0) {
        return -1;
    }
    
    int left = 0, right = nums.length - 1;
    while(left <= right) {
        int mid = left + (right - left) / 2;
        
        if(nums[mid] == target) {
            return mid;
        }
        // 前半部分有序
        if(nums[left] <= nums[mid]) {
            if(nums[left] <= target && target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        } else {
            if(nums[mid] < target && target <= nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }
    return -1;
}
```

----

###### 题目示例5 `leetcode 81 搜索旋转排序数组II`

```java
/**
* 举例如下：
* 第一类
* 1011110111 和 1110111101 这种。此种情况下 nums[start] == nums[mid]，分不清到底是前面有序还是后面有序，此时 start++ 即* * 可。相当于去掉一个重复的干扰项。
* 第二类
* 22 33 44 55 66 77 11 这种，也就是 nums[start] < nums[mid]。此例子中就是 2 < 5；
* 这种情况下，前半部分有序。因此如果 nums[start] <=target<nums[mid]，则在前半部分找，否则去后半部分找。
* 第三类
* 66 77 11 22 33 44 55 这种，也就是 nums[start] > nums[mid]。此例子中就是 6 > 2；
* 这种情况下，后半部分有序。因此如果 nums[mid] <target<=nums[end]。则在后半部分找，否则去前半部分找。
*/
private boolean search(int[] nums, int target) {
    if(nums == null || nums.length ==0) {
        return false;
    }
    
    int left = 0, right = nums.length - 1;
    while(left <= right) {
        int mid = left + (right - left) / 2;
        
        if(nums[mid] == target) {
            return true;
        }
        
        // 无法判断哪部分有序时，直接移动边界
        if(nums[left] == nums[mid]) {
            left++;
            continue;
        }
        // 左半部分有序
        if(nums[left] < nums[mid]) {
            if(nums[left] <= target && target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        } else {
            if(nums[mid] < target && target <= nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }
    return false;
}
```

-----

###### 题目示例6  `leetcode 153 寻找旋转排序数组中的最小值`

```java
private int findMin(int[] nums) {
    if(nums == null || nums.length == 0) {
        return -1;
    }
    
    int left = 0, right = nums.length - 1;
    while(left < right) {
        int mid = left + (right - left) / 2;
        if(nums[mid] > nums[right]) {
            left = mid + 1;
        } else if(nums[mid] <= nums[right]) {
            right = mid;
        }
    }
    // 循环结束时，left和right都指向了最小元素
    return nums[left];
}
```

-----

###### 题目示例7 `leetcode 154 寻找旋转排序数组中的最小值II`

有重复元素

```java
private int findMin(int[] nums) {
    if(nums == null || nums.length <= 0)
        return -1;
    
    int left = 0, right = nums.length - 1;
    while(left < right) {
        int mid = left + (right - left) / 2;
        if(nums[mid] < nums[right])
            right = mid;
        else if(nums[mid] > nums[right])
            left = mid + 1;
        else if(nums[mid] == nums[right])
            right--;
    }
    return nums[left];
}
```

-----

###### 题目示例8 `leetcode 275 H指数II`

```java
// 关键：返回一个数据区间的长度，该区间满足最小的值大于等于该区间的长度
private int hIndex(int[] citations) {
    if(citations == null || citations.length == 0 || citations[citations.length - 1] == 0)
        return 0;
    
    int len = citations.length;
    int left = 0, right = len - 1;
    while(left < right) {
        int mid = left + (right - left) / 2;
        if(citations[mid] < len - mid)
            left = mid + 1;
        else
            right = mid;
    }
    return len - left;
}
```



---

##### 题目示例2 `leetcode 74 搜索二维矩阵`

```java
// 普通二分搜索问题
// 关键：将二维矩阵上的搜索转化为一维矩阵上的搜索
private boolean searchMatrix(int[][] matrix, int target)
{
    if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
        return false;
    
    int rowLen = matrix.length, colLen = matrix[0].length;
    int start = 0, end = rowLen * colLen - 1;
    while(start <= end)
    {
        int mid = start + (end - start) / 2;
        int curVal = matrix[mid / colLen][mid % colLen];
        if(curVal == target)
            return true;
        else if(curVal < target)
            start = mid + 1;
        else if(curVal > target)
            end = mid - 1;
    }
    return false;
}
```

----

##### 题目示例3 `leetcode 278 第一个错误的版本`

```java
// 寻找左侧边界的二分搜索问题
private int firstBadVersion(int n)
{
    int left = 1, right = n;
    while(left <= right)
    {
        int mid = left + (right - left) / 2;
        if(isBadVersion(mid))
            right = mid - 1;
        else if(!isBadVersion(mid))
            left = mid + 1;
    }
    return left;
}
```

-----

##### 题目示例8 `leetcode 162 寻找峰值`

```java
private int findPeakElement(int[] nums) {
    int left = 0, right = nums.length - 1;
    while(left < right) {
        int mid = left + (right - left) / 2;
        if(nums[mid] < nums[mid + 1])
            left = mid + 1;
        else
            right = mid;
    }
    return left;
}
```

----

##### 题目示例10  `leetcode 287 寻找重复数`

```java
private int findDuplicate(int[] nums)
{
    int n = nums.length;
    int left = 1, right = n - 1;
    while(left < right)
    {
        int mid = left + (right - left) / 2;
        int counter = 0;
        for(int num:nums)
            if(num <= mid)
                counter++;
        
        if(counter > mid)
            right = mid;
        else
            left = mid + 1;
    }
    return left;
}
```

----

##### 题目示例11 `leetcode 315 计算右侧小于当前元素的个数`

------

##### 题目示例12 `leetcode 69 X的平方根`

```java
private int mySqrt(int x) {
    long left = 0, right = x / 2;
    while(left <= right) {
        long mid = left + (right - left) / 2;
        long sqr = mid * mid;
        long nextSqr = (mid + 1) * (mid + 1);
        
        if(sqr == x || (sqr < x && x < nextSqr))
            return (int)mid;
        else if(sqr < x)
            left = mid + 1;
        else if(sqr > x)
            right = mid - 1;
    }
    return x; // 处理1*1 = 1的情况
}
```

----

##### 题目示例13 `leetcode 374 猜数字大小`

```java
private int guessNumber(int n) 
{
    int left = 1, right = n;
    while(left <= right)
    {
        int mid = left + (right - left) / 2;
        int temp = guess(mid);
        if(temp == 0)
            return mid;
        else if(temp == -1)
            right = mid - 1;
        else if(temp == 1)
            left = mid + 1;
    }
    return -1;
}
```

-----

##### 题目示例14 `leetcode 638 找到K个最接近的元素`

```java
private List<Integer> findClosestElements(int[] arr, int k, int x)
{
    int left = 0, right = arr.length - k;
    while(left < right)
    {
        int mid = left + (right - left) / 2;
    	if(x - arr[mid] > arr[mid + k] - x)
     		left = mid + 1;
         else
            right = mid;
    }
    
    List<Integer> res = new ArrayList<>();
    for(int i = left; i < left + k; i++)
        res.add(arr[i]);
    return res;
}
```

-----

##### 题目示例15 `剑指offer 53-II 0 ~ n-1中缺失的数字`

```java
private int missingNumber(int[] nums) {
    if(nums == null || nums.length == 0) {
        return -1;
    }
    
    // 搜索区间是一个闭区间
    // 关键点：缺失的数字后面的所有数字都满足：数值大于下标
    int left = 0, right = nums.length - 1;
    while(left <= right) {
        int mid = left + (right - left) / 2;
        if(nums[mid] > mid) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }
    
    return left;
}
```

-------

-------

### 动态规划

#### 矩阵类型( 10% )

###### 题目示例1 `leetcode 64 最小路径和`

```java
// dp[i][j] 表示从起点走到（i,j）的最短路径长度
// dp[i][j] = min( dp[i-1][j], dp[i][j-1] ) + grid[i][j]
// base case:dp[0][0] = grid[0][0], dp[i][0] = sum( 0, 0 -> i, 0 ), dp[0][i] = sum( 0, 0 -> 0, i )
// return dp[rowLen-1][colLen-1]

// v1
private int minPathSum( int[][] grid ) {
    if(grid == null || grid.length == 0 || grid[0].length == 0) {
        return 0;
    }
        
    int m = grid.length, n = grid[0].length;
    int[][] dp = new int[m][n];
    dp[0][0] = grid[0][0];
    for( int i = 1; i < m; i++ ){
        dp[i][0] = grid[i][0] + dp[i-1][0];    
    }
    for( int i = 1; i < n; i++ ) {
        dp[0][i] = grid[0][i] + dp[0][i-1];
    }
    for(int i = 1; i < m; i++) {
        for(int j = 1; j < n; j++) {
            dp[i][j] = Math.min( dp[i-1][j], dp[i][j-1] ) + grid[i][j]; 
        }      
    }

    return dp[m-1][n-1];
}

// 根据v1的解法可以知道，dp[i][j]的值只依赖其左侧，上侧的值和当前所在位置的值
// 可以压缩使用的空间，得到如下解法
// v2
private int minPathSum( int[][] grid ) {
    if(grid == null || grid.length == 0 || grid[0].length == 0)
        return 0;
    
    int m = grid.length, n = grid[0].length;
    int[] dp = new int[n];
    for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {
            if(j == 0)
                dp[j] = dp[j];		// 只能从上侧走到该位置
            else if(i == 0)
                dp[j] = dp[j-1];	// 只能从左侧走到该位置
            else
            	dp[j] = Math.min( dp[j], dp[j-1] );
            dp[j] += grid[i][j];
        }
    }
    return dp[n-1];
}
```

###### 题目示例2 `leetcode 62 不同路径`

```java
// dp[i][j]表示从起点（0，0）走到当前位置（i,j）的路径总数
// 这里使用了空间压缩，原理与示例一相同
private int uniquePaths( int m, int n )
{
    if( m <= 0 || n <= 0 )
        return 0;

    int[] dp = new int[n];
    Arrays.fill( dp, 1 );
    for( int i = 1; i < m; i++ )
        for( int j = 1; j < n; j++ )
            dp[j] = dp[j] + dp[j-1];
    return dp[n-1];
}
```

###### 题目示例3 `leetcode 63不同路径II`

```java
// dp[][]数组的含义与示例二相同
// v1
private int uniquePathWithObstacles( int[][] obstacleGrid )
{
    int m = obstacleGrid.length, n = obstacleGrid[0].length;
    if( m == 0 || n == 0 )
        return 0;
    
    int[][] dp = new int[m][n];
    dp[0][0] = obstacleGrid[0][0] == 0? 1: 0;
    if( dp[0][0] == 0 )
        return 0;										// 起点就是障碍物时无法做任何移动
    for( int i = 1; i < m; i++ )
        if( obstacleGrid[i][0] != 1 )
            dp[i][0] = dp[i-1][0];
    for( int i = 1; i < n; i++ )
        if( obstacleGrid[0][i] != 1 )
            dp[0][i] = dp[0][i-1];
    
    for( int i = 1; i < m; i++ )
        for( int j = 1; j < n; j++ )
            if( obstacleGrid[i][j] != 1 )
               dp[i][j] = dp[i-1][j] + dp[i][j-1];
    return dp[m-1][n-1];
}

// v2 空间压缩版本
private int uniquePathWithObstacles( int[][] obstacleGrid )
{
    int m = obstacleGrid.length, n = obstacleGrid[0].length;
    if( m == 0 || n == 0 )
        return 0;

    int[] dp = new int[n];
    dp[0] = 1;
    for( int i = 0; i < m; i++ )
    {
        for( int j = 0; j < n; j++ )
            if( obstacleGrid[i][j] == 1 )
                dp[j] = 0;
            else if( j > 0 )
            	dp[j] += dp[j-1];
    }
    return dp[n-1];
}
```



#### 序列类型（40%）

###### 题目示例1 `leetcode 70 爬楼梯`

```java
private int climbStairs( int n )
{
    if( n < 3 ) 
        return n;

    int[] dp = new int[n+1];
    dp[1] = 1;
    dp[2] = 2;
    for( int i = 3; i <= n; i++ )
        dp[i] = dp[i-1] + dp[i-2];
    return dp[n];
}
```

-----

###### 题目示例2 `leetcode 55跳跃游戏`

```java
/** 
* dp[i]表示是否能从0跳到i
* base case:dp[0] = true
* return dp[nums.length - 1]
*/
private boolean canJump(int[] nums) {
    if(nums.length == 0)
        return true;
    
    boolean[] dp = new boolean[nums.length - 1];
    dp[0] = true;
    for(int i = 1; i < nums.length; i++)
        for(int j = 0; j < i; j++)
            if(dp[j] && nums[j] + j >= i)
                dp[i] = true;
    return dp[nums.length - 1];
}
```

-----

###### 题目示例3 `leetcode 45跳跃游戏II`

```java
// dp[i]表示从0跳到i的最小次数
// base case: dp[0] = 0
// return dp[nums.length-1]
// v1 出现了超时
private int jump( int[] nums )
{
    int[] dp = new int[nums.length];
    dp[0] = 0;
    for( int i = 1; i < nums.length; i++ )
    {
        dp[i] = i;			// 最大值为i,相当于从0开始每次跳一步到达当前位置
        for( int j = 0; j < i; j++ )
            if( j + nums[j] >= i )
                dp[i] = Math.min( dp[j] + 1, dp[i] );
    }
    return dp[nums.length-1];
}

// v2
private int jump( int[] nums )
{
    int res = 0, end = 0, maxPos = 0;
    for( int i = 0; i < nums.length - 1; i++ )
    {
        maxPos = Math.max( maxPos, nums[i] + i );
        if( i == end )
        {
            end = maxPos;
            res++;
        }
    }
    return  res;
}
```

###### 题目示例4 `leetcode 132 分割回文串`

```java
// dp[i]表示字符串前i个字符组成的子字符串需要的最少分割次数
// base case : dp[0] = -1;
// return: dp[s.length()-1]
private int minCut( String s )
{
    
}
```

------

###### 题目示例5 `leetcode 300最长上升子序列`

```java
private int lengthOfLIS(int[] nums) {
    if(nums == null || nums.length == 0)
        return 0;
    
    int[] dp = new int[nums.length];
    Arrays.fill(dp, 1);
    for(int i = 0; i < nums.length; i++)
        for(int j = 0; j < i; j++)
            if(nums[i] > nums[j])
                dp[i] = Math.max(dp[i], dp[j] + 1);
    int res = 0;
    for(int re:dp)
        res = Math.max( res, re );
    return res;
}
```

-----

###### 题目示例6 `leetcode 139 单词拆分`

```java
private boolean wordBreak( String s, List<String> wordDict )
{
    
}
```

-----

###### 题目示例7 `leetcode 647 回文子串`

**参考题解：**https://leetcode-cn.com/problems/palindromic-substrings/solution/647-hui-wen-zi-chuan-dong-tai-gui-hua-fang-shi-qiu/

```java
// dp[i][j]表示字符串中[i, j]所划分的子串是否为回文子串
/**
* 使用中心扩散法，设dp[i+1][j-1]已知，则
* 	若s.charAt(i) == s.charAt(j),则只要dp[i+1][j-1]为真，则dp[i][j]也为真
*	若s.charAt(i) != s.charAt(j),dp[i][j]必为假
*/
public int countSubstrings(String s) {
    if(s == null || s.length() == 0) {
        return 0;
    }

    int len = s.length();
    // 每个单独的字符都是一个回文串
    int res = len;
    boolean[][] dp = new boolean[len][len];
    for(int i = 0; i < len; i++) {
        dp[i][i] = true;
    }

    for(int i = len - 1; i >= 0; i--) {
        for(int j = i + 1; j < len; j++) {
            if(s.charAt(i) == s.charAt(j)) {
                // i与j相邻时， dp[i+1][j-1]是不存在的，需要特判
                if(j - i == 1) {
                    dp[i][j] = true;
                } else {
                    dp[i][j] = dp[i+1][j-1];
                }
            } else {
                dp[i][j] = false;
            }

            if(dp[i][j]) {
                res++;
            }
        }
    }
    return res;
}
```



-----

------

#### 双序列（字符串）DP类型 （40%）

#### 0-1背包问题 （10%）

###### 题目示例1 `leetcode 416分割等和子集`

```java
// dp[i][j] = var 表示，对于前i个物品，当背包容量为j时，若var = true，表示恰好将背包装满，反之表示装不满
// base case 1: dp[...][0] = true,表示背包容量为0时相当于装满了
// base case 2: dp[0][...] = false,表示没有物品可以选择的时候，无论如何无法装满背包
// return: dp[N][sum/2]
// v1
private boolean canPartition( int[] nums )
{
    int sum = 0;
    for( int num:nums )
        sum += num;
    if( sum % 2 != 0 )
        return false;
    
    int n = nums.length;
    sum = sum / 2;
    boolean[][] dp = new boolean[n+1][sum+1];
    for( int i = 0; i <= n; i++ )
        dp[i][0] = true;
    
    for( int i = 1; i <= n; i++ )
        for( int j = 1; j <= sum; j++ )
            if( j - nums[i-1] < 0 )
                dp[i][j] = dp[i-1][j];
    	    else
                dp[i][j] = dp[i-1][j] | dp[i-1][j-nums[i-1]];
    return dp[n][sum];
}

// v2 状态压缩
private boolean canPartition( int[] nums )
{
    int sum = 0;
    for( int num:nums )
        sum += num;
    if( sum % 2 != 0 )
        return false;
    
    int n = nums.length;
    sum /= 2;
    boolean[] dp = new boolean[sum+1];
    dp[0] = true;
    
    for( int i = 1; i <= n; i++ )
    	for( int j = sum; j >= 0; j-- )
            if( j - nums[i-1] >= 0 )
                dp[j] = dp[j] | dp[j-nums[i-1]];
    return dp[sum];
}
```

###### 题目示例2 `leetcode 322零钱兑换`

```java
// dp[i]定义：当目标金额为i时，最少需要的硬币数量为dp[i]
private int coinChange( int[] coins, int amount )
{
    int[] dp = new int[amount+1];
    Arrays.fill( dp, amount+1 );
    dp[0] = 0;
    for( int i = 0; i < dp.length; i++ )
        for( int coin:coins )
            if( i - coin >= 0 )
                dp[i] = Math.min( dp[i], dp[i-coin] + 1 );
    return dp[amount] == amount + 1? -1:dp[amount];
}
```

###### 题目示例3 `leetcode 518 零钱兑换II`

```java
private int change( int amount, int[] coins )
{
    int n = coins.length;
    int[] dp = new int[amount+1];
    dp[0] = 1;
    for( int i = 0; i < n; i++ )
        for( int j = 1; j <= amount; j++ )
            if( j - coins[i] >= 0 )
                dp[j] = dp[j] + dp[j-coins[i]];
    return dp[amount];
}
```









#### `leetcode 股票买卖系列问题`

**状态：**天数、允许交易的最大次数、股票的持有状态

**选择：**买入股票、卖出股票、无操作

```java
/**
* 构建如下的dp数组
* 0 <= n <= n - 1, 1 <= k <= K
* n为天数,K为最大可交易次数
* 题目最多有n X K X 2种状态，可以全部穷举
* 0和1表示持有状态，0表示不持有股票，1表示持有股票
*/
dp[i][k][0 or 1];
for( int i = 0; i < n; i++ )
    for( int k = 1; k <= K; k++ )
        for( int s :{0, 1} )
            dp[i][k][s] = Math.max( buy, sell, rest );
// 最终需要求解得到的答案是:dp[n-1][K][0]
    
// 根据分析得到如下的状态转移方程
/**
* 解释：今天不持有股票(s = 0 )有两种原因：
* 1.昨天就未持有股票，今天选择rest(不参与购买股票),今天仍然未持有股票
* 2.昨天就持有股票，今天选择售出
*/
dp[i][k][0] = Math.max( dp[i-1][k][0], dp[i-1][k][1] + prices[i] );
    		= Math.max(  选择rest     ,         选择sell          );

/**
* 解释：今天持有股票( s = 1 )有两种原因：
* 1.昨天就持有股票，今天选择rest(不参与售出股票),今天仍然持有股票
* 2.昨天未持有股票，今天选择buy(购入股票)
* 这个状态转移方程中出现了k-1的原因是：把一次购入股票和售出股票的操作作为一次完整的交易，
* 以购入股票为标志代表使用了一次交易机会，可用交易次数减一
*/
dp[i][k][1] = Math.max( dp[i-1][k][1], dp[i-1][k-1][0] - prices[i] );
		   = Math.max(  选择rest     ,         选择buy             );

/**
* 定义base case 
*/
dp[-1][k][0] = 0;					// i从0开始，故i < 0意味着从未进行任何交易，利润为0
dp[-1][k][1] = Integer.MIN_VALUE;	 // 未进行交易时不可能持有任何股票，用负无穷表示
dp[i][0][0] = 0;    				// k从1开始，k < 1代表不允许进行任何交易，利润为0
dp[i][0][1] = Integer.MIN_VALUE;	 // 不允许进行任何交易的情况下不可能持有股票，用负无穷表示


/**
* 状态转移方程总结
*/
// base case
dp[-1][k][0] = dp[i][0][0] = 0;
dp[-1][k][1] = dp[i][0][1] = Integer.MIN_VALUE;
// 状态转移
dp[i][k][0] = Math.max( dp[i-1][k][0], dp[i-1][k][1] + prices[i] );
dp[i][k][1] = Math.max( dp[i-1][k][1], dp[i-1][k-1][0] - prices[i] );
```

###### 题目示例1 `leetcode 121 买卖股票的最佳时机`

**分析**：K =  1，可以不考虑其影响

```java
class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int n = prices.length;
        int dpI0 = 0, dpI1 = Integer.MIN_VALUE;
        for( int i = 0; i < n; i++ )
        {
            dpI0 = Math.max( dpI0, dpI1 + prices[i] );
            dpI1 = Math.max( dpI1, -prices[i] );
        }
        return dpI0;
    }
}
```

###### 题目示例2 `leetcode 122 买卖股票的最佳时机II`

**分析**：K = infinity,可以不考虑其影响

```java
class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int n = prices.length;
        int dpI0 = 0, dpI1 = Integer.MIN_VALUE;
        for( int i = 0; i < n; i++ )
        {
            int temp = dpI0;
            dpI0 = Math.max( dpI0, dpI1 + prices[i] );
            dpI1 = Math.max( dpI1, temp - prices[i] );
        }
        return dpI0;
    }
}
```

###### 题目示例3 `leetcode 123 买卖股票的最佳时机III`

**分析**：Ｋ　＝　２，遍历所有的K值

```java
class Solution 
{
    public int maxProfit(int[] prices) 
    {
        if( prices == null || prices.length < 2 )
            return 0;
        int maxK = 2;
        int n = prices.length;
        int[][][] dp = new int[n][maxK+1][2];
        for( int i = 0; i < n; i++ )
            for( int k = 1; k <= maxK; k++ )
                if( i == 0 )
                {
                    dp[i][k][0] = 0;
                    dp[i][k][1] = -prices[i];
                }
                else
                {
                    dp[i][k][0] = Math.max( dp[i-1][k][0], dp[i-1][k][1] + prices[i] );
                    dp[i][k][1] = Math.max( dp[i-1][k][1], dp[i-1][k-1][0] - prices[i] );
                }
        return dp[n-1][maxK][0];
    }
}
```

###### 题目示例4 `leetcode 124 买卖股票的最佳时机IV`

**分析**：K = infinity,一次完整的交易至少需要两天时间，所以n天之内最多可以完成n / 2次交易，如果K > n / 2,解决方案与 K = infinity时一致，惨开 `leetcode 122 `

```java
class Solution 
{
    public int maxProfit(int k, int[] prices) 
    {
        if( prices == null || prices.length < 2 || k < 1 )
            return 0;
        int n = prices.length;
        if( k > n / 2 )
            return maxProfitWithInfiniteK( prices );
        else    
            return maxProfitWithLimitedK( k, prices );
    }

    private int maxProfitWithInfiniteK( int[] prices )
    {
        int n = prices.length;
        int dpI0 = 0, dpI1 = Integer.MIN_VALUE;
        for( int i = 0; i < n; i++ )
        {
            int temp = dpI0;
            dpI0 = Math.max( dpI0, dpI1 + prices[i] );
            dpI1 = Math.max( dpI1, temp - prices[i] );
        }
        return dpI0;
    }

    private int maxProfitWithLimitedK( int K, int[] prices )
    {
        int n = prices.length;
        int[][][] dp = new int[n][K+1][2];
        for( int i = 0; i < n; i++ )
            for( int k = 1; k <= K; k++ )
                if( i == 0 )
                {
                    dp[i][k][0] = 0;
                    dp[i][k][1] = -prices[i];
                }
                else
                {
                    dp[i][k][0] = Math.max( dp[i-1][k][0], dp[i-1][k][1] + prices[i] );
                    dp[i][k][1] = Math.max( dp[i-1][k][1], dp[i-1][k-1][0] - prices[i] );
                }
        return dp[n-1][K][0];
    }
}
```

###### 题目示例5 `leetcode 309 买卖股票的最佳时机含冷冻期`

**分析**：每次sell操作完成之后要隔一天才能进行下一次交易

```java
class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int n = prices.length;
        int preSell = 0;
        int dpI0 = 0, dpI1 = Integer.MIN_VALUE;
        for( int i = 0; i < n; i++ )
        {
            int temp = dpI0;
            dpI0 = Math.max( dpI0, dpI1 + prices[i] );
            dpI1 = Math.max( dpI1, preSell - prices[i] );
            preSell = temp;
        }
        return dpI0;
    }
}
```

###### 题目示例6 `leetcode 714 买卖股票的最佳时机含手续费`

```java
class Solution 
{
    public int maxProfit(int[] prices, int fee) 
    {
        int n = prices.length;
        int dpI0 = 0, dpI1 = Integer.MIN_VALUE;
        for( int i = 0; i < n; i++ )
        {
            int temp = dpI0;
            dpI0 = Math.max( dpI0, dpI1 + prices[i] );
            dpI1 = Math.max( dpI1, temp - prices[i] - fee );
        }
        return dpI0;
    }
}
```

#### `leetcode 打家劫舍系列问题`

##### 题目示例1 `leetcode 198 打家劫舍`

```java
// v1
/**
* dp[i] = x表示：
* 从第i间房子开始抢劫，最多能抢到的钱为 x
* base case: dp[n] = 0
*/
class Solution 
{
    public int rob(int[] nums) 
    {
        int n = nums.length;
        int[] dp = new int[n+2];
        for( int i = n - 1; i >= 0; i-- )
            dp[i] = Math.max( dp[i+1], dp[i+2] + nums[i] );
        return dp[0];
    }
}

// v2 
class Solution 
{
    public int rob(int[] nums) 
    {
        int n = nums.length;
        int dpTwo = 0, dpOne = 0;
        int dpCur = 0;
        for( int i = n - 1; i >= 0; i-- )
        {
            dpCur = Math.max( dpOne, dpTwo + nums[i] );
            dpTwo = dpOne;
            dpOne = dpCur;
        }
        return dpCur;
    }
}
```

##### 题目示例2 `leetcode 213 打家劫舍II`

```java
class Solution 
{
    public int rob(int[] nums) 
    {
        if( nums.length == 1 )
            return nums[0];
        int res1 = robInRange( nums, 0 , nums.length - 2 );
        int res2 = robInRange( nums, 1, nums.length - 1 );
        return res1 > res2 ? res1:res2;
    }

    private int robInRange( int[] nums, int start, int end )
    {
        int dpOne = 0, dpTwo = 0;
        int dpCur = 0;
        for( int i = end; i >= start; i-- )
        {
            dpCur = Math.max( dpOne, nums[i] + dpTwo );
            dpTwo = dpOne;
            dpOne = dpCur;
        }
        return dpCur;
    }
}
```

##### 题目示例2 `leetcode 337 打家劫舍III`

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution 
{
    public int rob(TreeNode root) 
    {
        int[] res = robInTree( root );
        return Math.max( res[0], res[1] );
    }

    /**
    * 返回一个大小为2的数组arr
    * arr[0]表示不抢当前root的话，得到最大钱数
    * arr[1]表示抢当前root的话，得到最大钱数
    */
    private int[] robInTree( TreeNode root )
    {
        if( root == null )
            return new int[]{ 0, 0 };
        
        int[] leftSub = robInTree( root.left );
        int[] rightSub = robInTree( root.right );

        int notRob = Math.max( leftSub[0], leftSub[1] ) + Math.max( rightSub[0], rightSub[1] );
        int rob = root.val + leftSub[0] + rightSub[0];
        return new int[]{ notRob, rob };
    }
}
```

-----

------

-------



## 算法思维

----

----

### 回溯法

**回溯算法就是在N叉树上的DFS操作，加上剪枝和状态恢复**

#### 简单的回溯法模板

```go
result := []
func backTrack( 选择列表， 路径 ) {
    if 满足结束条件 {
        result.add( 路径 )
        return
    }
    
    for 选择 in 选择列表 {
        做选择
        backTrack( 选择列表， 路径 )
        撤销选择
    }
}
```

-----

-----

#### 典型题目

##### 题型1：基本回溯问题，在数组上进行回溯搜索

###### 题目示例1 `leetcode78 子集 `

```java
List<List<Integer>> res = new LinkedList<>();
public List<List<Integer>> subsets(int[] nums) {
    if(nums == null || nums.length == 0)
        return res;
    
    backTracking(nums, 0, new LinkedList<Integer>());
    return res;
}

/**
* 回溯法找到所有子集
* @param nums 	不含重复元素的整数数组
* @param start	需要处理的子数组的起点
* @param runner 存储临时结果的链表
*/
private void backTracking(int[] nums, int start, LinkedList<Integer> runner) {
    res.add(new LinkedList(runner));
    
    for(int i = start; i < nums.length; i++) {
        // 做选择
        runner.add(nums[i]);
        // 进入下一层决策树
        backTracking(nums, i + 1, runner);
        // 撤销选择
        runner.removeLast();
    }
}
```

---

###### 题目示例2 `leetcode 90 子集II`

**简单的图示分析**

![image.png](../../../mdPics/4495584e0c52dd3f472cf5b764065a2a909ed53ac517198a8be7dd447e86a55d-image.png)

```java
List<List<Integer>> res = new LinkedList<>();
public List<List<Integer>> subsetsWithDup(int[] nums) {
    if(nums == null || nums.length == 0)
        return res;
    
    Arrays.sort(nums);
    backTracking(nums, 0 , new LinkedList<Integer>());
    return res;
}

private void backTracking(int[] nums, int start, LinkedList<Integer> runner) {
    res.add(new LinkedList(runner));
    
    for(int i = start; i < nums.length; i++) {
        /*
        * 注意：nums[i]==nums[i-1]是作用在同一层决策树上的
        * 避免出现相同的两条路径，同时有 i > start
        */
        if(i > start && nums[i] == nums[i-1])
            continue;
        // 做选择
        runner.add(nums[i]);
        // 进入下一层决策树
        backTracking(nums, i + 1, runner);
        // 撤销选择
        runner.removeLast();
    }
}
```

-----

###### 题目示例3 `leetcode 46 全排列`

```java
List<List<Integer>> res = new LinkedList<>();
public List<List<Integer>> permute(int[] nums) {
    if(nums == null || nums.length == 0)
        return res;
    
    backTracking(nums, new LinkedList<Integer>());
    return res;
}

private void backTracking(int[] nums, LinkedList<Integer> runner) {
    // 结束条件
    if(runner.size() == nums.length) {
        res.add(new LinkedList(runner));
        return;
    }
    
    for(int i = 0; i < nums.length; i++) {
        // 剪枝
        if(runner.contains(nums[i]))
            continue;
        
        // 做选择
        runner.add(nums[i]);
        // 进入下一层决策树
        backTracking(nums, runner);
        // 撤销选择
        runner.removeLast();
    }
}
```

-----

###### 题目示例4 `leetcode 47 全排列II `

```java
List<List<Integer>> res = new LinkedList<>();
public List<List<Integer>> permuteUnique(int[] nums) {
    if(nums == null || nums.length == 0)
        return res;
    
    boolean[] used = new boolean[nums.length];
    // 排序是必须的！！！！！！
    Arrays.sort(nums);
    backTracking(nums, used, new LinkedList<Integer>());
    return res;
}

private void backTracking(int[] nums, boolean[] used, LinkedList<Integer> runner) {
    if(runner.size() == nums.length) {
        res.add(new LinkedList(runner));
        return;
    }
    
    for(int i = 0; i < nums.length; i++) {
        /**
        * 在这里的一个思想是：如果当前元素存在重复元素，且其前一个元素未被使用
        * 那么在决策树的下一层就会有重复的可选项，则会出现错误的重复情况。
        * 所以剪枝条件为index > 0 && nums[i]==nums[i-1] && !used[index-1]
        */
        if(used[i] || (i > 0 && nums[i] == nums[i-1] && !used[i-1]))
            continue;
        
        // 做选择
        runner.add(nums[i]);
        used[i] = true;
        // 进入下一层决策树
        backTracking(nums, used, runner);
        // 撤销选择
        used[i] = false;
        runner.removeLast();
    }
}
```

----

###### 题目示例5 `leetcode 77 组合`

```java
List<List<Integer>> res = new LinkedList<>();
public List<List<Integer>> combine(int n, int k) {
    if(n < 1 || n < k)
        return res;
    
    backTracking(n, k, 1, new LinkedList<Integer>());
    return res;
}

private void backTracking(int n, int k, int start, LinkedList<Integer> runner) {
    if(runner.size() == k) {
        res.add(new LinkedList(runner));
        return;
    }
    
    for(int i = start; i <= n; i++) {
        // 做选择
        runner.add(i);
        // 进入下一层决策树
        backTracking(n, k, i + 1, runner);
        // 撤销选择
        runner.removeLast();
    }
}
```

-----

###### 题目示例6 `leetcode 39 组合总和`

```java
List<List<Integer>> res = new LinkedList<>();
public List<List<Integer>> combinationSum(int[] candidates, int target) {
    if(candidates == null || candidates.length == 0)
        return res;
    
    // 排序方便剪枝
    Arrays.sort(candidates);
    backTracking(candidates, target, 0, new LinkedList<Integer>());
    return res;
}

private void backTracking(int[] candidates, int target, int start, LinkedList<Integer> runner) {
    if(target == 0) {
        res.add(new LinkedList(runner));
        return;
    }
    
    // 每次搜索的起点都不比上一次搜索小，保证了不会选到同一个元素
    for(int i = start; i < candidates.length; i++) {
        if(target - candidates[i] < 0)
            break;
        
        // 做选择
        runner.add(candidates[i]);
       	// 进入下一层决策树
        backTracking(candidates, target - candidates[i], i, runner);
        // 撤销选择
        runner.removeLast();
    }
}
```

-----

###### 题目示例7 `leetcode 40 组合总和II`

```java
List<List<Integer>> res = new LinkedList<>();
public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    if(candidates == null || candidates.length == 0)
        return res;
    
    Arrays.sort(candidates);
    backTracking(candidates, target, 0, new LinkedList<Integer>());
    return res;
}

private void backTracking(int[] candidates, int target, int start, LinkedList<Integer> runner) {
    if(target == 0) {
        res.add(new LinkedList(runner));
        return;
    }
    
    for(int i = start; i < candidates.length; i++)  {
        if(target - candidates[i] < 0)
            break;
        // i > start,是个很重要的细节，思考一下这是如何实现避免
        // 重复选取元素的
        // "在一个for循环中，所有被遍历到的元素都是属于同一层级的"
        if(i > start && candidates[i] == candidates[i-1])
            continue;
        
        // 做选择
        runner.add(candidates[i]);
        // 进入下一层决策树
        backTracking(candidates, target - candidates[i], i + 1, runner);
        // 撤销选择
        runner.removeLast();
    }
}
```

----

###### 题目示例8 `leetcode 216 组合总和III`

```java
List<List<Integer>> res = new LinkedList<>();
public List<List<Integer>> combinationSum3(int k, int n) {
    if(n <= 0 || k <= 0)
        return res;
    
    backTracking(k, n, 1, new LinkedList<Integer>());
    return res;
}

private void backTracking(int k, int n, int start, LinkedList<Integer> runner) {
    // 终止条件
    if(k == 0) {
        if(n == 0)
            res.add(new LinkedList(runner));
    	return;       
    }

    
    for(int i = start; i < 10; i++) {
        // 做选择
        runner.add(i);
        // 进入下一层决策树
        backTracking(k - 1, n - i, i + 1, runner);
        // 撤销选择
        runner.removeLast();
    }
}
```

---

##### 题型2：字符串上的回溯问题

###### 题目示例1 `leetcode 131 分割回文串`

```java
List<List<String>> res = new LinkedList<>();
public List<List<String>> partition(String s) {
    backTracking(s, 0, new LinkedList<String>());
    return res;
}

private void backTracking(String s, int start, LinkedList<String> runner) {
    if(start == s.length()) {
        res.add(new LinkedList(runner));
        return;
    }
    
    for(int i = start; i < s.length(); i++) {
        if(!isPalindrome(s, start, i))
            continue;
        
        // 选择
        runner.add(s.substring(start, i + 1));
        // 进入下一层决策树
        backTracking(s, i + 1, runner);
        // 撤销选择
        runner.removeLast();
    }
}

private boolean isPalindrome(String s, int left, int right)
{
    while(left < right)
    {
        if(s.charAt(left) != s.charAt(right))
            return false;
        left++;
        right--;
    }
    return true;
}
```

----

###### 题目示例2  `leetcode 93 复原IP地址`

```java
List<String> res = new LinkedList<>();
public List<String> restoreIpAddresses(String s) {
    if(s == null || s.length() == 0)
        return res;
    
    backTracking(s, 0, new LinkedList<>());
    return res;
}

/**
* 回溯法寻找合适的分段方式
* @param	s		需要处理的字符串
* @param	pos 	当前在s中遍历到的位置
* @param	runner	已经确定好的ip段
*/
private void backTracking(String s, int pos, LinkedList<String> runner) {
     if(runner.size() == 4) {
         if(pos == s.length())
             res.add(String.join(".", runner));
         return;
     }
    
    for(int i = 1; i <= 3; i++) {
     	if(pos + i > s.length())
            break;
        
        String segment = s.substring(pos, pos + i);
        // 剪枝条件：长度大于一的分段不能以0为起始；任何段的数值结果不能大于255
        if(segment.length() > 1 && segment.startsWith("0") || ( i == 3 && Integer.parseInt(segment) > 255))
            continue;
        
        // 做选择
        runner.add(segment);
        // 进入下一层决策树
        backTracking(s, pos + i, runner);
        // 撤销选择
        runner.removeLast();
    }
}
```

------

###### 题目示例3 `leetcode 17 电话号码的字母组合`

```java
List<String> res = new LinkedList<>();
HashMap<Character, String> map = new HashMap<>(){
    {
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wyxz");
    }
};
public List<String> letterCombinations(String digits) {
    if(digits == null || digits.length() == 0)
        return res;
    
    backTracking(digits, 0, new StringBuffer());
    return res;
}

private void backTracking(String digits, int index, StringBuffer runner) {
    if(index == digits.length()) {
        res.add(runner.toString());
        return;
    }
    
    char curC = digits.charAt(index);
    String tempS = map.get(curC);
    for(char c:tempS.toCharArray()) {
        // 做选择
        runner.append(c);
        // 进入下一层决策树
        backTracking(digits, index + 1, runner);
        // 撤销选择
        runner.deleteCharAt(runner.length() - 1);
    }
}
```

-----

###### 题目示例4 `leetcode 784 字母大小写全排列`

```java
List<String> res = new LinkedList<>();
public List<String> letterCasePermutation(String S) {
    if(S == null || S.length() == 0)
        return res;

    backTracking(S, 0, S.toCharArray());
    return res;
}

private void backTracking(String S, int start, char[] charArray) {
    if(start == S.length()) {
        res.add(new String(charArray));
        return;
    }

    // 做选择（把当前字符放入路径中）
    charArray[start] = S.charAt(start);
    // 进入下一层决策树
    backTracking(S, start + 1, charArray);
    // 在当前字符为字母时创建新分支
    if(Character.isLetter(S.charAt(start))) {
        // 修改字母大小写属性，相当于回溯，这里注意理解（你只有重新回到决策树当前层才能修改）
        charArray[start] ^= (1 << 5);
        backTracking(S, start + 1, charArray);
    }
}
```

-------

###### 题目示例5 `leetcode 22 括号生成`

```java
// 这个题目有两个关键性质
// 1.一个合法的括号组合的左括号数量一定等于右括号数量
// 2.对于一个“合法”的括号字符串组合p,必然对于任何 0 <= i < p.length(),都有：子串p[0..i]中左括号的数量都大于等于右括号的数量
List<String> res = new LinkedList<>();
public List<String> generateParenthesis(int n) {
    if(n <= 0)
        return res;
    
    backTracking(n, n, new StringBuffer());
    return res;
}

private void backTracking(int left, int right, StringBuffer s) {
    // 剩下的左括号更多，说明不合法
    if(left > right)
        return;
    // 数量小于0，不合法
    if(left < 0 || right < 0)
        return;
    // 所有括号都能用完，得到一个合法的括号组合
    if(left == 0 && right == 0) {
        res.add(s.toString());
        return;
    }
    
    // 尝试放置一个左括号
    // 选择
    s.append('(');
    // 进入下一层决策树
    backTracking(left - 1, right, s);
    // 撤销选择
    s.deleteCharAt(s.length() - 1);
    
    // 尝试放置一个右括号
    // 选择
    s.append(')');
    // 进入下一层决策树
    backTracking(left, right - 1, s);
    // 撤销选择
    s.deleteCharAt(s.length() - 1);
}
```

------

##### 题型3：二维平面上的回溯问题

**其实就是DFS加上了剪枝的操作**

###### 题目示例1 `leetcode 79 单词搜索`

```java
private boolean[][] visited;
public boolean exist(char[][] board, String word) {
    if(board == null || word == null || board.length == 0 || board[0].length == 0)
        return false;

    int pathLength = 0;
    int m = board.length, n = board[0].length;
    visited = new boolean[m][n];
    for(int i = 0; i < m; i++)
        for(int j = 0; j < n; j++)
            if(backTracking(board, word, i, j, pathLength))
                return true;
    return false;
}

/**
    *@parameter board       字符二维网格
    *@parameter word        目标单词
    *@parameter row         方法当前所访问的行索引
    *@parameter col         方法当前所访问的列索引
    *@parameter pathLength  当前已经匹配的路径长度
    *@return                路径的匹配结果
    **/
private boolean backTracking(char[][] board, String word, int row, int col, int pathLength) {
    if(word.length() == pathLength)
        return true;

    boolean hasPath = false;
    if( row >= 0 && row < board.length && col >= 0 && col < board[0].length 
       && board[row][col] == word.charAt(pathLength) && !visited[row][col]) {
        // 做选择
        pathLength++;
        visited[row][col] = true;

        // 进入下一层决策树（四叉树）
        hasPath = (backTracking(board, word, row, col - 1, pathLength) 
                   || backTracking(board, word, row - 1, col, pathLength)
                   || backTracking(board, word, row, col + 1, pathLength)
                   || backTracking(board, word, row + 1, col, pathLength)
                  );

        // 撤销选择
        if(!hasPath) {
            pathLength--;
            visited[row][col] = false;
        }
    }
    return hasPath;
}
```

-----

##### 题型四：游戏问题

###### 题目示例1 `leetcode37 解数独`

```java
public void solveSudoku(char[][] board){
    backTracking( board, 0, 0 );
}

private boolean backTracking(char[][] board, int i, int j) {
    int row = 9, col = 9;
    
    // 穷举到最后一列，进入下一行重新开始
    if(j == col)
        return backTracking(board, i + 1, 0);
    
    // 找到一个可行解，触发base case
    if(i == row)
        return true;
    
    // 当前位置已经有数字，不再穷举数字
    if(board[i][j] != '.')
        return backTracking(board, i, j + 1);
    for(char c = '1'; c <= '9'; c++) {
        if(!isValid(board, i, j, c))
            continue;
        
        // 做选择
        board[i][j] = c;
        // 进入下一层决策树
        if(backTracking(board, i, j + 1))
            return true;
        // 撤销选择
        board[i][j] = '.';
    }
    return false;
}

private boolean isValid(char[][] board, int row, int col, char c) {
    for(int i = 0; i < 9; i++) {
        // 判断行是否有重复
        if(board[row][i] == c)
            return false;
        // 判断列是否有重复
        if(board[i][col] == c)	
            return false;
        // 判断3x3方框是否存在重复
        if(board[(row/3)*3 + i/3][(col/3)*3 + i%3] == c)
            return false;
    }
    return true;
}
```



----

###### 题目示例2 `leetcode 51 N皇后`

```java
List<List<String>> res = new LinkedList<>();
public List<List<String>> solveNQueens(int n) {
    if(n <= 0)
        return res;
    
    char[][] board = new char[n][n];
    for(int i = 0; i < n; i++)
        for(int j = 0; j < n; j++)
            board[i][j] = '.';
    backTracking(board, 0);
    return res;
}

private void backTracking(char[][] board, int row) {
    if(row == board.length) {
        List<String> runner = new LinkedList<>();
        for(char[] line:board)
            runner.add(new String(line));
        res.add(runner);
        return;
    }
    
    int lineLength = board[0].length;
    for(int i = 0; i < lineLength; i++) {
        if(!isValid(board, row, i))
            continue;
        
        // 做选择
        board[row][i] = 'Q';
        // 进入下一层决策树
        backTracking(board, row + 1);
        // 撤销选择
        board[row][i] = '.';
    }
}

private boolean isValid(char[][] board, int row, int col) {
    int n = board.length;
    // 检查同一列是否有冲突
    for(int i = 0; i < n; i++)
        if(board[i][col] == 'Q')
            return false;
    
    // 检查右上角是否有冲突
    for(int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++)
        if(board[i][j] == 'Q')
            return false;
    
    // 检查左上角是否有冲突
    for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
        if(board[i][j] == 'Q')
            return false;
    return true;
}
```

-----

##### 其他题目

###### 题目示例17 `leetcode 113 路径总和II`

```java
List<List<Integer>> res = new LinkedList<>();
public List<List<Integer>> pathSum(TreeNode root, int sum) {
    backTracking(root, sum, new LinkedList<Integer>());
    return res;
}

private void backTracking(TreeNode root, int sum, LinkedList<Integer> path) {
    if(root == null) {
        return;
    }

    // 做选择
    sum -= root.val;
    path.addLast(root.val);
    if(sum == 0 && root.left == null && root.right == null) {
        res.add(new LinkedList(path));
    } else {
        // 进入下一层决策树
        backTracking(root.left, sum, path);
        backTracking(root.right, sum, path);
    }
    // 撤销选择
    sum += root.val;
    path.removeLast();
}
```

----

###### 题目示例18 `leetcode 401 二进制手表`

**感觉用回溯做还更难了**

```java
private List<String> res = new LinkedList<>();
private int[] hourNum = {8, 4, 2, 1};
private int[] minuteNum = {32, 16, 8, 4, 2, 1};

public List<String> readBinaryWatch(int num) {
    if(num > 10 || num < 0)
        return res;

    for(int i = 0; i <= num; i++) {
        List<Integer> hourCombination = findCombination(hourNum, i);
        List<Integer> minuteCombination = findCombination(minuteNum, num - i);

        for(int j = 0; j < hourCombination.size(); j++) {
            if(hourCombination.get(j) > 11)
                continue;
            for(int k = 0; k < minuteCombination.size(); k++) {
                if(minuteCombination.get(k) > 59)
                    continue;
                res.add(hourCombination.get(j) + ":" + (minuteCombination.get(k) < 10?
                        "0" + minuteCombination.get(k):minuteCombination.get(k)));
            }
        }
    }
    return res;
}

private List<Integer> findCombination(int[] arr, int num) {
    LinkedList<Integer> tempRes = new LinkedList<>();
    backTracking(arr, num, 0, new LinkedList<>(), tempRes);
    return tempRes;
}

private void backTracking(int[] arr, int num, int start, LinkedList<Integer> stack, LinkedList<Integer> runner) {
    if(stack.size() == num) {
        runner.add(sum(stack));
        return;
    }
    
    for(int i = start; i < arr.length; i++) {
        // 选择
        stack.addLast(arr[i]);
        // 进入下一层决策树
        backTracking(arr, num, i + 1, stack, runner);
        // 撤销选择
        stack.removeLast();
    }
}
private Integer sum(List<Integer> pre) {
    int sum = 0;
    for (int i = 0; i < pre.size(); i++) {
        sum += pre.get(i);
    }
    return sum;
}
```

-----

###### 题目示例19 `leetcode 1079 活字印刷`

```java
public int numTilePossibilities(String tiles) {
    int[] counter = new int[26];
    for(int i = 0; i < tiles.length(); i++)
        counter[ tiles.charAt(i) - 'A' ]++;
    return backTracking(counter);
}

private int backTracking(int[] counter) {
    int result = 0;
    for(int i = 0; i < counter.length; i++) {
        if(counter[i] == 0)
            continue;

        // 做选择
        result++;
        counter[i]--;
        // 进入下一层决策树
        result += backTracking(counter);
        // 撤销选择
        counter[i]++;
    }
    return result;
}
```

------

###### 题目示例20 `leetcode 526 优美的排列`

```java
private int counter = 0;
public int countArrangement(int N) {
    boolean[] used = new boolean[N + 1];
    backTracking(N, 1, used);
    return counter;
}

private void backTracking(int N, int pos, boolean[] used) {
    if(N < pos) {
        counter++;
        return;
    }

    for(int i = 1; i <= N; i++) {
        if(!used[i] && (i % pos == 0 || pos % i == 0)) {
            // 做选择
            used[i] = true;
            // 进入下一层决策树
            backTracking(N, pos + 1, used);
            // 撤销选择
            used[i] = false;
        }
    }
}
```



------

### 双指针

------

#### 快慢指针（同向指针）

**这种双指针类型常用在链表问题中**

-----

##### 题目示例1  `leetcode 19 删除链表的倒数第N个节点`

```java
 
```

-----

题目示例

------

#### 左右指针（对撞指针）

##### 题目示例1 `leetcode 15 三数之和`

**参考题解：**https://leetcode-cn.com/problems/3sum/solution/pai-xu-shuang-zhi-zhen-zhu-xing-jie-shi-python3-by/

​					https://leetcode-cn.com/problems/3sum/solution/hua-jie-suan-fa-15-san-shu-zhi-he-by-guanpengchn/

```java
// 核心就是去重操作
public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> res = new LinkedList<>();
    if(nums == null || nums.length < 3)  {
        return res;
    }

    Arrays.sort(nums);
    int len = nums.length;
    for(int i = 0; i < nums.length; i++) {
        // 当前数字大于0，与其后两个数字相加一定大于0
        if(nums[i] > 0) {
            break;
        }
        // 当前数字与前一数字相同，跳过去重
        if(i > 0 && nums[i] == nums[i-1]) {
            continue;
        }

        int left  = i + 1;
        int right = len - 1;
        while(left < right) {
            int sum = nums[i] + nums[left] + nums[right];
            if(sum == 0) {
                res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                // 移动left和right指针去除重复元素
                while(left < right && nums[left] == nums[left+1]) {
                    left++;
                }
                while(left < right && nums[right] == nums[right - 1]) {
                    right--;
                }
                left++;
                right--;
            } else if(sum < 0) {
                left++;
            } else if(sum > 0) {
                right--;
            }
        }
    }
    return res;
}
```



----

#### 其他双指针



-----

------



### 滑动窗口技巧

#### 滑动窗口类型

##### 固定窗口：窗口的大小是固定的

**固定窗口常用于求解窗口中的特殊值**

##### 可变窗口：窗口的大小不固定

**可变窗口常用于求解满足条件的最大或者最小的窗口**

#### 简单的滑动窗口模板

##### 1、可变窗口模板

```java
private void slidingWindow(String s, String t) {
    HashMap<Character, Integer> need = new HashMap<>();
    HashMap<Character, Integer> window = new HashMap<>();
    
    for(char c: t.toCharArray())
        need.put(c, need.getOrDefault(c, 0) + 1);
    
    int left = 0, right = 0;
    int valid = 0;
    while(right < s.length()) {
        // c是移入窗口的字符
        char c = s.charAt(right);
        // 进行窗口内数据的一系列更新
        ...;
        
        /*** debug的输出位置 ***/
        System.out.println("window:[%d, %d ]", left, right);
        
        // 判断左侧窗口是否需要收缩
        while(window needs shrink) {
            // d是将被移出窗口的字符
            char d = s.charAt(left);
            // 进行窗口内数据的一系列更新
            ...;
            // 窗口左侧右移
            left++;
        }
        // 右移窗口
        right++;
    }
}
```

----

##### 2、固定窗口模板

```java

```

-----

#### 典型题目

------

##### 可变窗口题目

###### 题目示例1 `leetcode 76 最小覆盖子串`

```java
private String minWindow(String s, String t) {
    if(s == null || t == null || s.length() < t.length())
        return "";
    
    HashMap<Character, Integer> need = new HashMap<>();
    HashMap<Character, Integer> window = new HashMap<>();
    for(char c:t.toCharArray())
        need.put(c, need.getOrDefault(c, 0) + 1);
    
    int left = 0, right = 0;
    int match = 0, start = 0;
    int minLen = Integer.MAX_VALUE;
    int len = s.length();
    while(right < len) {
        char c1 = s.charAt(right);
        window.put(c1, window.getOrDefault(c1, 0) + 1);
        if(window.get(c1).equals(need.get(c1)))
            match++;
        while(match == need.size()) {
            if(right - left + 1 < minLen) {
                start = left;
                minLen = right - left + 1;
            }
            char c2 = s.charAt(left);
            if(window.get(c2).equals(need.get(c2)))
                match--;
            window.put(c2, window.get(c2) - 1);
            left++;
        }
        right++;
    }
    return minLen == Integer.MAX_VALUE? "":s.substring(start,start + minLen);
}
```

------

###### 题目示例2 `leetcode 567 字符串的排列`

```java
private boolean checkInclusion(String s1, String s2) {
    if(s1 == null || s2 == null || s2.length() < s1.length())
        return false;
    
    HashMap<Character, Integer> need = new HashMap<>();
    HashMap<Character, Integer> window = new HashMap<>();
    for(char c:s1.toCharArray())
        need.put(c, need.getOrDefault(c, 0) + 1);
    
    int left = 0, right = 0;
    int match = 0;
    int len1 = s1.length(), len2 = s2.length();
    while(right < len2) {
        char c1 = s2.charAt(right);
        window.put(c1, window.getOrDefault(c1, 0) + 1);
        if(window.get(c1).equals(need.get(c1)))
            match++;
        while((right - left + 1) >= len1) {
            if(match == need.size())
                return true;
            char c2 = s2.charAt(left);
            if(window.get(c2).equals(need.get(c2)))
                match--;
            window.put(c2, window.get(c2) - 1);
            left++;
        }
        right++;
    }
    return false;
}
```

------

###### 题目示例3 `leetcode 438 找到字符串中所有字母异位词`

```java
private List<Integer> findAnagrams(String s, String p) {
    List<Integer> res = new LinkedList<>();
    if(s == null || p == null || s.length() < p.length())
        return res;
    
    HashMap<Character, Integer> need = new HashMap<>();
    HashMap<Character, Integer> window = new HashMap<>();
    for(char c:p.toCharArray())
        need.put(c, need.getOrDefault(c, 0) + 1);
    
    int left = 0, right = 0;
    int match = 0;
    int len1 = s.length(), len2 = p.length();
    while(right < len1) {
        char c1 = s.charAt(right);
        window.put(c1, window.getOrDefault(c1, 0) + 1);
        if(window.get(c1).equals(need.get(c1)))
            match++;
        while((right - left + 1) >= len2) {
            if(match == need.size())
                res.add(left);
            char c2 = s.charAt(left);
            if(window.get(c2).equals(need.get(c2)))
                match--;
            window.put(c2, window.get(c2) - 1);
            left++;
        }
        right++;
    }
    return res;
}
```

------

###### 题目示例4 `leetcode 3 无重复字符的最长子串`

```java
private int lengthOfLongestSubstring(String s) {
    if(s == null)
        return 0;
    if(s.length() <= 1)
        return s.length();
    
    HashMap<Character, Integer> window = new HashMap<>();
    int left = 0, right = 0;
    int maxLen = Integer.MIN_VALUE;
    int len = s.length();
    while(right < len) {
        char c1 = s.charAt(right);
        window.put(c1, window.getOrDefault(c1, 0) + 1);
        while(window.get(c1) > 1) {
            char c2 = s.charAt(left);
            window.put(c2, window.get(c2) - 1);
            left++;
        }
        maxLen = Math.max(maxLen, right - left + 1);
        right++;
    }
    return maxLen;
}
```

-----

###### 题目示例5 `leetcode 209 长度最小的子数组`

```java
private int minSubArrayLen(int s, int[] nums) {
    if(nums == null || nums.length == 0 || s <= 0)
        return 0;
    
    int left = 0, right = 0;
    int curVal = 0, minLen = Integer.MAX_VALUE;
    int len = nums.length;
    while(right < len) {
        curVal += nums[right];
        while(curVal >= s) {
            minLen = Math.min(minLen, right - left + 1);
            curVal -= nums[left];
            left++;
        }
        right++;
    }
    return minLen == Integer.MAX_VALUE? 0:minLen;
}
```

-------

###### 题目示例6 `leetcode 424 替换后的最长字符串`

```java
private int characterReplacement(String s, int k) {
    if(s == null)
        return 0;
    if(s.length() <= k)
        return s.length();
    
    int left = 0, right = 0;
    int occurMost = 0, maxLen = Integer.MIN_VALUE;
    int[] window = new int[26];
    int len = s.length();
    while(right < len) {
        int index1 = s.charAt(right) - 'A';
        window[index1]++;
        occurMost = Math.max(occurMost, window[index1]);
        while((right - left + 1) > occurMost + k) {
            int index2 = s.charAt(left) - 'A';
            window[index2]--;
            left++;
        }
        maxLen = Math.max(maxLen, right - left + 1);
        right++;
    }
    return maxLen == Integer.MIN_VALUE? 0:maxLen;
}
```

-----

###### 题目示例7 `leetcode 1004 最大连续1的个数III`

```java
private int longestOnes(int[] A, int K) {
    if(A == null)
        return 0;
    if(A.length <= K)
        return A.length;
    
    int left = 0, right = 0;
    int len = A.length, maxLen = Integer.MIN_VALUE;
    int usedZero = 0;
    while(right < len) {
        if(A[right] == 0)
            usedZero++;
        while(usedZero > K) {
            if(A[left] == 0)
                usedZero--;
            left++;
        }
        maxLen = Math.max(maxLen, right - left + 1);
        right++;
    }
    return maxLen == Integer.MIN_VALUE? 0:maxLen;
}
```

-----

###### 题目示例8 `leetcode 1100 长度为K的无重复字符子串`

```java
private int numKLenSubstrNoRepeats(String S, int K) {
    if(S == null || K <= 0 || S.length() < K)
        return 0;
    int left = 0, right = 0;
    int[] window = new int[26];
    int res = 0;
    int len = S.length();
    while(right < len) {
        int index1 = S.charAt(right) - 'a';
        window[index1]++;
        while(window[index1] > 1) {
            int index2 = S.charAt(left) - 'a';
            window[index2]--;
            left++;
        }
        if((right - left + 1) == K) {
            res++;
            int index2 = S.charAt(left) - 'a';
            window[index2]--;
            left++;
        }
        right++;
    }
    return res;
}
```

-----

###### 题目示例9 `面试题17.18 最短超串`

```java
private int[] shortestSeq(int[] big, int[] small) {
    if(big == null || small == null || big.length < small.length)
        return new int[0];

    int left = 0, right = 0;
    int start = 0, minLen = Integer.MAX_VALUE;
    int match = 0;
    HashMap<Integer, Integer> need = new HashMap<>();
    HashMap<Integer, Integer> window = new HashMap<>();
    for(int item:small)
        need.put(item, need.getOrDefault(item, 0) + 1);

    int len1 = big.length;
    while(right < len1) {
        int item1 = big[right];
        window.put(item1, window.getOrDefault(item1, 0) + 1);
        if(need.containsKey(item1) && window.get(item1) == 1)
            match++;

        while(match == need.size()) {
            int item2 = big[left];
            if(right - left < minLen) {
                minLen = right - left;
                start = left;
            }
            if(need.containsKey(item2) && window.get(item2) == 1)
                match--;
            window.put(item2, window.get(item2) - 1);
            left++;
        }
        right++;
    }
    return minLen == Integer.MAX_VALUE? new int[0]:new int[]{start, start + minLen};
}
```

-----

###### 题目示例10 `leetcode 159 至多包含两个不同字符的最长子串`

```java
private int lengthOfLongestSubstringTwoDistinct(String s) {
    if(s == null)
        return 0;
    if(s.length() <= 2)
        return s.length();
    
    int left = 0, right = 0;
    int maxLen = Integer.MIN_VALUE;
    int len = s.length(), match = 0;
    HashMap<Character, Integer> window = new HashMap<>();
    while(right < len) {
        char c1 = s.charAt(right);
        if(!window.containsKey(c1) || window.get(c1) == 0)
            match++;
        window.put(c1, window.getOrDefault(c1, 0) + 1);
        while(match > 2) {
            char c2 = s.charAt(left);
            if(window.get(c2) == 1)
                match--;
            window.put(c2, window.get(c2) - 1);
            left++;
        }
        maxLen = Math.max(maxLen, right - left + 1);
        right++;
    }
    return maxLen;
}
```

-----

###### 题目示例11 `leetcode 340 至多包含K个不同字符的最长子串`

```java
private int lengthOfLongestSubstringKDistinct(String s, int k) {
    if(s == null || k <= 0)
        return 0;
    if(s.length() <= k)
        return s.length();

    int left = 0, right = 0;
    int match = 0, maxLen = Integer.MIN_VALUE;
    int len = s.length();
    HashMap<Character, Integer> window = new HashMap<>();
    while(right < len) {
        char c1 = s.charAt(right);
        if(!window.containsKey(c1) || window.get(c1) == 0)
            match++;
        window.put(c1, window.getOrDefault(c1, 0) + 1);
        while(match > k) {
            char c2 = s.charAt(left);
            if(window.get(c2) == 1)
                match--;
            window.put(c2, window.get(c2) - 1);
            left++;
        }
        maxLen = Math.max(maxLen, right - left + 1);
        right++;
    }
    return maxLen == Integer.MIN_VALUE? 0:maxLen;
}
```



-----

##### 固定窗口题目

###### 题目示例1 `leetcode 239 滑动窗口最大值`

```java
private int[] maxSlidingWindow(int[] nums, int k) {
    if(nums == null || k < 1 || nums.length < k)
        return new int[0];
    
    int len = nums.length;
    int[] res = new int[len - k + 1];
    Deque<Integer> window = new LinkedList<>();
    int index = 0;
   	for(int i = 0; i < len; i++) {
        while(!window.isEmpty() && nums[i] >= nums[window.peekLast()])
            window.pollLast();
        window.offerLast(i);
        if(i - k >= window.peekFirst())
            window.pollFirst();
        if(i >= k - 1)
            res[index++] = nums[window.peekFirst()];
    }
    return res;
}
```

------

###### 题目示例2 `leetcode 1456 定长子串中原因的最大数目`

```java
public int maxVowels(String s, int k) {
    if(s == null || s.length() <= 0 || k < 1)
        return 0;

    int curVal = 0, res = 0;
    for(int i = 0; i < s.length(); i++) {
        curVal += isVowel(s.charAt(i));
        if(i >= k)
            curVal -= isVowel(s.charAt(i - k));
        res = Math.max(res, curVal);
    }
    return res;
}

private int isVowel(char c) {
    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
        return 1;
    return 0;
}
```

----

##### 未分类题目

---

###### 题目示例6 `leetcode 904 水果成篮`

```java
private int totalFruit(int[] tree)
{
    int res = 0, len = tree.length;
    int left = 0, right = 0;
    int kindOne = tree[0], kindTwo = 0;
    
    // 树上只有一种水果的情况
    while(right < len && tree[right] == kindOne)
        right++;
    if(len == right)
        return len;
    
    // 不只有一种水果
    kindTwo = tree[right++];
    while(right < len)
    {
        // 碰到了第三种水果，先保存当前结果，并统计统计新值
        if(tree[right] != kindOne && tree[right] != kindTwo)
        {
            res = Math.max( res, right - left );
            kindOne = tree[right-1];
            kindTwo = tree[right];
            left = right - 1;
            while(tree[left-1] == kindOne)
                left--;
        }
        right++;
    }
    return Math.max(res, right - left);
}
```

---

###### 题目示例9 `leetcode 992 K个不同整数的子数组`

----

###### 题目示例11 `leetcode 1234 替换子串得到平衡字符串`

---

###### 题目示例12 `leetcode 395 至少有K个重复字符的最长子串`

---

###### 题目示例13 `leetcode 1208 尽可能使字符串相等`

----

###### 题目示例14  `leetcode 978 最长湍流子数组`

---

###### 题目示例15 `leetcode 995 K连续位的最小翻转次数`

---

###### 题目示例16 `leetcode 1040 移动石子直到连续`

---

###### 题目示例17 `leetcode 1052 爱生气的书店老板`

```java
/**
* 窗口大小固定
* 从前往后不断移动窗口，获得窗口可以包含的最大值
*/
private int maxSatisfied(int[] customers, int[] grumpy, int X)
{
    int n = customers.length;
    int res = 0;
    int window = 0, maxWindow = 0;
    
    for(int i = 0; i < customers.length; i++)
    {
        if(grumpy[i] == 0)
            res += customers[i];
        else
            window += grumpy[i] == 1? customers[i]:0;
        if(i >= X)
            window -= grumpy[i-X] == 1? customers[i-X]:0;
        maxWindow = Math.max(window, maxWindow);
    }
    return res + maxWindow;
}
```

----

###### 题目示例19 `leetcode 727 最小窗口子序列`

```java
private String minWindow(String S, String T)
{
    String minWindow = "";
    int tIndex = 0, sIndex = 0;
    int minLen = S.length();
    while(sIndex < S.length())
    {
        if(S.charAt(sIndex) == T.charAt(tIndex))
            tIndex++;
        if(tIndex == T.length())
        {
            int end = sIndex + 1;
            tIndex--;
            while(tIndex >= 0)
            {
                if(T.charAt(tIndex) == S.charAt(sIndex))
                    tIndex--;
                sIndex--;
            }
            
            if(end - sIndex + 1 < minLen)
            {
                minLen = end - sIndex + 1;
                minWindow = S.substring(sIndex + 1, end);
            }
            sIndex++;
            tIndex++;
        }
        sIndex++;
    }
}
```



-----

-----

### 前缀和技巧

#### 前缀和概念

```java
int n = nums.length;
int[] preSum = new int[n+1];
preSum[0] = 0;
for(int i = 0; i < n; i++)
    preSum[i+1] = preSum[i] + nums[i];
// preSum[i]表示nums[0..i-1]的和
// nums[i..j]的和可以表示为preSum[j+1] - preSum[i]
// 前缀和主要的实现方式是使用hashMap
```

---

#### 题目示例

##### 题目示例1 `leetcode 1 两数之和`

```java
private int[] towSum(int[] nums, int target) {
    int n = nums.length;
    HashMap<Integer, Integer> hashmap = new HashMap<>();
    
    for(int i = 0; i < n; i++) {
        int cur = nums[i];
        if(hashmap.containsKey(target - cur))
            return new int[]{hashmap.get(target - cur), i};
        hashmap.put(nums[i], i);
    }
    return new int[2];
}
```

---

##### 题目示例2 `leetcode 560 和为K的子数组`

```java
public int subarraySum(int[] nums, int k) {
    if(nums == null || nums.length == 0) {
        return 0;
    }

    /**
    * presum的key表示前缀和的值，value表示对应前缀和出现的次数
    */
    HashMap<Integer, Integer> preSum = new HashMap<>();
    preSum.put(0, 1);
    int curSum = 0;
    int res = 0;
    for(int i = 0; i < nums.length; i++) {
        curSum += nums[i];
        if(preSum.containsKey(curSum - k)) {
            res += preSum.get(curSum - k);
        }
        preSum.put(curSum, preSum.getOrDefault(curSum, 0) + 1);
    }
    return res;
}
```

----

##### 题目示例3 `leetcode 1248 统计优美子数组`

```java
/*
* 使用了前缀和数组preSum[],下标(key)是前缀和（即到当前元素为止奇数的个数），值(value)是前缀和的个数 
* 还是要好好理解
*/
private int numberOfSubArrays(int[] nums, int k) {
    int n = nums.length;
    int[] preSum = new int[n+1];
    preSum[0] = 1;
    int res = 0, curSum = 0;
    
    for(int num:nums) {
        curSum += num & 1;
        preSum[curSum]++;
        if(curSum >= k)
            res += preSum[curSum-k];
    }
    return res;
}
```

----

##### 题目示例4 `leetcode 974 和可被K整除的子数组`

参考题解：https://leetcode-cn.com/problems/subarray-sums-divisible-by-k/solution/you-jian-qian-zhui-he-na-jiu-zai-ci-dai-ni-da-tong/

```java
/**
* 步骤：
* 1.根据当前的(preSum mod K)的值，在哈希表中找到与之相等的key,并得到相应的value,
*	该value表示满足条件的历史(preSum mod K)出现的次数，也代表当前preSum能找到的
* 	历史前缀和，与之形成value个不同形式的子数组，满足子数组元素和能被K整除
* 2.遍历数组A的每一项，重复步骤1，统计累计结果到res,最终返回res
*/
private int subarrayDivByK(int[] A, int K) {
    int[] preSum = new int[K];
    preSum[0] = 1;
    int curSumModK = 0;
    int res = 0;
    
    for(int i = 0; i < A.length; i++) {
    	curSumModK = (curSumModK + A[i]) % K;
        if(curSumModK < 0)
            curSumModK += K;
        res += preSum[curSumModK];
        preSum[curSumModK]++;
    }
    return res;
}
```

---

##### 题目示例5 `leetcode 1074 元素和为目标值的子矩阵数量`

```java
private int numSubmatrixSumTarget(int[][] matrix, int target)
{
    int n = matrix.length;
    int m = matrix[0].length;
    // 计算原矩阵每一行的前缀和
    for(int i = 0; i < n; i++)
        for(int j = 1; j < m; j++)
            matrix[i][j] += matrix[i][j-1];
    
    int res = 0;
    for(int i = 0; i < m; i++)
    {
        for(int j = i; j < m; j++)
        {
            // 在列方向上计算前缀和
            HashMap<Integer, Integer> preSum = new HashMap<>();
            preSum.put(0, 1);
            int curSum = 0;
            for(int k = 0; k < n; k++)
            {
                curSum += matrix[k][j] - (i > 0 ? matrix[k][i-1]:0);
                res += preSum.getOrDefault(curSum - target, 0);
                preSum.put(curSum, preSum.getOrDefault(curSum, 0) + 1);
            }
        }
    }
    return res;
}
```

---

##### 题目示例6 `leetcode 930 和相同的二元子数组`

```java
private int numSubarraysWithSum(int[] A, int S)
{
    if(A == null || A.length == 0)
        return 0;
    
    int res = 0, curSum = 0;
    HashMap<Integer, Integer> preSum = new HashMap<>();
    preSum.put(0, 1);
    for(int a:A)
    {
        curSum += a;
        if( preSum.containsKey(curSum - S))
            res += preSum.get(curSum - S);
        preSum.put(curSum, preSum.getOrDefault(curSum, 0) + 1);
    }
    return res;
}
```

---

##### 题目示例7 `leetcode 303 区域和检索-数组不可变`

```java
private int[] preSum;
public NumArray(int[] nums)
{
    this.preSum = new int[nums.length+1];
    for(int i = 0; i < nums.length; i++)
        preSum[i+1] = preSum[i] + nums[i];
}

public int sumRange(int i, int j)
{
    return preSum[j+1] - preSum[i];
}
```

---

##### 题目示例8 `leetcode 304二维区域和检索-矩阵不可变`

```java
private int[][] preSum;
public NumMatrix(int[][] matrix) 
{
    if( matrix == null || matrix.length == 0 || matrix[0].length == 0 )
		return;
    int n = matrix.length;
    int m = matrix[0].length;
    preSum = new int[n+1][m+1];
    // 求行前缀和
    for( int i = 1; i <= n; i++ )
        for( int j = 1; j <= m; j++ )
            preSum[i][j] = preSum[i][j-1] + matrix[i-1][j-1];
    // 求列前缀和
    // 注意：在完成列前缀和的计算之后，preSum[i][j]的值代表的是[0,0]、[i,j]
    // 为边界的矩阵的区域元素和
    for( int i = 1; i <= m; i++ )
        for( int j = 1; j <= n; j++ )
            preSum[j][i] += preSum[j-1][i];
    /**
    * 求前缀和的部分也可以写成下面的部分：
    * for( int i = 1; i <= n; i++ )
    *	for( int j = 1; j <= m; j++ )
    *		preSum[i][j] = matrix[i-1][j-1] + preSum[i-1][j] + preSum[i][j-1] -preSum[i-1][j-1]
    */
}
public int sumRegion(int row1, int col1, int row2, int col2) 
{
	if( preSum == null || preSum[0].length == 0 )
        return
    return preSum[row2+1][col2+1] - preSum[row2+1][col1] - preSum[row1][col2+1] + preSum[row1][col1];
}
```

---

##### 题目示例9 `leetcode 307 区域和检索-数组可修改`

```java
private int[] preSum;
public NumArray(int[] nums) 
{
	if(nums == null || nums.length == 0)
        return;
    preSum = new int[nums.length+1];
    for(int i = 0; i < nums.length; i++)
        preSum[i+1] = preSum[i] + nums[i];
}

public void update(int i, int val)
{
	int oldVal = preSum[i+1] - preSum[i];
    int diff = val - oldVal;
    for(int j = i + 1; j < preSum.length; j++)
        preSum[j] += diff;
}

public int sumRange(int i, int j) 
{
	return preSum[j+1] - preSum[i];
}
```

----

##### 题目示例10 `leetcode 554砖墙`

```java
private int leastBricks(List<List<Integer>> wall)
{
    HashMap<Integer, Integer> preSum = new HashMap<>();
    for(List<Integer> row:wall)
    {
        int sum = 0;
        for(int i = 0; i < row.size() - 1; i++)
        {
            sum += row.get(i);
            preSum.put(sum, preSum.getOrDefault( sum, 0 ) + 1);
        }
    }
    
    int res = wall.size();
    int size = wall.size();
    for(int key:preSum.keySet())
        res = Math.min(res, size - preSum.get(key));
    return res;
}
```

---

##### 题目示例11 `leetcode 1124 表现良好的最长时间段`

```java
private int longestWPI(int[] hours)
{
    // 计算前缀和
    int[] preSum = new int[hours.length+1];
    for(int i = 0; i < hours.length; i++)
    {
        if(housr[i] > 8)	
            preSum[i+1] = preSum[i] + 1;
        else			   
            preSum[i+1] = preSum[i] - 1;
    }
    
    // 构建单调递减栈
    Deque<Integer> stack = new LinkedList<>();
    stack.addLast(0);
    for(int i = 1; i < preSum.length; i++)
        if(preSum[i] < preSum[stack.peekLast()])
            stack.addLast(i);
    
    // 从右向左利用贪心策略求最大跨度
    int maxL = 0;
    for(int i = preSum.length - 1; i >= 0; i--)
    	while(!stack.isEmpty() && preSum[i] > preSum[stack.peekLast()])
            maxL = Math.max(maxL, i - stack.removeLast());
    return maxL;
}
```

---

##### 题目示例12  `leetcode 1109 航班预定`

```java
private int[] corpFlightBookings(int[][] bookings, int n)
{
    int len = bookings.length;
    int[] res = new int[n];
    int left, right, seats;
    for(int i = 0; i < len; i++)
    {
        left = bookings[i][0] - 1;
        right = bookings[i][0] - 1;
        seats = bookings[i][2];
        
        res[left] += seats;
        if(r < n - 1)	res[r+1] -= seats;
    }
    
    // 计算前缀和
    for(int i = 1; i < n; i++)
        res[i] += res[i-1];
    return res;
}
```

---

##### 题目示例13 `leetcode 1094 拼车`

```java
private boolean carPooling(int[][] trips, int capacity)
{
    int[] counts = new int[1000+1];
    for(int[] trip:trips)
    {
        counts[trip[1]] += trip[0];
        counts[trip[2]] -= trip[0];
    }
    
    if(counts[0] > capacity)
        return false;
    for(int i = 1; i < 1001; i++)
    {
        counts[i] += counts[i-1];
        if(counts[i] > capacity)
            return false;
    }
    return true;
}
```

----

-----

### 循环不变量

**算是一个稍微有点冷门的算法思想，最重要的部分是确定算法流程中的循环不变量**

**循环不变量帮助规范化算法流程**

#### 典型题目

##### 题目示例1 `leetcode 283 移动零`

```java
private void moveZeros(int[] nums) {
    /**
    * 循环不变量：
    * [0, j)都为非0
    * [j, len)都为0
    * j表示下一个非零元素的位置
    */
    int j = 0; 
    for(int i = 0; i < nums.length; j++) {
        if(nums[i] != 0) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
```

-----

##### 题目示例2 `剑指offer 21 调整数组顺序使奇数位于偶数的前面`

```java
private int[] exchange(int[] nums) {
    /**
        * 循环不变量：
        * [0, mark)为奇数元素
        */
    int mark = 0;
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] % 2 != 0) {
            int temp = nums[i];
            nums[i] = nums[mark];
            nums[mark] = temp;
            mark++;
        }
    }
    return nums;
}
```



-----

-----

## `leetcode` 未归纳题解（按tag分类）

### 跳跃游戏系列

#### 题目1 `leetcode 55 跳跃游戏`

参考题解：https://leetcode-cn.com/problems/jump-game/solution/55-by-ikaruga/

```java
/**
* 如果某一个作为起跳点的格子可以跳跃的距离是3，那么表示后面3个格子都可以作为起跳点。
* 可以对每一个能作为起跳点的格子都尝试跳一次，把能跳到最远的距离不断更新。
* 如果可以一直跳到最后，就成功了
*/
public boolean canJump(int[] nums) {
    // maxDis表示现在能跳到的最远位置
    int maxDis = 0;
    for(int i = 0; i < nums.length; i++) {
        if(i > maxDis) {
            return false;
        }
        maxDis = Math.max(maxDis, i + nums[i]);
    }
    return true;
}
```



-----

### 数学

#### 题目1 `leetcode 7 整数反转`

参考题解：https://leetcode-cn.com/problems/reverse-integer/solution/hua-jie-suan-fa-7-zheng-shu-fan-zhuan-by-guanpengc/

```java
private int reverse(int x) {
    int res = 0;
    while(x != 0) {
        // 获取最低位数字
        int pop = x % 10;
        if(res > Integer.MAX_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && pop > 7)) {
            return 0;
        } else if(res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE && pop < -8)) {
            return 0;
        }
        res = res * 10 + pop;
        x /= 10;
    }
    return res;
}
```



-----

### 字符串

#### 题目1 `leetcode 字符串转换整数(atoi)`

```java
private int myAtoi(String str) {
    // 边界条件特判
    if(str == null || str.length() <= 0) {
        return 0;
    }
    // 正负数的最大最小值
    int max = Integer.MAX_VALUE, min = Integer.MIN_VALUE;
    int res = 0, index = 0;
    // 去掉前导空格
    while(index < str.length() && str.charAt(index) == ' ') {
        index++;
    }
    if(index == str.length()) {
        return 0;
    }
    
    // 取正负号
    char label = str.charAt(index);
    boolean positive = true;
    if(!Character.isDigit(label)) {
        if(label != '-' && label != '+') {
            return 0;
        }
        index++;
        positive = label != '-';
    }
    // 用负数保存正负数边界，确保不会溢出
    int limit = positive? -max:min;
    // 过滤掉前置0
    while(index < str.length() && str.charAt(index) == '0') {
        index++;
    }
    // 取每一位，在非字符截止
    while(index < str.length() && Character.isDigit(str.charAt(index))) {
        int digit = str.charAt(index) - '0';
        index++;
        // 超过边界，返回32位整数的最大值
        if(res < (limit + digit) / 10) {
            return positive? max:min;
        }
        // 计算当前数值,在这里使用的是减法，所以在
        // 整个计算过程中，res的值都为负数
        res = res * 10 - digit;
    }
    return positive? -res:res;
}
```



------

### 数组



-----

-----

### 排序

#### 题目1 `leetcode 179 最大数`

```java
/*官方题解*/
private String largestNumber(int[] nums) {
    String[] asStrs = new String[nums.length];
    for(int i = 0; i < nums.length; i++) {
        asStrs[i] = String.valueOf(nums[i]);
    }
    
    /*关键就是确定一个排序规则, 重写比较器*/
    Arrays.sort(asStrs, new Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            String order1 = s1 + s2;
            String order2 = s2 + s1;
            return order2.compareTo(order1);
        }
    });
    
    if(asStrs[0].equals("0")) {
        return "0";
    }
    
    StringBuffer sb = new StringBuffer();
    for(String s:asStrs) {
        sb.append(s);
    }
    return sb.toString();
}
```



------

------

### 设计

#### 题目1 `leetcode 146 LRU缓存机制`

```java
class LRUCache {
    // 内部类,双向链表结点
    private class LinkedListNode {
        public LinkedListNode next, pre;
        public int key;
        public int val;
        public LinkedListNode(int key, int val) {
            this.key = key;
            this.val = val;
            this.pre = null;
            this.next = null;
        }
    }

    // 字段
    private int capacity;
    private HashMap<Integer, LinkedListNode> map;
    private LinkedListNode listHead;
    private LinkedListNode listTail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.listHead = new LinkedListNode(-1, -1); // 哑头结点
        this.listTail = new LinkedListNode(-1, -1); // 哑尾结点
        listHead.next = listTail;
        listTail.pre = listHead;
    }
    
    public int get(int key) {
        if(!map.containsKey(key))
            return -1;
        // 先把查找到的节点从链表中删除，之后放到尾部（头、尾可以自己决定）
        // map中的映射可以不用删除
        LinkedListNode node = map.get(key);
        node.next.pre = node.pre;
        node.pre.next = node.next;
        moveToTail(node);

        return node.val;
    }
    
    public void put(int key, int val) {
        // 直接调用get方法，如果键已经存在，对应节点会被移动到链表尾部，再直接更新value即可
        if(this.get(key) != -1) {
            map.get(key).val = val;
            return;
        }

        // 创建对应的新节点
        LinkedListNode node = new LinkedListNode(key, val);
        // 现在map中加入相应的映射
        map.put(key, node);
        // 更新链表，将新节点设置为 recently used
        moveToTail(node);

        // 如果超出容量，删除双链表头结点,同时删除map中的映射
        if(map.size() > capacity) {
            map.remove(listHead.next.key);
            listHead.next = listHead.next.next;
            listHead.next.pre = listHead;
        }
    }

    private void moveToTail(LinkedListNode node) {
        node.pre = listTail.pre;
        listTail.pre = node;
        node.pre.next = node;
        node.next = listTail;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
```

-----

#### 题目2 `leetcode 1206 设计跳表（未完成，感觉机制有点复杂）`

```java
class Skiplist {   
    private Node head;
    
    public Skiplist() {
		this.head = new Node(0, null, null);
    }
    
    public boolean search(int target) {
		for(Node node = head; node != null; node = node.down) {
            while(node.right != null && node.right.val < target) {
                node = node.right;
            }
            if(node.right != null && node.right.val == target)
                return true;
        }
    }
    
    Random rand = new Random();
    Node[] stack = new Node[64];
    public void add(int num) {
        int level = -1;
        // 这个循环会插入位置之前的节点的所有层指针都保存到stack数组中
        for(Node node = head; node != null; node = node.down) {
            while(node.right != null && node.right.val < num) {
                node = node.right;
            }
            stack[++level] = node;
        }
        
        boolean insertUp = true;
        Node downNode = null;
        while(insertUp && level >= 0) {
            Node insert = stack[level--];
            insert.right = new Node(num, insert.right, down);
            downNode = insert.right;
            insertUp = (rand.nextInt() & 1) == 0;
        }
        if(insertUp) {
            head = new Node(new Node(null, downNode, num), head, 0);
        }
    }
    
    public boolean erase(int num) {

    }
    
    static class Node {
        int val;
        Node right, down;

        public Node(int val, Node right, Node down) {
            this.val = val;
            this.right = right;
            this.down = down;
        }
    }
}

/**
 * Your Skiplist object will be instantiated and called as such:
 * Skiplist obj = new Skiplist();
 * boolean param_1 = obj.search(target);
 * obj.add(num);
 * boolean param_3 = obj.erase(num);
 */
```

