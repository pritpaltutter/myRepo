package regex;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RegexClass {
    public static void main(String[] args) {

        Map<String,String> testStringMap = new LinkedHashMap<String, String>() ;

        testStringMap.put("testString1","BC720575940566338,BC720575940666638,BC720575940566338,BC720575940666638"); // pass
        testStringMap.put("testString2","BC720575940566338"); //pass
        testStringMap.put("testString3","BC720575940566338,BC720575940666638");//pass
        testStringMap.put("testString4","BA-KCSN2324F5SJS,BA-KCSN2KKKKSJS,BA-KCSN23GGG5SJS,BA-KABC2324F5SJS"); // pass
        testStringMap.put("testString5","BA-KCSN2324F5SJS"); // pass
        testStringMap.put("testString6","BC720575940566338BC720575940566338"); //pass
        testStringMap.put("testString7","BAKCSN2324F5SJS"); // fail
        testStringMap.put("testString8","BA-KCSN2324F5SJS"); // fail
        testStringMap.put("testString9","BC720575940566338,BC720575940666638,BC720575940566338,");//fail
        testStringMap.put("testString10","BC720575940566338,BC720575940666638,BC");//fail
        testStringMap.put("testString11","BC720575940566338 BC720575940566338");//fail
        testStringMap.put("testString12","BC720575940566338,23432223"); //fail
        testStringMap.put("testString13","BC,BC720575940566338"); //fail
        testStringMap.put("testString14","BC"); //fail
        testStringMap.put("testString15",""); //fail
        testStringMap.put("testString16","720575940566338"); // fail
        testStringMap.put("testString17","BA-KCSN2324F5SJS,BA-KCSN2324F5SJS,"); // fail
        testStringMap.put("testString18",","); // fail


        String regex = "^[a-zA-Z]{2}-?\\w+(,[a-zA-Z]{2}-?[\\w]+)*\\w$";
        for (Map.Entry<String,String> entry: testStringMap.entrySet())
              {
                  String result = entry.getValue().matches(regex)? "PASS":"FAIL";
                  System.out.println(entry.getValue()+" : "+ result );
        }
    }
}
