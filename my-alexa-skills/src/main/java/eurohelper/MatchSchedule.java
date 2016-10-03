/**
    Copyright 2014-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
    Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with the License. A copy of the License is located at
        http://aws.amazon.com/apache2.0/
    or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */
package eurohelper;

import java.util.HashMap;
import java.util.Map;

public final class MatchSchedule {

    private static final Map<String, String> schedule = new HashMap<String, String>();

    private MatchSchedule() {
    }

    static {
    	schedule.put("Germany",
                "vs France on 6/9/2016, vs Italy on 6/15/2016");
    	schedule.put("England",
                "vs Poland on 6/9/2016, vs Spain on 6/15/2016");
    	schedule.put("France",
                "vs Colombia on 6/9/2016, vs Peru on 6/15/2016");
    	
    }
    
    public static String get(String item) {    	
    	
        return schedule.get(item);
    }
    
}