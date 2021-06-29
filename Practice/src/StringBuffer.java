public class StringBuffer {

    private  char[] ch;  //

    public  StringBuffer (){
        ch=new char[0];
    }

    /**
     *  对数组扩容
     */
    private  void changeChArrayLength(){
        char [] chs=new char[ch.length+1];
        for (int i = 0; i < ch.length; i++) {
            chs[i]=ch[i];
        }
        ch=chs;
    }

    /**
     接收字符串
     */
    public  void append(String str){
        for (int i = 0; i < str.length(); i++) {
            changeChArrayLength();
            char c = str.charAt(i);
            ch[ch.length-1]=c;
        }
    }

    /**
     接收字符
     */
    public void append(char str){
        changeChArrayLength();
        ch[ch.length-1]=str;
    }

    /**
     将之前接收到的字符拼接到一起返回
     */
    public String toString(){

        return  new  String(ch);
    }

    /**
     清除之前的而输入内容
     */
    public void clear(){
        this.ch=new char[0];
    }

    /**
     将之前的输入内容反转
     */
    public String reverse(){
        for (int i = 0; i <ch.length/2; i++) {
            char  temp=ch[i];
            ch[i]=ch[ch.length-1-i];
            ch[ch.length-1-i]=temp;
        }
        return  toString();
    }

    /**
     将指定位置的字符串反转
     from 从0起始
     to 不包含在内
     即[from,to)
     例如 abcdefg => reverse(1,3) => acbdefg
     */
    public String reverse(int from, int to){

        for (int i = 0; i < (to-1) / 2; i++) {
            char  temp=ch[i+from];
            ch[i+from]=ch[to-1-i];
            ch[to-1-i]=temp;
        }
        return  toString();

    }
}