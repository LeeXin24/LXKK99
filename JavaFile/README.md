```
/**
 * 将 User对象写入到user.txt
 *      name   age   address   id
 *
 *      user.txt
 *      张三,25,xxxxx,12
 *      lisi,26,xxxx,13
 *      ....
 *
 * 然后读取  重新塞回user对象中
 *
 *  1.字节流写
 *  2.字符流
 *  3.缓冲流
 *
 */
 
 
/**
* @param sourceFile   目标文件
* @param size         拆分文件大小 byte为单位
* @param targetFolder 生成的拆分文件路径，如果传入的路径不存在，则创建这个路径
*                     拆分文件的命名规则，原始文件名.编号。
*                     例如 WIN.mp3 拆分后，变为 WIN.mp3.1  WIN.mp3.2 ....
*/
void split(File sourceFile, int size, File targetFolder);

/**
* 将制定文件夹下的拆分文件合并为一个文件，将文件保存到指定的路径下
*
* @param sourceFolder 拆分文件所处的路径，其下的文件命名规则，同split拆分出来的文件名一致
* @param targetFolder 合并之后的文件保存的路径，如果路径不存在，则创建这个目录
*/
void combine(File sourceFolder, File targetFolder);
```