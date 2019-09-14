import org.apache.log4j.Logger;
import top.wetech.tools.file.FileDivisionETL;
import top.wetech.tools.string.StringUtils;

import java.util.ArrayList;

/**
 * company:
 * user: chenzuoli
 * date: 2018/6/15
 * time: 11:55
 * description: 测试FileDivision工具类
 */

public class TestFileDivision {
    private static Logger logger = Logger.getLogger(TestFileDivision.class);

    public static void main(String[] args) {
        StringUtils.init(args, 1, "please enter one data file path!");
        ArrayList<String[]> etled = FileDivisionETL.etl(args[0], ",", new String[]{"int", "name", "phone", "idCard", "default", "phone", "default", "dateTime", "dateTime"});
        etled.forEach(line -> {
            for (String column : line) {
                System.out.println(column);
            }
            System.out.println("============");
        });
    }

}
