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
        testStringMap.put("testString6","BC720575940566338,BC720575940666638,BC720575940566338,");//fail
        testStringMap.put("testString7","BC720575940566338,BC720575940666638,BC");//fail
        testStringMap.put("testString8","BC720575940566338 BC720575940566338");//fail
        testStringMap.put("testString9","BC720575940566338BC720575940566338"); //pass
        testStringMap.put("testString10","BC720575940566338,23432223"); //fail
        testStringMap.put("testString11","BC,BC720575940566338"); //fail
        testStringMap.put("testString12","BC"); //fail
        testStringMap.put("testString13",""); //fail
        testStringMap.put("testString14","720575940566338"); // fail
        testStringMap.put("testString15","BA-KCSN2324F5SJS,BA-KCSN2324F5SJS,"); // fail
        testStringMap.put("testString16",","); // fail
        testStringMap.put("testString17","BAKCSN2324F5SJS"); // fail
        testStringMap.put("testString18","BA-KCSN2324F5SJS"); // fail

        String regex = "^[a-zA-Z]{2}-?\\w+(,[a-zA-Z]{2}-?[\\w]+)*\\w$";
        for (Map.Entry<String,String> entry: testStringMap.entrySet())
              {
                  System.out.println(entry.getKey()+" : "+ entry.getValue().matches(regex));
        }
    }
}
