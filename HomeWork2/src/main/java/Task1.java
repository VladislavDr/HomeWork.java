//Задание
//        1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
//        используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
//        Если значение null, то параметр не должен попадать в запрос.
//        Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class Task1 {
    public static void main(String[] args) throws IOException, ParseException {
        String sql = "select * from students where ";
        JSONObject obj = (JSONObject) new JSONParser().parse(new FileReader("C://Users//79509//Desktop//Api. Java//HomeWork//HomeWork2//" +
                "src//main//java//SQL.json"));

        List<String> lst = new ArrayList<>();

        Map<String, String> params = new LinkedHashMap<>();
        params.put("name", (String) obj.get("name"));
        params.put("country", (String) obj.get("country"));
        params.put("city", (String) obj.get("city"));
        params.put("age", (String) obj.get("age"));

        StringBuilder res = new StringBuilder(sql);

        params.forEach((key, value) -> {
            if (value != null){
                lst.add(String.format("%s = \"%s\"", key, value));
            }
        });

        res.append(String.join(" and ", lst));
        res.append(";");
        System.out.println(res);
    }
}