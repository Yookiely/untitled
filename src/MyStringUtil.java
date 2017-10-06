import java.util.ArrayList;
import java.util.List;

public class MyStringUtil {


    public String getUpperCaseStr(String str) {
        str=str.toUpperCase();
        System.out.println("string value = " + str);
        return str;
    }

    public String getUpperCaseStr(int num, String str) {
        String str1;
        String str2;
        str1 = str.substring(0, num);
        str2 = str.substring(num,str.length());
        str=str1.toUpperCase()+str2;
        System.out.println("string value =" + str);
        return str;
    }

    public String getUpperCaseStr(int begin, int end, String str) {
        String str1;
        String str2;
        String str3;
        str1 = str.substring(0,begin - 1);
        str2 = str.substring(begin - 1 , end);
        str3 = str.substring(end,str.length());
        str=str1+str2.toUpperCase()+str3;
        System.out.println("string value =" +str);
        return str;
    }

    public List getUpperCaseStr(List strs) {
        for (int i = 0; i < strs.size(); i++) {
            String x = (String) strs.get(i);
            x=x.toUpperCase();
            System.out.println(x);
            strs.set(i, x);
        }

        return strs;
    }

    public List getUpperCaseStr(String... strs) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < strs.length; i++) {
            list.add(strs[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            String x =  list.get(i);
            x = x.toUpperCase();
            System.out.println(x);
            list.set(i,x);
        }

        return list;
    }
    public List getUpperCaseStr(int index, String... strs){
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < strs.length; i++) {
            list.add(strs[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            String x = (String) list.get(i);
            if (i != index - 1) {
                x=x.toUpperCase();
                System.out.println(x);
            }else{

                System.out.println(list.get(i));
            }
            list.set(i,x);
        }
        return list;
    }
}
