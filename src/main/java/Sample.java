import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample {

    private String testValue = "SONAR";

    public void Test1() {
        String testValue1 = "";
        String testValue2 = "TEST";
        boolean booleanValue = true;


        if (booleanValue == true) {

        }

        if (testValue.equals(testValue2.toString()) ==  false) {

        }


    }


    public void Test2() {

        Map<String, Object> sampleMap = new HashMap<String, Object>();
        if(sampleMap == null) {

        }


        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        try {

        } catch (Exception e) {

        }

        long[] testArr = {0,1,2,3,4,5,6,7,8,9};
        for(long val : testArr) {
            if(val % 2 == 0) {
                continue;
            }
        }

    }

    public List<String> SampleMethod1() {

        return null;
    }
}
