package com.sinsy.fntp.sayhello;

import java.io.IOException;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.sinsy.fntp.baiduRank.GetTheListOfBaiDu;

public class sayHello {
	public static void main(String[] args) {

		System.out.println(new sayHello().SplitTheJson2(new sayHello().randomnumber()));
	}
public int randomnumber() {
	  	int cache=0;
	        Random rm = new Random();
	        for(int i=0;i<100;i++)
	        {
	        	cache=rm.nextInt(100)+1;
	        }
	    return cache;
}
public String SplitTheJson2(int head) {
	String json="1.任何业绩的质变都来自于量变的积累。\r\n" + 
			"2.如果不想做点事情，就不要想到达这个世界上的任何地方。\r\n" + 
			"3.没有哪种教育能及得上逆境。\r\n" + 
			"4.障碍与失败，是通往成功最稳靠的踏脚石，肯研究、利用它们，便能从失败中培养出成功。\r\n" + 
			"5.让我们将事前的忧虑，换为事前的思考和计划吧！\r\n" + 
			"6.如果本来就生活在底层，那就不必担心混得没有底气。\r\n" + 
			"7.目光远大，目标明确的人往往非常自信，而自信与人生的成败息息相关。\r\n" + 
			"8.坚强者能在命运之风暴中奋斗。\r\n" + 
			"9.没有灯的小路一样可以行走，只要心还在。\r\n" + 
			"10.嘲讽是一种力量，消极的力量。赞扬也是一种力量，但却是积极的力量。\r\n" + 
			"11.命运是不存在的，它不过是失败者拿来逃避现实的借口。\r\n" + 
			"12.你若将过去抱的太紧，怎么能腾出手来拥抱现在？\r\n" + 
			"13.如果我坚持什么，就是用大炮也不能打倒我。\r\n" + 
			"14.路的尽头，仍然是路，只要你愿意走。\r\n" + 
			"15.与其在别人的生活里跑龙套，不如精彩做自己。\r\n" + 
			"16.要克服生活的焦虑和沮丧，得先学会做自己的主人。\r\n" + 
			"17.一朵花的凋零，荒芜不了整个春天，一次挫折也荒废不了整个人生。\r\n" + 
			"18.勇敢的面对阳光，阴影自然都在身后。\r\n" + 
			"19.山不辞土，故能成其高；海不辞水，故能成其深！\r\n" + 
			"20.成功与不成功之间有时距离很短——只要后者再向前几步。\r\n" + 
			"21.那些尝试去做某事却失败的人，比那些什么也不尝试做却成功的人不知要好上多少。\r\n" + 
			"22.在世界的历史中，每一伟大而高贵的时刻都是某种热忱的胜利。\r\n" + 
			"23.恐惧自己受苦的人，已经因为自己的恐惧在受苦。\r\n" + 
			"24.当一个人真正觉悟的一刻，他放弃追寻外在世界的财富，而开始追寻他?刃氖澜绲恼嬲?财富。\r\n" + 
			"25.成功没有快车道，幸福没有高速路。所有的成功，都来自不倦的努力和奔跑；所有幸福，都来自平凡的奋斗和坚持。\r\n" + 
			"26.如果你的生活已处于低谷，那就，大胆走，因为你怎样走都是在向上。\r\n" + 
			"27.不要因为众生的愚疑，而带来了自己的烦恼。不要因为众生的无知，而痛苦了你自己。\r\n" + 
			"28.生命要得到丰盛的收获，必需阳光；同时，也需要“雨”的浇灌。\r\n" + 
			"29.人总是在失去了才知道珍惜！\r\n" + 
			"30.要铭记在心：每天都是一年中最美好的日子。\r\n" + 
			"31.生活远没有咖啡那么苦涩，关键是喝它的人怎么品味！每个人都喜欢和向往随心所欲的生活，殊不知随心所欲根本不是生活。\r\n" + 
			"32.如果错过了太阳时你流泪了，那么你也要错过群星了。\r\n" + 
			"33.不如意的时候不要尽往悲伤里钻，想想有笑声的日子吧。\r\n" + 
			"34.没有人能替你承受痛苦，也没有人能抢走你的坚强。\r\n" + 
			"35.如果你看到面前的阴影，别怕，那是因为你的背后有阳光。\r\n" + 
			"36.幻想总是美好的，现实总是残酷的。\r\n" + 
			"37.优点一天比一天多，缺点一天比一天少。\r\n" + 
			"38.有人嫉妒你绝对是一件好事，但你要努力做到对得起这份嫉妒。\r\n" + 
			"39.世上没有绝望的处境，只有对处境绝望的人。\r\n" + 
			"40.泪水不代表着谁的失败，微笑不意味着谁的成功。\r\n" + 
			"41.要随波逐浪，不可随波逐流。\r\n" + 
			"42.遍体鳞伤后才知道，成功不是不够努力，成功是决不放弃。\r\n" + 
			"43.生活就是：生出来活下去。\r\n" + 
			"44.收起羡慕别人的目光自己去努力。\r\n" + 
			"45.如果上帝没有帮助你那他一定相信你可以。\r\n" + 
			"46.走好自己的路，让别人说去。\r\n" + 
			"47.真正的爱，应该超越生命的长度、心灵的??度、灵魂的深度。\r\n" + 
			"48.当你快乐的时候，生活是美好的，当有人因你而快乐的时候，生活才是最美好的。\r\n" + 
			"49.不论你在什么时候开始，重要的是开始之后就不要停止。\r\n" + 
			"50.在你穷的时候，要少在家里，多在外面。在你富有的时候，要多在家里，少在外面。这就是生活的艺术。穷得时候，钱要花给别人，富的时候，钱要花给自己。很多人，都做颠倒了。\r\n" + 
			"51.不要慨叹生活底痛苦——慨叹是弱者。 \r\n" + 
			"52.通往光明的道路是平坦的，为了成功，为了奋斗的渴望，我们不得不努力。\r\n" + 
			"53.人生，短短三万天，有高潮，有低谷；有成功，有失败；有生，有死。\r\n" + 
			"54.如果不想做点事情，就不好想到达这个世界上的任何地方。\r\n" + 
			"55.不好心平气和，不好容你自我昏睡！趁你还年轻，强壮灵活，要永不疲倦地做好事。\r\n" + 
			"56.如果不想做点事情，就甭想到达这个世界上的任何地方。\r\n" + 
			"57.坚持把简单的事情做好就是不简单，坚持把平凡的事情做好就是不平凡。所谓成功，就是在平凡中做出不平凡的坚持。\r\n" + 
			"58.这个世界并不是掌握在那些嘲笑者的手中，而恰恰掌握在能够经受得住嘲笑与批评忍不断往前走的人手中。\r\n" + 
			"59.让咱们将事前的忧虑，换为事前的思考和计划吧！坚持不懈。\r\n" + 
			"60.收起了无力的笑脸，卸下了虚伪的话语，用疲惫写完了这天的工作日记，不知道是否还有勇气去追赶明天那开不完的烦人会议，现实，咱们用什么鼓励自我，活着。\r\n" + 
			"61.在世界的历史中，每一伟大而高贵的时刻都是某种热忱的胜利。\r\n" + 
			"62.注意你的思想，它会变成你的言语；注意你的言语，它会变成你的行动；注意你的行动，它会变成你的习惯；注意你的习惯，它会变成你的性格；注意你的性格，它会变成你的命运。\r\n" + 
			"63.道路坎坷事不期，疾风劲草练男儿。\r\n" + 
			"64.没有什么事情有象热忱这般具有传染性，它能感动顽石，它是真诚的精髓。\r\n" + 
			"65.我大好的一个人，凭什么跑到别人的生命里去当插曲。\r\n" + 
			"66.只要有信心，人永远不会挫败。\r\n" + 
			"67.尽管社会是这样的现实和残酷，但我们还是必须往下走。\r\n" + 
			"68.愚痴的人，一直想要别人了解他。有智慧的人，却努力的了解自己。\r\n" + 
			"69.只要比竞争对手活得长，你就赢了。\r\n" + 
			"70.平静的湖面只有呆板的倒映，奔腾的激流才有美丽的浪花！幸福不是靠别人来布施，而是要自己去赢取！生命的意义在不断挑战自己，战胜自己！\r\n" + 
			"71.你接受比抱怨还要好，对于不可改变的事实，你除了接受以外，没有更好的办法了。\r\n" + 
			"72.输了就是输了，没什么好去解释的，不过是一盘棋，何必去计较。\r\n" + 
			"73.学会奉承领导，多摆笑脸，不做恶人，三缄其口，三思而后行。\r\n" + 
			"74.追求让人充实，分享让人快乐。\r\n" + 
			"75.能把在面前行走的机会抓住的人，十有八九都会成功。\r\n" + 
			"76.人性最可怜的就是：我们总是梦想着天边的一座奇妙的玫瑰园，而不去欣赏今天就开在我们窗口的玫瑰。\r\n" + 
			"77.智慧总是在孤独中生根。\r\n" + 
			"78.最简短的回答就是行动。\r\n" + 
			"79.都在说放弃，可是，当放弃时又学会了珍惜，毕竟一切都来之不易。\r\n" + 
			"80.以岁月的名义，照亮你体内小小的倔强和忧郁。\r\n" + 
			"81.我将一切回忆掩埋，只想拥有一个美好的未来。\r\n" + 
			"82.人生的无奈不在于没有选择的余地，而恰恰是因为需要作出太多的抉择。\r\n" + 
			"83.天才是百分之一的灵感加上百分之九十九的努力。\r\n" + 
			"84.目标的坚定是性格中最必要的力量源泉之一，也是成功的利器之一。没有它，天才也会在矛盾无定的迷径中徒劳无功。\r\n" + 
			"85.在真实的生命里，每桩伟业都由信心开始，并由信心跨出第一步。\r\n" + 
			"86.觉得自己做的到和不做的到，其实只在一念之间。\r\n" + 
			"87.不好问别人为你做了什么，而要问你为别人做了什么。\r\n" + 
			"88.一个人除非自己有信心，否则无法带给别人信心。\r\n" + 
			"89.为别人鼓掌的人也是在给自己的生命加油。\r\n" + 
			"90.失败是什么？没有什么，只是更走近成功一步；成功是什么？就是走过了所有通向失败的路，只剩下一条路，那就是成功的路。\r\n" + 
			"91.开始一种恐慌，停留与不可复制的回忆。\r\n" + 
			"92.经验是由痛苦中粹取出来的。\r\n" + 
			"93.自己要先看得起自己，?e人才会看得起你。\r\n" + 
			"94.人生需要耐心和等待。在等待中煎熬，在等待中获取所求，在等待中成就，在的等待中喜悦！\r\n" + 
			"95.人生试题一共有四道题目：学业、事业、婚姻、家庭。平均分高才能及格，切莫花太多的时间和精力在任一题目上。\r\n" + 
			"96.用时间和心看人，而不是用眼睛。\r\n" + 
			"97.生命的道路上永远没有捷径可言，只有脚踏实地走下去。\r\n" + 
			"98.只要还有明天，今天就永远是起跑线。\r\n" + 
			"99.人人都会错过，人人都曾经错过，真正属于你的，永远不会错过。\r\n" + 
			"100.我努力赚钱的目的，就是想让我爸妈在给自己买东西的时候能像给我买东西的时候一样干脆。";
	String regex = head+".(.*?)。";
	String param ="";
	Pattern pattern = Pattern.compile(regex);
	Matcher m = pattern.matcher(json);
	while (m.find()) {  
        int i = 1;  
        param+=m.group(i)+"\n";
        i++;  
    } 
	return param;
}

}
