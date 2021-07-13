import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class XmlDemo2 {

    /**
     * 使用dom4j插件 去解析 xml文件
     * @param args
     *
     * //    第一步：创建一个SAXReader解析器
     * //
     * //    `SAXReader reader = new SAXReader();`
     * //
     * //    第二步：解析xml文件，重新构建成一个Document对象
     * //
     * //    `Document doc = reader.read(file);`
     * //
     * //    第三步：处理Document对象信息，在控制台打印
     *
     *
     */
    public static void main(String[] args) {
        File file = new File("JavaFile/Student.xml");
        SAXReader reader = new SAXReader();
        try {
            Document doc = reader.read(file);
            Element rootElement = doc.getRootElement();
           // System.out.println(rootElement.getName());
           /* List elements = rootElement.elements();
            for (Object element : elements) {
                Node node=(Node)element;
                System.out.println(node.getName()+"节点的文本内容:"+node.getText());
            }*/
            List note = rootElement.elements("note");
            for (Object o : note) {
                Element  node=(Element) o;
                Element from = node.element("from");
                System.out.println(from.getName()+",值:"+from.getText());
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }


    }

}
