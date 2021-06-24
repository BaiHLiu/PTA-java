import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class Student implements Comparable<Student> {
	int no;
	String name;

	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public String getName() {
		return "no=" + this.no + "&name=" + this.name;
	}
	//HashSet 是先判断hashCode,再判断equals,我们可以重写hashCode和equals方法，让它直接通过equals判断学号（no）
	public int hashCode() {
		return 1;
	}

	public boolean equals(Object obj) {
		if(obj instanceof Student){
            Student stu = (Student)obj;
            return this.no == stu.no;
        }
        return false;
	}

	public int compareTo(Student s1) {
		if (s1.name.compareTo(this.name) > 0)
			return -1;
		else if (s1.name.compareTo(this.name) < 0)
			return 1;
		else
			return 0;
	}
}
public class FillBlanks2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student[] stus = new Student[3];

        for(int i=0;i<3;i++){
            int no = scan.nextInt();
            String name = scan.next();
            Student s = new Student(no,name);
            stus[i] =s;
        }
        //将stus中的3个学生对象，放入到HashSet中
        HashSet<Student> stuSet = new HashSet<Student>();
        for(Student s: stus){
            stuSet.add(s);
        }
        //要放入的第4个Student
        Student fourth = new Student(scan.nextInt(),scan.next());
        stuSet.add(fourth);//如果fourth的学号（no）与stuSet中的已有学生的no重复则无法放入
        System.out.println(stuSet.size());

        Arrays.sort(stus);//对stus中的3个原有对象，按照姓名首字符有小到大排序
        for(int i=0;i<stus.length;i++){
            System.out.println(stus[i].getName());//输出的格式为：no=XX&name=YY
        }

        scan.close();
    }
}