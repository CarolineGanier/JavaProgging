package envicall;

import java.util.HashMap;
import java.util.Map;

public class EnviData {
    
    private Map<String, String> env;
    private Map<String, String> subset;
    
    public EnviData()
        {
         env = System.getenv();
        }

    public Map<String, String> getAll()
        {
         return env;
        }
    
    public String getOne(String _key)
        {
         return env.get(_key);
        }
    
    public Map<String, String> getSome(String _keyBit)
        {
         String curVal;
         subset = new HashMap();
         for (String envKey : env.keySet())
            {
             curVal = env.get(envKey);
             if (envKey.contains(_keyBit))
                 subset.put(envKey, curVal);
            }
         return subset;
        }    
}

