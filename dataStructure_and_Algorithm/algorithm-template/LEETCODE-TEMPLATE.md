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
      - [题目示例3 `leetcode 124:二叉树中的最大路径和`](#题目示例3-leetcode-124二叉树中的最大路径和)
      - [题目示例4  `leetcode 236 二叉树的最近公共祖先`](#题目示例4--leetcode-236-二叉树的最近公共祖先)
      - [题目示例5 `leetcode 543 二叉树的直径`](#题目示例5-leetcode-543-二叉树的直径)
      - [题目示例6 `leetcode 226 翻转二叉树`](#题目示例6-leetcode-226-翻转二叉树)
      - [题目示例7 `leetcode 617 合并二叉树`](#题目示例7-leetcode-617-合并二叉树)
      - [题目示例8  `leetcode 112 路径总和`](#题目示例8--leetcode-112-路径总和)
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
      - [题目示例20 `leetcode 102 二叉树的层序遍历`](#题目示例20-leetcode-102-二叉树的层序遍历)
      - [题目示例21 `leetcode 107 二叉树的层次遍历II`](#题目示例21-leetcode-107-二叉树的层次遍历ii)
      - [题目示例22`leetcode 103 二叉树的锯齿形层次遍历`](#题目示例22leetcode-103-二叉树的锯齿形层次遍历)
      - [题目示例23 `leetcode 114 二叉树展开为链表`](#题目示例23-leetcode-114-二叉树展开为链表)
      - [题目示例24 `leetcode 222 完全二叉树的节点个数`](#题目示例24-leetcode-222-完全二叉树的节点个数)
      - [题目示例25 `leetcode 958 二叉树的完全性检验`](#题目示例25-leetcode-958-二叉树的完全性检验)
      - [题目示例26 `leetcode 1325 删除给定值的叶子结点`](#题目示例26-leetcode-1325-删除给定值的叶子结点)
      - [题目示例27 `leetcode 662 二叉树最大宽度`](#题目示例27-leetcode-662-二叉树最大宽度)
      - [题目示例28  `leetcode 113 路径总和II`](#题目示例28--leetcode-113-路径总和ii)
      - [题目示例29  `leetcode 156 上下翻转二叉树`](#题目示例29--leetcode-156-上下翻转二叉树)
      - [题目示例30 `leetcode 654 最大二叉树`](#题目示例30-leetcode-654-最大二叉树)
      - [题目示例31 `leetcode 100 相同的树`](#题目示例31-leetcode-100-相同的树)
      - [题目示例32 `leetcode 129 求根到叶子节点数字之和`](#题目示例32-leetcode-129-求根到叶子节点数字之和)
    - [二叉搜索树](#二叉搜索树)
      - [题目示例1 `leetcode 98 验证二叉搜索树`](#题目示例1-leetcode-98-验证二叉搜索树)
      - [题目示例2 `leetcode  701  二叉搜索树中的插入操作`](#题目示例2-leetcode--701--二叉搜索树中的插入操作)
      - [题目示例3 `leetcode 450 删除二叉搜索树 `](#题目示例3-leetcode-450-删除二叉搜索树-)
      - [题目示例4 `leetcode 669 修剪二叉搜索树`](#题目示例4-leetcode-669-修剪二叉搜索树)
      - [题目示例5 `leetcode 230 二叉搜索树中第K小的元素`](#题目示例5-leetcode-230-二叉搜索树中第k小的元素)
      - [题目示例6 `leetcode 538 把二叉搜索树转换为累加树`](#题目示例6-leetcode-538-把二叉搜索树转换为累加树)
      - [题目示例7 `leetcode 235 二叉查找树的最近公共祖先`](#题目示例7-leetcode-235-二叉查找树的最近公共祖先)
      - [题目示例8 `leetcode 108 将有序数组转换为二叉搜索树`](#题目示例8-leetcode-108-将有序数组转换为二叉搜索树)
      - [题目示例9 `leetcode 109 有序链表转换二叉搜索树`](#题目示例9-leetcode-109-有序链表转换二叉搜索树)
      - [题目示例10 `leetcode 653 两数之和IV 输入BST`](#题目示例10-leetcode-653-两数之和iv-输入bst)
      - [题目示例 11 `leetcode 530 二叉搜索树的最小绝对差`](#题目示例-11-leetcode-530-二叉搜索树的最小绝对差)
      - [题目示例12 `leetcode 333  最大BST子树`](#题目示例12-leetcode-333--最大bst子树)
      - [题目示例13 `leetcode 776 拆分二叉搜索树`](#题目示例13-leetcode-776-拆分二叉搜索树)
      - [题目示例14 `leetcode 1214 查找两棵二叉搜索树之和`](#题目示例14-leetcode-1214-查找两棵二叉搜索树之和)
      - [题目示例15 `leetcode 285 二叉搜索树中的顺序后继`](#题目示例15-leetcode-285-二叉搜索树中的顺序后继)
      - [题目示例16 `leetcode 510 二叉搜索树中的中序后继`](#题目示例16-leetcode-510-二叉搜索树中的中序后继)
      - [题目示例17  `leetcode 426 将二叉搜索树转化为排序的双向链表`](#题目示例17--leetcode-426-将二叉搜索树转化为排序的双向链表)
      - [题目示例18 `leetcode 99 恢复二叉搜索树`](#题目示例18-leetcode-99-恢复二叉搜索树)
    - [序列化和反序列化](#序列化和反序列化)
      - [题目1 `leetcode 297 二叉树的序列化与反序列化`](#题目1-leetcode-297-二叉树的序列化与反序列化)
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
        - [题目示例12 `leetcode 445 两数相加II`](#题目示例12-leetcode-445-两数相加ii)
      - [反转类题目](#反转类题目)
        - [题目示例1 `leetcode 206 反转链表`](#题目示例1-leetcode-206-反转链表)
        - [题目示例2 `leetcode 92 反转链表II`](#题目示例2-leetcode-92-反转链表ii)
        - [题目示例3 `leetcode 25 K个一组翻转链表`](#题目示例3-leetcode-25-k个一组翻转链表)
      - [链表中的双指针问题](#链表中的双指针问题)
        - [题目示例1  `leetcode 19 删除链表的倒数第N个节点`](#题目示例1--leetcode-19-删除链表的倒数第n个节点)
        - [题目示例 2 `leetcode 83 删除排序链表中的重复元素`](#题目示例-2-leetcode-83-删除排序链表中的重复元素)
        - [题目示例3  `leetcode 82 删除排序链表中的重复元素II`](#题目示例3--leetcode-82-删除排序链表中的重复元素ii)
        - [题目示例4 `leetcode 141 环形链表`](#题目示例4-leetcode-141-环形链表)
        - [题目示例5  `leetcode 142 环形链表II`](#题目示例5--leetcode-142-环形链表ii)
        - [题目示例6 `leetcode 234 回文链表`](#题目示例6-leetcode-234-回文链表)
        - [题目示例7 `leetcode 328 奇偶链表`](#题目示例7-leetcode-328-奇偶链表)
        - [题目示例8 `剑指offer 22 链表中倒数第k个结点`](#题目示例8-剑指offer-22-链表中倒数第k个结点)
        - [题目示例9 `leetcode 876 链表的中间节点`](#题目示例9-leetcode-876-链表的中间节点)
      - [其他题目](#其他题目)
        - [题目示例11 `leetcode 138 复制带随机指针的链表`](#题目示例11-leetcode-138-复制带随机指针的链表)
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
      - [题目示例5 `leetcode 32 最长有效括号`](#题目示例5-leetcode-32-最长有效括号)
      - [题目示例6 `leetcode 71 简化路径`](#题目示例6-leetcode-71-简化路径)
      - [题目示例7 `leetcode 225 用队列实现栈`](#题目示例7-leetcode-225-用队列实现栈)
      - [题目示例8  `leetcode 232  用栈实现队列`](#题目示例8--leetcode-232--用栈实现队列)
    - [队列](#队列)
      - [题目示例1 `leetcode 622 设计循环队列`](#题目示例1-leetcode-622-设计循环队列)
      - [题目示例2 `leetcode 641 设计循环双端队列`](#题目示例2-leetcode-641-设计循环双端队列)
    - [栈和队列的特殊应用1：单调栈/单调队列](#栈和队列的特殊应用1单调栈单调队列)
      - [概念](#概念)
        - [单调栈：](#单调栈)
        - [单调队列：](#单调队列)
      - [单调栈典型题目](#单调栈典型题目)
        - [题目示例 1 `leetcode 496 下一个更大元素I`](#题目示例-1-leetcode-496-下一个更大元素i)
        - [题目示例2 `leetcode 503 下一个更大元素II`](#题目示例2-leetcode-503-下一个更大元素ii)
        - [题目示例3 `leetcode 739 每日温度`](#题目示例3-leetcode-739-每日温度)
        - [题目示例 4`leetcode 962 最大宽度坡`](#题目示例-4leetcode-962-最大宽度坡)
        - [题目示例5 `leetcode 42 接雨水`](#题目示例5-leetcode-42-接雨水)
        - [题目示例 6 `leetcode 84 柱状图中最大的矩形`](#题目示例-6-leetcode-84-柱状图中最大的矩形)
        - [题目示例7 `leetcode 85 最大矩形 `](#题目示例7-leetcode-85-最大矩形-)
        - [题目示例8 `leetcode 402 移掉K位数字`](#题目示例8-leetcode-402-移掉k位数字)
        - [题目示例9 `leetcode 768 最多能完成排序的块II`](#题目示例9-leetcode-768-最多能完成排序的块ii)
        - [题目示例10 `leetcode 901 股票价格跨度`](#题目示例10-leetcode-901-股票价格跨度)
        - [题目示例11 `leetcode 1019 链表的下一个更大结点`](#题目示例11-leetcode-1019-链表的下一个更大结点)
        - [题目示例12 `leetcode 1124 表现良好的最长时间段`](#题目示例12-leetcode-1124-表现良好的最长时间段)
        - [题目示例14`leetcode 132模式`](#题目示例14leetcode-132模式)
        - [题目示例15 `leetcode 316 去除重复字母`](#题目示例15-leetcode-316-去除重复字母)
      - [单调队列典型题目](#单调队列典型题目)
        - [题目示例1 `leetcode 239 滑动窗口最大值`](#题目示例1-leetcode-239-滑动窗口最大值)
  - [并查集](#并查集)
    - [概念](#概念-1)
      - [1、基础并查集代码](#1基础并查集代码)
    - [典型题目](#典型题目)
      - [基础题目](#基础题目)
        - [题目示例1 `leetcode 547 省份数量`](#题目示例1-leetcode-547-省份数量)
        - [题目示例2 `leetcode 323 无向图中连通分量的个数`](#题目示例2-leetcode-323-无向图中连通分量的个数)
        - [题目示例3 `leetcode 261 以图判树`](#题目示例3-leetcode-261-以图判树)
        - [题目示例4 `leetcode 1319 连通网络的操作次数`](#题目示例4-leetcode-1319-连通网络的操作次数)
        - [题目示例5 `leetcode 684 冗余连接`](#题目示例5-leetcode-684-冗余连接)
        - [题目示例6 `leetcode 990 等式方程的可满足性`](#题目示例6-leetcode-990-等式方程的可满足性)
      - [带权值的并查集问题](#带权值的并查集问题)
        - [题目示例1 `leetcode 128 最长连续序列`](#题目示例1-leetcode-128-最长连续序列)
        - [题目示例2 `leetcode 945 使数组唯一的最小增量`](#题目示例2-leetcode-945-使数组唯一的最小增量)
  - [堆/优先队列](#堆优先队列)
    - [典型题目](#典型题目-1)
      - [题目示例1 `leetcode 692 前K个高频单词`](#题目示例1-leetcode-692-前k个高频单词)
      - [题目示例2 `leetcode 253 会议室II`](#题目示例2-leetcode-253-会议室ii)
      - [题目示例3 `leetcode 23 合并升序链表`](#题目示例3-leetcode-23-合并升序链表)
      - [题目示例4 `leetcode 215 数组中的第K个最大元素`](#题目示例4-leetcode-215-数组中的第k个最大元素)
      - [题目示例5 `leetcode 295 数据流的中位数`](#题目示例5-leetcode-295-数据流的中位数)
      - [题目示例6 `leetcode 347 前K个高频元素`](#题目示例6-leetcode-347-前k个高频元素)
      - [题目示例7 `leetcode 703 数据流中的第k大元素`](#题目示例7-leetcode-703-数据流中的第k大元素)
      - [题目示例8 `leetcode 973 离原点最近的K个点`](#题目示例8-leetcode-973-离原点最近的k个点)
- [基础算法](#基础算法)
  - [深度优先搜索](#深度优先搜索)
    - [概念](#概念-2)
      - [1、沉岛思想](#1沉岛思想)
    - [典型题目](#典型题目-2)
      - [题目示例1 `leetcode 200 岛屿数量`](#题目示例1-leetcode-200-岛屿数量)
      - [题目示例2  `leetcode 733 图像渲染`](#题目示例2--leetcode-733-图像渲染)
      - [题目示例3 `剑指offer 13 机器人的运动范围`](#题目示例3-剑指offer-13-机器人的运动范围)
      - [题目示例4 `leetcode 695 岛屿的最大面积`](#题目示例4-leetcode-695-岛屿的最大面积)
      - [题目示例5 `leetcode 1254 统计封闭岛屿的数目`](#题目示例5-leetcode-1254-统计封闭岛屿的数目)
      - [题目示例6 `leetcode 130 被围绕的区域`](#题目示例6-leetcode-130-被围绕的区域)
      - [题目示例7 `leetcode 417 太平洋大西洋水流问题`](#题目示例7-leetcode-417-太平洋大西洋水流问题)
      - [题目示例8 `leetcode 329 矩阵中的最长递增路径`](#题目示例8-leetcode-329-矩阵中的最长递增路径)
      - [题目示例9 `leetcode 199 二叉树的右视图`](#题目示例9-leetcode-199-二叉树的右视图)
      - [题目示例10 `leetcode 257 二叉树的所有路径`](#题目示例10-leetcode-257-二叉树的所有路径)
      - [题目示例11 `面试题 16.19 水域大小`](#题目示例11-面试题-1619-水域大小)
      - [题目示例12 `leetcode 463 岛屿的周长`](#题目示例12-leetcode-463-岛屿的周长)
  - [二分搜索](#二分搜索)
    - [二分搜索讲解](#二分搜索讲解)
      - [零、二分查找框架](#零二分查找框架)
      - [一、寻找一个数（基本的二分搜索）](#一寻找一个数基本的二分搜索)
      - [二、寻找左侧边界的二分搜索](#二寻找左侧边界的二分搜索)
      - [三、寻找右侧边界的二分查找](#三寻找右侧边界的二分查找)
      - [四、建议](#四建议)
    - [典型题目](#典型题目-3)
      - [题型1：二分求满足条件的元素下标/元素值](#题型1二分求满足条件的元素下标元素值)
        - [题目示例1 `leetcode 4 寻找两个有序数组的中位数`](#题目示例1-leetcode-4-寻找两个有序数组的中位数)
        - [题目示例2 `leetcode 33 搜索旋转排序数组`](#题目示例2-leetcode-33-搜索旋转排序数组)
        - [题目示例3 `leetcode 34 在排序数组中查找元素的第一个和最后一个位置`](#题目示例3-leetcode-34-在排序数组中查找元素的第一个和最后一个位置)
        - [题目示例4 `leetcode 35 搜索插入位置`](#题目示例4-leetcode-35-搜索插入位置)
        - [题目示例5 `leetcode 74 搜索二维矩阵`](#题目示例5-leetcode-74-搜索二维矩阵)
        - [题目示例6 `leetcode 81 搜索旋转排序数组II`](#题目示例6-leetcode-81-搜索旋转排序数组ii)
        - [题目示例7  `leetcode 153 寻找旋转排序数组中的最小值`](#题目示例7--leetcode-153-寻找旋转排序数组中的最小值)
        - [题目示例8 `leetcode 154 寻找旋转排序数组中的最小值II`](#题目示例8-leetcode-154-寻找旋转排序数组中的最小值ii)
        - [题目示例9 `leetcode 162 寻找峰值`](#题目示例9-leetcode-162-寻找峰值)
        - [题目示例10 `leetcode 275 H指数II`](#题目示例10-leetcode-275-h指数ii)
        - [题目示例11 `leetcode 278 第一个错误的版本`](#题目示例11-leetcode-278-第一个错误的版本)
        - [题目示例12 `leetcode 378 有序矩阵中第k小的元素`](#题目示例12-leetcode-378-有序矩阵中第k小的元素)
        - [题目示例13 `leetcode 436 寻找右区间`](#题目示例13-leetcode-436-寻找右区间)
        - [题目示例14 `leetcode 611 有效三角形的个数`](#题目示例14-leetcode-611-有效三角形的个数)
        - [题目示例15 `leetcode 658 找到k个最接近的元素`](#题目示例15-leetcode-658-找到k个最接近的元素)
        - [题目示例16 `leetcode 704 二分查找`](#题目示例16-leetcode-704-二分查找)
        - [题目示例17 `leetcode 744 寻找比目标字母大的最小字母`](#题目示例17-leetcode-744-寻找比目标字母大的最小字母)
        - [题目示例18 `leetcode 911 在线选举`](#题目示例18-leetcode-911-在线选举)
        - [题目示例19  `leetcode 1095 山脉数组中查找目标值`](#题目示例19--leetcode-1095-山脉数组中查找目标值)
      - [题型二： 二分确定一个有范围的整数](#题型二-二分确定一个有范围的整数)
        - [题目示例1 `leetcode 69 x的平方根`](#题目示例1-leetcode-69-x的平方根)
        - [题目示例2 `leetcode 287 寻找重复数`](#题目示例2-leetcode-287-寻找重复数)
        - [题目示例3 `leetcode 374 猜数字大小`](#题目示例3-leetcode-374-猜数字大小)
        - [题目示例4 `leetcode 1283 使结果不超过阈值的最小除数`](#题目示例4-leetcode-1283-使结果不超过阈值的最小除数)
      - [题型三 复杂的判别函数(最大值极小化问题)](#题型三-复杂的判别函数最大值极小化问题)
        - [题目示例1  `leetcode 410 分割数组的最大值`](#题目示例1--leetcode-410-分割数组的最大值)
        - [题目示例2 `leetcode 875 爱吃香蕉的珂珂`](#题目示例2-leetcode-875-爱吃香蕉的珂珂)
        - [题目示例3 `leetcode 1011 在D天内送达包裹的能力`](#题目示例3-leetcode-1011-在d天内送达包裹的能力)
        - [题目示例4 `leetcode 1482 制作m束花所需的最少天数`](#题目示例4-leetcode-1482-制作m束花所需的最少天数)
        - [题目示例5 `leetcode 1552 两球之间的磁力`](#题目示例5-leetcode-1552-两球之间的磁力)
  - [动态规划](#动态规划)
    - [矩阵类型( 10% )](#矩阵类型-10-)
      - [题目示例1 `leetcode 64 最小路径和`](#题目示例1-leetcode-64-最小路径和)
      - [题目示例2 `leetcode 62 不同路径`](#题目示例2-leetcode-62-不同路径)
      - [题目示例3 `leetcode 63 不同路径II`](#题目示例3-leetcode-63-不同路径ii)
    - [序列类型（40%）](#序列类型40)
      - [题目示例1 `leetcode 70 爬楼梯`](#题目示例1-leetcode-70-爬楼梯)
      - [题目示例2 `leetcode 55跳跃游戏`](#题目示例2-leetcode-55跳跃游戏)
      - [题目示例3 `leetcode 45跳跃游戏II`](#题目示例3-leetcode-45跳跃游戏ii)
      - [题目示例4 `leetcode 132 分割回文串`](#题目示例4-leetcode-132-分割回文串)
      - [题目示例6 `leetcode 139 单词拆分`](#题目示例6-leetcode-139-单词拆分)
    - [双序列（字符串）DP类型 （40%）](#双序列字符串dp类型-40)
      - [题目示例4 `leetcode 97 交错字符串`](#题目示例4-leetcode-97-交错字符串)
    - [背包问题](#背包问题)
      - [01背包](#01背包)
        - [题目示例1 `leetcode 416 分割等和子集`](#题目示例1-leetcode-416-分割等和子集)
        - [题目示例2 `leetcode  474 一和零`](#题目示例2-leetcode--474-一和零)
        - [题目示例3 `leetcode 494 目标和`](#题目示例3-leetcode-494-目标和)
      - [完全背包](#完全背包)
        - [题目示例1 `leetcode 322零钱兑换`](#题目示例1-leetcode-322零钱兑换)
        - [题目示例2	 `leetcode 518 零钱兑换II`](#题目示例2-leetcode-518-零钱兑换ii)
- [算法思维](#算法思维)
  - [回溯法](#回溯法)
    - [简单的回溯法模板](#简单的回溯法模板)
    - [典型题目](#典型题目-4)
      - [题型1：基本回溯问题，在数组上进行回溯搜索](#题型1基本回溯问题在数组上进行回溯搜索)
        - [题目示例1 `leetcode 78 子集 `](#题目示例1-leetcode-78-子集-)
        - [题目示例2 `leetcode 90 子集II`](#题目示例2-leetcode-90-子集ii)
        - [题目示例3 `leetcode 46 全排列`](#题目示例3-leetcode-46-全排列)
        - [题目示例4 `leetcode 47 全排列II `](#题目示例4-leetcode-47-全排列ii-)
        - [题目示例5 `leetcode 77 组合`](#题目示例5-leetcode-77-组合)
        - [题目示例6 `leetcode 39 组合总和`](#题目示例6-leetcode-39-组合总和)
        - [题目示例7 `leetcode 40 组合总和II`](#题目示例7-leetcode-40-组合总和ii)
        - [题目示例8 `leetcode 216 组合总和III`](#题目示例8-leetcode-216-组合总和iii)
      - [题型2：字符串上的回溯问题](#题型2字符串上的回溯问题)
        - [题目示例1 `leetcode 131 分割回文串`](#题目示例1-leetcode-131-分割回文串)
        - [题目示例2  `leetcode 93 复原IP地址`](#题目示例2--leetcode-93-复原ip地址)
        - [题目示例3 `leetcode 17 电话号码的字母组合`](#题目示例3-leetcode-17-电话号码的字母组合)
        - [题目示例4 `leetcode 784 字母大小写全排列`](#题目示例4-leetcode-784-字母大小写全排列)
        - [题目示例5 `leetcode 22 括号生成`](#题目示例5-leetcode-22-括号生成)
      - [题型3：二维平面上的回溯问题](#题型3二维平面上的回溯问题)
        - [题目示例1 `leetcode 79 单词搜索`](#题目示例1-leetcode-79-单词搜索)
        - [题目示例2 `leetcode 212 单词搜索II`](#题目示例2-leetcode-212-单词搜索ii)
      - [题型四：游戏问题](#题型四游戏问题)
        - [题目示例1 `leetcode37 解数独`](#题目示例1-leetcode37-解数独)
        - [题目示例2 `leetcode 51 N皇后`](#题目示例2-leetcode-51-n皇后)
        - [题目示例3 `leetcode 52 N皇后II`](#题目示例3-leetcode-52-n皇后ii)
  - [滑动窗口技巧](#滑动窗口技巧)
    - [滑动窗口类型](#滑动窗口类型)
      - [固定窗口：窗口的大小是固定的](#固定窗口窗口的大小是固定的)
      - [可变窗口：窗口的大小不固定](#可变窗口窗口的大小不固定)
    - [简单的滑动窗口模板](#简单的滑动窗口模板)
      - [1、可变窗口模板](#1可变窗口模板)
      - [2、固定窗口模板](#2固定窗口模板)
    - [典型题目](#典型题目-5)
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
        - [题目示例12 `leetcode 1493 删掉一个元素以后全为1的最长子数组`](#题目示例12-leetcode-1493-删掉一个元素以后全为1的最长子数组)
      - [固定窗口题目](#固定窗口题目)
        - [题目示例1 `leetcode 239 滑动窗口最大值`](#题目示例1-leetcode-239-滑动窗口最大值-1)
        - [题目示例2 `leetcode 1456 定长子串中元音的最大数目`](#题目示例2-leetcode-1456-定长子串中元音的最大数目)
        - [题目示例3 `leetcode 643 子数组最大平均数`](#题目示例3-leetcode-643-子数组最大平均数)
      - [未分类题目](#未分类题目)
        - [题目示例6 `leetcode 904 水果成篮`](#题目示例6-leetcode-904-水果成篮)
        - [题目示例9 `leetcode 992 K个不同整数的子数组`](#题目示例9-leetcode-992-k个不同整数的子数组)
        - [题目示例11 `leetcode 1234 替换子串得到平衡字符串`](#题目示例11-leetcode-1234-替换子串得到平衡字符串)
        - [题目示例12 `leetcode 395 至少有K个重复字符的最长子串`](#题目示例12-leetcode-395-至少有k个重复字符的最长子串)
        - [题目示例13 `leetcode 1208 尽可能使字符串相等`](#题目示例13-leetcode-1208-尽可能使字符串相等)
        - [题目示例14  `leetcode 978 最长湍流子数组`](#题目示例14--leetcode-978-最长湍流子数组)
        - [题目示例15 `leetcode 995 K连续位的最小翻转次数`](#题目示例15-leetcode-995-k连续位的最小翻转次数)
        - [题目示例16 `leetcode 1040 移动石子直到连续`](#题目示例16-leetcode-1040-移动石子直到连续)
        - [题目示例17 `leetcode 1052 爱生气的书店老板`](#题目示例17-leetcode-1052-爱生气的书店老板)
        - [题目示例19 `leetcode 727 最小窗口子序列`](#题目示例19-leetcode-727-最小窗口子序列)
  - [前缀和](#前缀和)
    - [题目示例](#题目示例)
      - [题目示例1 `leetcode 1 两数之和`](#题目示例1-leetcode-1-两数之和)
      - [题目示例5 `leetcode 1074 元素和为目标值的子矩阵数量`](#题目示例5-leetcode-1074-元素和为目标值的子矩阵数量)
      - [题目示例6 `leetcode 930 和相同的二元子数组`](#题目示例6-leetcode-930-和相同的二元子数组)
      - [题目示例9 `leetcode 307 区域和检索-数组可修改`](#题目示例9-leetcode-307-区域和检索-数组可修改)
      - [题目示例10 `leetcode 554 砖墙`](#题目示例10-leetcode-554-砖墙)
      - [题目示例11 `leetcode 1124 表现良好的最长时间段`](#题目示例11-leetcode-1124-表现良好的最长时间段)
      - [题目示例12  `leetcode 1109 航班预定`](#题目示例12--leetcode-1109-航班预定)
      - [题目示例13 `leetcode 1094 拼车`](#题目示例13-leetcode-1094-拼车)
  - [循环不变量](#循环不变量)
    - [典型题目](#典型题目-6)
      - [题目示例1 `leetcode 283 移动零`](#题目示例1-leetcode-283-移动零)
      - [题目示例2 `剑指offer 21 调整数组顺序使奇数位于偶数的前面`](#题目示例2-剑指offer-21-调整数组顺序使奇数位于偶数的前面)
      - [题目示例3 `leetcode 26 删除排序数组中的重复项`](#题目示例3-leetcode-26-删除排序数组中的重复项)
      - [题目示例4 `leetcode 27 移除元素`](#题目示例4-leetcode-27-移除元素)
      - [题目示例5 `leetcode 75 颜色分类`](#题目示例5-leetcode-75-颜色分类)
      - [题目示例6 `leetcode 215 数组中的第k个最大元素`](#题目示例6-leetcode-215-数组中的第k个最大元素)
## 数据结构

------

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
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x) { 
        this.val = x;
    }
}
```

------

##### 树的遍历

###### 递归遍历

```java
private void Traversal(TreeNode root) {
    if(root == null) {
        return;
    }
    // 前序遍历
    System.out.println(root.val);		
    preOrderTraverse(root.left);
    // 中序遍历
    // System.out.println(root.val);   
    preOrderTraverse(root.right);
    // 后序遍历
    // System.out.println(root.val);   
}
```

-----

###### 前序非递归

```java
private List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> res = new LinkedList<>();
    if(root == null) {
        return res;
    }
    
    Deque<TreeNode> stack = new LinkedList<>();
    while(root != null || !stack.isEmpty()) {
        while(root != null) {
            // 前序遍历，先保存结果(根节点)
            res.add(root.val);
            // 被存入栈的节点是已经被访问过的节点
            stack.addLast(root);
            // 由先序遍历的规则可知(左子节点)
            root = root.left;
        }
        // pop
        root = stack.removeLast();
        root = root.right;
    }
    return res;
}
```

------

###### 中序非递归

```java
private List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> res = new LinkedList<>();
    if(root == null) {
        return res;
    }
    
    Deque<TreeNode> stack = new LinkedList<>();
    while(!stack.isEmpty() || root != null) {
        while(root != null) {
            stack.addLast(root);
            root = root.left;
        } 
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
    if(root == null) {
        return res;
    }
    
    Deque<TreeNode> stack = new LinkedList<>();
    TreeNode lastVisit = null;
    while(root != null || !stack.isEmpty()) {
        while(root != null) {
            stack.addLast(root);
            root = root.left;
        }
        
        TreeNode node = stack.peekLast();
        if(node.right == null || node.right == lastVisit) {
            // 栈顶节点必须在没有有右子节点或者其右子节点刚刚被访问的情况下才能弹出
            stack.removeLast();
            res.add(node.val);
            lastVisit = node;
        } else {
            // 当前节点的右子树未被遍历时要先访问右子树
            root = node.right;
        }
    }
    return res;
}
```

------

------

#### 普通二叉树问题（未仔细分类）

-------

##### 题目示例1 `leetcode 104 二叉树的最大深度`

```java
private int maxDepth(TreeNode root) {
    if(root == null) {
        return 0;
    }
    
    int left = maxDepth(root.left);
    int right = maxDepth(root.right);
    return Math.max(left, right) + 1;
}
```

--------

##### 题目示例2`leetcode 110 平衡二叉树`

```java
/**
* 自顶向下对每个节点代表的子树检查其平衡性，思路直接但是多了很多重复计算
 */
public boolean isBalanced(TreeNode root) {
    if(root == null) {
        return true;
    }
    
    int left = maxDepth(root.left);
    int right = maxDepth(root.right);
    int absDiff = Math.abs(left - right);
    return absDiff <= 1 && isBalanced(root.left) && isBalanced(root.right);
}

private int maxDepth(TreeNode root) {
    if(root == null) {
        return 0;
    }
    
    int left = maxDepth(root.left);
    int right = maxDepth(root.right);
    return Math.max(left, right) + 1;
}

/**
* 先对二叉树进行先序遍历，递归返回前计算子树的平衡性
* 参考题解：https://leetcode-cn.com/problems/balanced-binary-tree/solution/balanced-binary-tree-di-gui-fang-fa-by-jin40789108/
 */
public boolean isBalanced(TreeNode root) {
    if(root == null) {
        return true;
    }

    int flag = traverse(root);
    return flag != -1;
}

private int traverse(TreeNode root) {
    if(root == null) {
        return 0;
    }

    int left = traverse(root.left);
    int right = traverse(root.right);
    if(left == -1 || right == -1) {
        return -1;
    }

    return Math.abs(left - right) <= 1? Math.max(left, right) + 1 : -1;
}
```

-----

##### 题目示例3 `leetcode 124:二叉树中的最大路径和`

```java
/**
* 思路：分治法，分为三种情况
* 1、具有最大路径和的路径在左子树
* 2、具有最大路径和的路径在右子树
* 3、具有最大路径和的路径经过当前的根节点
* 
* 需要保存两个变量：
* 第一个变量为全局变量res，保存当前找到的最大路径和
* 第二个变量保存左右子树单向路径和加上根节点值，为当前子树的经过子树根节点的路径最大值
* 比较两个变量取最大值，更新全局变量res
*/
int res = Integer.MIN_VALUE;
public int maxPathSum(TreeNode root) {
    oneSideMax(root);
    return res;
}

private int oneSideMax(TreeNode root) {
    if(root == null) {
        return 0;
    }

    // divide
    int left = Math.max(0, oneSideMax(root.left));
    int right = Math.max(0, oneSideMax(root.right));

    // conquer
    res = Math.max(res, left + right + root.val);
    return Math.max(left, right) + root.val;
}
```

-----

##### 题目示例4  `leetcode 236 二叉树的最近公共祖先` 

```java
private TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    // 递归的终止条件
    if(root == null || p == root || q == root) {
        return root;
    }
    // divide
    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);
    // conquer
    return left == null? right: right == null ? left:root;
}
```

---

##### 题目示例5 `leetcode 543 二叉树的直径`

```java
private int maxDiameter = 0;
public int diameterOfBinaryTree(TreeNode root) {
    oneSideMax(root);
    return maxDiameter;
}

private int oneSideMax(TreeNode root) {
    if(root == null) {
        return 0;
    }
    
    int left = oneSideMax(root.left);
    int right = oneSideMax(root.right);
  	maxDiameter = Math.max(maxDiameter, left + right);
    return Math.max(left, right) + 1;
}
```

----

##### 题目示例6 `leetcode 226 翻转二叉树`

```java
/**
* 递归交换当前子树的左右节点
* @param root
 */
private TreeNode invertTree(TreeNode root) {
    if(root == null) {
        return null;
    }
    
    TreeNode left = root.left;
    root.left = invertTree(root.right);
    root.right = invertTree(left);
    return root;
}
```

----

##### 题目示例7 `leetcode 617 合并二叉树`

```java
/**
* 同时对两棵树进行先序遍历，合并遍历节点即可
 */
private TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
	if(t1 == null && t2 == null) {
        return null;
    } else if(t1 == null) {
        return t2;
    } else if(t2 == null) {
        return t1;
    }
    
    TreeNode node = new TreeNode(t1.val + t2.val);
    node.left = mergeTrees(t1.left, t2.left);
    node.right = mergeTrees(t1.right, t2.right);
    return node;
}
```

----

##### 题目示例8  `leetcode 112 路径总和`

```java
private boolean hasPathSum(TreeNode root, int sum) {
    if(root == null) {
        return false;
    } else if(root.left == null && root.right == null && root.val == sum) {
        return true;
    }
    
    int remain = sum - root.val;
    return hasPathSum(root.left, remain) || hasPathSum(root.right, remain);
}
```

----

##### 题目示例9 `leetcode 437 路径总和III`

```java
public int pathSum(TreeNode root, int sum) {
    if(root == null) {
        return 0;
    }
    
    int res = pathSumStartsWithRoot(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    return res;
}

/**
* 计算以root为起点的满足和为sum的路径的数量
 */
private int pathSumStartsWithRoot(TreeNode root, int sum) {
    if(root == null) {
        return 0;
    }
    
	sum -= root.val;
    int res = (sum == 0)? 1 : 0;
    // 在这里res与左右子树可能的结果需要进行相加操作，原因是即使当前节点作为路径尾结点
    // 已经满足题目要求，如果出现其子节点值为0，此时子节点加入的路径也满足题目要求，但
    // 与以当前节点为尾结点的路径是相互独立的
    res += pathSumStartsWithRoot(root.left, sum) + pathSumStartsWithRoot(root.right, sum);
    return res;
}
```

----

##### 题目示例10 `leetcode 572 另一个树的子树`

```java
public boolean isSubtree(TreeNode s, TreeNode t) {
    if(s == null) {
        return false;
    }
    return isSubTreeWithRoot(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
}

/**
* 同时对两棵树进行先序遍历并比较
 */
private boolean isSubTreeWithRoot(TreeNode s, TreeNode t) {
    if(s == null && t == null) {
        return true;
    } else if(s == null || t == null || s.val != t.val) {
        return false;
    }
    return isSubTreeWithRoot(s.left, t.left) && isSubTreeWithRoot(s.right, t.right);
}
```

---

##### 题目示例11 `leetcode 101 对称二叉树`

```java
public boolean isSymmetric(TreeNode root) {
	return isSymmetric(root, root);
}

private boolean isSymmetric(TreeNode t1, TreeNode t2) {
    if(t1 == null && t2 == null) {
        return true;
    } else if(t1 == null || t2 == null || t1.val != t2.val) {
        return false;
    }
    return isSymmetric(t1.left, t2.right) && isSymmetric(t1.right, t2.left);
}
```

---

##### 题目示例12 `leetcode 111 二叉树的最小深度`

```java
/**
* DFS解决方案
* 注：最小深度是从根节点到最近叶子节点的最短路径上的节点数量!!!
* 叶子节点的定义是左孩子和右孩子都为 null 时叫做叶子节点
* 1、当 root 节点左右孩子都为空时，返回 1
* 2、当 root 节点左右孩子有一个为空时，返回不为空的孩子节点的深度
* 3、当 root 节点左右孩子都不为空时，返回左右孩子较小深度的节点值
 */
private int minDepth(TreeNode root) {
    if(root == null) {
        return 0;
    }
    int left = minDepth(root.left);
    int right = minDepth(root.right);
    if(left == 0 || right == 0) {
        return left + right + 1;
    }
    return Math.min(left, right) + 1;
}

/**
* BFS解决方案
* 对二叉树进行层序遍历找到的第一个叶子节点就是离根节点最近的
* 叶子节点
 */
private int minDepth(TreeNode root) {
    if(root == null) {
        return 0;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    int res = 1;
    while(!queue.isEmpty()) {
        int levelSize = queue.size();
        for(int i = 0; i < levelSize; i++) {
            TreeNode node = queue.poll();
            // 判断是否已经找到一个叶节点，在找到第一个叶节点时就会返回
            if(node.left == null && node.right == null) {
                return res;
            }
            if(node.left != null) {
                queue.offer(node.left);
            }
            if(node.right != null) {
                queue.offer(node.right);
            }
        }
        res++;
    }
    return res;
}
```

----

##### 题目示例13 `leetcode 404 左叶子之和`

```java
/**
* 左叶子：如果当前节点的左子节点为叶子节点，称该叶子节点为左叶子
 */
public int sumOfLeftLeaves(TreeNode root) {
    if(root == null) {
        return 0;
    } else if(isLeaf(root.left)) {
        return root.left.val + sumOfLeftLeaves(root.right);
    }
    return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
}

private boolean isLeaf(TreeNode root) {
    if(node == null) {
        return false;
    }
    return root.left == null && root.right == null;
}
```

----

##### 题目示例14 `leetcode 687 最长同值路径`

```java
/**
* 与leetcode 124 最大路径和的思路类似
 */
private int res = 0;
public int longestUnivaluePath(TreeNode root) {
    arrowLength(root);
    return res;
}

/**
* 求从root开始往叶子节点方向的一个最长同值路径的长度
* @param root
 */
private int arrowLength(TreeNode root) {
    if(root == null) {
        return 0;
    }
    int left = arrowLength(root.left);
    int right = arrowLength(root.right);
    int leftPath = (root.left != null) && (root.left.val == root.val) ? left + 1 : 0;
    int rightPath = (root.right != null) && (root.right.val == root.val) ? right + 1 : 0;
    res = Math.max(res, leftPath + rightPath);
    return Math.max(leftPath, rightPath);
}
```

----

##### 题目示例15 `leetcode 671 二叉树中第二小的节点`

```java
/**
* 方法一
* 最简单的思路：遍历去重 + 排序
 */
public int findSecondMinimumValue(TreeNode root) {
    ArrayList<Integer> reL = new ArrayList<Integer>();
    inOrderTraverse(root, reL);

    if(reL.size() < 2) {
        return -1;
    }
    Collections.sort(reL);
    return reL.get(1);
}

private void inOrderTraverse(TreeNode root, ArrayList<Integer> list) {
    if(root == null) {
        return;
    }
    inOrderTraverse(root.left, list);
    if(!list.contains(root.val)) {
        list.add(root.val);
    }
    inOrderTraverse(root.right, list);
}
```

-----

##### 题目示例16 `leetcode 106 从中序遍历和后序遍历构造二叉树`

**重点：划分左右子树区间**

```java
private int[] postorder;
private Map<Integer, Integer> map;
public TreeNode buildTree(int[] inorder, int[] postorder) {
    if(inorder == null || postorder == null) {
        return null;
    }
    
    int inLen = inorder.length;
    int postLen = postorder.length;
    if(inLen == 0  || postLen == 0 || inLen != postLen) {
        return null;
    }
    
    this.postorder = postorder;
    map = new HashMap<>();
    for(int i = 0; i < inLen; i++) {
        map.put(inorder[i], i);
    }
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
private TreeNode buildTree(int inLeft, int inRight, int postLeft, int postRight) {
    if(inLeft > inRight || postLeft > postRight) {
        return null;
    }
    
    int rootVal = postorder[postRight];
    int rootIndex = map.get(rootVal);
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
private int[] preorder;
private Map<Integer, Integer> hashMap;
public TreeNode buildTree(int[] preorder, int[] inorder) {
    // 1、边界条件特判
    if(inorder == null || preorder == null) {
        return null;
    }
    int inLen = inorder.length;
    int preLen = preorder.length;
    if(inLen == 0  || preLen == 0 || inLen != preLen) {
        return null;
    }
    
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
    if(inLeft > inRight || preLeft > preRight) {
        return null;
    }
    
    int rootVal = preorder[preLeft];
    int rootIndex = hashMap.get(rootVal);
    TreeNode root = new TreeNode(rootVal);
    root.left = buildTree(preLeft + 1, rootIndex - inLeft + preLeft, inLeft, rootIndex - 1);
    root.right = buildTree(rootIndex - inLeft + preLeft + 1, preRight, rootIndex + 1, inRight);
    return root;
}
```

----

##### 题目示例18 `leetcode 116 填充每个节点的下一个右侧节点指针`

**建议在纸上跑一遍算法流程**

```java
private Node connect(Node root) {
    if(root == null) {
        return null;
    }
    Node left = root.left;
    Node right = root.right;
    while(left != null) {
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
/**
* BFS解决
 */
public Node connect(Node root) {
    if(root == null) {
        return root;
    }

    Deque<Node> queue = new LinkedList<>();
    queue.offerLast(root);
    while(!queue.isEmpty()) {
        int levelSize = queue.size();
        while(levelSize > 0) {
            // 链接同一层的右侧指针
            Node node = queue.pollFirst();
            levelSize--;
            if(levelSize > 0) {
                node.next = queue.peekFirst();
            } 
            if(node.left != null) {
                queue.offerLast(node.left);
            }
            if(node.right != null) {
                queue.offerLast(node.right);
            }
        }
    }
    return root;
}
```

------

##### 题目示例20 `leetcode 102 二叉树的层序遍历`

```java
/**
* 借助队列实现BFS
 */
private List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> res = new LinkedList<>();
    if(root == null) {
        return res;
    }
    
    Deque<TreeNode> queue = new LinkedList<>();
    queue.offerLast(root);
    while(!queue.isEmpty()) {
        List<Integer> runner = new LinkedList<>();
        int levelSize = queue.size();
        while(levelSize > 0) {
            TreeNode node = queue.pollFirst();
            runner.add(node.val);
            levelSize--;
            if(node.left != null) {
                queue.offerLast(node.left);
            }
            if(node.right != null) {
                queue.offerLast(node.right);
            }
        }
        res.add(new LinkedList(runner));
    }
    return res;
}
```

------

##### 题目示例21 `leetcode 107 二叉树的层次遍历II`

```java
/**
* 借助队列实现BFS，注意结果的添加顺序即可
 */
private List<List<Integer>> levelOrderBottom(TreeNode root) {
    List<List<Integer>> res = new LinkedList<>();
    if(root == null) {
        return res;
    }
    
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty()) {
        List<Integer> runner = new LinkedList<>();
        int levelSize = queue.size();
        while(levelSize > 0) {
            TreeNode node = queue.poll();
            runner.add(node.val);
            levelSize--;
            if(node.left != null) {
                queue.offer(node.left);
            }
            if(node.right != null) {
                queue.offer(node.right);
            }
        }
        res.add(0, new LinkedList(runner));
    }
    return res;
}
```

-------

##### 题目示例22`leetcode 103 二叉树的锯齿形层次遍历`

```java
/**
* 借助队列实现BFS，注意结果的添加顺序即可
 */
private List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> res = new LinkedList<>();
    if(root == null) {
        return res;
    }

    boolean toggle = false;                         
    Deque<TreeNode> queue = new LinkedList<>();     
    queue.offer(root);  
    while(!queue.isEmpty()) {
        LinkedList<Integer> temp = new LinkedList<>();  
        int levelSize = queue.size();                   
        while(levelSize > 0) {
            // 根据翻转标志，决定把元素放在列表头部还是尾部
            TreeNode node = queue.poll();
            if(!toggle) {
                temp.addLast(node.val);
            } else {
                temp.addFirst(node.val);
            }

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

##### 题目示例23 `leetcode 114 二叉树展开为链表`

```java
/**
* 对二叉树进行后序遍历
* 在遍历到当前节点时有：
* 	1、当前节点的左子树已经展开为链表
*	2、当前节点的右子树已经展开为链表
* 之后的步骤为：
* 	1、将左链表连接到当前节点的右子树，并且node.left = null
* 	2、将右子树连接到当前节点右子树的最右侧
 */
private void flatten(TreeNode root) {
    // 递归终止条件
    if(root == null) {
        return;
    }
    
    // 步骤一：将根节点的左子树展开为链表
    flatten(root.left);
    // 步骤二：将根节点的右子树展开为链表
    flatten(root.right);
    // 步骤三：将变成链表的左子树挂到根节点的右子树位置
    TreeNode right = root.right;
    root.right = root.left;
    root.left = null;
    // 步骤四：将变成链表的右子树挂在变成链表的左子树的最右边
    TreeNode utmost = root;
    while(utmost.right != null) {
        utmost = utmost.right;
    }
    utmost.right = right;
}
```

-----

##### 题目示例24 `leetcode 222 完全二叉树的节点个数`

```java
/**
* 完全二叉树的性质：若完全二叉树为满二叉树，且层数为h，则总节点数为：2^h - 1.
*/
public int countNodes(TreeNode root) {
    if(root == null) {
        return 0;
    }

    int left = level(root.left);
    int right = level(root.right);
    if(left == right) {
        // left == right 代表左子树一定是满的，右子树不确定
        return countNodes(root.right) + (1 << left);
    } else {
        // left != right表示右子树一定是满的，左子树不确定
        return countNodes(root.left) + (1 << right);
    }
}

/**
* 计算完全二叉树的高度
* @param root
*/
private int level(TreeNode root) {
    int h = 0;
    while(root != null) {
        h++;
        root = root.left;
    }
    return h;
}
```

----

##### 题目示例25 `leetcode 958 二叉树的完全性检验`

```java
/**
* 层序遍历二叉树，在碰到某节点子结点为null时也一并放入
* 完全二叉树的层序遍历不可能出现空结点出现在非空结点之
* 前，靠这个性质来判断二叉树完全性
 */
private boolean isCompleteTree(TreeNode root) {
    if(root == null) {
        return true;
    }

    Deque<TreeNode> queue = new LinkedList<>();
    queue.offerLast(root);
    boolean hasPrevNull = false;
    while(!queue.isEmpty()) {
        TreeNode node = queue.pollFirst();
        if(node != null) {
            if(hasPrevNull){
                return false;
            } else {
                queue.offerLast(node.left);
                queue.offerLast(node.right);
            }
        } else {
            hasPrevNull = true;
        }
    }
    return true;
}
```

----

##### 题目示例26 `leetcode 1325 删除给定值的叶子结点`

```java
/**
* 注意在java中传参只有传值这一种！！！！！！
*/
public TreeNode removeLeafNodes(TreeNode root, int target) {
    root = postTraAndDelete(root, target);
    return root;
}


private TreeNode postTraAndDelete(TreeNode root, int target) {
    if(root == null) {
        return null;
    }
	// 后序遍历，必须最后删除根节点
    root.left = postTraAndDelete(root.left, target);
    root.right = postTraAndDelete(root.right, target);
    if(root.left == null && root.right == null && root.val == target) {
        root = null;
    }
    return root;
}
```

----

##### 题目示例27 `leetcode 662 二叉树最大宽度`

```java
/**
* 层序遍历二叉树
 */
private int widthOfBinaryTree(TreeNode root) {
    if(root == null) {
        return 0;
    }
	
    // list存储树中每个非空节点的“坐标”，父节点和子节点坐标关系与将树按数组方式存储时一致
    // 即leftChild = 2 * parent, rightChild = 2 * parent + 1，其中把根节点坐标设为1
    LinkedList<Integer> list = new LinkedList<>();
    Deque<TreeNode> queue = new LinkedList<>();
    int curIndex = 1;
    int res = 1;
    queue.addLast(root);
    list.addLast(curIzndex);
    while(!queue.isEmpty()) {
        int levelSize = queue.size();
        while(levelSize > 0) {
            TreeNode node = queue.pollFirst();
            int curIndex = list.removeFirst();
            levelSize--;
            if(node.left != null) {
                queue.addLast(node.left);
                list.addLast(2 * curIndex);
            }
            if(node.right != null) {
                queue.addLast(node.right);
                list.addLast(2 * curIndex + 1);
            }
        }

        if(list.size() >= 2) {
            res = Math.max(res, list.getLast() - list.getFirst() + 1);
        }
    }
    return res;
}
```

------

##### 题目示例28  `leetcode 113 路径总和II`

```java
/**
* 回溯问题
 */
private List<List<Integer>> res = new LinkedList<>();
public List<List<Integer>> pathSum(TreeNode root, int sum) {
    if(root == null) {
        return res;
    }

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
    }
    // 进入下一层决策树
    backTracking(root.left, sum, path);
    backTracking(root.right, sum, path);
    // 撤销选择
    sum += root.val;
    path.removeLast();
}
```

------

##### 题目示例29  `leetcode 156 上下翻转二叉树`

```java
private TreeNode upsideDownBinaryTree(TreeNode root) {
    if(root == null) {
        return null;
    }
	
    /**
    * 遍历二叉树的最左边界，对于遍历到的每个节点
    * 其父节点变为其右子节点；其兄弟节点变为其左子节点
    * 根据题目条件，遍历到的每个节点一定有兄弟节点
     */
    TreeNode parent = null;
    TreeNode brother = null;
    while(root != null) {
        TreeNode tempLeft = root.left;
        TreeNode tempRight = root.right;
        root.left = brother;
        root.right = parent;
        parent = root;
        brother = tempRight;
        root = tempLeft;
    }
    return parent;
}
```

-----

##### 题目示例30 `leetcode 654 最大二叉树`

```java
public TreeNode constructMaximumBinaryTree(int[] nums) {
    return constructMaximumBinaryTree(nums, 0, nums.length - 1);
}

private TreeNode constructMaximumBinaryTree(int[] nums, int left, int right) {
    // 递归终止条件
    if(left > right) {
        return null;
    }

    // 找到[left, right]内的最大值及其位置
    int rootIndex = left;
    for(int i = left; i <= right; i++) {
        if(nums[i] > nums[rootIndex]) {
            rootIndex = i;
        }
    }
	
    // 构造根节点，递归构造其左右子树
    TreeNode root = new TreeNode(nums[rootIndex]);
    root.left = constructMaximumBinaryTree(nums, left, rootIndex - 1);
    root.right = constructMaximumBinaryTree(nums, rootIndex + 1, right);
    return root;
}
```

-----

##### 题目示例31 `leetcode 100 相同的树`

```java
/**
* 同时在两棵树上进行先序遍历
 */
private boolean isSameTree(TreeNode p, TreeNode q) {
    if(p == null && q == null) {
        return true;
    } else if(p == null || q == null || p.val != q.val) {
        return false;
    }

    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
}
```

-----

##### 题目示例32 `leetcode 129 求根到叶子节点数字之和`

```java
/**
* 在先序遍历基础上进行一些调整
 */
private int res = 0;
public int sumNumbers(TreeNode root) {
    preorderTra(root, 0);
    return res;
}

private void preorderTra(TreeNode root, int curVal) {
    if(root == null) {
        return;
    }

    curVal = 10 * curVal + root.val;
    if(root.left == null && root.right == null) {
        res += curVal;
    }
    preorderTra(root.left, curVal);
    preorderTra(root.right, curVal);
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
    if(root == null) {
        return true;
    } else if(min != null && root.val <= min.val) {
        return false;
    } else if(max != null && root.val >= max.val) {
        return false;
    }
    return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
}
```

------

#####  题目示例2 `leetcode  701  二叉搜索树中的插入操作`

```java
/**
* 搜索到一个空结点，创建一个新的节点并返回其引用即可
 
 */
private TreeNode insertIntoBST(TreeNode root, int val) {
    if(root == null) {
        root = new TreeNode(val);
    } else if(val < root.val) {
        root.left = insertIntoBST(root.left, val);
    } else if(val > root.val) {
        root.right = insertIntoBST(root.right, val);
    }
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
    } else if(root.val < key) {
        // key > root.val, 递归在右子树删除
        root.right = deleteNode(root.right, key);
    } else if(root.val > key) {
        // key < root.val, 递归在左子树删除
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
    } else if(root.left == null) {
        return root.right;
    }
    root.left = deleteMin(root.left);
    return root;
}
```

------

##### 题目示例4 `leetcode 669 修剪二叉搜索树`

```java
private TreeNode trimBST(TreeNode root, int low, int high) {
    if(root == null) {
        return null;
    } else if(root.val < low)	{
        return trimBST(root.right, low, high);
    } else if(root.val > high)	{
        return trimBST(root.left, low, high);
    }
    root.left = trimBST(root.left, low, high);
    root.right = trimBST(root.right, low, high);
    return root;
}
```

---

##### 题目示例5 `leetcode 230 二叉搜索树中第K小的元素`

```java
/**
* 方法一：计数法
 */
public int kthSmallest(TreeNode root, int k) {
    return select(root, k);
}

/**
* 找到BST中排名为k的元素
* @param root
* @param k
 */
private int select(TreeNode root, int rank) {
    if(root == null) {
        return 0;
    }
    int leftSize = size(root.left);
    if(leftSize == rank - 1) {
        return root.val;
    } else if(leftSize < rank - 1) {
        return select(root.right, rank - leftSize - 1);
    } else {
        return select(root.left, rank);
    }
}

/**
* 计算树的结点总数
* @param root
 */
private int size(TreeNode root) {
    if(root == null) {
        return 0;
    }

    int left = size(root.left);
    int right = size(root.right);
    return left + right + 1;
}

/**
* 方法二：中序遍历
 */
private int count = 0;
private int res = 0;
public int kthSmallest(TreeNode root, int k) {
    inorderTra(root, k);
    return res;
}

private void inorderTra(TreeNode root, int k) {
    if(root == null) {
        return;
    }

    inorderTra(root.left, k);
    count++;
    if(count == k) {
        res = root.val;
        return;
    }
    inorderTra(root.right, k);
}
```

---

##### 题目示例6 `leetcode 538 把二叉搜索树转换为累加树`

```java
/**
* 调整二叉树遍历顺序：右子节点 -> 根节点 -> 左子节点
 */
private int sum = 0;
public TreeNode convertBST(TreeNode root) {
    morrisTraversal(root);
    return root;
}

private void morrisTraversal(TreeNode root) {
    if(root == null) {
        return;
    }
    morrisTraversal(root.right);
    sum += root.val;
    root.val = sum;
    morrisTraversal(root.left);
}
```

---

##### 题目示例7 `leetcode 235 二叉查找树的最近公共祖先`

```java
private TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if(p.val < root.val && q.val < root.val) {
        return lowestCommonAncestor(root.left, p, q);
    } else if(p.val > root.val && q.val > root.val) {
        return lowestCommonAncestor(root.right, p, q);
    }
    return root;
}
```

---

##### 题目示例8 `leetcode 108 将有序数组转换为二叉搜索树`

```java
public TreeNode sortedArrayToBST(int[] nums) {
    return constructTreee(nums, 0, nums.length - 1);
}

private TreeNode constructTreee(int[] nums, int start, int end) {
    // 递归终止条件
    if(start > end) {
        return null;
    }
	
    // 取区间[start, end]的中间元素作为当前子树的根节点
    int mid = start + (end - start) / 2;
    TreeNode root = new TreeNode(nums[mid]);
    root.left = constructTreee(nums, start, mid - 1);
    root.right = constructTreee(nums, mid + 1, end);
    return root;
}
```

---

##### 题目示例9 `leetcode 109 有序链表转换二叉搜索树`

```java
public TreeNode sortedListToBST(ListNode head) {
    if(head == null) {
        return null;
    } else if(head.next == null) {
        return new TreeNode(head.val);
    }
    
    ListNode preMid = preMid(head);
    ListNode mid = preMid.next;
    preMid.next = null;
    TreeNode root = new TreeNode(mid.val);
    root.left = sortedListToBST(head);
    root.right = sortedListToBST(mid.next);
    return root;
}

/**
* 获取链表中间结点的前置结点
 */
private ListNode preMid(ListNode head) {
    ListNode slow = head;
    ListNode fast = head.next;
    ListNode pre = head;
    while(fast != null && fast.next != null) {
        pre = slow;
        slow = slow.next;
        fast = fast.next.next;
    }
	return pre;
}
```

---

##### 题目示例10 `leetcode 653 两数之和IV 输入BST`

```java
public boolean findTarget(TreeNode root, int k) {
    return find(root, new HashSet<Integer>(), k);
}

private boolean find(TreeNode root, Set<Integer> set, int k) {
    if(root == null) {
        return false;
    } else if(set.contains(k - root.val)) {
     	return true;   
    }
    set.add(root.val);
    return find(root.left, set, k) || find(root.right, set, k);
}
```

---

##### 题目示例 11 `leetcode 530 二叉搜索树的最小绝对差`

```java
private int minDiff = Integer.MAX_VALUE;
private TreeNode pre = null;
public int getMinimumDifference(TreeNode root) {
	traversal(root);
    return minDiff;
}

/**
* 中序遍历BST
 */
private void traversal(TreeNode root) {
    if(root == null) {
        return;
    }
    traversal(root.left);
    if(pre != null) {
        minDiff = Math.min(minDiff, root.val - pre.val);
    }
    pre = root;
    traversal(root.right);
}
```

----

##### 题目示例12 `leetcode 333  最大BST子树`

```java
public int largestBSTSubtree(TreeNode root) {
    if(root == null) {
        return 0;
    } else if(isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
        return size(root);
    }
    int left = largestBSTSubtree(root.left);
    int right = largestBSTSubtree(root.right);
    return Math.max(left, right);
}

/**
* 验证二叉树是否为BST
*/
private boolean isValidBST(TreeNode root, int min, int max) {
    if(root == null) {
        return true;
    } else if(root.val <= min || root.val >= max) {
        return false;
    }
    return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
}
/**
* 统计BST节点数量
*/
private int size(TreeNode root) {
    if(root == null) {
        return 0;
    }
    
    int left = size(root.left);
    int right = size(root.right);
    return left + right + 1;
}
```

-----

##### 题目示例13 `leetcode 776 拆分二叉搜索树`

```java
/**
* 参考官方题解
 */
private TreeNode[] splitBST(TreeNode root, int V) {
    // 递归终止条件
    if(root == null) {
        return new TreeNode[]{null, null};
    }

    TreeNode[] res = new TreeNode[2];
    if(root.val <= V) {
        // 根节点小于V，则其右子有可能被划分
        res = splitBST(root.right, V);
        root.right = res[0];
        res[0] = root;
    } else {
        // 根节点小于V，则其左子树可能被划分
        res = splitBST(root.left, V);
        root.left = res[1];
        res[1] = root;
    }
    return res;
} 
```

------

##### 题目示例14 `leetcode 1214 查找两棵二叉搜索树之和`

```java
public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
    if(root1 == null) {
        return false;
    }
    return findNode(root2, target - root1.val) 
        || twoSumBSTs(root1.left, root2, target) 
        || twoSumBSTs(root1.right, root2, target);
}

/**
* 在BST中找到有特定值的结点
*/
private boolean findNode(TreeNode root, int target) {
    if(root == null) {
        return false;
    } else if(root.val == target) {
        return true;
    }
	return find(root.left, target) || find(root.right, target);
}
```

----

##### 题目示例15 `leetcode 285 二叉搜索树中的顺序后继`

```java
/**
* 方法一:
* 将p.val与当前的root.val进行比较
* 1、如果p.val < root.val,由BST特性可知，大于p.val的最小值可能在root的左子树中，也可能就是root
*	所以此时要记录root为目前的答案
* 2、如果p.val >= root.val,则大于p.val的最小值一定在root的右子树中
 */
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

/**
* 方法二：中序遍历
 */
```

-----

##### 题目示例16 `leetcode 510 二叉搜索树中的中序后继`

```java
/**
* 对任意节点而言，有以下两种情况讨论
* 1、当前节点存在右子树，则该节点的中序后继为右子树中最小的节点（最左侧的节点）
* 2、如果当前节点不存在右子树，则从该节点开始向上追溯，直至找到第一个满足这样条件的节点：
* 	这个节点是其父节点的左子节点，则对应节点的父节点就是满足题意的节点
 */
private Node inorderSuccessor(Node node) {
    if(node == null) {
        return null;
    }

    if(node.right != null) {
        node = node.right;
        while(node.left != null) {
            node = node.left;
        }
        return node;
    } else {
        while(node.parent != null && node != node.parent.left) {
            node = node.parent;
        }
        return node.parent;
    }
}
```

----

##### 题目示例17  `leetcode 426 将二叉搜索树转化为排序的双向链表`

```java
/**
* 中序遍历
 */
private Node dummyHead = new Node(-1, null, null);
private Node runner = dummyHead;
public Node treeToDoublyList(Node root) {
    if(root == null) {
        return null;
    }
    inorderTra(root);
    runner.right = dummyHead.right;
    dummyHead.right.left = runner;
    return dummyHead.right;
}

private void inorderTra(Node root) {
    if(root == null) {
        return;
    }

    inorderTra(root.left);
    runner.right = root;
    root.left = runner;
    runner = root;
    inorderTra(root.right);
}
```

-----

##### 题目示例18 `leetcode 99 恢复二叉搜索树`

```java
/**
* 由BST性质可知：中序遍历序列为一个单调递增的序列；
* 当两个节点被错误地交换时，一定会出现这样的情况：中序遍历中存在一个元素大于其顺序后继元素
* 	当失序的两个元素相邻时，这样的情况出现一次；当失序的两个元素不相邻时，这样的情况出现两次
* 	只出现一次失序的情况可以看作两次失序的重合
* 
* 对该BST进行中序遍历，寻找这样的两个节点：
* 	1、中序遍历过程中第一次出现前一个节点的值大于后一个节点的情况，此时选取前一个节点为firstNode
* 	2、在找到firstNode之后，出现前一个节点大于后一个节点的情况，此时选取后一个节点为secondNode
*		// 注意步骤1中的情况也包括在步骤2寻找的情况之内
* 交换firstNode和secondNode的值
*/
private void recoverTree(TreeNode root) {
    Deque<TreeNode> stack = new LinkedList<>();
    TreeNode firstNode = null;
    TreeNode secondNode = null;
    TreeNode pre = new TreeNode(Integer.MIN_VALUE);
    TreeNode cur = root;
    
    while(cur != null || !stack.isEmpty()) {
        while(cur != null) {
            stack.addLast(cur);
            cur = cur.left;
        }
        TreeNode node = stack.removeLast();
        if(firstNode == null && pre.val > node.val) {
            firstNode = pre;
        }
        if(firstNode != null && pre.val > node.val) {
            secondNode = node;
        }
        pre = node;
        cur = node.right;
    }
    int temp = firstNode.val;
    firstNode.val = secondNode.val;
    secondNode.val = temp;
}
```

-----

#### 序列化和反序列化

##### 题目1 `leetcode 297 二叉树的序列化与反序列化`

```java
/**
* solution1:通过先序遍历来序列化与反序列化二叉树
 */
public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) {
            return "null,";
        }

        String res = root.val + ",";
        res += serialize(root.left); 
        res += serialize(root.right);
        return res;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] vals = data.split(",");
        // 将先序序列放入队列中，方便删除元素
        Deque<String> queue = new LinkedList<>();
        for(int i = 0; i < vals.length; i++) {
            queue.offer(vals[i]);
        }
        return buildTree(queue);
    }

    private TreeNode buildTree(Deque<String> queue) {
        if(queue.isEmpty()) {
            return null;
        } 

        String val = queue.poll();
        if(val.equals("null")) {
            return null;
        }
        // 先序遍历序列第一个元素为根节点
        TreeNode root = new TreeNode(Integer.parseInt(val));
        root.left = buildTree(queue);
        root.right = buildTree(queue);
        return root;
    }
}

/**
* solution2:通过层序遍历来序列化和反序列化二叉树
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) {
            return "";
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        StringBuffer res = new StringBuffer();
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(node != null) {
                res.append(node.val + ",");
                queue.offer(node.left);
                queue.offer(node.right);
            } else {
                res.append("null,");
            }
        }
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("")) {
            return null;
        }
        String[] vals = data.split(",");
        return buildTree(vals);
    }

    private TreeNode buildTree(String[] vals) {
        if(vals == null || vals.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int cursor = 1;
        int len = vals.length;
        while(cursor < len) {
            TreeNode node = queue.poll();
            if(cursor < len && !vals[cursor].equals("null")) {
                TreeNode left = new TreeNode(Integer.parseInt(vals[cursor]));
                node.left = left;
                queue.offer(left);
            }
            cursor++;
            if(cursor < len && !vals[cursor].equals("null")) {
                TreeNode right = new TreeNode(Integer.parseInt(vals[cursor]));
                node.right = right;
                queue.offer(right);
            }
            cursor++;
        }
        return root;
    }
}
```

 

----

-------

### 链表

#### 基本技能

链表相关的核心点

1. null/nil异常处理

2. dummy node 哑巴节点

    dummy node就是在链表的head前加一个节点指向head，即 `dummyHead -> head`.可以理解成一个虚拟节点。有了dummy node就使得操作head节点与操作其他节点没有区别。特别适合用在链表的head可能发生变化的情况下，譬如删除或者被修改等

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

    对于寻找链表的某个特定位置，或者判断链表是否有环等问题时，可以使用两个指针变量 fast和slow,两个指针以不同的策略移动，一般情况是fast每次走两步，slow每次走一步	
    
    在使用快慢指针获取链表中点时常见代码逻辑如下：
    
    ```java
    private ListNode getMid(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
    
        /**
        * ListNode slow = head;
        * ListNode fast = head.next;
        * 上述两行代码最终达到的目的就是定位到下标为(n/2)的链表元素，其中n为链表长度
        * 所以在链表个数为偶数时，slow定位到前一半链表的最后一个元素
        * 链表个数为奇数时，slow定位到链表的中点元素
        * 
        * 如果在循环中加入pre = slow; 最终pre指向上述的中点元素的前一个元素
        * 主要应用于需要将中点元素两侧的链表分开的情况
    	 */
        // ListNode pre = head;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null) {
            // pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        // return pre;
        return slow;
    }
    ```
    
    

-----

#### 常见题型

---

##### 基本操作类题目

###### 题目示例1`leetcode 203 移除链表元素`

```java
/**
* 使用哑节点，所有节点被删除的流程都是一致的
*/
private ListNode removeElements(ListNode head, int val) {
    ListNode dummyHead = new ListNode(-1);
    dummyHead.next = head;
    ListNode runner = dummyHead;
    while(runner.next != null) {
        if(runner.next.val == val) {
            runner.next = runner.next.next;
        } else {
            runner = runner.next;
        }
    }
    return dummyHead.next;
}
```

-------

###### 题目示例2 `leetcode 237 删除链表中的节点`

```java
/**
* 将待删除节点的后继节点的值移到当前节点，之后将后继节点删除即可
*/
private void deleteNode(ListNode node) {
    node.val = node.next.val;
    node.next = node.next.next;
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
    
    if(l1 != null) {
        runner.next = l1;
    } else if(l2 != null) {
        runner.next = l2;
    }
    return dummy.next;
}
```

------

###### 题目示例4 `leetcode 23 合并K个排序链表`

```java
/**
* 使用优先队列
 */
private ListNode mergeKLists(ListNode[] lists) {
    if(lists == null || lists.length == 0) {
        return null;
    }

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(ListNode list:lists) {
        while(list != null) {
            pq.offer(list.val);
            list = list.next;
        }
    }

    ListNode dummyHead = new ListNode(0);
    ListNode runner = dummyHead;
    while(!pq.isEmpty()) {
        int temp = pq.poll();
        runner.next = new ListNode(temp);
        runner = runner.next;
    }
    return dummyHead.next;
}
```

-----

###### 题目示例5 `leetcode 86 分隔链表`

```java
private ListNode partition(ListNode head, int x) {
    if(head == null || head.next == null) {
        return head;
    }
	
    // 将结点分别放到两个子链表上，结束后拼接起来即可
    ListNode dummy1 = new ListNode(0);
    ListNode dummy2 = new ListNode(0);
    ListNode runner1 = dummy1;
    ListNode runner2 = dummy2;
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
    dummy2.next = null;
    return dummy1.next;
}
```

------

###### 题目示例6 `leetcode 24 两两交换链表中的节点`

```java
private ListNode swapPairs(ListNode head) {
    // 递归终止条件
    if(head == null || head.next == null) {
        return head;
    }
    // 递归操作
    ListNode next = head.next;
    head.next = swapPairs(next.next);
    next.next = head;
    return next;
}
```

-----

###### 题目示例7 `leetcode 61 旋转链表`

双指针

注意其中的数学关系: k  = k  % length

```java
private ListNode rotateRight(ListNode head, int k) {
    if(head == null || head.next == null) {
        return head;
    }

    // 获取链表长度，求余取得真正需要反转的结点数量
    int length = 0;
    ListNode runner = head;
    while(runner != null) {
        length++;
        runner = runner.next;
    }
    int times = k % length;
    
    // 双指针，slow 指针最终指向被翻转部分的前一个结点
    // fast指针最终指向链表最后一个结点
    ListNode slow = head;
    ListNode fast = head;
    for(int i = 0; i < times; i++)  {
        fast = fast.next;
    }
    while(fast.next != null) {
        slow = slow.next;
        fast = fast.next;
    }
    // 调整指针，将被翻转部分移到链表最前段端
    // 注意把slow.next 设为空，避免形成循环
    fast.next = head;
    head = slow.next;
    slow.next = null;
    return head;
}
```

----

###### 题目示例8 `leetcode 143 重排链表`

```java
/**
* 1、将链表从中间断开
* 2、将后半部分反转
* 3、交叉将两个链表节点放入新链表中
 */
public void reorderList(ListNode head) {
    if(head == null) { 
        return;
    }
    ListNode mid = getMid(head);
    ListNode secondHalf = reverseList(mid.next);
    // 注意将两部分断开，否则会形成循环
    mid.next = null;
    head = mergeTwoLists(head, secondHalf);
}

/**
* 获取链表中点
*/
private ListNode getMid(ListNode head) {
    if(head == null || head.next == null) {
        return head;
    }
    ListNode slow = head;
    ListNode fast = head.next;
    while(fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}

/**
* 交叉合并两个链表
*/
private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(-1);
    ListNode runner = dummy;
   	while(l1 != null || l2 != null) {
        if(l1 != null) {
            runner.next = l1;
            l1 = l1.next;
            runner = runner.next;
        }
        if(l2 != null) {
            runner.next = l2;
            l2 = l2.next;
            runner = runner.next;
        }
    }
    return dummy.next;
}

/**
* 反转链表
*/
private ListNode reverseList(ListNode head) {
    if(head == null || head.next == null) {
        return head;
    }
    
    ListNode pre = null;
    ListNode cur = head;
    while(cur != null) {
        ListNode next = cur.next;
        cur.next = pre;
        pre = cur;
        cur = next;
    }
    return pre;
}
```

-----

###### 题目示例9 `leetcode 147 对链表进行插入排序`

```java
private ListNode insertionSortList(ListNode head) {
    ListNode dummyHead = new ListNode(0);
    ListNode pre = dummyHead;
    ListNode cur = head;

    while(cur != null) {
        // 保存未排序部分的链表
        ListNode next = cur.next;
        // 确定插入位置
        while(pre.next != null && pre.next.val <= cur.val) {
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
public ListNode sortList(ListNode head) {
    return mergeSort(head);
}

/**
* 对链表进行归并排序
 */
private ListNode mergeSort(ListNode head) {
    // 递归终止条件
    if(head == null || head.next == null) {
        return head;
    }
    
    ListNode mid = getMid(head);
    ListNode secondHalf = mid.next;
    // 断开两个部分，避免链表成环
    mid.next = null;
    // 递归地对两部分链表进行排序
    ListNode firstHalf = mergeSort(head);
    secondHalf = mergeSort(secondHalf);
    // 将排序好的两条链表进行合并
    head = mergeTwoLists(firstHalf, secondHalf);
    return head;
}

/**
* 找到链表的中间节点
* 	当链表长度为2n时，中间节点就是从链表头部开始数第n个节点
* 	当链表长度为2n + 1时，中间节点就是第n + 1个节点
 */
private ListNode getMid(ListNode head) {
    ListNode slow = head;
    ListNode fast = head.next;
    while(fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}

/**
* 合并两个有序链表
 */
private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
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
    
    if(l1 != null) {
        runner.next = l1;
    } else if(l2 != null) {
        runner.next = l2;
    }
    return dummy.next;
}
```

----

###### 题目示例11 `leetcode 2 两数相加`

```java
private ListNode addTwoNumbers(ListNode l1, ListNode l2) {
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

###### 题目示例12 `leetcode 445 两数相加II`

```java
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int carry = 0;
    // 因为数字高位位于链表头部，而相加需要从尾部开始
    // 需要利用栈来进行“反转”
    Deque<Integer> stack1 = new LinkedList<Integer>();
    Deque<Integer> stack2 = new LinkedList<>();
    while(l1 != null) {
        stack1.addLast(l1.val);
        l1 = l1.next;
    }
    while(l2 != null) {
        stack2.addLast(l2.val);
        l2 = l2.next;
    }

    ListNode dummyHead = new ListNode(0);
    ListNode runner = dummyHead;
    while(!stack1.isEmpty() || !stack2.isEmpty() || carry > 0) {
        int num1 = stack1.isEmpty()? 0:stack1.removeLast();
        int num2 = stack2.isEmpty()? 0:stack2.removeLast();
        int temp = num1 + num2 + carry;
        int val = temp % 10;
        carry = temp / 10;
	    // 注意这里需要头插法
        ListNode node = new ListNode(val);
        node.next = dummyHead.next;
        dummyHead.next = node;
    }
    return dummyHead.next;
}
```

-----

##### 反转类题目

###### 题目示例1 `leetcode 206 反转链表`

```java
// 迭代方式反转
private ListNode reverseList(ListNode head) {
    ListNode pre = null;
    ListNode cur = head;
    while(cur != null) {
        ListNode next = cur.next;
        cur.next = pre;
        pre = cur;
        cur = next;
    }
    return pre;
}

// 递归方式反转
private ListNode reverseList(ListNode head) {
    if(head == null || head.next == null) {
        return head;
    }

    ListNode nextNode = head.next;
    ListNode newNode = reverseList(nextNode);
    nextNode.next = head;
    head.next = null;
    return newNode;
}
```

-----

###### 题目示例2 `leetcode 92 反转链表II`

```java
public ListNode reverseBetween(ListNode head, int m, int n) {
    // 使用哑节点方便处理头结点可能被反转的情况
    ListNode dummyHead = new ListNode(0);
    dummyHead.next = head;
    ListNode pre = dummyHead;
    ListNode newTail = dummyHead;

    // 1、定位到被反转部分的第一个节点及其前置节点
    for(int i = m; i > 0; i--) {
        pre = newTail;
        newTail = newTail.next;
        n--;
    }

    // 2、定位到被反转部分的最后一个节点及其后继节点
    ListNode newHead = newTail;
    for(int i = n; i > 0; i--) {
        newHead = newHead.next;
    }
    ListNode next = newHead.next;

    // 3、反转链表中的一部分
    pre.next = reverseBetween(newTail, next);
    newTail.next = next;
    return dummyHead.next;
}

/**
* 反转链表中[head, edge)划分的区间
 */
private ListNode reverseBetween(ListNode head, ListNode edge) {
    ListNode pre = null;
    ListNode cur = head;
    while(cur != edge) {
        ListNode next = cur.next;
        cur.next = pre;
        pre = cur;
        cur = next;
    }
    return pre;
}
```

----

###### 题目示例3 `leetcode 25 K个一组翻转链表`

```java
public ListNode reverseKGroup(ListNode head, int k) {
    if(head == null || k <= 0) {
        return head;
    }
	// 如果剩余链表的部分长度不足k,则不需要反转，直接返回
    ListNode next = head;
    for(int i = 0; i < k; i++) {
        if(next == null) {
            return head;
        }
        next = next.next;
    }

    ListNode newHead = reverseList(head, next);
    head.next = reverseKGroup(next, k);
    return newHead;
}

/**
* 翻转链表head中到b之前的部分
*/
private ListNode reverseList(ListNode head, ListNode edge) {
    ListNode pre = null;
    ListNode cur = head;
    while(cur != edge) {
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
    // 使用哑节点是为了一般化头结点被删除的特殊情况
    ListNode dummyHead = new ListNode(0);
    dummyHead.next = head;
    ListNode slow = dummyHead;
    ListNode fast = dummyHead;
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
    if(head == null) {
        return null;
    }

    ListNode dummyHead = new ListNode(0);
    ListNode pre = dummyHead;
    ListNode cur = head;
    boolean isDuplicate = false;
    while(cur != null && cur.next != null) {
        if(cur.val == cur.next.val) {
            // 当前元素与后继元素相等，移动指针
            cur = cur.next;
            isDuplicate = true;
        } else {
            if(isDuplicate) {
                // 当前元素与后继元素不相等，并且当前元素存在重复
                // 重置标记值，表示当前元素不需要再考虑
                isDuplicate = false;
            } else {
                // 当前元素与后继元素不相等，并且当前元素唯一
                // 在结果中存储当前元素
                pre.next = new ListNode(cur.val);
                pre = pre.next;
            }
            cur = cur.next;
        }
    }
    // 处理链表最后一个节点
    if(!isDuplicate) {
        pre.next = new ListNode(cur.val);
    }
    return dummyHead.next;
}
```

----

###### 题目示例4 `leetcode 141 环形链表`

```java
private boolean hasCycle(ListNode head) {
	if(head == null || head.next == null) {
        return false;
    }
    
    ListNode slow = head;
    ListNode fast = head;
    while(fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast) {
            return true;
        }
    }
    return false;
}
```

-----

###### 题目示例5  `leetcode 142 环形链表II`

```java
private ListNode detectCycle(ListNode head) {
    if(head == null || head.next == null) {
        return null;
    }

    ListNode slow = head;
    ListNode fast = head;
    while(fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast) {
            slow = head;
            while(slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
    }
    return null;
}
```

-----

###### 题目示例6 `leetcode 234 回文链表`

```java
public boolean isPalindrome(ListNode head) {
    if(head == null || head.next == null) {
        return true;
    }
    
    // 将链表切分成两半，并将第二部分反转
    ListNode preMid = getMiddle(head);
    ListNode secondHalf = preMid.next;
    preMid.next = null;
    secondHalf = reverse(secondHalf);

    // 比较两段链表元素
    while(head != null && secondHalf != null) {
        if(head.val != secondHalf.val) {
            return false;
        }
        head = head.next;
        secondHalf = secondHalf.next;
    }
    return true;
}

/** 
* 获取链表中点的前一个节点
* 链表个数为偶数，返回前半部分最后一个节点
* 链表个数为奇数，返回中点
*/
private ListNode getMiddle(ListNode head) {
    if(head == null) {
        return null;
    }

    ListNode slow = head;
    ListNode fast = head.next;
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
    ListNode pre = null;
    ListNode cur = head;
    while(cur != null) {
        ListNode next = cur.next;
        cur.next = pre;
        pre = cur;
        cur = next;
    }
    return pre;
}
```

-----

###### 题目示例7 `leetcode 328 奇偶链表`

```java
private ListNode oddEvenList(ListNode head) {
    if(head == null || head.next == null) {
        return head;
    }

    ListNode oddRunner = head;
    ListNode evenRunner = head.next;
    ListNode evenHead = head.next;
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

-----

###### 题目示例8 `剑指offer 22 链表中倒数第k个结点`

```java
private ListNode getKthFromEnd(ListNode head, int k) {
    if(head == null) {
        return head;
    }

    ListNode slow = head;
    ListNode fast = head;
    for(int i = 0; i < k; i++) {
        fast = fast.next;
    }

    while(fast != null) {
        slow = slow.next;
        fast = fast.next;
    }
    return slow;
}
```

-----

###### 题目示例9 `leetcode 876 链表的中间节点`

```java
private ListNode middleNode(ListNode head) {
    if(head == null || head.next == null) {
        return head;
    }

    ListNode slow = head;
    ListNode fast = head;
    while(fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}
```



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

参考题解：https://leetcode-cn.com/problems/plus-one-linked-list/solution/c-kuai-man-zhi-zhen-bu-fan-zhuan-lian-biao-by-kao-/

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

----

------

### 栈和队列

#### 栈

##### 题目示例1 `leetcode 155 最小栈`

```java
class MinStack  {

    private Deque<Integer> minStack;
    private Deque<Integer> dataStack;

    /** initialize your data structure here. */
    public MinStack() {
        this.minStack = new LinkedList<>();
        this.dataStack = new LinkedList<>();
    }

    public void push(int x)  {
        dataStack.addLast(x);
        if(minStack.isEmpty()) {
            minStack.addLast(x);
        } else {
            // 每次添加新元素时比较新元素与minStack栈顶元素的大小
            // 将较小者放入minStack
            int temp = Math.min(x, minStack.peekLast());
            minStack.addLast(temp);
        }
    }

    public void pop() {
        minStack.removeLast();
        dataStack.removeLast();
    }

    public int top() {
        return dataStack.peekLast();
    }

    public int getMin() {
        return minStack.peekLast();
    }
}
```

----

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
    if(s == null || s.length() < 2) {
        return false;
    }

    Deque<Character> stack = new LinkedList<>();
    for(char c : s.toCharArray()) {
        if(c == '(' || c == '[' || c == '{') {
            stack.addLast(c);
        } else {
            if(stack.isEmpty()) {
                return false;
            } else if(c == ')' && stack.peekLast() != '('
                      || c == ']' && stack.peekLast() != '['
                      || c == '}' && stack.peekLast() != '{') {
                return false;
            } 
            stack.removeLast();
        }
    }
    return stack.isEmpty();
}
```

------

##### 题目示例5 `leetcode 32 最长有效括号`

参考题解：https://leetcode-cn.com/problems/longest-valid-parentheses/solution/shou-hua-tu-jie-zhan-de-xiang-xi-si-lu-by-hyj8/

```java
public int longestValidParentheses(String s) {
    if(s == null || s.length() == 0) {
        return 0;
    }

    Deque<Integer> stack = new LinkedList<>();
    stack.addLast(-1);
    int res = 0;
    for(int i = 0; i < s.length(); i++) {
        if(s.charAt(i) == '(') {
            stack.addLast(i);
        } else {
            stack.removeLast();
            if(stack.isEmpty()) {
                stack.addLast(i);
            } else {
                res = Math.max(res, i - stack.peekLast());
            }
        }
    }
    return res;
}
```

---

##### 题目示例6 `leetcode 71 简化路径`

```java
/**
* 关键点: 碰到".."时如果栈非空则将栈顶元素弹出
* 如果当前元素非空并且不为"."或"..",则将当前元素入栈
 */
private String simplifyPath(String path) {
    Deque<String> stack = new LinkedList<>();
    String[] paths = path.split("/");
    for(String str : paths) {
        if(str.equals("..") && !stack.isEmpty()) {
            // 当前元素为"..",表示从当前位置返回上一层目录(即弹出栈顶元素)
            stack.removeLast();
        } else if(!str.isEmpty() && !str.equals(".") && !str.equals("..")){
            // 当前目录名合法且不可省略，则进入当前目录(将当前元素入栈)
            stack.addLast(str);
        }
    }

    String res = "";
    for(String s : stack) {
        res += "/" + s;
    }
    return res.isEmpty()? "/" : res;
}
```

-----

##### 题目示例7 `leetcode 225 用队列实现栈`

```java
/**
* 这里的实现方式是:将元素x入队后，把所有比x早入队的元素出队并依次重新入队
* 此时从队首到队尾的元素排列就等价于栈顶到栈底的元素排列，新加入的元素就是"栈顶元素"
 */
class MyStack {

    private Queue<Integer> queue;

    /** Initialize your data structure here. */
    public MyStack() {
        this.queue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.offer(x);
        for(int i = 0; i < queue.size() - 1; i++) {
            int temp = queue.poll();
            queue.offer(temp);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();
    }

    /** Get the top element. */
    public int top() {
        return queue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}
```

-----

##### 题目示例8  `leetcode 232  用栈实现队列`

```java
class MyQueue {

    private Deque<Integer> stack1;
    private Deque<Integer> stack2;

    /** Initialize your data structure here. */
    public MyQueue() {
        this.stack1 = new LinkedList<>();
        this.stack2 = new LinkedList<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.addLast(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(!stack2.isEmpty()) {
            return stack2.removeLast();
        } else if(!stack1.isEmpty()) {
            while(!stack1.isEmpty()) {
                int temp = stack1.removeLast();
                stack2.addLast(temp);
            }
            return stack2.removeLast();
        }
        return -1;
    }
    
    /** Get the front element. */
    public int peek() {
        if(!stack2.isEmpty()) {
            return stack2.peekLast();
        } else if(!stack1.isEmpty()) {
            while(!stack1.isEmpty()) {
                int temp = stack1.removeLast();
                stack2.addLast(temp);
            }
            return stack2.peekLast();
        }
        return -1;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
```

------

#### 队列

##### 题目示例1 `leetcode 622 设计循环队列`

```java
class MyCircularQueue {
    /**
    * queue：	存储队列元素
    * capacity：	队列最多可存放元素数量 + 1
    * front: 	 指向队列头部第一个有效数据的位置，即队首
    * rear: 	指向队列尾部(即最后一个有效数据)的下一个位置
    * 
    * 需要注意的可能导致越界的细节:
    * 1、指针后移的时候需要将当前索引 + 1，并取模：(index + 1) % capacity
    * 2、指针前移的时候，为了循环到数组末尾，需要先-1并加上数组长度，再对数
    *	 组长度取模 (index - 1 + capacity) % capacity
    * 
    * 队列为空的条件为: rear == front
    * 队列为满的条件为: (rear + 1) % capacity == front
    * 队首元素的下标为：front
    * 队尾元素的下标为: (rear - 1 + capacity) % capacity
    * 队列中的元素数量为: (rear - front + capacity) % capacity
     */
    private int front;
    private int rear;
    private int capacity;
    private int[] queue;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        this.front = 0;
        this.rear = 0;
        this.capacity = k + 1;
        this.queue = new int[capacity];
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull()) {
            return false;
        }

        queue[rear] = value;
        rear = (rear + 1) % capacity;
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()) {
            return false;
        }

        front = (front + 1) % capacity;
        return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty()) {
            return -1;
        }
        return queue[front];
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if(isEmpty()) {
            return -1;
        }

        return queue[(rear - 1 + capacity) % capacity];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return rear == front;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }
}
```

-----

##### 题目示例2 `leetcode 641 设计循环双端队列`

```java
class MyCircularDeque {

    private int capacity;
    private int front;
    private int rear;
    private int[] deQue;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        this.capacity = k + 1;
        this.deQue = new int[capacity];
        this.front = 0;
        this.rear = 0;
    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(isFull()) {
            return false;
        }

        front = (front - 1 + capacity) % capacity;
        deQue[front] = value;
        return true;
    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(isFull()) {
            return false;
        }

        deQue[rear] = value;
        rear = (rear + 1) % capacity;
        return true;
    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(isEmpty()) {
            return false;
        }

        front = (front + 1) % capacity;
        return true;
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(isEmpty()) {
            return false;
        }

        rear = (rear - 1 + capacity) % capacity;
        return true;
    }
    
    /** Get the front item from the deque. */
    public int getFront() {
        if(isEmpty()) {
            return -1;
        }
        return deQue[front];
    }
    
    /** Get the last item from the deque. */
    public int getRear() {
        if(isEmpty()) {
            return -1;
        }

        return deQue[(rear - 1 + capacity) % capacity];
    }
    
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return rear == front;
    }
    
    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }
}
```



---

#### 栈和队列的特殊应用1：单调栈/单调队列

##### 概念

---

###### 单调栈：

栈中存放的数据都是有序的，元素的分布从栈底到栈顶具有单调性，分为单调递增栈和单调递减栈两种

1. 单调递增栈就是元素的值由栈底到栈顶大小单调递增
- 单调递增栈可以找到左起第一个比当前数字小的元素
    - 如果栈是一个单调递增栈，**对于一个刚刚出栈的元素而言**，新的栈顶元素就是其左侧第一个小于自己的元素，即将入栈的元素就是右侧第一个小于自己的元素；如果元素出栈后栈为空表示自己左侧没有更小的元素，如果没有新元素将要入栈，表示自己右侧没有更小的元素。
    
2. 单调递减栈就是元素的值由栈底到栈顶大小单调递减
    - 单调递减栈可以找到左起第一个比当前数字大的元素
    - 如果栈是一个单调递减栈，**对于一个刚刚出栈的元素而言**，新的栈顶元素就是其左侧第一个大于自己的元素，即将入栈的元素就是右侧第一个大于自己的元素；如果元素出栈后栈为空表示自己左侧没有更大的元素，如果没有新元素将要入栈，表示自己右侧没有更大的元素。

单调栈里可以保存元素的值或者数组下标

单调栈维护的时间复杂度O(n),任何元素只会进出单调栈一次

构建栈的过程从数组的右侧开始时，可以找到当前元素右侧第一个更大或者更小的元素

###### 单调队列：

某些场景下栈底也需要维护，此时可能需要借助队列或双端队列实现，此时称为单调队列

根据题目大小变化元素的遍历顺序和不等号的方向即可

```java
// 一个简单的单调栈模板
Deque<Integer> stack = new LinkedList<>();
for(int i = 0; i < nums.length; i++) {
    while(!stack.isEmpty() && nums[i] <= nums[stack.peekLast()]) {
        stack.removeLast();
    }
    stack.addLast(i);
}
```

---

##### 单调栈典型题目

###### 题目示例 1 `leetcode 496 下一个更大元素I`

**寻找比当前元素更大的下一个元素**

```java
/** 
* 在nums2上，从右至左维护单调递减栈，获取每个数字的下一个更大元素
 */
private int[] nextGreaterElement(int[] nums1, int[] nums2) {
    Deque<Integer> monoStack = new LinkedList<>();
    int len2 = nums2.length;
    int len1 = nums1.length;
    Map<Integer, Integer> map = new HashMap<>();
    for(int i = len2 - 1; i >= 0; i--) {
        while(!monoStack.isEmpty() && nums2[i] >= monoStack.peekLast()) {
            monoStack.removeLast();
        }
        int temp = monoStack.isEmpty()? -1 : monoStack.peekLast();
        map.put(nums2[i], temp);
        monoStack.addLast(nums2[i]);
    }
    int[] res = new int[len1];
    for(int i = 0; i < len1; i++) {
        res[i] = map.get(nums1[i]);
    }
    return res;
}
```

---

###### 题目示例2 `leetcode 503 下一个更大元素II`

```java
/**
* 从右往左维护一个单调递减栈
 */
private int[] nextGreaterElements(int[] nums) {
    int len = nums.length;
    Deque<Integer> monoStack = new LinkedList<>();
    int[] res = new int[len];
    for(int i = 2 * len - 1; i >= 0; i--) {
        while(!monoStack.isEmpty() && nums[i%len] >= monoStack.peekLast()) {
            monoStack.removeLast();
        }
        res[i%len] = monoStack.isEmpty()? -1:monoStack.peekLast();
        monoStack.addLast(nums[i%len]);
    }
    return res;
}
```

---

###### 题目示例3 `leetcode 739 每日温度`

```java
/**
* 从右往左维护一个单调递减栈
 */
public int[] dailyTemperatures(int[] T) {
    int len = T.length;
    int[] res = new int[len];
    Deque<Integer> monoStack = new LinkedList<>();
    // 注意单调栈内存储的是下标，方便计算距离
    for(int i = len - 1; i >= 0; i--) {
        while(!monoStack.isEmpty() && T[i] >= T[monoStack.peekLast()]) {
            monoStack.removeLast();
        }
        res[i] = monoStack.isEmpty()? 0 : monoStack.peekLast() - i;
        monoStack.addLast(i);
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
    Deque<Integer> monoStack = new LinkedList<>();
    monoStack.addLast(0);
    // 构建单调栈的过程不做其他操作，因为要获得全局的一个单调结果
    int len = A.length;
    for(int i = 0; i < len; i++) {
        if(A[i] <= A[monoStack.peekLast()]) {
            monoStack.addLast(i);
        }
    }
    // 贪心策略，从最远的地方开始往回找
    int res = 0;
    for(int i = len - 1; i >= 0; i--) {
        while(!monoStack.isEmpty() && A[i] >= A[monoStack.peekLast()]) {
            res = Math.max(res, i - monoStack.removeLast());
        }
    }
    return res;
}
```

---

###### 题目示例5 `leetcode 42 接雨水`

```java
private int trap(int[] height) {
    if(height == null || height.length < 3) { 
        return 0;
    }

    int res = 0;
    Deque<Integer> monoStack = new LinkedList<>();
    for(int i = 0; i < height.length; i++) {
        // 维护一个递减栈
        while(!monoStack.isEmpty() && height[monoStack.peekLast()] < height[i]) {
            int bottomIndex  = monoStack.removeLast();
            // 栈顶元素与bottom相等时应该pop出栈，因为无法形成蓄水的凹槽
            while(!monoStack.isEmpty() && height[monoStack.peekLast()] == height[bottomIndex]) {
                monoStack.removeLast();
            }

            if(!monoStack.isEmpty()) {
                // leftEdge指向蓄水凹槽的左侧边界(此时height[leftEdge] > height[bottomIndex])
                // 蓄水凹槽的右边界即为i(此时height[i] > height[bottomIndex])
                // 左右边界围城的区间宽度为(i - leftEdge - 1),区间不包括两个边界点
                int leftEdge = monoStack.peekLast();
                res += (Math.min(height[leftEdge], height[i]) - height[bottomIndex]) * (i - leftEdge - 1);
            }
        }
        monoStack.addLast(i);
    }
    return res;
}
```

---

###### 题目示例 6 `leetcode 84 柱状图中最大的矩形`

```java
/**
* 对于一个刚刚出栈的元素item，设其高度为height
* 由于维护了栈的单调递增性质，可以知道此时的栈顶元素为item左侧最近的高度小于height的元素(即monoStack.peekLast())
* 此时即将入栈的元素则是item右侧最近的高度小于height的元素(即 i)
* 则两侧的元素围成的区间的宽度为(i - monoStack.peekLast() - 1),注意区间不包括这两个边界元素
* 这个区间的最小高度就是height.二者相乘即可得到这个区间内可以勾勒的最大矩形面积
 */
private int largestRectangleArea(int[] heights) {
    if(heights == null || heights.length == 0) {
        return 0;
    }
    
    // 在原数组前后各加上一个0，原数组边界元素也有了更小的元素
    int[] temp = new int[heights.length+2];
    System.arraycopy(heights, 0, temp, 1, heights.length);
    
    Deque<Integer> monoStack = new LinkedList<>();
    int maxArea = 0;
    for(int i = 0; i < temp.length; i++) {
        // 维护一个单调递增栈
        while(!monoStack.isEmpty() && temp[i] < temp[monoStack.peekLast()]) {
            int height = temp[monoStack.removeLast()];
            maxArea = Math.max(maxArea, height * (i - monoStack.peekLast() - 1));
        }
        monoStack.addLast(i);
    }
    return maxArea;
}
```

----

###### 题目示例7 `leetcode 85 最大矩形 `

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

###### 题目示例8 `leetcode 402 移掉K位数字`

```java
/**
* 前置条件：两个相同位数的数字大小关系取决于第一个不同的位的数的大小
* 因为结果的长度是确定的，所以应保证每个位都能放尽可能小的数字
* 删除数字的原则：
*	给定一个数字序列[D1, D2, ..Dn].如果数字D2小于其左邻居D1，应删除D1
 */
private String removeKdigits(String num, int K) {
    StringBuffer s = new StringBuffer();
    int n = num.length();
    int m = n - k;
    for(char c:num.toCharArray()) {
        // 维护一个“单调递增栈”
        while(k > 0 && s.length() > 0 && s.charAt(s.length() - 1) > c) {
            s.deleteCharAt(s.length() - 1);
            k--;
        }
        s.append(c);
    }
    // 删除多余部分
    s.delete(m, s.length());
    // 经过单调栈维护之后结果可能出现前导0，需要删除
    while(s.length() > 0 && s.charAt(0) == '0') {
        s.deleteCharAt(0);
    }
    return s.length() == 0? "0":s.toString();
}
```

---

###### 题目示例9 `leetcode 768 最多能完成排序的块II`

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

###### 题目示例10 `leetcode 901 股票价格跨度`

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

###### 题目示例11 `leetcode 1019 链表的下一个更大结点`

```java
private int[] nextLargerNodes(ListNode head) {
    if(head == null) {
        return new int[0];
    }

    // 遍历链表，将元素压入栈中，同时获得链表长度
    int len = 0;
    Deque<Integer> stack = new LinkedList<>();
    Deque<Integer> monoStack = new LinkedList<>();
    ListNode runner = head;
    while(runner != null) {
        stack.addLast(runner.val);
        runner = runner.next;
        len++;
    }

    // 从链表最后一个元素值开始往前操作，思路与leetcode 496相同
    // 这里同样需要维护一个单调递减栈
    int[] res = new int[len];
    int index = len - 1;
    while(!stack.isEmpty()) {
        int val = stack.removeLast();
        while(!monoStack.isEmpty() && val >= monoStack.peekLast()) {
            monoStack.removeLast();
        }
        res[index] = monoStack.isEmpty()? 0:monoStack.peekLast();
        index--;
        monoStack.addLast(val);
    }
    return res;
}
```

---

###### 题目示例12 `leetcode 1124 表现良好的最长时间段`

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

###### 题目示例14`leetcode 132模式`

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

-----

###### 题目示例15 `leetcode 316 去除重复字母`

```java
private String removeDuplicateLetters(String s) {
    if(s == null || s.length() < 2) {
        return s;
    }

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

        // 维护栈，当前元素比栈顶元素严格小时，当且仅当栈顶元素在之后
        // 还会出现时才舍弃栈顶元素
        while(!stack.isEmpty() && stack.peekLast() > curChar
              && lastAppearIndex[stack.peekLast() - 'a'] > i) {
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



##### 单调队列典型题目

###### 题目示例1 `leetcode 239 滑动窗口最大值`

```java
private int[] maxSlidingWindow(int[] nums, int k) {
    if(nums == null || k < 1 || nums.length < k) {
        return new int[0];
    }
    
    int len = nums.length;
    Deque<Integer> deque = new LinkedList<>();
    int[] res = new int[len - k + 1];
    int index = 0;
    for(int i = 0; i < len; i++) {
        while(!deque.isEmpty() && nums[i] > nums[deque.peekLast()]) {
            deque.removeLast();
        }
        deque.addLast(i);

        if(i - k >= deque.peekFirst()) {
            deque.removeFirst();
        }
        if(i >= k - 1) {
            res[index] = nums[deque.peekFirst()];
            index++;
        }
    }
    return res;
}
```

-----

### 并查集

参考：https://www.yuque.com/liweiwei1419/algo/ltd86x

#### 概念

##### 1、基础并查集代码

```java
class UnionFind {
    /**连通分量个数*/
    private int count;
    
    /**存储触点的父节点引用*/
    private int[] parent;
    
    /**记录根节点所代表的树的最大高度*/
    private int[] rank;
    
    /**
    * 构造器
     */
    public UnionFind(int n) {
        this.count = n;
       	this.parent = new int[n];
        this.rank = new int[n];
        for(int i = 0; i < n; i++) {
            // 初始时所有节点的父节点引用都指向自己
            parent[i] = i;	
            // 初始时每棵树都只有一个根节点，树高为1
            rank[i] = 1;	
        }
    }
    
    /**
    * 返回连通分量的个数
     */
    public int count() {
        return this.count;
    }
    
    /**
    * 找到指定触点的根节点
     */
    public int find(int k) {
        while(parent[k] != k) {
            // 路径压缩：隔代合并
            parent[k] = parent[parent[k]];
            k = parent[k];
        }
        return k;
    }
    
    /**
    * 检查两个触点代表的连通分量的连通性
     */
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }
    
    /**
    * 合并两个连通分量
     */
    public boolean union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        
        // 如果已经同属一个集合，不需要再合并
        if(pRoot == qRoot) {
            return false;
        }
        
        // 将“较小”的树放到较大的树下，保证合并后的分量树具有一定平衡性
        // “按秩合并”
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

###### 题目示例1 `leetcode 547 省份数量`

```java
// 求二维数组不相交集合的个数
public int findCircleNum(int[][] M) {
    int len = M.length;
    UnionFind uf = new UnionFind(len);
    for(int i = 0; i < len; i++) {
        for(int j = 0; j < i; j++) {
            // 由于无向连通图的对称性，只需要检查下半部分矩阵
            if(M[i][j] == 1) {
                uf.union(i, j);
            }
        }
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
    public boolean union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if(pRoot == qRoot) {
            return false;
        }

        // 将“较小”的树放到较大的树下，保证合并后的分量树具有一定平衡性
        int pRank = rank[pRoot];
        int qRank = rank[qRoot];
        if(pRank < qRank) {
            parent[pRoot] = qRoot;
        } else if(pRank > qRank) {
            parent[qRoot] = pRoot;
        } else {
            parent[pRoot] = qRoot;
            rank[qRoot]++;
        }
        this.count--;
        return true;
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
    private int count;
    private int[] parent;
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

    public int count() {
        return this.count;
    }

    public int find(int k) {
        while(parent[k] != k) {
            parent[k] = parent[parent[k]];
            k = parent[k];
        }
        return k;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public boolean union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if(pRoot == qRoot) {
            return false;
        }

        int pRank = rank[pRoot];
        int qRank = rank[qRoot];
	    if(pRank < qRank) {
            parent[pRoot] = qRoot;
        } else if(pRank > qRank) {
            parent[qRoot] = pRoot;
        } else {
            parent[pRoot] = qRoot;
            rank[qRoot]++;
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

    public int count() {
        return this.count;
    }

    public int find(int k) {
        while(parent[k] != k) {
            // 路径压缩
            parent[k] = parent[parent[k]];
            k = parent[k];
        }
        return k;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public boolean union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if(pRoot == qRoot) {
            return false;
        }

        // 将“较小”的树放到较大的树下，保证合并后的分量树具有一定平衡性
        int pRank = rank[pRoot];
        int qRank = rank[qRoot];
        if(pRank < qRank) {
            parent[pRoot] = qRoot;
        } else if(pRank > qRank) {
            parent[qRoot] = pRoot;
        } else {
            parent[pRoot] = qRoot;
            rank[qRoot]++;
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
        int x = equation.charAt(0) - 'a';
        int y = equation.charAt(3) - 'a';
        if(equation.charAt(1) == '=') {
            uf.union(x, y);
        }
    }

    for(String equation:equations) {
        int x = equation.charAt(0) - 'a';
        int y = equation.charAt(3) - 'a';
        if(equation.charAt(1) == '!' && uf.connected(x, y)) {
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
        int pRoot = find(p);
        int qRoot = find(q);
        if(pRoot == qRoot) {
            return false;
        }

        // 将“较小”的树放到较大的树下，保证合并后的分量树具有一定平衡性
        int pRank = rank[pRoot];
        int qRank = rank[qRoot];
        if(pRank < qRank) {
            parent[pRoot] = qRoot;
        } else if(pRank > qRank) {
            parent[qRoot] = pRoot;
        } else {
            parent[pRoot] = qRoot;
            rank[qRoot]++;
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
private int longestConsecutive(int[] nums) {
    int len = nums.length;
    if(len < 2) {
        return len;
    }


    UnionFind uf = new UnionFind(nums);
    // 每个数字都是一个长度为1的连续序列
    int res = 1;	
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
    /**key表示一个触点，value表示key所在连通分量的根节点*/
    private Map<Integer, Integer> parent;
    /**size维护以当前结点所在的连通分量的结点总数*/
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

    public int find(int i) {
        while(i != parent.get(i)) {
            parent.put(i, parent.get(parent.get(i)));
            i = parent.get(i);
        }
        return i;
    }

    public boolean contains(int x) {
        return parent.containsKey(x);
    }
    
    public int union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if(pRoot == qRoot) {
            return 0;
        }

        int pSize = size.get(pRoot);
        int qSize = size.get(qRoot);
        int sum = pSize + qSize;
        if(pSize < qSize) {
            parent.put(pRoot, qRoot);
            size.put(qRoot, sum);
        } else {
            parent.put(qRoot, pRoot);
            size.put(pRoot, sum);
        }
        return sum;
    }
}
```

------

###### 题目示例2 `leetcode 945 使数组唯一的最小增量`

```java
public int minIncrementForUnique(int[] A) {
    int len = A.length;
    if(len == 0) {
        return 0;
    }

    UnionFind unionFind = new UnionFind();
    int res = 0;
    for(int num:A) {
        if(unionFind.contains(num)) {
            int root = unionFind.find(num);
            int add = root + 1;
            res += (add - num);
            unionFind.init(add);
        } else {
            unionFind.init(add);
        }
    }
    return res;
}

private class UnionFind {
    /**
    * 代表元法，元素指向父亲节点
     */
    private int[] parent;

    /**
    * 构造函数
     */
    public UnionFind() {
        this.parent = new int[79999];
        Arrays.fill(parent, -1);
    }

    /**
    * 初始化并查集，添加新元素，新元素一定没有在集合中出现过
    * @param x 加入当前集合的元素一定会在加入后仍保持当前集合的性质
     */
    public void init(int x) {
        parent[x] = x;
        if(x > 0 && parent[x-1] != -1) {
            union(x, x - 1);
        }
        if(parent[x + 1] != -1) {
            union(x, x + 1);
        }
    }

    /**
    * 查看集合中是否已经存在该元素
     */
    public boolean contains(int x) {
        return parent[x] != -1;
    }

    /**
    * 返回不相交集合的代表元节点
     */
    public int find(int x) {
        while(parent[x] != x) {
            parent[x] = parent[parent[x]];
            x = parent[x];
        }
        return x;
    }

    /**
    * 合并两个不相交集合
     */
    public void union(int x, int y) {
        int rootx = find(x);
        int rooty = find(y);

        if(rootx < rooty) {
            parent[rootx] = rooty;
        }
        if(rooty < rootx) {
            parent[rooty] = rootx;
        }
    }
}
```



-----

------

### 堆/优先队列

这部分的题目重点还是在使用优先队列实现排列上，最重要的是学会在构建优先队列时**使用自定义的比较器**

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

##### 题目示例2 `leetcode 253 会议室II`

```java
/**
* 基于优先队列的解法
 */
private int minMeetingRooms(int[][] intervals) {
    // 自定义比较规则，将所有时间区间按照起始时间从小到大排列
    Arrays.sort(intervals, (o1, o2) -> (o1[0] - o2[0]));
    /**
    * 在小根堆中存储每个时间区间的结束时间，基于这样一个规则：
    * 堆顶元素是当前所有已经遍历过的时间区间里最早结束的时间，
    * 如果新遍历到的区间的起始时间大于等于堆顶元素，表示堆顶
    * 元素使用的会议室可以被当前区间使用；否则就要新增一个会
    * 议室，即将当前区间的结束时间加入到堆中
     */
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(int[] interval:intervals) {
        if(pq.isEmpty()) {
            // 没有已被分配的会议室，新增一个会议室
            pq.offer(interval[1]);
        } else if(pq.peek() <= interval[0]) {
            // 有会议已经结束，重用其会议室(将已经过期的会议删除)
            pq.poll();
            pq.offer(interval[1]);
        } else {
            // 没有会议室可以重用，新分配一个会议室
            pq.offer(interval[1]);
        }
    }
    return pq.size();
}
```

----

##### 题目示例3 `leetcode 23 合并升序链表`

```java
private ListNode mergeKLists(ListNode[] lists) {
    // 使用小根堆存储所有链表元素
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(ListNode list : lists) {
        while(list != null) {
            pq.offer(list.val);
            list = list.next;
        }
    }

    ListNode dummyHead = new ListNode(0);
    ListNode runner = dummyHead;
    while(!pq.isEmpty()) {
        int temp = pq.poll();
        runner.next = new ListNode(temp);
        runner = runner.next;
    }
    return dummyHead.next;
}
```

----

##### 题目示例4 `leetcode 215 数组中的第K个最大元素`

```java
private int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(int i = 0; i < nums.length; i++) {
        pq.offer(nums[i]);
        // 维护一个大小为k的小根堆
        if(pq.size() > k) {
            pq.poll();
        }
    }
    // 符合条件的元素就是最后的堆顶元素
    return pq.peek();
}
```

---

##### 题目示例5 `leetcode 295 数据流的中位数`

```java
class MedianFinder {

    private PriorityQueue<Integer> firstHalf;
    private PriorityQueue<Integer> secondHalf;
    private int dataSize;

    /** initialize your data structure here. */
    public MedianFinder() {
        this.firstHalf = new PriorityQueue<>((o1, o2) -> (o2 - o1));
        this.secondHalf = new PriorityQueue<>();
        this.dataSize = 0;
    }
    
    public void addNum(int num) {
        dataSize++;
        firstHalf.offer(num);
        secondHalf.offer(firstHalf.poll());
        if((dataSize & 1) != 0) {
            firstHalf.offer(secondHalf.poll());
        }
    }
    
    public double findMedian() {
        if(dataSize == 0 || dataSize % 2 == 0) {
            int a = firstHalf.peek();
            int b = secondHalf.peek();
            return (a + b) * 1.0 / 2;
        } else {
            return (double)firstHalf.peek();
        }
    }
}
```

-----

##### 题目示例6 `leetcode 347 前K个高频元素`

```java
public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < nums.length; i++) {
        map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }

    PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> (map.get(o1) - map.get(o2)));
    for(Integer item : map.keySet()) {
        pq.offer(item);
        if(pq.size() > k) {
            pq.poll();
        }
    }
    int[] res = new int[k];
    int index = 0;
    while(!pq.isEmpty()) {
        res[index] = pq.poll();
        index++;
    }
    return res;
}
```

----

##### 题目示例7 `leetcode 703 数据流中的第k大元素`

```java
private int capacity;
private PriorityQueue<Integer> pq;

public KthLargest(int k, int[] nums) {
    this.capacity = k;
    this.pq = new PriorityQueue<>();
    for(int i = 0; i < nums.length; i++) {
        pq.offer(nums[i]);
        if(pq.size() > k) {
            pq.poll();
        }
    }
}   

public int add(int val) {
    // 注意：必须先将val放入优先队列并删除可能的多余元素
    pq.offer(val);
    if(pq.size() > capacity) {
        pq.poll();
    }
    return pq.peek();
}
```

-----

##### 题目示例8 `leetcode 973 离原点最近的K个点`

```java
private int[][] kClosest(int[][] points, int K) {
    // 关键就是重写比较器
    PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
        @Override
        public int compare(int[] a, int[] b) {
            int d1 = a[0] * a[0] + a[1] * a[1];
            int d2 = b[0] * b[0] + b[1] * b[1];
            return d1 < d2? 1 : d1 == d2? 0 : -1;
        }
    });

    for(int[] point : points) {
        pq.offer(point);
        if(pq.size() > K) {
            pq.poll();
        }
    }
    int[][] res = new int[K][2];
    int index = 0;
    while(!pq.isEmpty()) {
        res[index] = pq.poll();
        index++;
    }
    return res;
}
```



------

-------

## 基础算法

------

-----

### 深度优先搜索

#### 概念

##### 1、沉岛思想

一般用于二维数组问题的DFS中，找到满足题意的点时，把该点的值更新（岛屿沉没），确保之后不会再访问

优点是递归流程不需要再自己设置和撤销访问标记

缺点是会修改输入

如果题目要求不能修改除符合条件的区域之外的内容，就要有相应的恢复操作，或者使用备份

------

#### 典型题目

##### 题目示例1 `leetcode 200 岛屿数量`

**沉岛思想，会改变输入**

```java
public int numIslands(char[][] grid) {
    int counter = 0;
    for(int i = 0; i < grid.length; i++) {
        for(int j = 0; j < grid[0].length; j++) {
            // 当前位置为陆地，探寻其他所有相邻的陆地并将其沉没
            if(grid[i][j] == '1' && dfs(grid, i, j) >= 1) {
                counter++;
            }
        }
    }
    return counter;
}

private int dfs(char[][] grid, int i, int j) {
    // 判断边界
    if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
        return 0;
    }
    // 当前位置为陆地，将其沉没，并向四周查看是否有其它陆地相连
    if(grid[i][j] == '1') {
        grid[i][j] = '0';
        return dfs(grid, i - 1, j) 
            + dfs(grid, i, j - 1) 
            + dfs(grid, i + 1, j) 
            + dfs(grid, i, j + 1) + 1;
    }
    // 当前位置为水域，不存在岛屿，返回0
    return 0;
}
```

------

##### 题目示例2  `leetcode 733 图像渲染`

**沉岛思想，会改变输入**

```java
public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    int oldVal = image[sr][sc];
    // 原始颜色和目标颜色相同时，直接返回，避免进入死循环
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
	
    // 在这里没有原始的沉岛操作，自己设置一个矩阵来
    // 进行沉岛操作
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

/**
* 检查当前位置是否可行
*/
private boolean check(int m, int n, int row, int col, int k, boolean[][] visited) {
    if(row >= 0 && row < m && col >= 0 && col < n && !visited[row][col])
        if(getDigitalSum(row) + getDigitalSum(col) <= k)
            return true;
    return false;
}

/**
* 获取当前坐标的数字和
*/
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
    if(grid == null || grid.length == 0) {
        return 0;
    }

    int res = 0;
    for(int i = 0; i < grid.length; i++) {
        for(int j = 0; j < grid[0].length; j++) {
            if(grid[i][j] == 1) {
                res = Math.max(res, dfs(grid, i, j));
            }
        }
    }
    return res;
}

private int dfs(int[][] grid, int i, int j) {
    if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
        return 0;
    }

    if(grid[i][j] == 1) {
        grid[i][j] = 0;
        return 1 + dfs(grid, i - 1, j)
            + dfs(grid, i, j - 1)
            + dfs(grid, i + 1, j)
            + dfs(grid, i, j + 1);
    }
    return 0;
}
```

-----

##### 题目示例5 `leetcode 1254 统计封闭岛屿的数目`

**沉岛思想**，**会改变输入**

参考题解：https://leetcode-cn.com/problems/number-of-closed-islands/solution/dian-xing-dao-yu-ti-dfsjie-ti-xi-jie-by-happyfire/

```java
public int closedIsland(int[][] grid) {
    if(grid == null || grid.length == 0)
        return 0;
    
    int res = 0;
    int m = grid.length, n = grid[0].length;
    for(int i = 0; i < m; i++)
        for(int j = 0; j < n; j++)
            // 当前位置为陆地，dfs遍历后返回false表示该位置无法到达
            // 边界，岛屿独立
            if(grid[i][j] == 0 && !dfs(grid, i, j))
                res++;
    return res;
}

/** 
* dfs判断岛屿是否到达边界,并将所有遍历过的陆地沉没
* 与边界相邻的岛屿最终因为到达边界而返回true
* 封闭的岛屿最终因为沉岛效应，返回false
* 根据dfs返回结果判断当前岛屿是否封闭
*/
private boolean dfs(int[][] grid, int i, int j) {
    // 到达边界
    if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length)
        return true;
    
    // 该位置已经被访问过或者是水域，不需要从此位置继续遍历
    // 返回false
    if(grid[i][j] != 0)
        return false;
    
    // 沉岛
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
    if(board == null || board.length == 0) {
        return;
    }

    int m = board.length;
    int n = board[0].length;
    for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {
            // 从边界开始，搜索所有与边界相连的岛屿，这些岛屿不可以被修改
            // 除此之外的所有岛屿都可以被修改
            boolean atEdge = (i == 0) || (i == m - 1) || (j == 0) || (j == n - 1);
            if(atEdge && board[i][j] == 'O') {
                dfs(board, i, j); 
            }
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
       || board[i][j] == 'X' || board[i][j] == '#') {
        return;
    }

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
            // 从太平洋洋逆流进到陆地
            if(i == 0 || j == 0) 
                dfs(matrix, pacific, i, j, matrix[i][j]);
            // 从大西洋逆流进陆地
            if(i == m - 1 || j == n - 1)
                dfs(matrix, atlantic, i, j, matrix[i][j]);
        }
    }
    
    // 在两个标记矩阵中都被标记为1的位置
    // 代表两个大洋都可以逆流到的位置
    for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {
            if(pacific[i][j] == 1 && atlantic[i][j] == 1)
                res.add(Arrays.asList(i, j));
        }
    }
    return res;
}

/**
* dfs寻找从大洋可以逆流到的位置
* @param matrix		表示大陆的二维矩阵
* @param ocean		标记矩阵
* @param i		    单元格横坐标
* @param j		    单元格纵坐标
* @param preVal		前一个访问的单元格的高度
*/
private void dfs(int[][] matrix, int[][] ocean, int i, int j, int preVal) {
       // 触碰到了边界
    if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length 
       // 已经流到过，不需要再试
       || ocean[i][j] == 1
       // 无法流动（注意这里是逆流）
       || matrix[i][j] < preVal) {
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
	
    /** 
    * 如果当前访问的结点深度与res.size()相等
    * 表示当前访问的结点是该层第一个被访问到的
    * 节点，又因为遍历顺序是根->右->左，所以
    * 该节点就是该层最右节点
     */
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
    preTraversal(root, "");
    return res;
}

/**
* 二叉树的先序遍历，存储遍历过程中从根节点到叶子节点的路径
* @param root
* @param s
* 这里传参使用String的原因是每次传入的都必须是一个新的独立的对象
*/
private void preTraversal(TreeNode root, String path) {
    if(root == null) {
        return;
    }

    path += Integer.toString(root.val);
    if(root.left == null && root.right == null) {
        res.add(path);
    }
    path += "->";
    preTraversal(root.left, path);
    preTraversal(root.right, path);
}
```

----

##### 题目示例11 `面试题 16.19 水域大小`

比较简单的`dfs`题目

```java
public int[] pondSizes(int[][] land) {
    int m = land.length;
    int n = land[0].length;
    if(m == 0 || n == 0) {
        return new int[0];
    }

    List<Integer> res = new LinkedList<>();
    for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {
            if(land[i][j] == 0) {
                int temp = dfs(land, i, j);
                res.add(temp);
            }
        }
    }

    int[] waters = new int[res.size()];
    for(int i = 0; i < res.size(); i++) {
        waters[i] = res.get(i);
    }
    Arrays.sort(waters);
    return waters;
}

/**
* dfs获得水域的大小
* 
* @param land 表示土地的矩阵
* @param i	  当前位置行坐标
* @param j	  当前位置列坐标
*/
private int dfs(int[][] land, int i, int j) {
    if(i < 0 || i >= land.length || j < 0 || j >= land[0].length || land[i][j] != 0) {
        return 0;
    }

    land[i][j] = 1;
    // 注意对角线方向也要搜索
    return 1 + dfs(land, i - 1, j)
        + dfs(land, i, j - 1)
        + dfs(land, i + 1, j)
        + dfs(land, i, j + 1)
        + dfs(land, i - 1, j - 1)
        + dfs(land, i - 1, j + 1)
        + dfs(land, i + 1, j - 1)
        + dfs(land, i + 1, j + 1);
}
```

----

##### 题目示例12 `leetcode 463 岛屿的周长`

```java
public int islandPerimeter(int[][] grid) {
    for(int i = 0; i < grid.length; i++) {
        for(int j = 0; j < grid[0].length; j++) {
            // 因为只有一个岛屿，所以通过DFS最终会把整个岛屿都沉没掉，可以在这里直接返回结果
            if(grid[i][j] == 1) {
                return dfs(grid, i, j);
            }
        }
    }
    return 0;
}

/**
* dfs遍历求出岛屿的周长，这里使用了沉岛思想
* 算法成功的关键：在DFS遍历过程中，每从一个岛屿方格走向一个非岛屿方格，周长加一
* 非岛屿方格包括了地图中的水域以及与网格边界相邻的外部区域
 */
private int dfs(int[][] grid, int row, int col) {
    if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == 0) {
        return 1;
    } else if(grid[row][col] != 1) {
        return 0;
    }

    grid[row][col] = 2;
    return dfs(grid, row - 1, col)
        + dfs(grid, row, col - 1)
        + dfs(grid, row + 1, col)
        + dfs(grid, row, col + 1);
}
```

-----

-----

### 二分搜索

#### 二分搜索讲解

##### 零、二分查找框架

```java
/** 
* 关键点一：分析二分查找算法时，不要出现else,而是把所有情况都用else if写清楚，这样可以清楚的展现所有细节
* 关键点二：为了防止计算mid时发生溢出，应使用 mid = left + (right - left) / 2来代替 mid = (right + left) / 2
 */
private int binarySearch(int[] nums, int target) {
    int left = 0;
    // 在这里right没有明写是因为在不同的情况下right可以有不同的取值
    int right = ...;
    
    while(...) {
        int mid = left + (right - left) / 2;
        if(nums[mid] == target) {
            ...;
        } else if(nums[mid] < target) {
            left = ...;
        } else if(nums[mid] > target) [
            right = ...;
        ]
    }
    return ...;
}
```

##### 一、寻找一个数（基本的二分搜索）

```java
/**
* 搜索一个数，如果存在，返回其索引，否则返回-1
 */
private int binarySearch(int[] nums, int target) {
    if(nums == null || nums.length == 0) {
        return -1;
    }
    
    int left = 0;
    int right = nums.length - 1;
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

**1、while循环中条件为left <= right ,而不是left < right 的原因**

因为初始化时`right`赋值为`nums.length - 1`,则每次搜索的区间为闭区间`[left, right]`,退出循环有两个可能：

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
    if(nums == null || nums.length == 0) {
        return -1;
    }
    
    int left = 0;
    int right = nums.length;
    while(left < right) {
        int mid = left + (right - left) / 2;
        if(nums[mid] >= target) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }
    // 循环的结束条件是left == right,所以也可以返回right
    return left; 
}
```

**1、while中条件为 left < right 而不是 left <= right的原因**

因为初始化时 `right`赋值为 `right = nums.length`而不是 `nums.length - 1`,其搜索区间为 `[left, right)`的左闭右开区间

`while(left < right)`的终止条件为 `left == right `,此时搜索区间 `[left, left)`为空，循环可以正确终止

在循环内，查找空间的每一步至少有2个元素，在存在目标元素的情况下，循环退出时，`left`和 `right`都指向同一个元素

**2、算法在数组中不存在target值的情况下返回结果的含义**

**左侧边界**的含义：**左侧边界的值表示数组中严格小于target的元素的数量**

![](../../../mdPics/1.jpg)

对于上图的数组，算法返回值为1，其含义可以理解为：`nums`中小于2的元素有1个

再比如有序数组 `nums = [2, 3, 5, 7]`,`target = 1`,算法返回值为0，表示： `nums`中小于1的元素有0个

再比如有序数组 `nums = [2, 3, 5, 7],target = 8` 算法返回值为4,表示： `nums`中小于8的元素有4个

可以看出，函数的返回值（即 `left`变量的值）取值范围为 `[0, nums.length]`,可以通过添加简单的代码来处理数组中不存在目标值的情况，当然，具体的返回值根据题目要求决定

```java
while(left < right) {
    // ...
}

if(left == nums.length || nums[left] != target) {
    return -1;
}
return left;
```

**3、`left = mid + 1, right = mid`的变化规律**

因为算法搜索区间为 `[left, right)`的半开半闭区间，当发现 `mid`对应位置不是目标值时，搜索区间应该为 `mid`分割的两个子区间 `[left, mid)`或 `[mid + 1, right)`

**4、算法搜索左侧边界的原理**

在 `nums[mid] == target`时，算法的处理方式为：

```java
if(nums[mid] >= target) {
    right = mid;
}
```

通过不断缩小搜索区间的上界，使得搜索区间不断向左收缩，达到锁定左侧边界的目的

**5、返回值设置为left的原因**

其实也可以设置为 `right`,因为循环的终止条件为 `left == right`，此时查找空间内只剩一个元素，再判断这个元素是否满足条件即可

---

##### 三、寻找右侧边界的二分查找

```java
private int rightBound(int[] nums, int target) {
    if(nums.length == 0) {
        return -1;
    }
    
    int left = 0;
    int right = nums.length;
    while(left < right) {
        int mid = left + (right - left) / 2;
        if(nums[mid] <= target) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    // 循环结束的条件是left == right,同时有left = mid + 1；返回值可以是left-1或right-1
    return left - 1;
}
```

**1、算法搜索右侧边界的原理**

```java
if(nums[mid] <= target) {
    left = mid + 1;
}
```

通过不断增大搜索区间的下界 `left`,使得搜索区间不断向右收缩，达到锁定右侧边界的目的

**2、返回值设置为left - 1的原因**

`while`循环终止的条件为 `left == right`,所以也可以返回 `right - 1`

由于在搜索右侧边界时有：

```java
if(nums[mid] <= target) {
    left = mid + 1;
}
```

所以有 `mid = left - 1`

**3、在数组中不存在目标值时的返回结果设置**

与左侧边界搜索相同，因为 `while`的终止条件为 `left == right`,也就是 left 的取值范围为 `[0, nums.length]`,可以添加如下代码处理边界条件

```java
while(left < right) {
    //...
}
if(left == 0 || nums[left - 1] != target) {
    return -1;
}
return left - 1;
```

----

##### 四、建议

- **搜索区间：**

    **当只需要搜索一个满足条件的元素而对位置没有要求时，使用左闭右闭的搜索区间；**

    **当搜索目标的位置也需要考虑时（比如边界元素），使用左闭右开的搜索区间**

- **边界：**

    **在使用左闭右闭的搜索区间时，一般左边界取第一个元素的下标，右边界取最后一个元素的下标**

    **在使用左闭右开的区间时，一般左边界取第一个元素的下标，右边界取最后一个元素的下标加一，如果最右侧元素也需要用于比较时，则右边界取最后一个元素的下标**

----

#### 典型题目

##### 题型1：二分求满足条件的元素下标/元素值

二分法确定**满足条件**的元素的下标/或元素本身

通常是在有序或者半有序的数组中查找特定元素

-----

###### 题目示例1 `leetcode 4 寻找两个有序数组的中位数`

```java
/**
* 参考官方题解
 */
private double findMedianSortedArrays(int[] nums1, int[] nums2) {
    if(nums1.length > nums2.length) {
        int[] temp = nums1;
        nums1 = nums2;
        nums2 = temp;
    }

    int len1 = nums1.length;
    int len2 = nums2.length;
    int halfMember = (len1 + len2 + 1) / 2;

    /**
    * 在nums1搜索区间[0, len1]内搜索分割线的位置，使得分割线两侧元素数量相等
    * 或者左侧元素数量比右侧元素数量多1，并且满足如下的交叉比较关系：
    *   nums1[left-1] <= nums2[right] && nums2[right - 1] <= nums1[left]
     */
    int left = 0;
    int right = len1;
    while(left < right) {
        // i表示分割线在第一个数组左边的元素个数
        int i = left + (right - left) / 2;
        // j表示分割线在第二个数组右边的元素的个数
        int j = halfMember - i;
        // 分割线左右两侧元素需要满足交叉比较条件
        if(nums2[j-1] > nums1[i]) {
            // 下一轮搜索区间[i+1, right]
            left = i + 1;
        } else {
            // 下一轮搜索区间[left, i]
            right = i;
        }
    }
    int i = left;
    int j = halfMember - i;
    int nums1LeftMax = i == 0? Integer.MIN_VALUE : nums1[i-1];
    int nums1RightMin = i == len1? Integer.MAX_VALUE : nums1[i];
    int nums2LeftMax = j == 0? Integer.MIN_VALUE : nums2[j-1];
    int nums2RightMin = j == len2? Integer.MAX_VALUE : nums2[j];
    if((len1 + len2) % 2 == 1) {
        return Math.max(nums1LeftMax, nums2LeftMax);
    } else {
        return ((double)(Math.max(nums1LeftMax, nums2LeftMax) + Math.min(nums1RightMin, nums2RightMin)) / 2);
    }
}
```
----

###### 题目示例2 `leetcode 33 搜索旋转排序数组`

**要求：时间复杂度为O(logN),只能用二分查找**

```java
/*
* 重点就是在判断mid分割出的两个搜索区间哪个是有序的，先去有序的部分搜索
* 由于题目说数字了无重复，举个例子：
* 	设原数组为：1 2 3 4 5 6 7 ，旋转情况可以大致分为两类
* 	第一类 2 3 4 5 6 7 1 这种，也就是 nums[start] <= nums[mid]。此例子中就是 2 < 5。
* 	这种情况下，前半部分有序。因此如果 nums[start] <= target < nums[mid]，则在前半部分找，否则去后半部分找。
* 	第二类 6 7 1 2 3 4 5 这种，也就是 nums[start] > nums[mid]。此例子中就是 6 > 2。
* 	这种情况下，后半部分有序。因此如果 nums[mid] < target <= nums[end]，则在后半部分找，否则去前半部分找
 */
private int search(int[] nums, int target) {
    if(nums == null || nums.length == 0) {
        return -1;
    }
    
    int left = 0;
    int right = nums.length - 1;
    while(left <= right) {
        int mid = left + (right - left) / 2;
        if(nums[mid] == target) {
            return mid;
        }

        // 小于等于号是为了适应只有两个元素的特殊情况
        // 当只剩两个元素时(mid = left + (right - left)) == left	
        if(nums[left] <= nums[mid]) {
            // 前半部分有序且目标在范围内，则搜索范围为前半部分
            // 否则搜索范围为后半部分
            if(nums[left] <= target && target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        } else {
            // 后半部分有序且目标在范围内，则搜索范围为后半部分
            // 否则搜索范围为前半部分
            if(nums[mid] < target && target <= nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }
    // 由循环条件可知，当循环退出时搜索区间已经没有元素，并且到达此处表示不存在目标元素
    // 所以只能返回-1
    return -1;
}
```
----

###### 题目示例3 `leetcode 34 在排序数组中查找元素的第一个和最后一个位置`

```java
/** 
* 左右边界查找算法的综合使用
 */
public int[] searchRange(int[] nums, int target) {
    if(nums == null || nums.length == 0) {
        return -1;
    }
    int first = leftBound(nums, target);
    int right = rightBound(nums, target);
    return new int[]{first, right};
}

/**
* 寻找元素的左侧边界
*/
private int leftBound(int[] nums, int target) {
    int left = 0;
    int right = nums.length;
    while(left < right) {
        int mid = left + (right - left) / 2;
        if(nums[mid] >= target) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }

    if(left == nums.length || nums[left] != target) {
        return -1;
    }
    return left;
}

/**
* 寻找元素的右侧边界
*/
private int rightBound(int[] nums, int target) {
    int left  = 0;
    int right = nums.length;
    while(left < right) {
        int mid = left + (right - left) / 2;
        if(nums[mid] <= target) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }

    if(left == 0 || nums[left - 1] != target) {
        return -1;
    }
    return left - 1;
}
```

----

###### 题目示例4 `leetcode 35 搜索插入位置`

```java
/**
* 本质是搜索元素的左边界
 */
private int searchInsert(int[] nums, int target) {
    if(nums == null || nums.length == 0) {
        return 0;
    }
    
    int left = 0;
    int right = nums.length;
    while(left < right) {
        int mid = left + (right - left) / 2;
        if(nums[mid] >= target) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }
    return left;
}
```
------

###### 题目示例5 `leetcode 74 搜索二维矩阵`

```java
/** 
* 普通二分搜索问题
* 关键：将二维矩阵上的搜索转化为一维矩阵上的搜索
*/
private boolean searchMatrix(int[][] matrix, int target) {
    if(matrix == null || matrix.length == 0) {
        return false;
    }

    int rowLen = matrix.length;
    int colLen = matrix[0].length;
    int start = 0;
    int end = rowLen * colLen - 1;
    while(start <= end) {
        int mid = start + (end - start) / 2;
        int curVal = matrix[mid / colLen][mid % colLen];
        if(curVal == target) {
            return true;
        } else if(curVal < target) {
            start = mid + 1;
        } else if(curVal > target) {
            end = mid - 1;
        }
    }
    return false;
}
```

----

###### 题目示例6 `leetcode 81 搜索旋转排序数组II`

```java
/**
* 举例如下：
* 第一类
* 1011110111 和 1110111101 这种。此种情况下 nums[start] == nums[mid]，分不清到底是前面有序还是后面有序
* 此时 start++ 即可。相当于去掉一个重复的干扰项。
* 第二类
* 22 33 44 55 66 77 11 这种，也就是 nums[start] < nums[mid]。此例子中就是 22 < 55；
* 这种情况下，前半部分有序。因此如果 nums[start] <= target < nums[mid]，则在前半部分找，否则去后半部分找。
* 第三类
* 66 77 11 22 33 44 55 这种，也就是 nums[start] > nums[mid]。此例子中就是 66 > 22；
* 这种情况下，后半部分有序。因此如果 nums[mid] < target <= nums[end]。则在后半部分找，否则去前半部分找。
*/
private boolean search(int[] nums, int target) {
    if(nums == null || nums.length == 0) {
        return false;
    }
    
    int left = 0;
    int right = nums.length - 1;
    while(left <= right) {
        int mid = left + (right - left) / 2;
        if(nums[mid] == target) {
            return true;
        }
        
        // 无法判断哪部分有序时，直接移动左边界
        if(nums[left] == nums[mid]) {
            left++;
        } else if(nums[left] < nums[mid]) {
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

###### 题目示例7  `leetcode 153 寻找旋转排序数组中的最小值`

```java
private int findMin(int[] nums) {
    if(nums == null || nums.length == 0) {
        return -1;
    }
    
    int left = 0;
    // 这里使用了两端闭合的搜索区间，是为了方便比较右值
    int right = nums.length - 1;
    while(left < right) {
        int mid = left + (right - left) / 2;
        if(nums[mid] > nums[right]) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    // 循环结束时，left和right都指向了最小元素
    return nums[left];
}
```

-----

###### 题目示例8 `leetcode 154 寻找旋转排序数组中的最小值II`

```java
private int findMin(int[] nums) {
    if(nums == null || nums.length <= 0) {
        return -1;
    }
    
    int left = 0;
    int right = nums.length - 1;
    while(left < right) {
     int mid = left + (right - left) / 2;
        if(nums[mid] < nums[right]) {
            right = mid;
        } else if(nums[mid] > nums[right]) {
            left = mid + 1;
        } else {
            // 当[mid]和[right]相等时，最小值可能在mid左边也可能在右边
            // 此时可以直接将[right]去除，因为[right]和[mid]作用是相同的
            right--;
        }
    }
    return nums[left];
}
```
------

###### 题目示例9 `leetcode 162 寻找峰值`

```java
/**
* 过程：
* 首先要注意题目条件，在题目描述中出现了 nums[-1] = nums[n] = -∞，这就代表着：只要数组中存在一个元素比相邻元素大，那么沿着它一定可以找到一个峰值
* 根据上述结论，我们就可以使用二分查找找到峰值
* 查找时，左指针 l，右指针 r，以其保持左右顺序为循环条件
* 根据左右指针计算中间位置 m，并比较 m 与 m+1 的值，如果 m 较大，则左侧存在峰值，r = m;如果 m + 1 较大，则右侧存在峰值，l = m + 1
 */
private int findPeakElement(int[] nums) {
    int left = 0;
    // 因为比较过程可能会需要右值，所以搜索区间为闭区间
    int right = nums.length - 1;
    while(left < right) {
        int mid = left + (right - left) / 2;
        if(nums[mid] < nums[mid + 1]) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    return left;
}
```
-----

###### 题目示例10 `leetcode 275 H指数II`

```java
/**
* 关键：返回一个数据区间的长度，该区间中最小的值大于等于该区间的长度
* 即citations[mid] >= len - mid，取满足条件的mid的最小值
 */
private int hIndex(int[] citations) {
    if(citations == null || citations.length == 0 || citations[citations.length - 1] == 0) {
        return 0;
    }
    
    int len = citations.length;
    int left = 0;
    int right = len;
    while(left < right) {
        int mid = left + (right - left) / 2;
        if(citations[mid] < len - mid) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    return len - left;
}
```
------

###### 题目示例11 `leetcode 278 第一个错误的版本`

```java
/**
* 寻找true的左侧边界
 */
private int firstBadVersion(int n) {
    int left = 1;
    int right = n;
    while(left < right) {
        int mid = left + (right - left) / 2;
        if(isBadVersion(mid)) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }
    return left;
}
```
----

###### 题目示例12 `leetcode 378 有序矩阵中第k小的元素`

```java
public int kthSmallest(int[][] matrix, int k) {
    int n = matrix.length;
    int start = matrix[0][0];
    int end = matrix[n-1][n-1];
    while(start < end) {
        int mid = start + (end - start) / 2;
        if(check(matrix, k, mid, n)) {
            end = mid;
        } else {
            start = mid + 1;
        }
    }
    return end;
}

/**
* 计算出当前元素的“左上方”的元素数量，左上方的元素满足元素值大于等于
* 当前元素
 */
private boolean check(int[][] matrix, int k, int mid, int n) {
    int i = n - 1;
    int j = 0;
    int count = 0;
    while(i >= 0 && j < n) {
        if(matrix[i][j] <= mid) {
            count += i + 1;
            j++;
        } else {
            i--;
        }
    }
    return count >= k;
}
```

----

###### 题目示例13 `leetcode 436 寻找右区间`

```java
public int[] findRightInterval(int[][] intervals) {
    if(intervals == null || intervals.length == 0) {
        return new int[0];
    }
    
    int len = intervals.length;
    int[] start = new int[len];
    int[] res = new int[len];
    Map<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < len; i++) {
        start[i] = intervals[i][0];
        map.put(start[i], i);
    }
    Arrays.sort(start);

    // 以区间的终点为目标元素在排序好的节点数组中进行二分查找，寻找第一个大于等于
    // 目标元素的数组元素的下标
    for(int i = 0; i < len; i++) {
        int index = leftBound(start, intervals[i][1]);
        if(index == -1) {
            res[i] = -1;
        } else {
            res[i] = map.get(start[index]);
        }
    }
    return res;
}

/**
* 寻找nums中第一个大于等于target的元素下标
* 在这个问题中等价于求target的左边界
* 与模板中的求左边界问题有区别，注意区分，不要乱套模板
 */
private int search(int[] nums, int target) {
    int left = 0;
    int right = nums.length;
    while(left < right) {
        int mid = left + (right - left) / 2;
        if(nums[mid] >= target) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }
    if(left == nums.length) {
        return -1;
    }
    return left;
}
```



###### 题目示例14 `leetcode 611 有效三角形的个数`

```java
/**
* 二分法的解决流程：
* 	1、对数组进行非递减排序
* 	2、固定最短的两条边，并在右侧的剩余元素中使用二分查找寻找第一个大于两边之和的位置
*	  枚举结束后，总和就是答案
*
* 此问题使用二分法解决的时间复杂度为O(n^2 * log2n),并不是最优解
* 最优解应该使用双指针
 */

public int triangleNumber(int[] nums) {
    if(nums == null || nums.length == 0) {
        return 0;
    }

    int len = nums.length;
    Arrays.sort(nums);
    int res = 0;
    for(int i = 0; i < len - 2; i++) {
        for(int j = i + 1; j < len - 1; j++) {
            int k = searchFirstEOrL(nums, j + 1, len - 1, nums[i] + nums[j]);
            if(k == -1) {
                // 此时区间[j+1, len - 1]内所有元素都可以与前两条边构成三角形
                // 可以构成的三角形数量为(len-1) - (j+1) + 1 = len - j - 1
                res += (len - j - 1);
            } else {
                // 此时区间[j+1, k-1]内所有元素可以与前两条边构成三角形
                // 可以构成的三角形数量为(k-1) - (j-1) + 1 = k - j - 1
                res += (k - j - 1);
            }
        }
    }
    return res;
}

/**
* 在有序数组nums的子区间[left, right]内找到第一个大于等于target的元素的位置
* 如果元素存在返回其下标，否则返回-1
 */
private int searchFirstEOrL(int[] nums, int left, int right, int target) {
    while(left < right) {
        int mid = left + (right - left) / 2;
        if(nums[mid] >= target) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }
    if(nums[left] < target) {
        return -1;
    }
    return left;
}
```

----

###### 题目示例15 `leetcode 658 找到k个最接近的元素`

```java
/**
* 使用二分查找寻找包括了k个元素的区间的左边界left, 使得[left, left + k - 1]
* 内的所有元素满足“最靠近”x的条件
*
* 在二分查找中，mid定义为当前的左边界，则划分的区间为[mid, mid + k - 1],如果
* arr[mid]与x的距离比arr[mid+k]与x的距离要大，则真正的左边界应该在mid右侧
 */

private List<Integer> findClosestElements(int[] arr, int k, int x) {
    int len = arr.length;
    int left = 0;
    // 左边界的最大可能值为len - k
    int right = len - k;
    while(left < right) {
        int mid = left + (right - left) / 2;
        if(x - arr[mid] > arr[mid + k] - x) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }

    List<Integer> res = new LinkedList<>();
    for(int i = left; i < left + k; i++) {
        res.add(arr[i]);
    }
    return res;
}
```
###### 题目示例16 `leetcode 704 二分查找`

```java
private int search(int[] nums, int target) {
    if(nums == null || nums.length == 0) {
        return -1;
    }
    
    int left = 0;
    int right = nums.length - 1;
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
-----

###### 题目示例17 `leetcode 744 寻找比目标字母大的最小字母`

```java
/**
* 思路分析：
* 1、对下标做二分，找到第一个大于target值的下标
* 2、target可能比letters中所有字符都小，也可能比letters中所有字符都大,
*   因此第一个大于target值的下标的取值范围为[0, letters.size()]，因
*   此初始化left = 0, right = letters.size();
* 3、当left == right时退出， 因此循环条件为 left < right
* 4、当letters[mid] > target时， mid是可能结果，大于mid的都可以舍弃，此时right = mid
* 5、当letters[mid] <= target时， mid不在候选集中，因此left = mid+1, 舍弃小于等于mid的下标
* 6、当循环退出时，left = right = 待选下标， 注意当targets大于letters中所有元素时， 
*	left = letters.size()，此* 时要返回letters[0];
 */
private char nextGreatestLetter(char[] letters, char target) {
    int left = 0;
    int right = letters.length;
    while(left < right) {
        int mid = left + (right - left) / 2;
        if(letters[mid] > target) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }
    if(left == letters.length) {
        return letters[0];
    }
    return letters[left];
}
```

-----

###### 题目示例18 `leetcode 911 在线选举`

```java
/**
* 题目分析可以参考：https://leetcode-cn.com/problems/online-election/solution/you-bu-fen-ren-ti-mu-mei-you-du-ming-bai-by-pom
 */
private int[] persons;
private int[] times;
private int[] maxVoteCounts;

public TopVotedCandidate(int[] persons, int[] times) {
    this.persons = persons;
    this.times = times;
    int len = persons.length;
    this.maxVoteCounts = new int[len];

    int[] count = new int[len + 1];
    int curMaxVote = 1;
    int curMaxCandi = persons[0];
    for(int i = 0; i < len; i++) {
        count[persons[i]]++;
        if(count[persons[i]] >= curMaxVote) {
            curMaxVote = count[persons[i]];
            curMaxCandi = persons[i];
        }
        maxVoteCounts[i] = curMaxCandi;
    }
}

/**
* 使用二分查找寻找数组中第一个大于t的元素的位置
 */
public int q(int t) {
    int left = 0;
    int right = times.length;
    while(left < right) {
        int mid = left + (right - left) / 2;
        if(times[mid] > t) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }
    return maxVoteCounts[left-1];
}
```

-----

###### 题目示例19  `leetcode 1095 山脉数组中查找目标值`

```java
/**
* 1、这道题目涉及三次可能的二分搜索：在数组中查找最大值的索引、在递增序列查找目标值、在递减序列查找目标值
* 2、基本的搜索规则与常见的二分搜索题目并没有区别，唯一需要注意的地方是：题目要求对mountainArr接口的调用
* 	次数需要尽可能少，所以在二分搜索时，循环条件都是(left < right). 这样做的意义是：每次排除目标元素不可
*	能存在的区间，在只剩一个元素时退出循环并判断元素是否与目标值相等，则每个循环内部只需要调用一次接口。如
*	果使用(left <= right)的条件，则每次循环都需要至少调用两次接口
 */
public int findInMountainArray(int target, MountainArray mountainArr) {
    int len = mountainArr.length();
    if(len < 3) {
        return -1;
    }

    int topIndex = findTopIndex(mountainArr, 0, len - 1);
    int left = searchLeftSpace(mountainArr, 0, topIndex, target);
    if(left != -1) {
        return left;
    }
    return searchRightSpace(mountainArr, topIndex + 1, len - 1, target);
}

/**
* 在山脉数组中查找最大值
 */
private int findTopIndex(MountainArray mountainArr, int left, int right) {
    while(left < right) {
        int mid = left + (right - left) / 2;
        if(mountainArr.get(mid) < mountainArr.get(mid + 1)) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    return left;
}

/**
* 在递增序列中查找目标值
 */
private int searchLeftSpace(MountainArray mountainArr, int left, int right, int target) {
    while(left < right) {
        int mid = left + (right - left) / 2;
        if(mountainArr.get(mid) < target) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    if(mountainArr.get(left) != target) {
        return -1;
    }
    return left;
}

/**
* 在递减序列中查找目标值
 */
private int searchRightSpace(MountainArray mountainArr, int left, int right, int target) {
    while(left < right) {
        int mid = left + (right - left) / 2;
        if(mountainArr.get(mid) > target) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    if(mountainArr.get(left) != target) {
        return -1;
    }
    return left;
}
```

------

##### 题型二： 二分确定一个有范围的整数

###### 题目示例1 `leetcode 69 x的平方根`

```java
/**
* 二分法寻找小于x的真正平方根的最大整数值
 */
private int mySqrt(int x) {
    int left = 0;
    int right = x;
    int res = -1;
    while(left <= right) {
        int mid = left + (right - left) / 2;
        if((long)mid * mid <= x) {
            res = mid;
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return res;
}
```

----

###### 题目示例2 `leetcode 287 寻找重复数`

```java
/**
* 根据抽屉原理，如果在[left, right]内小于等于mid的元素个数严格大于mid
* 则[left, mid]内可能存在重复元素；否则重复元素可能存在与[mid + 1, right]
* 范围内
* 
* 具体分析参考liweiwei的leetcode题解
 */
private int findDuplicate(int[] nums) {
    if(nums == null || nums.length == 0) {
        return -1;
    }

    int len = nums.length;
    int left = 0;
    int right = nums.length;
    while(left < right) {
        int mid = left + (right - left) / 2;
        int count = 0;
        // 统计数组中小于等于mid的元素个数
        for(int num : nums) {
            if(num <= mid) {
                count++;
            }
        }

        if(count > mid) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }
    return left;
}
```

----

###### 题目示例3 `leetcode 374 猜数字大小`

```java
private int guessNumber(int n) {
    int left = 1;
    int right = n;
    while(left <= right) {
        int mid = left + (right - left) / 2;
        int res = guess(mid);
        if(res == 0) {
            return mid;
        } else if(res == -1) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }
    return -1;
}
```

-----

###### 题目示例4 `leetcode 1283 使结果不超过阈值的最小除数`

```java
/**
* 根据题目条件，除数的取值范围为[1, maxVal]，maxVal是数值中元素最大值
 */
private int smallestDivisor(int[] nums, int threshold) {
    int maxDivisor = 1;
    for(int num : nums) {
        maxDivisor = Math.max(maxDivisor, num);
    }

    int left = 1;
    int right = maxDivisor;
    while(left < right) {
        int mid = left + (right - left) / 2;
        if(calDividedSum(nums, mid) > threshold) {
            // 除法结果之和大于threshold,则结果一定
            // 不在[left, mid]内
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    return left;
}

private int calDividedSum(int[] nums, int divisor) {
    int res = 0;
    for(int num : nums) {
        res += num / divisor;
        if(num % divisor != 0) {
            res++;
        }
    }
    return res;
}
```

------

##### 题型三 复杂的判别函数(最大值极小化问题)

###### 题目示例1  `leetcode 410 分割数组的最大值`

```java
public int splitArray(int[] nums, int m) {
    int minSum = 0;
    int maxSum = 0;
    for(int num : nums) {
        minSum = Math.max(minSum, num);
        maxSum += num;
    }

    int left = minSum;
    int right = maxSum;
    while(left < right) {
        int mid = left + (right - left) / 2;
        if(split(nums, mid) > m) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    return left;
}

private int split(int[] nums, int maxIntervalSum) {
    int split = 1;
    int curIntervalSum = 0;
    for(int num : nums) {
        if(curIntervalSum + num > maxIntervalSum) {
            split++;
            curIntervalSum = 0;
        }
        curIntervalSum += num;
    }
    return split;
}
```

----

###### 题目示例2 `leetcode 875 爱吃香蕉的珂珂`

```java
public int minEatingSpeed(int[] piles, int H) {
    int maxHour = 1;
    for(int pile : piles) {
        maxHour = Math.max(maxHour, pile);
    }

    int left = 1;
    int right = maxHour;
    while(left < right) {
        int mid = left + (right - left) / 2;
        if(calculateTime(piles, mid) > H) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    return left;
}

private int calculateTime(int[] piles, int speed) {
    int sum = 0;
    for(int pile : piles) {
        sum += (pile + speed - 1) / speed;
    }
    return sum;
}
```

-----

###### 题目示例3 `leetcode 1011 在D天内送达包裹的能力`

```java
public int shipWithinDays(int[] weights, int D) {
    int left = 0;
    int right = Integer.MAX_VALUE;
    while(left < right) {
        int mid = left + (right - left) / 2;
        if(canShip(weights, D, mid)) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }
    return left;
}

private boolean canShip(int[] weights, int D, int capacity) {
    int curCapacity = capacity;
    for(int weight : weights) {
        if(weight > capacity) {
            return false;
        }
        if(curCapacity < weight) {
            curCapacity = capacity;
            D--;
        }
        curCapacity -= weight;
    }
    return D > 0;
}
```

-----

###### 题目示例4 `leetcode 1482 制作m束花所需的最少天数`

```java
public int minDays(int[] bloomDay, int m, int k) {
    if(bloomDay == null || bloomDay.length == 0) {
        return -1;
    }

    int len = bloomDay.length;
    if(m * k > len) {
        return -1;
    }

    int end = 0;
    for(int day : bloomDay) {
        end = Math.max(end, day);
    }
    int start = 0;
    while(start < end) {
        int mid = start + (end - start) / 2;
        int temp = getCount(bloomDay, mid, k);
        if(temp >= m) {
            end = mid;
        } else {
            start = mid + 1;
        }
    }
    return start;
}

private int getCount(int[] bloomDay, int mid, int k) {
    int counter = 0;
    int res = 0;
    for(int day : bloomDay) {
        if(day <= mid) {
            counter++;
        } else {
            counter = 0;
        }

        if(counter == k) {
            res++;
            counter = 0;
        }
    }
    return res;
}
```

------

###### 题目示例5 `leetcode 1552 两球之间的磁力`

```java
/**
* to-do 
 */
```



### 动态规划

#### 矩阵类型( 10% )

##### 题目示例1 `leetcode 64 最小路径和`

```java

```

##### 题目示例2 `leetcode 62 不同路径`

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

##### 题目示例3 `leetcode 63 不同路径II`

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

##### 题目示例1 `leetcode 70 爬楼梯`

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

##### 题目示例2 `leetcode 55跳跃游戏`

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

##### 题目示例3 `leetcode 45跳跃游戏II`

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

##### 题目示例4 `leetcode 132 分割回文串`

```java
// dp[i]表示字符串前i个字符组成的子字符串需要的最少分割次数
// base case : dp[0] = -1;
// return: dp[s.length()-1]
private int minCut( String s )
{
    
}
```

-----

##### 题目示例6 `leetcode 139 单词拆分`

```java
/**
* dp[i]表示字符串前i个字符是否可以拆分成字典中的单词
* 状态转移方程: dp[i] = dp[j] & set.contains(s.substring(j, i)) (0 <= j < i)
 */
private boolean wordBreak(String s, List<String> wordDict) {
    Set<String> set = new HashSet<>();
    for(String word : wordDict) {
        set.add(word);
    }

    int len = s.length();
    boolean[] dp = new boolean[len + 1];
    // 空字符串被认为可以拆分
    dp[0] = true;
    for(int i = 1; i <= len; i++) {
        for(int j = 0; j < i; j++) {
            dp[i] = dp[j] & set.contains(s.substring(j, i));
            if(dp[i]) {
                break;
            }
        }
    }
    return dp[len];
}
```



-----

------

#### 双序列（字符串）DP类型 （40%）

-------

##### 题目示例4 `leetcode 97 交错字符串`

```java
private boolean isInterleave(String s1, String s2, String s3) {
    int len1 = s1.length();
    int len2 = s2.length();
    int len3 = s3.length();
    if(len1 + len2 != len3) {
        return false;
    }
	
    // dp[i][j]表示s1的前i个字符和s2的前j个字符是/否可以构成s3的前i+j个字符
    boolean[][] dp = new boolean[len1 + 1][len2 + 1];
    dp[0][0] = true;
    for(int i = 1; i <= len1; i++) {
        if(s1.charAt(i-1) != s3.charAt(i-1)) {
            break;
        }
        dp[i][0] = true;
    }
    for(int i = 1; i <= len2; i++) {
        if(s2.charAt(i-1) != s3.charAt(i-1)) {
            break;
        }
        dp[0][i] = true;
    }
	
    // 题目可以转化成，是否存在这样一条路径：从矩阵的左上角只能往右或者往下走
    // 最终到达矩阵的右下角，并且路径经过的每个位置都为true
    for(int i = 1; i <= len1; i++) {
        for(int j = 1; j <= len2; j++) {
            boolean fromAbove = dp[i-1][j] && (s1.charAt(i-1) == s3.charAt(i + j - 1));
            boolean fromLeft = dp[i][j-1] && (s2.charAt(j-1) == s3.charAt(i + j - 1));
            dp[i][j] = fromLeft || fromAbove;
        }
    }
    return dp[len1][len2];
}
```



-------

-------

#### 背包问题

##### 01背包

###### 题目示例1 `leetcode 416 分割等和子集`

```java
/**
* dp[i][j] = var 表示，对于前i个物品，当背包容量为j时，若var = true，表示恰好将背包装满，反之表示装不满
* base case 1: dp[...][0] = true,表示背包容量为0时，背包天然处于装满的状态
* base case 2: dp[0][...] = false,表示没有物品可以选择的时候，无论如何无法装满背包
* return: dp[N][sum/2]
* 注意这个问题要求背包恰好被完全装满
 */

// v1
private boolean canPartition(int[] nums) {
    int sum = 0;
    int len = nums.length;

    // 数组元素和必须为偶数
    for(int i = 0; i < len; i++) {
        sum += nums[i];
    }
    if(sum % 2 != 0) {
        return false;
    }

    sum = sum / 2;
    boolean[][] dp = new boolean[len+1][sum+1];
    // 背包容量为0时表示不用装入物品也已经满了
    for(int i = 0; i <= len; i++) {
        dp[i][0] = true;
    }

    for(int i = 1; i <= len; i++) {
        for(int j = 1; j <= sum; j++) {
            if(j - nums[i-1] < 0) {
                dp[i][j] = dp[i-1][j];
            } else {
                dp[i][j] = dp[i-1][j] | dp[i-1][j-nums[i-1]];
            }
        }
    }
    return dp[len][sum];
}

// v2 状态压缩
private boolean canPartition(int[] nums) {
    int sum = 0;
    for(int i = 0; i < len; i++) {
        sum += nums[i];
    }
    if(sum % 2 != 0) {
        return false;
    }

    int n = nums.length;
    sum /= 2;
    boolean[] dp = new boolean[sum+1];
    dp[0] = true;

    for(int i = 1; i <= n; i++) {
        // 注意这里必须逆序处理
        for(int j = sum; j >= 0; j--) {
            if(j - nums[i-1] >= 0) {
                dp[j] = dp[j] | dp[j-nums[i-1]];
            }
        }
    }
    return dp[sum];
}
```

------

###### 题目示例2 `leetcode  474 一和零`

```java
/**
* 注意在这个问题中背包由两个维度构成: 1的数量和0的数量
* dp[i][j][k]表示从strs[0...i]中选取字符串,在背包中可以存放j个1,k个0的情况下，
* 可以放入背包的最大字符串数量
 */

// v1
public int findMaxForm(String[] strs, int m, int n) {
    int len = strs.length;
    int[][][] dp = new int[len + 1][m + 1][n + 1];
    for(int i = 1; i <= len; i++) {
        int[] counts = countZerosAndOnes(strs[i-1]);
        int zeros = counts[0];
        int ones = counts[1];
        for(int j = 0; j <= m; j++) {
            for(int k = 0; k <= n; k++) {
                dp[i][j][k] = dp[i-1][j][k];
                if(j >= zeros && k >= ones) {
                    dp[i][j][k] = Math.max(dp[i-1][j][k], dp[i-1][j - zeros][k - ones] + 1);
                }
            }
        }
    }
    return dp[len][m][n]; 
}

private int[] countZerosAndOnes(String str) {
    int[] res = new int[2];
    for(char c:str.toCharArray()) {
        res[c - '0']++;
    }
    return res;
}

// v2
public int findMaxForm(String[] strs, int m, int n) {
    int len = strs.length;
    int[][] dp = new int[m + 1][n + 1];
    for(int i = 1; i <= len; i++) {
        int[] counts = countZerosAndOnes(strs[i-1]);
        int zeros = counts[0];
        int ones = counts[1];
        // 遍历背包容量时必须逆序
        for(int j = m; j >= zeros; j--) {
            for(int k = n; k >= ones; k--) {
                dp[j][k] = Math.max(dp[j][k], dp[j - zeros][k - ones] + 1);
            }
        }
    }
    return dp[m][n]; 
}

private int[] countZerosAndOnes(String str) {
    int[] res = new int[2];
    for(char c:str.toCharArray()) {
        res[c - '0']++;
    }
    return res;
}
```

--------

###### 题目示例3 `leetcode 494 目标和`

```java
/**
* 一个数学证明：
* 	将数组中需要加负号的元素子集设为N,其余部分设为P
* 	由题条件有sum(P) - sum(N) == S,可推得sum(P) + sum(N) + sum(P) - sum(N) = S + sum(P) + sum(N)
* 	-> 2 * sum(P) = S + sum(nums)
* 	-> sum(P) = (S + sum(nums)) / 2
* 	故原问题转化为: 找到数组中和为(S + sum(nums)) / 2的一个子集(与leetcode 416类似)
*
* dp[i][j] = var 表示，对于前i个物品，当背包容量为j时，可以装满背包的物品选择方案数为var
* base case 1: dp[...][0] = 1,表示背包容量为0时,至少有一种选择方案，就是什么都不装或者装整数 0
* base case 2: dp[0][1...] = 0,表示没有物品可以选择的时候，无论如何无法装满背包
* 注意这个问题要求背包恰好被完全装满
 */

// v1 
private int findTargetSumWays(int[] nums, int S) {
    int sum = 0;
    int len = nums.length;
    for(int i = 0; i < len; i++) {
        sum += nums[i];
    }
    if(sum < S || (sum + S) % 2 == 1) {
        return 0;
    }

    sum = (sum + S) / 2;
    int[][] dp = new int[len + 1][sum + 1];
    for(int i = 0; i <= len; i++) {
        dp[i][0] = 1;
    }

    for(int i = 1; i <= len; i++) {
        for(int j = 0; j <= sum; j++) {
            if(j < nums[i - 1]) {
                dp[i][j] = dp[i-1][j];
            } else {
                dp[i][j] = dp[i-1][j] + dp[i-1][j - nums[i-1]];
            }
        }
    }
    return dp[len][sum];
}

// v2，空间优化
private int findTargetSumWays(int[] nums, int S) {
    int sum = 0;
    for(int num:nums) {
        sum += num;
    }

    if(sum < S || (sum + S) % 2 == 1) {
        return 0;
    }

    sum = (sum + S) / 2;
    int[] dp = new int[sum + 1];
    dp[0] = 1;
    for(int num:nums) {
        for(int i = sum; i >= num; i--) {
            dp[i] += dp[i - num];
        }
    }
    return dp[sum];
}
```



------

##### 完全背包

###### 题目示例1 `leetcode 322零钱兑换`

```java
/**
* dp[i]表示，在总金额为i时，可以凑成金额i使用的最少硬币个数
 */
private int coinChange(int[] coins, int amount) {
    int[] dp = new int[amount+1];
    Arrays.fill(dp, amount+1);
    // 总金额为0时不能选择任何硬币
    dp[0] = 0;
    for(int i = 0; i < coins.length; i++) {
        for(int j = coins[i]; j <= amount; j++) {
            dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
        }
    }
    return dp[amount] == amount + 1? -1:dp[amount];
}
```

-----

###### 题目示例2	 `leetcode 518 零钱兑换II`

```java
/**
* dp[i]表示，在总金额为i时，可以凑成金额i的硬币的组合总数
 */
private int change(int amount, int[] coins) {
    int[] dp = new int[amount + 1];
    // 总金额为0时只有一种组合，就是没有任何硬币的组合
    dp[0] = 1;
    for(int i = 0; i < coins.length; i++) {
        for(int j = coins[i]; j <= amount; j++) {
            dp[j] += dp[j - coins[i]];
        }
    }
    return dp[amount];
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

```java
// 一般把结果设为全局变量，避免传参消耗
result := []
private void backTrack(选择列表， 路径) {
    if 满足结束条件 {
        result.add(路径)
        return
    }
    
    for 选择 in 选择列表 {
        做选择
        backTrack(选择列表， 路径)
        撤销选择
    }
}
```

-----

-----

#### 典型题目

##### 题型1：基本回溯问题，在数组上进行回溯搜索

###### 题目示例1 `leetcode 78 子集 `

```java
List<List<Integer>> res = new LinkedList<>();
public List<List<Integer>> subsets(int[] nums) {
    if(nums == null || nums.length == 0) {
        return res;
    }
    
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
    // 所有不同的状态都被加入到结果中
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
    if(nums == null || nums.length == 0) {
        return res;
    }
    
    Arrays.sort(nums);
    backTracking(nums, 0 , new LinkedList<Integer>());
    return res;
}

private void backTracking(int[] nums, int start, LinkedList<Integer> runner) {
    res.add(new LinkedList(runner));
    
    for(int i = start; i < nums.length; i++) {
        /*
        * 注意：i> start && nums[i]==nums[i-1]是作用在同一层决策树上的(同一次循环内)
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
    if(nums == null || nums.length == 0) {
        return res;
    }
    
    backTracking(nums, new boolean[nums.length], new LinkedList<Integer>());
    return res;
}

private void backTracking(int[] nums, boolean[] used, LinkedList<Integer> runner) {
    // 递归结束条件
    if(runner.size() == nums.length) {
        res.add(new LinkedList(runner));
        return;
    }
    
    for(int i = 0; i < nums.length; i++) {
        // 剪枝
        if(used[i]) {
            continue;
        }
        
        // 1、做选择
        runner.addLast(nums[i]);
        used[i] = true;
        // 2、进入下一层决策树
        backTracking(nums, used, runner);
        // 3、撤销选择
        used[i] = false;
        runner.removeLast();
    }
}
```

-----

###### 题目示例4 `leetcode 47 全排列II `

```java
List<List<Integer>> res = new LinkedList<>();
public List<List<Integer>> permuteUnique(int[] nums) {
    if(nums == null || nums.length == 0) {
        return res;
    }
    
    // 排序是必须的！！！！！！
    Arrays.sort(nums);
    backTracking(nums, new boolean[nums.length], new LinkedList<Integer>());
    return res;
}

private void backTracking(int[] nums, boolean[] used, LinkedList<Integer> runner) {
    // 递归终止条件
    if(runner.size() == nums.length) {
        res.add(new LinkedList(runner));
        return;
    }
    
    for(int i = 0; i < nums.length; i++) {
        /**
        * 在这里的一个思想是：在同一个循环内，如果当前元素与前一个元素相等并且前一个元素未被使用
        * 那么在决策树的下一层就会有重复的可选项，则会出现错误的重复情况。
        * 所以其中一个剪枝条件为i > 0 && nums[i]==nums[i-1] && !used[index-1]
        * 当某个元素已经被使用了当然也不需要在当前分支继续寻找
         */
        if(used[i] || (i > 0 && nums[i] == nums[i-1] && !used[i-1])) {
            continue;
        }
        
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
    if(n < 1 || n < k) {
        return res;
    }
    
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
    if(candidates == null || candidates.length == 0) {
        return res;
    }
    
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
    
    for(int i = start; i < candidates.length; i++) {
        // 剪枝
        if(target - candidates[i] < 0) {
            return;
        }
        
        // 做选择
        runner.add(candidates[i]);
       	// 进入下一层决策树(注意一个元素是可以重复选取的)
        backTracking(candidates, target - candidates[i], i, runner);
        // 撤销选择
        runner.removeLast();
    }
}
```

-----

###### 题目示例7 `leetcode 40 组合总和II`

```java
private List<List<Integer>> res = new LinkedList<>();
public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    if(candidates == null || candidates.length == 0) {
        return res;
    }
    
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
        if(target - candidates[i] < 0) {
            break;
        }
        // i > start,是个很重要的细节，思考一下这是如何实现避免
        // 重复选取元素的
        // "在一个for循环中，所有被遍历到的元素都是属于同一层级的"
        if(i > start && candidates[i] == candidates[i-1]) {
            continue;
        }
        
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
private List<List<Integer>> res = new LinkedList<>();

public List<List<Integer>> combinationSum3(int k, int n) {
    if(n <= 0 || k <= 0) {
        return res;
    }

    backTracking(k, n, 1, new LinkedList<Integer>());
    return res;
}

private void backTracking(int k, int n, int start, LinkedList<Integer> runner) {
    // 终止条件
    if(k == 0 && n == 0) {
        res.add(new LinkedList(runner));
        return;       
    }

    for(int i = start; i <= 9; i++) {
        if(i > n) {
            return;
        }
        // 做选择
        runner.addLast(i);
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

/**
* 从start索引位置开始，找到所有从start开始的回文字符串
 */
private void backTracking(String s, int start, LinkedList<String> runner) {
    if(start == s.length()) {
        res.add(new LinkedList(runner));
        return;
    }
    
    for(int i = start; i < s.length(); i++) {
        if(!isPalindrome(s, start, i)) {
            continue;
        }
        
        // 选择
        runner.add(s.substring(start, i + 1));
        // 进入下一层决策树
        backTracking(s, i + 1, runner);
        // 撤销选择
        runner.removeLast();
    }
}

/**
* 判断字符串是否为回文串
*/
private boolean isPalindrome(String s, int left, int right) {
    while(left < right) {
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
private List<String> res = new LinkedList<>();

public List<String> restoreIpAddresses(String s) {
    if(s == null || s.length() == 0 || s.length() > 12) {
        return res;
    }

    backTracking(s, 0, new LinkedList<>());
    return res;
}

/**
* 回溯法寻找合适的分段方式
* @param	s		需要处理的字符串
* @param	pos 	当前在s中遍历到的位置
* @param	runner	已经确定好的所有ip段
*/
private void backTracking(String s, int pos, LinkedList<String> runner) {
    //递归终止条件: 字符串刚好能被分成四段并且每段都是合法的ip分段
    if(runner.size() == 4 && pos == s.length()) {
        res.add(String.join(".", runner));
        return;
    }

    for(int i = 1; i <= 3; i++) {
        // 剪枝条件：超过了字符串边界
        if(pos + i > s.length()) {
            break;
        }

        String segment = s.substring(pos, pos + i);
        // 剪枝条件：长度大于一的分段不能以0为起始；任何段的数值结果不能大于255
        if(segment.length() > 1 && segment.startsWith("0") || (i == 3 && Integer.parseInt(segment) > 255)) {
            continue;
        }

        // 做选择
        runner.addLast(segment);
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
private List<String> res = new LinkedList<>();
private HashMap<Character, String> map = new HashMap<>(){
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
    if(digits == null || digits.length() == 0) {
        return res;
    }
    
    backTracking(digits, 0, new StringBuffer());
    return res;
}

/**
* 递归求解电话号码可能的字母组合
* @param digits		电话号码的字符串表示
* @param index		当前处理到号码串的第index个数字
* @param runner
 */
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
private List<String> res = new LinkedList<>();
public List<String> letterCasePermutation(String S) {
    if(S == null || S.length() == 0) {
        return res;
    }

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
private List<String> res = new LinkedList<>();
public List<String> generateParenthesis(int n) {
    if(n <= 0) {
        return res;
    }
    
    backTracking(n, n, new StringBuffer());
    return res;
}

/**
* 递归求解可能的所有括号组合
* @param left	当前剩余未使用的左括号数量
* @param right	当前剩余未使用的右括号数量
* @param s	    当前已经构建好的合法的括号子串
 */
private void backTracking(int left, int right, StringBuffer s) {
    /**
    * 递归终止条件：
    * 1、剩余的左括号数量大于右括号数量或者剩余可用数量小于0
    * 2、左右括号刚好同时用完，得到的括号子串满足条件
     */
    if(left > right || left < 0 || right < 0) {
        return;
    } else if(left == 0 && right == 0) {
        res.add(s.toString());
        return;
    }
    
    // 尝试选择一个左括号
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
    if(board == null || word == null || board.length == 0 || board[0].length == 0) {
        return false;
    }

    int m = board.length;
    int n = board[0].length;
    this.visited = new boolean[m][n];
    for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {
            if(backTracking(board, word, i, j, 0)) {
                return true;
            }
        }
    }
    return false;
}

/**
* 回溯方法搜索单词
* @parameter board       字符二维网格
* @parameter word        目标单词
* @parameter row         方法当前所访问的行索引
* @parameter col         方法当前所访问的列索引
* @parameter pathLength  当前已经匹配的路径长度
* @return                路径的匹配结果
 */
private boolean backTracking(char[][] board, String word, int row, int col, int pathLength) {
    // 递归终止条件：匹配了整个单词
    if(word.length() == pathLength) {
        return true;
    }

    boolean hasPath = false;
    if(row >= 0 && row < board.length && col >= 0 && col < board[0].length 
       && board[row][col] == word.charAt(pathLength) && !visited[row][col]) {
        // 做选择
        pathLength++;
        visited[row][col] = true;

        // 进入下一层决策树（四叉树）
        hasPath = (backTracking(board, word, row, col - 1, pathLength) 
                   || backTracking(board, word, row - 1, col, pathLength)
                   || backTracking(board, word, row, col + 1, pathLength)
                   || backTracking(board, word, row + 1, col, pathLength));

        // 撤销选择
        pathLength--;
        visited[row][col] = false;
    }
    return hasPath;
}
```

###### 题目示例2 `leetcode 212 单词搜索II`

```java
public List<String> findWords(char[][] board, String[] words) {
    List<String> res = new LinkedList<>();

    for(String word:words) {
        if(exist(board, word)) {
            res.add(word);
        }
    }
    return res;
}

/**
* 检查单词是否存在于二维网格中
*/
private boolean exist(char[][] board, String word) {
    if(board == null || word == null || board.length == 0) {
        return false;
    }

    int m = board.length;
    int n = board[0].length;
    boolean[][] visited = new boolean[m][n];
    for(int i = 0; i < board.length; i++) {
        for(int j = 0; j < board[0].length; j++) {
            if(backTracking(board, word, i, j, 0, visited)) {
                return true;
            }
        }
    }
    return false;
}

/**
* @parameter board       字符二维网格
* @parameter word        目标单词
* @parameter row         方法当前所访问的行索引
* @parameter col         方法当前所访问的列索引
* @parameter pathLength  当前已经匹配的路径长度
* @return                路径的匹配结果
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
        pathLength--;
        visited[row][col] = false;
    }
    return hasPath;
}
```



------

##### 题型四：游戏问题

###### 题目示例1 `leetcode37 解数独`

```java
public void solveSudoku(char[][] board){
    backTracking(board, 0, 0);
}

private boolean backTracking(char[][] board, int row, int col) {
    int rowLen = board.length;
    int colLen = board[0].length;

    // 找到一个可行解，触发base case
    if(rowLen == row) {
        return true;
    }
    
    // 在到达边界时要切换搜索区间
    if(col == colLen) {
        return backTracking(board, row + 1, 0);
    } else if(board[row][col] != '.') {
        return backTracking(board, row, col + 1);
    }
    
    for(char c = '1'; c <= '9'; c++) {
        // 剪枝操作
        if(!isValid(board, row, col, c)) {
            continue;
        }

        // 做选择
        board[row][col] = c;
        // 进入下一层决策树
        if(backTracking(board, row, col + 1)) {
            return true;
        }
        // 撤销选择
        board[row][col] = '.';
    }
    return false;
}

private boolean isValid(char[][] board, int row, int col, char c) {
    for(int i = 0; i < 9; i++) {
        // 判断行是否有重复
        if(board[row][i] == c) {
            return false;
        }
        // 判断列是否有重复
        if(board[i][col] == c) {
            return false;
        }
        // 判断3x3方框是否存在重复
        if(board[(row/3)*3 + i/3][(col/3)*3 + i%3] == c) {
            return false;
        }
    }
    return true;
}
```

----

###### 题目示例2 `leetcode 51 N皇后`

```java
List<List<String>> res = new LinkedList<>();
public List<List<String>> solveNQueens(int n) {
    if(n <= 0) {
        return res;
    }

    char[][] board = new char[n][n];
    for(int i = 0; i < n; i++) {
        Arrays.fill(board[i], '.');
    }
    backTracking(board, 0);
    return res;
}

private void backTracking(char[][] board, int row) {
    // 递归终止条件:棋盘的每一行都放置了一个皇后
    if(row == board.length) {
        List<String> runner = new LinkedList<>();
        for(char[] line:board) {
            runner.add(new String(line));
        }
        res.add(runner);
        return;
    }

    int lineLength = board[0].length;
    for(int i = 0; i < lineLength; i++) {
        if(!isValid(board, row, i)) {
            continue;
        }

        // 做选择
        board[row][i] = 'Q';
        // 进入下一层决策树
        backTracking(board, row + 1);
        // 撤销选择
        board[row][i] = '.';
    }
}

/**
* 判断当前位置是否可以放置皇后
* @param	board	表示棋盘的二维数组
* @param	row		表示当前位置的横坐标
* @param	col		表示当前位置的纵坐标
 */
private boolean isValid(char[][] board, int row, int col) {
    int n = board.length;
    // 检查同一列是否有冲突
    for(int i = 0; i < row; i++) {
        if(board[i][col] == 'Q') {
            return false;
        }
    }

    // 检查右上角是否有冲突
    for(int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
        if(board[i][j] == 'Q') {
            return false;
        }
    }

    // 检查左上角是否有冲突
    for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
        if(board[i][j] == 'Q') {
            return false;
        }
    }
    return true;
}
```

-----

###### 题目示例3 `leetcode 52 N皇后II`

```java
private int res = 0;
public int totalNQueens(int n) {
    char[][] board = new char[n][n];
    for(int i = 0; i < n; i++) {
        Arrays.fill(board[i], '.');
    }
    backTracking(board, 0);
    return res;
}

private void backTracking(char[][] board, int row) {
    int m = board.length;
    int n = board[0].length;
    if(row == m) {
        res++;
    }

    for(int i = 0; i < n; i++) {
        if(!validPosition(board, row, i)) {
            continue;
        }

        board[row][i] = 'Q';
        backTracking(board, row + 1);
        board[row][i] = '.';
    }
}

private boolean validPosition(char[][] board, int row, int col) {
    int m = board.length;
    int n = board[0].length;

    // 检查同一列上是否有皇后
    for(int i = 0; i < row; i++) {
        if(board[i][col] == 'Q') {
            return false;
        }
    }

    // 检查左上角是否有皇后
    for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
        if(board[i][j] == 'Q') {
            return false;
        }
    }

    // 检查右上角是否有皇后
    for(int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
        if(board[i][j] == 'Q') {
          return false;
        }
    }

    return true;
}
```

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
/**
* 窗口边界的移动一般要放在比较靠后的位置，避免影响到与窗口大小相关的计算
 */
private void slidingWindow(String s, String t) {
    // 一般使用HashMap或者数组来存储"窗口"内的内容
    HashMap<Character, Integer> need = new HashMap<>();
    HashMap<Character, Integer> window = new HashMap<>();
    // need中存储了符合提意的"窗口"应该满足的条件
    for(char c: t.toCharArray()) {
        need.put(c, need.getOrDefault(c, 0) + 1);
    }
    
    int left = 0;
    int right = 0;
    int valid = 0;
    while(right < s.length()) {
        // c是刚刚移入窗口的字符
        char c = s.charAt(right);
        // 进行窗口内数据的一系列更新
        ...;
        
        /*** debug的输出位置 ***/
        System.out.println("window:[%d, %d ]", left, right);
        
        // 判断左侧窗口是否需要收缩
        while(window needs to shrink) {
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

-----

#### 典型题目

------

##### 可变窗口题目

###### 题目示例1 `leetcode 76 最小覆盖子串`

```java
private String minWindow(String s, String t) {
    if(s == null || t == null || s.length() < t.length()) {
        return "";
    }
    
    Map<Character, Integer> need = new HashMap<>();
    Map<Character, Integer> window = new HashMap<>();
    for(char c : t.toCharArray()) {
        need.put(c, need.getOrDefault(c, 0) + 1);
    }
   
    int left = 0;
    int right = 0;
    int match = 0;
    int start = 0;
    int minLen = Integer.MAX_VALUE;
    int len = s.length();
    while(right < len) {
        // 移动右边窗口
        char c1 = s.charAt(right);
        window.put(c1, window.getOrDefault(c1, 0) + 1);
        if(window.get(c1).equals(need.get(c1))) {
            match++;
        }
        // 窗口移动的条件是：当前窗口内包含了所有s1的字符并且数量大于等于
        // 此时需要比较窗口大小并设置返回结果相关变量，并移动窗口左边界
        while(match == need.size()) {
            if(right - left + 1 < minLen) {
                start = left;
                minLen = right - left + 1;
            }
            char c2 = s.charAt(left);
            if(window.get(c2).equals(need.get(c2))) {
                match--;
            }
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
    int[] need = new int[26];
    int[] window = new int[26];
    // 统计s1中不同字符的个数以及每个字符对应的数量
    int unique = 0;
    for(char c:s1.toCharArray()) {
        int index = c - 'a';
        if(need[index] == 0) {
            unique++;
        }
        need[index]++;
    }

    int left = 0;
    int right = 0;
    int match = 0;
    while(right < s2.length()) {
        int index1 = s2.charAt(right) - 'a';
        window[index1]++;
        if(window[index1] == need[index1]) {
            match++;
        }

        while(match == unique) {
            if((right - left + 1) == s1.length()) {
                return true;
            }
            int index2 = s2.charAt(left) - 'a';
            if(window[index2] == need[index2]) {
                match--;
            }
            window[index2]--;
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
    if(s == null || p == null || s.length() < p.length()) {
        return res;
    }

    int[] need = new int[26];
    int[] window = new int[26];
    int unique = 0;
    for(char c : p.toCharArray()) {
        int index = c - 'a';
        if(need[index] == 0) {
            unique++;
        }
        need[index]++;
    }

    int match = 0;
    int left = 0;
    int right = 0;
    while(right < s.length()) {
        int index1 = s.charAt(right) - 'a';
        window[index1]++;
        if(window[index1] == need[index1]) {
            match++;
        }

        while(match == unique) {
            if(right - left + 1 == p.length()) {
                res.add(left);
            }
            int index2 = s.charAt(left) - 'a';
            if(window[index2] == need[index2]) {
                match--;
            }
            window[index2]--;
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
    if(s == null || s.length() == 0) {
        return 0;
    } 
    
    Map<Character, Integer> window = new HashMap<>();
    int left = 0;
    int right = 0;
    int maxLen = Integer.MIN_VALUE;
    int len = s.length();
    while(right < len) {
        char c1 = s.charAt(right);
        window.put(c1, window.getOrDefault(c1, 0) + 1);
        // 窗口移动的条件是：当前窗口内有字符出现的次数超过1
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
    if(nums == null || nums.length == 0 || s <= 0) {
        return 0;
    }
    
    int left = 0;
    int right = 0;
    int curVal = 0;
    int minLen = Integer.MAX_VALUE;
    int len = nums.length;
    while(right < len) {
        curVal += nums[right];
        // 窗口左边界移动的条件：当前窗口内的数值和大于s
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
    // 特判
    if(s == null) {
        return 0;
    } else if(s.length() <= k) {
        return s.length();
    }
    
    int left = 0;
    int right = 0;
    int occurMost = 0;
    int maxLen = 0;
    int[] window = new int[26];
    int len = s.length();
    while(right < len) {
        int index1 = s.charAt(right) - 'A';
        window[index1]++;
        occurMost = Math.max(occurMost, window[index1]);
        // 窗口移动的条件：当前窗口大小大于最大重复字符数量与k的和
        // 此时需要移动窗口左边界以确保窗口内容满足题目要求
        while((right - left + 1) > occurMost + k) {
            int index2 = s.charAt(left) - 'A';
            window[index2]--;
            left++;
        }
        maxLen = Math.max(maxLen, right - left + 1);
        right++;
    }
    return maxLen;
}
```

-----

###### 题目示例7 `leetcode 1004 最大连续1的个数III`

```java
private int longestOnes(int[] A, int K) {
    if(A == null) {
        return 0;
    } else if(A.length <= K) {
        return A.length;
    }
    
    int left = 0;
    int right = 0;
    int len = A.length;
    int maxLen = Integer.MIN_VALUE;
    int Ones = 0;
    while(right < len) {
        int val1 = A[right];
        if(val1 == 1) {
            Ones++;
        }
        // 窗口移动的条件：当前窗口大小大于窗口内1的个数与K的和
        // 此时需要移动窗口左边界以确保窗口内容满足题目要求
        while((right - left + 1) > Ones + K) {
            int val2 = A[left];
            if(val2 == 1) {
                Ones--;
            }
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
    // 特判
    if(S == null || K <= 0 || S.length() < K) {
        return 0;
    }
    
    int left = 0;
    int right = 0;
    int[] window = new int[26];
    int res = 0;
    int len = S.length();
    while(right < len) {
        int index1 = S.charAt(right) - 'a';
        window[index1]++;
        // 窗口移动的条件是：当前窗口内有字符出现次数超过一次
        // 此时需要移动窗口左侧
        while(window[index1] > 1) {
            int index2 = S.charAt(left) - 'a';
            window[index2]--;
            left++;
        }
        // 如果去重后窗口大小刚好为K，则计数结果加一
        // 同时需要移动窗口左边界以避免重复计数
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
    // 特判
    if(big == null || small == null || big.length < small.length) {
        return new int[0];
    }

    int left = 0;
    int right = 0;
    int start = 0;
    int minLen = Integer.MAX_VALUE;
    int match = 0;
    HashMap<Integer, Integer> need = new HashMap<>();
    HashMap<Integer, Integer> window = new HashMap<>();
    for(int i = 0; i < small.length; i++) {
        need.put(small[i], 1);
    }

    int len1 = big.length;
    while(right < len1) {
        int item1 = big[right];
        window.put(item1, window.getOrDefault(item1, 0) + 1);
        if(window.get(item1).equals(need.get(item1))) {
            match++;
        }
        // 窗口移动的条件是：当前窗口内包含了small的所有元素
        // 思路与leetcode 76相同
        while(match == need.size()) {
            if(right - left < minLen) {
                minLen = right - left;
                start = left;
            }
            int item2 = big[left];
            if(window.get(item2).equals(need.get(item2))) {
                match--;
            }
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
    // 特判
    if(s == null) {
        return 0;
    } else if(s.length() <= 2) {
        return s.length();
    }
    
    int left = 0;
    int right = 0;
    int maxLen = Integer.MIN_VALUE;
    int len = s.length();
    int match = 0;
    HashMap<Character, Integer> window = new HashMap<>();
    while(right < len) {
        char c1 = s.charAt(right);
        // 统计当前窗口内出现的字符的基数
        if(!window.containsKey(c1) || window.get(c1) == 0) {
            match++;
        }
        window.put(c1, window.getOrDefault(c1, 0) + 1);
        // 窗口移动的条件：当前窗口内出现了超过两种不同的字符
        // 此时要移动窗口左边界直到窗口内容满足题目条件
        while(match > 2) {
            char c2 = s.charAt(left);
            if(window.get(c2) == 1) {
                match--;
            }
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
/**
* leetcode 340是leetcode 159的一般化形式
 */
private int lengthOfLongestSubstringKDistinct(String s, int k) {
    // 特判
    if(s == null || k <= 0) {
        return 0;
    }
    if(s.length() <= k) {
        return s.length();
    }

    int left = 0;
    int right = 0;
    int match = 0;
    int maxLen = Integer.MIN_VALUE;
    int len = s.length();
    HashMap<Character, Integer> window = new HashMap<>();
    while(right < len) {
        char c1 = s.charAt(right);
        if(!window.containsKey(c1) || window.get(c1) == 0) {
            match++;
        }
        window.put(c1, window.getOrDefault(c1, 0) + 1);
        while(match > k) {
            char c2 = s.charAt(left);
            if(window.get(c2) == 1) {
                match--;
            }
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

###### 题目示例12 `leetcode 1493 删掉一个元素以后全为1的最长子数组`

```java
private int longestSubarray(int[] nums) {
    if(nums == null || nums.length == 0) {
        return 0;
    }

    int left = 0;
    int right = 0;
    int maxLen = 0;
    int window = 0;
    while(right < nums.length) {
        window += nums[right] & 1;
        // 窗口左边界移动的条件：当前窗口的尺寸大于1并且窗口内0的个数大于1
        while(left < right && window <= (right - left - 1)) {
            if(nums[left] == 1) {
                window--;
            }
            left++;
        }
        maxLen = Math.max(maxLen, right - left);
        right++;
    }
    return maxLen;
}
```



------

##### 固定窗口题目

###### 题目示例1 `leetcode 239 滑动窗口最大值`

```java
private int[] maxSlidingWindow(int[] nums, int k) {
    if(nums == null || k < 1 || nums.length < k) {
        return new int[0];
    }
    
    int len = nums.length;
    int[] res = new int[len - k + 1];
    Deque<Integer> window = new LinkedList<>();
    int index = 0;
   	for(int i = 0; i < len; i++) {
        while(!window.isEmpty() && nums[i] >= nums[window.peekLast()]) {
            window.pollLast();
        }
        window.offerLast(i);
        if(i - k >= window.peekFirst()) {
            window.pollFirst();
        }
        if(i >= k - 1) {
            res[index] = nums[window.peekFirst()];
            index++;
        }
    }
    return res;
}
```

------

###### 题目示例2 `leetcode 1456 定长子串中元音的最大数目`

```java
public int maxVowels(String s, int k) {
    if(s == null || s.length() <= 0 || k < 1) {
        return 0;
    }

    int curVal = 0;
    int res = 0;
    for(int i = 0; i < s.length(); i++) {
        curVal += isVowel(s.charAt(i));
        if(i >= k) {
            curVal -= isVowel(s.charAt(i - k));
        }
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

###### 题目示例3 `leetcode 643 子数组最大平均数`

```java
/**
* 参考leetcode 239的思路
 */
private double findMaxAverage(int[] nums, int k) {
    double res = -Double.MAX_VALUE;
    double curSum = 0;
    Deque<Integer> deque = new LinkedList<>();
    for(int i = 0; i < nums.length; i++) {
        deque.addLast(i);
        curSum += nums[i];
        if(i - k >= deque.peekFirst()) {
            int removed = deque.removeFirst();
            curSum -= nums[removed];
        }
        if(i >= k - 1) {
            res = Math.max(res, curSum);
        }
    }
    return res / k;
}
```



------

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

### 前缀和

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

##### 题目示例10 `leetcode 554 砖墙`

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



-----

### 循环不变量

**算是一个稍微有点冷门的算法思想，最重要的部分是确定算法流程中的循环不变量**

**循环不变量帮助规范化算法流程**

#### 典型题目

##### 题目示例1 `leetcode 283 移动零`

```java
public void moveZeroes(int[] nums) {
    /**
    * 循环不变量:[0, mark]内的元素为非零元素
     */
    int mark = -1;
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] != 0) {
            mark++;
            swap(nums, i, mark);
        }
    }
}

private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
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

------

##### 题目示例3 `leetcode 26 删除排序数组中的重复项`

```java
private int removeDuplicates(int[] nums) {
	if(nums == null || nums.length == 0) {
        return 0;
    }

    /**
    * 循环不变量: [0, mark]内的元素每个元素只出现一次
     */
    int len = nums.length;
    int mark = 0;
    for(int i = 1; i < len; i++) {
        if(nums[i] != nums[mark]) {
            mark++;
            nums[mark] = nums[i];
        }
    }
    return mark + 1;
}
```

-----

##### 题目示例4 `leetcode 27 移除元素`

```java
private int removeElement(int[] nums, int val) {
    /**
    * 循环不变量:[0, mark]内的元素都不等于val
     */
    int mark = -1;
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] != val) {
            mark++;
            nums[mark] = nums[i];
        }
    }
    return mark + 1;
}
```

------

##### 题目示例5 `leetcode 75 颜色分类`

```java
/**
* 问题本质上是三向切分快速排序的一次划分过程，参考切分快排的partition过程即可
 */
public void sortColors(int[] nums) {
    int len = nums.length;
    int left = 0;
    int right = len - 1;
    int less = 0;
    int i = 0;
    int great = len - 1;

    /**
    * 循环不变量:
    * [left, less)内的元素为0
    * [less, i)内的元素为1
    * [i, great]内的元素未知
    * (great, right]内的元素为2
     */

    while(i <= great) {
        if(nums[i] == 0) {
            swap(nums, less, i);
            less++;
            i++;
        } else if(nums[i] == 1) {
            i++;
        } else if(nums[i] == 2) {
            swap(nums, great, i);
            great--;
        }
    }
}

private void swap(int[] nums, int i, int j) {
    int temp = nums[j];
    nums[j] = nums[i];
    nums[i] = temp;
}
```

---

##### 题目示例6 `leetcode 215 数组中的第k个最大元素`

```java
public int findKthLargest(int[] nums, int k) {
    int len = nums.length;
    int left = 0;
    int right = len - 1;
    k = len - k;
    while(true) {
        int piIndex = partition(nums, left, right);
        if(piIndex == k) {
            return nums[piIndex];
        } else if(piIndex < k) {
            left = piIndex + 1;
        } else {
            right = piIndex - 1;
        }
    }

}

private int partition(int[] nums, int left, int right) {
    int pivot = nums[left];
    int mark = left;

    /**
    * 循环不变量:
    * [left + 1, mark]内的元素小于pivot
    * (mark, i]内的元素 >= pivot
     */
    for(int i = left + 1; i <= right; i++) {
        if(nums[i] < pivot) {
            mark++;
            int temp = nums[mark];
            nums[mark] = nums[i];
            nums[i] = temp;
        }
    }
    // 在循环结束以后，数组内元素关系满足[left + 1, mark] < pivot,且(mark, i] >= pivot
    nums[left] = nums[mark];
    nums[mark] = pivot;
    // 在经过交换以后，数组内元素关系满足[left, mark - 1] < pivot, [mark] = pivot, [mark + 1, right] >= pivot
    return mark;
}
```







