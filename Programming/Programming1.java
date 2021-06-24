import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programming1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		String str = sc.next().trim();
		str = str +  " ";//为保证最后一个单词也能够被检测到
		char[] s = str.toCharArray();

		List<Word> word = new ArrayList<Word>();//创建List集合
		word.add(new Word("", 0, 0));//插入List集合里的第一个元素
		int count = 1;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == 32) {
				word.add(new Word("", 0, 0));
				word.get(count).start = i + 1;
				word.get(count - 1).length = i - word.get(count - 1).start;
				count++;
			}//以空格为界表示出单词的起点和长度
		}
		for (int i = 0; i < count - 1; i++) {
			word.get(i).word = str.substring(word.get(i).start, word.get(i).start + word.get(i).length);
			System.out.println(word.get(i).word + ": " + word.get(i).start + ", " + word.get(i).length);
		}
	}
}

class Word {
	String word;
	int start;
	int length;

	public Word(String word, int start, int length) {
		this.word = word;
		this.start = start;
		this.length = length;
	}
}
