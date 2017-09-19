import com.lxr.practice.fengzhuang.Person;

/**
 * Created by liuxr on 2017/7/18.
 */
public class TestPerson {
        public static void main(String args[]) {
            Person per1 = new Person() ;	// 声明并实例化对象
            Person per2 = new Person() ;
            per1.name = "张三" ;
            per1.age = 20 ;
            per2.name = "李四" ;
            per2.age = 30 ;
            per2 = per1 ;
            per2.name = "王麻子" ;
            per1.tell() ;
        }
    }

