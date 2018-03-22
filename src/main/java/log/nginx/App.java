package log.nginx;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONReader;

import javax.jws.soap.SOAPBinding.Use;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        try {
            String filePath = "D:\\qdlog\\test.json";
//            filePath = "D:\\qdlog\\240history.json";
            List list = new ArrayList();
            JSONReader reader = new JSONReader(new FileReader(filePath));
            reader.startObject();
            while (reader.hasNext()) {
                String key = reader.readString();
                System.out.println(key);
                Course course = reader.readObject(Course.class);
                list.add(course);
            }
            reader.endObject();
            reader.close();
            Course course = (Course) list.get(0);
            List<Book> books = JSON.parseArray(course.getBooks().toJSONString(), Book.class);
            for (Book b : books){
                System.out.println(b.getName() + "---" + b.getPrice());
            }
            System.out.println(list.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
