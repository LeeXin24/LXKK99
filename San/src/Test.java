import com.alibaba.fastjson.JSONObject;
import entity.User;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author jitwxs
 * @date 2021年07月01日 14:35
 */
public class Test {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = format.format(date);
        User user1 = new User("1","张三", "123", time);
        User user2 = new User("2","李四", "456", time);
        User user3 = new User("3","王五", "789", time);
        File file = new File("San/user.json");
        List<User> users = Arrays.asList(user1, user2, user3);

        /*Post post1 = new Post("1","中国共产党建党100周年", "2021年7月1日，今天是中国共产党建党一百周年，习近平总书记发表重要讲话，习近平指出。。。习近平强调。。。。。习近平提出。。。。", time,"2");
        Post post2 = new Post("2","五个一百”，让中国正能量温暖社会", "近日，由中央网信办主办的中国正能量2021“五个一百”网络精品征集评选展播活动启动。此次活动以“奋斗的人民 奋进的中国”为主题，聚焦庆祝中国共产党成立100周年、脱贫攻坚、抗疫成果、全面建成小康社会等，征集评选展播百名网络正能量榜样、百篇网络正能量文字、百幅网络正能量图片、百部网络正能量动漫音视频作品和百项网络正能量专题活动", time,"1");
        Post post3 = new Post("3","12强赛抽签，足协和李铁没有寄希望国足与谁同组的想法", "今天下午3点，亚足联进行12强赛分组抽签，中国足协、中国队教练组将密切关注分组结果。虽然外界也在帮助中国队分析抽到哪些队伍是“上签”，但中国足协、李铁没有寄希望于和谁同组的想法。", time,"3");
        List<Post> posts = Arrays.asList(post1, post2, post3);
        File file = new File("examination/post.json");*/

       /* Type type1 = new Type("1", "时政栏目");
        Type type2 = new Type("2", "社会栏目");
        Type type3 = new Type("3", "体育栏目");
        List<Type> types = Arrays.asList(type1, type2, type3);
        File file = new File("examination/type.json");*/
        String s = JSONObject.toJSONString(users);
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(s);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
