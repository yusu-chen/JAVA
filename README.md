# JAVA
#### 大数据181陈昱夙2018310483  

[流程图]:https://github.com/yusu-chen/JAVA/blob/%E5%A4%A7%E6%95%B0%E6%8D%AE181%E9%99%88%E6%98%B1%E5%A4%992018310483/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20191117210431.png  
[结果图]:https://raw.githubusercontent.com/yusu-chen/JAVA/%E5%A4%A7%E6%95%B0%E6%8D%AE181%E9%99%88%E6%98%B1%E5%A4%992018310483/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20191117211530.png
这是流程图![流程图]
实验结果![结果图]
一、实验目的
掌握字符串String及其方法的使用
掌握异常处理结构
二、实验要求
利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能函数，并运行。达到如下功能：

1.	每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
2.	允许提供输入参数，统计古诗中某个字或词出现的次数
3.	考虑操作中可能出现的异常，在程序中设计异常处理程序
功能
输入：汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行<未完，待续>
输出：
汉皇重色思倾国，御宇多年求不得。
杨家有女初长成，养在深闺人未识。
天生丽质难自弃，一朝选在君王侧。
回眸一笑百媚生，六宫粉黛无颜色。
春寒赐浴华清池，温泉水滑洗凝脂。
侍儿扶起娇无力，始是新承恩泽时。
云鬓花颜金步摇，芙蓉帐暖度春宵。
春宵苦短日高起，从此君王不早朝。
…………
三、实验过程
1、加入标点符号
for(int i = last - 7; i > 0; i-=7) 
		{
			if(i%14==0)
			{
				s.insert(i,'。');
				s.insert(i+1,'\n');
			}
			else s.insert(i,'，');
			}
2、统计字符出现次数
if(c.equals("行"))
		{
			number = number;
		}
		else if(c.equals("汉")) 
		{
			number = number;
		}
		else 
		{
			number=number -1;
		}
		 g = number;
	}
		
		
	public String toString() 
	{
			return s + "。" + '\n' +"所查字出现过："+g+"次。";
	}
}
3、异常处理
try {
		changhenge = new Changhenge(write);
		if(write == "") 
		{
			throw new NewException("不能输入空字符");
		}
		else 
		
			System.out.print(changhenge);
		}
		catch (NewException e) 
		{
			e.printStackTrace();
		}

		finally 
		{
			System.out.print("程序运行结束");
		}

	}
}
四、实验流程图
