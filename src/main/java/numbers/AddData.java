package main.java.numbers;



import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by rasn on 8/30/16.
 */
public class AddData {
    public BigDecimal sum(final Object v) {
        /*
        if null return null
        if v is instance of Number , then return it's BD value
        if V is a collection, then for each element in collection , call sum(), add all the values
        if V is a Map, then for each key and each value recursively call sum()
        if V is a POJO , for each field, call recursively sum() and add value return
         */

        if( v == null) return null;
        BigDecimal sum = new BigDecimal(0);
        if(v instanceof Number) return new BigDecimal(((Number) v).doubleValue());
        if(v instanceof String) {
          try {
              return new BigDecimal(Double.parseDouble((String)v));
          }catch(NumberFormatException e){
              return new BigDecimal(0);
          }
        }
        if(v instanceof Collection){
            for(Object item: (Collection) v){
                sum = sum.add(sum(item));
            }
            return sum;
        }
        if(v instanceof Map){
            for(Object item: ((Map) v).keySet()){
                sum = sum.add(sum(item));
            }
            for(Object item: ((Map) v).values()){
                sum = sum.add(sum(item));
            }
            return sum;
        }

        Field[] fields = v.getClass().getDeclaredFields();
        System.out.println("fields.length = " + fields.length);
        List<Field> list = Arrays.asList(fields);
        
        for(Object item: fields){
            System.out.println("item = " + item);
           sum = sum.add(sum(item));
        }

        return sum;
    }

    public static void main(String[] args) {
        String a = "ymbgaraibkfmvocpizdydugvalagaivdbfsfbepeyccqfepzvtpyxtbadkhmwmoswrcxnargtlswqemafandgkmydtimuzvjwxvlfwlhvkrgcsithaqlcvrihrwqkpjdhgfgreqoxzfvhjzojhghfwbvpfzectwwhexthbsndovxejsntmjihchaotbgcysfdaojkjldprwyrnischrgmtvjcorypvopfmegizfkvudubnejzfqffvgdoxohuinkyygbdzmshvyqyhsozwvlhevfepdvafgkqpkmcsikfyxczcovrmwqxxbnhfzcjjcpgzjjfateajnnvlbwhyppdleahgaypxidkpwmfqwqyofwdqgxhjaxvyrzupfwesmxbjszolgwqvfiozofncbohduqgiswuiyddmwlwubetyaummenkdfptjczxemryuotrrymrfdxtrebpbjtpnuhsbnovhectpjhfhahbqrfbyxggobsweefcwxpqsspyssrmdhuelkkvyjxswjwofngpwfxvknkjviiavorwyfzlnktmfwxkvwkrwdcxjfzikdyswsuxegmhtnxjraqrdchaauazfhtklxsksbhwgjphgbasfnlwqwukprgvihntsyymdrfovaszjywuqygpvjtvlsvvqbvzsmgweiayhlubnbsitvfxawhfmfiatxvqrcwjshvovxknnxnyyfexqycrlyksderlqarqhkxyaqwlwoqcribumrqjtelhwdvaiysgjlvksrfvjlcaiwrirtkkxbwgicyhvakxgdjwnwmubkiazdjkfmotglclqndqjxethoutvjchjbkoasnnfbgrnycucfpeovruguzumgmgddqwjgdvaujhyqsqtoexmnfuluaqbxoofvotvfoiexbnprrxptchmlctzgqtkivsilwgwgvpidpvasurraqfkcmxhdapjrlrnkbklwkrvoaziznlpor";
        String b = "qhxepbshlrhoecdaodgpousbzfcqjxulatciapuftffahhlmxbufgjuxstfjvljybfxnenlacmjqoymvamphpxnolwijwcecgwbcjhgdybfffwoygikvoecdggplfohemfypxfsvdrseyhmvkoovxhdvoavsqqbrsqrkqhbtmgwaurgisloqjixfwfvwtszcxwktkwesaxsmhsvlitegrlzkvfqoiiwxbzskzoewbkxtphapavbyvhzvgrrfriddnsrftfowhdanvhjvurhljmpxvpddxmzfgwwpkjrfgqptrmumoemhfpojnxzwlrxkcafvbhlwrapubhveattfifsmiounhqusvhywnxhwrgamgnesxmzliyzisqrwvkiyderyotxhwspqrrkeczjysfujvovsfcfouykcqyjoobfdgnlswfzjmyucaxuaslzwfnetekymrwbvponiaojdqnbmboldvvitamntwnyaeppjaohwkrisrlrgwcjqqgxeqerjrbapfzurcwxhcwzugcgnirkkrxdthtbmdqgvqxilllrsbwjhwqszrjtzyetwubdrlyakzxcveufvhqugyawvkivwonvmrgnchkzdysngqdibhkyboyftxcvvjoggecjsajbuqkjjxfvynrjsnvtfvgpgveycxidhhfauvjovmnbqgoxsafknluyimkczykwdgvqwlvvgdmufxdypwnajkncoynqticfetcdafvtqszuwfmrdggifokwmkgzuxnhncmnsstffqpqbplypapctctfhqpihavligbrutxmmygiyaklqtakdidvnvrjfteazeqmbgklrgrorudayokxptswwkcircwuhcavhdparjfkjypkyxhbgwxbkvpvrtzjaetahmxevmkhdfyidhrdeejapfbafwmdqjqszwnwzgclitdhlnkaiyldwkwwzvhyorgbysyjbxsspnjdewjxbhpsvj";
        findTheDifference(a,b);
        //char[] aa = new char[];
        //aa.length = 12873;
        int[] nums = null;

        AddData addData = new AddData();
        List<Object> L = new ArrayList<>();
        L.add(new Integer (5));
        L.add(new Double (4.5));
        L.add(new BigInteger("43"));
        L.add("Pizza");
        L.add("3");
        //L.add(new BankAccount("Rashmi", new BigDecimal("1000000")));
        L.add(new LinkedList<Object>(Arrays.asList(4, "String", "234")));
        System.out.println(addData.sum(null));
        System.out.println(addData.sum(new Integer(5)));
        System.out.println(addData.sum(new Float(0.1)));
        System.out.println(addData.sum("Hello Rashmi!"));
        System.out.println(addData.sum("4.5"));
        System.out.println(addData.sum(L));
        System.out.println(addData.sum(null));
        System.out.println(addData.sum(null));
    }

    public static class BankAccount{
        String name; //Rashmi's checking account
        BigDecimal balance; //65.87
        public BankAccount(String name, BigDecimal balance){
            this.name = name;
            this.balance = balance;
        }
    }

    public static char findTheDifference(String s, String t) {
        if(s == null || t == null) return '\0';
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        s = new String(sArray);
        t= new String(tArray);
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == t.charAt(i)) continue;
            else return t.charAt(i);
        }
        return t.charAt(t.length() - 1);
    }
}